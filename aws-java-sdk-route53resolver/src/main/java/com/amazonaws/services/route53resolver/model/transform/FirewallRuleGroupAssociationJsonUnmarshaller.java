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
 * FirewallRuleGroupAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallRuleGroupAssociationJsonUnmarshaller implements Unmarshaller<FirewallRuleGroupAssociation, JsonUnmarshallerContext> {

    public FirewallRuleGroupAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallRuleGroupAssociation firewallRuleGroupAssociation = new FirewallRuleGroupAssociation();

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
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallRuleGroupId", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setFirewallRuleGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MutationProtection", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setMutationProtection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManagedOwnerName", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setManagedOwnerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    context.nextToken();
                    firewallRuleGroupAssociation.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return firewallRuleGroupAssociation;
    }

    private static FirewallRuleGroupAssociationJsonUnmarshaller instance;

    public static FirewallRuleGroupAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallRuleGroupAssociationJsonUnmarshaller();
        return instance;
    }
}
