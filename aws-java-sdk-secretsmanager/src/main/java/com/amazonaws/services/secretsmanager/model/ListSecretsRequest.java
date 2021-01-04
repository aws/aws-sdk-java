/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /**
     * <p>
     * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter,
     * it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you
     * specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value
     * as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the
     * results. Note that Secrets Manager might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * indicating there's more output available. In a subsequent call, set it to the value of the previous call
     * <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Lists the secret request filters.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Lists secrets in the requested order.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter,
     * it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you
     * specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value
     * as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the
     * results. Note that Secrets Manager might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results you want to include in the response. If you don't include this
     *        parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the
     *        maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null).
     *        Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     *        get the next part of the results. Note that Secrets Manager might return fewer results than the maximum
     *        even when there are more results available. You should check <code>NextToken</code> after every operation
     *        to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter,
     * it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you
     * specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value
     * as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the
     * results. Note that Secrets Manager might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @return (Optional) Limits the number of results you want to include in the response. If you don't include this
     *         parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the
     *         maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null).
     *         Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     *         get the next part of the results. Note that Secrets Manager might return fewer results than the maximum
     *         even when there are more results available. You should check <code>NextToken</code> after every operation
     *         to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results you want to include in the response. If you don't include this parameter,
     * it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you
     * specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value
     * as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the
     * results. Note that Secrets Manager might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results you want to include in the response. If you don't include this
     *        parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the
     *        maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null).
     *        Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     *        get the next part of the results. Note that Secrets Manager might return fewer results than the maximum
     *        even when there are more results available. You should check <code>NextToken</code> after every operation
     *        to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * indicating there's more output available. In a subsequent call, set it to the value of the previous call
     * <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request indicating there's more output available. In a subsequent call, set it to the value of the
     *        previous call <code>NextToken</code> response to indicate where the output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * indicating there's more output available. In a subsequent call, set it to the value of the previous call
     * <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *         request indicating there's more output available. In a subsequent call, set it to the value of the
     *         previous call <code>NextToken</code> response to indicate where the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * indicating there's more output available. In a subsequent call, set it to the value of the previous call
     * <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request indicating there's more output available. In a subsequent call, set it to the value of the
     *        previous call <code>NextToken</code> response to indicate where the output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Lists the secret request filters.
     * </p>
     * 
     * @return Lists the secret request filters.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Lists the secret request filters.
     * </p>
     * 
     * @param filters
     *        Lists the secret request filters.
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
     * Lists the secret request filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Lists the secret request filters.
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
     * Lists the secret request filters.
     * </p>
     * 
     * @param filters
     *        Lists the secret request filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Lists secrets in the requested order.
     * </p>
     * 
     * @param sortOrder
     *        Lists secrets in the requested order.
     * @see SortOrderType
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Lists secrets in the requested order.
     * </p>
     * 
     * @return Lists secrets in the requested order.
     * @see SortOrderType
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Lists secrets in the requested order.
     * </p>
     * 
     * @param sortOrder
     *        Lists secrets in the requested order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrderType
     */

    public ListSecretsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Lists secrets in the requested order.
     * </p>
     * 
     * @param sortOrder
     *        Lists secrets in the requested order.
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
