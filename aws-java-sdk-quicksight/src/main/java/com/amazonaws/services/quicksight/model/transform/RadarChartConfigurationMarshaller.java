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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RadarChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RadarChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<String> SHAPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Shape").build();
    private static final MarshallingInfo<StructuredPojo> BASESERIESSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseSeriesSettings").build();
    private static final MarshallingInfo<Double> STARTANGLE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartAngle").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();
    private static final MarshallingInfo<String> ALTERNATEBANDCOLORSVISIBILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlternateBandColorsVisibility").build();
    private static final MarshallingInfo<String> ALTERNATEBANDEVENCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlternateBandEvenColor").build();
    private static final MarshallingInfo<String> ALTERNATEBANDODDCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlternateBandOddColor").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryAxis").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLORAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorAxis").build();
    private static final MarshallingInfo<StructuredPojo> COLORLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<String> AXESRANGESCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AxesRangeScale").build();
    private static final MarshallingInfo<StructuredPojo> INTERACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interactions").build();

    private static final RadarChartConfigurationMarshaller instance = new RadarChartConfigurationMarshaller();

    public static RadarChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RadarChartConfiguration radarChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (radarChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(radarChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getShape(), SHAPE_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getBaseSeriesSettings(), BASESERIESSETTINGS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getStartAngle(), STARTANGLE_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getAlternateBandColorsVisibility(), ALTERNATEBANDCOLORSVISIBILITY_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getAlternateBandEvenColor(), ALTERNATEBANDEVENCOLOR_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getAlternateBandOddColor(), ALTERNATEBANDODDCOLOR_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getCategoryAxis(), CATEGORYAXIS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getCategoryLabelOptions(), CATEGORYLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getColorAxis(), COLORAXIS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getColorLabelOptions(), COLORLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getAxesRangeScale(), AXESRANGESCALE_BINDING);
            protocolMarshaller.marshall(radarChartConfiguration.getInteractions(), INTERACTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
