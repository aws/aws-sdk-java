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
package com.amazonaws.services.billingconductor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.billingconductor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CustomLineItemVersionListElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLineItemVersionListElementJsonUnmarshaller implements Unmarshaller<CustomLineItemVersionListElement, JsonUnmarshallerContext> {

    public CustomLineItemVersionListElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        CustomLineItemVersionListElement customLineItemVersionListElement = new CustomLineItemVersionListElement();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChargeDetails", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setChargeDetails(ListCustomLineItemChargeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductCode", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setProductCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BillingGroupArn", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setBillingGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setCreationTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AssociationSize", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setAssociationSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("StartBillingPeriod", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setStartBillingPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndBillingPeriod", targetDepth)) {
                    context.nextToken();
                    customLineItemVersionListElement.setEndBillingPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return customLineItemVersionListElement;
    }

    private static CustomLineItemVersionListElementJsonUnmarshaller instance;

    public static CustomLineItemVersionListElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomLineItemVersionListElementJsonUnmarshaller();
        return instance;
    }
}
