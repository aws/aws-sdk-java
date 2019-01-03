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
 * Provides the details of the <code>ChildWorkflowExecutionFailed</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ChildWorkflowExecutionFailedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChildWorkflowExecutionFailedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The child workflow execution that failed.
     * </p>
     */
    private WorkflowExecution workflowExecution;
    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     */
    private WorkflowType workflowType;
    /**
     * <p>
     * The reason for the failure (if provided).
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The details of the failure (if provided).
     * </p>
     */
    private String details;
    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This information
     * can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long initiatedEventId;
    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     */
    private Long startedEventId;

    /**
     * <p>
     * The child workflow execution that failed.
     * </p>
     * 
     * @param workflowExecution
     *        The child workflow execution that failed.
     */

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    /**
     * <p>
     * The child workflow execution that failed.
     * </p>
     * 
     * @return The child workflow execution that failed.
     */

    public WorkflowExecution getWorkflowExecution() {
        return this.workflowExecution;
    }

    /**
     * <p>
     * The child workflow execution that failed.
     * </p>
     * 
     * @param workflowExecution
     *        The child workflow execution that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withWorkflowExecution(WorkflowExecution workflowExecution) {
        setWorkflowExecution(workflowExecution);
        return this;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the child workflow execution.
     */

    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @return The type of the child workflow execution.
     */

    public WorkflowType getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of the child workflow execution.
     * </p>
     * 
     * @param workflowType
     *        The type of the child workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withWorkflowType(WorkflowType workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The reason for the failure (if provided).
     * </p>
     * 
     * @param reason
     *        The reason for the failure (if provided).
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the failure (if provided).
     * </p>
     * 
     * @return The reason for the failure (if provided).
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the failure (if provided).
     * </p>
     * 
     * @param reason
     *        The reason for the failure (if provided).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The details of the failure (if provided).
     * </p>
     * 
     * @param details
     *        The details of the failure (if provided).
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details of the failure (if provided).
     * </p>
     * 
     * @return The details of the failure (if provided).
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details of the failure (if provided).
     * </p>
     * 
     * @param details
     *        The details of the failure (if provided).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This information
     * can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     */

    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This information
     * can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This
     *         information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *         event.
     */

    public Long getInitiatedEventId() {
        return this.initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     * <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This information
     * can be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>StartChildWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>StartChildWorkflowExecution</code> <a>Decision</a> to start this child workflow execution. This
     *        information can be useful for diagnosing problems by tracing back the chain of events leading up to this
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withInitiatedEventId(Long initiatedEventId) {
        setInitiatedEventId(initiatedEventId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution
     *        was started. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     */

    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @return The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow
     *         execution was started. This information can be useful for diagnosing problems by tracing back the chain
     *         of events leading up to this event.
     */

    public Long getStartedEventId() {
        return this.startedEventId;
    }

    /**
     * <p>
     * The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution was
     * started. This information can be useful for diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * </p>
     * 
     * @param startedEventId
     *        The ID of the <code>ChildWorkflowExecutionStarted</code> event recorded when this child workflow execution
     *        was started. This information can be useful for diagnosing problems by tracing back the chain of events
     *        leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChildWorkflowExecutionFailedEventAttributes withStartedEventId(Long startedEventId) {
        setStartedEventId(startedEventId);
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
        if (getWorkflowExecution() != null)
            sb.append("WorkflowExecution: ").append(getWorkflowExecution()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getInitiatedEventId() != null)
            sb.append("InitiatedEventId: ").append(getInitiatedEventId()).append(",");
        if (getStartedEventId() != null)
            sb.append("StartedEventId: ").append(getStartedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChildWorkflowExecutionFailedEventAttributes == false)
            return false;
        ChildWorkflowExecutionFailedEventAttributes other = (ChildWorkflowExecutionFailedEventAttributes) obj;
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null)
            return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null)
            return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false)
            return false;
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null)
            return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getInitiatedEventId() == null) ? 0 : getInitiatedEventId().hashCode());
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode());
        return hashCode;
    }

    @Override
    public ChildWorkflowExecutionFailedEventAttributes clone() {
        try {
            return (ChildWorkflowExecutionFailedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ChildWorkflowExecutionFailedEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
