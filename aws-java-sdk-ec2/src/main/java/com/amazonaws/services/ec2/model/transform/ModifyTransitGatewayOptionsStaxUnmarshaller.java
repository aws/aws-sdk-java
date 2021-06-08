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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyTransitGatewayOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayOptionsStaxUnmarshaller implements Unmarshaller<ModifyTransitGatewayOptions, StaxUnmarshallerContext> {

    public ModifyTransitGatewayOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyTransitGatewayOptions modifyTransitGatewayOptions = new ModifyTransitGatewayOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyTransitGatewayOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AddTransitGatewayCidrBlocks", targetDepth)) {
                    modifyTransitGatewayOptions.withAddTransitGatewayCidrBlocks(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AddTransitGatewayCidrBlocks/item", targetDepth)) {
                    modifyTransitGatewayOptions.withAddTransitGatewayCidrBlocks(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RemoveTransitGatewayCidrBlocks", targetDepth)) {
                    modifyTransitGatewayOptions.withRemoveTransitGatewayCidrBlocks(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("RemoveTransitGatewayCidrBlocks/item", targetDepth)) {
                    modifyTransitGatewayOptions.withRemoveTransitGatewayCidrBlocks(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpnEcmpSupport", targetDepth)) {
                    modifyTransitGatewayOptions.setVpnEcmpSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DnsSupport", targetDepth)) {
                    modifyTransitGatewayOptions.setDnsSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoAcceptSharedAttachments", targetDepth)) {
                    modifyTransitGatewayOptions.setAutoAcceptSharedAttachments(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultRouteTableAssociation", targetDepth)) {
                    modifyTransitGatewayOptions.setDefaultRouteTableAssociation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociationDefaultRouteTableId", targetDepth)) {
                    modifyTransitGatewayOptions.setAssociationDefaultRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultRouteTablePropagation", targetDepth)) {
                    modifyTransitGatewayOptions.setDefaultRouteTablePropagation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PropagationDefaultRouteTableId", targetDepth)) {
                    modifyTransitGatewayOptions.setPropagationDefaultRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyTransitGatewayOptions;
                }
            }
        }
    }

    private static ModifyTransitGatewayOptionsStaxUnmarshaller instance;

    public static ModifyTransitGatewayOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyTransitGatewayOptionsStaxUnmarshaller();
        return instance;
    }
}
