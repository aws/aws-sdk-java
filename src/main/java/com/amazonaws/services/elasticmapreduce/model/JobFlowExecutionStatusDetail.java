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
 * 
 */
public class JobFlowExecutionStatusDetail {

    /**
     * The state of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING|BOOTSTRAPPING<br/>
     */
    private String state;

    /**
     * The date and time the job flow was created.
     */
    private java.util.Date creationDateTime;

    /**
     * The date and time the job flow started.
     */
    private java.util.Date startDateTime;

    private java.util.Date readyDateTime;

    /**
     * The date and time the job flow ended.
     */
    private java.util.Date endDateTime;

    /**
     * Contains a description explaining the reason for the last Amazon EC2
     * status change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     */
    private String lastStateChangeReason;

    /**
     * The state of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING|BOOTSTRAPPING<br/>
     *
     * @return The state of the job flow.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING|BOOTSTRAPPING<br/>
     *
     * @param state The state of the job flow.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING|BOOTSTRAPPING<br/>
     *
     * @param state The state of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * The date and time the job flow was created.
     *
     * @return The date and time the job flow was created.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The date and time the job flow was created.
     *
     * @param creationDateTime The date and time the job flow was created.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The date and time the job flow was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The date and time the job flow was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    
    
    /**
     * The date and time the job flow started.
     *
     * @return The date and time the job flow started.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The date and time the job flow started.
     *
     * @param startDateTime The date and time the job flow started.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The date and time the job flow started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The date and time the job flow started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the ReadyDateTime property for this object.
     *
     * @return The value of the ReadyDateTime property for this object.
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }
    
    /**
     * Sets the value of the ReadyDateTime property for this object.
     *
     * @param readyDateTime The new value for the ReadyDateTime property for this object.
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }
    
    /**
     * Sets the value of the ReadyDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readyDateTime The new value for the ReadyDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }
    
    
    /**
     * The date and time the job flow ended.
     *
     * @return The date and time the job flow ended.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The date and time the job flow ended.
     *
     * @param endDateTime The date and time the job flow ended.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The date and time the job flow ended.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The date and time the job flow ended.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    
    
    /**
     * Contains a description explaining the reason for the last Amazon EC2
     * status change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @return Contains a description explaining the reason for the last Amazon EC2
     *         status change.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * Contains a description explaining the reason for the last Amazon EC2
     * status change.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason Contains a description explaining the reason for the last Amazon EC2
     *         status change.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * Contains a description explaining the reason for the last Amazon EC2
     * status change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason Contains a description explaining the reason for the last Amazon EC2
     *         status change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
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
        sb.append("ReadyDateTime: " + readyDateTime + ", ");
        sb.append("EndDateTime: " + endDateTime + ", ");
        sb.append("LastStateChangeReason: " + lastStateChangeReason + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    