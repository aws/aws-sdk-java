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
package com.amazonaws.services.groundstation.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.groundstation.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SatelliteListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SatelliteListItemMarshaller {

    private static final MarshallingInfo<List> GROUNDSTATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groundStations").build();
    private static final MarshallingInfo<Integer> NORADSATELLITEID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noradSatelliteID").build();
    private static final MarshallingInfo<String> SATELLITEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("satelliteArn").build();
    private static final MarshallingInfo<String> SATELLITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("satelliteId").build();

    private static final SatelliteListItemMarshaller instance = new SatelliteListItemMarshaller();

    public static SatelliteListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SatelliteListItem satelliteListItem, ProtocolMarshaller protocolMarshaller) {

        if (satelliteListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(satelliteListItem.getGroundStations(), GROUNDSTATIONS_BINDING);
            protocolMarshaller.marshall(satelliteListItem.getNoradSatelliteID(), NORADSATELLITEID_BINDING);
            protocolMarshaller.marshall(satelliteListItem.getSatelliteArn(), SATELLITEARN_BINDING);
            protocolMarshaller.marshall(satelliteListItem.getSatelliteId(), SATELLITEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
