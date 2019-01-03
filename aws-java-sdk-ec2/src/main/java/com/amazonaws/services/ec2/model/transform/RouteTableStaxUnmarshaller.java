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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RouteTable StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteTableStaxUnmarshaller implements Unmarshaller<RouteTable, StaxUnmarshallerContext> {

    public RouteTable unmarshall(StaxUnmarshallerContext context) throws Exception {
        RouteTable routeTable = new RouteTable();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return routeTable;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("associationSet", targetDepth)) {
                    routeTable.withAssociations(new ArrayList<RouteTableAssociation>());
                    continue;
                }

                if (context.testExpression("associationSet/item", targetDepth)) {
                    routeTable.withAssociations(RouteTableAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("propagatingVgwSet", targetDepth)) {
                    routeTable.withPropagatingVgws(new ArrayList<PropagatingVgw>());
                    continue;
                }

                if (context.testExpression("propagatingVgwSet/item", targetDepth)) {
                    routeTable.withPropagatingVgws(PropagatingVgwStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeTableId", targetDepth)) {
                    routeTable.setRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeSet", targetDepth)) {
                    routeTable.withRoutes(new ArrayList<Route>());
                    continue;
                }

                if (context.testExpression("routeSet/item", targetDepth)) {
                    routeTable.withRoutes(RouteStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    routeTable.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    routeTable.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    routeTable.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    routeTable.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return routeTable;
                }
            }
        }
    }

    private static RouteTableStaxUnmarshaller instance;

    public static RouteTableStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteTableStaxUnmarshaller();
        return instance;
    }
}
