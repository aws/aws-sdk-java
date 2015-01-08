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
 * Describes the monitoring information of the instance.
 * </p>
 */
public class InstanceMonitoring implements Serializable {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The monitoring information.
     */
    private Monitoring monitoring;

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
    public InstanceMonitoring withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The monitoring information.
     *
     * @return The monitoring information.
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * The monitoring information.
     *
     * @param monitoring The monitoring information.
     */
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * The monitoring information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring The monitoring information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceMonitoring withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
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
        if (getMonitoring() != null) sb.append("Monitoring: " + getMonitoring() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceMonitoring == false) return false;
        InstanceMonitoring other = (InstanceMonitoring)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getMonitoring() == null ^ this.getMonitoring() == null) return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false) return false; 
        return true;
    }
    
}
    