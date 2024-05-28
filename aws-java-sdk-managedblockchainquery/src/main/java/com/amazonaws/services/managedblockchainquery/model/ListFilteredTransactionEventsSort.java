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
 * Lists all the transaction events for an address on the blockchain.
 * </p>
 * <note>
 * <p>
 * This operation is only supported on the Bitcoin blockchain networks.
 * </p>
 * </note>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListFilteredTransactionEventsSort"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFilteredTransactionEventsSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Container on how the results will be sorted by?
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     * <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not
     * providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Container on how the results will be sorted by?
     * </p>
     * 
     * @param sortBy
     *        Container on how the results will be sorted by?
     * @see ListFilteredTransactionEventsSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Container on how the results will be sorted by?
     * </p>
     * 
     * @return Container on how the results will be sorted by?
     * @see ListFilteredTransactionEventsSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Container on how the results will be sorted by?
     * </p>
     * 
     * @param sortBy
     *        Container on how the results will be sorted by?
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListFilteredTransactionEventsSortBy
     */

    public ListFilteredTransactionEventsSort withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Container on how the results will be sorted by?
     * </p>
     * 
     * @param sortBy
     *        Container on how the results will be sorted by?
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListFilteredTransactionEventsSortBy
     */

    public ListFilteredTransactionEventsSort withSortBy(ListFilteredTransactionEventsSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     * <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not
     * providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     *        <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>.
     *        Not providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     * <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not
     * providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * </p>
     * 
     * @return The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     *         <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>.
     *         Not providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     * <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not
     * providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     *        <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>.
     *        Not providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListFilteredTransactionEventsSort withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     * <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>. Not
     * providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The container for the <i>sort order</i> for <code>ListFilteredTransactionEvents</code>. The
     *        <code>SortOrder</code> field only accepts the values <code>ASCENDING</code> and <code>DESCENDING</code>.
     *        Not providing <code>SortOrder</code> will default to <code>ASCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListFilteredTransactionEventsSort withSortOrder(SortOrder sortOrder) {
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

        if (obj instanceof ListFilteredTransactionEventsSort == false)
            return false;
        ListFilteredTransactionEventsSort other = (ListFilteredTransactionEventsSort) obj;
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
    public ListFilteredTransactionEventsSort clone() {
        try {
            return (ListFilteredTransactionEventsSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.ListFilteredTransactionEventsSortMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
