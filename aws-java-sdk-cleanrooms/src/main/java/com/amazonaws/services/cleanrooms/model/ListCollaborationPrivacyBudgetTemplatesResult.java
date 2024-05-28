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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgetTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollaborationPrivacyBudgetTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     * information, creation information, the privacy budget type.
     * </p>
     */
    private java.util.List<CollaborationPrivacyBudgetTemplateSummary> collaborationPrivacyBudgetTemplateSummaries;

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

    public ListCollaborationPrivacyBudgetTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     * information, creation information, the privacy budget type.
     * </p>
     * 
     * @return An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     *         information, creation information, the privacy budget type.
     */

    public java.util.List<CollaborationPrivacyBudgetTemplateSummary> getCollaborationPrivacyBudgetTemplateSummaries() {
        return collaborationPrivacyBudgetTemplateSummaries;
    }

    /**
     * <p>
     * An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     * information, creation information, the privacy budget type.
     * </p>
     * 
     * @param collaborationPrivacyBudgetTemplateSummaries
     *        An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     *        information, creation information, the privacy budget type.
     */

    public void setCollaborationPrivacyBudgetTemplateSummaries(
            java.util.Collection<CollaborationPrivacyBudgetTemplateSummary> collaborationPrivacyBudgetTemplateSummaries) {
        if (collaborationPrivacyBudgetTemplateSummaries == null) {
            this.collaborationPrivacyBudgetTemplateSummaries = null;
            return;
        }

        this.collaborationPrivacyBudgetTemplateSummaries = new java.util.ArrayList<CollaborationPrivacyBudgetTemplateSummary>(
                collaborationPrivacyBudgetTemplateSummaries);
    }

    /**
     * <p>
     * An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     * information, creation information, the privacy budget type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollaborationPrivacyBudgetTemplateSummaries(java.util.Collection)} or
     * {@link #withCollaborationPrivacyBudgetTemplateSummaries(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param collaborationPrivacyBudgetTemplateSummaries
     *        An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     *        information, creation information, the privacy budget type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationPrivacyBudgetTemplatesResult withCollaborationPrivacyBudgetTemplateSummaries(
            CollaborationPrivacyBudgetTemplateSummary... collaborationPrivacyBudgetTemplateSummaries) {
        if (this.collaborationPrivacyBudgetTemplateSummaries == null) {
            setCollaborationPrivacyBudgetTemplateSummaries(new java.util.ArrayList<CollaborationPrivacyBudgetTemplateSummary>(
                    collaborationPrivacyBudgetTemplateSummaries.length));
        }
        for (CollaborationPrivacyBudgetTemplateSummary ele : collaborationPrivacyBudgetTemplateSummaries) {
            this.collaborationPrivacyBudgetTemplateSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     * information, creation information, the privacy budget type.
     * </p>
     * 
     * @param collaborationPrivacyBudgetTemplateSummaries
     *        An array that summarizes the collaboration privacy budget templates. The summary includes collaboration
     *        information, creation information, the privacy budget type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationPrivacyBudgetTemplatesResult withCollaborationPrivacyBudgetTemplateSummaries(
            java.util.Collection<CollaborationPrivacyBudgetTemplateSummary> collaborationPrivacyBudgetTemplateSummaries) {
        setCollaborationPrivacyBudgetTemplateSummaries(collaborationPrivacyBudgetTemplateSummaries);
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
        if (getCollaborationPrivacyBudgetTemplateSummaries() != null)
            sb.append("CollaborationPrivacyBudgetTemplateSummaries: ").append(getCollaborationPrivacyBudgetTemplateSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollaborationPrivacyBudgetTemplatesResult == false)
            return false;
        ListCollaborationPrivacyBudgetTemplatesResult other = (ListCollaborationPrivacyBudgetTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCollaborationPrivacyBudgetTemplateSummaries() == null ^ this.getCollaborationPrivacyBudgetTemplateSummaries() == null)
            return false;
        if (other.getCollaborationPrivacyBudgetTemplateSummaries() != null
                && other.getCollaborationPrivacyBudgetTemplateSummaries().equals(this.getCollaborationPrivacyBudgetTemplateSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getCollaborationPrivacyBudgetTemplateSummaries() == null) ? 0 : getCollaborationPrivacyBudgetTemplateSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListCollaborationPrivacyBudgetTemplatesResult clone() {
        try {
            return (ListCollaborationPrivacyBudgetTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
