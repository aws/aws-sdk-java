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
 * LaunchTemplateBlockDeviceMapping StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateBlockDeviceMappingStaxUnmarshaller implements Unmarshaller<LaunchTemplateBlockDeviceMapping, StaxUnmarshallerContext> {

    public LaunchTemplateBlockDeviceMapping unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateBlockDeviceMapping launchTemplateBlockDeviceMapping = new LaunchTemplateBlockDeviceMapping();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateBlockDeviceMapping;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("deviceName", targetDepth)) {
                    launchTemplateBlockDeviceMapping.setDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("virtualName", targetDepth)) {
                    launchTemplateBlockDeviceMapping.setVirtualName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebs", targetDepth)) {
                    launchTemplateBlockDeviceMapping.setEbs(LaunchTemplateEbsBlockDeviceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("noDevice", targetDepth)) {
                    launchTemplateBlockDeviceMapping.setNoDevice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateBlockDeviceMapping;
                }
            }
        }
    }

    private static LaunchTemplateBlockDeviceMappingStaxUnmarshaller instance;

    public static LaunchTemplateBlockDeviceMappingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateBlockDeviceMappingStaxUnmarshaller();
        return instance;
    }
}
