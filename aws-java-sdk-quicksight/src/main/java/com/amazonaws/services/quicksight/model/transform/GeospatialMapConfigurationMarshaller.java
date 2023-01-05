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
 * GeospatialMapConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeospatialMapConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<StructuredPojo> WINDOWOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WindowOptions").build();
    private static final MarshallingInfo<StructuredPojo> MAPSTYLEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MapStyleOptions").build();
    private static final MarshallingInfo<StructuredPojo> POINTSTYLEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PointStyleOptions").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final GeospatialMapConfigurationMarshaller instance = new GeospatialMapConfigurationMarshaller();

    public static GeospatialMapConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeospatialMapConfiguration geospatialMapConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (geospatialMapConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(geospatialMapConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getWindowOptions(), WINDOWOPTIONS_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getMapStyleOptions(), MAPSTYLEOPTIONS_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getPointStyleOptions(), POINTSTYLEOPTIONS_BINDING);
            protocolMarshaller.marshall(geospatialMapConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
