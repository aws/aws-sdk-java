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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationAnalysisTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCollaborationAnalysisTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The metadata of the analysis template within a collaboration.
     * </p>
     */
    private java.util.List<CollaborationAnalysisTemplateSummary> collaborationAnalysisTemplateSummaries;

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

    public ListCollaborationAnalysisTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The metadata of the analysis template within a collaboration.
     * </p>
     * 
     * @return The metadata of the analysis template within a collaboration.
     */

    public java.util.List<CollaborationAnalysisTemplateSummary> getCollaborationAnalysisTemplateSummaries() {
        return collaborationAnalysisTemplateSummaries;
    }

    /**
     * <p>
     * The metadata of the analysis template within a collaboration.
     * </p>
     * 
     * @param collaborationAnalysisTemplateSummaries
     *        The metadata of the analysis template within a collaboration.
     */

    public void setCollaborationAnalysisTemplateSummaries(java.util.Collection<CollaborationAnalysisTemplateSummary> collaborationAnalysisTemplateSummaries) {
        if (collaborationAnalysisTemplateSummaries == null) {
            this.collaborationAnalysisTemplateSummaries = null;
            return;
        }

        this.collaborationAnalysisTemplateSummaries = new java.util.ArrayList<CollaborationAnalysisTemplateSummary>(collaborationAnalysisTemplateSummaries);
    }

    /**
     * <p>
     * The metadata of the analysis template within a collaboration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollaborationAnalysisTemplateSummaries(java.util.Collection)} or
     * {@link #withCollaborationAnalysisTemplateSummaries(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param collaborationAnalysisTemplateSummaries
     *        The metadata of the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationAnalysisTemplatesResult withCollaborationAnalysisTemplateSummaries(
            CollaborationAnalysisTemplateSummary... collaborationAnalysisTemplateSummaries) {
        if (this.collaborationAnalysisTemplateSummaries == null) {
            setCollaborationAnalysisTemplateSummaries(new java.util.ArrayList<CollaborationAnalysisTemplateSummary>(
                    collaborationAnalysisTemplateSummaries.length));
        }
        for (CollaborationAnalysisTemplateSummary ele : collaborationAnalysisTemplateSummaries) {
            this.collaborationAnalysisTemplateSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata of the analysis template within a collaboration.
     * </p>
     * 
     * @param collaborationAnalysisTemplateSummaries
     *        The metadata of the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCollaborationAnalysisTemplatesResult withCollaborationAnalysisTemplateSummaries(
            java.util.Collection<CollaborationAnalysisTemplateSummary> collaborationAnalysisTemplateSummaries) {
        setCollaborationAnalysisTemplateSummaries(collaborationAnalysisTemplateSummaries);
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
        if (getCollaborationAnalysisTemplateSummaries() != null)
            sb.append("CollaborationAnalysisTemplateSummaries: ").append(getCollaborationAnalysisTemplateSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCollaborationAnalysisTemplatesResult == false)
            return false;
        ListCollaborationAnalysisTemplatesResult other = (ListCollaborationAnalysisTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCollaborationAnalysisTemplateSummaries() == null ^ this.getCollaborationAnalysisTemplateSummaries() == null)
            return false;
        if (other.getCollaborationAnalysisTemplateSummaries() != null
                && other.getCollaborationAnalysisTemplateSummaries().equals(this.getCollaborationAnalysisTemplateSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCollaborationAnalysisTemplateSummaries() == null) ? 0 : getCollaborationAnalysisTemplateSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListCollaborationAnalysisTemplatesResult clone() {
        try {
            return (ListCollaborationAnalysisTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
