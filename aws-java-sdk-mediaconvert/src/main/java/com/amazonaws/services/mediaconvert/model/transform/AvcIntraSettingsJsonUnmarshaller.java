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
 * AvcIntraSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvcIntraSettingsJsonUnmarshaller implements Unmarshaller<AvcIntraSettings, JsonUnmarshallerContext> {

    public AvcIntraSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AvcIntraSettings avcIntraSettings = new AvcIntraSettings();

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
                if (context.testExpression("avcIntraClass", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setAvcIntraClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("avcIntraUhdSettings", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setAvcIntraUhdSettings(AvcIntraUhdSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanTypeConversionMode", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setScanTypeConversionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    avcIntraSettings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return avcIntraSettings;
    }

    private static AvcIntraSettingsJsonUnmarshaller instance;

    public static AvcIntraSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AvcIntraSettingsJsonUnmarshaller();
        return instance;
    }
}
