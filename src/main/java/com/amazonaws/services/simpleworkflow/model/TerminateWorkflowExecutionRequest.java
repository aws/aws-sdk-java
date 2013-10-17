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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#terminateWorkflowExecution(TerminateWorkflowExecutionRequest) TerminateWorkflowExecution operation}.
 * <p>
 * Records a <code>WorkflowExecutionTerminated</code> event and forces closure of the workflow execution identified by the given domain, runId, and
 * workflowId. The child policy, registered with the workflow type or specified when starting this execution, is applied to any open child workflow
 * executions of this workflow execution.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If the identified workflow execution was in progress, it is terminated immediately.
 * </p>
 * <p>
 * <b>NOTE:</b> If a runId is not specified, then the WorkflowExecutionTerminated event is recorded in the history of the current open workflow with the
 * matching workflowId in the domain.
 * </p>
 * <p>
 * <b>NOTE:</b> You should consider using RequestCancelWorkflowExecution action instead because it allows the workflow to gracefully close while
 * TerminateWorkflowExecution does not.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#terminateWorkflowExecution(TerminateWorkflowExecutionRequest)
 */
public class TerminateWorkflowExecutionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The domain of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The workflowId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The runId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * An optional descriptive reason for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String reason;

    /**
     * Optional details for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The domain of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The domain of the workflow execution to terminate.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The domain of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The domain of the workflow execution to terminate.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The domain of the workflow execution to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The domain of the workflow execution to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateWorkflowExecutionRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The workflowId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The workflowId of the workflow execution to terminate.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The workflowId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The workflowId of the workflow execution to terminate.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The workflowId of the workflow execution to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The workflowId of the workflow execution to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateWorkflowExecutionRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The runId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The runId of the workflow execution to terminate.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The runId of the workflow execution to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The runId of the workflow execution to terminate.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The runId of the workflow execution to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The runId of the workflow execution to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateWorkflowExecutionRequest withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * An optional descriptive reason for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return An optional descriptive reason for terminating the workflow execution.
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * An optional descriptive reason for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason An optional descriptive reason for terminating the workflow execution.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * An optional descriptive reason for terminating the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param reason An optional descriptive reason for terminating the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateWorkflowExecutionRequest withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Optional details for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return Optional details for terminating the workflow execution.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Optional details for terminating the workflow execution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional details for terminating the workflow execution.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Optional details for terminating the workflow execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details Optional details for terminating the workflow execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TerminateWorkflowExecutionRequest withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return If set, specifies the policy to use for the child workflow executions
     *         of the workflow execution being terminated. This policy overrides the
     *         child policy specified for the workflow execution at registration time
     *         or when starting the execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time, a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the workflow execution being terminated. This policy overrides the
     *         child policy specified for the workflow execution at registration time
     *         or when starting the execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time, a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the workflow execution being terminated. This policy overrides the
     *         child policy specified for the workflow execution at registration time
     *         or when starting the execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time, a fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public TerminateWorkflowExecutionRequest withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the workflow execution being terminated. This policy overrides the
     *         child policy specified for the workflow execution at registration time
     *         or when starting the execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time, a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of the workflow execution being terminated. This policy overrides the
     * child policy specified for the workflow execution at registration time
     * or when starting the execution. The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event. </li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time, a fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of the workflow execution being terminated. This policy overrides the
     *         child policy specified for the workflow execution at registration time
     *         or when starting the execution. The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event. </li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time, a fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public TerminateWorkflowExecutionRequest withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
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
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getWorkflowId() != null) sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getRunId() != null) sb.append("RunId: " + getRunId() + ",");
        if (getReason() != null) sb.append("Reason: " + getReason() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode()); 
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode()); 
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateWorkflowExecutionRequest == false) return false;
        TerminateWorkflowExecutionRequest other = (TerminateWorkflowExecutionRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        return true;
    }
    
}
    