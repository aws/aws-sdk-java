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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class RegisterContainerInstanceResult implements Serializable, Cloneable {

    /**
     * An EC2 instance that is running the Amazon ECS agent and has been
     * registered with a cluster.
     */
    private ContainerInstance containerInstance;

    /**
     * An EC2 instance that is running the Amazon ECS agent and has been
     * registered with a cluster.
     *
     * @return An EC2 instance that is running the Amazon ECS agent and has been
     *         registered with a cluster.
     */
    public ContainerInstance getContainerInstance() {
        return containerInstance;
    }
    
    /**
     * An EC2 instance that is running the Amazon ECS agent and has been
     * registered with a cluster.
     *
     * @param containerInstance An EC2 instance that is running the Amazon ECS agent and has been
     *         registered with a cluster.
     */
    public void setContainerInstance(ContainerInstance containerInstance) {
        this.containerInstance = containerInstance;
    }
    
    /**
     * An EC2 instance that is running the Amazon ECS agent and has been
     * registered with a cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstance An EC2 instance that is running the Amazon ECS agent and has been
     *         registered with a cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterContainerInstanceResult withContainerInstance(ContainerInstance containerInstance) {
        this.containerInstance = containerInstance;
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
        if (getContainerInstance() != null) sb.append("ContainerInstance: " + getContainerInstance() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterContainerInstanceResult == false) return false;
        RegisterContainerInstanceResult other = (RegisterContainerInstanceResult)obj;
        
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null) return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false) return false; 
        return true;
    }
    
    @Override
    public RegisterContainerInstanceResult clone() {
        try {
            return (RegisterContainerInstanceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    