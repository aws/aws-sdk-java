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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListWorkflows" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * </p>
     */
    private java.util.List<ListedWorkflow> workflows;

    /**
     * <p>
     * <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     * </p>
     * 
     * @param nextToken
     *        <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     * </p>
     * 
     * @return <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *         the <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass the
     * <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     * </p>
     * 
     * @param nextToken
     *        <code>ListWorkflows</code> returns the <code>NextToken</code> parameter in the output. You can then pass
     *        the <code>NextToken</code> parameter in a subsequent command to continue listing additional workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * </p>
     * 
     * @return Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     */

    public java.util.List<ListedWorkflow> getWorkflows() {
        return workflows;
    }

    /**
     * <p>
     * Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * </p>
     * 
     * @param workflows
     *        Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     */

    public void setWorkflows(java.util.Collection<ListedWorkflow> workflows) {
        if (workflows == null) {
            this.workflows = null;
            return;
        }

        this.workflows = new java.util.ArrayList<ListedWorkflow>(workflows);
    }

    /**
     * <p>
     * Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflows(java.util.Collection)} or {@link #withWorkflows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workflows
     *        Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflows(ListedWorkflow... workflows) {
        if (this.workflows == null) {
            setWorkflows(new java.util.ArrayList<ListedWorkflow>(workflows.length));
        }
        for (ListedWorkflow ele : workflows) {
            this.workflows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * </p>
     * 
     * @param workflows
     *        Returns the <code>Arn</code>, <code>WorkflowId</code>, and <code>Description</code> for each workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsResult withWorkflows(java.util.Collection<ListedWorkflow> workflows) {
        setWorkflows(workflows);
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
        if (getWorkflows() != null)
            sb.append("Workflows: ").append(getWorkflows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsResult == false)
            return false;
        ListWorkflowsResult other = (ListWorkflowsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflows() == null ^ this.getWorkflows() == null)
            return false;
        if (other.getWorkflows() != null && other.getWorkflows().equals(this.getWorkflows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflows() == null) ? 0 : getWorkflows().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsResult clone() {
        try {
            return (ListWorkflowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
