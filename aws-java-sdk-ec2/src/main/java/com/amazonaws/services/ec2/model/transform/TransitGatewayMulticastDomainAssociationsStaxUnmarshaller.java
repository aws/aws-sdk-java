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
 * TransitGatewayMulticastDomainAssociations StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayMulticastDomainAssociationsStaxUnmarshaller implements
        Unmarshaller<TransitGatewayMulticastDomainAssociations, StaxUnmarshallerContext> {

    public TransitGatewayMulticastDomainAssociations unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayMulticastDomainAssociations transitGatewayMulticastDomainAssociations = new TransitGatewayMulticastDomainAssociations();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayMulticastDomainAssociations;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayMulticastDomainId", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.setTransitGatewayMulticastDomainId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayAttachmentId", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.setTransitGatewayAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceId", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnets", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.withSubnets(new ArrayList<SubnetAssociation>());
                    continue;
                }

                if (context.testExpression("subnets/item", targetDepth)) {
                    transitGatewayMulticastDomainAssociations.withSubnets(SubnetAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayMulticastDomainAssociations;
                }
            }
        }
    }

    private static TransitGatewayMulticastDomainAssociationsStaxUnmarshaller instance;

    public static TransitGatewayMulticastDomainAssociationsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDomainAssociationsStaxUnmarshaller();
        return instance;
    }
}
