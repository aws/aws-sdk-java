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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListKnowledgeBases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKnowledgeBasesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the knowledge bases.
     * </p>
     */
    private java.util.List<KnowledgeBaseSummary> knowledgeBaseSummaries;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the knowledge bases.
     * </p>
     * 
     * @return Information about the knowledge bases.
     */

    public java.util.List<KnowledgeBaseSummary> getKnowledgeBaseSummaries() {
        return knowledgeBaseSummaries;
    }

    /**
     * <p>
     * Information about the knowledge bases.
     * </p>
     * 
     * @param knowledgeBaseSummaries
     *        Information about the knowledge bases.
     */

    public void setKnowledgeBaseSummaries(java.util.Collection<KnowledgeBaseSummary> knowledgeBaseSummaries) {
        if (knowledgeBaseSummaries == null) {
            this.knowledgeBaseSummaries = null;
            return;
        }

        this.knowledgeBaseSummaries = new java.util.ArrayList<KnowledgeBaseSummary>(knowledgeBaseSummaries);
    }

    /**
     * <p>
     * Information about the knowledge bases.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKnowledgeBaseSummaries(java.util.Collection)} or
     * {@link #withKnowledgeBaseSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param knowledgeBaseSummaries
     *        Information about the knowledge bases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKnowledgeBasesResult withKnowledgeBaseSummaries(KnowledgeBaseSummary... knowledgeBaseSummaries) {
        if (this.knowledgeBaseSummaries == null) {
            setKnowledgeBaseSummaries(new java.util.ArrayList<KnowledgeBaseSummary>(knowledgeBaseSummaries.length));
        }
        for (KnowledgeBaseSummary ele : knowledgeBaseSummaries) {
            this.knowledgeBaseSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the knowledge bases.
     * </p>
     * 
     * @param knowledgeBaseSummaries
     *        Information about the knowledge bases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKnowledgeBasesResult withKnowledgeBaseSummaries(java.util.Collection<KnowledgeBaseSummary> knowledgeBaseSummaries) {
        setKnowledgeBaseSummaries(knowledgeBaseSummaries);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKnowledgeBasesResult withNextToken(String nextToken) {
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
        if (getKnowledgeBaseSummaries() != null)
            sb.append("KnowledgeBaseSummaries: ").append(getKnowledgeBaseSummaries()).append(",");
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

        if (obj instanceof ListKnowledgeBasesResult == false)
            return false;
        ListKnowledgeBasesResult other = (ListKnowledgeBasesResult) obj;
        if (other.getKnowledgeBaseSummaries() == null ^ this.getKnowledgeBaseSummaries() == null)
            return false;
        if (other.getKnowledgeBaseSummaries() != null && other.getKnowledgeBaseSummaries().equals(this.getKnowledgeBaseSummaries()) == false)
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

        hashCode = prime * hashCode + ((getKnowledgeBaseSummaries() == null) ? 0 : getKnowledgeBaseSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKnowledgeBasesResult clone() {
        try {
            return (ListKnowledgeBasesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
