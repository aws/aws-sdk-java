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
 * GetRecommendationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationResultJsonUnmarshaller implements Unmarshaller<GetRecommendationResult, JsonUnmarshallerContext> {

    public GetRecommendationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecommendationResult getRecommendationResult = new GetRecommendationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRecommendationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionType", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("costCalculationLookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setCostCalculationLookbackPeriodInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("currencyCode", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentResourceDetails", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setCurrentResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("currentResourceType", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setCurrentResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("estimatedMonthlyCost", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setEstimatedMonthlyCost(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("estimatedMonthlySavings", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setEstimatedMonthlySavings(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("estimatedSavingsOverCostCalculationLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setEstimatedSavingsOverCostCalculationLookbackPeriod(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("estimatedSavingsPercentage", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setEstimatedSavingsPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("implementationEffort", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setImplementationEffort(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("recommendationId", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRecommendationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationLookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRecommendationLookbackPeriodInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("recommendedResourceDetails", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRecommendedResourceDetails(ResourceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recommendedResourceType", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRecommendedResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceArn", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("restartNeeded", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRestartNeeded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rollbackPossible", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setRollbackPossible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getRecommendationResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return getRecommendationResult;
    }

    private static GetRecommendationResultJsonUnmarshaller instance;

    public static GetRecommendationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecommendationResultJsonUnmarshaller();
        return instance;
    }
}
