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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ECSServiceRecommendedOptionProjectedMetricMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ECSServiceRecommendedOptionProjectedMetricMarshaller {

    private static final MarshallingInfo<Integer> RECOMMENDEDCPUUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedCpuUnits").build();
    private static final MarshallingInfo<Integer> RECOMMENDEDMEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendedMemorySize").build();
    private static final MarshallingInfo<List> PROJECTEDMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("projectedMetrics").build();

    private static final ECSServiceRecommendedOptionProjectedMetricMarshaller instance = new ECSServiceRecommendedOptionProjectedMetricMarshaller();

    public static ECSServiceRecommendedOptionProjectedMetricMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ECSServiceRecommendedOptionProjectedMetric eCSServiceRecommendedOptionProjectedMetric, ProtocolMarshaller protocolMarshaller) {

        if (eCSServiceRecommendedOptionProjectedMetric == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eCSServiceRecommendedOptionProjectedMetric.getRecommendedCpuUnits(), RECOMMENDEDCPUUNITS_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendedOptionProjectedMetric.getRecommendedMemorySize(), RECOMMENDEDMEMORYSIZE_BINDING);
            protocolMarshaller.marshall(eCSServiceRecommendedOptionProjectedMetric.getProjectedMetrics(), PROJECTEDMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
