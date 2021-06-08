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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputeLimitsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeLimitsMarshaller {

    private static final MarshallingInfo<String> UNITTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UnitType").build();
    private static final MarshallingInfo<Integer> MINIMUMCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumCapacityUnits").build();
    private static final MarshallingInfo<Integer> MAXIMUMCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumCapacityUnits").build();
    private static final MarshallingInfo<Integer> MAXIMUMONDEMANDCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumOnDemandCapacityUnits").build();
    private static final MarshallingInfo<Integer> MAXIMUMCORECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumCoreCapacityUnits").build();

    private static final ComputeLimitsMarshaller instance = new ComputeLimitsMarshaller();

    public static ComputeLimitsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComputeLimits computeLimits, ProtocolMarshaller protocolMarshaller) {

        if (computeLimits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computeLimits.getUnitType(), UNITTYPE_BINDING);
            protocolMarshaller.marshall(computeLimits.getMinimumCapacityUnits(), MINIMUMCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(computeLimits.getMaximumCapacityUnits(), MAXIMUMCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(computeLimits.getMaximumOnDemandCapacityUnits(), MAXIMUMONDEMANDCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(computeLimits.getMaximumCoreCapacityUnits(), MAXIMUMCORECAPACITYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
