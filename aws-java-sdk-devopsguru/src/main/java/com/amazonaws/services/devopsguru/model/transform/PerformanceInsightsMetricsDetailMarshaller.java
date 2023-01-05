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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PerformanceInsightsMetricsDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PerformanceInsightsMetricsDetailMarshaller {

    private static final MarshallingInfo<String> METRICDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricDisplayName").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<StructuredPojo> METRICQUERY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricQuery").build();
    private static final MarshallingInfo<List> REFERENCEDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReferenceData").build();
    private static final MarshallingInfo<List> STATSATANOMALY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatsAtAnomaly").build();
    private static final MarshallingInfo<List> STATSATBASELINE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatsAtBaseline").build();

    private static final PerformanceInsightsMetricsDetailMarshaller instance = new PerformanceInsightsMetricsDetailMarshaller();

    public static PerformanceInsightsMetricsDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PerformanceInsightsMetricsDetail performanceInsightsMetricsDetail, ProtocolMarshaller protocolMarshaller) {

        if (performanceInsightsMetricsDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getMetricDisplayName(), METRICDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getMetricQuery(), METRICQUERY_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getReferenceData(), REFERENCEDATA_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getStatsAtAnomaly(), STATSATANOMALY_BINDING);
            protocolMarshaller.marshall(performanceInsightsMetricsDetail.getStatsAtBaseline(), STATSATBASELINE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
