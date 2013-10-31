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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * The instance status details.
 * </p>
 */
public class InstanceStatus implements Serializable {

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     */
    private String state;

    /**
     * The details of the status change reason for the instance.
     */
    private InstanceStateChangeReason stateChangeReason;

    /**
     * The timeline of the instance status over time.
     */
    private InstanceTimeline timeline;

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     *
     * @return The current state of the instance.
     *
     * @see InstanceState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     *
     * @param state The current state of the instance.
     *
     * @see InstanceState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     *
     * @param state The current state of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceState
     */
    public InstanceStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     *
     * @param state The current state of the instance.
     *
     * @see InstanceState
     */
    public void setState(InstanceState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING, TERMINATED
     *
     * @param state The current state of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceState
     */
    public InstanceStatus withState(InstanceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The details of the status change reason for the instance.
     *
     * @return The details of the status change reason for the instance.
     */
    public InstanceStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }
    
    /**
     * The details of the status change reason for the instance.
     *
     * @param stateChangeReason The details of the status change reason for the instance.
     */
    public void setStateChangeReason(InstanceStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }
    
    /**
     * The details of the status change reason for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateChangeReason The details of the status change reason for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withStateChangeReason(InstanceStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * The timeline of the instance status over time.
     *
     * @return The timeline of the instance status over time.
     */
    public InstanceTimeline getTimeline() {
        return timeline;
    }
    
    /**
     * The timeline of the instance status over time.
     *
     * @param timeline The timeline of the instance status over time.
     */
    public void setTimeline(InstanceTimeline timeline) {
        this.timeline = timeline;
    }
    
    /**
     * The timeline of the instance status over time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeline The timeline of the instance status over time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatus withTimeline(InstanceTimeline timeline) {
        this.timeline = timeline;
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
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStateChangeReason() != null) sb.append("StateChangeReason: " + getStateChangeReason() + ",");
        if (getTimeline() != null) sb.append("Timeline: " + getTimeline() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode()); 
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceStatus == false) return false;
        InstanceStatus other = (InstanceStatus)obj;
        
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null) return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false) return false; 
        if (other.getTimeline() == null ^ this.getTimeline() == null) return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false) return false; 
        return true;
    }
    
}
    