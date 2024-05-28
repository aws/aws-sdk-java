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
package com.amazonaws.services.trustedadvisor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.trustedadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AccountRecommendationLifecycleSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountRecommendationLifecycleSummaryJsonUnmarshaller implements Unmarshaller<AccountRecommendationLifecycleSummary, JsonUnmarshallerContext> {

    public AccountRecommendationLifecycleSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccountRecommendationLifecycleSummary accountRecommendationLifecycleSummary = new AccountRecommendationLifecycleSummary();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountRecommendationArn", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setAccountRecommendationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lifecycleStage", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setLifecycleStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReason", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setUpdateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateReasonCode", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setUpdateReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOf", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setUpdatedOnBehalfOf(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedOnBehalfOfJobTitle", targetDepth)) {
                    context.nextToken();
                    accountRecommendationLifecycleSummary.setUpdatedOnBehalfOfJobTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return accountRecommendationLifecycleSummary;
    }

    private static AccountRecommendationLifecycleSummaryJsonUnmarshaller instance;

    public static AccountRecommendationLifecycleSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountRecommendationLifecycleSummaryJsonUnmarshaller();
        return instance;
    }
}
