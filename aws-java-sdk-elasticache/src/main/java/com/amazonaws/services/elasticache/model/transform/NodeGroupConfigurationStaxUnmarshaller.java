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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * NodeGroupConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupConfigurationStaxUnmarshaller implements Unmarshaller<NodeGroupConfiguration, StaxUnmarshallerContext> {

    public NodeGroupConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        NodeGroupConfiguration nodeGroupConfiguration = new NodeGroupConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return nodeGroupConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("NodeGroupId", targetDepth)) {
                    nodeGroupConfiguration.setNodeGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Slots", targetDepth)) {
                    nodeGroupConfiguration.setSlots(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicaCount", targetDepth)) {
                    nodeGroupConfiguration.setReplicaCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrimaryAvailabilityZone", targetDepth)) {
                    nodeGroupConfiguration.setPrimaryAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReplicaAvailabilityZones", targetDepth)) {
                    nodeGroupConfiguration.withReplicaAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ReplicaAvailabilityZones/AvailabilityZone", targetDepth)) {
                    nodeGroupConfiguration.withReplicaAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return nodeGroupConfiguration;
                }
            }
        }
    }

    private static NodeGroupConfigurationStaxUnmarshaller instance;

    public static NodeGroupConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupConfigurationStaxUnmarshaller();
        return instance;
    }
}
