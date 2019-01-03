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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservationPurchaseRecommendationDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendationDetailJsonUnmarshaller implements Unmarshaller<ReservationPurchaseRecommendationDetail, JsonUnmarshallerContext> {

    public ReservationPurchaseRecommendationDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationPurchaseRecommendationDetail reservationPurchaseRecommendationDetail = new ReservationPurchaseRecommendationDetail();

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
                if (context.testExpression("AccountId", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceDetails", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setInstanceDetails(InstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecommendedNumberOfInstancesToPurchase", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail
                            .setRecommendedNumberOfInstancesToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendedNormalizedUnitsToPurchase", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setRecommendedNormalizedUnitsToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinimumNumberOfInstancesUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setMinimumNumberOfInstancesUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinimumNormalizedUnitsUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setMinimumNormalizedUnitsUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumNumberOfInstancesUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setMaximumNumberOfInstancesUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumNormalizedUnitsUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setMaximumNormalizedUnitsUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AverageNumberOfInstancesUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setAverageNumberOfInstancesUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AverageNormalizedUnitsUsedPerHour", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setAverageNormalizedUnitsUsedPerHour(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AverageUtilization", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setAverageUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedBreakEvenInMonths", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setEstimatedBreakEvenInMonths(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsPercentage", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setEstimatedMonthlySavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlyOnDemandCost", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setEstimatedMonthlyOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedReservationCostForLookbackPeriod", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setEstimatedReservationCostForLookbackPeriod(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("UpfrontCost", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecurringStandardMonthlyCost", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendationDetail.setRecurringStandardMonthlyCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reservationPurchaseRecommendationDetail;
    }

    private static ReservationPurchaseRecommendationDetailJsonUnmarshaller instance;

    public static ReservationPurchaseRecommendationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationDetailJsonUnmarshaller();
        return instance;
    }
}
