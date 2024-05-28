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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RadarChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RadarChartConfigurationJsonUnmarshaller implements Unmarshaller<RadarChartConfiguration, JsonUnmarshallerContext> {

    public RadarChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RadarChartConfiguration radarChartConfiguration = new RadarChartConfiguration();

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
                    radarChartConfiguration.setFieldWells(RadarChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setSortConfiguration(RadarChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Shape", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setShape(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaseSeriesSettings", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setBaseSeriesSettings(RadarChartSeriesSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartAngle", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setStartAngle(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlternateBandColorsVisibility", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setAlternateBandColorsVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlternateBandEvenColor", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setAlternateBandEvenColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlternateBandOddColor", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setAlternateBandOddColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CategoryAxis", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setCategoryAxis(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryLabelOptions", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setCategoryLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColorAxis", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setColorAxis(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColorLabelOptions", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setColorLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AxesRangeScale", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setAxesRangeScale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Interactions", targetDepth)) {
                    context.nextToken();
                    radarChartConfiguration.setInteractions(VisualInteractionOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return radarChartConfiguration;
    }

    private static RadarChartConfigurationJsonUnmarshaller instance;

    public static RadarChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RadarChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
