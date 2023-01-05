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
 * MapRunItemCounts JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MapRunItemCountsJsonUnmarshaller implements Unmarshaller<MapRunItemCounts, JsonUnmarshallerContext> {

    public MapRunItemCounts unmarshall(JsonUnmarshallerContext context) throws Exception {
        MapRunItemCounts mapRunItemCounts = new MapRunItemCounts();

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
                    mapRunItemCounts.setPending(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("running", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setRunning(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("succeeded", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setSucceeded(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("failed", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setFailed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("timedOut", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setTimedOut(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("aborted", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setAborted(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("total", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setTotal(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("resultsWritten", targetDepth)) {
                    context.nextToken();
                    mapRunItemCounts.setResultsWritten(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mapRunItemCounts;
    }

    private static MapRunItemCountsJsonUnmarshaller instance;

    public static MapRunItemCountsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MapRunItemCountsJsonUnmarshaller();
        return instance;
    }
}
