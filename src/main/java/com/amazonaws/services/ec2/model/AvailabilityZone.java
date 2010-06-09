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
 * An EC2 availability zone, separate and fault tolerant from other
 * availability zones.
 * </p>
 */
public class AvailabilityZone {

    /**
     * Name of the Availability Zone.
     */
    private String zoneName;

    /**
     * State of the Availability Zone.
     */
    private String state;

    /**
     * Name of the region in which this zone resides.
     */
    private String regionName;

    /**
     * Name of the Availability Zone.
     *
     * @return Name of the Availability Zone.
     */
    public String getZoneName() {
        return zoneName;
    }
    
    /**
     * Name of the Availability Zone.
     *
     * @param zoneName Name of the Availability Zone.
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    
    /**
     * Name of the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zoneName Name of the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    
    
    /**
     * State of the Availability Zone.
     *
     * @return State of the Availability Zone.
     */
    public String getState() {
        return state;
    }
    
    /**
     * State of the Availability Zone.
     *
     * @param state State of the Availability Zone.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * State of the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state State of the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Name of the region in which this zone resides.
     *
     * @return Name of the region in which this zone resides.
     */
    public String getRegionName() {
        return regionName;
    }
    
    /**
     * Name of the region in which this zone resides.
     *
     * @param regionName Name of the region in which this zone resides.
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    /**
     * Name of the region in which this zone resides.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regionName Name of the region in which this zone resides.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withRegionName(String regionName) {
        this.regionName = regionName;
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
        
        sb.append("ZoneName: " + zoneName + ", ");
        sb.append("State: " + state + ", ");
        sb.append("RegionName: " + regionName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    