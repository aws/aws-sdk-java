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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRasterDataCollectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of items to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of items to return.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return.
     * </p>
     * 
     * @return The total number of items to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRasterDataCollectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you receive this token. Use it in your next request to receive
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRasterDataCollectionsRequest withNextToken(String nextToken) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRasterDataCollectionsRequest == false)
            return false;
        ListRasterDataCollectionsRequest other = (ListRasterDataCollectionsRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRasterDataCollectionsRequest clone() {
        return (ListRasterDataCollectionsRequest) super.clone();
    }

}
