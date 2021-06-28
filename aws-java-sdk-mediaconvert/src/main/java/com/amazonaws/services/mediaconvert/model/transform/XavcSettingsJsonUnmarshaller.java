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
 * XavcSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XavcSettingsJsonUnmarshaller implements Unmarshaller<XavcSettings, JsonUnmarshallerContext> {

    public XavcSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        XavcSettings xavcSettings = new XavcSettings();

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
                if (context.testExpression("adaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entropyEncoding", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setEntropyEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("profile", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softness", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setSoftness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spatialAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setSpatialAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAdaptiveQuantization", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setTemporalAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xavc4kIntraCbgProfileSettings", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setXavc4kIntraCbgProfileSettings(Xavc4kIntraCbgProfileSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("xavc4kIntraVbrProfileSettings", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setXavc4kIntraVbrProfileSettings(Xavc4kIntraVbrProfileSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("xavc4kProfileSettings", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setXavc4kProfileSettings(Xavc4kProfileSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("xavcHdIntraCbgProfileSettings", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setXavcHdIntraCbgProfileSettings(XavcHdIntraCbgProfileSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("xavcHdProfileSettings", targetDepth)) {
                    context.nextToken();
                    xavcSettings.setXavcHdProfileSettings(XavcHdProfileSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return xavcSettings;
    }

    private static XavcSettingsJsonUnmarshaller instance;

    public static XavcSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new XavcSettingsJsonUnmarshaller();
        return instance;
    }
}
