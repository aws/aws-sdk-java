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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommendationDetailHourlyMetrics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDetailHourlyMetricsJsonUnmarshaller implements Unmarshaller<RecommendationDetailHourlyMetrics, JsonUnmarshallerContext> {

    public RecommendationDetailHourlyMetrics unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationDetailHourlyMetrics recommendationDetailHourlyMetrics = new RecommendationDetailHourlyMetrics();

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
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    recommendationDetailHourlyMetrics.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCost", targetDepth)) {
                    context.nextToken();
                    recommendationDetailHourlyMetrics.setEstimatedOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentCoverage", targetDepth)) {
                    context.nextToken();
                    recommendationDetailHourlyMetrics.setCurrentCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedCoverage", targetDepth)) {
                    context.nextToken();
                    recommendationDetailHourlyMetrics.setEstimatedCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedNewCommitmentUtilization", targetDepth)) {
                    context.nextToken();
                    recommendationDetailHourlyMetrics.setEstimatedNewCommitmentUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendationDetailHourlyMetrics;
    }

    private static RecommendationDetailHourlyMetricsJsonUnmarshaller instance;

    public static RecommendationDetailHourlyMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationDetailHourlyMetricsJsonUnmarshaller();
        return instance;
    }
}
