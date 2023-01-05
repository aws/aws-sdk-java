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
 * ComboChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComboChartConfigurationJsonUnmarshaller implements Unmarshaller<ComboChartConfiguration, JsonUnmarshallerContext> {

    public ComboChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComboChartConfiguration comboChartConfiguration = new ComboChartConfiguration();

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
                    comboChartConfiguration.setFieldWells(ComboChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setSortConfiguration(ComboChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BarsArrangement", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setBarsArrangement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CategoryAxis", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setCategoryAxis(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryLabelOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setCategoryLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setPrimaryYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setPrimaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setSecondaryYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setSecondaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColorLabelOptions", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setColorLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BarDataLabels", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setBarDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LineDataLabels", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setLineDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReferenceLines", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setReferenceLines(new ListUnmarshaller<ReferenceLine>(ReferenceLineJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    comboChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return comboChartConfiguration;
    }

    private static ComboChartConfigurationJsonUnmarshaller instance;

    public static ComboChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComboChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
