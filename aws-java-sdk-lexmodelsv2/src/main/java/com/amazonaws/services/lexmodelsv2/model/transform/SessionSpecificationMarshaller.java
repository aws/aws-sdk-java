/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionSpecificationMarshaller {

    private static final MarshallingInfo<String> BOTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channel").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<java.util.Date> CONVERSATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CONVERSATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> CONVERSATIONDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationDurationSeconds").build();
    private static final MarshallingInfo<String> CONVERSATIONENDSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationEndState").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<Long> NUMBEROFTURNS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("numberOfTurns").build();
    private static final MarshallingInfo<List> INVOKEDINTENTSAMPLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("invokedIntentSamples").build();
    private static final MarshallingInfo<String> ORIGINATINGREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("originatingRequestId").build();

    private static final SessionSpecificationMarshaller instance = new SessionSpecificationMarshaller();

    public static SessionSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionSpecification sessionSpecification, ProtocolMarshaller protocolMarshaller) {

        if (sessionSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionSpecification.getBotAliasId(), BOTALIASID_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getConversationStartTime(), CONVERSATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getConversationEndTime(), CONVERSATIONENDTIME_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getConversationDurationSeconds(), CONVERSATIONDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getConversationEndState(), CONVERSATIONENDSTATE_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getNumberOfTurns(), NUMBEROFTURNS_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getInvokedIntentSamples(), INVOKEDINTENTSAMPLES_BINDING);
            protocolMarshaller.marshall(sessionSpecification.getOriginatingRequestId(), ORIGINATINGREQUESTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
