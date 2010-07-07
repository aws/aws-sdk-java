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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing the Amazon EC2 availability zones in the
 * current region.
 * </p>
 */
public class DescribeAvailabilityZonesResult {

    /**
     * The list of described Amazon EC2 availability zones.
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * The list of described Amazon EC2 availability zones.
     *
     * @return The list of described Amazon EC2 availability zones.
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<AvailabilityZone>();
        }
        return availabilityZones;
    }
    
    /**
     * The list of described Amazon EC2 availability zones.
     *
     * @param availabilityZones The list of described Amazon EC2 availability zones.
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * The list of described Amazon EC2 availability zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The list of described Amazon EC2 availability zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(AvailabilityZone... availabilityZones) {
        for (AvailabilityZone value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * The list of described Amazon EC2 availability zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The list of described Amazon EC2 availability zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAvailabilityZonesResult withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

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
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    