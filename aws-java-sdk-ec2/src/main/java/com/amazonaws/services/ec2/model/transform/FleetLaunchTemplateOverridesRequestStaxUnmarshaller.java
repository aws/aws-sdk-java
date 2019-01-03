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
 * FleetLaunchTemplateOverridesRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetLaunchTemplateOverridesRequestStaxUnmarshaller implements Unmarshaller<FleetLaunchTemplateOverridesRequest, StaxUnmarshallerContext> {

    public FleetLaunchTemplateOverridesRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        FleetLaunchTemplateOverridesRequest fleetLaunchTemplateOverridesRequest = new FleetLaunchTemplateOverridesRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fleetLaunchTemplateOverridesRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceType", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxPrice", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setMaxPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetId", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("WeightedCapacity", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setWeightedCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Priority", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setPriority(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Placement", targetDepth)) {
                    fleetLaunchTemplateOverridesRequest.setPlacement(PlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fleetLaunchTemplateOverridesRequest;
                }
            }
        }
    }

    private static FleetLaunchTemplateOverridesRequestStaxUnmarshaller instance;

    public static FleetLaunchTemplateOverridesRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetLaunchTemplateOverridesRequestStaxUnmarshaller();
        return instance;
    }
}
