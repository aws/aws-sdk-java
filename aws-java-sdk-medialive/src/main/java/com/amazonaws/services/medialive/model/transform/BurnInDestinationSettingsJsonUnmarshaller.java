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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BurnInDestinationSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BurnInDestinationSettingsJsonUnmarshaller implements Unmarshaller<BurnInDestinationSettings, JsonUnmarshallerContext> {

    public BurnInDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        BurnInDestinationSettings burnInDestinationSettings = new BurnInDestinationSettings();

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
                if (context.testExpression("alignment", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundColor", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundOpacity", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setBackgroundOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("font", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setFont(InputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fontColor", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontOpacity", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setFontOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontResolution", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setFontResolution(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontSize", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setFontSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineColor", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setOutlineColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineSize", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setOutlineSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowColor", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setShadowColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shadowOpacity", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setShadowOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowXOffset", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setShadowXOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowYOffset", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setShadowYOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("teletextGridControl", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setTeletextGridControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xPosition", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setXPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("yPosition", targetDepth)) {
                    context.nextToken();
                    burnInDestinationSettings.setYPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return burnInDestinationSettings;
    }

    private static BurnInDestinationSettingsJsonUnmarshaller instance;

    public static BurnInDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BurnInDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
