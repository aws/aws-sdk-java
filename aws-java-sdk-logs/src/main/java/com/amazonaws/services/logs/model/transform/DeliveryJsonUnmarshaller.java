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
package com.amazonaws.services.logs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Delivery JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryJsonUnmarshaller implements Unmarshaller<Delivery, JsonUnmarshallerContext> {

    public Delivery unmarshall(JsonUnmarshallerContext context) throws Exception {
        Delivery delivery = new Delivery();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    delivery.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    delivery.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deliverySourceName", targetDepth)) {
                    context.nextToken();
                    delivery.setDeliverySourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deliveryDestinationArn", targetDepth)) {
                    context.nextToken();
                    delivery.setDeliveryDestinationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deliveryDestinationType", targetDepth)) {
                    context.nextToken();
                    delivery.setDeliveryDestinationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    delivery.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return delivery;
    }

    private static DeliveryJsonUnmarshaller instance;

    public static DeliveryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryJsonUnmarshaller();
        return instance;
    }
}
