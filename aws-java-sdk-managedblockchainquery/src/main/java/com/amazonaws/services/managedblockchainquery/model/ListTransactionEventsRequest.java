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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTransactionEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransactionEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     */
    private String transactionHash;
    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * <note>
     * <p>
     * <code>transactionId</code> is only supported on the Bitcoin networks.
     * </p>
     * </note>
     */
    private String transactionId;
    /**
     * <p>
     * The blockchain network where the transaction events occurred.
     * </p>
     */
    private String network;
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
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionHash
     *        The hash of a transaction. It is generated when a transaction is created.
     */

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @return The hash of a transaction. It is generated when a transaction is created.
     */

    public String getTransactionHash() {
        return this.transactionHash;
    }

    /**
     * <p>
     * The hash of a transaction. It is generated when a transaction is created.
     * </p>
     * 
     * @param transactionHash
     *        The hash of a transaction. It is generated when a transaction is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionEventsRequest withTransactionHash(String transactionHash) {
        setTransactionHash(transactionHash);
        return this;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * <note>
     * <p>
     * <code>transactionId</code> is only supported on the Bitcoin networks.
     * </p>
     * </note>
     * 
     * @param transactionId
     *        The identifier of a Bitcoin transaction. It is generated when a transaction is created.</p> <note>
     *        <p>
     *        <code>transactionId</code> is only supported on the Bitcoin networks.
     *        </p>
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * <note>
     * <p>
     * <code>transactionId</code> is only supported on the Bitcoin networks.
     * </p>
     * </note>
     * 
     * @return The identifier of a Bitcoin transaction. It is generated when a transaction is created.</p> <note>
     *         <p>
     *         <code>transactionId</code> is only supported on the Bitcoin networks.
     *         </p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The identifier of a Bitcoin transaction. It is generated when a transaction is created.
     * </p>
     * <note>
     * <p>
     * <code>transactionId</code> is only supported on the Bitcoin networks.
     * </p>
     * </note>
     * 
     * @param transactionId
     *        The identifier of a Bitcoin transaction. It is generated when a transaction is created.</p> <note>
     *        <p>
     *        <code>transactionId</code> is only supported on the Bitcoin networks.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransactionEventsRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transaction events occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction events occurred.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network where the transaction events occurred.
     * </p>
     * 
     * @return The blockchain network where the transaction events occurred.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network where the transaction events occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction events occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ListTransactionEventsRequest withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transaction events occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction events occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public ListTransactionEventsRequest withNetwork(QueryNetwork network) {
        this.network = network.toString();
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

    public ListTransactionEventsRequest withNextToken(String nextToken) {
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

    public ListTransactionEventsRequest withMaxResults(Integer maxResults) {
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
        if (getTransactionHash() != null)
            sb.append("TransactionHash: ").append(getTransactionHash()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
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

        if (obj instanceof ListTransactionEventsRequest == false)
            return false;
        ListTransactionEventsRequest other = (ListTransactionEventsRequest) obj;
        if (other.getTransactionHash() == null ^ this.getTransactionHash() == null)
            return false;
        if (other.getTransactionHash() != null && other.getTransactionHash().equals(this.getTransactionHash()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
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

        hashCode = prime * hashCode + ((getTransactionHash() == null) ? 0 : getTransactionHash().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTransactionEventsRequest clone() {
        return (ListTransactionEventsRequest) super.clone();
    }

}
