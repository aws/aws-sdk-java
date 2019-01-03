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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/LoadBalancer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancer implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     * </p>
     */
    private String canonicalHostedZoneId;
    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     */
    private String scheme;
    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The state of the load balancer.
     * </p>
     */
    private LoadBalancerState state;
    /**
     * <p>
     * The type of load balancer.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;
    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     */
    private String ipAddressType;

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

    public LoadBalancer withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The public DNS name of the load balancer.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * 
     * @return The public DNS name of the load balancer.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The public DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The public DNS name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneId
     *        The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     */

    public void setCanonicalHostedZoneId(String canonicalHostedZoneId) {
        this.canonicalHostedZoneId = canonicalHostedZoneId;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     * </p>
     * 
     * @return The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     */

    public String getCanonicalHostedZoneId() {
        return this.canonicalHostedZoneId;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneId
     *        The ID of the Amazon Route 53 hosted zone associated with the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withCanonicalHostedZoneId(String canonicalHostedZoneId) {
        setCanonicalHostedZoneId(canonicalHostedZoneId);
        return this;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the load balancer was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @return The date and time the load balancer was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the load balancer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     * 
     * @param scheme
     *        The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing
     *        load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing
     *        load balancers can route requests from clients over the internet.</p>
     *        <p>
     *        The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *        balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *        balancers can only route requests from clients with access to the VPC for the load balancer.
     * @see LoadBalancerSchemeEnum
     */

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     * 
     * @return The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an
     *         Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore,
     *         Internet-facing load balancers can route requests from clients over the internet.</p>
     *         <p>
     *         The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *         balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *         balancers can only route requests from clients with access to the VPC for the load balancer.
     * @see LoadBalancerSchemeEnum
     */

    public String getScheme() {
        return this.scheme;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     * 
     * @param scheme
     *        The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing
     *        load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing
     *        load balancers can route requests from clients over the internet.</p>
     *        <p>
     *        The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *        balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *        balancers can only route requests from clients with access to the VPC for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerSchemeEnum
     */

    public LoadBalancer withScheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     * 
     * @param scheme
     *        The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing
     *        load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing
     *        load balancers can route requests from clients over the internet.</p>
     *        <p>
     *        The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *        balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *        balancers can only route requests from clients with access to the VPC for the load balancer.
     * @see LoadBalancerSchemeEnum
     */

    public void setScheme(LoadBalancerSchemeEnum scheme) {
        withScheme(scheme);
    }

    /**
     * <p>
     * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load
     * balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load
     * balancers can route requests from clients over the internet.
     * </p>
     * <p>
     * The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer
     * is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only
     * route requests from clients with access to the VPC for the load balancer.
     * </p>
     * 
     * @param scheme
     *        The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing
     *        load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing
     *        load balancers can route requests from clients over the internet.</p>
     *        <p>
     *        The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *        balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *        balancers can only route requests from clients with access to the VPC for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerSchemeEnum
     */

    public LoadBalancer withScheme(LoadBalancerSchemeEnum scheme) {
        this.scheme = scheme.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the load balancer.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @return The ID of the VPC for the load balancer.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     * 
     * @param state
     *        The state of the load balancer.
     */

    public void setState(LoadBalancerState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     * 
     * @return The state of the load balancer.
     */

    public LoadBalancerState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the load balancer.
     * </p>
     * 
     * @param state
     *        The state of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withState(LoadBalancerState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * 
     * @param type
     *        The type of load balancer.
     * @see LoadBalancerTypeEnum
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * 
     * @return The type of load balancer.
     * @see LoadBalancerTypeEnum
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * 
     * @param type
     *        The type of load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTypeEnum
     */

    public LoadBalancer withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * 
     * @param type
     *        The type of load balancer.
     * @see LoadBalancerTypeEnum
     */

    public void setType(LoadBalancerTypeEnum type) {
        withType(type);
    }

    /**
     * <p>
     * The type of load balancer.
     * </p>
     * 
     * @param type
     *        The type of load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTypeEnum
     */

    public LoadBalancer withType(LoadBalancerTypeEnum type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @return The Availability Zones for the load balancer.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @return The IDs of the security groups for the load balancer.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups for the load balancer.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancer withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP addresses used by the subnets for your load balancer. The possible values are
     *        <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * 
     * @return The type of IP addresses used by the subnets for your load balancer. The possible values are
     *         <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP addresses used by the subnets for your load balancer. The possible values are
     *        <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public LoadBalancer withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP addresses used by the subnets for your load balancer. The possible values are
     *        <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * @see IpAddressType
     */

    public void setIpAddressType(IpAddressType ipAddressType) {
        withIpAddressType(ipAddressType);
    }

    /**
     * <p>
     * The type of IP addresses used by the subnets for your load balancer. The possible values are <code>ipv4</code>
     * (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP addresses used by the subnets for your load balancer. The possible values are
     *        <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public LoadBalancer withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
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
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getCanonicalHostedZoneId() != null)
            sb.append("CanonicalHostedZoneId: ").append(getCanonicalHostedZoneId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancer == false)
            return false;
        LoadBalancer other = (LoadBalancer) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getCanonicalHostedZoneId() == null ^ this.getCanonicalHostedZoneId() == null)
            return false;
        if (other.getCanonicalHostedZoneId() != null && other.getCanonicalHostedZoneId().equals(this.getCanonicalHostedZoneId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getCanonicalHostedZoneId() == null) ? 0 : getCanonicalHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancer clone() {
        try {
            return (LoadBalancer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
