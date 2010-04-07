/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * 
 * </p>
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
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
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
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
}
    