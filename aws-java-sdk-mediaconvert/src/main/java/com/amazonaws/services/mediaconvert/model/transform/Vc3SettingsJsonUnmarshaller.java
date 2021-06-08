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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Vc3Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Vc3SettingsJsonUnmarshaller implements Unmarshaller<Vc3Settings, JsonUnmarshallerContext> {

    public Vc3Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        Vc3Settings vc3Settings = new Vc3Settings();

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
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanTypeConversionMode", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setScanTypeConversionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vc3Class", targetDepth)) {
                    context.nextToken();
                    vc3Settings.setVc3Class(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return vc3Settings;
    }

    private static Vc3SettingsJsonUnmarshaller instance;

    public static Vc3SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new Vc3SettingsJsonUnmarshaller();
        return instance;
    }
}
