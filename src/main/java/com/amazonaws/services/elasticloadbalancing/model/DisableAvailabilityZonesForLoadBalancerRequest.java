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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest) DisableAvailabilityZonesForLoadBalancer operation}.
 * <p>
 * Removes the specified EC2 Availability Zones from the set of configured Availability Zones for the LoadBalancer.
 * </p>
 * <p>
 * There must be at least one Availability Zone registered with a LoadBalancer at all times. A client cannot remove all the Availability Zones from a
 * LoadBalancer. Once an Availability Zone is removed, all the instances registered with the LoadBalancer that are in the removed Availability Zone go
 * into the OutOfService state. Upon Availability Zone removal, the LoadBalancer attempts to equally balance the traffic among its remaining usable
 * Availability Zones. Trying to remove an Availability Zone that was not associated with the LoadBalancer does nothing.
 * </p>
 * <p>
 * <b>NOTE:</b> In order for this call to be successful, the client must have created the LoadBalancer. The client must provide the same account
 * credentials as those that were used to create the LoadBalancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest)
 */
public class DisableAvailabilityZonesForLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of Availability Zones to be removed from the LoadBalancer.
     * <note> There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. The client cannot remove all the
     * Availability Zones from a LoadBalancer. Specified Availability Zones
     * must be in the same Region. </note>
     */
    private java.util.List<String> availabilityZones;

    /**
     * Default constructor for a new DisableAvailabilityZonesForLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DisableAvailabilityZonesForLoadBalancerRequest() {}
    
    /**
     * Constructs a new DisableAvailabilityZonesForLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param availabilityZones A list of Availability Zones to be removed
     * from the LoadBalancer. <note> There must be at least one Availability
     * Zone registered with a LoadBalancer at all times. The client cannot
     * remove all the Availability Zones from a LoadBalancer. Specified
     * Availability Zones must be in the same Region. </note>
     */
    public DisableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName, java.util.List<String> availabilityZones) {
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
    public DisableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of Availability Zones to be removed from the LoadBalancer.
     * <note> There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. The client cannot remove all the
     * Availability Zones from a LoadBalancer. Specified Availability Zones
     * must be in the same Region. </note>
     *
     * @return A list of Availability Zones to be removed from the LoadBalancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         LoadBalancer at all times. The client cannot remove all the
     *         Availability Zones from a LoadBalancer. Specified Availability Zones
     *         must be in the same Region. </note>
     */
    public java.util.List<String> getAvailabilityZones() {
        
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones to be removed from the LoadBalancer.
     * <note> There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. The client cannot remove all the
     * Availability Zones from a LoadBalancer. Specified Availability Zones
     * must be in the same Region. </note>
     *
     * @param availabilityZones A list of Availability Zones to be removed from the LoadBalancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         LoadBalancer at all times. The client cannot remove all the
     *         Availability Zones from a LoadBalancer. Specified Availability Zones
     *         must be in the same Region. </note>
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
     * A list of Availability Zones to be removed from the LoadBalancer.
     * <note> There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. The client cannot remove all the
     * Availability Zones from a LoadBalancer. Specified Availability Zones
     * must be in the same Region. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones to be removed from the LoadBalancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         LoadBalancer at all times. The client cannot remove all the
     *         Availability Zones from a LoadBalancer. Specified Availability Zones
     *         must be in the same Region. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DisableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of Availability Zones to be removed from the LoadBalancer.
     * <note> There must be at least one Availability Zone registered with a
     * LoadBalancer at all times. The client cannot remove all the
     * Availability Zones from a LoadBalancer. Specified Availability Zones
     * must be in the same Region. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones to be removed from the LoadBalancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         LoadBalancer at all times. The client cannot remove all the
     *         Availability Zones from a LoadBalancer. Specified Availability Zones
     *         must be in the same Region. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DisableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
    
        if (obj instanceof DisableAvailabilityZonesForLoadBalancerRequest == false) return false;
        DisableAvailabilityZonesForLoadBalancerRequest other = (DisableAvailabilityZonesForLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
}
    