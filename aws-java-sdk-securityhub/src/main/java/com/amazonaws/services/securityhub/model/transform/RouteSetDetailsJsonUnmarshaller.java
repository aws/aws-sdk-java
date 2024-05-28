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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RouteSetDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteSetDetailsJsonUnmarshaller implements Unmarshaller<RouteSetDetails, JsonUnmarshallerContext> {

    public RouteSetDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        RouteSetDetails routeSetDetails = new RouteSetDetails();

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
                if (context.testExpression("CarrierGatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setCarrierGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkArn", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setCoreNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationCidrBlock", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setDestinationCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIpv6CidrBlock", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setDestinationIpv6CidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationPrefixListId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setDestinationPrefixListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EgressOnlyInternetGatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setEgressOnlyInternetGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceOwnerId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setInstanceOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocalGatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setLocalGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NatGatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setNatGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Origin", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setOrigin(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransitGatewayId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setTransitGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
                    context.nextToken();
                    routeSetDetails.setVpcPeeringConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return routeSetDetails;
    }

    private static RouteSetDetailsJsonUnmarshaller instance;

    public static RouteSetDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteSetDetailsJsonUnmarshaller();
        return instance;
    }
}
