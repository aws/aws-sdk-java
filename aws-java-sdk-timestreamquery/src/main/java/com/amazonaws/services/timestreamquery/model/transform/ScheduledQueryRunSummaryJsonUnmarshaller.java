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
package com.amazonaws.services.timestreamquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduledQueryRunSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQueryRunSummaryJsonUnmarshaller implements Unmarshaller<ScheduledQueryRunSummary, JsonUnmarshallerContext> {

    public ScheduledQueryRunSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduledQueryRunSummary scheduledQueryRunSummary = new ScheduledQueryRunSummary();

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
                if (context.testExpression("InvocationTime", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TriggerTime", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setTriggerTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RunStatus", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStats", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setExecutionStats(ExecutionStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorReportLocation", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setErrorReportLocation(ErrorReportLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    scheduledQueryRunSummary.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduledQueryRunSummary;
    }

    private static ScheduledQueryRunSummaryJsonUnmarshaller instance;

    public static ScheduledQueryRunSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledQueryRunSummaryJsonUnmarshaller();
        return instance;
    }
}
