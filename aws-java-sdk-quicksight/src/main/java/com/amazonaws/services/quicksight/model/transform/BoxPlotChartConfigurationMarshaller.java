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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BoxPlotChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BoxPlotChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> BOXPLOTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BoxPlotOptions").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryAxis").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<List> REFERENCELINES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceLines").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final BoxPlotChartConfigurationMarshaller instance = new BoxPlotChartConfigurationMarshaller();

    public static BoxPlotChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BoxPlotChartConfiguration boxPlotChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (boxPlotChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(boxPlotChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getBoxPlotOptions(), BOXPLOTOPTIONS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getCategoryAxis(), CATEGORYAXIS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getCategoryLabelOptions(), CATEGORYLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getPrimaryYAxisDisplayOptions(), PRIMARYYAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getPrimaryYAxisLabelOptions(), PRIMARYYAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getReferenceLines(), REFERENCELINES_BINDING);
            protocolMarshaller.marshall(boxPlotChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
