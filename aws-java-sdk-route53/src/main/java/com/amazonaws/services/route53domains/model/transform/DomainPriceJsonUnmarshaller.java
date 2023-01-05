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
package com.amazonaws.services.route53domains.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainPrice JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainPriceJsonUnmarshaller implements Unmarshaller<DomainPrice, JsonUnmarshallerContext> {

    public DomainPrice unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainPrice domainPrice = new DomainPrice();

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
                    domainPrice.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationPrice", targetDepth)) {
                    context.nextToken();
                    domainPrice.setRegistrationPrice(PriceWithCurrencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransferPrice", targetDepth)) {
                    context.nextToken();
                    domainPrice.setTransferPrice(PriceWithCurrencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RenewalPrice", targetDepth)) {
                    context.nextToken();
                    domainPrice.setRenewalPrice(PriceWithCurrencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChangeOwnershipPrice", targetDepth)) {
                    context.nextToken();
                    domainPrice.setChangeOwnershipPrice(PriceWithCurrencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestorationPrice", targetDepth)) {
                    context.nextToken();
                    domainPrice.setRestorationPrice(PriceWithCurrencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainPrice;
    }

    private static DomainPriceJsonUnmarshaller instance;

    public static DomainPriceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainPriceJsonUnmarshaller();
        return instance;
    }
}
