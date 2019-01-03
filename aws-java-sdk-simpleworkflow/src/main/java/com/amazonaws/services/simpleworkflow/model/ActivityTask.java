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

/**
 * <p>
 * Unit of work sent to an activity worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTask extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     */
    private String taskToken;
    /**
     * <p>
     * The unique ID of the task.
     * </p>
     */
    private String activityId;
    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     * </p>
     */
    private Long startedEventId;
    /**
     * <p>
     * The workflow execution that started this activity task.
     * </p>
     */
    private WorkflowExecution workflowExecution;
    /**
     * <p>
     * The type of this activity task.
     * </p>
     */
    private ActivityType activityType;
    /**
     * <p>
     * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be
     * meaningful to the activity implementation.
     * </p>
     */
    private String input;

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @param taskToken
     *        The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *        response information back to the system about the task.
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @return The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *         response information back to the system about the task.
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     * response information back to the system about the task.
     * </p>
     * 
     * @param taskToken
     *        The opaque string used as a handle on the task. This token is used by workers to communicate progress and
     *        response information back to the system about the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @param activityId
     *        The unique ID of the task.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @return The unique ID of the task.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @param activityId
     *        The unique ID of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withActivityId(String activityId) {
        setActivityId(activityId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @return The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ActivityTaskStarted</code> event recorded in the history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
        return this;
    }

    /**
     * <p>
     * The workflow execution that started this activity task.
     * </p>
     * 
     * @param workflowExecution
     *        The workflow execution that started this activity task.
     */

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    /**
     * <p>
     * The workflow execution that started this activity task.
     * </p>
     * 
     * @return The workflow execution that started this activity task.
     */

    public WorkflowExecution getWorkflowExecution() {
        return this.workflowExecution;
    }

    /**
     * <p>
     * The workflow execution that started this activity task.
     * </p>
     * 
     * @param workflowExecution
     *        The workflow execution that started this activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withWorkflowExecution(WorkflowExecution workflowExecution) {
        setWorkflowExecution(workflowExecution);
        return this;
    }

    /**
     * <p>
     * The type of this activity task.
     * </p>
     * 
     * @param activityType
     *        The type of this activity task.
     */

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    /**
     * <p>
     * The type of this activity task.
     * </p>
     * 
     * @return The type of this activity task.
     */

    public ActivityType getActivityType() {
        return this.activityType;
    }

    /**
     * <p>
     * The type of this activity task.
     * </p>
     * 
     * @param activityType
     *        The type of this activity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withActivityType(ActivityType activityType) {
        setActivityType(activityType);
        return this;
    }

    /**
     * <p>
     * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be
     * meaningful to the activity implementation.
     * </p>
     * 
     * @param input
     *        The inputs provided when the activity task was scheduled. The form of the input is user defined and should
     *        be meaningful to the activity implementation.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be
     * meaningful to the activity implementation.
     * </p>
     * 
     * @return The inputs provided when the activity task was scheduled. The form of the input is user defined and
     *         should be meaningful to the activity implementation.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The inputs provided when the activity task was scheduled. The form of the input is user defined and should be
     * meaningful to the activity implementation.
     * </p>
     * 
     * @param input
     *        The inputs provided when the activity task was scheduled. The form of the input is user defined and should
     *        be meaningful to the activity implementation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTask withInput(String input) {
        setInput(input);
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
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getActivityId() != null)
            sb.append("ActivityId: ").append(getActivityId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId()).append(",");
        if (getWorkflowExecution() != null)
            sb.append("WorkflowExecution: ").append(getWorkflowExecution()).append(",");
        if (getActivityType() != null)
            sb.append("ActivityType: ").append(getActivityType()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTask == false)
            return false;
        ActivityTask other = (ActivityTask) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null)
            return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false)
            return false;
        if (other.getActivityType() == null ^ this.getActivityType() == null)
            return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
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
    public ActivityTask clone() {
        try {
            return (ActivityTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
