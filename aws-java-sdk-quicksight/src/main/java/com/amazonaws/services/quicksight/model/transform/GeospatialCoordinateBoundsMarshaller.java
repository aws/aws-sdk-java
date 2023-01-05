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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GeospatialCoordinateBoundsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeospatialCoordinateBoundsMarshaller {

    private static final MarshallingInfo<Double> NORTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("North").build();
    private static final MarshallingInfo<Double> SOUTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("South").build();
    private static final MarshallingInfo<Double> WEST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("West").build();
    private static final MarshallingInfo<Double> EAST_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("East").build();

    private static final GeospatialCoordinateBoundsMarshaller instance = new GeospatialCoordinateBoundsMarshaller();

    public static GeospatialCoordinateBoundsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeospatialCoordinateBounds geospatialCoordinateBounds, ProtocolMarshaller protocolMarshaller) {

        if (geospatialCoordinateBounds == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(geospatialCoordinateBounds.getNorth(), NORTH_BINDING);
            protocolMarshaller.marshall(geospatialCoordinateBounds.getSouth(), SOUTH_BINDING);
            protocolMarshaller.marshall(geospatialCoordinateBounds.getWest(), WEST_BINDING);
            protocolMarshaller.marshall(geospatialCoordinateBounds.getEast(), EAST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
