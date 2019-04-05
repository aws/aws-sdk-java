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
 * NetworkInterface StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterfaceStaxUnmarshaller implements Unmarshaller<NetworkInterface, StaxUnmarshallerContext> {

    public NetworkInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
        NetworkInterface networkInterface = new NetworkInterface();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return networkInterface;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("association", targetDepth)) {
                    networkInterface.setAssociation(NetworkInterfaceAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("attachment", targetDepth)) {
                    networkInterface.setAttachment(NetworkInterfaceAttachmentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    networkInterface.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    networkInterface.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupSet", targetDepth)) {
                    networkInterface.withGroups(new ArrayList<GroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    networkInterface.withGroups(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("interfaceType", targetDepth)) {
                    networkInterface.setInterfaceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6AddressesSet", targetDepth)) {
                    networkInterface.withIpv6Addresses(new ArrayList<NetworkInterfaceIpv6Address>());
                    continue;
                }

                if (context.testExpression("ipv6AddressesSet/item", targetDepth)) {
                    networkInterface.withIpv6Addresses(NetworkInterfaceIpv6AddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("macAddress", targetDepth)) {
                    networkInterface.setMacAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    networkInterface.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    networkInterface.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateDnsName", targetDepth)) {
                    networkInterface.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddress", targetDepth)) {
                    networkInterface.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddressesSet", targetDepth)) {
                    networkInterface.withPrivateIpAddresses(new ArrayList<NetworkInterfacePrivateIpAddress>());
                    continue;
                }

                if (context.testExpression("privateIpAddressesSet/item", targetDepth)) {
                    networkInterface.withPrivateIpAddresses(NetworkInterfacePrivateIpAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("requesterId", targetDepth)) {
                    networkInterface.setRequesterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("requesterManaged", targetDepth)) {
                    networkInterface.setRequesterManaged(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceDestCheck", targetDepth)) {
                    networkInterface.setSourceDestCheck(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    networkInterface.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    networkInterface.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    networkInterface.withTagSet(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    networkInterface.withTagSet(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    networkInterface.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return networkInterface;
                }
            }
        }
    }

    private static NetworkInterfaceStaxUnmarshaller instance;

    public static NetworkInterfaceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceStaxUnmarshaller();
        return instance;
    }
}
