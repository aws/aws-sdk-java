/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancer(CreateLoadBalancerRequest) CreateLoadBalancer operation}.
 * <p>
 * Creates a new LoadBalancer.
 * </p>
 * <p>
 * After the call has completed successfully, a new LoadBalancer is created; however, it will not be usable until at least one instance has been
 * registered. When the LoadBalancer creation is completed, the client can check whether or not it is usable by using the DescribeInstanceHealth API. The
 * LoadBalancer is usable as soon as any registered instance is <i>InService</i> .
 * 
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, the client's quota of LoadBalancers is limited to ten per Region.
 * </p>
 * <p>
 * <b>NOTE:</b> LoadBalancer DNS names vary depending on the Region they're created in. For LoadBalancers created in the United States, the DNS name ends
 * with: us-east-1.elb.amazonaws.com (for the US Standard Region) us-west-1.elb.amazonaws.com (for the Northern California Region) For LoadBalancers
 * created in the EU (Ireland) Region, the DNS name ends with: eu-west-1.elb.amazonaws.com
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancer(CreateLoadBalancerRequest)
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers.
     */
    private String loadBalancerName;

    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     */
    private java.util.List<Listener> listeners;

    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     */
    private java.util.List<String> availabilityZones;

    /**
     * A list of subnet IDs in your VPC to attach to your LoadBalancer.
     */
    private java.util.List<String> subnets;

    /**
     * The security groups assigned to your LoadBalancer within your VPC.
     */
    private java.util.List<String> securityGroups;

    /**
     * The type of a LoadBalancer. This option is only available for
     * LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     * Balancer creates an internet-facing load balancer with publicly
     * resolvable DNS name that resolves to public IP addresses. Specify the
     * value <i>internal</i> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses.
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
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within your set of LoadBalancers.
     */
    public CreateLoadBalancerRequest(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    
    
    /**
     * Constructs a new CreateLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within your set of LoadBalancers.
     * @param listeners A list of the following tuples: LoadBalancerPort,
     * InstancePort, and Protocol.
     * @param availabilityZones A list of Availability Zones. <p> At least
     * one Availability Zone must be specified. Specified Availability Zones
     * must be in the same EC2 Region as the LoadBalancer. Traffic will be
     * equally distributed across all zones. <p> This list can be modified
     * after the creation of the LoadBalancer.
     */
    public CreateLoadBalancerRequest(String loadBalancerName, java.util.List<Listener> listeners, java.util.List<String> availabilityZones) {
        this.loadBalancerName = loadBalancerName;
        this.listeners = listeners;
        this.availabilityZones = availabilityZones;
    }

    
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers.
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
            listeners = new java.util.ArrayList<Listener>();
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

        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>(listeners.size());
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
            java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>(listeners.size());
            listenersCopy.addAll(listeners);
            this.listeners = listenersCopy;
        }

        return this;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     *
     * @return A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     */
    public java.util.List<String> getAvailabilityZones() {
        
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
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
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }
    
    /**
     * A list of subnet IDs in your VPC to attach to your LoadBalancer.
     *
     * @return A list of subnet IDs in your VPC to attach to your LoadBalancer.
     */
    public java.util.List<String> getSubnets() {
        
        if (subnets == null) {
            subnets = new java.util.ArrayList<String>();
        }
        return subnets;
    }
    
    /**
     * A list of subnet IDs in your VPC to attach to your LoadBalancer.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your LoadBalancer.
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        java.util.List<String> subnetsCopy = new java.util.ArrayList<String>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * A list of subnet IDs in your VPC to attach to your LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your LoadBalancer.
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
     * A list of subnet IDs in your VPC to attach to your LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs in your VPC to attach to your LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            java.util.List<String> subnetsCopy = new java.util.ArrayList<String>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
        }

        return this;
    }
    
    /**
     * The security groups assigned to your LoadBalancer within your VPC.
     *
     * @return The security groups assigned to your LoadBalancer within your VPC.
     */
    public java.util.List<String> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * The security groups assigned to your LoadBalancer within your VPC.
     *
     * @param securityGroups The security groups assigned to your LoadBalancer within your VPC.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The security groups assigned to your LoadBalancer within your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups assigned to your LoadBalancer within your VPC.
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
     * The security groups assigned to your LoadBalancer within your VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups assigned to your LoadBalancer within your VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }
    
    /**
     * The type of a LoadBalancer. This option is only available for
     * LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     * Balancer creates an internet-facing load balancer with publicly
     * resolvable DNS name that resolves to public IP addresses. Specify the
     * value <i>internal</i> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses.
     *
     * @return The type of a LoadBalancer. This option is only available for
     *         LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     *         Balancer creates an internet-facing load balancer with publicly
     *         resolvable DNS name that resolves to public IP addresses. Specify the
     *         value <i>internal</i> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses.
     */
    public String getScheme() {
        return scheme;
    }
    
    /**
     * The type of a LoadBalancer. This option is only available for
     * LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     * Balancer creates an internet-facing load balancer with publicly
     * resolvable DNS name that resolves to public IP addresses. Specify the
     * value <i>internal</i> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses.
     *
     * @param scheme The type of a LoadBalancer. This option is only available for
     *         LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     *         Balancer creates an internet-facing load balancer with publicly
     *         resolvable DNS name that resolves to public IP addresses. Specify the
     *         value <i>internal</i> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses.
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    
    /**
     * The type of a LoadBalancer. This option is only available for
     * LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     * Balancer creates an internet-facing load balancer with publicly
     * resolvable DNS name that resolves to public IP addresses. Specify the
     * value <i>internal</i> for this option to create an internal load
     * balancer with a DNS name that resolves to private IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheme The type of a LoadBalancer. This option is only available for
     *         LoadBalancers attached to a Amazon VPC. By default, Elastic Load
     *         Balancer creates an internet-facing load balancer with publicly
     *         resolvable DNS name that resolves to public IP addresses. Specify the
     *         value <i>internal</i> for this option to create an internal load
     *         balancer with a DNS name that resolves to private IP addresses.
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
        if (loadBalancerName != null) sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        if (listeners != null) sb.append("Listeners: " + listeners + ", ");
        if (availabilityZones != null) sb.append("AvailabilityZones: " + availabilityZones + ", ");
        if (subnets != null) sb.append("Subnets: " + subnets + ", ");
        if (securityGroups != null) sb.append("SecurityGroups: " + securityGroups + ", ");
        if (scheme != null) sb.append("Scheme: " + scheme + ", ");
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
    