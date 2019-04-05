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
 * ImageAttribute StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageAttributeStaxUnmarshaller implements Unmarshaller<ImageAttribute, StaxUnmarshallerContext> {

    public ImageAttribute unmarshall(StaxUnmarshallerContext context) throws Exception {
        ImageAttribute imageAttribute = new ImageAttribute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return imageAttribute;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("blockDeviceMapping", targetDepth)) {
                    imageAttribute.withBlockDeviceMappings(new ArrayList<BlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    imageAttribute.withBlockDeviceMappings(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    imageAttribute.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchPermission", targetDepth)) {
                    imageAttribute.withLaunchPermissions(new ArrayList<LaunchPermission>());
                    continue;
                }

                if (context.testExpression("launchPermission/item", targetDepth)) {
                    imageAttribute.withLaunchPermissions(LaunchPermissionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("productCodes", targetDepth)) {
                    imageAttribute.withProductCodes(new ArrayList<ProductCode>());
                    continue;
                }

                if (context.testExpression("productCodes/item", targetDepth)) {
                    imageAttribute.withProductCodes(ProductCodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description/value", targetDepth)) {
                    imageAttribute.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kernel/value", targetDepth)) {
                    imageAttribute.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ramdisk/value", targetDepth)) {
                    imageAttribute.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sriovNetSupport/value", targetDepth)) {
                    imageAttribute.setSriovNetSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return imageAttribute;
                }
            }
        }
    }

    private static ImageAttributeStaxUnmarshaller instance;

    public static ImageAttributeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageAttributeStaxUnmarshaller();
        return instance;
    }
}
