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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendEventRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendEventRequestMarshaller {

    private static final MarshallingInfo<String> EVENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventId").build();
    private static final MarshallingInfo<String> EVENTTYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeName").build();
    private static final MarshallingInfo<String> EVENTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTimestamp").build();
    private static final MarshallingInfo<Map> EVENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventVariables").build();
    private static final MarshallingInfo<String> ASSIGNEDLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assignedLabel").build();
    private static final MarshallingInfo<String> LABELTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("labelTimestamp").build();
    private static final MarshallingInfo<List> ENTITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entities").build();

    private static final SendEventRequestMarshaller instance = new SendEventRequestMarshaller();

    public static SendEventRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendEventRequest sendEventRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendEventRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendEventRequest.getEventId(), EVENTID_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getEventTypeName(), EVENTTYPENAME_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getEventTimestamp(), EVENTTIMESTAMP_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getEventVariables(), EVENTVARIABLES_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getAssignedLabel(), ASSIGNEDLABEL_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getLabelTimestamp(), LABELTIMESTAMP_BINDING);
            protocolMarshaller.marshall(sendEventRequest.getEntities(), ENTITIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
