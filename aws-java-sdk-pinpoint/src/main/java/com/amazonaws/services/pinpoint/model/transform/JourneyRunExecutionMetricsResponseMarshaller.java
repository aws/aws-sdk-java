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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JourneyRunExecutionMetricsResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JourneyRunExecutionMetricsResponseMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> JOURNEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JourneyId").build();
    private static final MarshallingInfo<String> LASTEVALUATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastEvaluatedTime").build();
    private static final MarshallingInfo<Map> METRICS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metrics").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RunId").build();

    private static final JourneyRunExecutionMetricsResponseMarshaller instance = new JourneyRunExecutionMetricsResponseMarshaller();

    public static JourneyRunExecutionMetricsResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JourneyRunExecutionMetricsResponse journeyRunExecutionMetricsResponse, ProtocolMarshaller protocolMarshaller) {

        if (journeyRunExecutionMetricsResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(journeyRunExecutionMetricsResponse.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(journeyRunExecutionMetricsResponse.getJourneyId(), JOURNEYID_BINDING);
            protocolMarshaller.marshall(journeyRunExecutionMetricsResponse.getLastEvaluatedTime(), LASTEVALUATEDTIME_BINDING);
            protocolMarshaller.marshall(journeyRunExecutionMetricsResponse.getMetrics(), METRICS_BINDING);
            protocolMarshaller.marshall(journeyRunExecutionMetricsResponse.getRunId(), RUNID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
