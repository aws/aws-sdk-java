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
 * OfferSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferSummaryJsonUnmarshaller implements Unmarshaller<OfferSummary, JsonUnmarshallerContext> {

    public OfferSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        OfferSummary offerSummary = new OfferSummary();

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
                    offerSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    offerSummary.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResaleAuthorizationId", targetDepth)) {
                    context.nextToken();
                    offerSummary.setResaleAuthorizationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseDate", targetDepth)) {
                    context.nextToken();
                    offerSummary.setReleaseDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityEndDate", targetDepth)) {
                    context.nextToken();
                    offerSummary.setAvailabilityEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BuyerAccounts", targetDepth)) {
                    context.nextToken();
                    offerSummary.setBuyerAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    offerSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targeting", targetDepth)) {
                    context.nextToken();
                    offerSummary.setTargeting(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return offerSummary;
    }

    private static OfferSummaryJsonUnmarshaller instance;

    public static OfferSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OfferSummaryJsonUnmarshaller();
        return instance;
    }
}
