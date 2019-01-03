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
 * LaunchTemplateInstanceNetworkInterfaceSpecificationRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateInstanceNetworkInterfaceSpecificationRequestStaxUnmarshaller implements
        Unmarshaller<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest, StaxUnmarshallerContext> {

    public LaunchTemplateInstanceNetworkInterfaceSpecificationRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateInstanceNetworkInterfaceSpecificationRequest launchTemplateInstanceNetworkInterfaceSpecificationRequest = new LaunchTemplateInstanceNetworkInterfaceSpecificationRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateInstanceNetworkInterfaceSpecificationRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AssociatePublicIpAddress", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setAssociatePublicIpAddress(BooleanStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

                if (context.testExpression("DeleteOnTermination", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest
                            .setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeviceIndex", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setDeviceIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecurityGroupId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SecurityGroupId/SecurityGroupId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Ipv6AddressCount", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setIpv6AddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Ipv6Addresses", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withIpv6Addresses(new ArrayList<InstanceIpv6AddressRequest>());
                    continue;
                }

                if (context.testExpression("Ipv6Addresses/InstanceIpv6Address", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withIpv6Addresses(InstanceIpv6AddressRequestStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrivateIpAddresses", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withPrivateIpAddresses(new ArrayList<PrivateIpAddressSpecification>());
                    continue;
                }

                if (context.testExpression("PrivateIpAddresses/item", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.withPrivateIpAddresses(PrivateIpAddressSpecificationStaxUnmarshaller
                            .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecondaryPrivateIpAddressCount", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setSecondaryPrivateIpAddressCount(IntegerStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetId", targetDepth)) {
                    launchTemplateInstanceNetworkInterfaceSpecificationRequest.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateInstanceNetworkInterfaceSpecificationRequest;
                }
            }
        }
    }

    private static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestStaxUnmarshaller instance;

    public static LaunchTemplateInstanceNetworkInterfaceSpecificationRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceNetworkInterfaceSpecificationRequestStaxUnmarshaller();
        return instance;
    }
}
