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
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MessageSystemAttributeValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageSystemAttributeValueJsonUnmarshaller implements Unmarshaller<MessageSystemAttributeValue, JsonUnmarshallerContext> {

    public MessageSystemAttributeValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        MessageSystemAttributeValue messageSystemAttributeValue = new MessageSystemAttributeValue();

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
                if (context.testExpression("StringValue", targetDepth)) {
                    context.nextToken();
                    messageSystemAttributeValue.setStringValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BinaryValue", targetDepth)) {
                    context.nextToken();
                    messageSystemAttributeValue.setBinaryValue(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("StringListValues", targetDepth)) {
                    context.nextToken();
                    messageSystemAttributeValue.setStringListValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BinaryListValues", targetDepth)) {
                    context.nextToken();
                    messageSystemAttributeValue.setBinaryListValues(new ListUnmarshaller<java.nio.ByteBuffer>(context
                            .getUnmarshaller(java.nio.ByteBuffer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DataType", targetDepth)) {
                    context.nextToken();
                    messageSystemAttributeValue.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return messageSystemAttributeValue;
    }

    private static MessageSystemAttributeValueJsonUnmarshaller instance;

    public static MessageSystemAttributeValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageSystemAttributeValueJsonUnmarshaller();
        return instance;
    }
}
