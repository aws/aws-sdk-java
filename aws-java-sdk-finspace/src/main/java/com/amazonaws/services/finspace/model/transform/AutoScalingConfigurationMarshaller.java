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
 * AutoScalingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingConfigurationMarshaller {

    private static final MarshallingInfo<Integer> MINNODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minNodeCount").build();
    private static final MarshallingInfo<Integer> MAXNODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxNodeCount").build();
    private static final MarshallingInfo<String> AUTOSCALINGMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingMetric").build();
    private static final MarshallingInfo<Double> METRICTARGET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricTarget").build();
    private static final MarshallingInfo<Double> SCALEINCOOLDOWNSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scaleInCooldownSeconds").build();
    private static final MarshallingInfo<Double> SCALEOUTCOOLDOWNSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scaleOutCooldownSeconds").build();

    private static final AutoScalingConfigurationMarshaller instance = new AutoScalingConfigurationMarshaller();

    public static AutoScalingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingConfiguration autoScalingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingConfiguration.getMinNodeCount(), MINNODECOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getMaxNodeCount(), MAXNODECOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getAutoScalingMetric(), AUTOSCALINGMETRIC_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getMetricTarget(), METRICTARGET_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getScaleInCooldownSeconds(), SCALEINCOOLDOWNSECONDS_BINDING);
            protocolMarshaller.marshall(autoScalingConfiguration.getScaleOutCooldownSeconds(), SCALEOUTCOOLDOWNSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
