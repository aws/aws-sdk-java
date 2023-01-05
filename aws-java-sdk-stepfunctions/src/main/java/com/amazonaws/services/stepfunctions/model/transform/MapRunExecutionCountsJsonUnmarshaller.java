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
package com.amazonaws.services.stepfunctions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MapRunExecutionCounts JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapRunExecutionCountsJsonUnmarshaller implements Unmarshaller<MapRunExecutionCounts, JsonUnmarshallerContext> {

    public MapRunExecutionCounts unmarshall(JsonUnmarshallerContext context) throws Exception {
        MapRunExecutionCounts mapRunExecutionCounts = new MapRunExecutionCounts();

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
                if (context.testExpression("pending", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setPending(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("running", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setRunning(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("succeeded", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setSucceeded(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("failed", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setFailed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("timedOut", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setTimedOut(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("aborted", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setAborted(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("total", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setTotal(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("resultsWritten", targetDepth)) {
                    context.nextToken();
                    mapRunExecutionCounts.setResultsWritten(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mapRunExecutionCounts;
    }

    private static MapRunExecutionCountsJsonUnmarshaller instance;

    public static MapRunExecutionCountsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MapRunExecutionCountsJsonUnmarshaller();
        return instance;
    }
}
