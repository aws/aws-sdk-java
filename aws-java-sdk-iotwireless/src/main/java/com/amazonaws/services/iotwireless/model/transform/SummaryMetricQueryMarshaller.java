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
package com.amazonaws.services.iotwireless.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SummaryMetricQueryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SummaryMetricQueryMarshaller {

    private static final MarshallingInfo<String> QUERYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryId").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> AGGREGATIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AggregationPeriod").build();
    private static final MarshallingInfo<java.util.Date> STARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimestamp").timestampFormat("unixTimestamp").build();

    private static final SummaryMetricQueryMarshaller instance = new SummaryMetricQueryMarshaller();

    public static SummaryMetricQueryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SummaryMetricQuery summaryMetricQuery, ProtocolMarshaller protocolMarshaller) {

        if (summaryMetricQuery == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(summaryMetricQuery.getQueryId(), QUERYID_BINDING);
            protocolMarshaller.marshall(summaryMetricQuery.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(summaryMetricQuery.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(summaryMetricQuery.getAggregationPeriod(), AGGREGATIONPERIOD_BINDING);
            protocolMarshaller.marshall(summaryMetricQuery.getStartTimestamp(), STARTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(summaryMetricQuery.getEndTimestamp(), ENDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
