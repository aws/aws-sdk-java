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
package com.amazonaws.services.eventbridge.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeReplayResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplayResultJsonUnmarshaller implements Unmarshaller<DescribeReplayResult, JsonUnmarshallerContext> {

    public DescribeReplayResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeReplayResult describeReplayResult = new DescribeReplayResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeReplayResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ReplayName", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setReplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplayArn", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setReplayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setDestination(ReplayDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventStartTime", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setEventStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EventEndTime", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setEventEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EventLastReplayedTime", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setEventLastReplayedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplayStartTime", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setReplayStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplayEndTime", targetDepth)) {
                    context.nextToken();
                    describeReplayResult.setReplayEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeReplayResult;
    }

    private static DescribeReplayResultJsonUnmarshaller instance;

    public static DescribeReplayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeReplayResultJsonUnmarshaller();
        return instance;
    }
}
