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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MessageMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Body").build();
    private static final MarshallingInfo<String> IMAGEICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageIconUrl").build();
    private static final MarshallingInfo<String> IMAGESMALLICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageSmallIconUrl").build();
    private static final MarshallingInfo<String> IMAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUrl").build();
    private static final MarshallingInfo<String> JSONBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JsonBody").build();
    private static final MarshallingInfo<String> MEDIAURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MediaUrl").build();
    private static final MarshallingInfo<String> RAWCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RawContent").build();
    private static final MarshallingInfo<Boolean> SILENTPUSH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SilentPush").build();
    private static final MarshallingInfo<Integer> TIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLive").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();

    private static final MessageMarshaller instance = new MessageMarshaller();

    public static MessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Message message, ProtocolMarshaller protocolMarshaller) {

        if (message == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(message.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(message.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(message.getImageIconUrl(), IMAGEICONURL_BINDING);
            protocolMarshaller.marshall(message.getImageSmallIconUrl(), IMAGESMALLICONURL_BINDING);
            protocolMarshaller.marshall(message.getImageUrl(), IMAGEURL_BINDING);
            protocolMarshaller.marshall(message.getJsonBody(), JSONBODY_BINDING);
            protocolMarshaller.marshall(message.getMediaUrl(), MEDIAURL_BINDING);
            protocolMarshaller.marshall(message.getRawContent(), RAWCONTENT_BINDING);
            protocolMarshaller.marshall(message.getSilentPush(), SILENTPUSH_BINDING);
            protocolMarshaller.marshall(message.getTimeToLive(), TIMETOLIVE_BINDING);
            protocolMarshaller.marshall(message.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(message.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
