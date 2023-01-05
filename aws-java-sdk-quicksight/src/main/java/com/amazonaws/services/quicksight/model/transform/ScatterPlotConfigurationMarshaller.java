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
 * ScatterPlotConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScatterPlotConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> XAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> XAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> YAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> YAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final ScatterPlotConfigurationMarshaller instance = new ScatterPlotConfigurationMarshaller();

    public static ScatterPlotConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScatterPlotConfiguration scatterPlotConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (scatterPlotConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scatterPlotConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getXAxisLabelOptions(), XAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getXAxisDisplayOptions(), XAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getYAxisLabelOptions(), YAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getYAxisDisplayOptions(), YAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(scatterPlotConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
