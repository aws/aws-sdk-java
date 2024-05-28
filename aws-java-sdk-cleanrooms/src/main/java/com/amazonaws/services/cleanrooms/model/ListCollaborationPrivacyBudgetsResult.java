/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollaborationPrivacyBudgetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Summaries of the collaboration privacy budgets.
     * </p>
     */
    private java.util.List<CollaborationPrivacyBudgetSummary> collaborationPrivacyBudgetSummaries;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summaries of the collaboration privacy budgets.
     * </p>
     * 
     * @return Summaries of the collaboration privacy budgets.
     */

    public java.util.List<CollaborationPrivacyBudgetSummary> getCollaborationPrivacyBudgetSummaries() {
        return collaborationPrivacyBudgetSummaries;
    }

    /**
     * <p>
     * Summaries of the collaboration privacy budgets.
     * </p>
     * 
     * @param collaborationPrivacyBudgetSummaries
     *        Summaries of the collaboration privacy budgets.
     */

    public void setCollaborationPrivacyBudgetSummaries(java.util.Collection<CollaborationPrivacyBudgetSummary> collaborationPrivacyBudgetSummaries) {
        if (collaborationPrivacyBudgetSummaries == null) {
            this.collaborationPrivacyBudgetSummaries = null;
            return;
        }

        this.collaborationPrivacyBudgetSummaries = new java.util.ArrayList<CollaborationPrivacyBudgetSummary>(collaborationPrivacyBudgetSummaries);
    }

    /**
     * <p>
     * Summaries of the collaboration privacy budgets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollaborationPrivacyBudgetSummaries(java.util.Collection)} or
     * {@link #withCollaborationPrivacyBudgetSummaries(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param collaborationPrivacyBudgetSummaries
     *        Summaries of the collaboration privacy budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationPrivacyBudgetsResult withCollaborationPrivacyBudgetSummaries(
            CollaborationPrivacyBudgetSummary... collaborationPrivacyBudgetSummaries) {
        if (this.collaborationPrivacyBudgetSummaries == null) {
            setCollaborationPrivacyBudgetSummaries(new java.util.ArrayList<CollaborationPrivacyBudgetSummary>(collaborationPrivacyBudgetSummaries.length));
        }
        for (CollaborationPrivacyBudgetSummary ele : collaborationPrivacyBudgetSummaries) {
            this.collaborationPrivacyBudgetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries of the collaboration privacy budgets.
     * </p>
     * 
     * @param collaborationPrivacyBudgetSummaries
     *        Summaries of the collaboration privacy budgets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationPrivacyBudgetsResult withCollaborationPrivacyBudgetSummaries(
            java.util.Collection<CollaborationPrivacyBudgetSummary> collaborationPrivacyBudgetSummaries) {
        setCollaborationPrivacyBudgetSummaries(collaborationPrivacyBudgetSummaries);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationPrivacyBudgetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCollaborationPrivacyBudgetSummaries() != null)
            sb.append("CollaborationPrivacyBudgetSummaries: ").append(getCollaborationPrivacyBudgetSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollaborationPrivacyBudgetsResult == false)
            return false;
        ListCollaborationPrivacyBudgetsResult other = (ListCollaborationPrivacyBudgetsResult) obj;
        if (other.getCollaborationPrivacyBudgetSummaries() == null ^ this.getCollaborationPrivacyBudgetSummaries() == null)
            return false;
        if (other.getCollaborationPrivacyBudgetSummaries() != null
                && other.getCollaborationPrivacyBudgetSummaries().equals(this.getCollaborationPrivacyBudgetSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationPrivacyBudgetSummaries() == null) ? 0 : getCollaborationPrivacyBudgetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCollaborationPrivacyBudgetsResult clone() {
        try {
            return (ListCollaborationPrivacyBudgetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
