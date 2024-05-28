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
 * GetStepResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStepResultJsonUnmarshaller implements Unmarshaller<GetStepResult, JsonUnmarshallerContext> {

    public GetStepResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetStepResult getStepResult = new GetStepResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getStepResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getStepResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getStepResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dependencyCounts", targetDepth)) {
                    context.nextToken();
                    getStepResult.setDependencyCounts(DependencyCountsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getStepResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    context.nextToken();
                    getStepResult.setEndedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lifecycleStatus", targetDepth)) {
                    context.nextToken();
                    getStepResult.setLifecycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifecycleStatusMessage", targetDepth)) {
                    context.nextToken();
                    getStepResult.setLifecycleStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getStepResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameterSpace", targetDepth)) {
                    context.nextToken();
                    getStepResult.setParameterSpace(ParameterSpaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("requiredCapabilities", targetDepth)) {
                    context.nextToken();
                    getStepResult.setRequiredCapabilities(StepRequiredCapabilitiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    getStepResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("stepId", targetDepth)) {
                    context.nextToken();
                    getStepResult.setStepId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetTaskRunStatus", targetDepth)) {
                    context.nextToken();
                    getStepResult.setTargetTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatus", targetDepth)) {
                    context.nextToken();
                    getStepResult.setTaskRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskRunStatusCounts", targetDepth)) {
                    context.nextToken();
                    getStepResult.setTaskRunStatusCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getStepResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getStepResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getStepResult;
    }

    private static GetStepResultJsonUnmarshaller instance;

    public static GetStepResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetStepResultJsonUnmarshaller();
        return instance;
    }
}
