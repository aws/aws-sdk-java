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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RequestCancelWorkflowExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestCancelWorkflowExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain containing the workflow execution to cancel.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The workflowId of the workflow execution to cancel.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The runId of the workflow execution to cancel.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The name of the domain containing the workflow execution to cancel.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow execution to cancel.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow execution to cancel.
     * </p>
     * 
     * @return The name of the domain containing the workflow execution to cancel.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow execution to cancel.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow execution to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelWorkflowExecutionRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to cancel.
     * </p>
     * 
     * @param workflowId
     *        The workflowId of the workflow execution to cancel.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to cancel.
     * </p>
     * 
     * @return The workflowId of the workflow execution to cancel.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The workflowId of the workflow execution to cancel.
     * </p>
     * 
     * @param workflowId
     *        The workflowId of the workflow execution to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelWorkflowExecutionRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The runId of the workflow execution to cancel.
     * </p>
     * 
     * @param runId
     *        The runId of the workflow execution to cancel.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The runId of the workflow execution to cancel.
     * </p>
     * 
     * @return The runId of the workflow execution to cancel.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The runId of the workflow execution to cancel.
     * </p>
     * 
     * @param runId
     *        The runId of the workflow execution to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelWorkflowExecutionRequest withRunId(String runId) {
        setRunId(runId);
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
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestCancelWorkflowExecutionRequest == false)
            return false;
        RequestCancelWorkflowExecutionRequest other = (RequestCancelWorkflowExecutionRequest) obj;
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
        return true;
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
    public RequestCancelWorkflowExecutionRequest clone() {
        return (RequestCancelWorkflowExecutionRequest) super.clone();
    }

}
