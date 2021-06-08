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
 * TransitGatewayConnectPeer StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectPeerStaxUnmarshaller implements Unmarshaller<TransitGatewayConnectPeer, StaxUnmarshallerContext> {

    public TransitGatewayConnectPeer unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayConnectPeer transitGatewayConnectPeer = new TransitGatewayConnectPeer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayConnectPeer;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayAttachmentId", targetDepth)) {
                    transitGatewayConnectPeer.setTransitGatewayAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayConnectPeerId", targetDepth)) {
                    transitGatewayConnectPeer.setTransitGatewayConnectPeerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    transitGatewayConnectPeer.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    transitGatewayConnectPeer.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("connectPeerConfiguration", targetDepth)) {
                    transitGatewayConnectPeer.setConnectPeerConfiguration(TransitGatewayConnectPeerConfigurationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    transitGatewayConnectPeer.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    transitGatewayConnectPeer.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayConnectPeer;
                }
            }
        }
    }

    private static TransitGatewayConnectPeerStaxUnmarshaller instance;

    public static TransitGatewayConnectPeerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayConnectPeerStaxUnmarshaller();
        return instance;
    }
}
