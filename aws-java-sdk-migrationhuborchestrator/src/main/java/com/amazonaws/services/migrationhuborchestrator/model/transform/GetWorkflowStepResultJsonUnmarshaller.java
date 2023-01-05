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
 * GetWorkflowStepResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepResultJsonUnmarshaller implements Unmarshaller<GetWorkflowStepResult, JsonUnmarshallerContext> {

    public GetWorkflowStepResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowStepResult getWorkflowStepResult = new GetWorkflowStepResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowStepResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepGroupId", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStepGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowId", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepId", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStepId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepActionType", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStepActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowStepAutomationConfiguration", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setWorkflowStepAutomationConfiguration(WorkflowStepAutomationConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("stepTarget", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStepTarget(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setOutputs(new ListUnmarshaller<WorkflowStepOutput>(WorkflowStepOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("previous", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setPrevious(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("next", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setNext(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptOutputLocation", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setScriptOutputLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastStartTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setLastStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("noOfSrvCompleted", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setNoOfSrvCompleted(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("noOfSrvFailed", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setNoOfSrvFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalNoOfSrv", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepResult.setTotalNoOfSrv(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWorkflowStepResult;
    }

    private static GetWorkflowStepResultJsonUnmarshaller instance;

    public static GetWorkflowStepResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowStepResultJsonUnmarshaller();
        return instance;
    }
}
