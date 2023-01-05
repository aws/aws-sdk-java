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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTransactions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog for which to list transactions. Defaults to the account ID of the caller.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED |
     * ACTIVE. The default is <code>ALL</code>.
     * </p>
     */
    private String statusFilter;
    /**
     * <p>
     * The maximum number of transactions to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token if this is not the first call to retrieve transactions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The catalog for which to list transactions. Defaults to the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The catalog for which to list transactions. Defaults to the account ID of the caller.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog for which to list transactions. Defaults to the account ID of the caller.
     * </p>
     * 
     * @return The catalog for which to list transactions. Defaults to the account ID of the caller.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog for which to list transactions. Defaults to the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The catalog for which to list transactions. Defaults to the account ID of the caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED |
     * ACTIVE. The default is <code>ALL</code>.
     * </p>
     * 
     * @param statusFilter
     *        A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED |
     *        ABORTED | ACTIVE. The default is <code>ALL</code>.
     * @see TransactionStatusFilter
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED |
     * ACTIVE. The default is <code>ALL</code>.
     * </p>
     * 
     * @return A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED |
     *         ABORTED | ACTIVE. The default is <code>ALL</code>.
     * @see TransactionStatusFilter
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED |
     * ACTIVE. The default is <code>ALL</code>.
     * </p>
     * 
     * @param statusFilter
     *        A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED |
     *        ABORTED | ACTIVE. The default is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionStatusFilter
     */

    public ListTransactionsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED |
     * ACTIVE. The default is <code>ALL</code>.
     * </p>
     * 
     * @param statusFilter
     *        A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED |
     *        ABORTED | ACTIVE. The default is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransactionStatusFilter
     */

    public ListTransactionsRequest withStatusFilter(TransactionStatusFilter statusFilter) {
        this.statusFilter = statusFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of transactions to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of transactions to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of transactions to return in a single call.
     * </p>
     * 
     * @return The maximum number of transactions to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of transactions to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of transactions to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve transactions.
     * </p>
     * 
     * @param nextToken
     *        A continuation token if this is not the first call to retrieve transactions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve transactions.
     * </p>
     * 
     * @return A continuation token if this is not the first call to retrieve transactions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token if this is not the first call to retrieve transactions.
     * </p>
     * 
     * @param nextToken
     *        A continuation token if this is not the first call to retrieve transactions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withNextToken(String nextToken) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: ").append(getStatusFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListTransactionsRequest == false)
            return false;
        ListTransactionsRequest other = (ListTransactionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionsRequest clone() {
        return (ListTransactionsRequest) super.clone();
    }

}
