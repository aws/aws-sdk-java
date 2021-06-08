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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaFunctionRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionRecommendationJsonUnmarshaller implements Unmarshaller<LambdaFunctionRecommendation, JsonUnmarshallerContext> {

    public LambdaFunctionRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaFunctionRecommendation lambdaFunctionRecommendation = new LambdaFunctionRecommendation();

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
                if (context.testExpression("functionArn", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("functionVersion", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setFunctionVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentMemorySize", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setCurrentMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberOfInvocations", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setNumberOfInvocations(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setUtilizationMetrics(new ListUnmarshaller<LambdaFunctionUtilizationMetric>(
                            LambdaFunctionUtilizationMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setLookbackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("finding", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingReasonCodes", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setFindingReasonCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("memorySizeRecommendationOptions", targetDepth)) {
                    context.nextToken();
                    lambdaFunctionRecommendation.setMemorySizeRecommendationOptions(new ListUnmarshaller<LambdaFunctionMemoryRecommendationOption>(
                            LambdaFunctionMemoryRecommendationOptionJsonUnmarshaller.getInstance())

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

        return lambdaFunctionRecommendation;
    }

    private static LambdaFunctionRecommendationJsonUnmarshaller instance;

    public static LambdaFunctionRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionRecommendationJsonUnmarshaller();
        return instance;
    }
}
