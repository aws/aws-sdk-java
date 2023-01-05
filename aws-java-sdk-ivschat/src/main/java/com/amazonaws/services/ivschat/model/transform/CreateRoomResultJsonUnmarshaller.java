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
package com.amazonaws.services.ivschat.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivschat.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateRoomResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoomResultJsonUnmarshaller implements Unmarshaller<CreateRoomResult, JsonUnmarshallerContext> {

    public CreateRoomResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRoomResult createRoomResult = new CreateRoomResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createRoomResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loggingConfigurationIdentifiers", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setLoggingConfigurationIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("maximumMessageLength", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setMaximumMessageLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maximumMessageRatePerSecond", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setMaximumMessageRatePerSecond(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("messageReviewHandler", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setMessageReviewHandler(MessageReviewHandlerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    createRoomResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createRoomResult;
    }

    private static CreateRoomResultJsonUnmarshaller instance;

    public static CreateRoomResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRoomResultJsonUnmarshaller();
        return instance;
    }
}
