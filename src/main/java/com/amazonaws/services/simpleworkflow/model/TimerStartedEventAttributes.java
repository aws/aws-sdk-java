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
 * Provides details of the <code>TimerStarted</code> event.
 * </p>
 */
public class TimerStartedEventAttributes implements Serializable {

    /**
     * The unique Id of the timer that was started.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String timerId;

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String control;

    /**
     * The duration of time after which the timer will fire. <p>The duration
     * is specified in seconds. The valid values are integers greater than or
     * equal to 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     */
    private String startToFireTimeout;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>StartTimer</code>
     * decision for this activity task. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The unique Id of the timer that was started.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique Id of the timer that was started.
     */
    public String getTimerId() {
        return timerId;
    }
    
    /**
     * The unique Id of the timer that was started.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param timerId The unique Id of the timer that was started.
     */
    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }
    
    /**
     * The unique Id of the timer that was started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param timerId The unique Id of the timer that was started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerStartedEventAttributes withTimerId(String timerId) {
        this.timerId = timerId;
        return this;
    }

    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     */
    public String getControl() {
        return control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     */
    public void setControl(String control) {
        this.control = control;
    }
    
    /**
     * Optional data attached to the event that can be used by the decider in
     * subsequent workflow tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param control Optional data attached to the event that can be used by the decider in
     *         subsequent workflow tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerStartedEventAttributes withControl(String control) {
        this.control = control;
        return this;
    }

    /**
     * The duration of time after which the timer will fire. <p>The duration
     * is specified in seconds. The valid values are integers greater than or
     * equal to 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @return The duration of time after which the timer will fire. <p>The duration
     *         is specified in seconds. The valid values are integers greater than or
     *         equal to 0.
     */
    public String getStartToFireTimeout() {
        return startToFireTimeout;
    }
    
    /**
     * The duration of time after which the timer will fire. <p>The duration
     * is specified in seconds. The valid values are integers greater than or
     * equal to 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param startToFireTimeout The duration of time after which the timer will fire. <p>The duration
     *         is specified in seconds. The valid values are integers greater than or
     *         equal to 0.
     */
    public void setStartToFireTimeout(String startToFireTimeout) {
        this.startToFireTimeout = startToFireTimeout;
    }
    
    /**
     * The duration of time after which the timer will fire. <p>The duration
     * is specified in seconds. The valid values are integers greater than or
     * equal to 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8<br/>
     *
     * @param startToFireTimeout The duration of time after which the timer will fire. <p>The duration
     *         is specified in seconds. The valid values are integers greater than or
     *         equal to 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerStartedEventAttributes withStartToFireTimeout(String startToFireTimeout) {
        this.startToFireTimeout = startToFireTimeout;
        return this;
    }

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>StartTimer</code>
     * decision for this activity task. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>StartTimer</code>
     *         decision for this activity task. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>StartTimer</code>
     * decision for this activity task. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>StartTimer</code>
     *         decision for this activity task. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the <code>StartTimer</code>
     * decision for this activity task. This information can be useful for
     * diagnosing problems by tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the <code>StartTimer</code>
     *         decision for this activity task. This information can be useful for
     *         diagnosing problems by tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TimerStartedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
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
        if (getControl() != null) sb.append("Control: " + getControl() + ",");
        if (getStartToFireTimeout() != null) sb.append("StartToFireTimeout: " + getStartToFireTimeout() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TimerStartedEventAttributes == false) return false;
        TimerStartedEventAttributes other = (TimerStartedEventAttributes)obj;
        
        if (other.getTimerId() == null ^ this.getTimerId() == null) return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false) return false; 
        if (other.getControl() == null ^ this.getControl() == null) return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false) return false; 
        if (other.getStartToFireTimeout() == null ^ this.getStartToFireTimeout() == null) return false;
        if (other.getStartToFireTimeout() != null && other.getStartToFireTimeout().equals(this.getStartToFireTimeout()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        return true;
    }
    
}
    