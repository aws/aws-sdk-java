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
 * CustomerConnectorInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerConnectorInfoMarshaller {

    private static final MarshallingInfo<Integer> ACTIVECONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeConnectors").build();
    private static final MarshallingInfo<Integer> HEALTHYCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyConnectors").build();
    private static final MarshallingInfo<Integer> BLACKLISTEDCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blackListedConnectors").build();
    private static final MarshallingInfo<Integer> SHUTDOWNCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shutdownConnectors").build();
    private static final MarshallingInfo<Integer> UNHEALTHYCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyConnectors").build();
    private static final MarshallingInfo<Integer> TOTALCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalConnectors").build();
    private static final MarshallingInfo<Integer> UNKNOWNCONNECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unknownConnectors").build();

    private static final CustomerConnectorInfoMarshaller instance = new CustomerConnectorInfoMarshaller();

    public static CustomerConnectorInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerConnectorInfo customerConnectorInfo, ProtocolMarshaller protocolMarshaller) {

        if (customerConnectorInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerConnectorInfo.getActiveConnectors(), ACTIVECONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getHealthyConnectors(), HEALTHYCONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getBlackListedConnectors(), BLACKLISTEDCONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getShutdownConnectors(), SHUTDOWNCONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getUnhealthyConnectors(), UNHEALTHYCONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getTotalConnectors(), TOTALCONNECTORS_BINDING);
            protocolMarshaller.marshall(customerConnectorInfo.getUnknownConnectors(), UNKNOWNCONNECTORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
