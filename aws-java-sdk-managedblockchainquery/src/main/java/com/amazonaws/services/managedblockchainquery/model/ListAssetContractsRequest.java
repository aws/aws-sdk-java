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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/ListAssetContracts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetContractsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the filter parameter for the request.
     * </p>
     */
    private ContractFilter contractFilter;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of contracts to list.
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
     * Contains the filter parameter for the request.
     * </p>
     * 
     * @param contractFilter
     *        Contains the filter parameter for the request.
     */

    public void setContractFilter(ContractFilter contractFilter) {
        this.contractFilter = contractFilter;
    }

    /**
     * <p>
     * Contains the filter parameter for the request.
     * </p>
     * 
     * @return Contains the filter parameter for the request.
     */

    public ContractFilter getContractFilter() {
        return this.contractFilter;
    }

    /**
     * <p>
     * Contains the filter parameter for the request.
     * </p>
     * 
     * @param contractFilter
     *        Contains the filter parameter for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetContractsRequest withContractFilter(ContractFilter contractFilter) {
        setContractFilter(contractFilter);
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

    public ListAssetContractsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of contracts to list.
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
     *        The maximum number of contracts to list.</p>
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
     * The maximum number of contracts to list.
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
     * @return The maximum number of contracts to list.</p>
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
     * The maximum number of contracts to list.
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
     *        The maximum number of contracts to list.</p>
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

    public ListAssetContractsRequest withMaxResults(Integer maxResults) {
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
        if (getContractFilter() != null)
            sb.append("ContractFilter: ").append(getContractFilter()).append(",");
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

        if (obj instanceof ListAssetContractsRequest == false)
            return false;
        ListAssetContractsRequest other = (ListAssetContractsRequest) obj;
        if (other.getContractFilter() == null ^ this.getContractFilter() == null)
            return false;
        if (other.getContractFilter() != null && other.getContractFilter().equals(this.getContractFilter()) == false)
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

        hashCode = prime * hashCode + ((getContractFilter() == null) ? 0 : getContractFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetContractsRequest clone() {
        return (ListAssetContractsRequest) super.clone();
    }

}
