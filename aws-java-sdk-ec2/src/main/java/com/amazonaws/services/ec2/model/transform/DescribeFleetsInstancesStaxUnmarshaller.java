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
 * DescribeFleetsInstances StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetsInstancesStaxUnmarshaller implements Unmarshaller<DescribeFleetsInstances, StaxUnmarshallerContext> {

    public DescribeFleetsInstances unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeFleetsInstances describeFleetsInstances = new DescribeFleetsInstances();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeFleetsInstances;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("launchTemplateAndOverrides", targetDepth)) {
                    describeFleetsInstances.setLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lifecycle", targetDepth)) {
                    describeFleetsInstances.setLifecycle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceIds", targetDepth)) {
                    describeFleetsInstances.withInstanceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("instanceIds/item", targetDepth)) {
                    describeFleetsInstances.withInstanceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    describeFleetsInstances.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("platform", targetDepth)) {
                    describeFleetsInstances.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeFleetsInstances;
                }
            }
        }
    }

    private static DescribeFleetsInstancesStaxUnmarshaller instance;

    public static DescribeFleetsInstancesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetsInstancesStaxUnmarshaller();
        return instance;
    }
}
