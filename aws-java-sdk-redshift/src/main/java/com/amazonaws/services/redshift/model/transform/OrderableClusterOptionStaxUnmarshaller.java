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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OrderableClusterOption StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableClusterOptionStaxUnmarshaller implements Unmarshaller<OrderableClusterOption, StaxUnmarshallerContext> {

    public OrderableClusterOption unmarshall(StaxUnmarshallerContext context) throws Exception {
        OrderableClusterOption orderableClusterOption = new OrderableClusterOption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return orderableClusterOption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ClusterVersion", targetDepth)) {
                    orderableClusterOption.setClusterVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterType", targetDepth)) {
                    orderableClusterOption.setClusterType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeType", targetDepth)) {
                    orderableClusterOption.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    orderableClusterOption.withAvailabilityZones(new ArrayList<AvailabilityZone>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/AvailabilityZone", targetDepth)) {
                    orderableClusterOption.withAvailabilityZones(AvailabilityZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return orderableClusterOption;
                }
            }
        }
    }

    private static OrderableClusterOptionStaxUnmarshaller instance;

    public static OrderableClusterOptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrderableClusterOptionStaxUnmarshaller();
        return instance;
    }
}
