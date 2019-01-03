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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomerAgentInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerAgentInfoMarshaller {

    private static final MarshallingInfo<Integer> ACTIVEAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeAgents").build();
    private static final MarshallingInfo<Integer> HEALTHYAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyAgents").build();
    private static final MarshallingInfo<Integer> BLACKLISTEDAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blackListedAgents").build();
    private static final MarshallingInfo<Integer> SHUTDOWNAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shutdownAgents").build();
    private static final MarshallingInfo<Integer> UNHEALTHYAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyAgents").build();
    private static final MarshallingInfo<Integer> TOTALAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalAgents").build();
    private static final MarshallingInfo<Integer> UNKNOWNAGENTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unknownAgents").build();

    private static final CustomerAgentInfoMarshaller instance = new CustomerAgentInfoMarshaller();

    public static CustomerAgentInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerAgentInfo customerAgentInfo, ProtocolMarshaller protocolMarshaller) {

        if (customerAgentInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerAgentInfo.getActiveAgents(), ACTIVEAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getHealthyAgents(), HEALTHYAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getBlackListedAgents(), BLACKLISTEDAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getShutdownAgents(), SHUTDOWNAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getUnhealthyAgents(), UNHEALTHYAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getTotalAgents(), TOTALAGENTS_BINDING);
            protocolMarshaller.marshall(customerAgentInfo.getUnknownAgents(), UNKNOWNAGENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
