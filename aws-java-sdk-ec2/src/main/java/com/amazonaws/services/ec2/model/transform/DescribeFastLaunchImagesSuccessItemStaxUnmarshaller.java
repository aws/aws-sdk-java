/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeFastLaunchImagesSuccessItem StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastLaunchImagesSuccessItemStaxUnmarshaller implements Unmarshaller<DescribeFastLaunchImagesSuccessItem, StaxUnmarshallerContext> {

    public DescribeFastLaunchImagesSuccessItem unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeFastLaunchImagesSuccessItem describeFastLaunchImagesSuccessItem = new DescribeFastLaunchImagesSuccessItem();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeFastLaunchImagesSuccessItem;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("imageId", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("snapshotConfiguration", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setSnapshotConfiguration(FastLaunchSnapshotConfigurationResponseStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplate", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setLaunchTemplate(FastLaunchLaunchTemplateSpecificationResponseStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("maxParallelLaunches", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setMaxParallelLaunches(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateTransitionReason", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setStateTransitionReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateTransitionTime", targetDepth)) {
                    describeFastLaunchImagesSuccessItem.setStateTransitionTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeFastLaunchImagesSuccessItem;
                }
            }
        }
    }

    private static DescribeFastLaunchImagesSuccessItemStaxUnmarshaller instance;

    public static DescribeFastLaunchImagesSuccessItemStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFastLaunchImagesSuccessItemStaxUnmarshaller();
        return instance;
    }
}
