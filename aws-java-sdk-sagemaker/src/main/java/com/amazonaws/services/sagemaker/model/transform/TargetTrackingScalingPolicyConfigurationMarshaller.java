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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TargetTrackingScalingPolicyConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TargetTrackingScalingPolicyConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> METRICSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricSpecification").build();
    private static final MarshallingInfo<Double> TARGETVALUE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetValue").build();

    private static final TargetTrackingScalingPolicyConfigurationMarshaller instance = new TargetTrackingScalingPolicyConfigurationMarshaller();

    public static TargetTrackingScalingPolicyConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (targetTrackingScalingPolicyConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(targetTrackingScalingPolicyConfiguration.getMetricSpecification(), METRICSPECIFICATION_BINDING);
            protocolMarshaller.marshall(targetTrackingScalingPolicyConfiguration.getTargetValue(), TARGETVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
