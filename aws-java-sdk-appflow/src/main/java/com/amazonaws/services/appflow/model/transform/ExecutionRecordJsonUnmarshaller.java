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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExecutionRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionRecordJsonUnmarshaller implements Unmarshaller<ExecutionRecord, JsonUnmarshallerContext> {

    public ExecutionRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExecutionRecord executionRecord = new ExecutionRecord();

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
                if (context.testExpression("executionId", targetDepth)) {
                    context.nextToken();
                    executionRecord.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionStatus", targetDepth)) {
                    context.nextToken();
                    executionRecord.setExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionResult", targetDepth)) {
                    context.nextToken();
                    executionRecord.setExecutionResult(ExecutionResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    executionRecord.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    executionRecord.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataPullStartTime", targetDepth)) {
                    context.nextToken();
                    executionRecord.setDataPullStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataPullEndTime", targetDepth)) {
                    context.nextToken();
                    executionRecord.setDataPullEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return executionRecord;
    }

    private static ExecutionRecordJsonUnmarshaller instance;

    public static ExecutionRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExecutionRecordJsonUnmarshaller();
        return instance;
    }
}
