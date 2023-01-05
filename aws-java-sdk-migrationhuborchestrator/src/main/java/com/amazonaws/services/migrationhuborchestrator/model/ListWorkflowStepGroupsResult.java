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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowStepGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowStepGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary of step groups in a migration workflow.
     * </p>
     */
    private java.util.List<WorkflowStepGroupSummary> workflowStepGroupsSummary;

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary of step groups in a migration workflow.
     * </p>
     * 
     * @return The summary of step groups in a migration workflow.
     */

    public java.util.List<WorkflowStepGroupSummary> getWorkflowStepGroupsSummary() {
        return workflowStepGroupsSummary;
    }

    /**
     * <p>
     * The summary of step groups in a migration workflow.
     * </p>
     * 
     * @param workflowStepGroupsSummary
     *        The summary of step groups in a migration workflow.
     */

    public void setWorkflowStepGroupsSummary(java.util.Collection<WorkflowStepGroupSummary> workflowStepGroupsSummary) {
        if (workflowStepGroupsSummary == null) {
            this.workflowStepGroupsSummary = null;
            return;
        }

        this.workflowStepGroupsSummary = new java.util.ArrayList<WorkflowStepGroupSummary>(workflowStepGroupsSummary);
    }

    /**
     * <p>
     * The summary of step groups in a migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowStepGroupsSummary(java.util.Collection)} or
     * {@link #withWorkflowStepGroupsSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param workflowStepGroupsSummary
     *        The summary of step groups in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepGroupsResult withWorkflowStepGroupsSummary(WorkflowStepGroupSummary... workflowStepGroupsSummary) {
        if (this.workflowStepGroupsSummary == null) {
            setWorkflowStepGroupsSummary(new java.util.ArrayList<WorkflowStepGroupSummary>(workflowStepGroupsSummary.length));
        }
        for (WorkflowStepGroupSummary ele : workflowStepGroupsSummary) {
            this.workflowStepGroupsSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of step groups in a migration workflow.
     * </p>
     * 
     * @param workflowStepGroupsSummary
     *        The summary of step groups in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepGroupsResult withWorkflowStepGroupsSummary(java.util.Collection<WorkflowStepGroupSummary> workflowStepGroupsSummary) {
        setWorkflowStepGroupsSummary(workflowStepGroupsSummary);
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
        if (getWorkflowStepGroupsSummary() != null)
            sb.append("WorkflowStepGroupsSummary: ").append(getWorkflowStepGroupsSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowStepGroupsResult == false)
            return false;
        ListWorkflowStepGroupsResult other = (ListWorkflowStepGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflowStepGroupsSummary() == null ^ this.getWorkflowStepGroupsSummary() == null)
            return false;
        if (other.getWorkflowStepGroupsSummary() != null && other.getWorkflowStepGroupsSummary().equals(this.getWorkflowStepGroupsSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflowStepGroupsSummary() == null) ? 0 : getWorkflowStepGroupsSummary().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowStepGroupsResult clone() {
        try {
            return (ListWorkflowStepGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
