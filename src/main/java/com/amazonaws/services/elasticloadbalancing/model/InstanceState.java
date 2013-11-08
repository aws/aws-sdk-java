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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The InstanceState data type.
 * </p>
 */
public class InstanceState implements Serializable {

    /**
     * Provides an EC2 instance ID.
     */
    private String instanceId;

    /**
     * Specifies the current state of the instance. <p>Valid value:
     * <code>InService</code>|<code>OutOfService</code>
     */
    private String state;

    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the load balancer. <p>Valid value:
     * <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     */
    private String reasonCode;

    /**
     * Provides a description of the instance state.
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
     * Specifies the current state of the instance. <p>Valid value:
     * <code>InService</code>|<code>OutOfService</code>
     *
     * @return Specifies the current state of the instance. <p>Valid value:
     *         <code>InService</code>|<code>OutOfService</code>
     */
    public String getState() {
        return state;
    }
    
    /**
     * Specifies the current state of the instance. <p>Valid value:
     * <code>InService</code>|<code>OutOfService</code>
     *
     * @param state Specifies the current state of the instance. <p>Valid value:
     *         <code>InService</code>|<code>OutOfService</code>
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Specifies the current state of the instance. <p>Valid value:
     * <code>InService</code>|<code>OutOfService</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Specifies the current state of the instance. <p>Valid value:
     *         <code>InService</code>|<code>OutOfService</code>
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
     * or the instance behind the load balancer. <p>Valid value:
     * <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     *
     * @return Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the load balancer. <p>Valid value:
     *         <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     */
    public String getReasonCode() {
        return reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the load balancer. <p>Valid value:
     * <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the load balancer. <p>Valid value:
     *         <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
    
    /**
     * Provides information about the cause of <i>OutOfService</i> instances.
     * Specifically, it indicates whether the cause is Elastic Load Balancing
     * or the instance behind the load balancer. <p>Valid value:
     * <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reasonCode Provides information about the cause of <i>OutOfService</i> instances.
     *         Specifically, it indicates whether the cause is Elastic Load Balancing
     *         or the instance behind the load balancer. <p>Valid value:
     *         <code>ELB</code>|<code>Instance</code>|<code>N/A</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceState withReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Provides a description of the instance state.
     *
     * @return Provides a description of the instance state.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Provides a description of the instance state.
     *
     * @param description Provides a description of the instance state.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Provides a description of the instance state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Provides a description of the instance state.
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getReasonCode() != null) sb.append("ReasonCode: " + getReasonCode() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
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
    