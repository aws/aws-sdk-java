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
package com.amazonaws.services.applicationinsights.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationinsights.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationEventMarshaller {

    private static final MarshallingInfo<String> MONITOREDRESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonitoredResourceARN").build();
    private static final MarshallingInfo<String> EVENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventStatus").build();
    private static final MarshallingInfo<String> EVENTRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventResourceType").build();
    private static final MarshallingInfo<java.util.Date> EVENTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EVENTDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventDetail").build();
    private static final MarshallingInfo<String> EVENTRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventResourceName").build();

    private static final ConfigurationEventMarshaller instance = new ConfigurationEventMarshaller();

    public static ConfigurationEventMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationEvent configurationEvent, ProtocolMarshaller protocolMarshaller) {

        if (configurationEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationEvent.getMonitoredResourceARN(), MONITOREDRESOURCEARN_BINDING);
            protocolMarshaller.marshall(configurationEvent.getEventStatus(), EVENTSTATUS_BINDING);
            protocolMarshaller.marshall(configurationEvent.getEventResourceType(), EVENTRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(configurationEvent.getEventTime(), EVENTTIME_BINDING);
            protocolMarshaller.marshall(configurationEvent.getEventDetail(), EVENTDETAIL_BINDING);
            protocolMarshaller.marshall(configurationEvent.getEventResourceName(), EVENTRESOURCENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
