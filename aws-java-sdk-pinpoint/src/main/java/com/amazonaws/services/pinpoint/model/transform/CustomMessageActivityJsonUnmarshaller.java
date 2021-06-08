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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomMessageActivity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomMessageActivityJsonUnmarshaller implements Unmarshaller<CustomMessageActivity, JsonUnmarshallerContext> {

    public CustomMessageActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomMessageActivity customMessageActivity = new CustomMessageActivity();

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
                if (context.testExpression("DeliveryUri", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setDeliveryUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointTypes", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setEndpointTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MessageConfig", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setMessageConfig(JourneyCustomMessageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextActivity", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setNextActivity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateVersion", targetDepth)) {
                    context.nextToken();
                    customMessageActivity.setTemplateVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customMessageActivity;
    }

    private static CustomMessageActivityJsonUnmarshaller instance;

    public static CustomMessageActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomMessageActivityJsonUnmarshaller();
        return instance;
    }
}
