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
 * DvbSubDestinationSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbSubDestinationSettingsJsonUnmarshaller implements Unmarshaller<DvbSubDestinationSettings, JsonUnmarshallerContext> {

    public DvbSubDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        DvbSubDestinationSettings dvbSubDestinationSettings = new DvbSubDestinationSettings();

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
                    dvbSubDestinationSettings.setAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundColor", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundOpacity", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setBackgroundOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("font", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setFont(InputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fontColor", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontOpacity", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setFontOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontResolution", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setFontResolution(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontSize", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setFontSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineColor", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setOutlineColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineSize", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setOutlineSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowColor", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setShadowColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shadowOpacity", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setShadowOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowXOffset", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setShadowXOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowYOffset", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setShadowYOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("teletextGridControl", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setTeletextGridControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xPosition", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setXPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("yPosition", targetDepth)) {
                    context.nextToken();
                    dvbSubDestinationSettings.setYPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dvbSubDestinationSettings;
    }

    private static DvbSubDestinationSettingsJsonUnmarshaller instance;

    public static DvbSubDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DvbSubDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
