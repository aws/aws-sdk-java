/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferenceEventSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceEventSummaryMarshaller {

    private static final MarshallingInfo<String> INFERENCESCHEDULERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerArn").build();
    private static final MarshallingInfo<String> INFERENCESCHEDULERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSchedulerName").build();
    private static final MarshallingInfo<java.util.Date> EVENTSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EVENTENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DIAGNOSTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Diagnostics").build();
    private static final MarshallingInfo<Long> EVENTDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventDurationInSeconds").build();

    private static final InferenceEventSummaryMarshaller instance = new InferenceEventSummaryMarshaller();

    public static InferenceEventSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceEventSummary inferenceEventSummary, ProtocolMarshaller protocolMarshaller) {

        if (inferenceEventSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceEventSummary.getInferenceSchedulerArn(), INFERENCESCHEDULERARN_BINDING);
            protocolMarshaller.marshall(inferenceEventSummary.getInferenceSchedulerName(), INFERENCESCHEDULERNAME_BINDING);
            protocolMarshaller.marshall(inferenceEventSummary.getEventStartTime(), EVENTSTARTTIME_BINDING);
            protocolMarshaller.marshall(inferenceEventSummary.getEventEndTime(), EVENTENDTIME_BINDING);
            protocolMarshaller.marshall(inferenceEventSummary.getDiagnostics(), DIAGNOSTICS_BINDING);
            protocolMarshaller.marshall(inferenceEventSummary.getEventDurationInSeconds(), EVENTDURATIONINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
