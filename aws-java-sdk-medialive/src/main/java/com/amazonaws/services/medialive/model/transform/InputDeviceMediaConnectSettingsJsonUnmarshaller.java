/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InputDeviceMediaConnectSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceMediaConnectSettingsJsonUnmarshaller implements Unmarshaller<InputDeviceMediaConnectSettings, JsonUnmarshallerContext> {

    public InputDeviceMediaConnectSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDeviceMediaConnectSettings inputDeviceMediaConnectSettings = new InputDeviceMediaConnectSettings();

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
                if (context.testExpression("flowArn", targetDepth)) {
                    context.nextToken();
                    inputDeviceMediaConnectSettings.setFlowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    inputDeviceMediaConnectSettings.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("secretArn", targetDepth)) {
                    context.nextToken();
                    inputDeviceMediaConnectSettings.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceName", targetDepth)) {
                    context.nextToken();
                    inputDeviceMediaConnectSettings.setSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inputDeviceMediaConnectSettings;
    }

    private static InputDeviceMediaConnectSettingsJsonUnmarshaller instance;

    public static InputDeviceMediaConnectSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceMediaConnectSettingsJsonUnmarshaller();
        return instance;
    }
}
