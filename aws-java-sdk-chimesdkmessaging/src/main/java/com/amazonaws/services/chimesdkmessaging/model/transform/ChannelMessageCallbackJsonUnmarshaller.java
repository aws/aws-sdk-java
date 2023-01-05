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
package com.amazonaws.services.chimesdkmessaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChannelMessageCallback JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessageCallbackJsonUnmarshaller implements Unmarshaller<ChannelMessageCallback, JsonUnmarshallerContext> {

    public ChannelMessageCallback unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChannelMessageCallback channelMessageCallback = new ChannelMessageCallback();

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
                if (context.testExpression("MessageId", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PushNotification", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setPushNotification(PushNotificationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MessageAttributes", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setMessageAttributes(new MapUnmarshaller<String, MessageAttributeValue>(context.getUnmarshaller(String.class),
                            MessageAttributeValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SubChannelId", targetDepth)) {
                    context.nextToken();
                    channelMessageCallback.setSubChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return channelMessageCallback;
    }

    private static ChannelMessageCallbackJsonUnmarshaller instance;

    public static ChannelMessageCallbackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageCallbackJsonUnmarshaller();
        return instance;
    }
}
