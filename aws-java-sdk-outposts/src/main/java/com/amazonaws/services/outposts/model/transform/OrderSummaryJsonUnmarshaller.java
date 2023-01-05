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
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrderSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderSummaryJsonUnmarshaller implements Unmarshaller<OrderSummary, JsonUnmarshallerContext> {

    public OrderSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrderSummary orderSummary = new OrderSummary();

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
                if (context.testExpression("OutpostId", targetDepth)) {
                    context.nextToken();
                    orderSummary.setOutpostId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrderId", targetDepth)) {
                    context.nextToken();
                    orderSummary.setOrderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrderType", targetDepth)) {
                    context.nextToken();
                    orderSummary.setOrderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    orderSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LineItemCountsByStatus", targetDepth)) {
                    context.nextToken();
                    orderSummary.setLineItemCountsByStatus(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("OrderSubmissionDate", targetDepth)) {
                    context.nextToken();
                    orderSummary.setOrderSubmissionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OrderFulfilledDate", targetDepth)) {
                    context.nextToken();
                    orderSummary.setOrderFulfilledDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return orderSummary;
    }

    private static OrderSummaryJsonUnmarshaller instance;

    public static OrderSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderSummaryJsonUnmarshaller();
        return instance;
    }
}
