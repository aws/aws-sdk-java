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
 * Describes where an Amazon EC2 instance is running within an Amazon
 * EC2 region.
 * </p>
 */
public class Placement {

    /**
     * The availability zone in which an Amazon EC2 instance runs.
     */
    private String availabilityZone;

    /**
     * The name of a <a>PlacementGroup</a>.
     */
    private String groupName;

    /**
     * Default constructor for a new Placement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Placement() {}
    
    /**
     * Constructs a new Placement object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone The availability zone in which an Amazon EC2
     * instance runs.
     */
    public Placement(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
    public Placement withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The name of a <a>PlacementGroup</a>.
     *
     * @return The name of a <a>PlacementGroup</a>.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of a <a>PlacementGroup</a>.
     *
     * @param groupName The name of a <a>PlacementGroup</a>.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of a <a>PlacementGroup</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of a <a>PlacementGroup</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Placement withGroupName(String groupName) {
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
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("GroupName: " + groupName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    