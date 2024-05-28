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
 * IpamDiscoveredPublicAddress StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamDiscoveredPublicAddressStaxUnmarshaller implements Unmarshaller<IpamDiscoveredPublicAddress, StaxUnmarshallerContext> {

    public IpamDiscoveredPublicAddress unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamDiscoveredPublicAddress ipamDiscoveredPublicAddress = new IpamDiscoveredPublicAddress();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamDiscoveredPublicAddress;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ipamResourceDiscoveryId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setIpamResourceDiscoveryId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressRegion", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAddressRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("address", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressOwnerId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAddressOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressAllocationId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAddressAllocationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("associationStatus", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAssociationStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressType", targetDepth)) {
                    ipamDiscoveredPublicAddress.setAddressType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("service", targetDepth)) {
                    ipamDiscoveredPublicAddress.setService(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceResource", targetDepth)) {
                    ipamDiscoveredPublicAddress.setServiceResource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("publicIpv4PoolId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setPublicIpv4PoolId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceDescription", targetDepth)) {
                    ipamDiscoveredPublicAddress.setNetworkInterfaceDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    ipamDiscoveredPublicAddress.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tags", targetDepth)) {
                    ipamDiscoveredPublicAddress.setTags(IpamPublicAddressTagsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkBorderGroup", targetDepth)) {
                    ipamDiscoveredPublicAddress.setNetworkBorderGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupSet", targetDepth)) {
                    ipamDiscoveredPublicAddress.withSecurityGroups(new ArrayList<IpamPublicAddressSecurityGroup>());
                    continue;
                }

                if (context.testExpression("securityGroupSet/item", targetDepth)) {
                    ipamDiscoveredPublicAddress.withSecurityGroups(IpamPublicAddressSecurityGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sampleTime", targetDepth)) {
                    ipamDiscoveredPublicAddress.setSampleTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamDiscoveredPublicAddress;
                }
            }
        }
    }

    private static IpamDiscoveredPublicAddressStaxUnmarshaller instance;

    public static IpamDiscoveredPublicAddressStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamDiscoveredPublicAddressStaxUnmarshaller();
        return instance;
    }
}
