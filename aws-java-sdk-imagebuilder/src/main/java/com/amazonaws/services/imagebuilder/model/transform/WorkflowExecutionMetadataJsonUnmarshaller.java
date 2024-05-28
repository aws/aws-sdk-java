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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowExecutionMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionMetadataJsonUnmarshaller implements Unmarshaller<WorkflowExecutionMetadata, JsonUnmarshallerContext> {

    public WorkflowExecutionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowExecutionMetadata workflowExecutionMetadata = new WorkflowExecutionMetadata();

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
                if (context.testExpression("workflowBuildVersionArn", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setWorkflowBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionId", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setWorkflowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalStepCount", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setTotalStepCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSucceeded", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setTotalStepsSucceeded(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsFailed", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setTotalStepsFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSkipped", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setTotalStepsSkipped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parallelGroup", targetDepth)) {
                    context.nextToken();
                    workflowExecutionMetadata.setParallelGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowExecutionMetadata;
    }

    private static WorkflowExecutionMetadataJsonUnmarshaller instance;

    public static WorkflowExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
