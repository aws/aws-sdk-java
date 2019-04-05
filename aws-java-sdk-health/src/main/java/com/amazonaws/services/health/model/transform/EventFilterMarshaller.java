/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventFilterMarshaller {

    private static final MarshallingInfo<List> EVENTARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventArns").build();
    private static final MarshallingInfo<List> EVENTTYPECODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCodes").build();
    private static final MarshallingInfo<List> SERVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("services").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regions").build();
    private static final MarshallingInfo<List> AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZones").build();
    private static final MarshallingInfo<List> STARTTIMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTimes").build();
    private static final MarshallingInfo<List> ENDTIMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endTimes").build();
    private static final MarshallingInfo<List> LASTUPDATEDTIMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTimes").build();
    private static final MarshallingInfo<List> ENTITYARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityArns").build();
    private static final MarshallingInfo<List> ENTITYVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityValues").build();
    private static final MarshallingInfo<List> EVENTTYPECATEGORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventTypeCategories").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> EVENTSTATUSCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eventStatusCodes").build();

    private static final EventFilterMarshaller instance = new EventFilterMarshaller();

    public static EventFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventFilter eventFilter, ProtocolMarshaller protocolMarshaller) {

        if (eventFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventFilter.getEventArns(), EVENTARNS_BINDING);
            protocolMarshaller.marshall(eventFilter.getEventTypeCodes(), EVENTTYPECODES_BINDING);
            protocolMarshaller.marshall(eventFilter.getServices(), SERVICES_BINDING);
            protocolMarshaller.marshall(eventFilter.getRegions(), REGIONS_BINDING);
            protocolMarshaller.marshall(eventFilter.getAvailabilityZones(), AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(eventFilter.getStartTimes(), STARTTIMES_BINDING);
            protocolMarshaller.marshall(eventFilter.getEndTimes(), ENDTIMES_BINDING);
            protocolMarshaller.marshall(eventFilter.getLastUpdatedTimes(), LASTUPDATEDTIMES_BINDING);
            protocolMarshaller.marshall(eventFilter.getEntityArns(), ENTITYARNS_BINDING);
            protocolMarshaller.marshall(eventFilter.getEntityValues(), ENTITYVALUES_BINDING);
            protocolMarshaller.marshall(eventFilter.getEventTypeCategories(), EVENTTYPECATEGORIES_BINDING);
            protocolMarshaller.marshall(eventFilter.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(eventFilter.getEventStatusCodes(), EVENTSTATUSCODES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
