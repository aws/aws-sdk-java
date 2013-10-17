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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Provides details of the <code>DecisionTaskCompleted</code> event.
 * </p>
 */
public class DecisionTaskCompletedEventAttributes implements Serializable {

    /**
     * User defined context for the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String executionContext;

    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     */
    private Long scheduledEventId;

    /**
     * The Id of the <code>DecisionTaskStarted</code> event recorded when
     * this decision task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     */
    private Long startedEventId;

    /**
     * User defined context for the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return User defined context for the workflow execution.
     */
    public String getExecutionContext() {
        return executionContext;
    }
    
    /**
     * User defined context for the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param executionContext User defined context for the workflow execution.
     */
    public void setExecutionContext(String executionContext) {
        this.executionContext = executionContext;
    }
    
    /**
     * User defined context for the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param executionContext User defined context for the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecisionTaskCompletedEventAttributes withExecutionContext(String executionContext) {
        this.executionContext = executionContext;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @return The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public Long getScheduledEventId() {
        return scheduledEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @param scheduledEventId The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskScheduled</code> event that was
     * recorded when this decision task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledEventId The id of the <code>DecisionTaskScheduled</code> event that was
     *         recorded when this decision task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecisionTaskCompletedEventAttributes withScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
        return this;
    }

    /**
     * The Id of the <code>DecisionTaskStarted</code> event recorded when
     * this decision task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @return The Id of the <code>DecisionTaskStarted</code> event recorded when
     *         this decision task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The Id of the <code>DecisionTaskStarted</code> event recorded when
     * this decision task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @param startedEventId The Id of the <code>DecisionTaskStarted</code> event recorded when
     *         this decision task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The Id of the <code>DecisionTaskStarted</code> event recorded when
     * this decision task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The Id of the <code>DecisionTaskStarted</code> event recorded when
     *         this decision task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecisionTaskCompletedEventAttributes withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
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
        if (getExecutionContext() != null) sb.append("ExecutionContext: " + getExecutionContext() + ",");
        if (getScheduledEventId() != null) sb.append("ScheduledEventId: " + getScheduledEventId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExecutionContext() == null) ? 0 : getExecutionContext().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecisionTaskCompletedEventAttributes == false) return false;
        DecisionTaskCompletedEventAttributes other = (DecisionTaskCompletedEventAttributes)obj;
        
        if (other.getExecutionContext() == null ^ this.getExecutionContext() == null) return false;
        if (other.getExecutionContext() != null && other.getExecutionContext().equals(this.getExecutionContext()) == false) return false; 
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null) return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        return true;
    }
    
}
    