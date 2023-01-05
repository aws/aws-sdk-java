/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsNetworkFirewallFirewallDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsNetworkFirewallFirewallDetailsJsonUnmarshaller implements Unmarshaller<AwsNetworkFirewallFirewallDetails, JsonUnmarshallerContext> {

    public AwsNetworkFirewallFirewallDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsNetworkFirewallFirewallDetails awsNetworkFirewallFirewallDetails = new AwsNetworkFirewallFirewallDetails();

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
                if (context.testExpression("DeleteProtection", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setDeleteProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallArn", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setFirewallArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallId", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setFirewallId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallName", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setFirewallName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyArn", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setFirewallPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyChangeProtection", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setFirewallPolicyChangeProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SubnetChangeProtection", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setSubnetChangeProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SubnetMappings", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setSubnetMappings(new ListUnmarshaller<AwsNetworkFirewallFirewallSubnetMappingsDetails>(
                            AwsNetworkFirewallFirewallSubnetMappingsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsNetworkFirewallFirewallDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsNetworkFirewallFirewallDetails;
    }

    private static AwsNetworkFirewallFirewallDetailsJsonUnmarshaller instance;

    public static AwsNetworkFirewallFirewallDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsNetworkFirewallFirewallDetailsJsonUnmarshaller();
        return instance;
    }
}
