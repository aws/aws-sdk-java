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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PositionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PositionMarshaller {

    private static final MarshallingInfo<Double> ELEVATION_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("elevation").build();
    private static final MarshallingInfo<String> ELEVATIONREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elevationReference").build();
    private static final MarshallingInfo<String> ELEVATIONUNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elevationUnit").build();
    private static final MarshallingInfo<Double> LATITUDE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("latitude").build();
    private static final MarshallingInfo<Double> LONGITUDE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("longitude").build();

    private static final PositionMarshaller instance = new PositionMarshaller();

    public static PositionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Position position, ProtocolMarshaller protocolMarshaller) {

        if (position == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(position.getElevation(), ELEVATION_BINDING);
            protocolMarshaller.marshall(position.getElevationReference(), ELEVATIONREFERENCE_BINDING);
            protocolMarshaller.marshall(position.getElevationUnit(), ELEVATIONUNIT_BINDING);
            protocolMarshaller.marshall(position.getLatitude(), LATITUDE_BINDING);
            protocolMarshaller.marshall(position.getLongitude(), LONGITUDE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
