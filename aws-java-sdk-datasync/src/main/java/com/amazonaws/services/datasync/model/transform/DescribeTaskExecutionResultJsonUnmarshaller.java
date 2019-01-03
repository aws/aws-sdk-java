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
 * DescribeTaskExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskExecutionResultJsonUnmarshaller implements Unmarshaller<DescribeTaskExecutionResult, JsonUnmarshallerContext> {

    public DescribeTaskExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTaskExecutionResult describeTaskExecutionResult = new DescribeTaskExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTaskExecutionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TaskExecutionArn", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setTaskExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Options", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setOptions(OptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EstimatedFilesToTransfer", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setEstimatedFilesToTransfer(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedBytesToTransfer", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setEstimatedBytesToTransfer(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FilesTransferred", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setFilesTransferred(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BytesWritten", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setBytesWritten(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BytesTransferred", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setBytesTransferred(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    context.nextToken();
                    describeTaskExecutionResult.setResult(TaskExecutionResultDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTaskExecutionResult;
    }

    private static DescribeTaskExecutionResultJsonUnmarshaller instance;

    public static DescribeTaskExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTaskExecutionResultJsonUnmarshaller();
        return instance;
    }
}
