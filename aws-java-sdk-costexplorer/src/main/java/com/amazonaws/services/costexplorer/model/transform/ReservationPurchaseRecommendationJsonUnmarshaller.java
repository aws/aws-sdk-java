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
 * ReservationPurchaseRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPurchaseRecommendationJsonUnmarshaller implements Unmarshaller<ReservationPurchaseRecommendation, JsonUnmarshallerContext> {

    public ReservationPurchaseRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationPurchaseRecommendation reservationPurchaseRecommendation = new ReservationPurchaseRecommendation();

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
                    reservationPurchaseRecommendation.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LookbackPeriodInDays", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setLookbackPeriodInDays(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TermInYears", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setTermInYears(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceSpecification", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setServiceSpecification(ServiceSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecommendationDetails", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setRecommendationDetails(new ListUnmarshaller<ReservationPurchaseRecommendationDetail>(
                            ReservationPurchaseRecommendationDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RecommendationSummary", targetDepth)) {
                    context.nextToken();
                    reservationPurchaseRecommendation.setRecommendationSummary(ReservationPurchaseRecommendationSummaryJsonUnmarshaller.getInstance()
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

        return reservationPurchaseRecommendation;
    }

    private static ReservationPurchaseRecommendationJsonUnmarshaller instance;

    public static ReservationPurchaseRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationJsonUnmarshaller();
        return instance;
    }
}
