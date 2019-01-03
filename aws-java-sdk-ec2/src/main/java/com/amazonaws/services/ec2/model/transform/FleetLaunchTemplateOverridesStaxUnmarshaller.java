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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * FleetLaunchTemplateOverrides StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetLaunchTemplateOverridesStaxUnmarshaller implements Unmarshaller<FleetLaunchTemplateOverrides, StaxUnmarshallerContext> {

    public FleetLaunchTemplateOverrides unmarshall(StaxUnmarshallerContext context) throws Exception {
        FleetLaunchTemplateOverrides fleetLaunchTemplateOverrides = new FleetLaunchTemplateOverrides();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fleetLaunchTemplateOverrides;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("instanceType", targetDepth)) {
                    fleetLaunchTemplateOverrides.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maxPrice", targetDepth)) {
                    fleetLaunchTemplateOverrides.setMaxPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    fleetLaunchTemplateOverrides.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    fleetLaunchTemplateOverrides.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("weightedCapacity", targetDepth)) {
                    fleetLaunchTemplateOverrides.setWeightedCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("priority", targetDepth)) {
                    fleetLaunchTemplateOverrides.setPriority(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placement", targetDepth)) {
                    fleetLaunchTemplateOverrides.setPlacement(PlacementResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fleetLaunchTemplateOverrides;
                }
            }
        }
    }

    private static FleetLaunchTemplateOverridesStaxUnmarshaller instance;

    public static FleetLaunchTemplateOverridesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesStaxUnmarshaller();
        return instance;
    }
}
