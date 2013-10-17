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
 * Provides details of the <code>ActivityTaskCancelRequested</code> event.
 * </p>
 */
public class ActivityTaskCancelRequestedEventAttributes implements Serializable {

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelActivityTask</code> decision for this cancellation
     * request. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The unique ID of the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelActivityTask</code> decision for this cancellation
     * request. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelActivityTask</code> decision for this cancellation
     *         request. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelActivityTask</code> decision for this cancellation
     * request. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelActivityTask</code> decision for this cancellation
     *         request. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision task that resulted in the
     * <code>RequestCancelActivityTask</code> decision for this cancellation
     * request. This information can be useful for diagnosing problems by
     * tracing back the cause of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision task that resulted in the
     *         <code>RequestCancelActivityTask</code> decision for this cancellation
     *         request. This information can be useful for diagnosing problems by
     *         tracing back the cause of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskCancelRequestedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
        return this;
    }

    /**
     * The unique ID of the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The unique ID of the task.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The unique ID of the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The unique ID of the task.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The unique ID of the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The unique ID of the task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTaskCancelRequestedEventAttributes withActivityId(String activityId) {
        this.activityId = activityId;
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
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTaskCancelRequestedEventAttributes == false) return false;
        ActivityTaskCancelRequestedEventAttributes other = (ActivityTaskCancelRequestedEventAttributes)obj;
        
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        return true;
    }
    
}
    