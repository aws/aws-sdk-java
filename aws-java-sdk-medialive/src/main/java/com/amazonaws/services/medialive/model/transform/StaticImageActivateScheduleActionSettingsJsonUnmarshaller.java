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
 * StaticImageActivateScheduleActionSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticImageActivateScheduleActionSettingsJsonUnmarshaller implements
        Unmarshaller<StaticImageActivateScheduleActionSettings, JsonUnmarshallerContext> {

    public StaticImageActivateScheduleActionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        StaticImageActivateScheduleActionSettings staticImageActivateScheduleActionSettings = new StaticImageActivateScheduleActionSettings();

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
                if (context.testExpression("duration", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeIn", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setFadeIn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeOut", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setFadeOut(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setImage(InputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageX", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setImageX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageY", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setImageY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("layer", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setLayer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("opacity", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    context.nextToken();
                    staticImageActivateScheduleActionSettings.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return staticImageActivateScheduleActionSettings;
    }

    private static StaticImageActivateScheduleActionSettingsJsonUnmarshaller instance;

    public static StaticImageActivateScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaticImageActivateScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}
