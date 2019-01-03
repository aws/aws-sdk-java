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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * LoadBalancer StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerStaxUnmarshaller implements Unmarshaller<LoadBalancer, StaxUnmarshallerContext> {

    public LoadBalancer unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadBalancer loadBalancer = new LoadBalancer();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return loadBalancer;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoadBalancerArn", targetDepth)) {
                    loadBalancer.setLoadBalancerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DNSName", targetDepth)) {
                    loadBalancer.setDNSName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CanonicalHostedZoneId", targetDepth)) {
                    loadBalancer.setCanonicalHostedZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedTime", targetDepth)) {
                    loadBalancer.setCreatedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    loadBalancer.setLoadBalancerName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Scheme", targetDepth)) {
                    loadBalancer.setScheme(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    loadBalancer.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    loadBalancer.setState(LoadBalancerStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Type", targetDepth)) {
                    loadBalancer.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    loadBalancer.withAvailabilityZones(new ArrayList<AvailabilityZone>());
                    continue;
                }

                if (context.testExpression("AvailabilityZones/member", targetDepth)) {
                    loadBalancer.withAvailabilityZones(AvailabilityZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroups", targetDepth)) {
                    loadBalancer.withSecurityGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroups/member", targetDepth)) {
                    loadBalancer.withSecurityGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IpAddressType", targetDepth)) {
                    loadBalancer.setIpAddressType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return loadBalancer;
                }
            }
        }
    }

    private static LoadBalancerStaxUnmarshaller instance;

    public static LoadBalancerStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerStaxUnmarshaller();
        return instance;
    }
}
