/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GCMMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GCMMessageMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Body").build();
    private static final MarshallingInfo<String> COLLAPSEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollapseKey").build();
    private static final MarshallingInfo<Map> DATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Data").build();
    private static final MarshallingInfo<String> ICONREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IconReference").build();
    private static final MarshallingInfo<String> IMAGEICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageIconUrl").build();
    private static final MarshallingInfo<String> IMAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUrl").build();
    private static final MarshallingInfo<String> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> RAWCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RawContent").build();
    private static final MarshallingInfo<String> RESTRICTEDPACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestrictedPackageName").build();
    private static final MarshallingInfo<Boolean> SILENTPUSH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SilentPush").build();
    private static final MarshallingInfo<String> SMALLIMAGEICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallImageIconUrl").build();
    private static final MarshallingInfo<String> SOUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sound").build();
    private static final MarshallingInfo<Map> SUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Substitutions").build();
    private static final MarshallingInfo<Integer> TIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLive").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();

    private static final GCMMessageMarshaller instance = new GCMMessageMarshaller();

    public static GCMMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GCMMessage gCMMessage, ProtocolMarshaller protocolMarshaller) {

        if (gCMMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(gCMMessage.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(gCMMessage.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(gCMMessage.getCollapseKey(), COLLAPSEKEY_BINDING);
            protocolMarshaller.marshall(gCMMessage.getData(), DATA_BINDING);
            protocolMarshaller.marshall(gCMMessage.getIconReference(), ICONREFERENCE_BINDING);
            protocolMarshaller.marshall(gCMMessage.getImageIconUrl(), IMAGEICONURL_BINDING);
            protocolMarshaller.marshall(gCMMessage.getImageUrl(), IMAGEURL_BINDING);
            protocolMarshaller.marshall(gCMMessage.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(gCMMessage.getRawContent(), RAWCONTENT_BINDING);
            protocolMarshaller.marshall(gCMMessage.getRestrictedPackageName(), RESTRICTEDPACKAGENAME_BINDING);
            protocolMarshaller.marshall(gCMMessage.getSilentPush(), SILENTPUSH_BINDING);
            protocolMarshaller.marshall(gCMMessage.getSmallImageIconUrl(), SMALLIMAGEICONURL_BINDING);
            protocolMarshaller.marshall(gCMMessage.getSound(), SOUND_BINDING);
            protocolMarshaller.marshall(gCMMessage.getSubstitutions(), SUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(gCMMessage.getTimeToLive(), TIMETOLIVE_BINDING);
            protocolMarshaller.marshall(gCMMessage.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(gCMMessage.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
