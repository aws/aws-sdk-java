/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Product JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductJsonUnmarshaller implements Unmarshaller<Product, JsonUnmarshallerContext> {

    public Product unmarshall(JsonUnmarshallerContext context) throws Exception {
        Product product = new Product();

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
                if (context.testExpression("ProductArn", targetDepth)) {
                    context.nextToken();
                    product.setProductArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    product.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    context.nextToken();
                    product.setCompanyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    product.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Categories", targetDepth)) {
                    context.nextToken();
                    product.setCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("IntegrationTypes", targetDepth)) {
                    context.nextToken();
                    product.setIntegrationTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("MarketplaceUrl", targetDepth)) {
                    context.nextToken();
                    product.setMarketplaceUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActivationUrl", targetDepth)) {
                    context.nextToken();
                    product.setActivationUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductSubscriptionResourcePolicy", targetDepth)) {
                    context.nextToken();
                    product.setProductSubscriptionResourcePolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return product;
    }

    private static ProductJsonUnmarshaller instance;

    public static ProductJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductJsonUnmarshaller();
        return instance;
    }
}
