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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecommendationDetailHourlyMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecommendationDetailHourlyMetricsMarshaller {

    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartTime").build();
    private static final MarshallingInfo<String> ESTIMATEDONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedOnDemandCost").build();
    private static final MarshallingInfo<String> CURRENTCOVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentCoverage").build();
    private static final MarshallingInfo<String> ESTIMATEDCOVERAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedCoverage").build();
    private static final MarshallingInfo<String> ESTIMATEDNEWCOMMITMENTUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EstimatedNewCommitmentUtilization").build();

    private static final RecommendationDetailHourlyMetricsMarshaller instance = new RecommendationDetailHourlyMetricsMarshaller();

    public static RecommendationDetailHourlyMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecommendationDetailHourlyMetrics recommendationDetailHourlyMetrics, ProtocolMarshaller protocolMarshaller) {

        if (recommendationDetailHourlyMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recommendationDetailHourlyMetrics.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(recommendationDetailHourlyMetrics.getEstimatedOnDemandCost(), ESTIMATEDONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(recommendationDetailHourlyMetrics.getCurrentCoverage(), CURRENTCOVERAGE_BINDING);
            protocolMarshaller.marshall(recommendationDetailHourlyMetrics.getEstimatedCoverage(), ESTIMATEDCOVERAGE_BINDING);
            protocolMarshaller.marshall(recommendationDetailHourlyMetrics.getEstimatedNewCommitmentUtilization(), ESTIMATEDNEWCOMMITMENTUTILIZATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
