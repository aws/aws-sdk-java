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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The address (either a contract or wallet), whose transactions are being requested.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The blockchain network where the transactions occurred.
     * </p>
     */
    private String network;

    private BlockchainInstant fromBlockchainInstant;

    private BlockchainInstant toBlockchainInstant;
    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     */
    private ListTransactionsSort sort;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of transactions to list.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <note>
     * <p>
     * Even if additional results can be retrieved, the request can return less results than <code>maxResults</code> or
     * an empty array of results.
     * </p>
     * <p>
     * To retrieve the next set of results, make another request with the returned <code>nextToken</code> value. The
     * value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     * </p>
     * </note>
     */
    private Integer maxResults;
    /**
     * <p>
     * This filter is used to include transactions in the response that haven't reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     */
    private ConfirmationStatusFilter confirmationStatusFilter;

    /**
     * <p>
     * The address (either a contract or wallet), whose transactions are being requested.
     * </p>
     * 
     * @param address
     *        The address (either a contract or wallet), whose transactions are being requested.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address (either a contract or wallet), whose transactions are being requested.
     * </p>
     * 
     * @return The address (either a contract or wallet), whose transactions are being requested.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The address (either a contract or wallet), whose transactions are being requested.
     * </p>
     * 
     * @param address
     *        The address (either a contract or wallet), whose transactions are being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transactions occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transactions occurred.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network where the transactions occurred.
     * </p>
     * 
     * @return The blockchain network where the transactions occurred.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network where the transactions occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transactions occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ListTransactionsRequest withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transactions occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transactions occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ListTransactionsRequest withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * @param fromBlockchainInstant
     */

    public void setFromBlockchainInstant(BlockchainInstant fromBlockchainInstant) {
        this.fromBlockchainInstant = fromBlockchainInstant;
    }

    /**
     * @return
     */

    public BlockchainInstant getFromBlockchainInstant() {
        return this.fromBlockchainInstant;
    }

    /**
     * @param fromBlockchainInstant
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withFromBlockchainInstant(BlockchainInstant fromBlockchainInstant) {
        setFromBlockchainInstant(fromBlockchainInstant);
        return this;
    }

    /**
     * @param toBlockchainInstant
     */

    public void setToBlockchainInstant(BlockchainInstant toBlockchainInstant) {
        this.toBlockchainInstant = toBlockchainInstant;
    }

    /**
     * @return
     */

    public BlockchainInstant getToBlockchainInstant() {
        return this.toBlockchainInstant;
    }

    /**
     * @param toBlockchainInstant
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withToBlockchainInstant(BlockchainInstant toBlockchainInstant) {
        setToBlockchainInstant(toBlockchainInstant);
        return this;
    }

    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     * 
     * @param sort
     *        The order by which the results will be sorted.
     */

    public void setSort(ListTransactionsSort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     * 
     * @return The order by which the results will be sorted.
     */

    public ListTransactionsSort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     * 
     * @param sort
     *        The order by which the results will be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withSort(ListTransactionsSort sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of transactions to list.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <note>
     * <p>
     * Even if additional results can be retrieved, the request can return less results than <code>maxResults</code> or
     * an empty array of results.
     * </p>
     * <p>
     * To retrieve the next set of results, make another request with the returned <code>nextToken</code> value. The
     * value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of transactions to list.</p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <note>
     *        <p>
     *        Even if additional results can be retrieved, the request can return less results than
     *        <code>maxResults</code> or an empty array of results.
     *        </p>
     *        <p>
     *        To retrieve the next set of results, make another request with the returned <code>nextToken</code> value.
     *        The value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of transactions to list.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <note>
     * <p>
     * Even if additional results can be retrieved, the request can return less results than <code>maxResults</code> or
     * an empty array of results.
     * </p>
     * <p>
     * To retrieve the next set of results, make another request with the returned <code>nextToken</code> value. The
     * value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     * </p>
     * </note>
     * 
     * @return The maximum number of transactions to list.</p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <note>
     *         <p>
     *         Even if additional results can be retrieved, the request can return less results than
     *         <code>maxResults</code> or an empty array of results.
     *         </p>
     *         <p>
     *         To retrieve the next set of results, make another request with the returned <code>nextToken</code> value.
     *         The value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of transactions to list.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <note>
     * <p>
     * Even if additional results can be retrieved, the request can return less results than <code>maxResults</code> or
     * an empty array of results.
     * </p>
     * <p>
     * To retrieve the next set of results, make another request with the returned <code>nextToken</code> value. The
     * value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of transactions to list.</p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <note>
     *        <p>
     *        Even if additional results can be retrieved, the request can return less results than
     *        <code>maxResults</code> or an empty array of results.
     *        </p>
     *        <p>
     *        To retrieve the next set of results, make another request with the returned <code>nextToken</code> value.
     *        The value of <code>nextToken</code> is <code>null</code> when there are no more results to return
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This filter is used to include transactions in the response that haven't reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @param confirmationStatusFilter
     *        This filter is used to include transactions in the response that haven't reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     */

    public void setConfirmationStatusFilter(ConfirmationStatusFilter confirmationStatusFilter) {
        this.confirmationStatusFilter = confirmationStatusFilter;
    }

    /**
     * <p>
     * This filter is used to include transactions in the response that haven't reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @return This filter is used to include transactions in the response that haven't reached <a
     *         href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *         <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     */

    public ConfirmationStatusFilter getConfirmationStatusFilter() {
        return this.confirmationStatusFilter;
    }

    /**
     * <p>
     * This filter is used to include transactions in the response that haven't reached <a
     * href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality"> <i>finality</i>
     * </a>. Transactions that have reached finality are always part of the response.
     * </p>
     * 
     * @param confirmationStatusFilter
     *        This filter is used to include transactions in the response that haven't reached <a
     *        href="https://docs.aws.amazon.com/managed-blockchain/latest/ambq-dg/key-concepts.html#finality">
     *        <i>finality</i> </a>. Transactions that have reached finality are always part of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionsRequest withConfirmationStatusFilter(ConfirmationStatusFilter confirmationStatusFilter) {
        setConfirmationStatusFilter(confirmationStatusFilter);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
        if (getFromBlockchainInstant() != null)
            sb.append("FromBlockchainInstant: ").append(getFromBlockchainInstant()).append(",");
        if (getToBlockchainInstant() != null)
            sb.append("ToBlockchainInstant: ").append(getToBlockchainInstant()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getConfirmationStatusFilter() != null)
            sb.append("ConfirmationStatusFilter: ").append(getConfirmationStatusFilter());
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
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getFromBlockchainInstant() == null ^ this.getFromBlockchainInstant() == null)
            return false;
        if (other.getFromBlockchainInstant() != null && other.getFromBlockchainInstant().equals(this.getFromBlockchainInstant()) == false)
            return false;
        if (other.getToBlockchainInstant() == null ^ this.getToBlockchainInstant() == null)
            return false;
        if (other.getToBlockchainInstant() != null && other.getToBlockchainInstant().equals(this.getToBlockchainInstant()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getConfirmationStatusFilter() == null ^ this.getConfirmationStatusFilter() == null)
            return false;
        if (other.getConfirmationStatusFilter() != null && other.getConfirmationStatusFilter().equals(this.getConfirmationStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getFromBlockchainInstant() == null) ? 0 : getFromBlockchainInstant().hashCode());
        hashCode = prime * hashCode + ((getToBlockchainInstant() == null) ? 0 : getToBlockchainInstant().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getConfirmationStatusFilter() == null) ? 0 : getConfirmationStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionsRequest clone() {
        return (ListTransactionsRequest) super.clone();
    }

}
