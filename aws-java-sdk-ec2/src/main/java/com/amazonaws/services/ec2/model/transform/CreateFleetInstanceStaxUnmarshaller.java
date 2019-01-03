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
 * CreateFleetInstance StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetInstanceStaxUnmarshaller implements Unmarshaller<CreateFleetInstance, StaxUnmarshallerContext> {

    public CreateFleetInstance unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateFleetInstance createFleetInstance = new CreateFleetInstance();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createFleetInstance;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("launchTemplateAndOverrides", targetDepth)) {
                    createFleetInstance.setLaunchTemplateAndOverrides(LaunchTemplateAndOverridesResponseStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lifecycle", targetDepth)) {
                    createFleetInstance.setLifecycle(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceIds", targetDepth)) {
                    createFleetInstance.withInstanceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("instanceIds/item", targetDepth)) {
                    createFleetInstance.withInstanceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    createFleetInstance.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("platform", targetDepth)) {
                    createFleetInstance.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createFleetInstance;
                }
            }
        }
    }

    private static CreateFleetInstanceStaxUnmarshaller instance;

    public static CreateFleetInstanceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFleetInstanceStaxUnmarshaller();
        return instance;
    }
}
