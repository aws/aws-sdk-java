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
 * Provides details of the <code>ActivityTaskFailed</code> event.
 * </p>
 */
public class ActivityTaskFailedEventAttributes implements Serializable {

    /**
     * The reason provided for the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String reason;

    /**
     * The details of the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * The id of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     */
    private Long scheduledEventId;

    /**
     * The Id of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     */
    private Long startedEventId;

    /**
     * The reason provided for the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The reason provided for the failure (if any).
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * The reason provided for the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason The reason provided for the failure (if any).
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * The reason provided for the failure (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason The reason provided for the failure (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskFailedEventAttributes withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * The details of the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The details of the failure (if any).
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * The details of the failure (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details The details of the failure (if any).
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * The details of the failure (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details The details of the failure (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskFailedEventAttributes withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * The id of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @return The id of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public Long getScheduledEventId() {
        return scheduledEventId;
    }
    
    /**
     * The id of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @param scheduledEventId The id of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }
    
    /**
     * The id of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledEventId The id of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskFailedEventAttributes withScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
        return this;
    }

    /**
     * The Id of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @return The Id of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The Id of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @param startedEventId The Id of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The Id of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The Id of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskFailedEventAttributes withStartedEventId(Long startedEventId) {
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
        if (getReason() != null) sb.append("Reason: " + getReason() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() + ",");
        if (getScheduledEventId() != null) sb.append("ScheduledEventId: " + getScheduledEventId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTaskFailedEventAttributes == false) return false;
        ActivityTaskFailedEventAttributes other = (ActivityTaskFailedEventAttributes)obj;
        
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null) return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        return true;
    }
    
}
    