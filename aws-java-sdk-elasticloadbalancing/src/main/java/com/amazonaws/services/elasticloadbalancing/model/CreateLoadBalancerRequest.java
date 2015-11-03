/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancer(CreateLoadBalancerRequest) CreateLoadBalancer operation}.
 * <p>
 * Creates a load balancer.
 * </p>
 * <p>
 * If the call completes successfully, a new load balancer is created
 * with a unique Domain Name Service (DNS) name. The load balancer
 * receives incoming traffic and routes it to the registered instances.
 * For more information, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/how-elb-works.html"> How Elastic Load Balancing Works </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * You can create up to 20 load balancers per region per account. You can
 * request an increase for the number of load balancers for your account.
 * For more information, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-limits.html"> Elastic Load Balancing Limits </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancer(CreateLoadBalancerRequest)
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the load balancer. <p>This name must be unique within your
     * set of load balancers for the region, must have a maximum of 32
     * characters, must contain only alphanumeric characters or hyphens, and
     * cannot begin or end with a hyphen.
     */
    private String loadBalancerName;

    /**
     * The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Listener> listeners;

    /**
     * One or more Availability Zones from the same region as the load
     * balancer. Traffic is equally distributed across all specified
     * Availability Zones. <p>You must specify at least one Availability
     * Zone. <p>You can add more Availability Zones after you create the load
     * balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnets;

    /**
     * The IDs of the security groups to assign to the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * <p>By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a publicly resolvable DNS name, which resolves to public
     * IP addresses. For more information about Internet-facing and Internal
     * load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>. <p>Specify <code>internal</code> to create an
     * internal load balancer with a DNS name that resolves to private IP
     * addresses.
     */
    private String scheme;

    /**
     * A list of tags to assign to the load balancer. <p>For more information
     * about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     * in the <i>Elastic Load Balancing Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new CreateLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateLoadBalancerRequest() {}
    
    /**
     * Constructs a new CreateLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the load balancer. <p>This name
     * must be unique within your set of load balancers for the region, must
     * have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens, and cannot begin or end with a hyphen.
     */
    public CreateLoadBalancerRequest(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the load balancer. <p>This name
     * must be unique within your set of load balancers for the region, must
     * have a maximum of 32 characters, must contain only alphanumeric
     * characters or hyphens, and cannot begin or end with a hyphen.
     * @param listeners The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * @param availabilityZones One or more Availability Zones from the same
     * region as the load balancer. Traffic is equally distributed across all
     * specified Availability Zones. <p>You must specify at least one
     * Availability Zone. <p>You can add more Availability Zones after you
     * create the load balancer using
     * <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */
    public CreateLoadBalancerRequest(String loadBalancerName, java.util.List<Listener> listeners, java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setListeners(listeners);
        setAvailabilityZones(availabilityZones);
    }

    /**
     * The name of the load balancer. <p>This name must be unique within your
     * set of load balancers for the region, must have a maximum of 32
     * characters, must contain only alphanumeric characters or hyphens, and
     * cannot begin or end with a hyphen.
     *
     * @return The name of the load balancer. <p>This name must be unique within your
     *         set of load balancers for the region, must have a maximum of 32
     *         characters, must contain only alphanumeric characters or hyphens, and
     *         cannot begin or end with a hyphen.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the load balancer. <p>This name must be unique within your
     * set of load balancers for the region, must have a maximum of 32
     * characters, must contain only alphanumeric characters or hyphens, and
     * cannot begin or end with a hyphen.
     *
     * @param loadBalancerName The name of the load balancer. <p>This name must be unique within your
     *         set of load balancers for the region, must have a maximum of 32
     *         characters, must contain only alphanumeric characters or hyphens, and
     *         cannot begin or end with a hyphen.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the load balancer. <p>This name must be unique within your
     * set of load balancers for the region, must have a maximum of 32
     * characters, must contain only alphanumeric characters or hyphens, and
     * cannot begin or end with a hyphen.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the load balancer. <p>This name must be unique within your
     *         set of load balancers for the region, must have a maximum of 32
     *         characters, must contain only alphanumeric characters or hyphens, and
     *         cannot begin or end with a hyphen.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     *
     * @return The listeners. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     *         for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     *         Guide</i>.
     */
    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
              listeners = new com.amazonaws.internal.ListWithAutoConstructFlag<Listener>();
              listeners.setAutoConstruct(true);
        }
        return listeners;
    }
    
    /**
     * The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     *
     * @param listeners The listeners. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     *         for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     *         Guide</i>.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Listener> listenersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Listener>(listeners.size());
        listenersCopy.addAll(listeners);
        this.listeners = listenersCopy;
    }
    
    /**
     * The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setListeners(java.util.Collection)} or {@link
     * #withListeners(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners The listeners. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     *         for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withListeners(Listener... listeners) {
        if (getListeners() == null) setListeners(new java.util.ArrayList<Listener>(listeners.length));
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * The listeners. <p>For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     * for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners The listeners. <p>For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-listener-config.html">Listeners
     *         for Your Load Balancer</a> in the <i>Elastic Load Balancing Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Listener> listenersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Listener>(listeners.size());
            listenersCopy.addAll(listeners);
            this.listeners = listenersCopy;
        }

        return this;
    }

    /**
     * One or more Availability Zones from the same region as the load
     * balancer. Traffic is equally distributed across all specified
     * Availability Zones. <p>You must specify at least one Availability
     * Zone. <p>You can add more Availability Zones after you create the load
     * balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *
     * @return One or more Availability Zones from the same region as the load
     *         balancer. Traffic is equally distributed across all specified
     *         Availability Zones. <p>You must specify at least one Availability
     *         Zone. <p>You can add more Availability Zones after you create the load
     *         balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * One or more Availability Zones from the same region as the load
     * balancer. Traffic is equally distributed across all specified
     * Availability Zones. <p>You must specify at least one Availability
     * Zone. <p>You can add more Availability Zones after you create the load
     * balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *
     * @param availabilityZones One or more Availability Zones from the same region as the load
     *         balancer. Traffic is equally distributed across all specified
     *         Availability Zones. <p>You must specify at least one Availability
     *         Zone. <p>You can add more Availability Zones after you create the load
     *         balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * One or more Availability Zones from the same region as the load
     * balancer. Traffic is equally distributed across all specified
     * Availability Zones. <p>You must specify at least one Availability
     * Zone. <p>You can add more Availability Zones after you create the load
     * balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones One or more Availability Zones from the same region as the load
     *         balancer. Traffic is equally distributed across all specified
     *         Availability Zones. <p>You must specify at least one Availability
     *         Zone. <p>You can add more Availability Zones after you create the load
     *         balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * One or more Availability Zones from the same region as the load
     * balancer. Traffic is equally distributed across all specified
     * Availability Zones. <p>You must specify at least one Availability
     * Zone. <p>You can add more Availability Zones after you create the load
     * balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones One or more Availability Zones from the same region as the load
     *         balancer. Traffic is equally distributed across all specified
     *         Availability Zones. <p>You must specify at least one Availability
     *         Zone. <p>You can add more Availability Zones after you create the load
     *         balancer using <a>EnableAvailabilityZonesForLoadBalancer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     *
     * @return The IDs of the subnets in your VPC to attach to the load balancer.
     *         Specify one subnet per Availability Zone specified in
     *         <code>AvailabilityZones</code>.
     */
    public java.util.List<String> getSubnets() {
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     *
     * @param subnets The IDs of the subnets in your VPC to attach to the load balancer.
     *         Specify one subnet per Availability Zone specified in
     *         <code>AvailabilityZones</code>.
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubnets(java.util.Collection)} or {@link
     * #withSubnets(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets The IDs of the subnets in your VPC to attach to the load balancer.
     *         Specify one subnet per Availability Zone specified in
     *         <code>AvailabilityZones</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withSubnets(String... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<String>(subnets.length));
        for (String value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the subnets in your VPC to attach to the load balancer.
     * Specify one subnet per Availability Zone specified in
     * <code>AvailabilityZones</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets The IDs of the subnets in your VPC to attach to the load balancer.
     *         Specify one subnet per Availability Zone specified in
     *         <code>AvailabilityZones</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
        }

        return this;
    }

    /**
     * The IDs of the security groups to assign to the load balancer.
     *
     * @return The IDs of the security groups to assign to the load balancer.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * The IDs of the security groups to assign to the load balancer.
     *
     * @param securityGroups The IDs of the security groups to assign to the load balancer.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The IDs of the security groups to assign to the load balancer.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or {@link
     * #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The IDs of the security groups to assign to the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the security groups to assign to the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The IDs of the security groups to assign to the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * <p>By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a publicly resolvable DNS name, which resolves to public
     * IP addresses. For more information about Internet-facing and Internal
     * load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>. <p>Specify <code>internal</code> to create an
     * internal load balancer with a DNS name that resolves to private IP
     * addresses.
     *
     * @return The type of a load balancer. Valid only for load balancers in a VPC.
     *         <p>By default, Elastic Load Balancing creates an Internet-facing load
     *         balancer with a publicly resolvable DNS name, which resolves to public
     *         IP addresses. For more information about Internet-facing and Internal
     *         load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     *         Developer Guide</i>. <p>Specify <code>internal</code> to create an
     *         internal load balancer with a DNS name that resolves to private IP
     *         addresses.
     */
    public String getScheme() {
        return scheme;
    }
    
    /**
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * <p>By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a publicly resolvable DNS name, which resolves to public
     * IP addresses. For more information about Internet-facing and Internal
     * load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>. <p>Specify <code>internal</code> to create an
     * internal load balancer with a DNS name that resolves to private IP
     * addresses.
     *
     * @param scheme The type of a load balancer. Valid only for load balancers in a VPC.
     *         <p>By default, Elastic Load Balancing creates an Internet-facing load
     *         balancer with a publicly resolvable DNS name, which resolves to public
     *         IP addresses. For more information about Internet-facing and Internal
     *         load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     *         Developer Guide</i>. <p>Specify <code>internal</code> to create an
     *         internal load balancer with a DNS name that resolves to private IP
     *         addresses.
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    
    /**
     * The type of a load balancer. Valid only for load balancers in a VPC.
     * <p>By default, Elastic Load Balancing creates an Internet-facing load
     * balancer with a publicly resolvable DNS name, which resolves to public
     * IP addresses. For more information about Internet-facing and Internal
     * load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     * Developer Guide</i>. <p>Specify <code>internal</code> to create an
     * internal load balancer with a DNS name that resolves to private IP
     * addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheme The type of a load balancer. Valid only for load balancers in a VPC.
     *         <p>By default, Elastic Load Balancing creates an Internet-facing load
     *         balancer with a publicly resolvable DNS name, which resolves to public
     *         IP addresses. For more information about Internet-facing and Internal
     *         load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a> in the <i>Elastic Load Balancing
     *         Developer Guide</i>. <p>Specify <code>internal</code> to create an
     *         internal load balancer with a DNS name that resolves to private IP
     *         addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * A list of tags to assign to the load balancer. <p>For more information
     * about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     * in the <i>Elastic Load Balancing Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A list of tags to assign to the load balancer. <p>For more information
     *         about tagging your load balancer, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     *         in the <i>Elastic Load Balancing Developer Guide</i>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags to assign to the load balancer. <p>For more information
     * about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     * in the <i>Elastic Load Balancing Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags to assign to the load balancer. <p>For more information
     *         about tagging your load balancer, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     *         in the <i>Elastic Load Balancing Developer Guide</i>.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags to assign to the load balancer. <p>For more information
     * about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     * in the <i>Elastic Load Balancing Developer Guide</i>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags to assign to the load balancer. <p>For more information
     *         about tagging your load balancer, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     *         in the <i>Elastic Load Balancing Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags to assign to the load balancer. <p>For more information
     * about tagging your load balancer, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     * in the <i>Elastic Load Balancing Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param tags A list of tags to assign to the load balancer. <p>For more information
     *         about tagging your load balancer, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#tagging-elb">Tagging</a>
     *         in the <i>Elastic Load Balancing Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoadBalancerRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getListeners() != null) sb.append("Listeners: " + getListeners() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSubnets() != null) sb.append("Subnets: " + getSubnets() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getScheme() != null) sb.append("Scheme: " + getScheme() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLoadBalancerRequest == false) return false;
        CreateLoadBalancerRequest other = (CreateLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getListeners() == null ^ this.getListeners() == null) return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getScheme() == null ^ this.getScheme() == null) return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateLoadBalancerRequest clone() {
        
            return (CreateLoadBalancerRequest) super.clone();
    }

}
    