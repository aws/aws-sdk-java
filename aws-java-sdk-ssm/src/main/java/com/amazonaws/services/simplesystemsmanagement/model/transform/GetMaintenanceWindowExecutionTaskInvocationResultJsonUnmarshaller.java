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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMaintenanceWindowExecutionTaskInvocationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller implements
        Unmarshaller<GetMaintenanceWindowExecutionTaskInvocationResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowExecutionTaskInvocationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocationResult = new GetMaintenanceWindowExecutionTaskInvocationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMaintenanceWindowExecutionTaskInvocationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("WindowExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setWindowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setTaskExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setInvocationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskType", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult
                            .setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OwnerInformation", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setOwnerInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowTargetId", targetDepth)) {
                    context.nextToken();
                    getMaintenanceWindowExecutionTaskInvocationResult.setWindowTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMaintenanceWindowExecutionTaskInvocationResult;
    }

    private static GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller();
        return instance;
    }
}
