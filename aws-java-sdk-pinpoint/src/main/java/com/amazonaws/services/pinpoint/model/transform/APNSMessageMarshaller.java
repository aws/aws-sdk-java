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
 * APNSMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class APNSMessageMarshaller {

    private static final MarshallingInfo<String> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Action").build();
    private static final MarshallingInfo<Integer> BADGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Badge").build();
    private static final MarshallingInfo<String> BODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Body").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Category").build();
    private static final MarshallingInfo<String> COLLAPSEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollapseId").build();
    private static final MarshallingInfo<Map> DATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Data").build();
    private static final MarshallingInfo<String> MEDIAURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MediaUrl").build();
    private static final MarshallingInfo<String> PREFERREDAUTHENTICATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredAuthenticationMethod").build();
    private static final MarshallingInfo<String> PRIORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Priority").build();
    private static final MarshallingInfo<String> RAWCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RawContent").build();
    private static final MarshallingInfo<Boolean> SILENTPUSH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SilentPush").build();
    private static final MarshallingInfo<String> SOUND_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sound").build();
    private static final MarshallingInfo<Map> SUBSTITUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Substitutions").build();
    private static final MarshallingInfo<String> THREADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ThreadId").build();
    private static final MarshallingInfo<Integer> TIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLive").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Url").build();

    private static final APNSMessageMarshaller instance = new APNSMessageMarshaller();

    public static APNSMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(APNSMessage aPNSMessage, ProtocolMarshaller protocolMarshaller) {

        if (aPNSMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(aPNSMessage.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getBadge(), BADGE_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getCollapseId(), COLLAPSEID_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getData(), DATA_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getMediaUrl(), MEDIAURL_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getPreferredAuthenticationMethod(), PREFERREDAUTHENTICATIONMETHOD_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getPriority(), PRIORITY_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getRawContent(), RAWCONTENT_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getSilentPush(), SILENTPUSH_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getSound(), SOUND_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getSubstitutions(), SUBSTITUTIONS_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getThreadId(), THREADID_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getTimeToLive(), TIMETOLIVE_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(aPNSMessage.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
