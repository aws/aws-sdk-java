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
 * BarChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BarChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<String> ORIENTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Orientation").build();
    private static final MarshallingInfo<String> BARSARRANGEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BarsArrangement").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();
    private static final MarshallingInfo<StructuredPojo> SMALLMULTIPLESOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesOptions").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryAxis").build();
    private static final MarshallingInfo<StructuredPojo> CATEGORYLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CategoryLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> VALUEAXIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueAxis").build();
    private static final MarshallingInfo<StructuredPojo> VALUELABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValueLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> COLORLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColorLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<List> REFERENCELINES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceLines").build();
    private static final MarshallingInfo<List> CONTRIBUTIONANALYSISDEFAULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContributionAnalysisDefaults").build();

    private static final BarChartConfigurationMarshaller instance = new BarChartConfigurationMarshaller();

    public static BarChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BarChartConfiguration barChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (barChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(barChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getOrientation(), ORIENTATION_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getBarsArrangement(), BARSARRANGEMENT_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getSmallMultiplesOptions(), SMALLMULTIPLESOPTIONS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getCategoryAxis(), CATEGORYAXIS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getCategoryLabelOptions(), CATEGORYLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getValueAxis(), VALUEAXIS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getValueLabelOptions(), VALUELABELOPTIONS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getColorLabelOptions(), COLORLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getReferenceLines(), REFERENCELINES_BINDING);
            protocolMarshaller.marshall(barChartConfiguration.getContributionAnalysisDefaults(), CONTRIBUTIONANALYSISDEFAULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
