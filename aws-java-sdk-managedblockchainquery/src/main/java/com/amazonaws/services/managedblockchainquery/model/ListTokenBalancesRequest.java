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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListTokenBalances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTokenBalancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The contract or wallet address on the blockchain network by which to filter the request. You must specify the
     * <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by the
     * address.
     * </p>
     */
    private OwnerFilter ownerFilter;
    /**
     * <p>
     * The contract address or a token identifier on the blockchain network by which to filter the request. You must
     * specify the <code>contractAddress</code> property of this container when listing tokens minted by a contract.
     * </p>
     * <note>
     * <p>
     * You must always specify the network property of this container when using this operation.
     * </p>
     * </note>
     */
    private TokenFilter tokenFilter;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of token balances to return.
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
     * The contract or wallet address on the blockchain network by which to filter the request. You must specify the
     * <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by the
     * address.
     * </p>
     * 
     * @param ownerFilter
     *        The contract or wallet address on the blockchain network by which to filter the request. You must specify
     *        the <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by
     *        the address.
     */

    public void setOwnerFilter(OwnerFilter ownerFilter) {
        this.ownerFilter = ownerFilter;
    }

    /**
     * <p>
     * The contract or wallet address on the blockchain network by which to filter the request. You must specify the
     * <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by the
     * address.
     * </p>
     * 
     * @return The contract or wallet address on the blockchain network by which to filter the request. You must specify
     *         the <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned
     *         by the address.
     */

    public OwnerFilter getOwnerFilter() {
        return this.ownerFilter;
    }

    /**
     * <p>
     * The contract or wallet address on the blockchain network by which to filter the request. You must specify the
     * <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by the
     * address.
     * </p>
     * 
     * @param ownerFilter
     *        The contract or wallet address on the blockchain network by which to filter the request. You must specify
     *        the <code>address</code> property of the <code>ownerFilter</code> when listing balances of tokens owned by
     *        the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokenBalancesRequest withOwnerFilter(OwnerFilter ownerFilter) {
        setOwnerFilter(ownerFilter);
        return this;
    }

    /**
     * <p>
     * The contract address or a token identifier on the blockchain network by which to filter the request. You must
     * specify the <code>contractAddress</code> property of this container when listing tokens minted by a contract.
     * </p>
     * <note>
     * <p>
     * You must always specify the network property of this container when using this operation.
     * </p>
     * </note>
     * 
     * @param tokenFilter
     *        The contract address or a token identifier on the blockchain network by which to filter the request. You
     *        must specify the <code>contractAddress</code> property of this container when listing tokens minted by a
     *        contract.</p> <note>
     *        <p>
     *        You must always specify the network property of this container when using this operation.
     *        </p>
     */

    public void setTokenFilter(TokenFilter tokenFilter) {
        this.tokenFilter = tokenFilter;
    }

    /**
     * <p>
     * The contract address or a token identifier on the blockchain network by which to filter the request. You must
     * specify the <code>contractAddress</code> property of this container when listing tokens minted by a contract.
     * </p>
     * <note>
     * <p>
     * You must always specify the network property of this container when using this operation.
     * </p>
     * </note>
     * 
     * @return The contract address or a token identifier on the blockchain network by which to filter the request. You
     *         must specify the <code>contractAddress</code> property of this container when listing tokens minted by a
     *         contract.</p> <note>
     *         <p>
     *         You must always specify the network property of this container when using this operation.
     *         </p>
     */

    public TokenFilter getTokenFilter() {
        return this.tokenFilter;
    }

    /**
     * <p>
     * The contract address or a token identifier on the blockchain network by which to filter the request. You must
     * specify the <code>contractAddress</code> property of this container when listing tokens minted by a contract.
     * </p>
     * <note>
     * <p>
     * You must always specify the network property of this container when using this operation.
     * </p>
     * </note>
     * 
     * @param tokenFilter
     *        The contract address or a token identifier on the blockchain network by which to filter the request. You
     *        must specify the <code>contractAddress</code> property of this container when listing tokens minted by a
     *        contract.</p> <note>
     *        <p>
     *        You must always specify the network property of this container when using this operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTokenBalancesRequest withTokenFilter(TokenFilter tokenFilter) {
        setTokenFilter(tokenFilter);
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

    public ListTokenBalancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of token balances to return.
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
     *        The maximum number of token balances to return.</p>
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
     * The maximum number of token balances to return.
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
     * @return The maximum number of token balances to return.</p>
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
     * The maximum number of token balances to return.
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
     *        The maximum number of token balances to return.</p>
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

    public ListTokenBalancesRequest withMaxResults(Integer maxResults) {
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
        if (getOwnerFilter() != null)
            sb.append("OwnerFilter: ").append(getOwnerFilter()).append(",");
        if (getTokenFilter() != null)
            sb.append("TokenFilter: ").append(getTokenFilter()).append(",");
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

        if (obj instanceof ListTokenBalancesRequest == false)
            return false;
        ListTokenBalancesRequest other = (ListTokenBalancesRequest) obj;
        if (other.getOwnerFilter() == null ^ this.getOwnerFilter() == null)
            return false;
        if (other.getOwnerFilter() != null && other.getOwnerFilter().equals(this.getOwnerFilter()) == false)
            return false;
        if (other.getTokenFilter() == null ^ this.getTokenFilter() == null)
            return false;
        if (other.getTokenFilter() != null && other.getTokenFilter().equals(this.getTokenFilter()) == false)
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

        hashCode = prime * hashCode + ((getOwnerFilter() == null) ? 0 : getOwnerFilter().hashCode());
        hashCode = prime * hashCode + ((getTokenFilter() == null) ? 0 : getTokenFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTokenBalancesRequest clone() {
        return (ListTokenBalancesRequest) super.clone();
    }

}
