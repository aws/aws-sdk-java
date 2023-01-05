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
 * CustomerMeCollectorInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomerMeCollectorInfoMarshaller {

    private static final MarshallingInfo<Integer> ACTIVEMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeMeCollectors").build();
    private static final MarshallingInfo<Integer> HEALTHYMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("healthyMeCollectors").build();
    private static final MarshallingInfo<Integer> DENYLISTEDMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("denyListedMeCollectors").build();
    private static final MarshallingInfo<Integer> SHUTDOWNMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shutdownMeCollectors").build();
    private static final MarshallingInfo<Integer> UNHEALTHYMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unhealthyMeCollectors").build();
    private static final MarshallingInfo<Integer> TOTALMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalMeCollectors").build();
    private static final MarshallingInfo<Integer> UNKNOWNMECOLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("unknownMeCollectors").build();

    private static final CustomerMeCollectorInfoMarshaller instance = new CustomerMeCollectorInfoMarshaller();

    public static CustomerMeCollectorInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomerMeCollectorInfo customerMeCollectorInfo, ProtocolMarshaller protocolMarshaller) {

        if (customerMeCollectorInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customerMeCollectorInfo.getActiveMeCollectors(), ACTIVEMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getHealthyMeCollectors(), HEALTHYMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getDenyListedMeCollectors(), DENYLISTEDMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getShutdownMeCollectors(), SHUTDOWNMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getUnhealthyMeCollectors(), UNHEALTHYMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getTotalMeCollectors(), TOTALMECOLLECTORS_BINDING);
            protocolMarshaller.marshall(customerMeCollectorInfo.getUnknownMeCollectors(), UNKNOWNMECOLLECTORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
