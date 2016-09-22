/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EnvironmentResourceDescription StAX Unmarshaller
 */
public class EnvironmentResourceDescriptionStaxUnmarshaller implements Unmarshaller<EnvironmentResourceDescription, StaxUnmarshallerContext> {

    public EnvironmentResourceDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        EnvironmentResourceDescription environmentResourceDescription = new EnvironmentResourceDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return environmentResourceDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EnvironmentName", targetDepth)) {
                    environmentResourceDescription.setEnvironmentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AutoScalingGroups/member", targetDepth)) {
                    environmentResourceDescription.withAutoScalingGroups(AutoScalingGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Instances/member", targetDepth)) {
                    environmentResourceDescription.withInstances(InstanceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LaunchConfigurations/member", targetDepth)) {
                    environmentResourceDescription.withLaunchConfigurations(LaunchConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancers/member", targetDepth)) {
                    environmentResourceDescription.withLoadBalancers(LoadBalancerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Triggers/member", targetDepth)) {
                    environmentResourceDescription.withTriggers(TriggerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Queues/member", targetDepth)) {
                    environmentResourceDescription.withQueues(QueueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return environmentResourceDescription;
                }
            }
        }
    }

    private static EnvironmentResourceDescriptionStaxUnmarshaller instance;

    public static EnvironmentResourceDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentResourceDescriptionStaxUnmarshaller();
        return instance;
    }
}
