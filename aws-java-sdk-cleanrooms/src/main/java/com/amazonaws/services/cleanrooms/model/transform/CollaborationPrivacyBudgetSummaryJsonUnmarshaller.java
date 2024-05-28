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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CollaborationPrivacyBudgetSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationPrivacyBudgetSummaryJsonUnmarshaller implements Unmarshaller<CollaborationPrivacyBudgetSummary, JsonUnmarshallerContext> {

    public CollaborationPrivacyBudgetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CollaborationPrivacyBudgetSummary collaborationPrivacyBudgetSummary = new CollaborationPrivacyBudgetSummary();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privacyBudgetTemplateId", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setPrivacyBudgetTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privacyBudgetTemplateArn", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setPrivacyBudgetTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creatorAccountId", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("budget", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetSummary.setBudget(PrivacyBudgetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return collaborationPrivacyBudgetSummary;
    }

    private static CollaborationPrivacyBudgetSummaryJsonUnmarshaller instance;

    public static CollaborationPrivacyBudgetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CollaborationPrivacyBudgetSummaryJsonUnmarshaller();
        return instance;
    }
}
