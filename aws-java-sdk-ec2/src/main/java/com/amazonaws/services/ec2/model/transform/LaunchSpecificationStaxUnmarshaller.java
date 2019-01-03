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
 * LaunchSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchSpecificationStaxUnmarshaller implements Unmarshaller<LaunchSpecification, StaxUnmarshallerContext> {

    public LaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchSpecification launchSpecification = new LaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("userData", targetDepth)) {
                    launchSpecification.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressingType", targetDepth)) {
                    launchSpecification.setAddressingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("blockDeviceMapping", targetDepth)) {
                    launchSpecification.withBlockDeviceMappings(new ArrayList<BlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    launchSpecification.withBlockDeviceMappings(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebsOptimized", targetDepth)) {
                    launchSpecification.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("iamInstanceProfile", targetDepth)) {
                    launchSpecification.setIamInstanceProfile(IamInstanceProfileSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    launchSpecification.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    launchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kernelId", targetDepth)) {
                    launchSpecification.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("keyName", targetDepth)) {
                    launchSpecification.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceSet", targetDepth)) {
                    launchSpecification.withNetworkInterfaces(new ArrayList<InstanceNetworkInterfaceSpecification>());
                    continue;
                }

                if (context.testExpression("networkInterfaceSet/item", targetDepth)) {
                    launchSpecification.withNetworkInterfaces(InstanceNetworkInterfaceSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placement", targetDepth)) {
                    launchSpecification.setPlacement(SpotPlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ramdiskId", targetDepth)) {
                    launchSpecification.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    launchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupSet", targetDepth)) {
                    launchSpecification.withAllSecurityGroups(new ArrayList<GroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    launchSpecification.withAllSecurityGroups(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("monitoring/enabled", targetDepth)) {
                    launchSpecification.setMonitoringEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroup", targetDepth)) {
                    launchSpecification.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("securityGroup/GroupName", targetDepth)) {
                    launchSpecification.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchSpecification;
                }
            }
        }
    }

    private static LaunchSpecificationStaxUnmarshaller instance;

    public static LaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
