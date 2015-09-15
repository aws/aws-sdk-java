/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a running instance in a Spot fleet.
 * </p>
 */
public class ActiveInstance implements Serializable, Cloneable {

    /**
     * The instance type.
     */
    private String instanceType;

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The ID of the Spot instance request.
     */
    private String spotInstanceRequestId;

    /**
     * The instance type.
     *
     * @return The instance type.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     *
     * @param instanceType The instance type.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActiveInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActiveInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The ID of the Spot instance request.
     *
     * @return The ID of the Spot instance request.
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot instance request.
     *
     * @param spotInstanceRequestId The ID of the Spot instance request.
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId The ID of the Spot instance request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActiveInstance withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
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
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getSpotInstanceRequestId() != null) sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActiveInstance == false) return false;
        ActiveInstance other = (ActiveInstance)obj;
        
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null) return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false) return false; 
        return true;
    }
    
    @Override
    public ActiveInstance clone() {
        try {
            return (ActiveInstance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    