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
 * The execution state of a step.
 * </p>
 */
public class StepExecutionStatusDetail implements Serializable {

    /**
     * The state of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     */
    private String state;

    /**
     * The creation date and time of the step.
     */
    private java.util.Date creationDateTime;

    /**
     * The start date and time of the step.
     */
    private java.util.Date startDateTime;

    /**
     * The completion date and time of the step.
     */
    private java.util.Date endDateTime;

    /**
     * A description of the step's current state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String lastStateChangeReason;

    /**
     * Default constructor for a new StepExecutionStatusDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StepExecutionStatusDetail() {}
    
    /**
     * Constructs a new StepExecutionStatusDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param state The state of the job flow step.
     * @param creationDateTime The creation date and time of the step.
     */
    public StepExecutionStatusDetail(String state, java.util.Date creationDateTime) {
        setState(state);
        setCreationDateTime(creationDateTime);
    }

    /**
     * Constructs a new StepExecutionStatusDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param state The state of the job flow step.
     * @param creationDateTime The creation date and time of the step.
     */
    public StepExecutionStatusDetail(StepExecutionState state, java.util.Date creationDateTime) {
        this.state = state.toString();
        this.creationDateTime = creationDateTime;
    }

    /**
     * The state of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @return The state of the job flow step.
     *
     * @see StepExecutionState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The state of the job flow step.
     *
     * @see StepExecutionState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the job flow step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The state of the job flow step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepExecutionState
     */
    public StepExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The state of the job flow step.
     *
     * @see StepExecutionState
     */
    public void setState(StepExecutionState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the job flow step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, CONTINUE, COMPLETED, CANCELLED, FAILED, INTERRUPTED
     *
     * @param state The state of the job flow step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StepExecutionState
     */
    public StepExecutionStatusDetail withState(StepExecutionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The creation date and time of the step.
     *
     * @return The creation date and time of the step.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The creation date and time of the step.
     *
     * @param creationDateTime The creation date and time of the step.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The creation date and time of the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The creation date and time of the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * The start date and time of the step.
     *
     * @return The start date and time of the step.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The start date and time of the step.
     *
     * @param startDateTime The start date and time of the step.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The start date and time of the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The start date and time of the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * The completion date and time of the step.
     *
     * @return The completion date and time of the step.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The completion date and time of the step.
     *
     * @param endDateTime The completion date and time of the step.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The completion date and time of the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The completion date and time of the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * A description of the step's current state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A description of the step's current state.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * A description of the step's current state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lastStateChangeReason A description of the step's current state.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * A description of the step's current state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param lastStateChangeReason A description of the step's current state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StepExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
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
        if (getCreationDateTime() != null) sb.append("CreationDateTime: " + getCreationDateTime() + ",");
        if (getStartDateTime() != null) sb.append("StartDateTime: " + getStartDateTime() + ",");
        if (getEndDateTime() != null) sb.append("EndDateTime: " + getEndDateTime() + ",");
        if (getLastStateChangeReason() != null) sb.append("LastStateChangeReason: " + getLastStateChangeReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StepExecutionStatusDetail == false) return false;
        StepExecutionStatusDetail other = (StepExecutionStatusDetail)obj;
        
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null) return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false) return false; 
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null) return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false) return false; 
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null) return false;
        if (other.getLastStateChangeReason() != null && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false) return false; 
        return true;
    }
    
}
    