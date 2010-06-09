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
 * Describes the status of the job flow.
 * </p>
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
     * The creation date and time of the job flow.
     */
    private java.util.Date creationDateTime;

    /**
     * The start date and time of the job flow.
     */
    private java.util.Date startDateTime;

    /**
     * The date and time when the job flow was ready to start running
     * bootstrap actions.
     */
    private java.util.Date readyDateTime;

    /**
     * The completion date and time of the job flow.
     */
    private java.util.Date endDateTime;

    /**
     * Description of the job flow last changed state.
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
     * The creation date and time of the job flow.
     *
     * @return The creation date and time of the job flow.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * The creation date and time of the job flow.
     *
     * @param creationDateTime The creation date and time of the job flow.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * The creation date and time of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The creation date and time of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    
    
    /**
     * The start date and time of the job flow.
     *
     * @return The start date and time of the job flow.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * The start date and time of the job flow.
     *
     * @param startDateTime The start date and time of the job flow.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * The start date and time of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The start date and time of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    
    /**
     * The date and time when the job flow was ready to start running
     * bootstrap actions.
     *
     * @return The date and time when the job flow was ready to start running
     *         bootstrap actions.
     */
    public java.util.Date getReadyDateTime() {
        return readyDateTime;
    }
    
    /**
     * The date and time when the job flow was ready to start running
     * bootstrap actions.
     *
     * @param readyDateTime The date and time when the job flow was ready to start running
     *         bootstrap actions.
     */
    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }
    
    /**
     * The date and time when the job flow was ready to start running
     * bootstrap actions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readyDateTime The date and time when the job flow was ready to start running
     *         bootstrap actions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
        return this;
    }
    
    
    /**
     * The completion date and time of the job flow.
     *
     * @return The completion date and time of the job flow.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * The completion date and time of the job flow.
     *
     * @param endDateTime The completion date and time of the job flow.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * The completion date and time of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The completion date and time of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    
    
    /**
     * Description of the job flow last changed state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @return Description of the job flow last changed state.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * Description of the job flow last changed state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason Description of the job flow last changed state.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * Description of the job flow last changed state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason Description of the job flow last changed state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
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
    