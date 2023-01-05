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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DominantColor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DominantColorJsonUnmarshaller implements Unmarshaller<DominantColor, JsonUnmarshallerContext> {

    public DominantColor unmarshall(JsonUnmarshallerContext context) throws Exception {
        DominantColor dominantColor = new DominantColor();

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
                if (context.testExpression("Red", targetDepth)) {
                    context.nextToken();
                    dominantColor.setRed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Blue", targetDepth)) {
                    context.nextToken();
                    dominantColor.setBlue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Green", targetDepth)) {
                    context.nextToken();
                    dominantColor.setGreen(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HexCode", targetDepth)) {
                    context.nextToken();
                    dominantColor.setHexCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CSSColor", targetDepth)) {
                    context.nextToken();
                    dominantColor.setCSSColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SimplifiedColor", targetDepth)) {
                    context.nextToken();
                    dominantColor.setSimplifiedColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PixelPercent", targetDepth)) {
                    context.nextToken();
                    dominantColor.setPixelPercent(context.getUnmarshaller(Float.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dominantColor;
    }

    private static DominantColorJsonUnmarshaller instance;

    public static DominantColorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DominantColorJsonUnmarshaller();
        return instance;
    }
}
