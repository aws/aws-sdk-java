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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a registered Amazon ECS cluster.
 * </p>
 */
public class EcsCluster implements Serializable, Cloneable {

    /**
     * The cluster's ARN.
     */
    private String ecsClusterArn;

    /**
     * The cluster name.
     */
    private String ecsClusterName;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The time and date that the cluster was registered with the stack.
     */
    private String registeredAt;

    /**
     * The cluster's ARN.
     *
     * @return The cluster's ARN.
     */
    public String getEcsClusterArn() {
        return ecsClusterArn;
    }
    
    /**
     * The cluster's ARN.
     *
     * @param ecsClusterArn The cluster's ARN.
     */
    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }
    
    /**
     * The cluster's ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusterArn The cluster's ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EcsCluster withEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
        return this;
    }

    /**
     * The cluster name.
     *
     * @return The cluster name.
     */
    public String getEcsClusterName() {
        return ecsClusterName;
    }
    
    /**
     * The cluster name.
     *
     * @param ecsClusterName The cluster name.
     */
    public void setEcsClusterName(String ecsClusterName) {
        this.ecsClusterName = ecsClusterName;
    }
    
    /**
     * The cluster name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusterName The cluster name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EcsCluster withEcsClusterName(String ecsClusterName) {
        this.ecsClusterName = ecsClusterName;
        return this;
    }

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EcsCluster withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The time and date that the cluster was registered with the stack.
     *
     * @return The time and date that the cluster was registered with the stack.
     */
    public String getRegisteredAt() {
        return registeredAt;
    }
    
    /**
     * The time and date that the cluster was registered with the stack.
     *
     * @param registeredAt The time and date that the cluster was registered with the stack.
     */
    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }
    
    /**
     * The time and date that the cluster was registered with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registeredAt The time and date that the cluster was registered with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EcsCluster withRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
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
        if (getEcsClusterArn() != null) sb.append("EcsClusterArn: " + getEcsClusterArn() + ",");
        if (getEcsClusterName() != null) sb.append("EcsClusterName: " + getEcsClusterName() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getRegisteredAt() != null) sb.append("RegisteredAt: " + getRegisteredAt() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode()); 
        hashCode = prime * hashCode + ((getEcsClusterName() == null) ? 0 : getEcsClusterName().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EcsCluster == false) return false;
        EcsCluster other = (EcsCluster)obj;
        
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null) return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false) return false; 
        if (other.getEcsClusterName() == null ^ this.getEcsClusterName() == null) return false;
        if (other.getEcsClusterName() != null && other.getEcsClusterName().equals(this.getEcsClusterName()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null) return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false) return false; 
        return true;
    }
    
    @Override
    public EcsCluster clone() {
        try {
            return (EcsCluster) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    