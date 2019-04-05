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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SpotFleetLaunchSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotFleetLaunchSpecificationStaxUnmarshaller implements Unmarshaller<SpotFleetLaunchSpecification, StaxUnmarshallerContext> {

    public SpotFleetLaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotFleetLaunchSpecification spotFleetLaunchSpecification = new SpotFleetLaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return spotFleetLaunchSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("groupSet", targetDepth)) {
                    spotFleetLaunchSpecification.withSecurityGroups(new ArrayList<GroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    spotFleetLaunchSpecification.withSecurityGroups(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressingType", targetDepth)) {
                    spotFleetLaunchSpecification.setAddressingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("blockDeviceMapping", targetDepth)) {
                    spotFleetLaunchSpecification.withBlockDeviceMappings(new ArrayList<BlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    spotFleetLaunchSpecification.withBlockDeviceMappings(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebsOptimized", targetDepth)) {
                    spotFleetLaunchSpecification.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    spotFleetLaunchSpecification.setIamInstanceProfile(IamInstanceProfileSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    spotFleetLaunchSpecification.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    spotFleetLaunchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kernelId", targetDepth)) {
                    spotFleetLaunchSpecification.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("keyName", targetDepth)) {
                    spotFleetLaunchSpecification.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("monitoring", targetDepth)) {
                    spotFleetLaunchSpecification.setMonitoring(SpotFleetMonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceSet", targetDepth)) {
                    spotFleetLaunchSpecification.withNetworkInterfaces(new ArrayList<InstanceNetworkInterfaceSpecification>());
                    continue;
                }

                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    spotFleetLaunchSpecification.withNetworkInterfaces(InstanceNetworkInterfaceSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placement", targetDepth)) {
                    spotFleetLaunchSpecification.setPlacement(SpotPlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ramdiskId", targetDepth)) {
                    spotFleetLaunchSpecification.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotPrice", targetDepth)) {
                    spotFleetLaunchSpecification.setSpotPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    spotFleetLaunchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("userData", targetDepth)) {
                    spotFleetLaunchSpecification.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("weightedCapacity", targetDepth)) {
                    spotFleetLaunchSpecification.setWeightedCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSpecificationSet", targetDepth)) {
                    spotFleetLaunchSpecification.withTagSpecifications(new ArrayList<SpotFleetTagSpecification>());
                    continue;
                }

                if (context.testExpression("tagSpecificationSet/item", targetDepth)) {
                    spotFleetLaunchSpecification.withTagSpecifications(SpotFleetTagSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotFleetLaunchSpecification;
                }
            }
        }
    }

    private static SpotFleetLaunchSpecificationStaxUnmarshaller instance;

    public static SpotFleetLaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotFleetLaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
