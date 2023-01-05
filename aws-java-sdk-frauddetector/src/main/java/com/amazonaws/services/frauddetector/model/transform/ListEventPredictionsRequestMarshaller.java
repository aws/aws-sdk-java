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
 * ListEventPredictionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListEventPredictionsRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventId").build();
    private static final MarshallingInfo<StructuredPojo> EVENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventType").build();
    private static final MarshallingInfo<StructuredPojo> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorId").build();
    private static final MarshallingInfo<StructuredPojo> DETECTORVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorVersionId").build();
    private static final MarshallingInfo<StructuredPojo> PREDICTIONTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("predictionTimeRange").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();

    private static final ListEventPredictionsRequestMarshaller instance = new ListEventPredictionsRequestMarshaller();

    public static ListEventPredictionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListEventPredictionsRequest listEventPredictionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listEventPredictionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listEventPredictionsRequest.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getEventType(), EVENTTYPE_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getDetectorVersionId(), DETECTORVERSIONID_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getPredictionTimeRange(), PREDICTIONTIMERANGE_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listEventPredictionsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
