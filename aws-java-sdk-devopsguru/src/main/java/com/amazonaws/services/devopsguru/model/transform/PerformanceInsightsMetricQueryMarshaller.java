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
package com.amazonaws.services.devopsguru.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PerformanceInsightsMetricQueryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PerformanceInsightsMetricQueryMarshaller {

    private static final MarshallingInfo<String> METRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metric").build();
    private static final MarshallingInfo<StructuredPojo> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GroupBy").build();
    private static final MarshallingInfo<Map> FILTER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Filter").build();

    private static final PerformanceInsightsMetricQueryMarshaller instance = new PerformanceInsightsMetricQueryMarshaller();

    public static PerformanceInsightsMetricQueryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PerformanceInsightsMetricQuery performanceInsightsMetricQuery, ProtocolMarshaller protocolMarshaller) {

        if (performanceInsightsMetricQuery == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(performanceInsightsMetricQuery.getMetric(), METRIC_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricQuery.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricQuery.getFilter(), FILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
