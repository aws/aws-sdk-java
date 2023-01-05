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
 * LineChartConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LineChartConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> FIELDWELLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FieldWells").build();
    private static final MarshallingInfo<StructuredPojo> SORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SortConfiguration").build();
    private static final MarshallingInfo<List> FORECASTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastConfigurations").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> SMALLMULTIPLESOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SmallMultiplesOptions").build();
    private static final MarshallingInfo<StructuredPojo> XAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> XAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("XAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> PRIMARYYAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryYAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> SECONDARYYAXISDISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryYAxisDisplayOptions").build();
    private static final MarshallingInfo<StructuredPojo> SECONDARYYAXISLABELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryYAxisLabelOptions").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTSERIESSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSeriesSettings").build();
    private static final MarshallingInfo<List> SERIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Series").build();
    private static final MarshallingInfo<StructuredPojo> LEGEND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Legend").build();
    private static final MarshallingInfo<StructuredPojo> DATALABELS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLabels").build();
    private static final MarshallingInfo<List> REFERENCELINES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceLines").build();
    private static final MarshallingInfo<StructuredPojo> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tooltip").build();
    private static final MarshallingInfo<List> CONTRIBUTIONANALYSISDEFAULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContributionAnalysisDefaults").build();
    private static final MarshallingInfo<StructuredPojo> VISUALPALETTE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisualPalette").build();

    private static final LineChartConfigurationMarshaller instance = new LineChartConfigurationMarshaller();

    public static LineChartConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LineChartConfiguration lineChartConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (lineChartConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lineChartConfiguration.getFieldWells(), FIELDWELLS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getSortConfiguration(), SORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getForecastConfigurations(), FORECASTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getSmallMultiplesOptions(), SMALLMULTIPLESOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getXAxisDisplayOptions(), XAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getXAxisLabelOptions(), XAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getPrimaryYAxisDisplayOptions(), PRIMARYYAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getPrimaryYAxisLabelOptions(), PRIMARYYAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getSecondaryYAxisDisplayOptions(), SECONDARYYAXISDISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getSecondaryYAxisLabelOptions(), SECONDARYYAXISLABELOPTIONS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getDefaultSeriesSettings(), DEFAULTSERIESSETTINGS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getSeries(), SERIES_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getLegend(), LEGEND_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getDataLabels(), DATALABELS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getReferenceLines(), REFERENCELINES_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getTooltip(), TOOLTIP_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getContributionAnalysisDefaults(), CONTRIBUTIONANALYSISDEFAULTS_BINDING);
            protocolMarshaller.marshall(lineChartConfiguration.getVisualPalette(), VISUALPALETTE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
