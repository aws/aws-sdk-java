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
 * ScatterPlotConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScatterPlotConfigurationJsonUnmarshaller implements Unmarshaller<ScatterPlotConfiguration, JsonUnmarshallerContext> {

    public ScatterPlotConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScatterPlotConfiguration scatterPlotConfiguration = new ScatterPlotConfiguration();

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
                    scatterPlotConfiguration.setFieldWells(ScatterPlotFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setXAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setXAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("YAxisLabelOptions", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("YAxisDisplayOptions", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLabels", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    scatterPlotConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scatterPlotConfiguration;
    }

    private static ScatterPlotConfigurationJsonUnmarshaller instance;

    public static ScatterPlotConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScatterPlotConfigurationJsonUnmarshaller();
        return instance;
    }
}
