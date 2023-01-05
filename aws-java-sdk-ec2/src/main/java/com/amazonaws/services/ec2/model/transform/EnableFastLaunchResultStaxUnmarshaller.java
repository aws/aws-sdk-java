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
 * EnableFastLaunchResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastLaunchResultStaxUnmarshaller implements Unmarshaller<EnableFastLaunchResult, StaxUnmarshallerContext> {

    public EnableFastLaunchResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        EnableFastLaunchResult enableFastLaunchResult = new EnableFastLaunchResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return enableFastLaunchResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("imageId", targetDepth)) {
                    enableFastLaunchResult.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("resourceType", targetDepth)) {
                    enableFastLaunchResult.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("snapshotConfiguration", targetDepth)) {
                    enableFastLaunchResult.setSnapshotConfiguration(FastLaunchSnapshotConfigurationResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplate", targetDepth)) {
                    enableFastLaunchResult.setLaunchTemplate(FastLaunchLaunchTemplateSpecificationResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maxParallelLaunches", targetDepth)) {
                    enableFastLaunchResult.setMaxParallelLaunches(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    enableFastLaunchResult.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    enableFastLaunchResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateTransitionReason", targetDepth)) {
                    enableFastLaunchResult.setStateTransitionReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateTransitionTime", targetDepth)) {
                    enableFastLaunchResult.setStateTransitionTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return enableFastLaunchResult;
                }
            }
        }
    }

    private static EnableFastLaunchResultStaxUnmarshaller instance;

    public static EnableFastLaunchResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableFastLaunchResultStaxUnmarshaller();
        return instance;
    }
}
