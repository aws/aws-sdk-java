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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowExecutionInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionInfoJsonUnmarshaller implements Unmarshaller<WorkflowExecutionInfo, JsonUnmarshallerContext> {

    public WorkflowExecutionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowExecutionInfo workflowExecutionInfo = new WorkflowExecutionInfo();

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
                if (context.testExpression("execution", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setExecution(WorkflowExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("workflowType", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setWorkflowType(WorkflowTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startTimestamp", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("closeTimestamp", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setCloseTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("executionStatus", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("closeStatus", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setCloseStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parent", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setParent(WorkflowExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tagList", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setTagList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("cancelRequested", targetDepth)) {
                    context.nextToken();
                    workflowExecutionInfo.setCancelRequested(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowExecutionInfo;
    }

    private static WorkflowExecutionInfoJsonUnmarshaller instance;

    public static WorkflowExecutionInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowExecutionInfoJsonUnmarshaller();
        return instance;
    }
}
