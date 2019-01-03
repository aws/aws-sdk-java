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
 * LaunchTemplateEbsBlockDevice StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateEbsBlockDeviceStaxUnmarshaller implements Unmarshaller<LaunchTemplateEbsBlockDevice, StaxUnmarshallerContext> {

    public LaunchTemplateEbsBlockDevice unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateEbsBlockDevice launchTemplateEbsBlockDevice = new LaunchTemplateEbsBlockDevice();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateEbsBlockDevice;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("encrypted", targetDepth)) {
                    launchTemplateEbsBlockDevice.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deleteOnTermination", targetDepth)) {
                    launchTemplateEbsBlockDevice.setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("iops", targetDepth)) {
                    launchTemplateEbsBlockDevice.setIops(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kmsKeyId", targetDepth)) {
                    launchTemplateEbsBlockDevice.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("snapshotId", targetDepth)) {
                    launchTemplateEbsBlockDevice.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeSize", targetDepth)) {
                    launchTemplateEbsBlockDevice.setVolumeSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeType", targetDepth)) {
                    launchTemplateEbsBlockDevice.setVolumeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateEbsBlockDevice;
                }
            }
        }
    }

    private static LaunchTemplateEbsBlockDeviceStaxUnmarshaller instance;

    public static LaunchTemplateEbsBlockDeviceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateEbsBlockDeviceStaxUnmarshaller();
        return instance;
    }
}
