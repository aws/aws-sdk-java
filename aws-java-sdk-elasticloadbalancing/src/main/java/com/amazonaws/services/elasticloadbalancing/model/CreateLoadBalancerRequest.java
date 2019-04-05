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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for CreateLoadBalancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/CreateLoadBalancer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoadBalancerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Listener> listeners;
    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone
     * specified in <code>AvailabilityZones</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnets;
    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to
     * public IP addresses. For more information about Internet-facing and Internal load balancers, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP addresses.
     * </p>
     */
    private String scheme;
    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateLoadBalancerRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateLoadBalancerRequest() {
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique within your set of load balancers for the region, must have a maximum of 32
     *        characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     */
    public CreateLoadBalancerRequest(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param loadBalancerName
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique within your set of load balancers for the region, must have a maximum of 32
     *        characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * @param listeners
     *        The listeners.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners
     *        for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * @param availabilityZones
     *        One or more Availability Zones from the same region as the load balancer.
     *        </p>
     *        <p>
     *        You must specify at least one Availability Zone.
     *        </p>
     *        <p>
     *        You can add more Availability Zones after you create the load balancer using
     *        <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */
    public CreateLoadBalancerRequest(String loadBalancerName, java.util.List<Listener> listeners, java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setListeners(listeners);
        setAvailabilityZones(availabilityZones);
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique within your set of load balancers for the region, must have a maximum of 32
     *        characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * </p>
     * 
     * @return The name of the load balancer.</p>
     *         <p>
     *         This name must be unique within your set of load balancers for the region, must have a maximum of 32
     *         characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * <p>
     * This name must be unique within your set of load balancers for the region, must have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.</p>
     *        <p>
     *        This name must be unique within your set of load balancers for the region, must have a maximum of 32
     *        characters, must contain only alphanumeric characters or hyphens, and cannot begin or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return The listeners.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners
     *         for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
            listeners = new com.amazonaws.internal.SdkInternalList<Listener>();
        }
        return listeners;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param listeners
     *        The listeners.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners
     *        for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new com.amazonaws.internal.SdkInternalList<Listener>(listeners);
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        The listeners.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners
     *        for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withListeners(Listener... listeners) {
        if (this.listeners == null) {
            setListeners(new com.amazonaws.internal.SdkInternalList<Listener>(listeners.length));
        }
        for (Listener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listeners.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your
     * Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param listeners
     *        The listeners.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners
     *        for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * 
     * @return One or more Availability Zones from the same region as the load balancer.</p>
     *         <p>
     *         You must specify at least one Availability Zone.
     *         </p>
     *         <p>
     *         You can add more Availability Zones after you create the load balancer using
     *         <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones from the same region as the load balancer.</p>
     *        <p>
     *        You must specify at least one Availability Zone.
     *        </p>
     *        <p>
     *        You can add more Availability Zones after you create the load balancer using
     *        <a>EnableAvailabilityZonesForLoadBalancer</a>.
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
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones from the same region as the load balancer.</p>
     *        <p>
     *        You must specify at least one Availability Zone.
     *        </p>
     *        <p>
     *        You can add more Availability Zones after you create the load balancer using
     *        <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
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
     * One or more Availability Zones from the same region as the load balancer.
     * </p>
     * <p>
     * You must specify at least one Availability Zone.
     * </p>
     * <p>
     * You can add more Availability Zones after you create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones from the same region as the load balancer.</p>
     *        <p>
     *        You must specify at least one Availability Zone.
     *        </p>
     *        <p>
     *        You can add more Availability Zones after you create the load balancer using
     *        <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone
     * specified in <code>AvailabilityZones</code>.
     * </p>
     * 
     * @return The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability
     *         Zone specified in <code>AvailabilityZones</code>.
     */

    public java.util.List<String> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone
     * specified in <code>AvailabilityZones</code>.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability
     *        Zone specified in <code>AvailabilityZones</code>.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone
     * specified in <code>AvailabilityZones</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability
     *        Zone specified in <code>AvailabilityZones</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability Zone
     * specified in <code>AvailabilityZones</code>.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets in your VPC to attach to the load balancer. Specify one subnet per Availability
     *        Zone specified in <code>AvailabilityZones</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * 
     * @return The IDs of the security groups to assign to the load balancer.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups to assign to the load balancer.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups to assign to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups to assign to the load balancer.
     * </p>
     * 
     * @param securityGroups
     *        The IDs of the security groups to assign to the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to
     * public IP addresses. For more information about Internet-facing and Internal load balancers, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP addresses.
     * </p>
     * 
     * @param scheme
     *        The type of a load balancer. Valid only for load balancers in a VPC.</p>
     *        <p>
     *        By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves
     *        to public IP addresses. For more information about Internet-facing and Internal load balancers, see <a
     *        href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *        >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     *        </p>
     *        <p>
     *        Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP
     *        addresses.
     */

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to
     * public IP addresses. For more information about Internet-facing and Internal load balancers, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP addresses.
     * </p>
     * 
     * @return The type of a load balancer. Valid only for load balancers in a VPC.</p>
     *         <p>
     *         By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves
     *         to public IP addresses. For more information about Internet-facing and Internal load balancers, see <a
     *         href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *         >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     *         </p>
     *         <p>
     *         Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP
     *         addresses.
     */

    public String getScheme() {
        return this.scheme;
    }

    /**
     * <p>
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves to
     * public IP addresses. For more information about Internet-facing and Internal load balancers, see <a href=
     * "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     * >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     * </p>
     * <p>
     * Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP addresses.
     * </p>
     * 
     * @param scheme
     *        The type of a load balancer. Valid only for load balancers in a VPC.</p>
     *        <p>
     *        By default, Elastic Load Balancing creates an Internet-facing load balancer with a DNS name that resolves
     *        to public IP addresses. For more information about Internet-facing and Internal load balancers, see <a
     *        href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/userguide/how-elastic-load-balancing-works.html#load-balancer-scheme"
     *        >Load Balancer Scheme</a> in the <i>Elastic Load Balancing User Guide</i>.
     *        </p>
     *        <p>
     *        Specify <code>internal</code> to create a load balancer with a DNS name that resolves to private IP
     *        addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withScheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return A list of tags to assign to the load balancer.</p>
     *         <p>
     *         For more information about tagging your load balancer, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your
     *         Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to assign to the load balancer.</p>
     *        <p>
     *        For more information about tagging your load balancer, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your
     *        Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to assign to the load balancer.</p>
     *        <p>
     *        For more information about tagging your load balancer, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your
     *        Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to assign to the load balancer.
     * </p>
     * <p>
     * For more information about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your Classic Load
     * Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to assign to the load balancer.</p>
     *        <p>
     *        For more information about tagging your load balancer, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html">Tag Your
     *        Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoadBalancerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerRequest clone() {
        return (CreateLoadBalancerRequest) super.clone();
    }

}
