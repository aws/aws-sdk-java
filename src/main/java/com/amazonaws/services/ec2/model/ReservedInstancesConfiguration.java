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
 * The configuration settings for the modified Reserved Instances.
 * </p>
 */
public class ReservedInstancesConfiguration implements Serializable {

    /**
     * The Availability Zone for the modified Reserved Instances.
     */
    private String availabilityZone;

    /**
     * The network platform of the modified Reserved Instances, which is
     * either EC2-Classic or EC2-VPC.
     */
    private String platform;

    /**
     * The number of modified Reserved Instances.
     */
    private Integer instanceCount;

    /**
     * The Availability Zone for the modified Reserved Instances.
     *
     * @return The Availability Zone for the modified Reserved Instances.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone for the modified Reserved Instances.
     *
     * @param availabilityZone The Availability Zone for the modified Reserved Instances.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone for the modified Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone for the modified Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesConfiguration withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The network platform of the modified Reserved Instances, which is
     * either EC2-Classic or EC2-VPC.
     *
     * @return The network platform of the modified Reserved Instances, which is
     *         either EC2-Classic or EC2-VPC.
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The network platform of the modified Reserved Instances, which is
     * either EC2-Classic or EC2-VPC.
     *
     * @param platform The network platform of the modified Reserved Instances, which is
     *         either EC2-Classic or EC2-VPC.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The network platform of the modified Reserved Instances, which is
     * either EC2-Classic or EC2-VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The network platform of the modified Reserved Instances, which is
     *         either EC2-Classic or EC2-VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesConfiguration withPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    
    
    /**
     * The number of modified Reserved Instances.
     *
     * @return The number of modified Reserved Instances.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of modified Reserved Instances.
     *
     * @param instanceCount The number of modified Reserved Instances.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of modified Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of modified Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstancesConfiguration withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstancesConfiguration == false) return false;
        ReservedInstancesConfiguration other = (ReservedInstancesConfiguration)obj;
        
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        return true;
    }
    
}
    