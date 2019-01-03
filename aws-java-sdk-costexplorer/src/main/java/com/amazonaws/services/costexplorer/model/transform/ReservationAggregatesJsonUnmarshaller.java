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
 * ReservationAggregates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationAggregatesJsonUnmarshaller implements Unmarshaller<ReservationAggregates, JsonUnmarshallerContext> {

    public ReservationAggregates unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationAggregates reservationAggregates = new ReservationAggregates();

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
                if (context.testExpression("UtilizationPercentage", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setUtilizationPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UtilizationPercentageInUnits", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setUtilizationPercentageInUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PurchasedHours", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setPurchasedHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PurchasedUnits", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setPurchasedUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalActualHours", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setTotalActualHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalActualUnits", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setTotalActualUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnusedHours", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setUnusedHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnusedUnits", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setUnusedUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OnDemandCostOfRIHoursUsed", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setOnDemandCostOfRIHoursUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetRISavings", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setNetRISavings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalPotentialRISavings", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setTotalPotentialRISavings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmortizedUpfrontFee", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setAmortizedUpfrontFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmortizedRecurringFee", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setAmortizedRecurringFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalAmortizedFee", targetDepth)) {
                    context.nextToken();
                    reservationAggregates.setTotalAmortizedFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reservationAggregates;
    }

    private static ReservationAggregatesJsonUnmarshaller instance;

    public static ReservationAggregatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationAggregatesJsonUnmarshaller();
        return instance;
    }
}
