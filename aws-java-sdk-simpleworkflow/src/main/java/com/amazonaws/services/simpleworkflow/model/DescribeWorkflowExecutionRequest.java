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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeWorkflowExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkflowExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain containing the workflow execution.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The workflow execution to describe.
     * </p>
     */
    private WorkflowExecution execution;

    /**
     * <p>
     * The name of the domain containing the workflow execution.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow execution.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow execution.
     * </p>
     * 
     * @return The name of the domain containing the workflow execution.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain containing the workflow execution.
     * </p>
     * 
     * @param domain
     *        The name of the domain containing the workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkflowExecutionRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The workflow execution to describe.
     * </p>
     * 
     * @param execution
     *        The workflow execution to describe.
     */

    public void setExecution(WorkflowExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * The workflow execution to describe.
     * </p>
     * 
     * @return The workflow execution to describe.
     */

    public WorkflowExecution getExecution() {
        return this.execution;
    }

    /**
     * <p>
     * The workflow execution to describe.
     * </p>
     * 
     * @param execution
     *        The workflow execution to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkflowExecutionRequest withExecution(WorkflowExecution execution) {
        setExecution(execution);
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
        if (getExecution() != null)
            sb.append("Execution: ").append(getExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkflowExecutionRequest == false)
            return false;
        DescribeWorkflowExecutionRequest other = (DescribeWorkflowExecutionRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkflowExecutionRequest clone() {
        return (DescribeWorkflowExecutionRequest) super.clone();
    }

}
