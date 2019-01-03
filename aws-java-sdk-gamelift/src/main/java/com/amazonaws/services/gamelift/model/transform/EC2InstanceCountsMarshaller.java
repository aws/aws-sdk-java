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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EC2InstanceCountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2InstanceCountsMarshaller {

    private static final MarshallingInfo<Integer> DESIRED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DESIRED").build();
    private static final MarshallingInfo<Integer> MINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MINIMUM").build();
    private static final MarshallingInfo<Integer> MAXIMUM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MAXIMUM").build();
    private static final MarshallingInfo<Integer> PENDING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PENDING").build();
    private static final MarshallingInfo<Integer> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ACTIVE").build();
    private static final MarshallingInfo<Integer> IDLE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IDLE").build();
    private static final MarshallingInfo<Integer> TERMINATING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TERMINATING").build();

    private static final EC2InstanceCountsMarshaller instance = new EC2InstanceCountsMarshaller();

    public static EC2InstanceCountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2InstanceCounts eC2InstanceCounts, ProtocolMarshaller protocolMarshaller) {

        if (eC2InstanceCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2InstanceCounts.getDESIRED(), DESIRED_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getMINIMUM(), MINIMUM_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getMAXIMUM(), MAXIMUM_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getPENDING(), PENDING_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getACTIVE(), ACTIVE_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getIDLE(), IDLE_BINDING);
            protocolMarshaller.marshall(eC2InstanceCounts.getTERMINATING(), TERMINATING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
