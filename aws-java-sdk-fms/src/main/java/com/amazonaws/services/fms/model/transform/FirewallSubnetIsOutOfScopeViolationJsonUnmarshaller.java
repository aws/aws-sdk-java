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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FirewallSubnetIsOutOfScopeViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallSubnetIsOutOfScopeViolationJsonUnmarshaller implements Unmarshaller<FirewallSubnetIsOutOfScopeViolation, JsonUnmarshallerContext> {

    public FirewallSubnetIsOutOfScopeViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallSubnetIsOutOfScopeViolation firewallSubnetIsOutOfScopeViolation = new FirewallSubnetIsOutOfScopeViolation();

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
                if (context.testExpression("FirewallSubnetId", targetDepth)) {
                    context.nextToken();
                    firewallSubnetIsOutOfScopeViolation.setFirewallSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    firewallSubnetIsOutOfScopeViolation.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetAvailabilityZone", targetDepth)) {
                    context.nextToken();
                    firewallSubnetIsOutOfScopeViolation.setSubnetAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetAvailabilityZoneId", targetDepth)) {
                    context.nextToken();
                    firewallSubnetIsOutOfScopeViolation.setSubnetAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcEndpointId", targetDepth)) {
                    context.nextToken();
                    firewallSubnetIsOutOfScopeViolation.setVpcEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return firewallSubnetIsOutOfScopeViolation;
    }

    private static FirewallSubnetIsOutOfScopeViolationJsonUnmarshaller instance;

    public static FirewallSubnetIsOutOfScopeViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallSubnetIsOutOfScopeViolationJsonUnmarshaller();
        return instance;
    }
}
