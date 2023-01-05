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
 * HeatMapConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HeatMapConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ROWLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLUMNLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLORSCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorScale").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();

    private static final HeatMapConfigurationMarshaller instance = new HeatMapConfigurationMarshaller();

    public static HeatMapConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HeatMapConfiguration heatMapConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (heatMapConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(heatMapConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getRowLabelOptions(), ROWLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getColumnLabelOptions(), COLUMNLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getColorScale(), COLORSCALE_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(heatMapConfiguration.getTooltip(), TOOLTIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
