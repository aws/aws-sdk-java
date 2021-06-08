/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Explanation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExplanationStaxUnmarshaller implements Unmarshaller<Explanation, StaxUnmarshallerContext> {

    public Explanation unmarshall(StaxUnmarshallerContext context) throws Exception {
        Explanation explanation = new Explanation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return explanation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("acl", targetDepth)) {
                    explanation.setAcl(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("aclRule", targetDepth)) {
                    explanation.setAclRule(AnalysisAclRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("address", targetDepth)) {
                    explanation.setAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("addressSet", targetDepth)) {
                    explanation.withAddresses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("addressSet/item", targetDepth)) {
                    explanation.withAddresses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("attachedTo", targetDepth)) {
                    explanation.setAttachedTo(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZoneSet", targetDepth)) {
                    explanation.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("availabilityZoneSet/item", targetDepth)) {
                    explanation.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("cidrSet", targetDepth)) {
                    explanation.withCidrs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("cidrSet/item", targetDepth)) {
                    explanation.withCidrs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("component", targetDepth)) {
                    explanation.setComponent(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("customerGateway", targetDepth)) {
                    explanation.setCustomerGateway(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destination", targetDepth)) {
                    explanation.setDestination(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("destinationVpc", targetDepth)) {
                    explanation.setDestinationVpc(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("direction", targetDepth)) {
                    explanation.setDirection(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("explanationCode", targetDepth)) {
                    explanation.setExplanationCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ingressRouteTable", targetDepth)) {
                    explanation.setIngressRouteTable(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("internetGateway", targetDepth)) {
                    explanation.setInternetGateway(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerArn", targetDepth)) {
                    explanation.setLoadBalancerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("classicLoadBalancerListener", targetDepth)) {
                    explanation.setClassicLoadBalancerListener(AnalysisLoadBalancerListenerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerListenerPort", targetDepth)) {
                    explanation.setLoadBalancerListenerPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerTarget", targetDepth)) {
                    explanation.setLoadBalancerTarget(AnalysisLoadBalancerTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerTargetGroup", targetDepth)) {
                    explanation.setLoadBalancerTargetGroup(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerTargetGroupSet", targetDepth)) {
                    explanation.withLoadBalancerTargetGroups(new ArrayList<AnalysisComponent>());
                    continue;
                }

                if (context.testExpression("loadBalancerTargetGroupSet/item", targetDepth)) {
                    explanation.withLoadBalancerTargetGroups(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerTargetPort", targetDepth)) {
                    explanation.setLoadBalancerTargetPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticLoadBalancerListener", targetDepth)) {
                    explanation.setElasticLoadBalancerListener(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("missingComponent", targetDepth)) {
                    explanation.setMissingComponent(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("natGateway", targetDepth)) {
                    explanation.setNatGateway(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterface", targetDepth)) {
                    explanation.setNetworkInterface(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("packetField", targetDepth)) {
                    explanation.setPacketField(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcPeeringConnection", targetDepth)) {
                    explanation.setVpcPeeringConnection(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("port", targetDepth)) {
                    explanation.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("portRangeSet", targetDepth)) {
                    explanation.withPortRanges(new ArrayList<PortRange>());
                    continue;
                }

                if (context.testExpression("portRangeSet/item", targetDepth)) {
                    explanation.withPortRanges(PortRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("prefixList", targetDepth)) {
                    explanation.setPrefixList(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("protocolSet", targetDepth)) {
                    explanation.withProtocols(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("protocolSet/item", targetDepth)) {
                    explanation.withProtocols(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeTableRoute", targetDepth)) {
                    explanation.setRouteTableRoute(AnalysisRouteTableRouteStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("routeTable", targetDepth)) {
                    explanation.setRouteTable(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroup", targetDepth)) {
                    explanation.setSecurityGroup(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupRule", targetDepth)) {
                    explanation.setSecurityGroupRule(AnalysisSecurityGroupRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupSet", targetDepth)) {
                    explanation.withSecurityGroups(new ArrayList<AnalysisComponent>());
                    continue;
                }

                if (context.testExpression("securityGroupSet/item", targetDepth)) {
                    explanation.withSecurityGroups(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("sourceVpc", targetDepth)) {
                    explanation.setSourceVpc(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    explanation.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnet", targetDepth)) {
                    explanation.setSubnet(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetRouteTable", targetDepth)) {
                    explanation.setSubnetRouteTable(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpc", targetDepth)) {
                    explanation.setVpc(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcEndpoint", targetDepth)) {
                    explanation.setVpcEndpoint(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnConnection", targetDepth)) {
                    explanation.setVpnConnection(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpnGateway", targetDepth)) {
                    explanation.setVpnGateway(AnalysisComponentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return explanation;
                }
            }
        }
    }

    private static ExplanationStaxUnmarshaller instance;

    public static ExplanationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExplanationStaxUnmarshaller();
        return instance;
    }
}
