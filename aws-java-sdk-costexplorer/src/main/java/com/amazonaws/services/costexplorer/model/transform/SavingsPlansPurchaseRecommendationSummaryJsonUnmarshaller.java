/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * SavingsPlansPurchaseRecommendationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendationSummary, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary = new SavingsPlansPurchaseRecommendationSummary();

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
                if (context.testExpression("EstimatedROI", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedROI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedTotalCost", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedTotalCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setCurrentOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedSavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalRecommendationCount", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setTotalRecommendationCount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DailyCommitmentToPurchase", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setDailyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HourlyCommitmentToPurchase", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setHourlyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsPercentage", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedSavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCostWithCurrentCommitment", targetDepth)) {
                    context.nextToken();
                    savingsPlansPurchaseRecommendationSummary.setEstimatedOnDemandCostWithCurrentCommitment(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return savingsPlansPurchaseRecommendationSummary;
    }

    private static SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller();
        return instance;
    }
}
