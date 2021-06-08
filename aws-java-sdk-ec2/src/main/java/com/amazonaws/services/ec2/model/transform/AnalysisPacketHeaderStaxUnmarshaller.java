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
 * AnalysisPacketHeader StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisPacketHeaderStaxUnmarshaller implements Unmarshaller<AnalysisPacketHeader, StaxUnmarshallerContext> {

    public AnalysisPacketHeader unmarshall(StaxUnmarshallerContext context) throws Exception {
        AnalysisPacketHeader analysisPacketHeader = new AnalysisPacketHeader();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return analysisPacketHeader;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("destinationAddressSet", targetDepth)) {
                    analysisPacketHeader.withDestinationAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("destinationAddressSet/item", targetDepth)) {
                    analysisPacketHeader.withDestinationAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPortRangeSet", targetDepth)) {
                    analysisPacketHeader.withDestinationPortRanges(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("destinationPortRangeSet/item", targetDepth)) {
                    analysisPacketHeader.withDestinationPortRanges(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocol", targetDepth)) {
                    analysisPacketHeader.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceAddressSet", targetDepth)) {
                    analysisPacketHeader.withSourceAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("sourceAddressSet/item", targetDepth)) {
                    analysisPacketHeader.withSourceAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourcePortRangeSet", targetDepth)) {
                    analysisPacketHeader.withSourcePortRanges(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("sourcePortRangeSet/item", targetDepth)) {
                    analysisPacketHeader.withSourcePortRanges(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return analysisPacketHeader;
                }
            }
        }
    }

    private static AnalysisPacketHeaderStaxUnmarshaller instance;

    public static AnalysisPacketHeaderStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisPacketHeaderStaxUnmarshaller();
        return instance;
    }
}
