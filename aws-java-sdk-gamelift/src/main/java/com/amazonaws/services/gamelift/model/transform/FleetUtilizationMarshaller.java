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
package com.amazonaws.services.gamelift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FleetUtilizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FleetUtilizationMarshaller {

    private static final MarshallingInfo<String> FLEETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetId").build();
    private static final MarshallingInfo<Integer> ACTIVESERVERPROCESSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveServerProcessCount").build();
    private static final MarshallingInfo<Integer> ACTIVEGAMESESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveGameSessionCount").build();
    private static final MarshallingInfo<Integer> CURRENTPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentPlayerSessionCount").build();
    private static final MarshallingInfo<Integer> MAXIMUMPLAYERSESSIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumPlayerSessionCount").build();

    private static final FleetUtilizationMarshaller instance = new FleetUtilizationMarshaller();

    public static FleetUtilizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FleetUtilization fleetUtilization, ProtocolMarshaller protocolMarshaller) {

        if (fleetUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fleetUtilization.getFleetId(), FLEETID_BINDING);
            protocolMarshaller.marshall(fleetUtilization.getActiveServerProcessCount(), ACTIVESERVERPROCESSCOUNT_BINDING);
            protocolMarshaller.marshall(fleetUtilization.getActiveGameSessionCount(), ACTIVEGAMESESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(fleetUtilization.getCurrentPlayerSessionCount(), CURRENTPLAYERSESSIONCOUNT_BINDING);
            protocolMarshaller.marshall(fleetUtilization.getMaximumPlayerSessionCount(), MAXIMUMPLAYERSESSIONCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
