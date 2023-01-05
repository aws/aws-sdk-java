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
package com.amazonaws.services.licensemanagerusersubscriptions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProductUserSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductUserSummaryJsonUnmarshaller implements Unmarshaller<ProductUserSummary, JsonUnmarshallerContext> {

    public ProductUserSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProductUserSummary productUserSummary = new ProductUserSummary();

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
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityProvider", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setIdentityProvider(IdentityProviderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Product", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setProduct(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionEndDate", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setSubscriptionEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionStartDate", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setSubscriptionStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    productUserSummary.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return productUserSummary;
    }

    private static ProductUserSummaryJsonUnmarshaller instance;

    public static ProductUserSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductUserSummaryJsonUnmarshaller();
        return instance;
    }
}
