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
package com.amazonaws.services.costoptimizationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Recommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJsonUnmarshaller implements Unmarshaller<Recommendation, JsonUnmarshallerContext> {

    public Recommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Recommendation recommendation = new Recommendation();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    recommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionType", targetDepth)) {
                    context.nextToken();
                    recommendation.setActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currencyCode", targetDepth)) {
                    context.nextToken();
                    recommendation.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentResourceSummary", targetDepth)) {
                    context.nextToken();
                    recommendation.setCurrentResourceSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentResourceType", targetDepth)) {
                    context.nextToken();
                    recommendation.setCurrentResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("estimatedMonthlyCost", targetDepth)) {
                    context.nextToken();
                    recommendation.setEstimatedMonthlyCost(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("estimatedMonthlySavings", targetDepth)) {
                    context.nextToken();
                    recommendation.setEstimatedMonthlySavings(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("estimatedSavingsPercentage", targetDepth)) {
                    context.nextToken();
                    recommendation.setEstimatedSavingsPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("implementationEffort", targetDepth)) {
                    context.nextToken();
                    recommendation.setImplementationEffort(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    recommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("recommendationId", targetDepth)) {
                    context.nextToken();
                    recommendation.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationLookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    recommendation.setRecommendationLookbackPeriodInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("recommendedResourceSummary", targetDepth)) {
                    context.nextToken();
                    recommendation.setRecommendedResourceSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendedResourceType", targetDepth)) {
                    context.nextToken();
                    recommendation.setRecommendedResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    recommendation.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceArn", targetDepth)) {
                    context.nextToken();
                    recommendation.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    recommendation.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("restartNeeded", targetDepth)) {
                    context.nextToken();
                    recommendation.setRestartNeeded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rollbackPossible", targetDepth)) {
                    context.nextToken();
                    recommendation.setRollbackPossible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    recommendation.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    recommendation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return recommendation;
    }

    private static RecommendationJsonUnmarshaller instance;

    public static RecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationJsonUnmarshaller();
        return instance;
    }
}
