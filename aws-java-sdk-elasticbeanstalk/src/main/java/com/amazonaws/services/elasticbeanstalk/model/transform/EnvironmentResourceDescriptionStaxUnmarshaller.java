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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EnvironmentResourceDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
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

                if (context.testExpression("AutoScalingGroups", targetDepth)) {
                    environmentResourceDescription.withAutoScalingGroups(new ArrayList<AutoScalingGroup>());
                    continue;
                }

                if (context.testExpression("AutoScalingGroups/member", targetDepth)) {
                    environmentResourceDescription.withAutoScalingGroups(AutoScalingGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Instances", targetDepth)) {
                    environmentResourceDescription.withInstances(new ArrayList<Instance>());
                    continue;
                }

                if (context.testExpression("Instances/member", targetDepth)) {
                    environmentResourceDescription.withInstances(InstanceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LaunchConfigurations", targetDepth)) {
                    environmentResourceDescription.withLaunchConfigurations(new ArrayList<LaunchConfiguration>());
                    continue;
                }

                if (context.testExpression("LaunchConfigurations/member", targetDepth)) {
                    environmentResourceDescription.withLaunchConfigurations(LaunchConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LaunchTemplates", targetDepth)) {
                    environmentResourceDescription.withLaunchTemplates(new ArrayList<LaunchTemplate>());
                    continue;
                }

                if (context.testExpression("LaunchTemplates/member", targetDepth)) {
                    environmentResourceDescription.withLaunchTemplates(LaunchTemplateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancers", targetDepth)) {
                    environmentResourceDescription.withLoadBalancers(new ArrayList<LoadBalancer>());
                    continue;
                }

                if (context.testExpression("LoadBalancers/member", targetDepth)) {
                    environmentResourceDescription.withLoadBalancers(LoadBalancerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Triggers", targetDepth)) {
                    environmentResourceDescription.withTriggers(new ArrayList<Trigger>());
                    continue;
                }

                if (context.testExpression("Triggers/member", targetDepth)) {
                    environmentResourceDescription.withTriggers(TriggerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Queues", targetDepth)) {
                    environmentResourceDescription.withQueues(new ArrayList<Queue>());
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
