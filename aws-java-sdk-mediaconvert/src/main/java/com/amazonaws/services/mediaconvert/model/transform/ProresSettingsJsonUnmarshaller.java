/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ProresSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProresSettingsJsonUnmarshaller implements Unmarshaller<ProresSettings, JsonUnmarshallerContext> {

    public ProresSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProresSettings proresSettings = new ProresSettings();

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
                if (context.testExpression("codecProfile", targetDepth)) {
                    context.nextToken();
                    proresSettings.setCodecProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    proresSettings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    proresSettings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    proresSettings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    proresSettings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    proresSettings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    context.nextToken();
                    proresSettings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    context.nextToken();
                    proresSettings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    context.nextToken();
                    proresSettings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    proresSettings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    proresSettings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return proresSettings;
    }

    private static ProresSettingsJsonUnmarshaller instance;

    public static ProresSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProresSettingsJsonUnmarshaller();
        return instance;
    }
}
