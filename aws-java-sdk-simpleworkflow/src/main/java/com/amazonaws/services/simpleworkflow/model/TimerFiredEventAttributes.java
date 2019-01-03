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
 * Provides the details of the <code>TimerFired</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TimerFiredEventAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimerFiredEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the timer that fired.
     * </p>
     */
    private String timerId;
    /**
     * <p>
     * The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This information can
     * be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long startedEventId;

    /**
     * <p>
     * The unique ID of the timer that fired.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that fired.
     */

    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that fired.
     * </p>
     * 
     * @return The unique ID of the timer that fired.
     */

    public String getTimerId() {
        return this.timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that fired.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that fired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerFiredEventAttributes withTimerId(String timerId) {
        setTimerId(timerId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This information can
     * be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This information can
     * be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This
     *         information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *         event.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This information can
     * be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>TimerStarted</code> event that was recorded when this timer was started. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerFiredEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
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
        if (getTimerId() != null)
            sb.append("TimerId: ").append(getTimerId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimerFiredEventAttributes == false)
            return false;
        TimerFiredEventAttributes other = (TimerFiredEventAttributes) obj;
        if (other.getTimerId() == null ^ this.getTimerId() == null)
            return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerId() == null) ? 0 : getTimerId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        return hashCode;
    }

    @Override
    public TimerFiredEventAttributes clone() {
        try {
            return (TimerFiredEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.TimerFiredEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
