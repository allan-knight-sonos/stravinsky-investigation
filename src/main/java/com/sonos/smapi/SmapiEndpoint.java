package com.sonos.smapi;

import com.firebase.client.*;
import com.sonos.services._1.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * Created by allan.knight on 3/8/16.
 */
@Endpoint
public class SmapiEndpoint {
    public static class User {
        public String id;
        public String password;
        public String session;

        public User() {}

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }
    }

    public static class Session {
        public String owner;
    }

    private static final String NAMESPACE_URI = "http://www.sonos.com/Services/1.1";

    private static final Logger logger = LoggerFactory.getLogger(SmapiEndpoint.class);

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMetadata")
    @ResponsePayload
    public GetMetadataResponse getMetadata(@RequestPayload GetMetadata request) {
        logger.error("GetMetaData");

        MediaList media = new MediaList();
        media.setCount(1);
        media.setIndex(0);

        MediaCollection track = new MediaCollection();
        track.setId("track00");
        track.setItemType(ItemType.ALBUM);

        media.getMediaCollectionOrMediaMetadata().add(track);

        GetMetadataResponse response = new GetMetadataResponse();
        response.setGetMetadataResult(media);

        Firebase dataStore = new Firebase("https://sonos-ux-workshop.firebaseio.com/messages");
        dataStore.child("message").addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.err.println(snapshot.getValue());  //prints "Do you have data? You'll love Firebase."
            }

            @Override public void onCancelled(FirebaseError error) {
                error.toException().printStackTrace();
            }

        });

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSessionId")
    @ResponsePayload
    public GetSessionIdResponse getSessionId(@RequestPayload final GetSessionId request) {
        return new GetSessionIdResponse() {{
            final CountDownLatch latch = new CountDownLatch(1);
            final StringBuilder session = new StringBuilder();

            final Firebase dataStore = new Firebase("https://sonos-ux-workshop.firebaseio.com/smapi/users");
            dataStore.child(request.getUsername()).addListenerForSingleValueEvent(new ValueEventListener() {

                @Override
                public void onDataChange(DataSnapshot snapshot) {
                    User user = snapshot.getValue(User.class);
                    session.append(user.getSession());
                    latch.countDown();
                }

                @Override public void onCancelled(FirebaseError error) {
                    error.toException().printStackTrace();
                }
            });


            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setGetSessionIdResult(session.toString());
        }};
    }
}
