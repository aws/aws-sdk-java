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
 * NetworkInsightsPath StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsPathStaxUnmarshaller implements Unmarshaller<NetworkInsightsPath, StaxUnmarshallerContext> {

    public NetworkInsightsPath unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInsightsPath networkInsightsPath = new NetworkInsightsPath();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInsightsPath;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkInsightsPathId", targetDepth)) {
                    networkInsightsPath.setNetworkInsightsPathId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInsightsPathArn", targetDepth)) {
                    networkInsightsPath.setNetworkInsightsPathArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createdDate", targetDepth)) {
                    networkInsightsPath.setCreatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("source", targetDepth)) {
                    networkInsightsPath.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destination", targetDepth)) {
                    networkInsightsPath.setDestination(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceIp", targetDepth)) {
                    networkInsightsPath.setSourceIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationIp", targetDepth)) {
                    networkInsightsPath.setDestinationIp(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocol", targetDepth)) {
                    networkInsightsPath.setProtocol(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationPort", targetDepth)) {
                    networkInsightsPath.setDestinationPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkInsightsPath.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInsightsPath.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInsightsPath;
                }
            }
        }
    }

    private static NetworkInsightsPathStaxUnmarshaller instance;

    public static NetworkInsightsPathStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInsightsPathStaxUnmarshaller();
        return instance;
    }
}
