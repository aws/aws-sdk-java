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
package com.amazonaws.services.sqs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SendMessageBatchResultEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMessageBatchResultEntryJsonUnmarshaller implements Unmarshaller<SendMessageBatchResultEntry, JsonUnmarshallerContext> {

    public SendMessageBatchResultEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        SendMessageBatchResultEntry sendMessageBatchResultEntry = new SendMessageBatchResultEntry();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageId", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MD5OfMessageBody", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setMD5OfMessageBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MD5OfMessageAttributes", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setMD5OfMessageAttributes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MD5OfMessageSystemAttributes", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setMD5OfMessageSystemAttributes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SequenceNumber", targetDepth)) {
                    context.nextToken();
                    sendMessageBatchResultEntry.setSequenceNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return sendMessageBatchResultEntry;
    }

    private static SendMessageBatchResultEntryJsonUnmarshaller instance;

    public static SendMessageBatchResultEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendMessageBatchResultEntryJsonUnmarshaller();
        return instance;
    }
}
