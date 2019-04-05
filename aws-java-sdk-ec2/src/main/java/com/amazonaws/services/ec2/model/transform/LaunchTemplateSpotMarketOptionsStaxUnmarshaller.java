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
 * LaunchTemplateSpotMarketOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpotMarketOptionsStaxUnmarshaller implements Unmarshaller<LaunchTemplateSpotMarketOptions, StaxUnmarshallerContext> {

    public LaunchTemplateSpotMarketOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateSpotMarketOptions launchTemplateSpotMarketOptions = new LaunchTemplateSpotMarketOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateSpotMarketOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("maxPrice", targetDepth)) {
                    launchTemplateSpotMarketOptions.setMaxPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("spotInstanceType", targetDepth)) {
                    launchTemplateSpotMarketOptions.setSpotInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("blockDurationMinutes", targetDepth)) {
                    launchTemplateSpotMarketOptions.setBlockDurationMinutes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("validUntil", targetDepth)) {
                    launchTemplateSpotMarketOptions.setValidUntil(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceInterruptionBehavior", targetDepth)) {
                    launchTemplateSpotMarketOptions.setInstanceInterruptionBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateSpotMarketOptions;
                }
            }
        }
    }

    private static LaunchTemplateSpotMarketOptionsStaxUnmarshaller instance;

    public static LaunchTemplateSpotMarketOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateSpotMarketOptionsStaxUnmarshaller();
        return instance;
    }
}
