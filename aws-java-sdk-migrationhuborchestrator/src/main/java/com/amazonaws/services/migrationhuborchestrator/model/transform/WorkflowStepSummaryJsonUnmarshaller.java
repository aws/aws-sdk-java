/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowStepSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepSummaryJsonUnmarshaller implements Unmarshaller<WorkflowStepSummary, JsonUnmarshallerContext> {

    public WorkflowStepSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowStepSummary workflowStepSummary = new WorkflowStepSummary();

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
                if (context.testExpression("stepId", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setStepId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepActionType", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setStepActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previous", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setPrevious(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("next", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setNext(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("noOfSrvCompleted", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setNoOfSrvCompleted(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("noOfSrvFailed", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setNoOfSrvFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalNoOfSrv", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setTotalNoOfSrv(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptLocation", targetDepth)) {
                    context.nextToken();
                    workflowStepSummary.setScriptLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workflowStepSummary;
    }

    private static WorkflowStepSummaryJsonUnmarshaller instance;

    public static WorkflowStepSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowStepSummaryJsonUnmarshaller();
        return instance;
    }
}
