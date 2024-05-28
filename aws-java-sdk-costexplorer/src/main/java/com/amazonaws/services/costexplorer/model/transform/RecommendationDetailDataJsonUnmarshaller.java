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
 * RecommendationDetailData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDetailDataJsonUnmarshaller implements Unmarshaller<RecommendationDetailData, JsonUnmarshallerContext> {

    public RecommendationDetailData unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationDetailData recommendationDetailData = new RecommendationDetailData();

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
                if (context.testExpression("AccountScope", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setLookbackPeriodInDays(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SavingsPlansType", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setSavingsPlansType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TermInYears", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setTermInYears(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceFamily", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OfferingId", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationTimestamp", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setGenerationTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestUsageTimestamp", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setLatestUsageTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setCurrentAverageHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMaximumHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setCurrentMaximumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMinimumHourlyOnDemandSpend", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setCurrentMinimumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageUtilization", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedAverageUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCost", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCostWithCurrentCommitment", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedOnDemandCostWithCurrentCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedROI", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedROI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSPCost", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedSPCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsAmount", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedSavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsPercentage", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedSavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExistingHourlyCommitment", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setExistingHourlyCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HourlyCommitmentToPurchase", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setHourlyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpfrontCost", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageCoverage", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setCurrentAverageCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageCoverage", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setEstimatedAverageCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricsOverLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    recommendationDetailData.setMetricsOverLookbackPeriod(new ListUnmarshaller<RecommendationDetailHourlyMetrics>(
                            RecommendationDetailHourlyMetricsJsonUnmarshaller.getInstance())

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

        return recommendationDetailData;
    }

    private static RecommendationDetailDataJsonUnmarshaller instance;

    public static RecommendationDetailDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationDetailDataJsonUnmarshaller();
        return instance;
    }
}
