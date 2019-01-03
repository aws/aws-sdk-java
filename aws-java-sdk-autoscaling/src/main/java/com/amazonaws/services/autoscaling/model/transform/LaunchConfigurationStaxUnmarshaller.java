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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LaunchConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchConfigurationStaxUnmarshaller implements Unmarshaller<LaunchConfiguration, StaxUnmarshallerContext> {

    public LaunchConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchConfiguration launchConfiguration = new LaunchConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LaunchConfigurationName", targetDepth)) {
                    launchConfiguration.setLaunchConfigurationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LaunchConfigurationARN", targetDepth)) {
                    launchConfiguration.setLaunchConfigurationARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImageId", targetDepth)) {
                    launchConfiguration.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KeyName", targetDepth)) {
                    launchConfiguration.setKeyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroups", targetDepth)) {
                    launchConfiguration.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroups/member", targetDepth)) {
                    launchConfiguration.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClassicLinkVPCId", targetDepth)) {
                    launchConfiguration.setClassicLinkVPCId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClassicLinkVPCSecurityGroups", targetDepth)) {
                    launchConfiguration.withClassicLinkVPCSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ClassicLinkVPCSecurityGroups/member", targetDepth)) {
                    launchConfiguration.withClassicLinkVPCSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserData", targetDepth)) {
                    launchConfiguration.setUserData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceType", targetDepth)) {
                    launchConfiguration.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KernelId", targetDepth)) {
                    launchConfiguration.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RamdiskId", targetDepth)) {
                    launchConfiguration.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BlockDeviceMappings", targetDepth)) {
                    launchConfiguration.withBlockDeviceMappings(new ArrayList<BlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("BlockDeviceMappings/member", targetDepth)) {
                    launchConfiguration.withBlockDeviceMappings(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceMonitoring", targetDepth)) {
                    launchConfiguration.setInstanceMonitoring(InstanceMonitoringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotPrice", targetDepth)) {
                    launchConfiguration.setSpotPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    launchConfiguration.setIamInstanceProfile(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedTime", targetDepth)) {
                    launchConfiguration.setCreatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("EbsOptimized", targetDepth)) {
                    launchConfiguration.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssociatePublicIpAddress", targetDepth)) {
                    launchConfiguration.setAssociatePublicIpAddress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlacementTenancy", targetDepth)) {
                    launchConfiguration.setPlacementTenancy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchConfiguration;
                }
            }
        }
    }

    private static LaunchConfigurationStaxUnmarshaller instance;

    public static LaunchConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchConfigurationStaxUnmarshaller();
        return instance;
    }
}
