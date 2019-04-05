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
 * TransitGatewayVpcAttachment StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayVpcAttachmentStaxUnmarshaller implements Unmarshaller<TransitGatewayVpcAttachment, StaxUnmarshallerContext> {

    public TransitGatewayVpcAttachment unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayVpcAttachment transitGatewayVpcAttachment = new TransitGatewayVpcAttachment();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayVpcAttachment;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayAttachmentId", targetDepth)) {
                    transitGatewayVpcAttachment.setTransitGatewayAttachmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayId", targetDepth)) {
                    transitGatewayVpcAttachment.setTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    transitGatewayVpcAttachment.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcOwnerId", targetDepth)) {
                    transitGatewayVpcAttachment.setVpcOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    transitGatewayVpcAttachment.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetIds", targetDepth)) {
                    transitGatewayVpcAttachment.withSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("subnetIds/item", targetDepth)) {
                    transitGatewayVpcAttachment.withSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    transitGatewayVpcAttachment.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("options", targetDepth)) {
                    transitGatewayVpcAttachment.setOptions(TransitGatewayVpcAttachmentOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    transitGatewayVpcAttachment.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    transitGatewayVpcAttachment.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayVpcAttachment;
                }
            }
        }
    }

    private static TransitGatewayVpcAttachmentStaxUnmarshaller instance;

    public static TransitGatewayVpcAttachmentStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayVpcAttachmentStaxUnmarshaller();
        return instance;
    }
}
