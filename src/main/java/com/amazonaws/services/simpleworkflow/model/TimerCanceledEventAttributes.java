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
 * Provides details of the <code>TimerCanceled</code> event.
 * </p>
 */
public class TimerCanceledEventAttributes implements Serializable {

    /**
     * The unique Id of the timer that was canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String timerId;

    /**
     * The id of the <code>TimerStarted</code> event that was recorded when
     * this timer was started. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     */
    private Long startedEventId;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>CancelTimer</code>
     * decision to cancel this timer. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The unique Id of the timer that was canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique Id of the timer that was canceled.
     */
    public String getTimerId() {
        return timerId;
    }
    
    /**
     * The unique Id of the timer that was canceled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param timerId The unique Id of the timer that was canceled.
     */
    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }
    
    /**
     * The unique Id of the timer that was canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param timerId The unique Id of the timer that was canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerCanceledEventAttributes withTimerId(String timerId) {
        this.timerId = timerId;
        return this;
    }

    /**
     * The id of the <code>TimerStarted</code> event that was recorded when
     * this timer was started. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     *
     * @return The id of the <code>TimerStarted</code> event that was recorded when
     *         this timer was started. This information can be useful for diagnosing
     *         problems by tracing back the chain of events leading up to this event.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The id of the <code>TimerStarted</code> event that was recorded when
     * this timer was started. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     *
     * @param startedEventId The id of the <code>TimerStarted</code> event that was recorded when
     *         this timer was started. This information can be useful for diagnosing
     *         problems by tracing back the chain of events leading up to this event.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The id of the <code>TimerStarted</code> event that was recorded when
     * this timer was started. This information can be useful for diagnosing
     * problems by tracing back the chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The id of the <code>TimerStarted</code> event that was recorded when
     *         this timer was started. This information can be useful for diagnosing
     *         problems by tracing back the chain of events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerCanceledEventAttributes withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>CancelTimer</code>
     * decision to cancel this timer. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>CancelTimer</code>
     *         decision to cancel this timer. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>CancelTimer</code>
     * decision to cancel this timer. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>CancelTimer</code>
     *         decision to cancel this timer. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>CancelTimer</code>
     * decision to cancel this timer. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>CancelTimer</code>
     *         decision to cancel this timer. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerCanceledEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
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
        if (getTimerId() != null) sb.append("TimerId: " + getTimerId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TimerCanceledEventAttributes == false) return false;
        TimerCanceledEventAttributes other = (TimerCanceledEventAttributes)obj;
        
        if (other.getTimerId() == null ^ this.getTimerId() == null) return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        return true;
    }
    
}
    