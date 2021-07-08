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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceViolationJsonUnmarshaller implements Unmarshaller<ResourceViolation, JsonUnmarshallerContext> {

    public ResourceViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceViolation resourceViolation = new ResourceViolation();

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
                if (context.testExpression("AwsVPCSecurityGroupViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setAwsVPCSecurityGroupViolation(AwsVPCSecurityGroupViolationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2NetworkInterfaceViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setAwsEc2NetworkInterfaceViolation(AwsEc2NetworkInterfaceViolationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2InstanceViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setAwsEc2InstanceViolation(AwsEc2InstanceViolationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallMissingFirewallViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallMissingFirewallViolation(NetworkFirewallMissingFirewallViolationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallMissingSubnetViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallMissingSubnetViolation(NetworkFirewallMissingSubnetViolationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("NetworkFirewallMissingExpectedRTViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallMissingExpectedRTViolation(NetworkFirewallMissingExpectedRTViolationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallPolicyModifiedViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallPolicyModifiedViolation(NetworkFirewallPolicyModifiedViolationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallInternetTrafficNotInspectedViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation
                            .setNetworkFirewallInternetTrafficNotInspectedViolation(NetworkFirewallInternetTrafficNotInspectedViolationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallInvalidRouteConfigurationViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallInvalidRouteConfigurationViolation(NetworkFirewallInvalidRouteConfigurationViolationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallBlackHoleRouteDetectedViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallBlackHoleRouteDetectedViolation(NetworkFirewallBlackHoleRouteDetectedViolationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallUnexpectedFirewallRoutesViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallUnexpectedFirewallRoutesViolation(NetworkFirewallUnexpectedFirewallRoutesViolationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallUnexpectedGatewayRoutesViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallUnexpectedGatewayRoutesViolation(NetworkFirewallUnexpectedGatewayRoutesViolationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkFirewallMissingExpectedRoutesViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setNetworkFirewallMissingExpectedRoutesViolation(NetworkFirewallMissingExpectedRoutesViolationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DnsRuleGroupPriorityConflictViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setDnsRuleGroupPriorityConflictViolation(DnsRuleGroupPriorityConflictViolationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DnsDuplicateRuleGroupViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setDnsDuplicateRuleGroupViolation(DnsDuplicateRuleGroupViolationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DnsRuleGroupLimitExceededViolation", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setDnsRuleGroupLimitExceededViolation(DnsRuleGroupLimitExceededViolationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("PossibleRemediationActions", targetDepth)) {
                    context.nextToken();
                    resourceViolation.setPossibleRemediationActions(PossibleRemediationActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceViolation;
    }

    private static ResourceViolationJsonUnmarshaller instance;

    public static ResourceViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceViolationJsonUnmarshaller();
        return instance;
    }
}
