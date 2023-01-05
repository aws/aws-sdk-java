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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DesiredConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DesiredConfigurationStaxUnmarshaller implements Unmarshaller<DesiredConfiguration, StaxUnmarshallerContext> {

    public DesiredConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        DesiredConfiguration desiredConfiguration = new DesiredConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return desiredConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LaunchTemplate", targetDepth)) {
                    desiredConfiguration.setLaunchTemplate(LaunchTemplateSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MixedInstancesPolicy", targetDepth)) {
                    desiredConfiguration.setMixedInstancesPolicy(MixedInstancesPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return desiredConfiguration;
                }
            }
        }
    }

    private static DesiredConfigurationStaxUnmarshaller instance;

    public static DesiredConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DesiredConfigurationStaxUnmarshaller();
        return instance;
    }
}
