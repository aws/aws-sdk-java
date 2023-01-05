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
 * PacketHeaderStatement StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PacketHeaderStatementStaxUnmarshaller implements Unmarshaller<PacketHeaderStatement, StaxUnmarshallerContext> {

    public PacketHeaderStatement unmarshall(StaxUnmarshallerContext context) throws Exception {
        PacketHeaderStatement packetHeaderStatement = new PacketHeaderStatement();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return packetHeaderStatement;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("sourceAddressSet", targetDepth)) {
                    packetHeaderStatement.withSourceAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourceAddressSet/item", targetDepth)) {
                    packetHeaderStatement.withSourceAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationAddressSet", targetDepth)) {
                    packetHeaderStatement.withDestinationAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationAddressSet/item", targetDepth)) {
                    packetHeaderStatement.withDestinationAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePortSet", targetDepth)) {
                    packetHeaderStatement.withSourcePorts(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourcePortSet/item", targetDepth)) {
                    packetHeaderStatement.withSourcePorts(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPortSet", targetDepth)) {
                    packetHeaderStatement.withDestinationPorts(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationPortSet/item", targetDepth)) {
                    packetHeaderStatement.withDestinationPorts(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePrefixListSet", targetDepth)) {
                    packetHeaderStatement.withSourcePrefixLists(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourcePrefixListSet/item", targetDepth)) {
                    packetHeaderStatement.withSourcePrefixLists(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPrefixListSet", targetDepth)) {
                    packetHeaderStatement.withDestinationPrefixLists(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationPrefixListSet/item", targetDepth)) {
                    packetHeaderStatement.withDestinationPrefixLists(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocolSet", targetDepth)) {
                    packetHeaderStatement.withProtocols(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("protocolSet/item", targetDepth)) {
                    packetHeaderStatement.withProtocols(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return packetHeaderStatement;
                }
            }
        }
    }

    private static PacketHeaderStatementStaxUnmarshaller instance;

    public static PacketHeaderStatementStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PacketHeaderStatementStaxUnmarshaller();
        return instance;
    }
}
