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
 * Job Flow Execution Status Detail
 */
public class JobFlowExecutionStatusDetail {

    private String state;

    private java.util.Date creationDateTime;

    private java.util.Date startDateTime;

    private java.util.Date endDateTime;

    private String lastStateChangeReason;

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING<br/>
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING<br/>
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>COMPLETED|FAILED|TERMINATED|RUNNING|SHUTTING_DOWN|STARTING|WAITING<br/>
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Returns the value of the CreationDateTime property for this object.
     *
     * @return The value of the CreationDateTime property for this object.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * Sets the value of the CreationDateTime property for this object.
     *
     * @param creationDateTime The new value for the CreationDateTime property for this object.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * Sets the value of the CreationDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The new value for the CreationDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the StartDateTime property for this object.
     *
     * @return The value of the StartDateTime property for this object.
     */
    public java.util.Date getStartDateTime() {
        return startDateTime;
    }
    
    /**
     * Sets the value of the StartDateTime property for this object.
     *
     * @param startDateTime The new value for the StartDateTime property for this object.
     */
    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }
    
    /**
     * Sets the value of the StartDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startDateTime The new value for the StartDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the EndDateTime property for this object.
     *
     * @return The value of the EndDateTime property for this object.
     */
    public java.util.Date getEndDateTime() {
        return endDateTime;
    }
    
    /**
     * Sets the value of the EndDateTime property for this object.
     *
     * @param endDateTime The new value for the EndDateTime property for this object.
     */
    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    /**
     * Sets the value of the EndDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endDateTime The new value for the EndDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the LastStateChangeReason property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @return The value of the LastStateChangeReason property for this object.
     */
    public String getLastStateChangeReason() {
        return lastStateChangeReason;
    }
    
    /**
     * Sets the value of the LastStateChangeReason property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason The new value for the LastStateChangeReason property for this object.
     */
    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }
    
    /**
     * Sets the value of the LastStateChangeReason property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>MASTER_TERMINATED|START_FAILED|STEP_FAILED<br/>
     *
     * @param lastStateChangeReason The new value for the LastStateChangeReason property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowExecutionStatusDetail withLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
        return this;
    }
    
    
}
    