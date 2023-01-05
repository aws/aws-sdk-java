/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AgentContactReferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AgentContactReferenceMarshaller {

    private static final MarshallingInfo<String> CONTACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ContactId").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Channel").build();
    private static final MarshallingInfo<String> INITIATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitiationMethod").build();
    private static final MarshallingInfo<String> AGENTCONTACTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AgentContactState").build();
    private static final MarshallingInfo<java.util.Date> STATESTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateStartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CONNECTEDTOAGENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectedToAgentTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> QUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Queue").build();

    private static final AgentContactReferenceMarshaller instance = new AgentContactReferenceMarshaller();

    public static AgentContactReferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AgentContactReference agentContactReference, ProtocolMarshaller protocolMarshaller) {

        if (agentContactReference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(agentContactReference.getContactId(), CONTACTID_BINDING);
            protocolMarshaller.marshall(agentContactReference.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(agentContactReference.getInitiationMethod(), INITIATIONMETHOD_BINDING);
            protocolMarshaller.marshall(agentContactReference.getAgentContactState(), AGENTCONTACTSTATE_BINDING);
            protocolMarshaller.marshall(agentContactReference.getStateStartTimestamp(), STATESTARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(agentContactReference.getConnectedToAgentTimestamp(), CONNECTEDTOAGENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(agentContactReference.getQueue(), QUEUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
