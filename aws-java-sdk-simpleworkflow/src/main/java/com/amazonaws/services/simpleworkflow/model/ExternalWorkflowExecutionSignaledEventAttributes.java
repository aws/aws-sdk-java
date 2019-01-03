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
 * Provides the details of the <code>ExternalWorkflowExecutionSignaled</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ExternalWorkflowExecutionSignaledEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalWorkflowExecutionSignaledEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The external workflow execution that the signal was delivered to.
     * </p>
     */
    private WorkflowExecution workflowExecution;
    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long initiatedEventId;

    /**
     * <p>
     * The external workflow execution that the signal was delivered to.
     * </p>
     * 
     * @param workflowExecution
     *        The external workflow execution that the signal was delivered to.
     */

    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }

    /**
     * <p>
     * The external workflow execution that the signal was delivered to.
     * </p>
     * 
     * @return The external workflow execution that the signal was delivered to.
     */

    public WorkflowExecution getWorkflowExecution() {
        return this.workflowExecution;
    }

    /**
     * <p>
     * The external workflow execution that the signal was delivered to.
     * </p>
     * 
     * @param workflowExecution
     *        The external workflow execution that the signal was delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalWorkflowExecutionSignaledEventAttributes withWorkflowExecution(WorkflowExecution workflowExecution) {
        setWorkflowExecution(workflowExecution);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *         <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *         useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getInitiatedEventId() {
        return this.initiatedEventId;
    }

    /**
     * <p>
     * The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     * <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param initiatedEventId
     *        The ID of the <code>SignalExternalWorkflowExecutionInitiated</code> event corresponding to the
     *        <code>SignalExternalWorkflowExecution</code> decision to request this signal. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalWorkflowExecutionSignaledEventAttributes withInitiatedEventId(Long initiatedEventId) {
        setInitiatedEventId(initiatedEventId);
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
        if (getInitiatedEventId() != null)
            sb.append("InitiatedEventId: ").append(getInitiatedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalWorkflowExecutionSignaledEventAttributes == false)
            return false;
        ExternalWorkflowExecutionSignaledEventAttributes other = (ExternalWorkflowExecutionSignaledEventAttributes) obj;
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null)
            return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false)
            return false;
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null)
            return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowExecution() == null) ? 0 : getWorkflowExecution().hashCode());
        hashCode = prime * hashCode + ((getInitiatedEventId() == null) ? 0 : getInitiatedEventId().hashCode());
        return hashCode;
    }

    @Override
    public ExternalWorkflowExecutionSignaledEventAttributes clone() {
        try {
            return (ExternalWorkflowExecutionSignaledEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ExternalWorkflowExecutionSignaledEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
