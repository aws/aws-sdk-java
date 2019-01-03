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
 * ADMMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ADMMessageMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Body").build();
    private static final MarshallingInfo<String> CONSOLIDATIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsolidationKey").build();
    private static final MarshallingInfo<Map> DATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Data").build();
    private static final MarshallingInfo<String> EXPIRESAFTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpiresAfter").build();
    private static final MarshallingInfo<String> ICONREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IconReference").build();
    private static final MarshallingInfo<String> IMAGEICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageIconUrl").build();
    private static final MarshallingInfo<String> IMAGEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageUrl").build();
    private static final MarshallingInfo<String> MD5_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MD5").build();
    private static final MarshallingInfo<String> RAWCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RawContent").build();
    private static final MarshallingInfo<Boolean> SILENTPUSH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SilentPush").build();
    private static final MarshallingInfo<String> SMALLIMAGEICONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallImageIconUrl").build();
    private static final MarshallingInfo<String> SOUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sound").build();
    private static final MarshallingInfo<Map> SUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Substitutions").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();

    private static final ADMMessageMarshaller instance = new ADMMessageMarshaller();

    public static ADMMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ADMMessage aDMMessage, ProtocolMarshaller protocolMarshaller) {

        if (aDMMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aDMMessage.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(aDMMessage.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(aDMMessage.getConsolidationKey(), CONSOLIDATIONKEY_BINDING);
            protocolMarshaller.marshall(aDMMessage.getData(), DATA_BINDING);
            protocolMarshaller.marshall(aDMMessage.getExpiresAfter(), EXPIRESAFTER_BINDING);
            protocolMarshaller.marshall(aDMMessage.getIconReference(), ICONREFERENCE_BINDING);
            protocolMarshaller.marshall(aDMMessage.getImageIconUrl(), IMAGEICONURL_BINDING);
            protocolMarshaller.marshall(aDMMessage.getImageUrl(), IMAGEURL_BINDING);
            protocolMarshaller.marshall(aDMMessage.getMD5(), MD5_BINDING);
            protocolMarshaller.marshall(aDMMessage.getRawContent(), RAWCONTENT_BINDING);
            protocolMarshaller.marshall(aDMMessage.getSilentPush(), SILENTPUSH_BINDING);
            protocolMarshaller.marshall(aDMMessage.getSmallImageIconUrl(), SMALLIMAGEICONURL_BINDING);
            protocolMarshaller.marshall(aDMMessage.getSound(), SOUND_BINDING);
            protocolMarshaller.marshall(aDMMessage.getSubstitutions(), SUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(aDMMessage.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(aDMMessage.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
