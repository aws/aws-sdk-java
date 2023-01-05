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
package com.amazonaws.services.cloudtrail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventDataStoreMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventDataStoreMarshaller {

    private static final MarshallingInfo<String> EVENTDATASTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventDataStoreArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<Boolean> TERMINATIONPROTECTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationProtectionEnabled").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<List> ADVANCEDEVENTSELECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdvancedEventSelectors").build();
    private static final MarshallingInfo<Boolean> MULTIREGIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MultiRegionEnabled").build();
    private static final MarshallingInfo<Boolean> ORGANIZATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationEnabled").build();
    private static final MarshallingInfo<Integer> RETENTIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetentionPeriod").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("unixTimestamp").build();

    private static final EventDataStoreMarshaller instance = new EventDataStoreMarshaller();

    public static EventDataStoreMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventDataStore eventDataStore, ProtocolMarshaller protocolMarshaller) {

        if (eventDataStore == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventDataStore.getEventDataStoreArn(), EVENTDATASTOREARN_BINDING);
            protocolMarshaller.marshall(eventDataStore.getName(), NAME_BINDING);
            protocolMarshaller.marshall(eventDataStore.getTerminationProtectionEnabled(), TERMINATIONPROTECTIONENABLED_BINDING);
            protocolMarshaller.marshall(eventDataStore.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(eventDataStore.getAdvancedEventSelectors(), ADVANCEDEVENTSELECTORS_BINDING);
            protocolMarshaller.marshall(eventDataStore.getMultiRegionEnabled(), MULTIREGIONENABLED_BINDING);
            protocolMarshaller.marshall(eventDataStore.getOrganizationEnabled(), ORGANIZATIONENABLED_BINDING);
            protocolMarshaller.marshall(eventDataStore.getRetentionPeriod(), RETENTIONPERIOD_BINDING);
            protocolMarshaller.marshall(eventDataStore.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(eventDataStore.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
