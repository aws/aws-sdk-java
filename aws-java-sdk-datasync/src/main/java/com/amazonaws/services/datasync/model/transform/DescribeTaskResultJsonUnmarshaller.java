/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskResultJsonUnmarshaller implements Unmarshaller<DescribeTaskResult, JsonUnmarshallerContext> {

    public DescribeTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTaskResult describeTaskResult = new DescribeTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TaskArn", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentTaskExecutionArn", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setCurrentTaskExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLocationArn", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setSourceLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationLocationArn", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setDestinationLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogGroupArn", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setCloudWatchLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Options", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setOptions(OptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorDetail", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setErrorDetail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeTaskResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTaskResult;
    }

    private static DescribeTaskResultJsonUnmarshaller instance;

    public static DescribeTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTaskResultJsonUnmarshaller();
        return instance;
    }
}
