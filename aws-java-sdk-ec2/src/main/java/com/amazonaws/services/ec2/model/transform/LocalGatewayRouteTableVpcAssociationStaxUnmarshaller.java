/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LocalGatewayRouteTableVpcAssociation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayRouteTableVpcAssociationStaxUnmarshaller implements Unmarshaller<LocalGatewayRouteTableVpcAssociation, StaxUnmarshallerContext> {

    public LocalGatewayRouteTableVpcAssociation unmarshall(StaxUnmarshallerContext context) throws Exception {
        LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation = new LocalGatewayRouteTableVpcAssociation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return localGatewayRouteTableVpcAssociation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("localGatewayRouteTableVpcAssociationId", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.setLocalGatewayRouteTableVpcAssociationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayRouteTableId", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.setLocalGatewayRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayId", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.setLocalGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    localGatewayRouteTableVpcAssociation.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return localGatewayRouteTableVpcAssociation;
                }
            }
        }
    }

    private static LocalGatewayRouteTableVpcAssociationStaxUnmarshaller instance;

    public static LocalGatewayRouteTableVpcAssociationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteTableVpcAssociationStaxUnmarshaller();
        return instance;
    }
}
