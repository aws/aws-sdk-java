/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UIColorPalette JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UIColorPaletteJsonUnmarshaller implements Unmarshaller<UIColorPalette, JsonUnmarshallerContext> {

    public UIColorPalette unmarshall(JsonUnmarshallerContext context) throws Exception {
        UIColorPalette uIColorPalette = new UIColorPalette();

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
                if (context.testExpression("PrimaryForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setPrimaryForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryBackground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setPrimaryBackground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setSecondaryForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryBackground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setSecondaryBackground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Accent", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setAccent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccentForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setAccentForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Danger", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setDanger(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DangerForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setDangerForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Warning", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setWarning(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WarningForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setWarningForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Success", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setSuccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SuccessForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setSuccessForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Dimension", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setDimension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DimensionForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setDimensionForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Measure", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setMeasure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MeasureForeground", targetDepth)) {
                    context.nextToken();
                    uIColorPalette.setMeasureForeground(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return uIColorPalette;
    }

    private static UIColorPaletteJsonUnmarshaller instance;

    public static UIColorPaletteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UIColorPaletteJsonUnmarshaller();
        return instance;
    }
}
