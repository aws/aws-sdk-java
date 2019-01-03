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
package com.amazonaws.services.lexruntime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostTextResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTextResultJsonUnmarshaller implements Unmarshaller<PostTextResult, JsonUnmarshallerContext> {

    public PostTextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostTextResult postTextResult = new PostTextResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postTextResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("intentName", targetDepth)) {
                    context.nextToken();
                    postTextResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slots", targetDepth)) {
                    context.nextToken();
                    postTextResult.setSlots(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("sessionAttributes", targetDepth)) {
                    context.nextToken();
                    postTextResult.setSessionAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    postTextResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("messageFormat", targetDepth)) {
                    context.nextToken();
                    postTextResult.setMessageFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dialogState", targetDepth)) {
                    context.nextToken();
                    postTextResult.setDialogState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotToElicit", targetDepth)) {
                    context.nextToken();
                    postTextResult.setSlotToElicit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("responseCard", targetDepth)) {
                    context.nextToken();
                    postTextResult.setResponseCard(ResponseCardJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return postTextResult;
    }

    private static PostTextResultJsonUnmarshaller instance;

    public static PostTextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostTextResultJsonUnmarshaller();
        return instance;
    }
}
