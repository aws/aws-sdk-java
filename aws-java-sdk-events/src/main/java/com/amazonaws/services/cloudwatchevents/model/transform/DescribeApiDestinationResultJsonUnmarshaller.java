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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeApiDestinationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApiDestinationResultJsonUnmarshaller implements Unmarshaller<DescribeApiDestinationResult, JsonUnmarshallerContext> {

    public DescribeApiDestinationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeApiDestinationResult describeApiDestinationResult = new DescribeApiDestinationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeApiDestinationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApiDestinationArn", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setApiDestinationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiDestinationState", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setApiDestinationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionArn", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setConnectionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationEndpoint", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setInvocationEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HttpMethod", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationRateLimitPerSecond", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setInvocationRateLimitPerSecond(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeApiDestinationResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeApiDestinationResult;
    }

    private static DescribeApiDestinationResultJsonUnmarshaller instance;

    public static DescribeApiDestinationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeApiDestinationResultJsonUnmarshaller();
        return instance;
    }
}
