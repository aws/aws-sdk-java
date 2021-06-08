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
package com.amazonaws.services.devopsguru.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devopsguru.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListEventsFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListEventsFiltersMarshaller {

    private static final MarshallingInfo<String> INSIGHTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InsightId").build();
    private static final MarshallingInfo<StructuredPojo> EVENTTIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventTimeRange").build();
    private static final MarshallingInfo<String> EVENTCLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventClass").build();
    private static final MarshallingInfo<String> EVENTSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSource").build();
    private static final MarshallingInfo<String> DATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSource").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCECOLLECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceCollection").build();

    private static final ListEventsFiltersMarshaller instance = new ListEventsFiltersMarshaller();

    public static ListEventsFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListEventsFilters listEventsFilters, ProtocolMarshaller protocolMarshaller) {

        if (listEventsFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listEventsFilters.getInsightId(), INSIGHTID_BINDING);
            protocolMarshaller.marshall(listEventsFilters.getEventTimeRange(), EVENTTIMERANGE_BINDING);
            protocolMarshaller.marshall(listEventsFilters.getEventClass(), EVENTCLASS_BINDING);
            protocolMarshaller.marshall(listEventsFilters.getEventSource(), EVENTSOURCE_BINDING);
            protocolMarshaller.marshall(listEventsFilters.getDataSource(), DATASOURCE_BINDING);
            protocolMarshaller.marshall(listEventsFilters.getResourceCollection(), RESOURCECOLLECTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
