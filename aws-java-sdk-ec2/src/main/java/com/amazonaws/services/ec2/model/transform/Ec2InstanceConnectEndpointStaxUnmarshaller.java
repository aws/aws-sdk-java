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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Ec2InstanceConnectEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2InstanceConnectEndpointStaxUnmarshaller implements Unmarshaller<Ec2InstanceConnectEndpoint, StaxUnmarshallerContext> {

    public Ec2InstanceConnectEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        Ec2InstanceConnectEndpoint ec2InstanceConnectEndpoint = new Ec2InstanceConnectEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ec2InstanceConnectEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ownerId", targetDepth)) {
                    ec2InstanceConnectEndpoint.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceConnectEndpointId", targetDepth)) {
                    ec2InstanceConnectEndpoint.setInstanceConnectEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceConnectEndpointArn", targetDepth)) {
                    ec2InstanceConnectEndpoint.setInstanceConnectEndpointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    ec2InstanceConnectEndpoint.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("stateMessage", targetDepth)) {
                    ec2InstanceConnectEndpoint.setStateMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dnsName", targetDepth)) {
                    ec2InstanceConnectEndpoint.setDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fipsDnsName", targetDepth)) {
                    ec2InstanceConnectEndpoint.setFipsDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceIdSet", targetDepth)) {
                    ec2InstanceConnectEndpoint.withNetworkInterfaceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("networkInterfaceIdSet/item", targetDepth)) {
                    ec2InstanceConnectEndpoint.withNetworkInterfaceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    ec2InstanceConnectEndpoint.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    ec2InstanceConnectEndpoint.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createdAt", targetDepth)) {
                    ec2InstanceConnectEndpoint.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    ec2InstanceConnectEndpoint.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("preserveClientIp", targetDepth)) {
                    ec2InstanceConnectEndpoint.setPreserveClientIp(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupIdSet", targetDepth)) {
                    ec2InstanceConnectEndpoint.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("securityGroupIdSet/item", targetDepth)) {
                    ec2InstanceConnectEndpoint.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    ec2InstanceConnectEndpoint.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    ec2InstanceConnectEndpoint.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ec2InstanceConnectEndpoint;
                }
            }
        }
    }

    private static Ec2InstanceConnectEndpointStaxUnmarshaller instance;

    public static Ec2InstanceConnectEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new Ec2InstanceConnectEndpointStaxUnmarshaller();
        return instance;
    }
}
