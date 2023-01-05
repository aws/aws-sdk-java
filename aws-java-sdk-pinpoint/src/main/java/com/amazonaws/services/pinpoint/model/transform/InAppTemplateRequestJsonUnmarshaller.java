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
 * InAppTemplateRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppTemplateRequestJsonUnmarshaller implements Unmarshaller<InAppTemplateRequest, JsonUnmarshallerContext> {

    public InAppTemplateRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        InAppTemplateRequest inAppTemplateRequest = new InAppTemplateRequest();

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
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    inAppTemplateRequest.setContent(new ListUnmarshaller<InAppMessageContent>(InAppMessageContentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CustomConfig", targetDepth)) {
                    context.nextToken();
                    inAppTemplateRequest.setCustomConfig(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Layout", targetDepth)) {
                    context.nextToken();
                    inAppTemplateRequest.setLayout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    inAppTemplateRequest.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateDescription", targetDepth)) {
                    context.nextToken();
                    inAppTemplateRequest.setTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inAppTemplateRequest;
    }

    private static InAppTemplateRequestJsonUnmarshaller instance;

    public static InAppTemplateRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InAppTemplateRequestJsonUnmarshaller();
        return instance;
    }
}
