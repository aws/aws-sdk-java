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
 * Provides details of the <code>WorkflowExecutionCancelRequested</code> event.
 * </p>
 */
public class WorkflowExecutionCancelRequestedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The external workflow execution for which the cancellation was requested.
     * </p>
     */
    private WorkflowExecution externalWorkflowExecution;
    /**
     * <p>
     * The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source event
     * with this ID can be found in the history of the source workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long externalInitiatedEventId;
    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     */
    private String cause;

    /**
     * <p>
     * The external workflow execution for which the cancellation was requested.
     * </p>
     * 
     * @param externalWorkflowExecution
     *        The external workflow execution for which the cancellation was requested.
     */

    public void setExternalWorkflowExecution(WorkflowExecution externalWorkflowExecution) {
        this.externalWorkflowExecution = externalWorkflowExecution;
    }

    /**
     * <p>
     * The external workflow execution for which the cancellation was requested.
     * </p>
     * 
     * @return The external workflow execution for which the cancellation was requested.
     */

    public WorkflowExecution getExternalWorkflowExecution() {
        return this.externalWorkflowExecution;
    }

    /**
     * <p>
     * The external workflow execution for which the cancellation was requested.
     * </p>
     * 
     * @param externalWorkflowExecution
     *        The external workflow execution for which the cancellation was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionCancelRequestedEventAttributes withExternalWorkflowExecution(WorkflowExecution externalWorkflowExecution) {
        setExternalWorkflowExecution(externalWorkflowExecution);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source event
     * with this ID can be found in the history of the source workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param externalInitiatedEventId
     *        The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source
     *        event with this ID can be found in the history of the source workflow execution. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setExternalInitiatedEventId(Long externalInitiatedEventId) {
        this.externalInitiatedEventId = externalInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source event
     * with this ID can be found in the history of the source workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source
     *         event with this ID can be found in the history of the source workflow execution. This information can be
     *         useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getExternalInitiatedEventId() {
        return this.externalInitiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source event
     * with this ID can be found in the history of the source workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param externalInitiatedEventId
     *        The ID of the <code>RequestCancelExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>RequestCancelExternalWorkflowExecution</code> decision to cancel this workflow execution.The source
     *        event with this ID can be found in the history of the source workflow execution. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowExecutionCancelRequestedEventAttributes withExternalInitiatedEventId(Long externalInitiatedEventId) {
        setExternalInitiatedEventId(externalInitiatedEventId);
        return this;
    }

    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the request to cancel the workflow execution was automatically generated, and
     *        specifies the cause. This happens if the parent workflow execution times out or is terminated, and the
     *        child policy is set to cancel child executions.
     * @see WorkflowExecutionCancelRequestedCause
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     * 
     * @return If set, indicates that the request to cancel the workflow execution was automatically generated, and
     *         specifies the cause. This happens if the parent workflow execution times out or is terminated, and the
     *         child policy is set to cancel child executions.
     * @see WorkflowExecutionCancelRequestedCause
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the request to cancel the workflow execution was automatically generated, and
     *        specifies the cause. This happens if the parent workflow execution times out or is terminated, and the
     *        child policy is set to cancel child executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionCancelRequestedCause
     */

    public WorkflowExecutionCancelRequestedEventAttributes withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the request to cancel the workflow execution was automatically generated, and
     *        specifies the cause. This happens if the parent workflow execution times out or is terminated, and the
     *        child policy is set to cancel child executions.
     * @see WorkflowExecutionCancelRequestedCause
     */

    public void setCause(WorkflowExecutionCancelRequestedCause cause) {
        this.cause = cause.toString();
    }

    /**
     * <p>
     * If set, indicates that the request to cancel the workflow execution was automatically generated, and specifies
     * the cause. This happens if the parent workflow execution times out or is terminated, and the child policy is set
     * to cancel child executions.
     * </p>
     * 
     * @param cause
     *        If set, indicates that the request to cancel the workflow execution was automatically generated, and
     *        specifies the cause. This happens if the parent workflow execution times out or is terminated, and the
     *        child policy is set to cancel child executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowExecutionCancelRequestedCause
     */

    public WorkflowExecutionCancelRequestedEventAttributes withCause(WorkflowExecutionCancelRequestedCause cause) {
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
        if (getExternalWorkflowExecution() != null)
            sb.append("ExternalWorkflowExecution: " + getExternalWorkflowExecution() + ",");
        if (getExternalInitiatedEventId() != null)
            sb.append("ExternalInitiatedEventId: " + getExternalInitiatedEventId() + ",");
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

        if (obj instanceof WorkflowExecutionCancelRequestedEventAttributes == false)
            return false;
        WorkflowExecutionCancelRequestedEventAttributes other = (WorkflowExecutionCancelRequestedEventAttributes) obj;
        if (other.getExternalWorkflowExecution() == null ^ this.getExternalWorkflowExecution() == null)
            return false;
        if (other.getExternalWorkflowExecution() != null && other.getExternalWorkflowExecution().equals(this.getExternalWorkflowExecution()) == false)
            return false;
        if (other.getExternalInitiatedEventId() == null ^ this.getExternalInitiatedEventId() == null)
            return false;
        if (other.getExternalInitiatedEventId() != null && other.getExternalInitiatedEventId().equals(this.getExternalInitiatedEventId()) == false)
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

        hashCode = prime * hashCode + ((getExternalWorkflowExecution() == null) ? 0 : getExternalWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getExternalInitiatedEventId() == null) ? 0 : getExternalInitiatedEventId().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowExecutionCancelRequestedEventAttributes clone() {
        try {
            return (WorkflowExecutionCancelRequestedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
