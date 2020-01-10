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
 * LocalGatewayVirtualInterface StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayVirtualInterfaceStaxUnmarshaller implements Unmarshaller<LocalGatewayVirtualInterface, StaxUnmarshallerContext> {

    public LocalGatewayVirtualInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
        LocalGatewayVirtualInterface localGatewayVirtualInterface = new LocalGatewayVirtualInterface();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return localGatewayVirtualInterface;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("localGatewayVirtualInterfaceId", targetDepth)) {
                    localGatewayVirtualInterface.setLocalGatewayVirtualInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localGatewayId", targetDepth)) {
                    localGatewayVirtualInterface.setLocalGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vlan", targetDepth)) {
                    localGatewayVirtualInterface.setVlan(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localAddress", targetDepth)) {
                    localGatewayVirtualInterface.setLocalAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peerAddress", targetDepth)) {
                    localGatewayVirtualInterface.setPeerAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("localBgpAsn", targetDepth)) {
                    localGatewayVirtualInterface.setLocalBgpAsn(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("peerBgpAsn", targetDepth)) {
                    localGatewayVirtualInterface.setPeerBgpAsn(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    localGatewayVirtualInterface.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    localGatewayVirtualInterface.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return localGatewayVirtualInterface;
                }
            }
        }
    }

    private static LocalGatewayVirtualInterfaceStaxUnmarshaller instance;

    public static LocalGatewayVirtualInterfaceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayVirtualInterfaceStaxUnmarshaller();
        return instance;
    }
}
