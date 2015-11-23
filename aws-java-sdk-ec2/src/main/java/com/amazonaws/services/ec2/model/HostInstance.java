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
 * 
 */
public class HostInstance implements Serializable, Cloneable {

    /**
     * the IDs of instances that are running on the Dedicated host.
     */
    private String instanceId;

    /**
     * The instance type size (e.g., m3.medium) of the running instance.
     */
    private String instanceType;

    /**
     * the IDs of instances that are running on the Dedicated host.
     *
     * @return the IDs of instances that are running on the Dedicated host.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * the IDs of instances that are running on the Dedicated host.
     *
     * @param instanceId the IDs of instances that are running on the Dedicated host.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * the IDs of instances that are running on the Dedicated host.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId the IDs of instances that are running on the Dedicated host.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance type size (e.g., m3.medium) of the running instance.
     *
     * @return The instance type size (e.g., m3.medium) of the running instance.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type size (e.g., m3.medium) of the running instance.
     *
     * @param instanceType The instance type size (e.g., m3.medium) of the running instance.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type size (e.g., m3.medium) of the running instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type size (e.g., m3.medium) of the running instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HostInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HostInstance == false) return false;
        HostInstance other = (HostInstance)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        return true;
    }
    
    @Override
    public HostInstance clone() {
        try {
            return (HostInstance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    