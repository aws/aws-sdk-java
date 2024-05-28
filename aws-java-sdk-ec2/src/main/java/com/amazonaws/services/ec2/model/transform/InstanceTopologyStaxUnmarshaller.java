/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * InstanceTopology StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTopologyStaxUnmarshaller implements Unmarshaller<InstanceTopology, StaxUnmarshallerContext> {

    public InstanceTopology unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceTopology instanceTopology = new InstanceTopology();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return instanceTopology;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceId", targetDepth)) {
                    instanceTopology.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    instanceTopology.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupName", targetDepth)) {
                    instanceTopology.setGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkNodeSet", targetDepth)) {
                    instanceTopology.withNetworkNodes(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("networkNodeSet/item", targetDepth)) {
                    instanceTopology.withNetworkNodes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    instanceTopology.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("zoneId", targetDepth)) {
                    instanceTopology.setZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceTopology;
                }
            }
        }
    }

    private static InstanceTopologyStaxUnmarshaller instance;

    public static InstanceTopologyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTopologyStaxUnmarshaller();
        return instance;
    }
}
