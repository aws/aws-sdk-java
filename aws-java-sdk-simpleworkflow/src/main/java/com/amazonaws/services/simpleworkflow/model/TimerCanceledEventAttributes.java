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
 * Provides the details of the <code>TimerCanceled</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TimerCanceledEventAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimerCanceledEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the timer that was canceled.
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
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The unique ID of the timer that was canceled.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that was canceled.
     */

    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that was canceled.
     * </p>
     * 
     * @return The unique ID of the timer that was canceled.
     */

    public String getTimerId() {
        return this.timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that was canceled.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerCanceledEventAttributes withTimerId(String timerId) {
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

    public TimerCanceledEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing
     *        problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>CancelTimer</code> decision to cancel this timer. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing problems by
     * tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>CancelTimer</code> decision to cancel this timer. This information can be useful for diagnosing
     *        problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerCanceledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
            sb.append("StartedEventId: ").append(getStartedEventId()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimerCanceledEventAttributes == false)
            return false;
        TimerCanceledEventAttributes other = (TimerCanceledEventAttributes) obj;
        if (other.getTimerId() == null ^ this.getTimerId() == null)
            return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerId() == null) ? 0 : getTimerId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public TimerCanceledEventAttributes clone() {
        try {
            return (TimerCanceledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.TimerCanceledEventAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
