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
 * TransitGatewayConnectPeerConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectPeerConfigurationStaxUnmarshaller implements Unmarshaller<TransitGatewayConnectPeerConfiguration, StaxUnmarshallerContext> {

    public TransitGatewayConnectPeerConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayConnectPeerConfiguration transitGatewayConnectPeerConfiguration = new TransitGatewayConnectPeerConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayConnectPeerConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayAddress", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.setTransitGatewayAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peerAddress", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.setPeerAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("insideCidrBlocks", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.withInsideCidrBlocks(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("insideCidrBlocks/item", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.withInsideCidrBlocks(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocol", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("bgpConfigurations", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.withBgpConfigurations(new ArrayList<TransitGatewayAttachmentBgpConfiguration>());
                    continue;
                }

                if (context.testExpression("bgpConfigurations/item", targetDepth)) {
                    transitGatewayConnectPeerConfiguration.withBgpConfigurations(TransitGatewayAttachmentBgpConfigurationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayConnectPeerConfiguration;
                }
            }
        }
    }

    private static TransitGatewayConnectPeerConfigurationStaxUnmarshaller instance;

    public static TransitGatewayConnectPeerConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayConnectPeerConfigurationStaxUnmarshaller();
        return instance;
    }
}
