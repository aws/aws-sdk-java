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
 * ResaleAuthorizationFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResaleAuthorizationFiltersJsonUnmarshaller implements Unmarshaller<ResaleAuthorizationFilters, JsonUnmarshallerContext> {

    public ResaleAuthorizationFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResaleAuthorizationFilters resaleAuthorizationFilters = new ResaleAuthorizationFilters();

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
                    resaleAuthorizationFilters.setEntityId(ResaleAuthorizationEntityIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setName(ResaleAuthorizationNameFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setProductId(ResaleAuthorizationProductIdFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setCreatedDate(ResaleAuthorizationCreatedDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityEndDate", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setAvailabilityEndDate(ResaleAuthorizationAvailabilityEndDateFilterJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ManufacturerAccountId", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setManufacturerAccountId(ResaleAuthorizationManufacturerAccountIdFilterJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setProductName(ResaleAuthorizationProductNameFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManufacturerLegalName", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setManufacturerLegalName(ResaleAuthorizationManufacturerLegalNameFilterJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ResellerAccountID", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setResellerAccountID(ResaleAuthorizationResellerAccountIDFilterJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ResellerLegalName", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setResellerLegalName(ResaleAuthorizationResellerLegalNameFilterJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setStatus(ResaleAuthorizationStatusFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OfferExtendedStatus", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setOfferExtendedStatus(ResaleAuthorizationOfferExtendedStatusFilterJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    resaleAuthorizationFilters.setLastModifiedDate(ResaleAuthorizationLastModifiedDateFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resaleAuthorizationFilters;
    }

    private static ResaleAuthorizationFiltersJsonUnmarshaller instance;

    public static ResaleAuthorizationFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResaleAuthorizationFiltersJsonUnmarshaller();
        return instance;
    }
}
