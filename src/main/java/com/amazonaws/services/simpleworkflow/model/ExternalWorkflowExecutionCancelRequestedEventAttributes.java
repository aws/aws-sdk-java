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
 * Provides details of the <code>ExternalWorkflowExecutionCancelRequested</code> event.
 * </p>
 */
public class ExternalWorkflowExecutionCancelRequestedEventAttributes implements Serializable {

    /**
     * The external workflow execution to which the cancellation request was
     * delivered.
     */
    private WorkflowExecution workflowExecution;

    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     */
    private Long initiatedEventId;

    /**
     * The external workflow execution to which the cancellation request was
     * delivered.
     *
     * @return The external workflow execution to which the cancellation request was
     *         delivered.
     */
    public WorkflowExecution getWorkflowExecution() {
        return workflowExecution;
    }
    
    /**
     * The external workflow execution to which the cancellation request was
     * delivered.
     *
     * @param workflowExecution The external workflow execution to which the cancellation request was
     *         delivered.
     */
    public void setWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
    }
    
    /**
     * The external workflow execution to which the cancellation request was
     * delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecution The external workflow execution to which the cancellation request was
     *         delivered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExternalWorkflowExecutionCancelRequestedEventAttributes withWorkflowExecution(WorkflowExecution workflowExecution) {
        this.workflowExecution = workflowExecution;
        return this;
    }

    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @return The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public Long getInitiatedEventId() {
        return initiatedEventId;
    }
    
    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @param initiatedEventId The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public void setInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
    }
    
    /**
     * The id of the
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     * corresponding to the
     * <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     * this external workflow execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initiatedEventId The id of the
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> event
     *         corresponding to the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision to cancel
     *         this external workflow execution. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExternalWorkflowExecutionCancelRequestedEventAttributes withInitiatedEventId(Long initiatedEventId) {
        this.initiatedEventId = initiatedEventId;
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
        if (getWorkflowExecution() != null) sb.append("WorkflowExecution: " + getWorkflowExecution() + ",");
        if (getInitiatedEventId() != null) sb.append("InitiatedEventId: " + getInitiatedEventId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExternalWorkflowExecutionCancelRequestedEventAttributes == false) return false;
        ExternalWorkflowExecutionCancelRequestedEventAttributes other = (ExternalWorkflowExecutionCancelRequestedEventAttributes)obj;
        
        if (other.getWorkflowExecution() == null ^ this.getWorkflowExecution() == null) return false;
        if (other.getWorkflowExecution() != null && other.getWorkflowExecution().equals(this.getWorkflowExecution()) == false) return false; 
        if (other.getInitiatedEventId() == null ^ this.getInitiatedEventId() == null) return false;
        if (other.getInitiatedEventId() != null && other.getInitiatedEventId().equals(this.getInitiatedEventId()) == false) return false; 
        return true;
    }
    
}
    