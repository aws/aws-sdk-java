/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>ActivityTaskTimedOut</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTaskTimedOutEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTaskTimedOutEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     */
    private String timeoutType;
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
     * Contains the content of the <code>details</code> parameter for the last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused this event.
     * @see ActivityTaskTimeoutType
     */

    public void setTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
    }

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     * 
     * @return The type of the timeout that caused this event.
     * @see ActivityTaskTimeoutType
     */

    public String getTimeoutType() {
        return this.timeoutType;
    }

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityTaskTimeoutType
     */

    public ActivityTaskTimedOutEventAttributes withTimeoutType(String timeoutType) {
        setTimeoutType(timeoutType);
        return this;
    }

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused this event.
     * @see ActivityTaskTimeoutType
     */

    public void setTimeoutType(ActivityTaskTimeoutType timeoutType) {
        withTimeoutType(timeoutType);
    }

    /**
     * <p>
     * The type of the timeout that caused this event.
     * </p>
     * 
     * @param timeoutType
     *        The type of the timeout that caused this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityTaskTimeoutType
     */

    public ActivityTaskTimedOutEventAttributes withTimeoutType(ActivityTaskTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
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

    public ActivityTaskTimedOutEventAttributes withScheduledEventId(Long scheduledEventId) {
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

    public ActivityTaskTimedOutEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * Contains the content of the <code>details</code> parameter for the last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * </p>
     * 
     * @param details
     *        Contains the content of the <code>details</code> parameter for the last call made by the activity to
     *        <code>RecordActivityTaskHeartbeat</code>.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Contains the content of the <code>details</code> parameter for the last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * </p>
     * 
     * @return Contains the content of the <code>details</code> parameter for the last call made by the activity to
     *         <code>RecordActivityTaskHeartbeat</code>.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Contains the content of the <code>details</code> parameter for the last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * </p>
     * 
     * @param details
     *        Contains the content of the <code>details</code> parameter for the last call made by the activity to
     *        <code>RecordActivityTaskHeartbeat</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTaskTimedOutEventAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimeoutType() != null)
            sb.append("TimeoutType: ").append(getTimeoutType()).append(",");
        if (getScheduledEventId() != null)
            sb.append("ScheduledEventId: ").append(getScheduledEventId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTaskTimedOutEventAttributes == false)
            return false;
        ActivityTaskTimedOutEventAttributes other = (ActivityTaskTimedOutEventAttributes) obj;
        if (other.getTimeoutType() == null ^ this.getTimeoutType() == null)
            return false;
        if (other.getTimeoutType() != null && other.getTimeoutType().equals(this.getTimeoutType()) == false)
            return false;
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null)
            return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutType() == null) ? 0 : getTimeoutType().hashCode());
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ActivityTaskTimedOutEventAttributes clone() {
        try {
            return (ActivityTaskTimedOutEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ActivityTaskTimedOutEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
