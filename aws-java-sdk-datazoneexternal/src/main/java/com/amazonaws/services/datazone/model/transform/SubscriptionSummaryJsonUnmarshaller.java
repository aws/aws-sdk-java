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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubscriptionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionSummaryJsonUnmarshaller implements Unmarshaller<SubscriptionSummary, JsonUnmarshallerContext> {

    public SubscriptionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubscriptionSummary subscriptionSummary = new SubscriptionSummary();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("retainPermissions", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setRetainPermissions(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscribedListing", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setSubscribedListing(SubscribedListingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("subscribedPrincipal", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setSubscribedPrincipal(SubscribedPrincipalJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("subscriptionRequestId", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setSubscriptionRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    subscriptionSummary.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subscriptionSummary;
    }

    private static SubscriptionSummaryJsonUnmarshaller instance;

    public static SubscriptionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionSummaryJsonUnmarshaller();
        return instance;
    }
}
