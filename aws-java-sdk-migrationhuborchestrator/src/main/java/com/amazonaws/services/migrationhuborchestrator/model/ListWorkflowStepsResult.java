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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowStepsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summary of steps in a migration workflow.
     * </p>
     */
    private java.util.List<WorkflowStepSummary> workflowStepsSummary;

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

    public ListWorkflowStepsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summary of steps in a migration workflow.
     * </p>
     * 
     * @return The summary of steps in a migration workflow.
     */

    public java.util.List<WorkflowStepSummary> getWorkflowStepsSummary() {
        return workflowStepsSummary;
    }

    /**
     * <p>
     * The summary of steps in a migration workflow.
     * </p>
     * 
     * @param workflowStepsSummary
     *        The summary of steps in a migration workflow.
     */

    public void setWorkflowStepsSummary(java.util.Collection<WorkflowStepSummary> workflowStepsSummary) {
        if (workflowStepsSummary == null) {
            this.workflowStepsSummary = null;
            return;
        }

        this.workflowStepsSummary = new java.util.ArrayList<WorkflowStepSummary>(workflowStepsSummary);
    }

    /**
     * <p>
     * The summary of steps in a migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkflowStepsSummary(java.util.Collection)} or {@link #withWorkflowStepsSummary(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param workflowStepsSummary
     *        The summary of steps in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepsResult withWorkflowStepsSummary(WorkflowStepSummary... workflowStepsSummary) {
        if (this.workflowStepsSummary == null) {
            setWorkflowStepsSummary(new java.util.ArrayList<WorkflowStepSummary>(workflowStepsSummary.length));
        }
        for (WorkflowStepSummary ele : workflowStepsSummary) {
            this.workflowStepsSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of steps in a migration workflow.
     * </p>
     * 
     * @param workflowStepsSummary
     *        The summary of steps in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowStepsResult withWorkflowStepsSummary(java.util.Collection<WorkflowStepSummary> workflowStepsSummary) {
        setWorkflowStepsSummary(workflowStepsSummary);
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
        if (getWorkflowStepsSummary() != null)
            sb.append("WorkflowStepsSummary: ").append(getWorkflowStepsSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowStepsResult == false)
            return false;
        ListWorkflowStepsResult other = (ListWorkflowStepsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkflowStepsSummary() == null ^ this.getWorkflowStepsSummary() == null)
            return false;
        if (other.getWorkflowStepsSummary() != null && other.getWorkflowStepsSummary().equals(this.getWorkflowStepsSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkflowStepsSummary() == null) ? 0 : getWorkflowStepsSummary().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowStepsResult clone() {
        try {
            return (ListWorkflowStepsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
