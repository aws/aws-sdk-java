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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LineChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartConfigurationJsonUnmarshaller implements Unmarshaller<LineChartConfiguration, JsonUnmarshallerContext> {

    public LineChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        LineChartConfiguration lineChartConfiguration = new LineChartConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FieldWells", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setFieldWells(LineChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setSortConfiguration(LineChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ForecastConfigurations", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setForecastConfigurations(new ListUnmarshaller<ForecastConfiguration>(ForecastConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SmallMultiplesOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setSmallMultiplesOptions(SmallMultiplesOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setXAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setXAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setPrimaryYAxisDisplayOptions(LineSeriesAxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setPrimaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setSecondaryYAxisDisplayOptions(LineSeriesAxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setSecondaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSeriesSettings", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setDefaultSeriesSettings(LineChartDefaultSeriesSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Series", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setSeries(new ListUnmarshaller<SeriesItem>(SeriesItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLabels", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReferenceLines", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setReferenceLines(new ListUnmarshaller<ReferenceLine>(ReferenceLineJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContributionAnalysisDefaults", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setContributionAnalysisDefaults(new ListUnmarshaller<ContributionAnalysisDefault>(
                            ContributionAnalysisDefaultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    lineChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lineChartConfiguration;
    }

    private static LineChartConfigurationJsonUnmarshaller instance;

    public static LineChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LineChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
