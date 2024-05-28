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
package com.amazonaws.services.qbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChatSyncResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatSyncResultJsonUnmarshaller implements Unmarshaller<ChatSyncResult, JsonUnmarshallerContext> {

    public ChatSyncResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChatSyncResult chatSyncResult = new ChatSyncResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return chatSyncResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("conversationId", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setConversationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("systemMessage", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setSystemMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("systemMessageId", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setSystemMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userMessageId", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setUserMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionReview", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setActionReview(ActionReviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("authChallengeRequest", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setAuthChallengeRequest(AuthChallengeRequestJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceAttributions", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setSourceAttributions(new ListUnmarshaller<SourceAttribution>(SourceAttributionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failedAttachments", targetDepth)) {
                    context.nextToken();
                    chatSyncResult.setFailedAttachments(new ListUnmarshaller<AttachmentOutput>(AttachmentOutputJsonUnmarshaller.getInstance())

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

        return chatSyncResult;
    }

    private static ChatSyncResultJsonUnmarshaller instance;

    public static ChatSyncResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChatSyncResultJsonUnmarshaller();
        return instance;
    }
}
