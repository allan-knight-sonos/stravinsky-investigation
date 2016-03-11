package com.sonos.smapi;

import com.sonos.services._1.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by allan.knight on 3/8/16.
 */
@Endpoint
public class SmapiEndpoint {
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

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSessionId")
    @ResponsePayload
    public GetSessionIdResponse getSessionId(@RequestPayload GetSessionId request) {
        return new GetSessionIdResponse(){{
            setGetSessionIdResult("12345-67-890");
        }};
    }
}
