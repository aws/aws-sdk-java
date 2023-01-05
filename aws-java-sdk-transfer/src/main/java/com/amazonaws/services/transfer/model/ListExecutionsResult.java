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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * Returns the details for each execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to continue
     * listing additional executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>StartTime</b>: timestamp indicating when the execution began.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Executions</b>: details of the execution, including the execution ID, initial file location, and Service
     * metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ListedExecution> executions;

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * 
     * @param nextToken
     *        <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * 
     * @return <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *         the <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * </p>
     * 
     * @param nextToken
     *        <code>ListExecutions</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

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

    public ListExecutionsResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * Returns the details for each execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to continue
     * listing additional executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>StartTime</b>: timestamp indicating when the execution began.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Executions</b>: details of the execution, including the execution ID, initial file location, and Service
     * metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns the details for each execution.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to
     *         continue listing additional executions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>StartTime</b>: timestamp indicating when the execution began.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Executions</b>: details of the execution, including the execution ID, initial file location, and
     *         Service metadata.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     *         <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<ListedExecution> getExecutions() {
        return executions;
    }

    /**
     * <p>
     * Returns the details for each execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to continue
     * listing additional executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>StartTime</b>: timestamp indicating when the execution began.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Executions</b>: details of the execution, including the execution ID, initial file location, and Service
     * metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executions
     *        Returns the details for each execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to
     *        continue listing additional executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>StartTime</b>: timestamp indicating when the execution began.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Executions</b>: details of the execution, including the execution ID, initial file location, and
     *        Service metadata.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     *        <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     *        </p>
     *        </li>
     */

    public void setExecutions(java.util.Collection<ListedExecution> executions) {
        if (executions == null) {
            this.executions = null;
            return;
        }

        this.executions = new java.util.ArrayList<ListedExecution>(executions);
    }

    /**
     * <p>
     * Returns the details for each execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to continue
     * listing additional executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>StartTime</b>: timestamp indicating when the execution began.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Executions</b>: details of the execution, including the execution ID, initial file location, and Service
     * metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutions(java.util.Collection)} or {@link #withExecutions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param executions
     *        Returns the details for each execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to
     *        continue listing additional executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>StartTime</b>: timestamp indicating when the execution began.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Executions</b>: details of the execution, including the execution ID, initial file location, and
     *        Service metadata.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     *        <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(ListedExecution... executions) {
        if (this.executions == null) {
            setExecutions(new java.util.ArrayList<ListedExecution>(executions.length));
        }
        for (ListedExecution ele : executions) {
            this.executions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the details for each execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to continue
     * listing additional executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>StartTime</b>: timestamp indicating when the execution began.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Executions</b>: details of the execution, including the execution ID, initial file location, and Service
     * metadata.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     * <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executions
     *        Returns the details for each execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NextToken</b>: returned from a call to several APIs, you can use pass it to a subsequent command to
     *        continue listing additional executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>StartTime</b>: timestamp indicating when the execution began.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Executions</b>: details of the execution, including the execution ID, initial file location, and
     *        Service metadata.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Status</b>: one of the following values: <code>IN_PROGRESS</code>, <code>COMPLETED</code>,
     *        <code>EXCEPTION</code>, <code>HANDLING_EXEPTION</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExecutionsResult withExecutions(java.util.Collection<ListedExecution> executions) {
        setExecutions(executions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getExecutions() != null)
            sb.append("Executions: ").append(getExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListExecutionsResult == false)
            return false;
        ListExecutionsResult other = (ListExecutionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getExecutions() == null ^ this.getExecutions() == null)
            return false;
        if (other.getExecutions() != null && other.getExecutions().equals(this.getExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getExecutions() == null) ? 0 : getExecutions().hashCode());
        return hashCode;
    }

    @Override
    public ListExecutionsResult clone() {
        try {
            return (ListExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
