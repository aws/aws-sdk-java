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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FieldStats JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldStatsJsonUnmarshaller implements Unmarshaller<FieldStats, JsonUnmarshallerContext> {

    public FieldStats unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldStats fieldStats = new FieldStats();

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
                if (context.testExpression("min", targetDepth)) {
                    context.nextToken();
                    fieldStats.setMin(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("max", targetDepth)) {
                    context.nextToken();
                    fieldStats.setMax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("count", targetDepth)) {
                    context.nextToken();
                    fieldStats.setCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("missing", targetDepth)) {
                    context.nextToken();
                    fieldStats.setMissing(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sum", targetDepth)) {
                    context.nextToken();
                    fieldStats.setSum(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("sumOfSquares", targetDepth)) {
                    context.nextToken();
                    fieldStats.setSumOfSquares(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("mean", targetDepth)) {
                    context.nextToken();
                    fieldStats.setMean(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stddev", targetDepth)) {
                    context.nextToken();
                    fieldStats.setStddev(context.getUnmarshaller(Double.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fieldStats;
    }

    private static FieldStatsJsonUnmarshaller instance;

    public static FieldStatsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldStatsJsonUnmarshaller();
        return instance;
    }
}
