/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DetectMitigationActionsTaskSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMitigationActionsTaskSummaryJsonUnmarshaller implements Unmarshaller<DetectMitigationActionsTaskSummary, JsonUnmarshallerContext> {

    public DetectMitigationActionsTaskSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetectMitigationActionsTaskSummary detectMitigationActionsTaskSummary = new DetectMitigationActionsTaskSummary();

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
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStatus", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStartTime", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTaskStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("taskEndTime", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTaskEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTarget(DetectMitigationActionsTaskTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("violationEventOccurrenceRange", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setViolationEventOccurrenceRange(ViolationEventOccurrenceRangeJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("onlyActiveViolationsIncluded", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setOnlyActiveViolationsIncluded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("suppressedAlertsIncluded", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setSuppressedAlertsIncluded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("actionsDefinition", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setActionsDefinition(new ListUnmarshaller<MitigationAction>(MitigationActionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("taskStatistics", targetDepth)) {
                    context.nextToken();
                    detectMitigationActionsTaskSummary.setTaskStatistics(DetectMitigationActionsTaskStatisticsJsonUnmarshaller.getInstance()
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

        return detectMitigationActionsTaskSummary;
    }

    private static DetectMitigationActionsTaskSummaryJsonUnmarshaller instance;

    public static DetectMitigationActionsTaskSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectMitigationActionsTaskSummaryJsonUnmarshaller();
        return instance;
    }
}
