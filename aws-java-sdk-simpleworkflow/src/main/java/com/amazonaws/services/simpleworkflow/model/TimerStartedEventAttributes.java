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
 * Provides details of the <code>TimerStarted</code> event.
 * </p>
 */
public class TimerStartedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the timer that was started.
     * </p>
     */
    private String timerId;
    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     */
    private String control;
    /**
     * <p>
     * The duration of time after which the timer will fire.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     */
    private String startToFireTimeout;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The unique ID of the timer that was started.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that was started.
     */

    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that was started.
     * </p>
     * 
     * @return The unique ID of the timer that was started.
     */

    public String getTimerId() {
        return this.timerId;
    }

    /**
     * <p>
     * The unique ID of the timer that was started.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer that was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerStartedEventAttributes withTimerId(String timerId) {
        setTimerId(timerId);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @return Optional.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerStartedEventAttributes withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * <p>
     * The duration of time after which the timer will fire.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @param startToFireTimeout
     *        The duration of time after which the timer will fire.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0.
     */

    public void setStartToFireTimeout(String startToFireTimeout) {
        this.startToFireTimeout = startToFireTimeout;
    }

    /**
     * <p>
     * The duration of time after which the timer will fire.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @return The duration of time after which the timer will fire.</p>
     *         <p>
     *         The duration is specified in seconds; an integer greater than or equal to 0.
     */

    public String getStartToFireTimeout() {
        return this.startToFireTimeout;
    }

    /**
     * <p>
     * The duration of time after which the timer will fire.
     * </p>
     * <p>
     * The duration is specified in seconds; an integer greater than or equal to 0.
     * </p>
     * 
     * @param startToFireTimeout
     *        The duration of time after which the timer will fire.</p>
     *        <p>
     *        The duration is specified in seconds; an integer greater than or equal to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerStartedEventAttributes withStartToFireTimeout(String startToFireTimeout) {
        setStartToFireTimeout(startToFireTimeout);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing
     *        problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>StartTimer</code> decision for this activity task. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing problems
     * by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>StartTimer</code> decision for this activity task. This information can be useful for diagnosing
     *        problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimerStartedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
        if (getTimerId() != null)
            sb.append("TimerId: " + getTimerId() + ",");
        if (getControl() != null)
            sb.append("Control: " + getControl() + ",");
        if (getStartToFireTimeout() != null)
            sb.append("StartToFireTimeout: " + getStartToFireTimeout() + ",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimerStartedEventAttributes == false)
            return false;
        TimerStartedEventAttributes other = (TimerStartedEventAttributes) obj;
        if (other.getTimerId() == null ^ this.getTimerId() == null)
            return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getStartToFireTimeout() == null ^ this.getStartToFireTimeout() == null)
            return false;
        if (other.getStartToFireTimeout() != null && other.getStartToFireTimeout().equals(this.getStartToFireTimeout()) == false)
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
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getStartToFireTimeout() == null) ? 0 : getStartToFireTimeout().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public TimerStartedEventAttributes clone() {
        try {
            return (TimerStartedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
