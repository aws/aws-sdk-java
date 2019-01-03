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
package com.amazonaws.services.elasticsearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservedElasticsearchInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedElasticsearchInstanceJsonUnmarshaller implements Unmarshaller<ReservedElasticsearchInstance, JsonUnmarshallerContext> {

    public ReservedElasticsearchInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservedElasticsearchInstance reservedElasticsearchInstance = new ReservedElasticsearchInstance();

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
                    reservedElasticsearchInstance.setReservationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReservedElasticsearchInstanceId", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setReservedElasticsearchInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReservedElasticsearchInstanceOfferingId", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setReservedElasticsearchInstanceOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElasticsearchInstanceType", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setElasticsearchInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setFixedPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("UsagePrice", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setUsagePrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElasticsearchInstanceCount", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setElasticsearchInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecurringCharges", targetDepth)) {
                    context.nextToken();
                    reservedElasticsearchInstance.setRecurringCharges(new ListUnmarshaller<RecurringCharge>(RecurringChargeJsonUnmarshaller.getInstance())
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

        return reservedElasticsearchInstance;
    }

    private static ReservedElasticsearchInstanceJsonUnmarshaller instance;

    public static ReservedElasticsearchInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedElasticsearchInstanceJsonUnmarshaller();
        return instance;
    }
}
