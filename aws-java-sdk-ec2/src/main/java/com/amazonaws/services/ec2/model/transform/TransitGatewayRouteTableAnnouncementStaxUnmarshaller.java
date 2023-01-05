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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayRouteTableAnnouncement StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTableAnnouncementStaxUnmarshaller implements Unmarshaller<TransitGatewayRouteTableAnnouncement, StaxUnmarshallerContext> {

    public TransitGatewayRouteTableAnnouncement unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayRouteTableAnnouncement transitGatewayRouteTableAnnouncement = new TransitGatewayRouteTableAnnouncement();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayRouteTableAnnouncement;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayRouteTableAnnouncementId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setTransitGatewayRouteTableAnnouncementId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("coreNetworkId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setCoreNetworkId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peerTransitGatewayId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setPeerTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peerCoreNetworkId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setPeerCoreNetworkId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peeringAttachmentId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setPeeringAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("announcementDirection", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setAnnouncementDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayRouteTableId", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setTransitGatewayRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    transitGatewayRouteTableAnnouncement.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayRouteTableAnnouncement;
                }
            }
        }
    }

    private static TransitGatewayRouteTableAnnouncementStaxUnmarshaller instance;

    public static TransitGatewayRouteTableAnnouncementStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableAnnouncementStaxUnmarshaller();
        return instance;
    }
}
