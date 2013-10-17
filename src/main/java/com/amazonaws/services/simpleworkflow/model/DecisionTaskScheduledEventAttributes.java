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
 * Provides details of the <code>DecisionTaskScheduled</code> event.
 * </p>
 */
public class DecisionTaskScheduledEventAttributes implements Serializable {

    /**
     * The name of the task list in which the decision task was scheduled.
     */
    private TaskList taskList;

    /**
     * The maximum duration for this decision task. The task is considered
     * timed out if it does not completed within this duration. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String startToCloseTimeout;

    /**
     * The name of the task list in which the decision task was scheduled.
     *
     * @return The name of the task list in which the decision task was scheduled.
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The name of the task list in which the decision task was scheduled.
     *
     * @param taskList The name of the task list in which the decision task was scheduled.
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The name of the task list in which the decision task was scheduled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The name of the task list in which the decision task was scheduled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecisionTaskScheduledEventAttributes withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The maximum duration for this decision task. The task is considered
     * timed out if it does not completed within this duration. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The maximum duration for this decision task. The task is considered
     *         timed out if it does not completed within this duration. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getStartToCloseTimeout() {
        return startToCloseTimeout;
    }
    
    /**
     * The maximum duration for this decision task. The task is considered
     * timed out if it does not completed within this duration. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout The maximum duration for this decision task. The task is considered
     *         timed out if it does not completed within this duration. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
    }
    
    /**
     * The maximum duration for this decision task. The task is considered
     * timed out if it does not completed within this duration. <p>The valid
     * values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param startToCloseTimeout The maximum duration for this decision task. The task is considered
     *         timed out if it does not completed within this duration. <p>The valid
     *         values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecisionTaskScheduledEventAttributes withStartToCloseTimeout(String startToCloseTimeout) {
        this.startToCloseTimeout = startToCloseTimeout;
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
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getStartToCloseTimeout() != null) sb.append("StartToCloseTimeout: " + getStartToCloseTimeout() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getStartToCloseTimeout() == null) ? 0 : getStartToCloseTimeout().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecisionTaskScheduledEventAttributes == false) return false;
        DecisionTaskScheduledEventAttributes other = (DecisionTaskScheduledEventAttributes)obj;
        
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getStartToCloseTimeout() == null ^ this.getStartToCloseTimeout() == null) return false;
        if (other.getStartToCloseTimeout() != null && other.getStartToCloseTimeout().equals(this.getStartToCloseTimeout()) == false) return false; 
        return true;
    }
    
}
    