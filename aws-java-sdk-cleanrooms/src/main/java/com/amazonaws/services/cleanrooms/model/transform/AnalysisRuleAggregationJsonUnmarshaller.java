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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnalysisRuleAggregation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRuleAggregationJsonUnmarshaller implements Unmarshaller<AnalysisRuleAggregation, JsonUnmarshallerContext> {

    public AnalysisRuleAggregation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalysisRuleAggregation analysisRuleAggregation = new AnalysisRuleAggregation();

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
                if (context.testExpression("aggregateColumns", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setAggregateColumns(new ListUnmarshaller<AggregateColumn>(AggregateColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("joinColumns", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setJoinColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("joinRequired", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setJoinRequired(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowedJoinOperators", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setAllowedJoinOperators(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dimensionColumns", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setDimensionColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("scalarFunctions", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setScalarFunctions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputConstraints", targetDepth)) {
                    context.nextToken();
                    analysisRuleAggregation.setOutputConstraints(new ListUnmarshaller<AggregationConstraint>(AggregationConstraintJsonUnmarshaller
                            .getInstance())

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

        return analysisRuleAggregation;
    }

    private static AnalysisRuleAggregationJsonUnmarshaller instance;

    public static AnalysisRuleAggregationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisRuleAggregationJsonUnmarshaller();
        return instance;
    }
}
