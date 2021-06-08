/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FirewallRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallRuleJsonUnmarshaller implements Unmarshaller<FirewallRule, JsonUnmarshallerContext> {

    public FirewallRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallRule firewallRule = new FirewallRule();

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
                if (context.testExpression("FirewallRuleGroupId", targetDepth)) {
                    context.nextToken();
                    firewallRule.setFirewallRuleGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallDomainListId", targetDepth)) {
                    context.nextToken();
                    firewallRule.setFirewallDomainListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    firewallRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    firewallRule.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    firewallRule.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockResponse", targetDepth)) {
                    context.nextToken();
                    firewallRule.setBlockResponse(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockOverrideDomain", targetDepth)) {
                    context.nextToken();
                    firewallRule.setBlockOverrideDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockOverrideDnsType", targetDepth)) {
                    context.nextToken();
                    firewallRule.setBlockOverrideDnsType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockOverrideTtl", targetDepth)) {
                    context.nextToken();
                    firewallRule.setBlockOverrideTtl(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    context.nextToken();
                    firewallRule.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    firewallRule.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    context.nextToken();
                    firewallRule.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return firewallRule;
    }

    private static FirewallRuleJsonUnmarshaller instance;

    public static FirewallRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallRuleJsonUnmarshaller();
        return instance;
    }
}
