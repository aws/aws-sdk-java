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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Describes where an Amazon EC2 instance is running within an Amazon EC2 region.
 * </p>
 */
public class SpotPlacement implements Serializable {

    /**
     * The availability zone in which an Amazon EC2 instance runs.
     */
    private String availabilityZone;

    /**
     * The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     * runs. Placement groups are primarily used for launching High
     * Performance Computing instances in the same group to ensure fast
     * connection speeds.
     */
    private String groupName;

    /**
     * Default constructor for a new SpotPlacement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SpotPlacement() {}
    
    /**
     * Constructs a new SpotPlacement object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone The availability zone in which an Amazon EC2
     * instance runs.
     */
    public SpotPlacement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * The availability zone in which an Amazon EC2 instance runs.
     *
     * @return The availability zone in which an Amazon EC2 instance runs.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The availability zone in which an Amazon EC2 instance runs.
     *
     * @param availabilityZone The availability zone in which an Amazon EC2 instance runs.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The availability zone in which an Amazon EC2 instance runs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The availability zone in which an Amazon EC2 instance runs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotPlacement withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     * runs. Placement groups are primarily used for launching High
     * Performance Computing instances in the same group to ensure fast
     * connection speeds.
     *
     * @return The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     *         runs. Placement groups are primarily used for launching High
     *         Performance Computing instances in the same group to ensure fast
     *         connection speeds.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     * runs. Placement groups are primarily used for launching High
     * Performance Computing instances in the same group to ensure fast
     * connection speeds.
     *
     * @param groupName The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     *         runs. Placement groups are primarily used for launching High
     *         Performance Computing instances in the same group to ensure fast
     *         connection speeds.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     * runs. Placement groups are primarily used for launching High
     * Performance Computing instances in the same group to ensure fast
     * connection speeds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the <a>PlacementGroup</a> in which an Amazon EC2 instance
     *         runs. Placement groups are primarily used for launching High
     *         Performance Computing instances in the same group to ensure fast
     *         connection speeds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotPlacement withGroupName(String groupName) {
        this.groupName = groupName;
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
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotPlacement == false) return false;
        SpotPlacement other = (SpotPlacement)obj;
        
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        return true;
    }
    
}
    