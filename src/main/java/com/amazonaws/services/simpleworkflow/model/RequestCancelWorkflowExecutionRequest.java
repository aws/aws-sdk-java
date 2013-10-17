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
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest) RequestCancelWorkflowExecution operation}.
 * <p>
 * Records a <code>WorkflowExecutionCancelRequested</code> event in the currently running workflow execution identified by the given domain, workflowId,
 * and runId. This logically requests the cancellation of the workflow execution as a whole. It is up to the decider to take appropriate actions when it
 * receives an execution history with this event.
 * </p>
 * <p>
 * <b>NOTE:</b> If the runId is not specified, the WorkflowExecutionCancelRequested event is recorded in the history of the current open workflow
 * execution with the specified workflowId in the domain.
 * </p>
 * <p>
 * <b>NOTE:</b> Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of
 * TerminateWorkflowExecution when possible.
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
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest)
 */
public class RequestCancelWorkflowExecutionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain containing the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The workflowId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The runId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String runId;

    /**
     * The name of the domain containing the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain containing the workflow execution to cancel.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain containing the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow execution to cancel.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain containing the workflow execution to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain containing the workflow execution to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelWorkflowExecutionRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The workflowId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The workflowId of the workflow execution to cancel.
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The workflowId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The workflowId of the workflow execution to cancel.
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The workflowId of the workflow execution to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The workflowId of the workflow execution to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelWorkflowExecutionRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The runId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The runId of the workflow execution to cancel.
     */
    public String getRunId() {
        return runId;
    }
    
    /**
     * The runId of the workflow execution to cancel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The runId of the workflow execution to cancel.
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }
    
    /**
     * The runId of the workflow execution to cancel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param runId The runId of the workflow execution to cancel.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestCancelWorkflowExecutionRequest withRunId(String runId) {
        this.runId = runId;
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
        if (getRunId() != null) sb.append("RunId: " + getRunId() );
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RequestCancelWorkflowExecutionRequest == false) return false;
        RequestCancelWorkflowExecutionRequest other = (RequestCancelWorkflowExecutionRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getRunId() == null ^ this.getRunId() == null) return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false) return false; 
        return true;
    }
    
}
    