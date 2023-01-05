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
 * PieChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PieChartConfigurationJsonUnmarshaller implements Unmarshaller<PieChartConfiguration, JsonUnmarshallerContext> {

    public PieChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        PieChartConfiguration pieChartConfiguration = new PieChartConfiguration();

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
                    pieChartConfiguration.setFieldWells(PieChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setSortConfiguration(PieChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DonutOptions", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setDonutOptions(DonutOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SmallMultiplesOptions", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setSmallMultiplesOptions(SmallMultiplesOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryLabelOptions", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setCategoryLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValueLabelOptions", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setValueLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLabels", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContributionAnalysisDefaults", targetDepth)) {
                    context.nextToken();
                    pieChartConfiguration.setContributionAnalysisDefaults(new ListUnmarshaller<ContributionAnalysisDefault>(
                            ContributionAnalysisDefaultJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pieChartConfiguration;
    }

    private static PieChartConfigurationJsonUnmarshaller instance;

    public static PieChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PieChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
