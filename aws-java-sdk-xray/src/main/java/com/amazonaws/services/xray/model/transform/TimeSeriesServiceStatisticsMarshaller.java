/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TimeSeriesServiceStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimeSeriesServiceStatisticsMarshaller {

    private static final MarshallingInfo<java.util.Date> TIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Timestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> EDGESUMMARYSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdgeSummaryStatistics").build();
    private static final MarshallingInfo<StructuredPojo> SERVICESUMMARYSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceSummaryStatistics").build();
    private static final MarshallingInfo<List> RESPONSETIMEHISTOGRAM_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResponseTimeHistogram").build();

    private static final TimeSeriesServiceStatisticsMarshaller instance = new TimeSeriesServiceStatisticsMarshaller();

    public static TimeSeriesServiceStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimeSeriesServiceStatistics timeSeriesServiceStatistics, ProtocolMarshaller protocolMarshaller) {

        if (timeSeriesServiceStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timeSeriesServiceStatistics.getTimestamp(), TIMESTAMP_BINDING);
            protocolMarshaller.marshall(timeSeriesServiceStatistics.getEdgeSummaryStatistics(), EDGESUMMARYSTATISTICS_BINDING);
            protocolMarshaller.marshall(timeSeriesServiceStatistics.getServiceSummaryStatistics(), SERVICESUMMARYSTATISTICS_BINDING);
            protocolMarshaller.marshall(timeSeriesServiceStatistics.getResponseTimeHistogram(), RESPONSETIMEHISTOGRAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
