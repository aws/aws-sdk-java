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
 * ReservedInstanceOffering JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceOfferingJsonUnmarshaller implements Unmarshaller<ReservedInstanceOffering, JsonUnmarshallerContext> {

    public ReservedInstanceOffering unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservedInstanceOffering reservedInstanceOffering = new ReservedInstanceOffering();

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
                if (context.testExpression("ReservedInstanceOfferingId", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setReservedInstanceOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setFixedPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("UsagePrice", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setUsagePrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecurringCharges", targetDepth)) {
                    context.nextToken();
                    reservedInstanceOffering.setRecurringCharges(new ListUnmarshaller<RecurringCharge>(RecurringChargeJsonUnmarshaller.getInstance())

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

        return reservedInstanceOffering;
    }

    private static ReservedInstanceOfferingJsonUnmarshaller instance;

    public static ReservedInstanceOfferingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstanceOfferingJsonUnmarshaller();
        return instance;
    }
}
