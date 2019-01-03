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
 * ScheduledInstancesLaunchSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesLaunchSpecificationStaxUnmarshaller implements Unmarshaller<ScheduledInstancesLaunchSpecification, StaxUnmarshallerContext> {

    public ScheduledInstancesLaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledInstancesLaunchSpecification scheduledInstancesLaunchSpecification = new ScheduledInstancesLaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledInstancesLaunchSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("BlockDeviceMapping", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withBlockDeviceMappings(new ArrayList<ScheduledInstancesBlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("BlockDeviceMapping/BlockDeviceMapping", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withBlockDeviceMappings(ScheduledInstancesBlockDeviceMappingStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("EbsOptimized", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setIamInstanceProfile(ScheduledInstancesIamInstanceProfileStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("ImageId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceType", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KernelId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KeyName", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Monitoring", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setMonitoring(ScheduledInstancesMonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterface", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withNetworkInterfaces(new ArrayList<ScheduledInstancesNetworkInterface>());
                    continue;
                }

                if (context.testExpression("NetworkInterface/NetworkInterface", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withNetworkInterfaces(ScheduledInstancesNetworkInterfaceStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("Placement", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setPlacement(ScheduledInstancesPlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RamdiskId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroupId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroupId/SecurityGroupId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetId", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserData", targetDepth)) {
                    scheduledInstancesLaunchSpecification.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledInstancesLaunchSpecification;
                }
            }
        }
    }

    private static ScheduledInstancesLaunchSpecificationStaxUnmarshaller instance;

    public static ScheduledInstancesLaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesLaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
