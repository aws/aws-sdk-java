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
 * Contains the counts of open tasks, child workflow executions and timers for a workflow execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/WorkflowExecutionOpenCounts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowExecutionOpenCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The count of activity tasks whose status is <code>OPEN</code>.
     * </p>
     */
    private Integer openActivityTasks;
    /**
     * <p>
     * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
     * </p>
     */
    private Integer openDecisionTasks;
    /**
     * <p>
     * The count of timers started by this workflow execution that have not fired yet.
     * </p>
     */
    private Integer openTimers;
    /**
     * <p>
     * The count of child workflow executions whose status is <code>OPEN</code>.
     * </p>
     */
    private Integer openChildWorkflowExecutions;
    /**
     * <p>
     * The count of Lambda tasks whose status is <code>OPEN</code>.
     * </p>
     */
    private Integer openLambdaFunctions;

    /**
     * <p>
     * The count of activity tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openActivityTasks
     *        The count of activity tasks whose status is <code>OPEN</code>.
     */

    public void setOpenActivityTasks(Integer openActivityTasks) {
        this.openActivityTasks = openActivityTasks;
    }

    /**
     * <p>
     * The count of activity tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @return The count of activity tasks whose status is <code>OPEN</code>.
     */

    public Integer getOpenActivityTasks() {
        return this.openActivityTasks;
    }

    /**
     * <p>
     * The count of activity tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openActivityTasks
     *        The count of activity tasks whose status is <code>OPEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionOpenCounts withOpenActivityTasks(Integer openActivityTasks) {
        setOpenActivityTasks(openActivityTasks);
        return this;
    }

    /**
     * <p>
     * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
     * </p>
     * 
     * @param openDecisionTasks
     *        The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision
     *        task.
     */

    public void setOpenDecisionTasks(Integer openDecisionTasks) {
        this.openDecisionTasks = openDecisionTasks;
    }

    /**
     * <p>
     * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
     * </p>
     * 
     * @return The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision
     *         task.
     */

    public Integer getOpenDecisionTasks() {
        return this.openDecisionTasks;
    }

    /**
     * <p>
     * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
     * </p>
     * 
     * @param openDecisionTasks
     *        The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionOpenCounts withOpenDecisionTasks(Integer openDecisionTasks) {
        setOpenDecisionTasks(openDecisionTasks);
        return this;
    }

    /**
     * <p>
     * The count of timers started by this workflow execution that have not fired yet.
     * </p>
     * 
     * @param openTimers
     *        The count of timers started by this workflow execution that have not fired yet.
     */

    public void setOpenTimers(Integer openTimers) {
        this.openTimers = openTimers;
    }

    /**
     * <p>
     * The count of timers started by this workflow execution that have not fired yet.
     * </p>
     * 
     * @return The count of timers started by this workflow execution that have not fired yet.
     */

    public Integer getOpenTimers() {
        return this.openTimers;
    }

    /**
     * <p>
     * The count of timers started by this workflow execution that have not fired yet.
     * </p>
     * 
     * @param openTimers
     *        The count of timers started by this workflow execution that have not fired yet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionOpenCounts withOpenTimers(Integer openTimers) {
        setOpenTimers(openTimers);
        return this;
    }

    /**
     * <p>
     * The count of child workflow executions whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openChildWorkflowExecutions
     *        The count of child workflow executions whose status is <code>OPEN</code>.
     */

    public void setOpenChildWorkflowExecutions(Integer openChildWorkflowExecutions) {
        this.openChildWorkflowExecutions = openChildWorkflowExecutions;
    }

    /**
     * <p>
     * The count of child workflow executions whose status is <code>OPEN</code>.
     * </p>
     * 
     * @return The count of child workflow executions whose status is <code>OPEN</code>.
     */

    public Integer getOpenChildWorkflowExecutions() {
        return this.openChildWorkflowExecutions;
    }

    /**
     * <p>
     * The count of child workflow executions whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openChildWorkflowExecutions
     *        The count of child workflow executions whose status is <code>OPEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionOpenCounts withOpenChildWorkflowExecutions(Integer openChildWorkflowExecutions) {
        setOpenChildWorkflowExecutions(openChildWorkflowExecutions);
        return this;
    }

    /**
     * <p>
     * The count of Lambda tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openLambdaFunctions
     *        The count of Lambda tasks whose status is <code>OPEN</code>.
     */

    public void setOpenLambdaFunctions(Integer openLambdaFunctions) {
        this.openLambdaFunctions = openLambdaFunctions;
    }

    /**
     * <p>
     * The count of Lambda tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @return The count of Lambda tasks whose status is <code>OPEN</code>.
     */

    public Integer getOpenLambdaFunctions() {
        return this.openLambdaFunctions;
    }

    /**
     * <p>
     * The count of Lambda tasks whose status is <code>OPEN</code>.
     * </p>
     * 
     * @param openLambdaFunctions
     *        The count of Lambda tasks whose status is <code>OPEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionOpenCounts withOpenLambdaFunctions(Integer openLambdaFunctions) {
        setOpenLambdaFunctions(openLambdaFunctions);
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
        if (getOpenActivityTasks() != null)
            sb.append("OpenActivityTasks: ").append(getOpenActivityTasks()).append(",");
        if (getOpenDecisionTasks() != null)
            sb.append("OpenDecisionTasks: ").append(getOpenDecisionTasks()).append(",");
        if (getOpenTimers() != null)
            sb.append("OpenTimers: ").append(getOpenTimers()).append(",");
        if (getOpenChildWorkflowExecutions() != null)
            sb.append("OpenChildWorkflowExecutions: ").append(getOpenChildWorkflowExecutions()).append(",");
        if (getOpenLambdaFunctions() != null)
            sb.append("OpenLambdaFunctions: ").append(getOpenLambdaFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionOpenCounts == false)
            return false;
        WorkflowExecutionOpenCounts other = (WorkflowExecutionOpenCounts) obj;
        if (other.getOpenActivityTasks() == null ^ this.getOpenActivityTasks() == null)
            return false;
        if (other.getOpenActivityTasks() != null && other.getOpenActivityTasks().equals(this.getOpenActivityTasks()) == false)
            return false;
        if (other.getOpenDecisionTasks() == null ^ this.getOpenDecisionTasks() == null)
            return false;
        if (other.getOpenDecisionTasks() != null && other.getOpenDecisionTasks().equals(this.getOpenDecisionTasks()) == false)
            return false;
        if (other.getOpenTimers() == null ^ this.getOpenTimers() == null)
            return false;
        if (other.getOpenTimers() != null && other.getOpenTimers().equals(this.getOpenTimers()) == false)
            return false;
        if (other.getOpenChildWorkflowExecutions() == null ^ this.getOpenChildWorkflowExecutions() == null)
            return false;
        if (other.getOpenChildWorkflowExecutions() != null && other.getOpenChildWorkflowExecutions().equals(this.getOpenChildWorkflowExecutions()) == false)
            return false;
        if (other.getOpenLambdaFunctions() == null ^ this.getOpenLambdaFunctions() == null)
            return false;
        if (other.getOpenLambdaFunctions() != null && other.getOpenLambdaFunctions().equals(this.getOpenLambdaFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpenActivityTasks() == null) ? 0 : getOpenActivityTasks().hashCode());
        hashCode = prime * hashCode + ((getOpenDecisionTasks() == null) ? 0 : getOpenDecisionTasks().hashCode());
        hashCode = prime * hashCode + ((getOpenTimers() == null) ? 0 : getOpenTimers().hashCode());
        hashCode = prime * hashCode + ((getOpenChildWorkflowExecutions() == null) ? 0 : getOpenChildWorkflowExecutions().hashCode());
        hashCode = prime * hashCode + ((getOpenLambdaFunctions() == null) ? 0 : getOpenLambdaFunctions().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionOpenCounts clone() {
        try {
            return (WorkflowExecutionOpenCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.WorkflowExecutionOpenCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
