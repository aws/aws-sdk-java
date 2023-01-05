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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExecutorsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutorsSummaryJsonUnmarshaller implements Unmarshaller<ExecutorsSummary, JsonUnmarshallerContext> {

    public ExecutorsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExecutorsSummary executorsSummary = new ExecutorsSummary();

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
                if (context.testExpression("ExecutorId", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setExecutorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutorType", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setExecutorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setStartDateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TerminationDateTime", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setTerminationDateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ExecutorState", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setExecutorState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutorSize", targetDepth)) {
                    context.nextToken();
                    executorsSummary.setExecutorSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return executorsSummary;
    }

    private static ExecutorsSummaryJsonUnmarshaller instance;

    public static ExecutorsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExecutorsSummaryJsonUnmarshaller();
        return instance;
    }
}
