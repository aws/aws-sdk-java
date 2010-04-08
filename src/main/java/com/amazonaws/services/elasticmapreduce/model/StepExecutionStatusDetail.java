/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * </p>
 */
public class StepExecutionStatusDetail {

    /**
     * The state of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>PENDING|RUNNING|COMPLETED|CANCELLED|FAILED|INTERRUPTED<br/>
     */
    private String state;

    /**
     * The date and time the step was created.
     */
    private java.util.Date creationDateTime;

    /**
     * The date and time the step was started.
     */
    private java.util.Date startDateTime;

    /**
     * The date and time the step ended.
     */
    private java.util.Date endDateTime;

    /**
     * A description explaining the reason for the last Amazon EC2 status
     * change.
     */
    private String lastStateChangeReason;

    /**
     * The state of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>PENDING|RUNNING|COMPLETED|CANCELLED|FAILED|INTERRUPTED<br/>
     *
     * @return The state of the step.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>PENDING|RUNNING|COMPLETED|CANCELLED|FAILED|INTERRUPTED<br/>
     *
     * @param state The state of the step.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>PENDING|RUNNING|COMPLETED|CANCELLED|FAILED|INTERRUPTED<br/>
     *
     * @param state The state of the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * The date and time the step was created.
     *
     * @return The date and time the step was created.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The date and time the step was created.
     *
     * @param creationDateTime The date and time the step was created.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The date and time the step was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The date and time the step was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    
    
    /**
     * The date and time the step was started.
     *
     * @return The date and time the step was started.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The date and time the step was started.
     *
     * @param startDateTime The date and time the step was started.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The date and time the step was started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The date and time the step was started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    
    /**
     * The date and time the step ended.
     *
     * @return The date and time the step ended.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date and time the step ended.
     *
     * @param endDateTime The date and time the step ended.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date and time the step ended.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date and time the step ended.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    
    
    /**
     * A description explaining the reason for the last Amazon EC2 status
     * change.
     *
     * @return A description explaining the reason for the last Amazon EC2 status
     *         change.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * A description explaining the reason for the last Amazon EC2 status
     * change.
     *
     * @param lastStateChangeReason A description explaining the reason for the last Amazon EC2 status
     *         change.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * A description explaining the reason for the last Amazon EC2 status
     * change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastStateChangeReason A description explaining the reason for the last Amazon EC2 status
     *         change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("State: " + state + ", ");
        sb.append("CreationDateTime: " + creationDateTime + ", ");
        sb.append("StartDateTime: " + startDateTime + ", ");
        sb.append("EndDateTime: " + endDateTime + ", ");
        sb.append("LastStateChangeReason: " + lastStateChangeReason + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    