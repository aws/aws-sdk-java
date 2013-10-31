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
 * The execution status details of the cluster step.
 * </p>
 */
public class StepStatus implements Serializable {

    /**
     * The execution state of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     */
    private String state;

    /**
     * The reason for the step execution status change.
     */
    private StepStateChangeReason stateChangeReason;

    /**
     * The timeline of the cluster step status over time.
     */
    private StepTimeline timeline;

    /**
     * The execution state of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @return The execution state of the cluster step.
     *
     * @see StepState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The execution state of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The execution state of the cluster step.
     *
     * @see StepState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The execution state of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The execution state of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepState
     */
    public StepStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The execution state of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The execution state of the cluster step.
     *
     * @see StepState
     */
    public void setState(StepState state) {
        this.state = state.toString();
    }
    
    /**
     * The execution state of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The execution state of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepState
     */
    public StepStatus withState(StepState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The reason for the step execution status change.
     *
     * @return The reason for the step execution status change.
     */
    public StepStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }
    
    /**
     * The reason for the step execution status change.
     *
     * @param stateChangeReason The reason for the step execution status change.
     */
    public void setStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }
    
    /**
     * The reason for the step execution status change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateChangeReason The reason for the step execution status change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepStatus withStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * The timeline of the cluster step status over time.
     *
     * @return The timeline of the cluster step status over time.
     */
    public StepTimeline getTimeline() {
        return timeline;
    }
    
    /**
     * The timeline of the cluster step status over time.
     *
     * @param timeline The timeline of the cluster step status over time.
     */
    public void setTimeline(StepTimeline timeline) {
        this.timeline = timeline;
    }
    
    /**
     * The timeline of the cluster step status over time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeline The timeline of the cluster step status over time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepStatus withTimeline(StepTimeline timeline) {
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

        if (obj instanceof StepStatus == false) return false;
        StepStatus other = (StepStatus)obj;
        
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null) return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false) return false; 
        if (other.getTimeline() == null ^ this.getTimeline() == null) return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false) return false; 
        return true;
    }
    
}
    