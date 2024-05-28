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
 * StaticImageOutputActivateScheduleActionSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticImageOutputActivateScheduleActionSettingsJsonUnmarshaller implements
        Unmarshaller<StaticImageOutputActivateScheduleActionSettings, JsonUnmarshallerContext> {

    public StaticImageOutputActivateScheduleActionSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        StaticImageOutputActivateScheduleActionSettings staticImageOutputActivateScheduleActionSettings = new StaticImageOutputActivateScheduleActionSettings();

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
                    staticImageOutputActivateScheduleActionSettings.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeIn", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setFadeIn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeOut", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setFadeOut(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setImage(InputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageX", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setImageX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageY", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setImageY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("layer", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setLayer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("opacity", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("outputNames", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setOutputNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    context.nextToken();
                    staticImageOutputActivateScheduleActionSettings.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return staticImageOutputActivateScheduleActionSettings;
    }

    private static StaticImageOutputActivateScheduleActionSettingsJsonUnmarshaller instance;

    public static StaticImageOutputActivateScheduleActionSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaticImageOutputActivateScheduleActionSettingsJsonUnmarshaller();
        return instance;
    }
}
