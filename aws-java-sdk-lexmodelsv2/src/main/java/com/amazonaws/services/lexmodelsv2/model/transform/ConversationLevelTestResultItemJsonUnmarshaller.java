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
 * ConversationLevelTestResultItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLevelTestResultItemJsonUnmarshaller implements Unmarshaller<ConversationLevelTestResultItem, JsonUnmarshallerContext> {

    public ConversationLevelTestResultItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConversationLevelTestResultItem conversationLevelTestResultItem = new ConversationLevelTestResultItem();

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
                if (context.testExpression("conversationId", targetDepth)) {
                    context.nextToken();
                    conversationLevelTestResultItem.setConversationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endToEndResult", targetDepth)) {
                    context.nextToken();
                    conversationLevelTestResultItem.setEndToEndResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("speechTranscriptionResult", targetDepth)) {
                    context.nextToken();
                    conversationLevelTestResultItem.setSpeechTranscriptionResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentClassificationResults", targetDepth)) {
                    context.nextToken();
                    conversationLevelTestResultItem.setIntentClassificationResults(new ListUnmarshaller<ConversationLevelIntentClassificationResultItem>(
                            ConversationLevelIntentClassificationResultItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("slotResolutionResults", targetDepth)) {
                    context.nextToken();
                    conversationLevelTestResultItem.setSlotResolutionResults(new ListUnmarshaller<ConversationLevelSlotResolutionResultItem>(
                            ConversationLevelSlotResolutionResultItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return conversationLevelTestResultItem;
    }

    private static ConversationLevelTestResultItemJsonUnmarshaller instance;

    public static ConversationLevelTestResultItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConversationLevelTestResultItemJsonUnmarshaller();
        return instance;
    }
}
