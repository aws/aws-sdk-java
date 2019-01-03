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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/CreateLoadBalancer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify
     * Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic
     * IP address per subnet.
     * </p>
     */
    private java.util.List<SubnetMapping> subnetMappings;
    /**
     * <p>
     * [Application Load Balancers] The IDs of the security groups for the load balancer.
     * </p>
     */
    private java.util.List<String> securityGroups;
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
     * <p>
     * The default is an Internet-facing load balancer.
     * </p>
     */
    private String scheme;
    /**
     * <p>
     * One or more tags to assign to the load balancer.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     */
    private String ipAddressType;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
     * </p>
     * 
     * @param name
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *        alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with
     *        "internal-".
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
     * </p>
     * 
     * @return The name of the load balancer.</p>
     *         <p>
     *         This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *         alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with
     *         "internal-".
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     * alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with "internal-".
     * </p>
     * 
     * @param name
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique per region per account, can have a maximum of 32 characters, must contain only
     *        alphanumeric characters or hyphens, must not begin or end with a hyphen, and must not begin with
     *        "internal-".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * </p>
     * 
     * @return The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *         either subnets or subnet mappings.</p>
     *         <p>
     *         [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *         </p>
     *         <p>
     *         [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify
     * Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic
     * IP address per subnet.
     * </p>
     * 
     * @return The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *         either subnets or subnet mappings.</p>
     *         <p>
     *         [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot
     *         specify Elastic IP addresses for your subnets.
     *         </p>
     *         <p>
     *         [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one
     *         Elastic IP address per subnet.
     */

    public java.util.List<SubnetMapping> getSubnetMappings() {
        return subnetMappings;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify
     * Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic
     * IP address per subnet.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot
     *        specify Elastic IP addresses for your subnets.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one
     *        Elastic IP address per subnet.
     */

    public void setSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        if (subnetMappings == null) {
            this.subnetMappings = null;
            return;
        }

        this.subnetMappings = new java.util.ArrayList<SubnetMapping>(subnetMappings);
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify
     * Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic
     * IP address per subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetMappings(java.util.Collection)} or {@link #withSubnetMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot
     *        specify Elastic IP addresses for your subnets.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one
     *        Elastic IP address per subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnetMappings(SubnetMapping... subnetMappings) {
        if (this.subnetMappings == null) {
            setSubnetMappings(new java.util.ArrayList<SubnetMapping>(subnetMappings.length));
        }
        for (SubnetMapping ele : subnetMappings) {
            this.subnetMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify either
     * subnets or subnet mappings.
     * </p>
     * <p>
     * [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot specify
     * Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one Elastic
     * IP address per subnet.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You can specify only one subnet per Availability Zone. You must specify
     *        either subnets or subnet mappings.</p>
     *        <p>
     *        [Application Load Balancers] You must specify subnets from at least two Availability Zones. You cannot
     *        specify Elastic IP addresses for your subnets.
     *        </p>
     *        <p>
     *        [Network Load Balancers] You can specify subnets from one or more Availability Zones. You can specify one
     *        Elastic IP address per subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        setSubnetMappings(subnetMappings);
        return this;
    }

    /**
     * <p>
     * [Application Load Balancers] The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @return [Application Load Balancers] The IDs of the security groups for the load balancer.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * [Application Load Balancers] The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        [Application Load Balancers] The IDs of the security groups for the load balancer.
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
     * [Application Load Balancers] The IDs of the security groups for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        [Application Load Balancers] The IDs of the security groups for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSecurityGroups(String... securityGroups) {
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
     * [Application Load Balancers] The IDs of the security groups for the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        [Application Load Balancers] The IDs of the security groups for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
     * <p>
     * The default is an Internet-facing load balancer.
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
     *        </p>
     *        <p>
     *        The default is an Internet-facing load balancer.
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
     * <p>
     * The default is an Internet-facing load balancer.
     * </p>
     * 
     * @return The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an
     *         Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore,
     *         Internet-facing load balancers can route requests from clients over the internet.</p>
     *         <p>
     *         The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load
     *         balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load
     *         balancers can only route requests from clients with access to the VPC for the load balancer.
     *         </p>
     *         <p>
     *         The default is an Internet-facing load balancer.
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
     * <p>
     * The default is an Internet-facing load balancer.
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
     *        </p>
     *        <p>
     *        The default is an Internet-facing load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerSchemeEnum
     */

    public CreateLoadBalancerRequest withScheme(String scheme) {
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
     * <p>
     * The default is an Internet-facing load balancer.
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
     *        </p>
     *        <p>
     *        The default is an Internet-facing load balancer.
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
     * <p>
     * The default is an Internet-facing load balancer.
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
     *        </p>
     *        <p>
     *        The default is an Internet-facing load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerSchemeEnum
     */

    public CreateLoadBalancerRequest withScheme(LoadBalancerSchemeEnum scheme) {
        this.scheme = scheme.toString();
        return this;
    }

    /**
     * <p>
     * One or more tags to assign to the load balancer.
     * </p>
     * 
     * @return One or more tags to assign to the load balancer.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to assign to the load balancer.
     * </p>
     * 
     * @param tags
     *        One or more tags to assign to the load balancer.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * One or more tags to assign to the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more tags to assign to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to assign to the load balancer.
     * </p>
     * 
     * @param tags
     *        One or more tags to assign to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     * 
     * @param type
     *        The type of load balancer. The default is <code>application</code>.
     * @see LoadBalancerTypeEnum
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     * 
     * @return The type of load balancer. The default is <code>application</code>.
     * @see LoadBalancerTypeEnum
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     * 
     * @param type
     *        The type of load balancer. The default is <code>application</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTypeEnum
     */

    public CreateLoadBalancerRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     * 
     * @param type
     *        The type of load balancer. The default is <code>application</code>.
     * @see LoadBalancerTypeEnum
     */

    public void setType(LoadBalancerTypeEnum type) {
        withType(type);
    }

    /**
     * <p>
     * The type of load balancer. The default is <code>application</code>.
     * </p>
     * 
     * @param type
     *        The type of load balancer. The default is <code>application</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTypeEnum
     */

    public CreateLoadBalancerRequest withType(LoadBalancerTypeEnum type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The
     *        possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *        addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @return [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The
     *         possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *         addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The
     *        possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *        addresses). Internal load balancers must use <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateLoadBalancerRequest withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The
     *        possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *        addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(IpAddressType ipAddressType) {
        withIpAddressType(ipAddressType);
    }

    /**
     * <p>
     * [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The possible
     * values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6 addresses).
     * Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        [Application Load Balancers] The type of IP addresses used by the subnets for your load balancer. The
     *        possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code> (for IPv4 and IPv6
     *        addresses). Internal load balancers must use <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public CreateLoadBalancerRequest withIpAddressType(IpAddressType ipAddressType) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSubnetMappings() != null)
            sb.append("SubnetMappings: ").append(getSubnetMappings()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CreateLoadBalancerRequest == false)
            return false;
        CreateLoadBalancerRequest other = (CreateLoadBalancerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSubnetMappings() == null ^ this.getSubnetMappings() == null)
            return false;
        if (other.getSubnetMappings() != null && other.getSubnetMappings().equals(this.getSubnetMappings()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSubnetMappings() == null) ? 0 : getSubnetMappings().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerRequest clone() {
        return (CreateLoadBalancerRequest) super.clone();
    }

}
