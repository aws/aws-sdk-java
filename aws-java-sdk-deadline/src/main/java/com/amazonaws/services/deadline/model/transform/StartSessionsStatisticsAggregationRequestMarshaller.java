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
package com.amazonaws.services.deadline.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartSessionsStatisticsAggregationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartSessionsStatisticsAggregationRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> FARMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("farmId").build();
    private static final MarshallingInfo<List> GROUPBY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groupBy").build();
    private static final MarshallingInfo<String> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEIDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceIds").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> STATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statistics").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("timezone").build();

    private static final StartSessionsStatisticsAggregationRequestMarshaller instance = new StartSessionsStatisticsAggregationRequestMarshaller();

    public static StartSessionsStatisticsAggregationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartSessionsStatisticsAggregationRequest startSessionsStatisticsAggregationRequest, ProtocolMarshaller protocolMarshaller) {

        if (startSessionsStatisticsAggregationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getFarmId(), FARMID_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getGroupBy(), GROUPBY_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getResourceIds(), RESOURCEIDS_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getStatistics(), STATISTICS_BINDING);
            protocolMarshaller.marshall(startSessionsStatisticsAggregationRequest.getTimezone(), TIMEZONE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
