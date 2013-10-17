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
 * Unit of work sent to an activity worker.
 * </p>
 */
public class ActivityTask implements Serializable {

    /**
     * The opaque string used as a handle on the task. This token is used by
     * workers to communicate progress and response information back to the
     * system about the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String taskToken;

    /**
     * The unique ID of the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * The id of the <code>ActivityTaskStarted</code> event recorded in the
     * history.
     */
    private Long startedEventId;

    /**
     * The workflow execution that started this activity task.
     */
    private WorkflowExecution workflowExecution;

    /**
     * The type of this activity task.
     */
    private ActivityType activityType;

    /**
     * The inputs provided when the activity task was scheduled. The form of
     * the input is user defined and should be meaningful to the activity
     * implementation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The opaque string used as a handle on the task. This token is used by
     * workers to communicate progress and response information back to the
     * system about the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The opaque string used as a handle on the task. This token is used by
     *         workers to communicate progress and response information back to the
     *         system about the task.
     */
    public String getTaskToken() {
        return taskToken;
    }
    
    /**
     * The opaque string used as a handle on the task. This token is used by
     * workers to communicate progress and response information back to the
     * system about the task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The opaque string used as a handle on the task. This token is used by
     *         workers to communicate progress and response information back to the
     *         system about the task.
     */
    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }
    
    /**
     * The opaque string used as a handle on the task. This token is used by
     * workers to communicate progress and response information back to the
     * system about the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param taskToken The opaque string used as a handle on the task. This token is used by
     *         workers to communicate progress and response information back to the
     *         system about the task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTask withTaskToken(String taskToken) {
        this.taskToken = taskToken;
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
    public ActivityTask withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The id of the <code>ActivityTaskStarted</code> event recorded in the
     * history.
     *
     * @return The id of the <code>ActivityTaskStarted</code> event recorded in the
     *         history.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The id of the <code>ActivityTaskStarted</code> event recorded in the
     * history.
     *
     * @param startedEventId The id of the <code>ActivityTaskStarted</code> event recorded in the
     *         history.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The id of the <code>ActivityTaskStarted</code> event recorded in the
     * history.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The id of the <code>ActivityTaskStarted</code> event recorded in the
     *         history.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTask withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
        return this;
    }

    /**
     * The workflow execution that started this activity task.
     *
     * @return The workflow execution that started this activity task.
     */
    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }
    
    /**
     * The workflow execution that started this activity task.
     *
     * @param workflowExecution The workflow execution that started this activity task.
     */
    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }
    
    /**
     * The workflow execution that started this activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecution The workflow execution that started this activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTask withWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
        return this;
    }

    /**
     * The type of this activity task.
     *
     * @return The type of this activity task.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The type of this activity task.
     *
     * @param activityType The type of this activity task.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The type of this activity task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The type of this activity task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTask withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The inputs provided when the activity task was scheduled. The form of
     * the input is user defined and should be meaningful to the activity
     * implementation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The inputs provided when the activity task was scheduled. The form of
     *         the input is user defined and should be meaningful to the activity
     *         implementation.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The inputs provided when the activity task was scheduled. The form of
     * the input is user defined and should be meaningful to the activity
     * implementation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The inputs provided when the activity task was scheduled. The form of
     *         the input is user defined and should be meaningful to the activity
     *         implementation.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The inputs provided when the activity task was scheduled. The form of
     * the input is user defined and should be meaningful to the activity
     * implementation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The inputs provided when the activity task was scheduled. The form of
     *         the input is user defined and should be meaningful to the activity
     *         implementation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTask withInput(String input) {
        this.input = input;
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
        if (getTaskToken() != null) sb.append("TaskToken: " + getTaskToken() + ",");
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() + ",");
        if (getWorkflowExecution() != null) sb.append("WorkflowExecution: " + getWorkflowExecution() + ",");
        if (getActivityType() != null) sb.append("ActivityType: " + getActivityType() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode()); 
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode()); 
        hashCode = prime * hashCode + ((getActivityType() == null) ? 0 : getActivityType().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTask == false) return false;
        ActivityTask other = (ActivityTask)obj;
        
        if (other.getTaskToken() == null ^ this.getTaskToken() == null) return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false) return false; 
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null) return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false) return false; 
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        return true;
    }
    
}
    