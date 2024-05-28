/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opensearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AvailabilityZoneInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AvailabilityZoneInfoMarshaller {

    private static final MarshallingInfo<String> AVAILABILITYZONENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZoneName").build();
    private static final MarshallingInfo<String> ZONESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZoneStatus").build();
    private static final MarshallingInfo<String> CONFIGUREDDATANODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfiguredDataNodeCount").build();
    private static final MarshallingInfo<String> AVAILABLEDATANODECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailableDataNodeCount").build();
    private static final MarshallingInfo<String> TOTALSHARDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalShards").build();
    private static final MarshallingInfo<String> TOTALUNASSIGNEDSHARDS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalUnAssignedShards").build();

    private static final AvailabilityZoneInfoMarshaller instance = new AvailabilityZoneInfoMarshaller();

    public static AvailabilityZoneInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AvailabilityZoneInfo availabilityZoneInfo, ProtocolMarshaller protocolMarshaller) {

        if (availabilityZoneInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(availabilityZoneInfo.getAvailabilityZoneName(), AVAILABILITYZONENAME_BINDING);
            protocolMarshaller.marshall(availabilityZoneInfo.getZoneStatus(), ZONESTATUS_BINDING);
            protocolMarshaller.marshall(availabilityZoneInfo.getConfiguredDataNodeCount(), CONFIGUREDDATANODECOUNT_BINDING);
            protocolMarshaller.marshall(availabilityZoneInfo.getAvailableDataNodeCount(), AVAILABLEDATANODECOUNT_BINDING);
            protocolMarshaller.marshall(availabilityZoneInfo.getTotalShards(), TOTALSHARDS_BINDING);
            protocolMarshaller.marshall(availabilityZoneInfo.getTotalUnAssignedShards(), TOTALUNASSIGNEDSHARDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
