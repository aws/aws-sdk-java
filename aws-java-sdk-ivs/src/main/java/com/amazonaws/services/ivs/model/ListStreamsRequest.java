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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the stream list to match the specified criterion.
     * </p>
     */
    private StreamFilters filterBy;
    /**
     * <p>
     * Maximum number of streams to return. Default: 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters the stream list to match the specified criterion.
     * </p>
     * 
     * @param filterBy
     *        Filters the stream list to match the specified criterion.
     */

    public void setFilterBy(StreamFilters filterBy) {
        this.filterBy = filterBy;
    }

    /**
     * <p>
     * Filters the stream list to match the specified criterion.
     * </p>
     * 
     * @return Filters the stream list to match the specified criterion.
     */

    public StreamFilters getFilterBy() {
        return this.filterBy;
    }

    /**
     * <p>
     * Filters the stream list to match the specified criterion.
     * </p>
     * 
     * @param filterBy
     *        Filters the stream list to match the specified criterion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withFilterBy(StreamFilters filterBy) {
        setFilterBy(filterBy);
        return this;
    }

    /**
     * <p>
     * Maximum number of streams to return. Default: 100.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of streams to return. Default: 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of streams to return. Default: 100.
     * </p>
     * 
     * @return Maximum number of streams to return. Default: 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of streams to return. Default: 100.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of streams to return. Default: 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @return The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * </p>
     * 
     * @param nextToken
     *        The first stream to retrieve. This is used for pagination; see the <code>nextToken</code> response field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamsRequest withNextToken(String nextToken) {
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
        if (getFilterBy() != null)
            sb.append("FilterBy: ").append(getFilterBy()).append(",");
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

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;
        if (other.getFilterBy() == null ^ this.getFilterBy() == null)
            return false;
        if (other.getFilterBy() != null && other.getFilterBy().equals(this.getFilterBy()) == false)
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

        hashCode = prime * hashCode + ((getFilterBy() == null) ? 0 : getFilterBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsRequest clone() {
        return (ListStreamsRequest) super.clone();
    }

}
