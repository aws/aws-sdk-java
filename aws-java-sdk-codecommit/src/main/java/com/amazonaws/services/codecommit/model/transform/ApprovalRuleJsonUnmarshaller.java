/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApprovalRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRuleJsonUnmarshaller implements Unmarshaller<ApprovalRule, JsonUnmarshallerContext> {

    public ApprovalRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApprovalRule approvalRule = new ApprovalRule();

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
                if (context.testExpression("approvalRuleId", targetDepth)) {
                    context.nextToken();
                    approvalRule.setApprovalRuleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("approvalRuleName", targetDepth)) {
                    context.nextToken();
                    approvalRule.setApprovalRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("approvalRuleContent", targetDepth)) {
                    context.nextToken();
                    approvalRule.setApprovalRuleContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleContentSha256", targetDepth)) {
                    context.nextToken();
                    approvalRule.setRuleContentSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    approvalRule.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    approvalRule.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedUser", targetDepth)) {
                    context.nextToken();
                    approvalRule.setLastModifiedUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originApprovalRuleTemplate", targetDepth)) {
                    context.nextToken();
                    approvalRule.setOriginApprovalRuleTemplate(OriginApprovalRuleTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return approvalRule;
    }

    private static ApprovalRuleJsonUnmarshaller instance;

    public static ApprovalRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleJsonUnmarshaller();
        return instance;
    }
}
