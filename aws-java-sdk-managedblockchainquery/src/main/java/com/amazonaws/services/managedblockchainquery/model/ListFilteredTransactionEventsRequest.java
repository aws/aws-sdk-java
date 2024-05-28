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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListFilteredTransactionEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFilteredTransactionEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * <p>
     * Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     * </p>
     */
    private String network;
    /**
     * <p>
     * This is the unique public address on the blockchain for which the transaction events are being requested.
     * </p>
     */
    private AddressIdentifierFilter addressIdentifierFilter;
    /**
     * <p>
     * This container specifies the time frame for the transaction events returned in the response.
     * </p>
     */
    private TimeFilter timeFilter;
    /**
     * <p>
     * This container specifies filtering attributes related to BITCOIN_VOUT event types
     * </p>
     */
    private VoutFilter voutFilter;

    private ConfirmationStatusFilter confirmationStatusFilter;
    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     */
    private ListFilteredTransactionEventsSort sort;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of transaction events to list.
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
     * The blockchain network where the transaction occurred.
     * </p>
     * <p>
     * Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.</p>
     *        <p>
     *        Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * <p>
     * Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     * </p>
     * 
     * @return The blockchain network where the transaction occurred.</p>
     *         <p>
     *         Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * <p>
     * Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.</p>
     *        <p>
     *        Valid Values: <code>BITCOIN_MAINNET</code> | <code>BITCOIN_TESTNET</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFilteredTransactionEventsRequest withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * This is the unique public address on the blockchain for which the transaction events are being requested.
     * </p>
     * 
     * @param addressIdentifierFilter
     *        This is the unique public address on the blockchain for which the transaction events are being requested.
     */

    public void setAddressIdentifierFilter(AddressIdentifierFilter addressIdentifierFilter) {
        this.addressIdentifierFilter = addressIdentifierFilter;
    }

    /**
     * <p>
     * This is the unique public address on the blockchain for which the transaction events are being requested.
     * </p>
     * 
     * @return This is the unique public address on the blockchain for which the transaction events are being requested.
     */

    public AddressIdentifierFilter getAddressIdentifierFilter() {
        return this.addressIdentifierFilter;
    }

    /**
     * <p>
     * This is the unique public address on the blockchain for which the transaction events are being requested.
     * </p>
     * 
     * @param addressIdentifierFilter
     *        This is the unique public address on the blockchain for which the transaction events are being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFilteredTransactionEventsRequest withAddressIdentifierFilter(AddressIdentifierFilter addressIdentifierFilter) {
        setAddressIdentifierFilter(addressIdentifierFilter);
        return this;
    }

    /**
     * <p>
     * This container specifies the time frame for the transaction events returned in the response.
     * </p>
     * 
     * @param timeFilter
     *        This container specifies the time frame for the transaction events returned in the response.
     */

    public void setTimeFilter(TimeFilter timeFilter) {
        this.timeFilter = timeFilter;
    }

    /**
     * <p>
     * This container specifies the time frame for the transaction events returned in the response.
     * </p>
     * 
     * @return This container specifies the time frame for the transaction events returned in the response.
     */

    public TimeFilter getTimeFilter() {
        return this.timeFilter;
    }

    /**
     * <p>
     * This container specifies the time frame for the transaction events returned in the response.
     * </p>
     * 
     * @param timeFilter
     *        This container specifies the time frame for the transaction events returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFilteredTransactionEventsRequest withTimeFilter(TimeFilter timeFilter) {
        setTimeFilter(timeFilter);
        return this;
    }

    /**
     * <p>
     * This container specifies filtering attributes related to BITCOIN_VOUT event types
     * </p>
     * 
     * @param voutFilter
     *        This container specifies filtering attributes related to BITCOIN_VOUT event types
     */

    public void setVoutFilter(VoutFilter voutFilter) {
        this.voutFilter = voutFilter;
    }

    /**
     * <p>
     * This container specifies filtering attributes related to BITCOIN_VOUT event types
     * </p>
     * 
     * @return This container specifies filtering attributes related to BITCOIN_VOUT event types
     */

    public VoutFilter getVoutFilter() {
        return this.voutFilter;
    }

    /**
     * <p>
     * This container specifies filtering attributes related to BITCOIN_VOUT event types
     * </p>
     * 
     * @param voutFilter
     *        This container specifies filtering attributes related to BITCOIN_VOUT event types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFilteredTransactionEventsRequest withVoutFilter(VoutFilter voutFilter) {
        setVoutFilter(voutFilter);
        return this;
    }

    /**
     * @param confirmationStatusFilter
     */

    public void setConfirmationStatusFilter(ConfirmationStatusFilter confirmationStatusFilter) {
        this.confirmationStatusFilter = confirmationStatusFilter;
    }

    /**
     * @return
     */

    public ConfirmationStatusFilter getConfirmationStatusFilter() {
        return this.confirmationStatusFilter;
    }

    /**
     * @param confirmationStatusFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFilteredTransactionEventsRequest withConfirmationStatusFilter(ConfirmationStatusFilter confirmationStatusFilter) {
        setConfirmationStatusFilter(confirmationStatusFilter);
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

    public void setSort(ListFilteredTransactionEventsSort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The order by which the results will be sorted.
     * </p>
     * 
     * @return The order by which the results will be sorted.
     */

    public ListFilteredTransactionEventsSort getSort() {
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

    public ListFilteredTransactionEventsRequest withSort(ListFilteredTransactionEventsSort sort) {
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

    public ListFilteredTransactionEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of transaction events to list.
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
     *        The maximum number of transaction events to list.</p>
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
     * The maximum number of transaction events to list.
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
     * @return The maximum number of transaction events to list.</p>
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
     * The maximum number of transaction events to list.
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
     *        The maximum number of transaction events to list.</p>
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

    public ListFilteredTransactionEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
        if (getAddressIdentifierFilter() != null)
            sb.append("AddressIdentifierFilter: ").append(getAddressIdentifierFilter()).append(",");
        if (getTimeFilter() != null)
            sb.append("TimeFilter: ").append(getTimeFilter()).append(",");
        if (getVoutFilter() != null)
            sb.append("VoutFilter: ").append(getVoutFilter()).append(",");
        if (getConfirmationStatusFilter() != null)
            sb.append("ConfirmationStatusFilter: ").append(getConfirmationStatusFilter()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFilteredTransactionEventsRequest == false)
            return false;
        ListFilteredTransactionEventsRequest other = (ListFilteredTransactionEventsRequest) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getAddressIdentifierFilter() == null ^ this.getAddressIdentifierFilter() == null)
            return false;
        if (other.getAddressIdentifierFilter() != null && other.getAddressIdentifierFilter().equals(this.getAddressIdentifierFilter()) == false)
            return false;
        if (other.getTimeFilter() == null ^ this.getTimeFilter() == null)
            return false;
        if (other.getTimeFilter() != null && other.getTimeFilter().equals(this.getTimeFilter()) == false)
            return false;
        if (other.getVoutFilter() == null ^ this.getVoutFilter() == null)
            return false;
        if (other.getVoutFilter() != null && other.getVoutFilter().equals(this.getVoutFilter()) == false)
            return false;
        if (other.getConfirmationStatusFilter() == null ^ this.getConfirmationStatusFilter() == null)
            return false;
        if (other.getConfirmationStatusFilter() != null && other.getConfirmationStatusFilter().equals(this.getConfirmationStatusFilter()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getAddressIdentifierFilter() == null) ? 0 : getAddressIdentifierFilter().hashCode());
        hashCode = prime * hashCode + ((getTimeFilter() == null) ? 0 : getTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getVoutFilter() == null) ? 0 : getVoutFilter().hashCode());
        hashCode = prime * hashCode + ((getConfirmationStatusFilter() == null) ? 0 : getConfirmationStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFilteredTransactionEventsRequest clone() {
        return (ListFilteredTransactionEventsRequest) super.clone();
    }

}
