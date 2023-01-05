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
 * LineChartMarkerStyleSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineChartMarkerStyleSettingsJsonUnmarshaller implements Unmarshaller<LineChartMarkerStyleSettings, JsonUnmarshallerContext> {

    public LineChartMarkerStyleSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        LineChartMarkerStyleSettings lineChartMarkerStyleSettings = new LineChartMarkerStyleSettings();

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
                if (context.testExpression("MarkerVisibility", targetDepth)) {
                    context.nextToken();
                    lineChartMarkerStyleSettings.setMarkerVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MarkerShape", targetDepth)) {
                    context.nextToken();
                    lineChartMarkerStyleSettings.setMarkerShape(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MarkerSize", targetDepth)) {
                    context.nextToken();
                    lineChartMarkerStyleSettings.setMarkerSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MarkerColor", targetDepth)) {
                    context.nextToken();
                    lineChartMarkerStyleSettings.setMarkerColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lineChartMarkerStyleSettings;
    }

    private static LineChartMarkerStyleSettingsJsonUnmarshaller instance;

    public static LineChartMarkerStyleSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LineChartMarkerStyleSettingsJsonUnmarshaller();
        return instance;
    }
}
