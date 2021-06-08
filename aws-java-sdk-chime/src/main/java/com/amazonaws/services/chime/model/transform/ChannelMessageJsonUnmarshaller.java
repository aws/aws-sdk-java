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
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChannelMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelMessageJsonUnmarshaller implements Unmarshaller<ChannelMessage, JsonUnmarshallerContext> {

    public ChannelMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChannelMessage channelMessage = new ChannelMessage();

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
                if (context.testExpression("ChannelArn", targetDepth)) {
                    context.nextToken();
                    channelMessage.setChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageId", targetDepth)) {
                    context.nextToken();
                    channelMessage.setMessageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    channelMessage.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    context.nextToken();
                    channelMessage.setMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    channelMessage.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessage.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastEditedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessage.setLastEditedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    channelMessage.setLastUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Sender", targetDepth)) {
                    context.nextToken();
                    channelMessage.setSender(IdentityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redacted", targetDepth)) {
                    context.nextToken();
                    channelMessage.setRedacted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Persistence", targetDepth)) {
                    context.nextToken();
                    channelMessage.setPersistence(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return channelMessage;
    }

    private static ChannelMessageJsonUnmarshaller instance;

    public static ChannelMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelMessageJsonUnmarshaller();
        return instance;
    }
}
