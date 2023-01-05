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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PropertyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PropertyMarshaller {

    private static final MarshallingInfo<StructuredPojo> EOCLOUDCOVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EoCloudCover").build();
    private static final MarshallingInfo<StructuredPojo> LANDSATCLOUDCOVERLAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LandsatCloudCoverLand").build();
    private static final MarshallingInfo<StructuredPojo> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Platform").build();
    private static final MarshallingInfo<StructuredPojo> VIEWOFFNADIR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewOffNadir").build();
    private static final MarshallingInfo<StructuredPojo> VIEWSUNAZIMUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewSunAzimuth").build();
    private static final MarshallingInfo<StructuredPojo> VIEWSUNELEVATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewSunElevation").build();

    private static final PropertyMarshaller instance = new PropertyMarshaller();

    public static PropertyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Property property, ProtocolMarshaller protocolMarshaller) {

        if (property == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(property.getEoCloudCover(), EOCLOUDCOVER_BINDING);
            protocolMarshaller.marshall(property.getLandsatCloudCoverLand(), LANDSATCLOUDCOVERLAND_BINDING);
            protocolMarshaller.marshall(property.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(property.getViewOffNadir(), VIEWOFFNADIR_BINDING);
            protocolMarshaller.marshall(property.getViewSunAzimuth(), VIEWSUNAZIMUTH_BINDING);
            protocolMarshaller.marshall(property.getViewSunElevation(), VIEWSUNELEVATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
