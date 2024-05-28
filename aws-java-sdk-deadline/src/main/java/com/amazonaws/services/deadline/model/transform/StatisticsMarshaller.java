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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StatisticsMarshaller {

    private static final MarshallingInfo<java.util.Date> AGGREGATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationEndTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> AGGREGATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggregationStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> COSTINUSD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("costInUsd").build();
    private static final MarshallingInfo<Integer> COUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("count").build();
    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fleetId").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> LICENSEPRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseProduct").build();
    private static final MarshallingInfo<String> QUEUEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("queueId").build();
    private static final MarshallingInfo<StructuredPojo> RUNTIMEINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeInSeconds").build();
    private static final MarshallingInfo<String> USAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageType").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();

    private static final StatisticsMarshaller instance = new StatisticsMarshaller();

    public static StatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Statistics statistics, ProtocolMarshaller protocolMarshaller) {

        if (statistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(statistics.getAggregationEndTime(), AGGREGATIONENDTIME_BINDING);
            protocolMarshaller.marshall(statistics.getAggregationStartTime(), AGGREGATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(statistics.getCostInUsd(), COSTINUSD_BINDING);
            protocolMarshaller.marshall(statistics.getCount(), COUNT_BINDING);
            protocolMarshaller.marshall(statistics.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(statistics.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(statistics.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(statistics.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(statistics.getLicenseProduct(), LICENSEPRODUCT_BINDING);
            protocolMarshaller.marshall(statistics.getQueueId(), QUEUEID_BINDING);
            protocolMarshaller.marshall(statistics.getRuntimeInSeconds(), RUNTIMEINSECONDS_BINDING);
            protocolMarshaller.marshall(statistics.getUsageType(), USAGETYPE_BINDING);
            protocolMarshaller.marshall(statistics.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
