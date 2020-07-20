/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventTypeMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> EVENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventVariables").build();
    private static final MarshallingInfo<List> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("labels").build();
    private static final MarshallingInfo<List> ENTITYTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityTypes").build();
    private static final MarshallingInfo<String> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();

    private static final EventTypeMarshaller instance = new EventTypeMarshaller();

    public static EventTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventType eventType, ProtocolMarshaller protocolMarshaller) {

        if (eventType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventType.getName(), NAME_BINDING);
            protocolMarshaller.marshall(eventType.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(eventType.getEventVariables(), EVENTVARIABLES_BINDING);
            protocolMarshaller.marshall(eventType.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(eventType.getEntityTypes(), ENTITYTYPES_BINDING);
            protocolMarshaller.marshall(eventType.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(eventType.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(eventType.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
