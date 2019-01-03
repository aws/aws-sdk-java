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
 * StepExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepExecutionJsonUnmarshaller implements Unmarshaller<StepExecution, JsonUnmarshallerContext> {

    public StepExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        StepExecution stepExecution = new StepExecution();

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
                if (context.testExpression("StepName", targetDepth)) {
                    context.nextToken();
                    stepExecution.setStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    stepExecution.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    stepExecution.setTimeoutSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("OnFailure", targetDepth)) {
                    context.nextToken();
                    stepExecution.setOnFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxAttempts", targetDepth)) {
                    context.nextToken();
                    stepExecution.setMaxAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartTime", targetDepth)) {
                    context.nextToken();
                    stepExecution.setExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionEndTime", targetDepth)) {
                    context.nextToken();
                    stepExecution.setExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StepStatus", targetDepth)) {
                    context.nextToken();
                    stepExecution.setStepStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResponseCode", targetDepth)) {
                    context.nextToken();
                    stepExecution.setResponseCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Inputs", targetDepth)) {
                    context.nextToken();
                    stepExecution.setInputs(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    context.nextToken();
                    stepExecution.setOutputs(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("Response", targetDepth)) {
                    context.nextToken();
                    stepExecution.setResponse(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    context.nextToken();
                    stepExecution.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    context.nextToken();
                    stepExecution.setFailureDetails(FailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StepExecutionId", targetDepth)) {
                    context.nextToken();
                    stepExecution.setStepExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverriddenParameters", targetDepth)) {
                    context.nextToken();
                    stepExecution.setOverriddenParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("IsEnd", targetDepth)) {
                    context.nextToken();
                    stepExecution.setIsEnd(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NextStep", targetDepth)) {
                    context.nextToken();
                    stepExecution.setNextStep(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsCritical", targetDepth)) {
                    context.nextToken();
                    stepExecution.setIsCritical(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ValidNextSteps", targetDepth)) {
                    context.nextToken();
                    stepExecution.setValidNextSteps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    stepExecution.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TargetLocation", targetDepth)) {
                    context.nextToken();
                    stepExecution.setTargetLocation(TargetLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stepExecution;
    }

    private static StepExecutionJsonUnmarshaller instance;

    public static StepExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepExecutionJsonUnmarshaller();
        return instance;
    }
}
