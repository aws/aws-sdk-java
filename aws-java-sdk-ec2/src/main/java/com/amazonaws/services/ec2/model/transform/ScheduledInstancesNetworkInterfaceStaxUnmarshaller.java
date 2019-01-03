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
 * ScheduledInstancesNetworkInterface StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstancesNetworkInterfaceStaxUnmarshaller implements Unmarshaller<ScheduledInstancesNetworkInterface, StaxUnmarshallerContext> {

    public ScheduledInstancesNetworkInterface unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledInstancesNetworkInterface scheduledInstancesNetworkInterface = new ScheduledInstancesNetworkInterface();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledInstancesNetworkInterface;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AssociatePublicIpAddress", targetDepth)) {
                    scheduledInstancesNetworkInterface.setAssociatePublicIpAddress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeleteOnTermination", targetDepth)) {
                    scheduledInstancesNetworkInterface.setDeleteOnTermination(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    scheduledInstancesNetworkInterface.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeviceIndex", targetDepth)) {
                    scheduledInstancesNetworkInterface.setDeviceIndex(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Group", targetDepth)) {
                    scheduledInstancesNetworkInterface.withGroups(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Group/SecurityGroupId", targetDepth)) {
                    scheduledInstancesNetworkInterface.withGroups(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Ipv6AddressCount", targetDepth)) {
                    scheduledInstancesNetworkInterface.setIpv6AddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Ipv6Address", targetDepth)) {
                    scheduledInstancesNetworkInterface.withIpv6Addresses(new ArrayList<ScheduledInstancesIpv6Address>());
                    continue;
                }

                if (context.testExpression("Ipv6Address/Ipv6Address", targetDepth)) {
                    scheduledInstancesNetworkInterface.withIpv6Addresses(ScheduledInstancesIpv6AddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    scheduledInstancesNetworkInterface.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    scheduledInstancesNetworkInterface.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PrivateIpAddressConfig", targetDepth)) {
                    scheduledInstancesNetworkInterface.withPrivateIpAddressConfigs(new ArrayList<ScheduledInstancesPrivateIpAddressConfig>());
                    continue;
                }

                if (context.testExpression("PrivateIpAddressConfig/PrivateIpAddressConfigSet", targetDepth)) {
                    scheduledInstancesNetworkInterface.withPrivateIpAddressConfigs(ScheduledInstancesPrivateIpAddressConfigStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

                if (context.testExpression("SecondaryPrivateIpAddressCount", targetDepth)) {
                    scheduledInstancesNetworkInterface.setSecondaryPrivateIpAddressCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubnetId", targetDepth)) {
                    scheduledInstancesNetworkInterface.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledInstancesNetworkInterface;
                }
            }
        }
    }

    private static ScheduledInstancesNetworkInterfaceStaxUnmarshaller instance;

    public static ScheduledInstancesNetworkInterfaceStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesNetworkInterfaceStaxUnmarshaller();
        return instance;
    }
}
