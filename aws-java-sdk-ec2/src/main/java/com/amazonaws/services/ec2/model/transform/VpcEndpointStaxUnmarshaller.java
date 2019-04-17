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
 * VpcEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpointStaxUnmarshaller implements Unmarshaller<VpcEndpoint, StaxUnmarshallerContext> {

    public VpcEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpcEndpoint vpcEndpoint = new VpcEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpcEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("vpcEndpointId", targetDepth)) {
                    vpcEndpoint.setVpcEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcEndpointType", targetDepth)) {
                    vpcEndpoint.setVpcEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcId", targetDepth)) {
                    vpcEndpoint.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceName", targetDepth)) {
                    vpcEndpoint.setServiceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    vpcEndpoint.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("policyDocument", targetDepth)) {
                    vpcEndpoint.setPolicyDocument(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeTableIdSet", targetDepth)) {
                    vpcEndpoint.withRouteTableIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("routeTableIdSet/item", targetDepth)) {
                    vpcEndpoint.withRouteTableIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetIdSet", targetDepth)) {
                    vpcEndpoint.withSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("subnetIdSet/item", targetDepth)) {
                    vpcEndpoint.withSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupSet", targetDepth)) {
                    vpcEndpoint.withGroups(new ArrayList<SecurityGroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    vpcEndpoint.withGroups(SecurityGroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateDnsEnabled", targetDepth)) {
                    vpcEndpoint.setPrivateDnsEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("requesterManaged", targetDepth)) {
                    vpcEndpoint.setRequesterManaged(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceIdSet", targetDepth)) {
                    vpcEndpoint.withNetworkInterfaceIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("networkInterfaceIdSet/item", targetDepth)) {
                    vpcEndpoint.withNetworkInterfaceIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("dnsEntrySet", targetDepth)) {
                    vpcEndpoint.withDnsEntries(new ArrayList<DnsEntry>());
                    continue;
                }

                if (context.testExpression("dnsEntrySet/item", targetDepth)) {
                    vpcEndpoint.withDnsEntries(DnsEntryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTimestamp", targetDepth)) {
                    vpcEndpoint.setCreationTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpcEndpoint;
                }
            }
        }
    }

    private static VpcEndpointStaxUnmarshaller instance;

    public static VpcEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcEndpointStaxUnmarshaller();
        return instance;
    }
}
