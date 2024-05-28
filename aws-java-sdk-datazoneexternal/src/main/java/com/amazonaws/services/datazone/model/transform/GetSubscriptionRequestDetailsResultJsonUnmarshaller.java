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
 * GetSubscriptionRequestDetailsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubscriptionRequestDetailsResultJsonUnmarshaller implements Unmarshaller<GetSubscriptionRequestDetailsResult, JsonUnmarshallerContext> {

    public GetSubscriptionRequestDetailsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSubscriptionRequestDetailsResult getSubscriptionRequestDetailsResult = new GetSubscriptionRequestDetailsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSubscriptionRequestDetailsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("decisionComment", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setDecisionComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestReason", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setRequestReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reviewerId", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setReviewerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscribedListings", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setSubscribedListings(new ListUnmarshaller<SubscribedListing>(SubscribedListingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("subscribedPrincipals", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setSubscribedPrincipals(new ListUnmarshaller<SubscribedPrincipal>(SubscribedPrincipalJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    getSubscriptionRequestDetailsResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSubscriptionRequestDetailsResult;
    }

    private static GetSubscriptionRequestDetailsResultJsonUnmarshaller instance;

    public static GetSubscriptionRequestDetailsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSubscriptionRequestDetailsResultJsonUnmarshaller();
        return instance;
    }
}
