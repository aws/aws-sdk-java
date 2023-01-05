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
 * PacketHeaderStatementRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PacketHeaderStatementRequestStaxUnmarshaller implements Unmarshaller<PacketHeaderStatementRequest, StaxUnmarshallerContext> {

    public PacketHeaderStatementRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        PacketHeaderStatementRequest packetHeaderStatementRequest = new PacketHeaderStatementRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return packetHeaderStatementRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SourceAddress", targetDepth)) {
                    packetHeaderStatementRequest.withSourceAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SourceAddress/item", targetDepth)) {
                    packetHeaderStatementRequest.withSourceAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationAddress", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DestinationAddress/item", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourcePort", targetDepth)) {
                    packetHeaderStatementRequest.withSourcePorts(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SourcePort/item", targetDepth)) {
                    packetHeaderStatementRequest.withSourcePorts(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationPort", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationPorts(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DestinationPort/item", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationPorts(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourcePrefixList", targetDepth)) {
                    packetHeaderStatementRequest.withSourcePrefixLists(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SourcePrefixList/item", targetDepth)) {
                    packetHeaderStatementRequest.withSourcePrefixLists(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DestinationPrefixList", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationPrefixLists(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DestinationPrefixList/item", targetDepth)) {
                    packetHeaderStatementRequest.withDestinationPrefixLists(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Protocol", targetDepth)) {
                    packetHeaderStatementRequest.withProtocols(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Protocol/item", targetDepth)) {
                    packetHeaderStatementRequest.withProtocols(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return packetHeaderStatementRequest;
                }
            }
        }
    }

    private static PacketHeaderStatementRequestStaxUnmarshaller instance;

    public static PacketHeaderStatementRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PacketHeaderStatementRequestStaxUnmarshaller();
        return instance;
    }
}
