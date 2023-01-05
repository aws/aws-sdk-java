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
package com.amazonaws.services.private5g.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Order JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderJsonUnmarshaller implements Unmarshaller<Order, JsonUnmarshallerContext> {

    public Order unmarshall(JsonUnmarshallerContext context) throws Exception {
        Order order = new Order();

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
                if (context.testExpression("acknowledgmentStatus", targetDepth)) {
                    context.nextToken();
                    order.setAcknowledgmentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    order.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("networkArn", targetDepth)) {
                    context.nextToken();
                    order.setNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSiteArn", targetDepth)) {
                    context.nextToken();
                    order.setNetworkSiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("orderArn", targetDepth)) {
                    context.nextToken();
                    order.setOrderArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shippingAddress", targetDepth)) {
                    context.nextToken();
                    order.setShippingAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trackingInformation", targetDepth)) {
                    context.nextToken();
                    order.setTrackingInformation(new ListUnmarshaller<TrackingInformation>(TrackingInformationJsonUnmarshaller.getInstance())

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

        return order;
    }

    private static OrderJsonUnmarshaller instance;

    public static OrderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderJsonUnmarshaller();
        return instance;
    }
}
