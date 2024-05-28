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
package com.amazonaws.services.wellarchitected.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConsolidatedReportMetricMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsolidatedReportMetricMarshaller {

    private static final MarshallingInfo<String> METRICTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricType").build();
    private static final MarshallingInfo<Map> RISKCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RiskCounts").build();
    private static final MarshallingInfo<String> WORKLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadId").build();
    private static final MarshallingInfo<String> WORKLOADNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadName").build();
    private static final MarshallingInfo<String> WORKLOADARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkloadArn").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LENSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lenses").build();
    private static final MarshallingInfo<Integer> LENSESAPPLIEDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LensesAppliedCount").build();

    private static final ConsolidatedReportMetricMarshaller instance = new ConsolidatedReportMetricMarshaller();

    public static ConsolidatedReportMetricMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConsolidatedReportMetric consolidatedReportMetric, ProtocolMarshaller protocolMarshaller) {

        if (consolidatedReportMetric == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consolidatedReportMetric.getMetricType(), METRICTYPE_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getRiskCounts(), RISKCOUNTS_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getWorkloadId(), WORKLOADID_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getWorkloadName(), WORKLOADNAME_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getWorkloadArn(), WORKLOADARN_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getLenses(), LENSES_BINDING);
            protocolMarshaller.marshall(consolidatedReportMetric.getLensesAppliedCount(), LENSESAPPLIEDCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
