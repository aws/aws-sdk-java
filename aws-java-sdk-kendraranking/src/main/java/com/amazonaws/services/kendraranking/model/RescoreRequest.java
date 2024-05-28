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
package com.amazonaws.services.kendraranking.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RescoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     */
    private String rescoreExecutionPlanId;
    /**
     * <p>
     * The input query from the search service.
     * </p>
     */
    private String searchQuery;
    /**
     * <p>
     * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * </p>
     */
    private java.util.List<Document> documents;

    /**
     * <p>
     * The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param rescoreExecutionPlanId
     *        The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent
     *        Ranking resource used for provisioning the <code>Rescore</code> API.
     */

    public void setRescoreExecutionPlanId(String rescoreExecutionPlanId) {
        this.rescoreExecutionPlanId = rescoreExecutionPlanId;
    }

    /**
     * <p>
     * The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @return The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent
     *         Ranking resource used for provisioning the <code>Rescore</code> API.
     */

    public String getRescoreExecutionPlanId() {
        return this.rescoreExecutionPlanId;
    }

    /**
     * <p>
     * The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param rescoreExecutionPlanId
     *        The identifier of the rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent
     *        Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreRequest withRescoreExecutionPlanId(String rescoreExecutionPlanId) {
        setRescoreExecutionPlanId(rescoreExecutionPlanId);
        return this;
    }

    /**
     * <p>
     * The input query from the search service.
     * </p>
     * 
     * @param searchQuery
     *        The input query from the search service.
     */

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    /**
     * <p>
     * The input query from the search service.
     * </p>
     * 
     * @return The input query from the search service.
     */

    public String getSearchQuery() {
        return this.searchQuery;
    }

    /**
     * <p>
     * The input query from the search service.
     * </p>
     * 
     * @param searchQuery
     *        The input query from the search service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreRequest withSearchQuery(String searchQuery) {
        setSearchQuery(searchQuery);
        return this;
    }

    /**
     * <p>
     * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * </p>
     * 
     * @return The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     */

    public java.util.List<Document> getDocuments() {
        return documents;
    }

    /**
     * <p>
     * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * </p>
     * 
     * @param documents
     *        The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     */

    public void setDocuments(java.util.Collection<Document> documents) {
        if (documents == null) {
            this.documents = null;
            return;
        }

        this.documents = new java.util.ArrayList<Document>(documents);
    }

    /**
     * <p>
     * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocuments(java.util.Collection)} or {@link #withDocuments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documents
     *        The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreRequest withDocuments(Document... documents) {
        if (this.documents == null) {
            setDocuments(new java.util.ArrayList<Document>(documents.length));
        }
        for (Document ele : documents) {
            this.documents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * </p>
     * 
     * @param documents
     *        The list of documents for Amazon Kendra Intelligent Ranking to rescore or rank on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RescoreRequest withDocuments(java.util.Collection<Document> documents) {
        setDocuments(documents);
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
        if (getRescoreExecutionPlanId() != null)
            sb.append("RescoreExecutionPlanId: ").append(getRescoreExecutionPlanId()).append(",");
        if (getSearchQuery() != null)
            sb.append("SearchQuery: ").append(getSearchQuery()).append(",");
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RescoreRequest == false)
            return false;
        RescoreRequest other = (RescoreRequest) obj;
        if (other.getRescoreExecutionPlanId() == null ^ this.getRescoreExecutionPlanId() == null)
            return false;
        if (other.getRescoreExecutionPlanId() != null && other.getRescoreExecutionPlanId().equals(this.getRescoreExecutionPlanId()) == false)
            return false;
        if (other.getSearchQuery() == null ^ this.getSearchQuery() == null)
            return false;
        if (other.getSearchQuery() != null && other.getSearchQuery().equals(this.getSearchQuery()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRescoreExecutionPlanId() == null) ? 0 : getRescoreExecutionPlanId().hashCode());
        hashCode = prime * hashCode + ((getSearchQuery() == null) ? 0 : getSearchQuery().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        return hashCode;
    }

    @Override
    public RescoreRequest clone() {
        return (RescoreRequest) super.clone();
    }

}
