
package com.sonos.soap;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingType;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(portName = "SonosSoap", serviceName = "Sonos", targetNamespace = "http://www.sonos.com/Services/1.1", wsdlLocation = "http://musicpartners.sonos.com/sites/default/files/Sonos.wsdl", endpointInterface = "com.sonos.soap.SonosSoap")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class Sonos_SonosSoapImpl
    implements SonosSoap
{


    public Sonos_SonosSoapImpl() {
    }

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     * @throws CustomFault
     */
    public String getSessionId(String username, String password)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param count
     * @param index
     * @param id
     * @param recursive
     * @return
     *     returns com.sonos.soap.MediaList
     * @throws CustomFault
     */
    public MediaList getMetadata(String id, int index, int count, Boolean recursive)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param id
     * @return
     *     returns com.sonos.soap.ExtendedMetadata
     * @throws CustomFault
     */
    public ExtendedMetadata getExtendedMetadata(String id)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param id
     * @param type
     * @return
     *     returns java.lang.String
     * @throws CustomFault
     */
    public String getExtendedMetadataText(String id, String type)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param rating
     * @param id
     * @return
     *     returns com.sonos.soap.ItemRating
     * @throws CustomFault
     */
    public ItemRating rateItem(String id, int rating)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param count
     * @param index
     * @param term
     * @param id
     * @return
     *     returns com.sonos.soap.MediaList
     * @throws CustomFault
     */
    public MediaList search(String id, String term, int index, int count)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param id
     * @return
     *     returns com.sonos.soap.MediaMetadata
     * @throws CustomFault
     */
    public MediaMetadata getMediaMetadata(String id)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param deviceSessionToken
     * @param contentKey
     * @param uriTimeout
     * @param action
     * @param id
     * @param secondsSinceExplicit
     * @param getMediaURIResult
     * @param httpHeaders
     * @param deviceSessionKey
     * @throws CustomFault
     */
    public void getMediaURI(String id, MediaUriAction action, Integer secondsSinceExplicit, Holder<String> deviceSessionToken, Holder<String> getMediaURIResult, Holder<EncryptionContext> deviceSessionKey, Holder<EncryptionContext> contentKey, Holder<HttpHeaders> httpHeaders, Holder<Integer> uriTimeout)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     * @throws CustomFault
     */
    public String getScrollIndices(String id)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param favorite
     * @return
     *     returns java.lang.String
     * @throws CustomFault
     */
    public String createItem(String favorite)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param favorite
     * @throws CustomFault
     */
    public void deleteItem(String favorite)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @return
     *     returns com.sonos.soap.LastUpdate
     * @throws CustomFault
     */
    public LastUpdate getLastUpdate()
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param errorCode
     * @param id
     * @param message
     * @throws CustomFault
     */
    public void reportStatus(String id, int errorCode, String message)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @param seconds
     * @param contextId
     * @param id
     * @throws CustomFault
     */
    public void setPlayedSeconds(String id, int seconds, String contextId)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @param seconds
     * @param contextId
     * @param id
     * @return
     *     returns com.sonos.soap.ReportPlaySecondsResult
     * @throws CustomFault
     */
    public ReportPlaySecondsResult reportPlaySeconds(String id, int seconds, String contextId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param contextId
     * @param id
     * @param status
     * @throws CustomFault
     */
    public void reportPlayStatus(String id, String status, String contextId)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @param type
     * @throws CustomFault
     */
    public void reportAccountAction(String type)
        throws CustomFault
    {
        //replace with your impl here
        return;
    }

    /**
     * 
     * @param householdId
     * @param osVersion
     * @param callbackPath
     * @param sonosAppName
     * @param hardware
     * @return
     *     returns com.sonos.soap.AppLinkResult
     * @throws CustomFault
     */
    public AppLinkResult getAppLink(String householdId, String hardware, String osVersion, String sonosAppName, String callbackPath)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param householdId
     * @return
     *     returns com.sonos.soap.DeviceLinkCodeResult
     * @throws CustomFault
     */
    public DeviceLinkCodeResult getDeviceLinkCode(String householdId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param householdId
     * @param linkCode
     * @param linkDeviceId
     * @return
     *     returns com.sonos.soap.DeviceAuthTokenResult
     * @throws CustomFault
     */
    public DeviceAuthTokenResult getDeviceAuthToken(String householdId, String linkCode, String linkDeviceId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param duration
     * @param startTime
     * @param id
     * @return
     *     returns com.sonos.soap.SegmentMetadataList
     * @throws CustomFault
     */
    public SegmentMetadataList getStreamingMetadata(String id, XMLGregorianCalendar startTime, int duration)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param deviceSessionToken
     * @param id
     * @param uri
     * @return
     *     returns com.sonos.soap.ContentKey
     * @throws CustomFault
     */
    public ContentKey getContentKey(String id, String uri, String deviceSessionToken)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param containerType
     * @param seedId
     * @param title
     * @param parentId
     * @return
     *     returns com.sonos.soap.CreateContainerResult
     * @throws CustomFault
     */
    public CreateContainerResult createContainer(String containerType, String title, String parentId, String seedId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param updateId
     * @param index
     * @param id
     * @param parentId
     * @return
     *     returns com.sonos.soap.AddToContainerResult
     * @throws CustomFault
     */
    public AddToContainerResult addToContainer(String id, String parentId, int index, String updateId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param id
     * @param title
     * @return
     *     returns com.sonos.soap.RenameContainerResult
     * @throws CustomFault
     */
    public RenameContainerResult renameContainer(String id, String title)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param id
     * @return
     *     returns com.sonos.soap.DeleteContainerResult
     * @throws CustomFault
     */
    public DeleteContainerResult deleteContainer(String id)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param updateId
     * @param indices
     * @param id
     * @return
     *     returns com.sonos.soap.RemoveFromContainerResult
     * @throws CustomFault
     */
    public RemoveFromContainerResult removeFromContainer(String id, String indices, String updateId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

    /**
     * 
     * @param updateId
     * @param from
     * @param id
     * @param to
     * @return
     *     returns com.sonos.soap.ReorderContainerResult
     * @throws CustomFault
     */
    public ReorderContainerResult reorderContainer(String id, String from, int to, String updateId)
        throws CustomFault
    {
        //replace with your impl here
        return null;
    }

}
