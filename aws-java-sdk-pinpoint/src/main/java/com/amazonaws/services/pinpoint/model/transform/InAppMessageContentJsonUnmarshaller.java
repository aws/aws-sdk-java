/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InAppMessageContent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageContentJsonUnmarshaller implements Unmarshaller<InAppMessageContent, JsonUnmarshallerContext> {

    public InAppMessageContent unmarshall(JsonUnmarshallerContext context) throws Exception {
        InAppMessageContent inAppMessageContent = new InAppMessageContent();

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
                if (context.testExpression("BackgroundColor", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BodyConfig", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setBodyConfig(InAppMessageBodyConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HeaderConfig", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setHeaderConfig(InAppMessageHeaderConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryBtn", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setPrimaryBtn(InAppMessageButtonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryBtn", targetDepth)) {
                    context.nextToken();
                    inAppMessageContent.setSecondaryBtn(InAppMessageButtonJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inAppMessageContent;
    }

    private static InAppMessageContentJsonUnmarshaller instance;

    public static InAppMessageContentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InAppMessageContentJsonUnmarshaller();
        return instance;
    }
}
