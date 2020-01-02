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
 * ApprovalRuleTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalRuleTemplateJsonUnmarshaller implements Unmarshaller<ApprovalRuleTemplate, JsonUnmarshallerContext> {

    public ApprovalRuleTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApprovalRuleTemplate approvalRuleTemplate = new ApprovalRuleTemplate();

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
                if (context.testExpression("approvalRuleTemplateId", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setApprovalRuleTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("approvalRuleTemplateName", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setApprovalRuleTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("approvalRuleTemplateDescription", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setApprovalRuleTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("approvalRuleTemplateContent", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setApprovalRuleTemplateContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleContentSha256", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setRuleContentSha256(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedUser", targetDepth)) {
                    context.nextToken();
                    approvalRuleTemplate.setLastModifiedUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return approvalRuleTemplate;
    }

    private static ApprovalRuleTemplateJsonUnmarshaller instance;

    public static ApprovalRuleTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApprovalRuleTemplateJsonUnmarshaller();
        return instance;
    }
}
