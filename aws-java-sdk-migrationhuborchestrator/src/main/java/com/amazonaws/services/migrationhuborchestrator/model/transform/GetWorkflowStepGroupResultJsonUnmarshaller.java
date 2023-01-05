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
 * GetWorkflowStepGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepGroupResultJsonUnmarshaller implements Unmarshaller<GetWorkflowStepGroupResult, JsonUnmarshallerContext> {

    public GetWorkflowStepGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowStepGroupResult getWorkflowStepGroupResult = new GetWorkflowStepGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowStepGroupResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowId", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tools", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setTools(new ListUnmarshaller<Tool>(ToolJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("previous", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setPrevious(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("next", targetDepth)) {
                    context.nextToken();
                    getWorkflowStepGroupResult.setNext(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWorkflowStepGroupResult;
    }

    private static GetWorkflowStepGroupResultJsonUnmarshaller instance;

    public static GetWorkflowStepGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowStepGroupResultJsonUnmarshaller();
        return instance;
    }
}
