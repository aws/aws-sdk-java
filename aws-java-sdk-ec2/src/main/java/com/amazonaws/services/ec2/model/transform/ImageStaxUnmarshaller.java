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
 * Image StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageStaxUnmarshaller implements Unmarshaller<Image, StaxUnmarshallerContext> {

    public Image unmarshall(StaxUnmarshallerContext context) throws Exception {
        Image image = new Image();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return image;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("architecture", targetDepth)) {
                    image.setArchitecture(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationDate", targetDepth)) {
                    image.setCreationDate(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageId", targetDepth)) {
                    image.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageLocation", targetDepth)) {
                    image.setImageLocation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageType", targetDepth)) {
                    image.setImageType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("isPublic", targetDepth)) {
                    image.setPublic(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("kernelId", targetDepth)) {
                    image.setKernelId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageOwnerId", targetDepth)) {
                    image.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("platform", targetDepth)) {
                    image.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("productCodes", targetDepth)) {
                    image.withProductCodes(new ArrayList<ProductCode>());
                    continue;
                }

                if (context.testExpression("productCodes/item", targetDepth)) {
                    image.withProductCodes(ProductCodeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ramdiskId", targetDepth)) {
                    image.setRamdiskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageState", targetDepth)) {
                    image.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("blockDeviceMapping", targetDepth)) {
                    image.withBlockDeviceMappings(new ArrayList<BlockDeviceMapping>());
                    continue;
                }

                if (context.testExpression("blockDeviceMapping/item", targetDepth)) {
                    image.withBlockDeviceMappings(BlockDeviceMappingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    image.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enaSupport", targetDepth)) {
                    image.setEnaSupport(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("hypervisor", targetDepth)) {
                    image.setHypervisor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("imageOwnerAlias", targetDepth)) {
                    image.setImageOwnerAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("name", targetDepth)) {
                    image.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("rootDeviceName", targetDepth)) {
                    image.setRootDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("rootDeviceType", targetDepth)) {
                    image.setRootDeviceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sriovNetSupport", targetDepth)) {
                    image.setSriovNetSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateReason", targetDepth)) {
                    image.setStateReason(StateReasonStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    image.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    image.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("virtualizationType", targetDepth)) {
                    image.setVirtualizationType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return image;
                }
            }
        }
    }

    private static ImageStaxUnmarshaller instance;

    public static ImageStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageStaxUnmarshaller();
        return instance;
    }
}
