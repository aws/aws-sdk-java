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

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomationExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecutionJsonUnmarshaller implements Unmarshaller<AutomationExecution, JsonUnmarshallerContext> {

    public AutomationExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationExecution automationExecution = new AutomationExecution();

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
                if (context.testExpression("AutomationExecutionId", targetDepth)) {
                    context.nextToken();
                    automationExecution.setAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    context.nextToken();
                    automationExecution.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    context.nextToken();
                    automationExecution.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartTime", targetDepth)) {
                    context.nextToken();
                    automationExecution.setExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionEndTime", targetDepth)) {
                    context.nextToken();
                    automationExecution.setExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AutomationExecutionStatus", targetDepth)) {
                    context.nextToken();
                    automationExecution.setAutomationExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StepExecutions", targetDepth)) {
                    context.nextToken();
                    automationExecution.setStepExecutions(new ListUnmarshaller<StepExecution>(StepExecutionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("StepExecutionsTruncated", targetDepth)) {
                    context.nextToken();
                    automationExecution.setStepExecutionsTruncated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    automationExecution.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    context.nextToken();
                    automationExecution.setOutputs(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    context.nextToken();
                    automationExecution.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    context.nextToken();
                    automationExecution.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentAutomationExecutionId", targetDepth)) {
                    context.nextToken();
                    automationExecution.setParentAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutedBy", targetDepth)) {
                    context.nextToken();
                    automationExecution.setExecutedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentStepName", targetDepth)) {
                    context.nextToken();
                    automationExecution.setCurrentStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAction", targetDepth)) {
                    context.nextToken();
                    automationExecution.setCurrentAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetParameterName", targetDepth)) {
                    context.nextToken();
                    automationExecution.setTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    context.nextToken();
                    automationExecution.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("TargetMaps", targetDepth)) {
                    context.nextToken();
                    automationExecution.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                            new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class), new ListUnmarshaller<String>(context
                                    .getUnmarshaller(String.class)))).unmarshall(context));
                }
                if (context.testExpression("ResolvedTargets", targetDepth)) {
                    context.nextToken();
                    automationExecution.setResolvedTargets(ResolvedTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    context.nextToken();
                    automationExecution.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    context.nextToken();
                    automationExecution.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    context.nextToken();
                    automationExecution.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLocations", targetDepth)) {
                    context.nextToken();
                    automationExecution.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("ProgressCounters", targetDepth)) {
                    context.nextToken();
                    automationExecution.setProgressCounters(ProgressCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return automationExecution;
    }

    private static AutomationExecutionJsonUnmarshaller instance;

    public static AutomationExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionJsonUnmarshaller();
        return instance;
    }
}
