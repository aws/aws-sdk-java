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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest) EnableAvailabilityZonesForLoadBalancer operation}.
 * <p>
 * Adds one or more EC2 Availability Zones to the load balancer.
 * </p>
 * <p>
 * The load balancer evenly distributes requests across all its registered Availability Zones that contain instances.
 * </p>
 * <p>
 * <b>NOTE:</b> The new EC2 Availability Zones to be added must be in the same EC2 Region as the Availability Zones for which the load balancer was
 * created.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_AddLBAvailabilityZone.html"> Expand a Load
 * Balanced Application to an Additional Availability Zone </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest)
 */
public class EnableAvailabilityZonesForLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * A list of new Availability Zones for the load balancer. Each
     * Availability Zone must be in the same region as the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * Default constructor for a new EnableAvailabilityZonesForLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest() {}
    
    /**
     * Constructs a new EnableAvailabilityZonesForLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the load balancer.
     * @param availabilityZones A list of new Availability Zones for the load
     * balancer. Each Availability Zone must be in the same region as the
     * load balancer.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName, java.util.List<String> availabilityZones) {
        setLoadBalancerName(loadBalancerName);
        setAvailabilityZones(availabilityZones);
    }

    /**
     * The name associated with the load balancer.
     *
     * @return The name associated with the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer.
     *
     * @param loadBalancerName The name associated with the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of new Availability Zones for the load balancer. Each
     * Availability Zone must be in the same region as the load balancer.
     *
     * @return A list of new Availability Zones for the load balancer. Each
     *         Availability Zone must be in the same region as the load balancer.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of new Availability Zones for the load balancer. Each
     * Availability Zone must be in the same region as the load balancer.
     *
     * @param availabilityZones A list of new Availability Zones for the load balancer. Each
     *         Availability Zone must be in the same region as the load balancer.
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
     * A list of new Availability Zones for the load balancer. Each
     * Availability Zone must be in the same region as the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of new Availability Zones for the load balancer. Each
     *         Availability Zone must be in the same region as the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of new Availability Zones for the load balancer. Each
     * Availability Zone must be in the same region as the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of new Availability Zones for the load balancer. Each
     *         Availability Zone must be in the same region as the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableAvailabilityZonesForLoadBalancerRequest == false) return false;
        EnableAvailabilityZonesForLoadBalancerRequest other = (EnableAvailabilityZonesForLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
}
    