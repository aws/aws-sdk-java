/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new load balancer.
 * </p>
 * <p>
 * After the call has completed successfully, a new load balancer is created with a unique Domain Name Service (DNS) name. The DNS name includes the
 * name of the AWS region in which the load balance was created. For example, if your load balancer was created in the United States, the DNS name might
 * end with either of the following:
 * </p>
 * 
 * <ul>
 * <li> <i>us-east-1.elb.amazonaws.com</i> (for the Northern Virginia Region) </li>
 * <li> <i>us-west-1.elb.amazonaws.com</i> (for the Northern California Region) </li>
 * 
 * </ul>
 * <p>
 * For information about the AWS regions supported by Elastic Load Balancing, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region"> Regions and Endpoints </a> .
 * </p>
 * <p>
 * You can create up to 10 load balancers per region per account.
 * </p>
 * <p>
 * Elastic Load Balancing supports load balancing your Amazon EC2 instances launched within any one of the following platforms:
 * </p>
 * 
 * <ul>
 * <li> <i>EC2-Classic</i> <p>
 * For information on creating and managing your load balancers in EC2-Classic, see <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForEC2.html"> Deploy Elastic Load Balancing in Amazon
 * EC2-Classic </a> .
 * </p>
 * </li>
 * <li> <i>EC2-VPC</i> <p>
 * For information on creating and managing your load balancers in EC2-VPC, see <a
 * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenariosForVPC.html"> Deploy Elastic Load Balancing in Amazon VPC
 * </a> .
 * </p>
 * </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancer(CreateLoadBalancerRequest)
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     */
    private String loadBalancerName;

    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Listener> listeners;

    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the load balancer. Traffic will be equally distributed
     * across all zones. <p> You can later add more Availability Zones after
     * the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * A list of subnet IDs in your VPC to attach to your load balancer.
     * Specify one subnet per Availability Zone.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnets;

    /**
     * The security groups to assign to your load balancer within your VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The type of a load balancer. <p>By default, Elastic Load Balancing
     * creates an Internet-facing load balancer with a publicly resolvable
     * DNS name, which resolves to public IP addresses. For more
     * informationabout Internet-facing and Internal load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a>. <p>Specify the value
     * <code>internal</code> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses. <note>
     * <p>This option is only available for load balancers created within
     * EC2-VPC. </note>
     */
    private String scheme;

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
     * @param loadBalancerName The name associated with the load balancer.
     * The name must be unique within your set of load balancers.
     */
    public CreateLoadBalancerRequest(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
    }

    /**
     * Constructs a new CreateLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the load balancer.
     * The name must be unique within your set of load balancers.
     * @param listeners A list of the following tuples: LoadBalancerPort,
     * InstancePort, and Protocol.
     * @param availabilityZones A list of Availability Zones. <p> At least
     * one Availability Zone must be specified. Specified Availability Zones
     * must be in the same EC2 Region as the load balancer. Traffic will be
     * equally distributed across all zones. <p> You can later add more
     * Availability Zones after the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     */
    public CreateLoadBalancerRequest(String loadBalancerName, java.util.List<Listener> listeners, java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setListeners(listeners);
        setAvailabilityZones(availabilityZones);
    }

    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     *
     * @return The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     *
     * @return A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
     */
    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
              listeners = new com.amazonaws.internal.ListWithAutoConstructFlag<Listener>();
              listeners.setAutoConstruct(true);
        }
        return listeners;
    }
    
    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
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
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
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
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
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
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the load balancer. Traffic will be equally distributed
     * across all zones. <p> You can later add more Availability Zones after
     * the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     *
     * @return A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the load balancer. Traffic will be equally distributed
     *         across all zones. <p> You can later add more Availability Zones after
     *         the creation of the load balancer by calling
     *         <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the load balancer. Traffic will be equally distributed
     * across all zones. <p> You can later add more Availability Zones after
     * the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the load balancer. Traffic will be equally distributed
     *         across all zones. <p> You can later add more Availability Zones after
     *         the creation of the load balancer by calling
     *         <a>EnableAvailabilityZonesForLoadBalancer</a> action.
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
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the load balancer. Traffic will be equally distributed
     * across all zones. <p> You can later add more Availability Zones after
     * the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the load balancer. Traffic will be equally distributed
     *         across all zones. <p> You can later add more Availability Zones after
     *         the creation of the load balancer by calling
     *         <a>EnableAvailabilityZonesForLoadBalancer</a> action.
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
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the load balancer. Traffic will be equally distributed
     * across all zones. <p> You can later add more Availability Zones after
     * the creation of the load balancer by calling
     * <a>EnableAvailabilityZonesForLoadBalancer</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the load balancer. Traffic will be equally distributed
     *         across all zones. <p> You can later add more Availability Zones after
     *         the creation of the load balancer by calling
     *         <a>EnableAvailabilityZonesForLoadBalancer</a> action.
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
     * A list of subnet IDs in your VPC to attach to your load balancer.
     * Specify one subnet per Availability Zone.
     *
     * @return A list of subnet IDs in your VPC to attach to your load balancer.
     *         Specify one subnet per Availability Zone.
     */
    public java.util.List<String> getSubnets() {
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * A list of subnet IDs in your VPC to attach to your load balancer.
     * Specify one subnet per Availability Zone.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your load balancer.
     *         Specify one subnet per Availability Zone.
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
     * A list of subnet IDs in your VPC to attach to your load balancer.
     * Specify one subnet per Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your load balancer.
     *         Specify one subnet per Availability Zone.
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
     * A list of subnet IDs in your VPC to attach to your load balancer.
     * Specify one subnet per Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your load balancer.
     *         Specify one subnet per Availability Zone.
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
     * The security groups to assign to your load balancer within your VPC.
     *
     * @return The security groups to assign to your load balancer within your VPC.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * The security groups to assign to your load balancer within your VPC.
     *
     * @param securityGroups The security groups to assign to your load balancer within your VPC.
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
     * The security groups to assign to your load balancer within your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups to assign to your load balancer within your VPC.
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
     * The security groups to assign to your load balancer within your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups to assign to your load balancer within your VPC.
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
     * The type of a load balancer. <p>By default, Elastic Load Balancing
     * creates an Internet-facing load balancer with a publicly resolvable
     * DNS name, which resolves to public IP addresses. For more
     * informationabout Internet-facing and Internal load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a>. <p>Specify the value
     * <code>internal</code> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses. <note>
     * <p>This option is only available for load balancers created within
     * EC2-VPC. </note>
     *
     * @return The type of a load balancer. <p>By default, Elastic Load Balancing
     *         creates an Internet-facing load balancer with a publicly resolvable
     *         DNS name, which resolves to public IP addresses. For more
     *         informationabout Internet-facing and Internal load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a>. <p>Specify the value
     *         <code>internal</code> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses. <note>
     *         <p>This option is only available for load balancers created within
     *         EC2-VPC. </note>
     */
    public String getScheme() {
        return scheme;
    }
    
    /**
     * The type of a load balancer. <p>By default, Elastic Load Balancing
     * creates an Internet-facing load balancer with a publicly resolvable
     * DNS name, which resolves to public IP addresses. For more
     * informationabout Internet-facing and Internal load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a>. <p>Specify the value
     * <code>internal</code> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses. <note>
     * <p>This option is only available for load balancers created within
     * EC2-VPC. </note>
     *
     * @param scheme The type of a load balancer. <p>By default, Elastic Load Balancing
     *         creates an Internet-facing load balancer with a publicly resolvable
     *         DNS name, which resolves to public IP addresses. For more
     *         informationabout Internet-facing and Internal load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a>. <p>Specify the value
     *         <code>internal</code> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses. <note>
     *         <p>This option is only available for load balancers created within
     *         EC2-VPC. </note>
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    
    /**
     * The type of a load balancer. <p>By default, Elastic Load Balancing
     * creates an Internet-facing load balancer with a publicly resolvable
     * DNS name, which resolves to public IP addresses. For more
     * informationabout Internet-facing and Internal load balancers, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     * and Internal Load Balancers</a>. <p>Specify the value
     * <code>internal</code> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses. <note>
     * <p>This option is only available for load balancers created within
     * EC2-VPC. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheme The type of a load balancer. <p>By default, Elastic Load Balancing
     *         creates an Internet-facing load balancer with a publicly resolvable
     *         DNS name, which resolves to public IP addresses. For more
     *         informationabout Internet-facing and Internal load balancers, see <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/vpc-loadbalancer-types.html">Internet-facing
     *         and Internal Load Balancers</a>. <p>Specify the value
     *         <code>internal</code> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses. <note>
     *         <p>This option is only available for load balancers created within
     *         EC2-VPC. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLoadBalancerRequest withScheme(String scheme) {
        this.scheme = scheme;
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
        if (getScheme() != null) sb.append("Scheme: " + getScheme() );
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
        return true;
    }
    
}
    