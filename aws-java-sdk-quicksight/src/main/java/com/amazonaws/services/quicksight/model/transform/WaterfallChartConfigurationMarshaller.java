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
 * WaterfallChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WaterfallChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> WATERFALLCHARTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaterfallChartOptions").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final WaterfallChartConfigurationMarshaller instance = new WaterfallChartConfigurationMarshaller();

    public static WaterfallChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WaterfallChartConfiguration waterfallChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (waterfallChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(waterfallChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getWaterfallChartOptions(), WATERFALLCHARTOPTIONS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getCategoryAxisLabelOptions(), CATEGORYAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getCategoryAxisDisplayOptions(), CATEGORYAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getPrimaryYAxisLabelOptions(), PRIMARYYAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getPrimaryYAxisDisplayOptions(), PRIMARYYAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(waterfallChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
