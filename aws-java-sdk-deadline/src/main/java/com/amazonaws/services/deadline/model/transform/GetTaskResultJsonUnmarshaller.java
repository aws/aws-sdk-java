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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTaskResultJsonUnmarshaller implements Unmarshaller<GetTaskResult, JsonUnmarshallerContext> {

    public GetTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTaskResult getTaskResult = new GetTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTaskResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("failureRetryCount", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setFailureRetryCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("latestSessionActionId", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setLatestSessionActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setParameters(new MapUnmarshaller<String, TaskParameterValue>(context.getUnmarshaller(String.class),
                            TaskParameterValueJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("runStatus", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("targetRunStatus", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setTargetRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getTaskResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTaskResult;
    }

    private static GetTaskResultJsonUnmarshaller instance;

    public static GetTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTaskResultJsonUnmarshaller();
        return instance;
    }
}
