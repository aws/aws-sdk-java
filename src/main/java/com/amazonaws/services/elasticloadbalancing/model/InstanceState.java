/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * The InstanceState data type.
 * </p>
 */
public class InstanceState {

    /**
     * Provides an EC2 instance ID.
     */
    private String instanceId;

    /**
     * Specifies the current status of the instance.
     */
    private String state;

    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the LoadBalancer.
     */
    private String reasonCode;

    /**
     * Provides a description of the instance.
     */
    private String description;

    /**
     * Default constructor for a new InstanceState object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InstanceState() {}
    
    /**
     * Provides an EC2 instance ID.
     *
     * @return Provides an EC2 instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Provides an EC2 instance ID.
     *
     * @param instanceId Provides an EC2 instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Provides an EC2 instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId Provides an EC2 instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Specifies the current status of the instance.
     *
     * @return Specifies the current status of the instance.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Specifies the current status of the instance.
     *
     * @param state Specifies the current status of the instance.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Specifies the current status of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Specifies the current status of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the LoadBalancer.
     *
     * @return Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the LoadBalancer.
     */
    public String getReasonCode() {
        return reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the LoadBalancer.
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the LoadBalancer.
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    
    
    /**
     * Provides a description of the instance.
     *
     * @return Provides a description of the instance.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides a description of the instance.
     *
     * @param description Provides a description of the instance.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides a description of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides a description of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceState withDescription(String description) {
        this.description = description;
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
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (reasonCode != null) sb.append("ReasonCode: " + reasonCode + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof InstanceState == false) return false;
        InstanceState other = (InstanceState)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getReasonCode() == null ^ this.getReasonCode() == null) return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    