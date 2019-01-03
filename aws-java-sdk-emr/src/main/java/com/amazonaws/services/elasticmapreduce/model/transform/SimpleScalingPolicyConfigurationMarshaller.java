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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SimpleScalingPolicyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SimpleScalingPolicyConfigurationMarshaller {

    private static final MarshallingInfo<String> ADJUSTMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdjustmentType").build();
    private static final MarshallingInfo<Integer> SCALINGADJUSTMENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingAdjustment").build();
    private static final MarshallingInfo<Integer> COOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoolDown").build();

    private static final SimpleScalingPolicyConfigurationMarshaller instance = new SimpleScalingPolicyConfigurationMarshaller();

    public static SimpleScalingPolicyConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (simpleScalingPolicyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(simpleScalingPolicyConfiguration.getAdjustmentType(), ADJUSTMENTTYPE_BINDING);
            protocolMarshaller.marshall(simpleScalingPolicyConfiguration.getScalingAdjustment(), SCALINGADJUSTMENT_BINDING);
            protocolMarshaller.marshall(simpleScalingPolicyConfiguration.getCoolDown(), COOLDOWN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
