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
 * Contains the counts of open tasks, child workflow executions and timers for a workflow execution.
 * </p>
 */
public class WorkflowExecutionOpenCounts implements Serializable {

    /**
     * The count of activity tasks whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer openActivityTasks;

    /**
     * The count of decision tasks whose status is OPEN. A workflow execution
     * can have at most one open decision task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Integer openDecisionTasks;

    /**
     * The count of timers started by this workflow execution that have not
     * fired yet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer openTimers;

    /**
     * The count of child workflow executions whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer openChildWorkflowExecutions;

    /**
     * The count of activity tasks whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The count of activity tasks whose status is OPEN.
     */
    public Integer getOpenActivityTasks() {
        return openActivityTasks;
    }
    
    /**
     * The count of activity tasks whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openActivityTasks The count of activity tasks whose status is OPEN.
     */
    public void setOpenActivityTasks(Integer openActivityTasks) {
        this.openActivityTasks = openActivityTasks;
    }
    
    /**
     * The count of activity tasks whose status is OPEN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openActivityTasks The count of activity tasks whose status is OPEN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionOpenCounts withOpenActivityTasks(Integer openActivityTasks) {
        this.openActivityTasks = openActivityTasks;
        return this;
    }

    /**
     * The count of decision tasks whose status is OPEN. A workflow execution
     * can have at most one open decision task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return The count of decision tasks whose status is OPEN. A workflow execution
     *         can have at most one open decision task.
     */
    public Integer getOpenDecisionTasks() {
        return openDecisionTasks;
    }
    
    /**
     * The count of decision tasks whose status is OPEN. A workflow execution
     * can have at most one open decision task.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param openDecisionTasks The count of decision tasks whose status is OPEN. A workflow execution
     *         can have at most one open decision task.
     */
    public void setOpenDecisionTasks(Integer openDecisionTasks) {
        this.openDecisionTasks = openDecisionTasks;
    }
    
    /**
     * The count of decision tasks whose status is OPEN. A workflow execution
     * can have at most one open decision task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param openDecisionTasks The count of decision tasks whose status is OPEN. A workflow execution
     *         can have at most one open decision task.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionOpenCounts withOpenDecisionTasks(Integer openDecisionTasks) {
        this.openDecisionTasks = openDecisionTasks;
        return this;
    }

    /**
     * The count of timers started by this workflow execution that have not
     * fired yet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The count of timers started by this workflow execution that have not
     *         fired yet.
     */
    public Integer getOpenTimers() {
        return openTimers;
    }
    
    /**
     * The count of timers started by this workflow execution that have not
     * fired yet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openTimers The count of timers started by this workflow execution that have not
     *         fired yet.
     */
    public void setOpenTimers(Integer openTimers) {
        this.openTimers = openTimers;
    }
    
    /**
     * The count of timers started by this workflow execution that have not
     * fired yet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openTimers The count of timers started by this workflow execution that have not
     *         fired yet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionOpenCounts withOpenTimers(Integer openTimers) {
        this.openTimers = openTimers;
        return this;
    }

    /**
     * The count of child workflow executions whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The count of child workflow executions whose status is OPEN.
     */
    public Integer getOpenChildWorkflowExecutions() {
        return openChildWorkflowExecutions;
    }
    
    /**
     * The count of child workflow executions whose status is OPEN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openChildWorkflowExecutions The count of child workflow executions whose status is OPEN.
     */
    public void setOpenChildWorkflowExecutions(Integer openChildWorkflowExecutions) {
        this.openChildWorkflowExecutions = openChildWorkflowExecutions;
    }
    
    /**
     * The count of child workflow executions whose status is OPEN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param openChildWorkflowExecutions The count of child workflow executions whose status is OPEN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionOpenCounts withOpenChildWorkflowExecutions(Integer openChildWorkflowExecutions) {
        this.openChildWorkflowExecutions = openChildWorkflowExecutions;
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
        if (getOpenActivityTasks() != null) sb.append("OpenActivityTasks: " + getOpenActivityTasks() + ",");
        if (getOpenDecisionTasks() != null) sb.append("OpenDecisionTasks: " + getOpenDecisionTasks() + ",");
        if (getOpenTimers() != null) sb.append("OpenTimers: " + getOpenTimers() + ",");
        if (getOpenChildWorkflowExecutions() != null) sb.append("OpenChildWorkflowExecutions: " + getOpenChildWorkflowExecutions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOpenActivityTasks() == null) ? 0 : getOpenActivityTasks().hashCode()); 
        hashCode = prime * hashCode + ((getOpenDecisionTasks() == null) ? 0 : getOpenDecisionTasks().hashCode()); 
        hashCode = prime * hashCode + ((getOpenTimers() == null) ? 0 : getOpenTimers().hashCode()); 
        hashCode = prime * hashCode + ((getOpenChildWorkflowExecutions() == null) ? 0 : getOpenChildWorkflowExecutions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionOpenCounts == false) return false;
        WorkflowExecutionOpenCounts other = (WorkflowExecutionOpenCounts)obj;
        
        if (other.getOpenActivityTasks() == null ^ this.getOpenActivityTasks() == null) return false;
        if (other.getOpenActivityTasks() != null && other.getOpenActivityTasks().equals(this.getOpenActivityTasks()) == false) return false; 
        if (other.getOpenDecisionTasks() == null ^ this.getOpenDecisionTasks() == null) return false;
        if (other.getOpenDecisionTasks() != null && other.getOpenDecisionTasks().equals(this.getOpenDecisionTasks()) == false) return false; 
        if (other.getOpenTimers() == null ^ this.getOpenTimers() == null) return false;
        if (other.getOpenTimers() != null && other.getOpenTimers().equals(this.getOpenTimers()) == false) return false; 
        if (other.getOpenChildWorkflowExecutions() == null ^ this.getOpenChildWorkflowExecutions() == null) return false;
        if (other.getOpenChildWorkflowExecutions() != null && other.getOpenChildWorkflowExecutions().equals(this.getOpenChildWorkflowExecutions()) == false) return false; 
        return true;
    }
    
}
    