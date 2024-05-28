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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OfferFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferFiltersJsonUnmarshaller implements Unmarshaller<OfferFilters, JsonUnmarshallerContext> {

    public OfferFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        OfferFilters offerFilters = new OfferFilters();

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
                if (context.testExpression("EntityId", targetDepth)) {
                    context.nextToken();
                    offerFilters.setEntityId(OfferEntityIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    offerFilters.setName(OfferNameFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    offerFilters.setProductId(OfferProductIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResaleAuthorizationId", targetDepth)) {
                    context.nextToken();
                    offerFilters.setResaleAuthorizationId(OfferResaleAuthorizationIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReleaseDate", targetDepth)) {
                    context.nextToken();
                    offerFilters.setReleaseDate(OfferReleaseDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityEndDate", targetDepth)) {
                    context.nextToken();
                    offerFilters.setAvailabilityEndDate(OfferAvailabilityEndDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BuyerAccounts", targetDepth)) {
                    context.nextToken();
                    offerFilters.setBuyerAccounts(OfferBuyerAccountsFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    offerFilters.setState(OfferStateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Targeting", targetDepth)) {
                    context.nextToken();
                    offerFilters.setTargeting(OfferTargetingFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    offerFilters.setLastModifiedDate(OfferLastModifiedDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return offerFilters;
    }

    private static OfferFiltersJsonUnmarshaller instance;

    public static OfferFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OfferFiltersJsonUnmarshaller();
        return instance;
    }
}
