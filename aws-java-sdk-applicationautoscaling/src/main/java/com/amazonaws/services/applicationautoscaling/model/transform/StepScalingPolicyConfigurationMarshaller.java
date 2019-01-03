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
package com.amazonaws.services.applicationautoscaling.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepScalingPolicyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepScalingPolicyConfigurationMarshaller {

    private static final MarshallingInfo<String> ADJUSTMENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdjustmentType").build();
    private static final MarshallingInfo<List> STEPADJUSTMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StepAdjustments").build();
    private static final MarshallingInfo<Integer> MINADJUSTMENTMAGNITUDE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinAdjustmentMagnitude").build();
    private static final MarshallingInfo<Integer> COOLDOWN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Cooldown").build();
    private static final MarshallingInfo<String> METRICAGGREGATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricAggregationType").build();

    private static final StepScalingPolicyConfigurationMarshaller instance = new StepScalingPolicyConfigurationMarshaller();

    public static StepScalingPolicyConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepScalingPolicyConfiguration stepScalingPolicyConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (stepScalingPolicyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepScalingPolicyConfiguration.getAdjustmentType(), ADJUSTMENTTYPE_BINDING);
            protocolMarshaller.marshall(stepScalingPolicyConfiguration.getStepAdjustments(), STEPADJUSTMENTS_BINDING);
            protocolMarshaller.marshall(stepScalingPolicyConfiguration.getMinAdjustmentMagnitude(), MINADJUSTMENTMAGNITUDE_BINDING);
            protocolMarshaller.marshall(stepScalingPolicyConfiguration.getCooldown(), COOLDOWN_BINDING);
            protocolMarshaller.marshall(stepScalingPolicyConfiguration.getMetricAggregationType(), METRICAGGREGATIONTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
