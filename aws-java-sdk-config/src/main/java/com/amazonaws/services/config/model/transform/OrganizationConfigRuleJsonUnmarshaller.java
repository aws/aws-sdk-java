/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OrganizationConfigRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfigRuleJsonUnmarshaller implements Unmarshaller<OrganizationConfigRule, JsonUnmarshallerContext> {

    public OrganizationConfigRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        OrganizationConfigRule organizationConfigRule = new OrganizationConfigRule();

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
                if (context.testExpression("OrganizationConfigRuleName", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule.setOrganizationConfigRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationConfigRuleArn", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule.setOrganizationConfigRuleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationManagedRuleMetadata", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule
                            .setOrganizationManagedRuleMetadata(OrganizationManagedRuleMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OrganizationCustomRuleMetadata", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule.setOrganizationCustomRuleMetadata(OrganizationCustomRuleMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExcludedAccounts", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule.setExcludedAccounts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    organizationConfigRule.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return organizationConfigRule;
    }

    private static OrganizationConfigRuleJsonUnmarshaller instance;

    public static OrganizationConfigRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationConfigRuleJsonUnmarshaller();
        return instance;
    }
}
