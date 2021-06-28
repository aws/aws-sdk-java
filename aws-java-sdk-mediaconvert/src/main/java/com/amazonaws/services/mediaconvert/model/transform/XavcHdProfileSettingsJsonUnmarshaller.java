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
 * XavcHdProfileSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XavcHdProfileSettingsJsonUnmarshaller implements Unmarshaller<XavcHdProfileSettings, JsonUnmarshallerContext> {

    public XavcHdProfileSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        XavcHdProfileSettings xavcHdProfileSettings = new XavcHdProfileSettings();

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
                if (context.testExpression("bitrateClass", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setBitrateClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setFlickerAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gopBReference", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setGopBReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gopClosedCadence", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setGopClosedCadence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slices", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setSlices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    context.nextToken();
                    xavcHdProfileSettings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return xavcHdProfileSettings;
    }

    private static XavcHdProfileSettingsJsonUnmarshaller instance;

    public static XavcHdProfileSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new XavcHdProfileSettingsJsonUnmarshaller();
        return instance;
    }
}
