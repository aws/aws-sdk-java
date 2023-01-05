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
package com.amazonaws.services.applicationdiscovery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CustomerAgentlessCollectorInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerAgentlessCollectorInfoMarshaller {

    private static final MarshallingInfo<Integer> ACTIVEAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> HEALTHYAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> DENYLISTEDAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("denyListedAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> SHUTDOWNAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shutdownAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> UNHEALTHYAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> TOTALAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalAgentlessCollectors").build();
    private static final MarshallingInfo<Integer> UNKNOWNAGENTLESSCOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unknownAgentlessCollectors").build();

    private static final CustomerAgentlessCollectorInfoMarshaller instance = new CustomerAgentlessCollectorInfoMarshaller();

    public static CustomerAgentlessCollectorInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerAgentlessCollectorInfo customerAgentlessCollectorInfo, ProtocolMarshaller protocolMarshaller) {

        if (customerAgentlessCollectorInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getActiveAgentlessCollectors(), ACTIVEAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getHealthyAgentlessCollectors(), HEALTHYAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getDenyListedAgentlessCollectors(), DENYLISTEDAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getShutdownAgentlessCollectors(), SHUTDOWNAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getUnhealthyAgentlessCollectors(), UNHEALTHYAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getTotalAgentlessCollectors(), TOTALAGENTLESSCOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerAgentlessCollectorInfo.getUnknownAgentlessCollectors(), UNKNOWNAGENTLESSCOLLECTORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
