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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AnalysisRouteTableRoute StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisRouteTableRouteStaxUnmarshaller implements Unmarshaller<AnalysisRouteTableRoute, StaxUnmarshallerContext> {

    public AnalysisRouteTableRoute unmarshall(StaxUnmarshallerContext context) throws Exception {
        AnalysisRouteTableRoute analysisRouteTableRoute = new AnalysisRouteTableRoute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return analysisRouteTableRoute;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("destinationCidr", targetDepth)) {
                    analysisRouteTableRoute.setDestinationCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPrefixListId", targetDepth)) {
                    analysisRouteTableRoute.setDestinationPrefixListId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("egressOnlyInternetGatewayId", targetDepth)) {
                    analysisRouteTableRoute.setEgressOnlyInternetGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("gatewayId", targetDepth)) {
                    analysisRouteTableRoute.setGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    analysisRouteTableRoute.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("natGatewayId", targetDepth)) {
                    analysisRouteTableRoute.setNatGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    analysisRouteTableRoute.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("origin", targetDepth)) {
                    analysisRouteTableRoute.setOrigin(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayId", targetDepth)) {
                    analysisRouteTableRoute.setTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcPeeringConnectionId", targetDepth)) {
                    analysisRouteTableRoute.setVpcPeeringConnectionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return analysisRouteTableRoute;
                }
            }
        }
    }

    private static AnalysisRouteTableRouteStaxUnmarshaller instance;

    public static AnalysisRouteTableRouteStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisRouteTableRouteStaxUnmarshaller();
        return instance;
    }
}
