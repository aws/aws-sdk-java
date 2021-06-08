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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an explanation code for an unreachable path. For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer explanation
 * codes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Explanation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Explanation implements Serializable, Cloneable {

    /**
     * <p>
     * The network ACL.
     * </p>
     */
    private AnalysisComponent acl;
    /**
     * <p>
     * The network ACL rule.
     * </p>
     */
    private AnalysisAclRule aclRule;
    /**
     * <p>
     * The IPv4 address, in CIDR notation.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The IPv4 addresses, in CIDR notation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addresses;
    /**
     * <p>
     * The resource to which the component is attached.
     * </p>
     */
    private AnalysisComponent attachedTo;
    /**
     * <p>
     * The Availability Zones.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The CIDR ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cidrs;
    /**
     * <p>
     * The component.
     * </p>
     */
    private AnalysisComponent component;
    /**
     * <p>
     * The customer gateway.
     * </p>
     */
    private AnalysisComponent customerGateway;
    /**
     * <p>
     * The destination.
     * </p>
     */
    private AnalysisComponent destination;
    /**
     * <p>
     * The destination VPC.
     * </p>
     */
    private AnalysisComponent destinationVpc;
    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     */
    private String direction;
    /**
     * <p>
     * The explanation code.
     * </p>
     */
    private String explanationCode;
    /**
     * <p>
     * The route table.
     * </p>
     */
    private AnalysisComponent ingressRouteTable;
    /**
     * <p>
     * The internet gateway.
     * </p>
     */
    private AnalysisComponent internetGateway;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The listener for a Classic Load Balancer.
     * </p>
     */
    private AnalysisLoadBalancerListener classicLoadBalancerListener;
    /**
     * <p>
     * The listener port of the load balancer.
     * </p>
     */
    private Integer loadBalancerListenerPort;
    /**
     * <p>
     * The target.
     * </p>
     */
    private AnalysisLoadBalancerTarget loadBalancerTarget;
    /**
     * <p>
     * The target group.
     * </p>
     */
    private AnalysisComponent loadBalancerTargetGroup;
    /**
     * <p>
     * The target groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AnalysisComponent> loadBalancerTargetGroups;
    /**
     * <p>
     * The target port.
     * </p>
     */
    private Integer loadBalancerTargetPort;
    /**
     * <p>
     * The load balancer listener.
     * </p>
     */
    private AnalysisComponent elasticLoadBalancerListener;
    /**
     * <p>
     * The missing component.
     * </p>
     */
    private String missingComponent;
    /**
     * <p>
     * The NAT gateway.
     * </p>
     */
    private AnalysisComponent natGateway;
    /**
     * <p>
     * The network interface.
     * </p>
     */
    private AnalysisComponent networkInterface;
    /**
     * <p>
     * The packet field.
     * </p>
     */
    private String packetField;
    /**
     * <p>
     * The VPC peering connection.
     * </p>
     */
    private AnalysisComponent vpcPeeringConnection;
    /**
     * <p>
     * The port.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The port ranges.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PortRange> portRanges;
    /**
     * <p>
     * The prefix list.
     * </p>
     */
    private AnalysisComponent prefixList;
    /**
     * <p>
     * The protocols.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> protocols;
    /**
     * <p>
     * The route table route.
     * </p>
     */
    private AnalysisRouteTableRoute routeTableRoute;
    /**
     * <p>
     * The route table.
     * </p>
     */
    private AnalysisComponent routeTable;
    /**
     * <p>
     * The security group.
     * </p>
     */
    private AnalysisComponent securityGroup;
    /**
     * <p>
     * The security group rule.
     * </p>
     */
    private AnalysisSecurityGroupRule securityGroupRule;
    /**
     * <p>
     * The security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AnalysisComponent> securityGroups;
    /**
     * <p>
     * The source VPC.
     * </p>
     */
    private AnalysisComponent sourceVpc;
    /**
     * <p>
     * The state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The subnet.
     * </p>
     */
    private AnalysisComponent subnet;
    /**
     * <p>
     * The route table for the subnet.
     * </p>
     */
    private AnalysisComponent subnetRouteTable;
    /**
     * <p>
     * The component VPC.
     * </p>
     */
    private AnalysisComponent vpc;
    /**
     * <p>
     * The VPC endpoint.
     * </p>
     */
    private AnalysisComponent vpcEndpoint;
    /**
     * <p>
     * The VPN connection.
     * </p>
     */
    private AnalysisComponent vpnConnection;
    /**
     * <p>
     * The VPN gateway.
     * </p>
     */
    private AnalysisComponent vpnGateway;

    /**
     * <p>
     * The network ACL.
     * </p>
     * 
     * @param acl
     *        The network ACL.
     */

    public void setAcl(AnalysisComponent acl) {
        this.acl = acl;
    }

    /**
     * <p>
     * The network ACL.
     * </p>
     * 
     * @return The network ACL.
     */

    public AnalysisComponent getAcl() {
        return this.acl;
    }

    /**
     * <p>
     * The network ACL.
     * </p>
     * 
     * @param acl
     *        The network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAcl(AnalysisComponent acl) {
        setAcl(acl);
        return this;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @param aclRule
     *        The network ACL rule.
     */

    public void setAclRule(AnalysisAclRule aclRule) {
        this.aclRule = aclRule;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @return The network ACL rule.
     */

    public AnalysisAclRule getAclRule() {
        return this.aclRule;
    }

    /**
     * <p>
     * The network ACL rule.
     * </p>
     * 
     * @param aclRule
     *        The network ACL rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAclRule(AnalysisAclRule aclRule) {
        setAclRule(aclRule);
        return this;
    }

    /**
     * <p>
     * The IPv4 address, in CIDR notation.
     * </p>
     * 
     * @param address
     *        The IPv4 address, in CIDR notation.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The IPv4 address, in CIDR notation.
     * </p>
     * 
     * @return The IPv4 address, in CIDR notation.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The IPv4 address, in CIDR notation.
     * </p>
     * 
     * @param address
     *        The IPv4 address, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses, in CIDR notation.
     * </p>
     * 
     * @return The IPv4 addresses, in CIDR notation.
     */

    public java.util.List<String> getAddresses() {
        if (addresses == null) {
            addresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addresses;
    }

    /**
     * <p>
     * The IPv4 addresses, in CIDR notation.
     * </p>
     * 
     * @param addresses
     *        The IPv4 addresses, in CIDR notation.
     */

    public void setAddresses(java.util.Collection<String> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new com.amazonaws.internal.SdkInternalList<String>(addresses);
    }

    /**
     * <p>
     * The IPv4 addresses, in CIDR notation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        The IPv4 addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAddresses(String... addresses) {
        if (this.addresses == null) {
            setAddresses(new com.amazonaws.internal.SdkInternalList<String>(addresses.length));
        }
        for (String ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses, in CIDR notation.
     * </p>
     * 
     * @param addresses
     *        The IPv4 addresses, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAddresses(java.util.Collection<String> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * The resource to which the component is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resource to which the component is attached.
     */

    public void setAttachedTo(AnalysisComponent attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The resource to which the component is attached.
     * </p>
     * 
     * @return The resource to which the component is attached.
     */

    public AnalysisComponent getAttachedTo() {
        return this.attachedTo;
    }

    /**
     * <p>
     * The resource to which the component is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resource to which the component is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAttachedTo(AnalysisComponent attachedTo) {
        setAttachedTo(attachedTo);
        return this;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @return The Availability Zones.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The CIDR ranges.
     * </p>
     * 
     * @return The CIDR ranges.
     */

    public java.util.List<String> getCidrs() {
        if (cidrs == null) {
            cidrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cidrs;
    }

    /**
     * <p>
     * The CIDR ranges.
     * </p>
     * 
     * @param cidrs
     *        The CIDR ranges.
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new com.amazonaws.internal.SdkInternalList<String>(cidrs);
    }

    /**
     * <p>
     * The CIDR ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        The CIDR ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new com.amazonaws.internal.SdkInternalList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CIDR ranges.
     * </p>
     * 
     * @param cidrs
     *        The CIDR ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @param component
     *        The component.
     */

    public void setComponent(AnalysisComponent component) {
        this.component = component;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @return The component.
     */

    public AnalysisComponent getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The component.
     * </p>
     * 
     * @param component
     *        The component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withComponent(AnalysisComponent component) {
        setComponent(component);
        return this;
    }

    /**
     * <p>
     * The customer gateway.
     * </p>
     * 
     * @param customerGateway
     *        The customer gateway.
     */

    public void setCustomerGateway(AnalysisComponent customerGateway) {
        this.customerGateway = customerGateway;
    }

    /**
     * <p>
     * The customer gateway.
     * </p>
     * 
     * @return The customer gateway.
     */

    public AnalysisComponent getCustomerGateway() {
        return this.customerGateway;
    }

    /**
     * <p>
     * The customer gateway.
     * </p>
     * 
     * @param customerGateway
     *        The customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withCustomerGateway(AnalysisComponent customerGateway) {
        setCustomerGateway(customerGateway);
        return this;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     */

    public void setDestination(AnalysisComponent destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @return The destination.
     */

    public AnalysisComponent getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withDestination(AnalysisComponent destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @param destinationVpc
     *        The destination VPC.
     */

    public void setDestinationVpc(AnalysisComponent destinationVpc) {
        this.destinationVpc = destinationVpc;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @return The destination VPC.
     */

    public AnalysisComponent getDestinationVpc() {
        return this.destinationVpc;
    }

    /**
     * <p>
     * The destination VPC.
     * </p>
     * 
     * @param destinationVpc
     *        The destination VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withDestinationVpc(AnalysisComponent destinationVpc) {
        setDestinationVpc(destinationVpc);
        return this;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The direction. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        egress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ingress
     *        </p>
     *        </li>
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @return The direction. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         egress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ingress
     *         </p>
     *         </li>
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The direction. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        egress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ingress
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The explanation code.
     * </p>
     * 
     * @param explanationCode
     *        The explanation code.
     */

    public void setExplanationCode(String explanationCode) {
        this.explanationCode = explanationCode;
    }

    /**
     * <p>
     * The explanation code.
     * </p>
     * 
     * @return The explanation code.
     */

    public String getExplanationCode() {
        return this.explanationCode;
    }

    /**
     * <p>
     * The explanation code.
     * </p>
     * 
     * @param explanationCode
     *        The explanation code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withExplanationCode(String explanationCode) {
        setExplanationCode(explanationCode);
        return this;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @param ingressRouteTable
     *        The route table.
     */

    public void setIngressRouteTable(AnalysisComponent ingressRouteTable) {
        this.ingressRouteTable = ingressRouteTable;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @return The route table.
     */

    public AnalysisComponent getIngressRouteTable() {
        return this.ingressRouteTable;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @param ingressRouteTable
     *        The route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withIngressRouteTable(AnalysisComponent ingressRouteTable) {
        setIngressRouteTable(ingressRouteTable);
        return this;
    }

    /**
     * <p>
     * The internet gateway.
     * </p>
     * 
     * @param internetGateway
     *        The internet gateway.
     */

    public void setInternetGateway(AnalysisComponent internetGateway) {
        this.internetGateway = internetGateway;
    }

    /**
     * <p>
     * The internet gateway.
     * </p>
     * 
     * @return The internet gateway.
     */

    public AnalysisComponent getInternetGateway() {
        return this.internetGateway;
    }

    /**
     * <p>
     * The internet gateway.
     * </p>
     * 
     * @param internetGateway
     *        The internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withInternetGateway(AnalysisComponent internetGateway) {
        setInternetGateway(internetGateway);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The listener for a Classic Load Balancer.
     * </p>
     * 
     * @param classicLoadBalancerListener
     *        The listener for a Classic Load Balancer.
     */

    public void setClassicLoadBalancerListener(AnalysisLoadBalancerListener classicLoadBalancerListener) {
        this.classicLoadBalancerListener = classicLoadBalancerListener;
    }

    /**
     * <p>
     * The listener for a Classic Load Balancer.
     * </p>
     * 
     * @return The listener for a Classic Load Balancer.
     */

    public AnalysisLoadBalancerListener getClassicLoadBalancerListener() {
        return this.classicLoadBalancerListener;
    }

    /**
     * <p>
     * The listener for a Classic Load Balancer.
     * </p>
     * 
     * @param classicLoadBalancerListener
     *        The listener for a Classic Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withClassicLoadBalancerListener(AnalysisLoadBalancerListener classicLoadBalancerListener) {
        setClassicLoadBalancerListener(classicLoadBalancerListener);
        return this;
    }

    /**
     * <p>
     * The listener port of the load balancer.
     * </p>
     * 
     * @param loadBalancerListenerPort
     *        The listener port of the load balancer.
     */

    public void setLoadBalancerListenerPort(Integer loadBalancerListenerPort) {
        this.loadBalancerListenerPort = loadBalancerListenerPort;
    }

    /**
     * <p>
     * The listener port of the load balancer.
     * </p>
     * 
     * @return The listener port of the load balancer.
     */

    public Integer getLoadBalancerListenerPort() {
        return this.loadBalancerListenerPort;
    }

    /**
     * <p>
     * The listener port of the load balancer.
     * </p>
     * 
     * @param loadBalancerListenerPort
     *        The listener port of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerListenerPort(Integer loadBalancerListenerPort) {
        setLoadBalancerListenerPort(loadBalancerListenerPort);
        return this;
    }

    /**
     * <p>
     * The target.
     * </p>
     * 
     * @param loadBalancerTarget
     *        The target.
     */

    public void setLoadBalancerTarget(AnalysisLoadBalancerTarget loadBalancerTarget) {
        this.loadBalancerTarget = loadBalancerTarget;
    }

    /**
     * <p>
     * The target.
     * </p>
     * 
     * @return The target.
     */

    public AnalysisLoadBalancerTarget getLoadBalancerTarget() {
        return this.loadBalancerTarget;
    }

    /**
     * <p>
     * The target.
     * </p>
     * 
     * @param loadBalancerTarget
     *        The target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerTarget(AnalysisLoadBalancerTarget loadBalancerTarget) {
        setLoadBalancerTarget(loadBalancerTarget);
        return this;
    }

    /**
     * <p>
     * The target group.
     * </p>
     * 
     * @param loadBalancerTargetGroup
     *        The target group.
     */

    public void setLoadBalancerTargetGroup(AnalysisComponent loadBalancerTargetGroup) {
        this.loadBalancerTargetGroup = loadBalancerTargetGroup;
    }

    /**
     * <p>
     * The target group.
     * </p>
     * 
     * @return The target group.
     */

    public AnalysisComponent getLoadBalancerTargetGroup() {
        return this.loadBalancerTargetGroup;
    }

    /**
     * <p>
     * The target group.
     * </p>
     * 
     * @param loadBalancerTargetGroup
     *        The target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerTargetGroup(AnalysisComponent loadBalancerTargetGroup) {
        setLoadBalancerTargetGroup(loadBalancerTargetGroup);
        return this;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @return The target groups.
     */

    public java.util.List<AnalysisComponent> getLoadBalancerTargetGroups() {
        if (loadBalancerTargetGroups == null) {
            loadBalancerTargetGroups = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>();
        }
        return loadBalancerTargetGroups;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @param loadBalancerTargetGroups
     *        The target groups.
     */

    public void setLoadBalancerTargetGroups(java.util.Collection<AnalysisComponent> loadBalancerTargetGroups) {
        if (loadBalancerTargetGroups == null) {
            this.loadBalancerTargetGroups = null;
            return;
        }

        this.loadBalancerTargetGroups = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(loadBalancerTargetGroups);
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerTargetGroups(java.util.Collection)} or
     * {@link #withLoadBalancerTargetGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerTargetGroups
     *        The target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerTargetGroups(AnalysisComponent... loadBalancerTargetGroups) {
        if (this.loadBalancerTargetGroups == null) {
            setLoadBalancerTargetGroups(new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(loadBalancerTargetGroups.length));
        }
        for (AnalysisComponent ele : loadBalancerTargetGroups) {
            this.loadBalancerTargetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @param loadBalancerTargetGroups
     *        The target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerTargetGroups(java.util.Collection<AnalysisComponent> loadBalancerTargetGroups) {
        setLoadBalancerTargetGroups(loadBalancerTargetGroups);
        return this;
    }

    /**
     * <p>
     * The target port.
     * </p>
     * 
     * @param loadBalancerTargetPort
     *        The target port.
     */

    public void setLoadBalancerTargetPort(Integer loadBalancerTargetPort) {
        this.loadBalancerTargetPort = loadBalancerTargetPort;
    }

    /**
     * <p>
     * The target port.
     * </p>
     * 
     * @return The target port.
     */

    public Integer getLoadBalancerTargetPort() {
        return this.loadBalancerTargetPort;
    }

    /**
     * <p>
     * The target port.
     * </p>
     * 
     * @param loadBalancerTargetPort
     *        The target port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withLoadBalancerTargetPort(Integer loadBalancerTargetPort) {
        setLoadBalancerTargetPort(loadBalancerTargetPort);
        return this;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @param elasticLoadBalancerListener
     *        The load balancer listener.
     */

    public void setElasticLoadBalancerListener(AnalysisComponent elasticLoadBalancerListener) {
        this.elasticLoadBalancerListener = elasticLoadBalancerListener;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @return The load balancer listener.
     */

    public AnalysisComponent getElasticLoadBalancerListener() {
        return this.elasticLoadBalancerListener;
    }

    /**
     * <p>
     * The load balancer listener.
     * </p>
     * 
     * @param elasticLoadBalancerListener
     *        The load balancer listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withElasticLoadBalancerListener(AnalysisComponent elasticLoadBalancerListener) {
        setElasticLoadBalancerListener(elasticLoadBalancerListener);
        return this;
    }

    /**
     * <p>
     * The missing component.
     * </p>
     * 
     * @param missingComponent
     *        The missing component.
     */

    public void setMissingComponent(String missingComponent) {
        this.missingComponent = missingComponent;
    }

    /**
     * <p>
     * The missing component.
     * </p>
     * 
     * @return The missing component.
     */

    public String getMissingComponent() {
        return this.missingComponent;
    }

    /**
     * <p>
     * The missing component.
     * </p>
     * 
     * @param missingComponent
     *        The missing component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withMissingComponent(String missingComponent) {
        setMissingComponent(missingComponent);
        return this;
    }

    /**
     * <p>
     * The NAT gateway.
     * </p>
     * 
     * @param natGateway
     *        The NAT gateway.
     */

    public void setNatGateway(AnalysisComponent natGateway) {
        this.natGateway = natGateway;
    }

    /**
     * <p>
     * The NAT gateway.
     * </p>
     * 
     * @return The NAT gateway.
     */

    public AnalysisComponent getNatGateway() {
        return this.natGateway;
    }

    /**
     * <p>
     * The NAT gateway.
     * </p>
     * 
     * @param natGateway
     *        The NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withNatGateway(AnalysisComponent natGateway) {
        setNatGateway(natGateway);
        return this;
    }

    /**
     * <p>
     * The network interface.
     * </p>
     * 
     * @param networkInterface
     *        The network interface.
     */

    public void setNetworkInterface(AnalysisComponent networkInterface) {
        this.networkInterface = networkInterface;
    }

    /**
     * <p>
     * The network interface.
     * </p>
     * 
     * @return The network interface.
     */

    public AnalysisComponent getNetworkInterface() {
        return this.networkInterface;
    }

    /**
     * <p>
     * The network interface.
     * </p>
     * 
     * @param networkInterface
     *        The network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withNetworkInterface(AnalysisComponent networkInterface) {
        setNetworkInterface(networkInterface);
        return this;
    }

    /**
     * <p>
     * The packet field.
     * </p>
     * 
     * @param packetField
     *        The packet field.
     */

    public void setPacketField(String packetField) {
        this.packetField = packetField;
    }

    /**
     * <p>
     * The packet field.
     * </p>
     * 
     * @return The packet field.
     */

    public String getPacketField() {
        return this.packetField;
    }

    /**
     * <p>
     * The packet field.
     * </p>
     * 
     * @param packetField
     *        The packet field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withPacketField(String packetField) {
        setPacketField(packetField);
        return this;
    }

    /**
     * <p>
     * The VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnection
     *        The VPC peering connection.
     */

    public void setVpcPeeringConnection(AnalysisComponent vpcPeeringConnection) {
        this.vpcPeeringConnection = vpcPeeringConnection;
    }

    /**
     * <p>
     * The VPC peering connection.
     * </p>
     * 
     * @return The VPC peering connection.
     */

    public AnalysisComponent getVpcPeeringConnection() {
        return this.vpcPeeringConnection;
    }

    /**
     * <p>
     * The VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnection
     *        The VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withVpcPeeringConnection(AnalysisComponent vpcPeeringConnection) {
        setVpcPeeringConnection(vpcPeeringConnection);
        return this;
    }

    /**
     * <p>
     * The port.
     * </p>
     * 
     * @param port
     *        The port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port.
     * </p>
     * 
     * @return The port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port.
     * </p>
     * 
     * @param port
     *        The port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The port ranges.
     * </p>
     * 
     * @return The port ranges.
     */

    public java.util.List<PortRange> getPortRanges() {
        if (portRanges == null) {
            portRanges = new com.amazonaws.internal.SdkInternalList<PortRange>();
        }
        return portRanges;
    }

    /**
     * <p>
     * The port ranges.
     * </p>
     * 
     * @param portRanges
     *        The port ranges.
     */

    public void setPortRanges(java.util.Collection<PortRange> portRanges) {
        if (portRanges == null) {
            this.portRanges = null;
            return;
        }

        this.portRanges = new com.amazonaws.internal.SdkInternalList<PortRange>(portRanges);
    }

    /**
     * <p>
     * The port ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRanges(java.util.Collection)} or {@link #withPortRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRanges
     *        The port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withPortRanges(PortRange... portRanges) {
        if (this.portRanges == null) {
            setPortRanges(new com.amazonaws.internal.SdkInternalList<PortRange>(portRanges.length));
        }
        for (PortRange ele : portRanges) {
            this.portRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The port ranges.
     * </p>
     * 
     * @param portRanges
     *        The port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
        return this;
    }

    /**
     * <p>
     * The prefix list.
     * </p>
     * 
     * @param prefixList
     *        The prefix list.
     */

    public void setPrefixList(AnalysisComponent prefixList) {
        this.prefixList = prefixList;
    }

    /**
     * <p>
     * The prefix list.
     * </p>
     * 
     * @return The prefix list.
     */

    public AnalysisComponent getPrefixList() {
        return this.prefixList;
    }

    /**
     * <p>
     * The prefix list.
     * </p>
     * 
     * @param prefixList
     *        The prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withPrefixList(AnalysisComponent prefixList) {
        setPrefixList(prefixList);
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @return The protocols.
     */

    public java.util.List<String> getProtocols() {
        if (protocols == null) {
            protocols = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return protocols;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new com.amazonaws.internal.SdkInternalList<String>(protocols);
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new com.amazonaws.internal.SdkInternalList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols.
     * </p>
     * 
     * @param protocols
     *        The protocols.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @param routeTableRoute
     *        The route table route.
     */

    public void setRouteTableRoute(AnalysisRouteTableRoute routeTableRoute) {
        this.routeTableRoute = routeTableRoute;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @return The route table route.
     */

    public AnalysisRouteTableRoute getRouteTableRoute() {
        return this.routeTableRoute;
    }

    /**
     * <p>
     * The route table route.
     * </p>
     * 
     * @param routeTableRoute
     *        The route table route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withRouteTableRoute(AnalysisRouteTableRoute routeTableRoute) {
        setRouteTableRoute(routeTableRoute);
        return this;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @param routeTable
     *        The route table.
     */

    public void setRouteTable(AnalysisComponent routeTable) {
        this.routeTable = routeTable;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @return The route table.
     */

    public AnalysisComponent getRouteTable() {
        return this.routeTable;
    }

    /**
     * <p>
     * The route table.
     * </p>
     * 
     * @param routeTable
     *        The route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withRouteTable(AnalysisComponent routeTable) {
        setRouteTable(routeTable);
        return this;
    }

    /**
     * <p>
     * The security group.
     * </p>
     * 
     * @param securityGroup
     *        The security group.
     */

    public void setSecurityGroup(AnalysisComponent securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * <p>
     * The security group.
     * </p>
     * 
     * @return The security group.
     */

    public AnalysisComponent getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * <p>
     * The security group.
     * </p>
     * 
     * @param securityGroup
     *        The security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSecurityGroup(AnalysisComponent securityGroup) {
        setSecurityGroup(securityGroup);
        return this;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        The security group rule.
     */

    public void setSecurityGroupRule(AnalysisSecurityGroupRule securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @return The security group rule.
     */

    public AnalysisSecurityGroupRule getSecurityGroupRule() {
        return this.securityGroupRule;
    }

    /**
     * <p>
     * The security group rule.
     * </p>
     * 
     * @param securityGroupRule
     *        The security group rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSecurityGroupRule(AnalysisSecurityGroupRule securityGroupRule) {
        setSecurityGroupRule(securityGroupRule);
        return this;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * 
     * @return The security groups.
     */

    public java.util.List<AnalysisComponent> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * 
     * @param securityGroups
     *        The security groups.
     */

    public void setSecurityGroups(java.util.Collection<AnalysisComponent> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(securityGroups);
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSecurityGroups(AnalysisComponent... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(securityGroups.length));
        }
        for (AnalysisComponent ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * 
     * @param securityGroups
     *        The security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSecurityGroups(java.util.Collection<AnalysisComponent> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @param sourceVpc
     *        The source VPC.
     */

    public void setSourceVpc(AnalysisComponent sourceVpc) {
        this.sourceVpc = sourceVpc;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @return The source VPC.
     */

    public AnalysisComponent getSourceVpc() {
        return this.sourceVpc;
    }

    /**
     * <p>
     * The source VPC.
     * </p>
     * 
     * @param sourceVpc
     *        The source VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSourceVpc(AnalysisComponent sourceVpc) {
        setSourceVpc(sourceVpc);
        return this;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @param state
     *        The state.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @return The state.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @param state
     *        The state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @param subnet
     *        The subnet.
     */

    public void setSubnet(AnalysisComponent subnet) {
        this.subnet = subnet;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @return The subnet.
     */

    public AnalysisComponent getSubnet() {
        return this.subnet;
    }

    /**
     * <p>
     * The subnet.
     * </p>
     * 
     * @param subnet
     *        The subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSubnet(AnalysisComponent subnet) {
        setSubnet(subnet);
        return this;
    }

    /**
     * <p>
     * The route table for the subnet.
     * </p>
     * 
     * @param subnetRouteTable
     *        The route table for the subnet.
     */

    public void setSubnetRouteTable(AnalysisComponent subnetRouteTable) {
        this.subnetRouteTable = subnetRouteTable;
    }

    /**
     * <p>
     * The route table for the subnet.
     * </p>
     * 
     * @return The route table for the subnet.
     */

    public AnalysisComponent getSubnetRouteTable() {
        return this.subnetRouteTable;
    }

    /**
     * <p>
     * The route table for the subnet.
     * </p>
     * 
     * @param subnetRouteTable
     *        The route table for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withSubnetRouteTable(AnalysisComponent subnetRouteTable) {
        setSubnetRouteTable(subnetRouteTable);
        return this;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @param vpc
     *        The component VPC.
     */

    public void setVpc(AnalysisComponent vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @return The component VPC.
     */

    public AnalysisComponent getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * The component VPC.
     * </p>
     * 
     * @param vpc
     *        The component VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withVpc(AnalysisComponent vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * The VPC endpoint.
     * </p>
     * 
     * @param vpcEndpoint
     *        The VPC endpoint.
     */

    public void setVpcEndpoint(AnalysisComponent vpcEndpoint) {
        this.vpcEndpoint = vpcEndpoint;
    }

    /**
     * <p>
     * The VPC endpoint.
     * </p>
     * 
     * @return The VPC endpoint.
     */

    public AnalysisComponent getVpcEndpoint() {
        return this.vpcEndpoint;
    }

    /**
     * <p>
     * The VPC endpoint.
     * </p>
     * 
     * @param vpcEndpoint
     *        The VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withVpcEndpoint(AnalysisComponent vpcEndpoint) {
        setVpcEndpoint(vpcEndpoint);
        return this;
    }

    /**
     * <p>
     * The VPN connection.
     * </p>
     * 
     * @param vpnConnection
     *        The VPN connection.
     */

    public void setVpnConnection(AnalysisComponent vpnConnection) {
        this.vpnConnection = vpnConnection;
    }

    /**
     * <p>
     * The VPN connection.
     * </p>
     * 
     * @return The VPN connection.
     */

    public AnalysisComponent getVpnConnection() {
        return this.vpnConnection;
    }

    /**
     * <p>
     * The VPN connection.
     * </p>
     * 
     * @param vpnConnection
     *        The VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withVpnConnection(AnalysisComponent vpnConnection) {
        setVpnConnection(vpnConnection);
        return this;
    }

    /**
     * <p>
     * The VPN gateway.
     * </p>
     * 
     * @param vpnGateway
     *        The VPN gateway.
     */

    public void setVpnGateway(AnalysisComponent vpnGateway) {
        this.vpnGateway = vpnGateway;
    }

    /**
     * <p>
     * The VPN gateway.
     * </p>
     * 
     * @return The VPN gateway.
     */

    public AnalysisComponent getVpnGateway() {
        return this.vpnGateway;
    }

    /**
     * <p>
     * The VPN gateway.
     * </p>
     * 
     * @param vpnGateway
     *        The VPN gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Explanation withVpnGateway(AnalysisComponent vpnGateway) {
        setVpnGateway(vpnGateway);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAcl() != null)
            sb.append("Acl: ").append(getAcl()).append(",");
        if (getAclRule() != null)
            sb.append("AclRule: ").append(getAclRule()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getAddresses() != null)
            sb.append("Addresses: ").append(getAddresses()).append(",");
        if (getAttachedTo() != null)
            sb.append("AttachedTo: ").append(getAttachedTo()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getCidrs() != null)
            sb.append("Cidrs: ").append(getCidrs()).append(",");
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getCustomerGateway() != null)
            sb.append("CustomerGateway: ").append(getCustomerGateway()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationVpc() != null)
            sb.append("DestinationVpc: ").append(getDestinationVpc()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getExplanationCode() != null)
            sb.append("ExplanationCode: ").append(getExplanationCode()).append(",");
        if (getIngressRouteTable() != null)
            sb.append("IngressRouteTable: ").append(getIngressRouteTable()).append(",");
        if (getInternetGateway() != null)
            sb.append("InternetGateway: ").append(getInternetGateway()).append(",");
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getClassicLoadBalancerListener() != null)
            sb.append("ClassicLoadBalancerListener: ").append(getClassicLoadBalancerListener()).append(",");
        if (getLoadBalancerListenerPort() != null)
            sb.append("LoadBalancerListenerPort: ").append(getLoadBalancerListenerPort()).append(",");
        if (getLoadBalancerTarget() != null)
            sb.append("LoadBalancerTarget: ").append(getLoadBalancerTarget()).append(",");
        if (getLoadBalancerTargetGroup() != null)
            sb.append("LoadBalancerTargetGroup: ").append(getLoadBalancerTargetGroup()).append(",");
        if (getLoadBalancerTargetGroups() != null)
            sb.append("LoadBalancerTargetGroups: ").append(getLoadBalancerTargetGroups()).append(",");
        if (getLoadBalancerTargetPort() != null)
            sb.append("LoadBalancerTargetPort: ").append(getLoadBalancerTargetPort()).append(",");
        if (getElasticLoadBalancerListener() != null)
            sb.append("ElasticLoadBalancerListener: ").append(getElasticLoadBalancerListener()).append(",");
        if (getMissingComponent() != null)
            sb.append("MissingComponent: ").append(getMissingComponent()).append(",");
        if (getNatGateway() != null)
            sb.append("NatGateway: ").append(getNatGateway()).append(",");
        if (getNetworkInterface() != null)
            sb.append("NetworkInterface: ").append(getNetworkInterface()).append(",");
        if (getPacketField() != null)
            sb.append("PacketField: ").append(getPacketField()).append(",");
        if (getVpcPeeringConnection() != null)
            sb.append("VpcPeeringConnection: ").append(getVpcPeeringConnection()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges()).append(",");
        if (getPrefixList() != null)
            sb.append("PrefixList: ").append(getPrefixList()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getRouteTableRoute() != null)
            sb.append("RouteTableRoute: ").append(getRouteTableRoute()).append(",");
        if (getRouteTable() != null)
            sb.append("RouteTable: ").append(getRouteTable()).append(",");
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append(getSecurityGroup()).append(",");
        if (getSecurityGroupRule() != null)
            sb.append("SecurityGroupRule: ").append(getSecurityGroupRule()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSourceVpc() != null)
            sb.append("SourceVpc: ").append(getSourceVpc()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSubnet() != null)
            sb.append("Subnet: ").append(getSubnet()).append(",");
        if (getSubnetRouteTable() != null)
            sb.append("SubnetRouteTable: ").append(getSubnetRouteTable()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getVpcEndpoint() != null)
            sb.append("VpcEndpoint: ").append(getVpcEndpoint()).append(",");
        if (getVpnConnection() != null)
            sb.append("VpnConnection: ").append(getVpnConnection()).append(",");
        if (getVpnGateway() != null)
            sb.append("VpnGateway: ").append(getVpnGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Explanation == false)
            return false;
        Explanation other = (Explanation) obj;
        if (other.getAcl() == null ^ this.getAcl() == null)
            return false;
        if (other.getAcl() != null && other.getAcl().equals(this.getAcl()) == false)
            return false;
        if (other.getAclRule() == null ^ this.getAclRule() == null)
            return false;
        if (other.getAclRule() != null && other.getAclRule().equals(this.getAclRule()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getCustomerGateway() == null ^ this.getCustomerGateway() == null)
            return false;
        if (other.getCustomerGateway() != null && other.getCustomerGateway().equals(this.getCustomerGateway()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationVpc() == null ^ this.getDestinationVpc() == null)
            return false;
        if (other.getDestinationVpc() != null && other.getDestinationVpc().equals(this.getDestinationVpc()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getExplanationCode() == null ^ this.getExplanationCode() == null)
            return false;
        if (other.getExplanationCode() != null && other.getExplanationCode().equals(this.getExplanationCode()) == false)
            return false;
        if (other.getIngressRouteTable() == null ^ this.getIngressRouteTable() == null)
            return false;
        if (other.getIngressRouteTable() != null && other.getIngressRouteTable().equals(this.getIngressRouteTable()) == false)
            return false;
        if (other.getInternetGateway() == null ^ this.getInternetGateway() == null)
            return false;
        if (other.getInternetGateway() != null && other.getInternetGateway().equals(this.getInternetGateway()) == false)
            return false;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getClassicLoadBalancerListener() == null ^ this.getClassicLoadBalancerListener() == null)
            return false;
        if (other.getClassicLoadBalancerListener() != null && other.getClassicLoadBalancerListener().equals(this.getClassicLoadBalancerListener()) == false)
            return false;
        if (other.getLoadBalancerListenerPort() == null ^ this.getLoadBalancerListenerPort() == null)
            return false;
        if (other.getLoadBalancerListenerPort() != null && other.getLoadBalancerListenerPort().equals(this.getLoadBalancerListenerPort()) == false)
            return false;
        if (other.getLoadBalancerTarget() == null ^ this.getLoadBalancerTarget() == null)
            return false;
        if (other.getLoadBalancerTarget() != null && other.getLoadBalancerTarget().equals(this.getLoadBalancerTarget()) == false)
            return false;
        if (other.getLoadBalancerTargetGroup() == null ^ this.getLoadBalancerTargetGroup() == null)
            return false;
        if (other.getLoadBalancerTargetGroup() != null && other.getLoadBalancerTargetGroup().equals(this.getLoadBalancerTargetGroup()) == false)
            return false;
        if (other.getLoadBalancerTargetGroups() == null ^ this.getLoadBalancerTargetGroups() == null)
            return false;
        if (other.getLoadBalancerTargetGroups() != null && other.getLoadBalancerTargetGroups().equals(this.getLoadBalancerTargetGroups()) == false)
            return false;
        if (other.getLoadBalancerTargetPort() == null ^ this.getLoadBalancerTargetPort() == null)
            return false;
        if (other.getLoadBalancerTargetPort() != null && other.getLoadBalancerTargetPort().equals(this.getLoadBalancerTargetPort()) == false)
            return false;
        if (other.getElasticLoadBalancerListener() == null ^ this.getElasticLoadBalancerListener() == null)
            return false;
        if (other.getElasticLoadBalancerListener() != null && other.getElasticLoadBalancerListener().equals(this.getElasticLoadBalancerListener()) == false)
            return false;
        if (other.getMissingComponent() == null ^ this.getMissingComponent() == null)
            return false;
        if (other.getMissingComponent() != null && other.getMissingComponent().equals(this.getMissingComponent()) == false)
            return false;
        if (other.getNatGateway() == null ^ this.getNatGateway() == null)
            return false;
        if (other.getNatGateway() != null && other.getNatGateway().equals(this.getNatGateway()) == false)
            return false;
        if (other.getNetworkInterface() == null ^ this.getNetworkInterface() == null)
            return false;
        if (other.getNetworkInterface() != null && other.getNetworkInterface().equals(this.getNetworkInterface()) == false)
            return false;
        if (other.getPacketField() == null ^ this.getPacketField() == null)
            return false;
        if (other.getPacketField() != null && other.getPacketField().equals(this.getPacketField()) == false)
            return false;
        if (other.getVpcPeeringConnection() == null ^ this.getVpcPeeringConnection() == null)
            return false;
        if (other.getVpcPeeringConnection() != null && other.getVpcPeeringConnection().equals(this.getVpcPeeringConnection()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
            return false;
        if (other.getPrefixList() == null ^ this.getPrefixList() == null)
            return false;
        if (other.getPrefixList() != null && other.getPrefixList().equals(this.getPrefixList()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getRouteTableRoute() == null ^ this.getRouteTableRoute() == null)
            return false;
        if (other.getRouteTableRoute() != null && other.getRouteTableRoute().equals(this.getRouteTableRoute()) == false)
            return false;
        if (other.getRouteTable() == null ^ this.getRouteTable() == null)
            return false;
        if (other.getRouteTable() != null && other.getRouteTable().equals(this.getRouteTable()) == false)
            return false;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        if (other.getSecurityGroupRule() == null ^ this.getSecurityGroupRule() == null)
            return false;
        if (other.getSecurityGroupRule() != null && other.getSecurityGroupRule().equals(this.getSecurityGroupRule()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceVpc() == null ^ this.getSourceVpc() == null)
            return false;
        if (other.getSourceVpc() != null && other.getSourceVpc().equals(this.getSourceVpc()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubnet() == null ^ this.getSubnet() == null)
            return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false)
            return false;
        if (other.getSubnetRouteTable() == null ^ this.getSubnetRouteTable() == null)
            return false;
        if (other.getSubnetRouteTable() != null && other.getSubnetRouteTable().equals(this.getSubnetRouteTable()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getVpcEndpoint() == null ^ this.getVpcEndpoint() == null)
            return false;
        if (other.getVpcEndpoint() != null && other.getVpcEndpoint().equals(this.getVpcEndpoint()) == false)
            return false;
        if (other.getVpnConnection() == null ^ this.getVpnConnection() == null)
            return false;
        if (other.getVpnConnection() != null && other.getVpnConnection().equals(this.getVpnConnection()) == false)
            return false;
        if (other.getVpnGateway() == null ^ this.getVpnGateway() == null)
            return false;
        if (other.getVpnGateway() != null && other.getVpnGateway().equals(this.getVpnGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcl() == null) ? 0 : getAcl().hashCode());
        hashCode = prime * hashCode + ((getAclRule() == null) ? 0 : getAclRule().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getCustomerGateway() == null) ? 0 : getCustomerGateway().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationVpc() == null) ? 0 : getDestinationVpc().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getExplanationCode() == null) ? 0 : getExplanationCode().hashCode());
        hashCode = prime * hashCode + ((getIngressRouteTable() == null) ? 0 : getIngressRouteTable().hashCode());
        hashCode = prime * hashCode + ((getInternetGateway() == null) ? 0 : getInternetGateway().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getClassicLoadBalancerListener() == null) ? 0 : getClassicLoadBalancerListener().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerListenerPort() == null) ? 0 : getLoadBalancerListenerPort().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerTarget() == null) ? 0 : getLoadBalancerTarget().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerTargetGroup() == null) ? 0 : getLoadBalancerTargetGroup().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerTargetGroups() == null) ? 0 : getLoadBalancerTargetGroups().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerTargetPort() == null) ? 0 : getLoadBalancerTargetPort().hashCode());
        hashCode = prime * hashCode + ((getElasticLoadBalancerListener() == null) ? 0 : getElasticLoadBalancerListener().hashCode());
        hashCode = prime * hashCode + ((getMissingComponent() == null) ? 0 : getMissingComponent().hashCode());
        hashCode = prime * hashCode + ((getNatGateway() == null) ? 0 : getNatGateway().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterface() == null) ? 0 : getNetworkInterface().hashCode());
        hashCode = prime * hashCode + ((getPacketField() == null) ? 0 : getPacketField().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnection() == null) ? 0 : getVpcPeeringConnection().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        hashCode = prime * hashCode + ((getPrefixList() == null) ? 0 : getPrefixList().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getRouteTableRoute() == null) ? 0 : getRouteTableRoute().hashCode());
        hashCode = prime * hashCode + ((getRouteTable() == null) ? 0 : getRouteTable().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupRule() == null) ? 0 : getSecurityGroupRule().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSourceVpc() == null) ? 0 : getSourceVpc().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode());
        hashCode = prime * hashCode + ((getSubnetRouteTable() == null) ? 0 : getSubnetRouteTable().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoint() == null) ? 0 : getVpcEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpnConnection() == null) ? 0 : getVpnConnection().hashCode());
        hashCode = prime * hashCode + ((getVpnGateway() == null) ? 0 : getVpnGateway().hashCode());
        return hashCode;
    }

    @Override
    public Explanation clone() {
        try {
            return (Explanation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
