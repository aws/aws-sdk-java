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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputationMarshaller {

    private static final MarshallingInfo<StructuredPojo> TOPBOTTOMRANKED_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopBottomRanked").build();
    private static final MarshallingInfo<StructuredPojo> TOPBOTTOMMOVERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TopBottomMovers").build();
    private static final MarshallingInfo<StructuredPojo> TOTALAGGREGATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalAggregation").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMMINIMUM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumMinimum").build();
    private static final MarshallingInfo<StructuredPojo> METRICCOMPARISON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricComparison").build();
    private static final MarshallingInfo<StructuredPojo> PERIODOVERPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodOverPeriod").build();
    private static final MarshallingInfo<StructuredPojo> PERIODTODATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeriodToDate").build();
    private static final MarshallingInfo<StructuredPojo> GROWTHRATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrowthRate").build();
    private static final MarshallingInfo<StructuredPojo> UNIQUEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UniqueValues").build();
    private static final MarshallingInfo<StructuredPojo> FORECAST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Forecast").build();

    private static final ComputationMarshaller instance = new ComputationMarshaller();

    public static ComputationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Computation computation, ProtocolMarshaller protocolMarshaller) {

        if (computation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computation.getTopBottomRanked(), TOPBOTTOMRANKED_BINDING);
            protocolMarshaller.marshall(computation.getTopBottomMovers(), TOPBOTTOMMOVERS_BINDING);
            protocolMarshaller.marshall(computation.getTotalAggregation(), TOTALAGGREGATION_BINDING);
            protocolMarshaller.marshall(computation.getMaximumMinimum(), MAXIMUMMINIMUM_BINDING);
            protocolMarshaller.marshall(computation.getMetricComparison(), METRICCOMPARISON_BINDING);
            protocolMarshaller.marshall(computation.getPeriodOverPeriod(), PERIODOVERPERIOD_BINDING);
            protocolMarshaller.marshall(computation.getPeriodToDate(), PERIODTODATE_BINDING);
            protocolMarshaller.marshall(computation.getGrowthRate(), GROWTHRATE_BINDING);
            protocolMarshaller.marshall(computation.getUniqueValues(), UNIQUEVALUES_BINDING);
            protocolMarshaller.marshall(computation.getForecast(), FORECAST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
