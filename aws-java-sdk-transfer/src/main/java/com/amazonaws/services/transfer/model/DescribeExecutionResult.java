/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The structure that contains the details of the workflow' execution.
     * </p>
     */
    private DescribedExecution execution;

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @return A unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        A unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The structure that contains the details of the workflow' execution.
     * </p>
     * 
     * @param execution
     *        The structure that contains the details of the workflow' execution.
     */

    public void setExecution(DescribedExecution execution) {
        this.execution = execution;
    }

    /**
     * <p>
     * The structure that contains the details of the workflow' execution.
     * </p>
     * 
     * @return The structure that contains the details of the workflow' execution.
     */

    public DescribedExecution getExecution() {
        return this.execution;
    }

    /**
     * <p>
     * The structure that contains the details of the workflow' execution.
     * </p>
     * 
     * @param execution
     *        The structure that contains the details of the workflow' execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withExecution(DescribedExecution execution) {
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
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

        if (obj instanceof DescribeExecutionResult == false)
            return false;
        DescribeExecutionResult other = (DescribeExecutionResult) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
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

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExecutionResult clone() {
        try {
            return (DescribeExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
