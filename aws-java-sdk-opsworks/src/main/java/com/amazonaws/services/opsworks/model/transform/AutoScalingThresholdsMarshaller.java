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
package com.amazonaws.services.opsworks.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingThresholdsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingThresholdsMarshaller {

    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();
    private static final MarshallingInfo<Integer> THRESHOLDSWAITTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdsWaitTime").build();
    private static final MarshallingInfo<Integer> IGNOREMETRICSTIME_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IgnoreMetricsTime").build();
    private static final MarshallingInfo<Double> CPUTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CpuThreshold").build();
    private static final MarshallingInfo<Double> MEMORYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryThreshold").build();
    private static final MarshallingInfo<Double> LOADTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadThreshold").build();
    private static final MarshallingInfo<List> ALARMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alarms").build();

    private static final AutoScalingThresholdsMarshaller instance = new AutoScalingThresholdsMarshaller();

    public static AutoScalingThresholdsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingThresholds autoScalingThresholds, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingThresholds == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingThresholds.getInstanceCount(), INSTANCECOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getThresholdsWaitTime(), THRESHOLDSWAITTIME_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getIgnoreMetricsTime(), IGNOREMETRICSTIME_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getCpuThreshold(), CPUTHRESHOLD_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getMemoryThreshold(), MEMORYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getLoadThreshold(), LOADTHRESHOLD_BINDING);
            protocolMarshaller.marshall(autoScalingThresholds.getAlarms(), ALARMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
