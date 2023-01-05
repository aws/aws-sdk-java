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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventPredictionSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventPredictionSummaryMarshaller {

    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<String> EVENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeName").build();
    private static final MarshallingInfo<String> EVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTimestamp").build();
    private static final MarshallingInfo<String> PREDICTIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictionTimestamp").build();
    private static final MarshallingInfo<String> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorId").build();
    private static final MarshallingInfo<String> DETECTORVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorVersionId").build();

    private static final EventPredictionSummaryMarshaller instance = new EventPredictionSummaryMarshaller();

    public static EventPredictionSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventPredictionSummary eventPredictionSummary, ProtocolMarshaller protocolMarshaller) {

        if (eventPredictionSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventPredictionSummary.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(eventPredictionSummary.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(eventPredictionSummary.getEventTimestamp(), EVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(eventPredictionSummary.getPredictionTimestamp(), PREDICTIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(eventPredictionSummary.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(eventPredictionSummary.getDetectorVersionId(), DETECTORVERSIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
