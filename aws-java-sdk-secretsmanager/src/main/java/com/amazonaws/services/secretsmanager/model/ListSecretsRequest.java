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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecrets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecretsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Boolean includePlannedDeletion;
    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The filters to apply to the list of secrets.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Secrets are listed by <code>CreatedDate</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * @param includePlannedDeletion
     */

    public void setIncludePlannedDeletion(Boolean includePlannedDeletion) {
        this.includePlannedDeletion = includePlannedDeletion;
    }

    /**
     * @return
     */

    public Boolean getIncludePlannedDeletion() {
        return this.includePlannedDeletion;
    }

    /**
     * @param includePlannedDeletion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withIncludePlannedDeletion(Boolean includePlannedDeletion) {
        setIncludePlannedDeletion(includePlannedDeletion);
        return this;
    }

    /**
     * @return
     */

    public Boolean isIncludePlannedDeletion() {
        return this.includePlannedDeletion;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @return The number of results to include in the response.</p>
     *         <p>
     *         If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *         get the next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>ListSecrets</code> again with the value from <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>ListSecrets</code> again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous call did not show all
     *         results. To get the next results, call <code>ListSecrets</code> again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecrets</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>ListSecrets</code> again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The filters to apply to the list of secrets.
     * </p>
     * 
     * @return The filters to apply to the list of secrets.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to apply to the list of secrets.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the list of secrets.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters to apply to the list of secrets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the list of secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to apply to the list of secrets.
     * </p>
     * 
     * @param filters
     *        The filters to apply to the list of secrets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Secrets are listed by <code>CreatedDate</code>.
     * </p>
     * 
     * @param sortOrder
     *        Secrets are listed by <code>CreatedDate</code>.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Secrets are listed by <code>CreatedDate</code>.
     * </p>
     * 
     * @return Secrets are listed by <code>CreatedDate</code>.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Secrets are listed by <code>CreatedDate</code>.
     * </p>
     * 
     * @param sortOrder
     *        Secrets are listed by <code>CreatedDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListSecretsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Secrets are listed by <code>CreatedDate</code>.
     * </p>
     * 
     * @param sortOrder
     *        Secrets are listed by <code>CreatedDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListSecretsRequest withSortOrder(SortOrderType sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getIncludePlannedDeletion() != null)
            sb.append("IncludePlannedDeletion: ").append(getIncludePlannedDeletion()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecretsRequest == false)
            return false;
        ListSecretsRequest other = (ListSecretsRequest) obj;
        if (other.getIncludePlannedDeletion() == null ^ this.getIncludePlannedDeletion() == null)
            return false;
        if (other.getIncludePlannedDeletion() != null && other.getIncludePlannedDeletion().equals(this.getIncludePlannedDeletion()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludePlannedDeletion() == null) ? 0 : getIncludePlannedDeletion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListSecretsRequest clone() {
        return (ListSecretsRequest) super.clone();
    }

}
