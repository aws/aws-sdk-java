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
 * CollaborationPrivacyBudgetTemplateSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationPrivacyBudgetTemplateSummaryJsonUnmarshaller implements
        Unmarshaller<CollaborationPrivacyBudgetTemplateSummary, JsonUnmarshallerContext> {

    public CollaborationPrivacyBudgetTemplateSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CollaborationPrivacyBudgetTemplateSummary collaborationPrivacyBudgetTemplateSummary = new CollaborationPrivacyBudgetTemplateSummary();

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
                    collaborationPrivacyBudgetTemplateSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creatorAccountId", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("privacyBudgetType", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setPrivacyBudgetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    collaborationPrivacyBudgetTemplateSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return collaborationPrivacyBudgetTemplateSummary;
    }

    private static CollaborationPrivacyBudgetTemplateSummaryJsonUnmarshaller instance;

    public static CollaborationPrivacyBudgetTemplateSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CollaborationPrivacyBudgetTemplateSummaryJsonUnmarshaller();
        return instance;
    }
}
