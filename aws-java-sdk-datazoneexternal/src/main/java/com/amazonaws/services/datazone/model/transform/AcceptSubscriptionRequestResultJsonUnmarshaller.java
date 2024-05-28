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
 * AcceptSubscriptionRequestResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptSubscriptionRequestResultJsonUnmarshaller implements Unmarshaller<AcceptSubscriptionRequestResult, JsonUnmarshallerContext> {

    public AcceptSubscriptionRequestResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AcceptSubscriptionRequestResult acceptSubscriptionRequestResult = new AcceptSubscriptionRequestResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return acceptSubscriptionRequestResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("decisionComment", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setDecisionComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestReason", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setRequestReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reviewerId", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setReviewerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscribedListings", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setSubscribedListings(new ListUnmarshaller<SubscribedListing>(SubscribedListingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("subscribedPrincipals", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setSubscribedPrincipals(new ListUnmarshaller<SubscribedPrincipal>(SubscribedPrincipalJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    acceptSubscriptionRequestResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return acceptSubscriptionRequestResult;
    }

    private static AcceptSubscriptionRequestResultJsonUnmarshaller instance;

    public static AcceptSubscriptionRequestResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AcceptSubscriptionRequestResultJsonUnmarshaller();
        return instance;
    }
}
