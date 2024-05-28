/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LaunchTemplateEnaSrdSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateEnaSrdSpecificationStaxUnmarshaller implements Unmarshaller<LaunchTemplateEnaSrdSpecification, StaxUnmarshallerContext> {

    public LaunchTemplateEnaSrdSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateEnaSrdSpecification launchTemplateEnaSrdSpecification = new LaunchTemplateEnaSrdSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateEnaSrdSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("enaSrdEnabled", targetDepth)) {
                    launchTemplateEnaSrdSpecification.setEnaSrdEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("enaSrdUdpSpecification", targetDepth)) {
                    launchTemplateEnaSrdSpecification.setEnaSrdUdpSpecification(LaunchTemplateEnaSrdUdpSpecificationStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateEnaSrdSpecification;
                }
            }
        }
    }

    private static LaunchTemplateEnaSrdSpecificationStaxUnmarshaller instance;

    public static LaunchTemplateEnaSrdSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateEnaSrdSpecificationStaxUnmarshaller();
        return instance;
    }
}
