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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UserTurnResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnResultJsonUnmarshaller implements Unmarshaller<UserTurnResult, JsonUnmarshallerContext> {

    public UserTurnResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserTurnResult userTurnResult = new UserTurnResult();

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
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setInput(UserTurnInputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("expectedOutput", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setExpectedOutput(UserTurnOutputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("actualOutput", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setActualOutput(UserTurnOutputSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("errorDetails", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setErrorDetails(ExecutionErrorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endToEndResult", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setEndToEndResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentMatchResult", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setIntentMatchResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotMatchResult", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setSlotMatchResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("speechTranscriptionResult", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setSpeechTranscriptionResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("conversationLevelResult", targetDepth)) {
                    context.nextToken();
                    userTurnResult.setConversationLevelResult(ConversationLevelResultDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return userTurnResult;
    }

    private static UserTurnResultJsonUnmarshaller instance;

    public static UserTurnResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserTurnResultJsonUnmarshaller();
        return instance;
    }
}
