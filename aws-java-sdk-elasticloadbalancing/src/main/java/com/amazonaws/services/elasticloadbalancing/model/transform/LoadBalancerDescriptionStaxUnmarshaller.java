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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LoadBalancerDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerDescriptionStaxUnmarshaller implements Unmarshaller<LoadBalancerDescription, StaxUnmarshallerContext> {

    public LoadBalancerDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadBalancerDescription loadBalancerDescription = new LoadBalancerDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return loadBalancerDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    loadBalancerDescription.setLoadBalancerName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DNSName", targetDepth)) {
                    loadBalancerDescription.setDNSName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CanonicalHostedZoneName", targetDepth)) {
                    loadBalancerDescription.setCanonicalHostedZoneName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CanonicalHostedZoneNameID", targetDepth)) {
                    loadBalancerDescription.setCanonicalHostedZoneNameID(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ListenerDescriptions", targetDepth)) {
                    loadBalancerDescription.withListenerDescriptions(new ArrayList<ListenerDescription>());
                    continue;
                }

                if (context.testExpression("ListenerDescriptions/member", targetDepth)) {
                    loadBalancerDescription.withListenerDescriptions(ListenerDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Policies", targetDepth)) {
                    loadBalancerDescription.setPolicies(PoliciesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BackendServerDescriptions", targetDepth)) {
                    loadBalancerDescription.withBackendServerDescriptions(new ArrayList<BackendServerDescription>());
                    continue;
                }

                if (context.testExpression("BackendServerDescriptions/member", targetDepth)) {
                    loadBalancerDescription.withBackendServerDescriptions(BackendServerDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    loadBalancerDescription.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/member", targetDepth)) {
                    loadBalancerDescription.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Subnets", targetDepth)) {
                    loadBalancerDescription.withSubnets(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Subnets/member", targetDepth)) {
                    loadBalancerDescription.withSubnets(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VPCId", targetDepth)) {
                    loadBalancerDescription.setVPCId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Instances", targetDepth)) {
                    loadBalancerDescription.withInstances(new ArrayList<Instance>());
                    continue;
                }

                if (context.testExpression("Instances/member", targetDepth)) {
                    loadBalancerDescription.withInstances(InstanceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthCheck", targetDepth)) {
                    loadBalancerDescription.setHealthCheck(HealthCheckStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceSecurityGroup", targetDepth)) {
                    loadBalancerDescription.setSourceSecurityGroup(SourceSecurityGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroups", targetDepth)) {
                    loadBalancerDescription.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroups/member", targetDepth)) {
                    loadBalancerDescription.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedTime", targetDepth)) {
                    loadBalancerDescription.setCreatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Scheme", targetDepth)) {
                    loadBalancerDescription.setScheme(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return loadBalancerDescription;
                }
            }
        }
    }

    private static LoadBalancerDescriptionStaxUnmarshaller instance;

    public static LoadBalancerDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerDescriptionStaxUnmarshaller();
        return instance;
    }
}
