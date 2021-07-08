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
 * NetworkFirewallInvalidRouteConfigurationViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallInvalidRouteConfigurationViolationJsonUnmarshaller implements
        Unmarshaller<NetworkFirewallInvalidRouteConfigurationViolation, JsonUnmarshallerContext> {

    public NetworkFirewallInvalidRouteConfigurationViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkFirewallInvalidRouteConfigurationViolation networkFirewallInvalidRouteConfigurationViolation = new NetworkFirewallInvalidRouteConfigurationViolation();

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
                if (context.testExpression("AffectedSubnets", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setAffectedSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsRouteTableUsedInDifferentAZ", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setIsRouteTableUsedInDifferentAZ(context.getUnmarshaller(Boolean.class).unmarshall(
                            context));
                }
                if (context.testExpression("ViolatingRoute", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setViolatingRoute(RouteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CurrentFirewallSubnetRouteTable", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setCurrentFirewallSubnetRouteTable(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("ExpectedFirewallEndpoint", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setExpectedFirewallEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActualFirewallEndpoint", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setActualFirewallEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedFirewallSubnetId", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setExpectedFirewallSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActualFirewallSubnetId", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setActualFirewallSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedFirewallSubnetRoutes", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setExpectedFirewallSubnetRoutes(new ListUnmarshaller<ExpectedRoute>(
                            ExpectedRouteJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ActualFirewallSubnetRoutes", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setActualFirewallSubnetRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InternetGatewayId", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setInternetGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentInternetGatewayRouteTable", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setCurrentInternetGatewayRouteTable(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("ExpectedInternetGatewayRoutes", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setExpectedInternetGatewayRoutes(new ListUnmarshaller<ExpectedRoute>(
                            ExpectedRouteJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ActualInternetGatewayRoutes", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setActualInternetGatewayRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    networkFirewallInvalidRouteConfigurationViolation.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkFirewallInvalidRouteConfigurationViolation;
    }

    private static NetworkFirewallInvalidRouteConfigurationViolationJsonUnmarshaller instance;

    public static NetworkFirewallInvalidRouteConfigurationViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkFirewallInvalidRouteConfigurationViolationJsonUnmarshaller();
        return instance;
    }
}
