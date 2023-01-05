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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetECSServiceRecommendationProjectedMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetECSServiceRecommendationProjectedMetricsRequestMarshaller {

    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceArn").build();
    private static final MarshallingInfo<String> STAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stat").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();

    private static final GetECSServiceRecommendationProjectedMetricsRequestMarshaller instance = new GetECSServiceRecommendationProjectedMetricsRequestMarshaller();

    public static GetECSServiceRecommendationProjectedMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetECSServiceRecommendationProjectedMetricsRequest getECSServiceRecommendationProjectedMetricsRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (getECSServiceRecommendationProjectedMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getECSServiceRecommendationProjectedMetricsRequest.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(getECSServiceRecommendationProjectedMetricsRequest.getStat(), STAT_BINDING);
            protocolMarshaller.marshall(getECSServiceRecommendationProjectedMetricsRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(getECSServiceRecommendationProjectedMetricsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getECSServiceRecommendationProjectedMetricsRequest.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
