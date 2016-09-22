/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>ActivityTaskCanceled</code> event.
 * </p>
 */
public class ActivityTaskCanceledEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the cancellation (if any).
     * </p>
     */
    private String details;
    /**
     * <p>
     * The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     */
    private Long scheduledEventId;
    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     * information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long startedEventId;
    /**
     * <p>
     * If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this activity
     * task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     */
    private Long latestCancelRequestedEventId;

    /**
     * <p>
     * Details of the cancellation (if any).
     * </p>
     * 
     * @param details
     *        Details of the cancellation (if any).
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Details of the cancellation (if any).
     * </p>
     * 
     * @return Details of the cancellation (if any).
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details of the cancellation (if any).
     * </p>
     * 
     * @param details
     *        Details of the cancellation (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskCanceledEventAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was
     *        scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     */

    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @return The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was
     *         scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */

    public Long getScheduledEventId() {
        return this.scheduledEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was scheduled.
     * This information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     * event.
     * </p>
     * 
     * @param scheduledEventId
     *        The ID of the <code>ActivityTaskScheduled</code> event that was recorded when this activity task was
     *        scheduled. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskCanceledEventAttributes withScheduledEventId(Long scheduledEventId) {
        setScheduledEventId(scheduledEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     * information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     * information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     *         information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *         event.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     * information can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ActivityTaskStarted</code> event recorded when this activity task was started. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskCanceledEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this activity
     * task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param latestCancelRequestedEventId
     *        If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this
     *        activity task. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     */

    public void setLatestCancelRequestedEventId(Long latestCancelRequestedEventId) {
        this.latestCancelRequestedEventId = latestCancelRequestedEventId;
    }

    /**
     * <p>
     * If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this activity
     * task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @return If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this
     *         activity task. This information can be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */

    public Long getLatestCancelRequestedEventId() {
        return this.latestCancelRequestedEventId;
    }

    /**
     * <p>
     * If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this activity
     * task. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param latestCancelRequestedEventId
     *        If set, contains the ID of the last <code>ActivityTaskCancelRequested</code> event recorded for this
     *        activity task. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskCanceledEventAttributes withLatestCancelRequestedEventId(Long latestCancelRequestedEventId) {
        setLatestCancelRequestedEventId(latestCancelRequestedEventId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getScheduledEventId() != null)
            sb.append("ScheduledEventId: " + getScheduledEventId() + ",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: " + getStartedEventId() + ",");
        if (getLatestCancelRequestedEventId() != null)
            sb.append("LatestCancelRequestedEventId: " + getLatestCancelRequestedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTaskCanceledEventAttributes == false)
            return false;
        ActivityTaskCanceledEventAttributes other = (ActivityTaskCanceledEventAttributes) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null)
            return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getLatestCancelRequestedEventId() == null ^ this.getLatestCancelRequestedEventId() == null)
            return false;
        if (other.getLatestCancelRequestedEventId() != null && other.getLatestCancelRequestedEventId().equals(this.getLatestCancelRequestedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        hashCode = prime * hashCode + ((getLatestCancelRequestedEventId() == null) ? 0 : getLatestCancelRequestedEventId().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTaskCanceledEventAttributes clone() {
        try {
            return (ActivityTaskCanceledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
