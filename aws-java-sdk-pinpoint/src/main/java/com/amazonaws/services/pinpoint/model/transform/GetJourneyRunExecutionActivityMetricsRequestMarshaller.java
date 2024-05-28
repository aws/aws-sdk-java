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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetJourneyRunExecutionActivityMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetJourneyRunExecutionActivityMetricsRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("application-id").build();
    private static final MarshallingInfo<String> JOURNEYACTIVITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("journey-activity-id").build();
    private static final MarshallingInfo<String> JOURNEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("journey-id").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();
    private static final MarshallingInfo<String> PAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("page-size").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("run-id").build();

    private static final GetJourneyRunExecutionActivityMetricsRequestMarshaller instance = new GetJourneyRunExecutionActivityMetricsRequestMarshaller();

    public static GetJourneyRunExecutionActivityMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetJourneyRunExecutionActivityMetricsRequest getJourneyRunExecutionActivityMetricsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getJourneyRunExecutionActivityMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getJourneyActivityId(), JOURNEYACTIVITYID_BINDING);
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getJourneyId(), JOURNEYID_BINDING);
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getPageSize(), PAGESIZE_BINDING);
            protocolMarshaller.marshall(getJourneyRunExecutionActivityMetricsRequest.getRunId(), RUNID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
