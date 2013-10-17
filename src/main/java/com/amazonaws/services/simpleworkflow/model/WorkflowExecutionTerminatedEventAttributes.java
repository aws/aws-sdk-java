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
 * Provides details of the <code>WorkflowExecutionTerminated</code> event.
 * </p>
 */
public class WorkflowExecutionTerminatedEventAttributes implements Serializable {

    /**
     * The reason provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String reason;

    /**
     * The details provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     */
    private String cause;

    /**
     * The reason provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The reason provided for the termination (if any).
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * The reason provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason The reason provided for the termination (if any).
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * The reason provided for the termination (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason The reason provided for the termination (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionTerminatedEventAttributes withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * The details provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The details provided for the termination (if any).
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * The details provided for the termination (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details The details provided for the termination (if any).
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * The details provided for the termination (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details The details provided for the termination (if any).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionTerminatedEventAttributes withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionTerminatedEventAttributes withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * The policy used for the child workflow executions of this workflow
     * execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy The policy used for the child workflow executions of this workflow
     *         execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public WorkflowExecutionTerminatedEventAttributes withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     *
     * @return If set, indicates that the workflow execution was automatically
     *         terminated, and specifies the cause. This happens if the parent
     *         workflow execution times out or is terminated and the child policy is
     *         set to terminate child executions.
     *
     * @see WorkflowExecutionTerminatedCause
     */
    public String getCause() {
        return cause;
    }
    
    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     *
     * @param cause If set, indicates that the workflow execution was automatically
     *         terminated, and specifies the cause. This happens if the parent
     *         workflow execution times out or is terminated and the child policy is
     *         set to terminate child executions.
     *
     * @see WorkflowExecutionTerminatedCause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     *
     * @param cause If set, indicates that the workflow execution was automatically
     *         terminated, and specifies the cause. This happens if the parent
     *         workflow execution times out or is terminated and the child policy is
     *         set to terminate child executions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see WorkflowExecutionTerminatedCause
     */
    public WorkflowExecutionTerminatedEventAttributes withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     *
     * @param cause If set, indicates that the workflow execution was automatically
     *         terminated, and specifies the cause. This happens if the parent
     *         workflow execution times out or is terminated and the child policy is
     *         set to terminate child executions.
     *
     * @see WorkflowExecutionTerminatedCause
     */
    public void setCause(WorkflowExecutionTerminatedCause cause) {
        this.cause = cause.toString();
    }
    
    /**
     * If set, indicates that the workflow execution was automatically
     * terminated, and specifies the cause. This happens if the parent
     * workflow execution times out or is terminated and the child policy is
     * set to terminate child executions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHILD_POLICY_APPLIED, EVENT_LIMIT_EXCEEDED, OPERATOR_INITIATED
     *
     * @param cause If set, indicates that the workflow execution was automatically
     *         terminated, and specifies the cause. This happens if the parent
     *         workflow execution times out or is terminated and the child policy is
     *         set to terminate child executions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see WorkflowExecutionTerminatedCause
     */
    public WorkflowExecutionTerminatedEventAttributes withCause(WorkflowExecutionTerminatedCause cause) {
        this.cause = cause.toString();
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
        if (getReason() != null) sb.append("Reason: " + getReason() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getCause() != null) sb.append("Cause: " + getCause() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionTerminatedEventAttributes == false) return false;
        WorkflowExecutionTerminatedEventAttributes other = (WorkflowExecutionTerminatedEventAttributes)obj;
        
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        if (other.getCause() == null ^ this.getCause() == null) return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false) return false; 
        return true;
    }
    
}
    