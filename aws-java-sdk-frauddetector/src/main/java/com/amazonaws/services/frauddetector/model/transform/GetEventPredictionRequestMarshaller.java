/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetEventPredictionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetEventPredictionRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorId").build();
    private static final MarshallingInfo<String> DETECTORVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorVersionId").build();
    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<String> EVENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeName").build();
    private static final MarshallingInfo<List> ENTITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entities").build();
    private static final MarshallingInfo<String> EVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTimestamp").build();
    private static final MarshallingInfo<Map> EVENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventVariables").build();
    private static final MarshallingInfo<Map> EXTERNALMODELENDPOINTDATABLOBS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalModelEndpointDataBlobs").build();

    private static final GetEventPredictionRequestMarshaller instance = new GetEventPredictionRequestMarshaller();

    public static GetEventPredictionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetEventPredictionRequest getEventPredictionRequest, ProtocolMarshaller protocolMarshaller) {

        if (getEventPredictionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getEventPredictionRequest.getDetectorId(), DETECTORID_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getDetectorVersionId(), DETECTORVERSIONID_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getEntities(), ENTITIES_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getEventTimestamp(), EVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getEventVariables(), EVENTVARIABLES_BINDING);
            protocolMarshaller.marshall(getEventPredictionRequest.getExternalModelEndpointDataBlobs(), EXTERNALMODELENDPOINTDATABLOBS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
