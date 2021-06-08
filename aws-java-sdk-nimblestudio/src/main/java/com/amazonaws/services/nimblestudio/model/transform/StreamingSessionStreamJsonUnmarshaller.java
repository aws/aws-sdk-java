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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StreamingSessionStream JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionStreamJsonUnmarshaller implements Unmarshaller<StreamingSessionStream, JsonUnmarshallerContext> {

    public StreamingSessionStream unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamingSessionStream streamingSessionStream = new StreamingSessionStream();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiresAt", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setExpiresAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamId", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setStreamId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    streamingSessionStream.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return streamingSessionStream;
    }

    private static StreamingSessionStreamJsonUnmarshaller instance;

    public static StreamingSessionStreamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingSessionStreamJsonUnmarshaller();
        return instance;
    }
}
