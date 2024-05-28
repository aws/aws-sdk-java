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
package com.amazonaws.services.finspace.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KxScalingGroupConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KxScalingGroupConfigurationMarshaller {

    private static final MarshallingInfo<String> SCALINGGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingGroupName").build();
    private static final MarshallingInfo<Integer> MEMORYLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryLimit").build();
    private static final MarshallingInfo<Integer> MEMORYRESERVATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("memoryReservation").build();
    private static final MarshallingInfo<Integer> NODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodeCount").build();
    private static final MarshallingInfo<Double> CPU_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cpu").build();

    private static final KxScalingGroupConfigurationMarshaller instance = new KxScalingGroupConfigurationMarshaller();

    public static KxScalingGroupConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KxScalingGroupConfiguration kxScalingGroupConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (kxScalingGroupConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kxScalingGroupConfiguration.getScalingGroupName(), SCALINGGROUPNAME_BINDING);
            protocolMarshaller.marshall(kxScalingGroupConfiguration.getMemoryLimit(), MEMORYLIMIT_BINDING);
            protocolMarshaller.marshall(kxScalingGroupConfiguration.getMemoryReservation(), MEMORYRESERVATION_BINDING);
            protocolMarshaller.marshall(kxScalingGroupConfiguration.getNodeCount(), NODECOUNT_BINDING);
            protocolMarshaller.marshall(kxScalingGroupConfiguration.getCpu(), CPU_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
