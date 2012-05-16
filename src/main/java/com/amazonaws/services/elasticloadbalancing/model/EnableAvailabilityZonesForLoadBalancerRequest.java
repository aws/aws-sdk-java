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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest) EnableAvailabilityZonesForLoadBalancer operation}.
 * <p>
 * Adds one or more EC2 Availability Zones to the LoadBalancer.
 * </p>
 * <p>
 * The LoadBalancer evenly distributes requests across all its registered Availability Zones that contain instances. As a result, the client must ensure
 * that its LoadBalancer is appropriately scaled for each registered Availability Zone.
 * </p>
 * <p>
 * <b>NOTE:</b> The new EC2 Availability Zones to be added must be in the same EC2 Region as the Availability Zones for which the LoadBalancer was
 * created.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest)
 */
public class EnableAvailabilityZonesForLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of new Availability Zones for the LoadBalancer. Each
     * Availability Zone must be in the same Region as the LoadBalancer.
     */
    private java.util.List<String> availabilityZones;

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
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param availabilityZones A list of new Availability Zones for the
     * LoadBalancer. Each Availability Zone must be in the same Region as the
     * LoadBalancer.
     */
    public EnableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName, java.util.List<String> availabilityZones) {
        this.loadBalancerName = loadBalancerName;
        this.availabilityZones = availabilityZones;
    }

    
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of new Availability Zones for the LoadBalancer. Each
     * Availability Zone must be in the same Region as the LoadBalancer.
     *
     * @return A list of new Availability Zones for the LoadBalancer. Each
     *         Availability Zone must be in the same Region as the LoadBalancer.
     */
    public java.util.List<String> getAvailabilityZones() {
        
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of new Availability Zones for the LoadBalancer. Each
     * Availability Zone must be in the same Region as the LoadBalancer.
     *
     * @param availabilityZones A list of new Availability Zones for the LoadBalancer. Each
     *         Availability Zone must be in the same Region as the LoadBalancer.
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
     * A list of new Availability Zones for the LoadBalancer. Each
     * Availability Zone must be in the same Region as the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of new Availability Zones for the LoadBalancer. Each
     *         Availability Zone must be in the same Region as the LoadBalancer.
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
     * A list of new Availability Zones for the LoadBalancer. Each
     * Availability Zone must be in the same Region as the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of new Availability Zones for the LoadBalancer. Each
     *         Availability Zone must be in the same Region as the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
        if (availabilityZones != null) sb.append("AvailabilityZones: " + availabilityZones + ", ");
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
    