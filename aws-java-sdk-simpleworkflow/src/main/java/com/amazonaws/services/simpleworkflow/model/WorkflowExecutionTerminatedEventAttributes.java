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
 * Provides details of the <code>WorkflowExecutionTerminated</code> event.
 * </p>
 */
public class WorkflowExecutionTerminatedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The reason provided for the termination (if any).
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The details provided for the termination (if any).
     * </p>
     */
    private String details;
    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     */
    private String childPolicy;
    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     */
    private String cause;

    /**
     * <p>
     * The reason provided for the termination (if any).
     * </p>
     * 
     * @param reason
     *        The reason provided for the termination (if any).
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason provided for the termination (if any).
     * </p>
     * 
     * @return The reason provided for the termination (if any).
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason provided for the termination (if any).
     * </p>
     * 
     * @param reason
     *        The reason provided for the termination (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionTerminatedEventAttributes withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The details provided for the termination (if any).
     * </p>
     * 
     * @param details
     *        The details provided for the termination (if any).
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details provided for the termination (if any).
     * </p>
     * 
     * @return The details provided for the termination (if any).
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details provided for the termination (if any).
     * </p>
     * 
     * @param details
     *        The details provided for the termination (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionTerminatedEventAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy used for the child workflow executions of this workflow execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @return The policy used for the child workflow executions of this workflow execution.</p>
     *         <p>
     *         The supported child policies are:
     *         </p>
     *         <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *         appropriate actions when it receives an execution history with this event.</li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy used for the child workflow executions of this workflow execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionTerminatedEventAttributes withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy used for the child workflow executions of this workflow execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }

    /**
     * <p>
     * The policy used for the child workflow executions of this workflow execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.</li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * </ul>
     * 
     * @param childPolicy
     *        The policy used for the child workflow executions of this workflow execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *        <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.</li>
     *        <li><b>ABANDON:</b> no action will be taken. The child executions will continue to run.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public WorkflowExecutionTerminatedEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This
     *        happens if the parent workflow execution times out or is terminated and the child policy is set to
     *        terminate child executions.
     * @see WorkflowExecutionTerminatedCause
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     * 
     * @return If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This
     *         happens if the parent workflow execution times out or is terminated and the child policy is set to
     *         terminate child executions.
     * @see WorkflowExecutionTerminatedCause
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This
     *        happens if the parent workflow execution times out or is terminated and the child policy is set to
     *        terminate child executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionTerminatedCause
     */

    public WorkflowExecutionTerminatedEventAttributes withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This
     *        happens if the parent workflow execution times out or is terminated and the child policy is set to
     *        terminate child executions.
     * @see WorkflowExecutionTerminatedCause
     */

    public void setCause(WorkflowExecutionTerminatedCause cause) {
        this.cause = cause.toString();
    }

    /**
     * <p>
     * If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This happens
     * if the parent workflow execution times out or is terminated and the child policy is set to terminate child
     * executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the workflow execution was automatically terminated, and specifies the cause. This
     *        happens if the parent workflow execution times out or is terminated and the child policy is set to
     *        terminate child executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionTerminatedCause
     */

    public WorkflowExecutionTerminatedEventAttributes withCause(WorkflowExecutionTerminatedCause cause) {
        setCause(cause);
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
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getCause() != null)
            sb.append("Cause: " + getCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowExecutionTerminatedEventAttributes == false)
            return false;
        WorkflowExecutionTerminatedEventAttributes other = (WorkflowExecutionTerminatedEventAttributes) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null)
            return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionTerminatedEventAttributes clone() {
        try {
            return (WorkflowExecutionTerminatedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
