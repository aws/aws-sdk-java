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
 * GeospatialMapConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialMapConfigurationJsonUnmarshaller implements Unmarshaller<GeospatialMapConfiguration, JsonUnmarshallerContext> {

    public GeospatialMapConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        GeospatialMapConfiguration geospatialMapConfiguration = new GeospatialMapConfiguration();

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
                    geospatialMapConfiguration.setFieldWells(GeospatialMapFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WindowOptions", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setWindowOptions(GeospatialWindowOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MapStyleOptions", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setMapStyleOptions(GeospatialMapStyleOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PointStyleOptions", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setPointStyleOptions(GeospatialPointStyleOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    context.nextToken();
                    geospatialMapConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return geospatialMapConfiguration;
    }

    private static GeospatialMapConfigurationJsonUnmarshaller instance;

    public static GeospatialMapConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeospatialMapConfigurationJsonUnmarshaller();
        return instance;
    }
}
