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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InputDeviceUhdSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceUhdSettingsJsonUnmarshaller implements Unmarshaller<InputDeviceUhdSettings, JsonUnmarshallerContext> {

    public InputDeviceUhdSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDeviceUhdSettings inputDeviceUhdSettings = new InputDeviceUhdSettings();

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
                if (context.testExpression("activeInput", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setActiveInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredInput", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setConfiguredInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceState", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setDeviceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerate", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setFramerate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setScanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    context.nextToken();
                    inputDeviceUhdSettings.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inputDeviceUhdSettings;
    }

    private static InputDeviceUhdSettingsJsonUnmarshaller instance;

    public static InputDeviceUhdSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceUhdSettingsJsonUnmarshaller();
        return instance;
    }
}
