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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationautoscaling.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StepAdjustmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StepAdjustmentMarshaller {

    private static final MarshallingInfo<Double> METRICINTERVALLOWERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricIntervalLowerBound").build();
    private static final MarshallingInfo<Double> METRICINTERVALUPPERBOUND_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricIntervalUpperBound").build();
    private static final MarshallingInfo<Integer> SCALINGADJUSTMENT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScalingAdjustment").build();

    private static final StepAdjustmentMarshaller instance = new StepAdjustmentMarshaller();

    public static StepAdjustmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StepAdjustment stepAdjustment, ProtocolMarshaller protocolMarshaller) {

        if (stepAdjustment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stepAdjustment.getMetricIntervalLowerBound(), METRICINTERVALLOWERBOUND_BINDING);
            protocolMarshaller.marshall(stepAdjustment.getMetricIntervalUpperBound(), METRICINTERVALUPPERBOUND_BINDING);
            protocolMarshaller.marshall(stepAdjustment.getScalingAdjustment(), SCALINGADJUSTMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
