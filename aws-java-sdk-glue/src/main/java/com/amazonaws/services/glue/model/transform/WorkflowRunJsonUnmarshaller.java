/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowRunJsonUnmarshaller implements Unmarshaller<WorkflowRun, JsonUnmarshallerContext> {

    public WorkflowRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowRun workflowRun = new WorkflowRun();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    workflowRun.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkflowRunId", targetDepth)) {
                    context.nextToken();
                    workflowRun.setWorkflowRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WorkflowRunProperties", targetDepth)) {
                    context.nextToken();
                    workflowRun.setWorkflowRunProperties(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    context.nextToken();
                    workflowRun.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    context.nextToken();
                    workflowRun.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    workflowRun.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    context.nextToken();
                    workflowRun.setStatistics(WorkflowRunStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Graph", targetDepth)) {
                    context.nextToken();
                    workflowRun.setGraph(WorkflowGraphJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowRun;
    }

    private static WorkflowRunJsonUnmarshaller instance;

    public static WorkflowRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowRunJsonUnmarshaller();
        return instance;
    }
}
