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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuerySuggestionsBlockListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index for a list of all block lists that exist for that index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of block lists (
     * <code>BlockListSummaryItems</code>).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of block lists to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the index for a list of all block lists that exist for that index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for a list of all block lists that exist for that index.</p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for a list of all block lists that exist for that index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @return The identifier of the index for a list of all block lists that exist for that index.</p>
     *         <p>
     *         For information on the current quota limits for block lists, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for a list of all block lists that exist for that index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for a list of all block lists that exist for that index.</p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of block lists (
     * <code>BlockListSummaryItems</code>).
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of block
     *        lists (<code>BlockListSummaryItems</code>).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of block lists (
     * <code>BlockListSummaryItems</code>).
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *         pagination token in the response. You can use this pagination token to retrieve the next set of block
     *         lists (<code>BlockListSummaryItems</code>).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of block lists (
     * <code>BlockListSummaryItems</code>).
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Kendra returns a
     *        pagination token in the response. You can use this pagination token to retrieve the next set of block
     *        lists (<code>BlockListSummaryItems</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of block lists to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of block lists to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of block lists to return.
     * </p>
     * 
     * @return The maximum number of block lists to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of block lists to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of block lists to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQuerySuggestionsBlockListsRequest withMaxResults(Integer maxResults) {
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
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

        if (obj instanceof ListQuerySuggestionsBlockListsRequest == false)
            return false;
        ListQuerySuggestionsBlockListsRequest other = (ListQuerySuggestionsBlockListsRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
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

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListQuerySuggestionsBlockListsRequest clone() {
        return (ListQuerySuggestionsBlockListsRequest) super.clone();
    }

}
