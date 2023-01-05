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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayRouteTableRoute StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTableRouteStaxUnmarshaller implements Unmarshaller<TransitGatewayRouteTableRoute, StaxUnmarshallerContext> {

    public TransitGatewayRouteTableRoute unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayRouteTableRoute transitGatewayRouteTableRoute = new TransitGatewayRouteTableRoute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayRouteTableRoute;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("destinationCidr", targetDepth)) {
                    transitGatewayRouteTableRoute.setDestinationCidr(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    transitGatewayRouteTableRoute.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeOrigin", targetDepth)) {
                    transitGatewayRouteTableRoute.setRouteOrigin(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixListId", targetDepth)) {
                    transitGatewayRouteTableRoute.setPrefixListId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("attachmentId", targetDepth)) {
                    transitGatewayRouteTableRoute.setAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceId", targetDepth)) {
                    transitGatewayRouteTableRoute.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    transitGatewayRouteTableRoute.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayRouteTableRoute;
                }
            }
        }
    }

    private static TransitGatewayRouteTableRouteStaxUnmarshaller instance;

    public static TransitGatewayRouteTableRouteStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableRouteStaxUnmarshaller();
        return instance;
    }
}
