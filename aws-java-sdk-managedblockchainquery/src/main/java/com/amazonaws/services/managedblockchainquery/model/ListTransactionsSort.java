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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for determining how the list transaction result will be sorted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionsSort"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionsSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code> field only
     * accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing <code>SortOrder</code> will
     * default to <code>ASCENDING</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * @see ListTransactionsSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * </p>
     * 
     * @return Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * @see ListTransactionsSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTransactionsSortBy
     */

    public ListTransactionsSort withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Defaults to the value <code>TRANSACTION_TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTransactionsSortBy
     */

    public ListTransactionsSort withSortBy(ListTransactionsSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code> field only
     * accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing <code>SortOrder</code> will
     * default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code>
     *        field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing
     *        <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code> field only
     * accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing <code>SortOrder</code> will
     * default to <code>ASCENDING</code>.
     * </p>
     * 
     * @return The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code>
     *         field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing
     *         <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code> field only
     * accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing <code>SortOrder</code> will
     * default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code>
     *        field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing
     *        <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTransactionsSort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code> field only
     * accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing <code>SortOrder</code> will
     * default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListTransactions</code>. The <code>SortOrder</code>
     *        field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not providing
     *        <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListTransactionsSort withSortOrder(SortOrder sortOrder) {
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
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

        if (obj instanceof ListTransactionsSort == false)
            return false;
        ListTransactionsSort other = (ListTransactionsSort) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionsSort clone() {
        try {
            return (ListTransactionsSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ListTransactionsSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
