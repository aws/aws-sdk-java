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
 * LaunchTemplateInstanceNetworkInterfaceSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateInstanceNetworkInterfaceSpecificationStaxUnmarshaller implements
        Unmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecification, StaxUnmarshallerContext> {

    public LaunchTemplateInstanceNetworkInterfaceSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateInstanceNetworkInterfaceSpecification launchTemplateInstanceNetworkInterfaceSpecification = new LaunchTemplateInstanceNetworkInterfaceSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateInstanceNetworkInterfaceSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("associatePublicIpAddress", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setAssociatePublicIpAddress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deleteOnTermination", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceIndex", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setDeviceIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupSet", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.withGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("groupSet/groupId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.withGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6AddressCount", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setIpv6AddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6AddressesSet", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.withIpv6Addresses(new ArrayList<InstanceIpv6Address>());
                    continue;
                }

                if (context.testExpression("ipv6AddressesSet/item", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification
                            .withIpv6Addresses(InstanceIpv6AddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddress", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddressesSet", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.withPrivateIpAddresses(new ArrayList<PrivateIpAddressSpecification>());
                    continue;
                }

                if (context.testExpression("privateIpAddressesSet/item", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.withPrivateIpAddresses(PrivateIpAddressSpecificationStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("secondaryPrivateIpAddressCount", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setSecondaryPrivateIpAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateInstanceNetworkInterfaceSpecification;
                }
            }
        }
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationStaxUnmarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationStaxUnmarshaller();
        return instance;
    }
}
