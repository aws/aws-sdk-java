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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest) DisableAvailabilityZonesForLoadBalancer operation}.
 * <p>
 * Removes the specified EC2 Availability Zones from the set of configured Availability Zones for the load balancer.
 * </p>
 * <p>
 * There must be at least one Availability Zone registered with a load balancer at all times. Once an Availability Zone is removed, all the instances
 * registered with the load balancer that are in the removed Availability Zone go into the <i>OutOfService</i> state. Upon Availability Zone removal, the
 * load balancer attempts to equally balance the traffic among its remaining usable Availability Zones. Trying to remove an Availability Zone that was
 * not associated with the load balancer does nothing.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_ShrinkLBApp04.html"> Disable an
 * Availability Zone from a Load-Balanced Application </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest)
 */
public class DisableAvailabilityZonesForLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * A list of Availability Zones to be removed from the load balancer.
     * <note> There must be at least one Availability Zone registered with a
     * load balancer at all times. Specified Availability Zones must be in
     * the same region. </note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

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
     * @param loadBalancerName The name associated with the load balancer.
     * @param availabilityZones A list of Availability Zones to be removed
     * from the load balancer. <note> There must be at least one Availability
     * Zone registered with a load balancer at all times. Specified
     * Availability Zones must be in the same region. </note>
     */
    public DisableAvailabilityZonesForLoadBalancerRequest(String loadBalancerName, java.util.List<String> availabilityZones) {
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
    public DisableAvailabilityZonesForLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of Availability Zones to be removed from the load balancer.
     * <note> There must be at least one Availability Zone registered with a
     * load balancer at all times. Specified Availability Zones must be in
     * the same region. </note>
     *
     * @return A list of Availability Zones to be removed from the load balancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         load balancer at all times. Specified Availability Zones must be in
     *         the same region. </note>
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones to be removed from the load balancer.
     * <note> There must be at least one Availability Zone registered with a
     * load balancer at all times. Specified Availability Zones must be in
     * the same region. </note>
     *
     * @param availabilityZones A list of Availability Zones to be removed from the load balancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         load balancer at all times. Specified Availability Zones must be in
     *         the same region. </note>
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
     * A list of Availability Zones to be removed from the load balancer.
     * <note> There must be at least one Availability Zone registered with a
     * load balancer at all times. Specified Availability Zones must be in
     * the same region. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones to be removed from the load balancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         load balancer at all times. Specified Availability Zones must be in
     *         the same region. </note>
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
     * A list of Availability Zones to be removed from the load balancer.
     * <note> There must be at least one Availability Zone registered with a
     * load balancer at all times. Specified Availability Zones must be in
     * the same region. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones to be removed from the load balancer.
     *         <note> There must be at least one Availability Zone registered with a
     *         load balancer at all times. Specified Availability Zones must be in
     *         the same region. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisableAvailabilityZonesForLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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

        if (obj instanceof DisableAvailabilityZonesForLoadBalancerRequest == false) return false;
        DisableAvailabilityZonesForLoadBalancerRequest other = (DisableAvailabilityZonesForLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        return true;
    }
    
}
    