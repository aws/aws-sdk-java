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
package com.amazonaws.services.location.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.location.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CalculateRouteTruckModeOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CalculateRouteTruckModeOptionsMarshaller {

    private static final MarshallingInfo<Boolean> AVOIDFERRIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvoidFerries").build();
    private static final MarshallingInfo<Boolean> AVOIDTOLLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvoidTolls").build();
    private static final MarshallingInfo<StructuredPojo> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<StructuredPojo> WEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Weight").build();

    private static final CalculateRouteTruckModeOptionsMarshaller instance = new CalculateRouteTruckModeOptionsMarshaller();

    public static CalculateRouteTruckModeOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CalculateRouteTruckModeOptions calculateRouteTruckModeOptions, ProtocolMarshaller protocolMarshaller) {

        if (calculateRouteTruckModeOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(calculateRouteTruckModeOptions.getAvoidFerries(), AVOIDFERRIES_BINDING);
            protocolMarshaller.marshall(calculateRouteTruckModeOptions.getAvoidTolls(), AVOIDTOLLS_BINDING);
            protocolMarshaller.marshall(calculateRouteTruckModeOptions.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(calculateRouteTruckModeOptions.getWeight(), WEIGHT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
