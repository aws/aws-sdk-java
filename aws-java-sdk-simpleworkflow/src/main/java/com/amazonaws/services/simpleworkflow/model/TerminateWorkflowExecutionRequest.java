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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TerminateWorkflowExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateWorkflowExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain of the workflow execution to terminate.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The workflowId of the workflow execution to terminate.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The runId of the workflow execution to terminate.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * A descriptive reason for terminating the workflow execution.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Details for terminating the workflow execution.
     * </p>
     */
    private String details;
    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     */
    private String childPolicy;

    /**
     * <p>
     * The domain of the workflow execution to terminate.
     * </p>
     * 
     * @param domain
     *        The domain of the workflow execution to terminate.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the workflow execution to terminate.
     * </p>
     * 
     * @return The domain of the workflow execution to terminate.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the workflow execution to terminate.
     * </p>
     * 
     * @param domain
     *        The domain of the workflow execution to terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkflowExecutionRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to terminate.
     * </p>
     * 
     * @param workflowId
     *        The workflowId of the workflow execution to terminate.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to terminate.
     * </p>
     * 
     * @return The workflowId of the workflow execution to terminate.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to terminate.
     * </p>
     * 
     * @param workflowId
     *        The workflowId of the workflow execution to terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkflowExecutionRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The runId of the workflow execution to terminate.
     * </p>
     * 
     * @param runId
     *        The runId of the workflow execution to terminate.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The runId of the workflow execution to terminate.
     * </p>
     * 
     * @return The runId of the workflow execution to terminate.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The runId of the workflow execution to terminate.
     * </p>
     * 
     * @param runId
     *        The runId of the workflow execution to terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkflowExecutionRequest withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * A descriptive reason for terminating the workflow execution.
     * </p>
     * 
     * @param reason
     *        A descriptive reason for terminating the workflow execution.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A descriptive reason for terminating the workflow execution.
     * </p>
     * 
     * @return A descriptive reason for terminating the workflow execution.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A descriptive reason for terminating the workflow execution.
     * </p>
     * 
     * @param reason
     *        A descriptive reason for terminating the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkflowExecutionRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Details for terminating the workflow execution.
     * </p>
     * 
     * @param details
     *        Details for terminating the workflow execution.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Details for terminating the workflow execution.
     * </p>
     * 
     * @return Details for terminating the workflow execution.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details for terminating the workflow execution.
     * </p>
     * 
     * @param details
     *        Details for terminating the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkflowExecutionRequest withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of the workflow execution being
     *        terminated. This policy overrides the child policy specified for the workflow execution at registration
     *        time or when starting the execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @see ChildPolicy
     */

    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @return If set, specifies the policy to use for the child workflow executions of the workflow execution being
     *         terminated. This policy overrides the child policy specified for the workflow execution at registration
     *         time or when starting the execution.</p>
     *         <p>
     *         The supported child policies are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TERMINATE</code> – The child executions are terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *         appropriate actions when it receives an execution history with this event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         A child policy for this workflow execution must be specified either as a default for the workflow type or
     *         through this parameter. If neither this parameter is set nor a default child policy was specified at
     *         registration time then a fault is returned.
     *         </p>
     * @see ChildPolicy
     */

    public String getChildPolicy() {
        return this.childPolicy;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of the workflow execution being
     *        terminated. This policy overrides the child policy specified for the workflow execution at registration
     *        time or when starting the execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public TerminateWorkflowExecutionRequest withChildPolicy(String childPolicy) {
        setChildPolicy(childPolicy);
        return this;
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of the workflow execution being
     *        terminated. This policy overrides the child policy specified for the workflow execution at registration
     *        time or when starting the execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @see ChildPolicy
     */

    public void setChildPolicy(ChildPolicy childPolicy) {
        withChildPolicy(childPolicy);
    }

    /**
     * <p>
     * If set, specifies the policy to use for the child workflow executions of the workflow execution being terminated.
     * This policy overrides the child policy specified for the workflow execution at registration time or when starting
     * the execution.
     * </p>
     * <p>
     * The supported child policies are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code> – The child executions are terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take appropriate
     * actions when it receives an execution history with this event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ABANDON</code> – No action is taken. The child executions continue to run.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * A child policy for this workflow execution must be specified either as a default for the workflow type or through
     * this parameter. If neither this parameter is set nor a default child policy was specified at registration time
     * then a fault is returned.
     * </p>
     * </note>
     * 
     * @param childPolicy
     *        If set, specifies the policy to use for the child workflow executions of the workflow execution being
     *        terminated. This policy overrides the child policy specified for the workflow execution at registration
     *        time or when starting the execution.</p>
     *        <p>
     *        The supported child policies are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TERMINATE</code> – The child executions are terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUEST_CANCEL</code> – A request to cancel is attempted for each child execution by recording a
     *        <code>WorkflowExecutionCancelRequested</code> event in its history. It is up to the decider to take
     *        appropriate actions when it receives an execution history with this event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ABANDON</code> – No action is taken. The child executions continue to run.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        A child policy for this workflow execution must be specified either as a default for the workflow type or
     *        through this parameter. If neither this parameter is set nor a default child policy was specified at
     *        registration time then a fault is returned.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildPolicy
     */

    public TerminateWorkflowExecutionRequest withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getChildPolicy() != null)
            sb.append("ChildPolicy: ").append(getChildPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateWorkflowExecutionRequest == false)
            return false;
        TerminateWorkflowExecutionRequest other = (TerminateWorkflowExecutionRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
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
        return true;
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
    public TerminateWorkflowExecutionRequest clone() {
        return (TerminateWorkflowExecutionRequest) super.clone();
    }

}
