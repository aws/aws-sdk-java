/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservedInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceJsonUnmarshaller implements Unmarshaller<ReservedInstance, JsonUnmarshallerContext> {

    public ReservedInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservedInstance reservedInstance = new ReservedInstance();

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
                if (context.testExpression("ReservationName", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setReservationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReservedInstanceId", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setReservedInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BillingSubscriptionId", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setBillingSubscriptionId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ReservedInstanceOfferingId", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setReservedInstanceOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setFixedPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("UsagePrice", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setUsagePrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecurringCharges", targetDepth)) {
                    context.nextToken();
                    reservedInstance.setRecurringCharges(new ListUnmarshaller<RecurringCharge>(RecurringChargeJsonUnmarshaller.getInstance())

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

        return reservedInstance;
    }

    private static ReservedInstanceJsonUnmarshaller instance;

    public static ReservedInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstanceJsonUnmarshaller();
        return instance;
    }
}
