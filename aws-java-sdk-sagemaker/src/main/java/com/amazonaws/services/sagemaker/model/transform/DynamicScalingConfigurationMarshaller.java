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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DynamicScalingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DynamicScalingConfigurationMarshaller {

    private static final MarshallingInfo<Integer> MINCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinCapacity").build();
    private static final MarshallingInfo<Integer> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<Integer> SCALEINCOOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleInCooldown").build();
    private static final MarshallingInfo<Integer> SCALEOUTCOOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScaleOutCooldown").build();
    private static final MarshallingInfo<List> SCALINGPOLICIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingPolicies").build();

    private static final DynamicScalingConfigurationMarshaller instance = new DynamicScalingConfigurationMarshaller();

    public static DynamicScalingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DynamicScalingConfiguration dynamicScalingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dynamicScalingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dynamicScalingConfiguration.getMinCapacity(), MINCAPACITY_BINDING);
            protocolMarshaller.marshall(dynamicScalingConfiguration.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(dynamicScalingConfiguration.getScaleInCooldown(), SCALEINCOOLDOWN_BINDING);
            protocolMarshaller.marshall(dynamicScalingConfiguration.getScaleOutCooldown(), SCALEOUTCOOLDOWN_BINDING);
            protocolMarshaller.marshall(dynamicScalingConfiguration.getScalingPolicies(), SCALINGPOLICIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
