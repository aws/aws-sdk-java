/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedElasticsearchInstanceOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     */
    private String reservedElasticsearchInstanceOfferingId;
    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.
     */

    public void setReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @return The offering identifier filter value. Use this parameter to show only the available offering that matches
     *         the specified reservation identifier.
     */

    public String getReservedElasticsearchInstanceOfferingId() {
        return this.reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only the available offering that matches the
     * specified reservation identifier.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The offering identifier filter value. Use this parameter to show only the available offering that matches
     *        the specified reservation identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedElasticsearchInstanceOfferingsRequest withReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        setReservedElasticsearchInstanceOfferingId(reservedElasticsearchInstanceOfferingId);
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @return Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedElasticsearchInstanceOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *        pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @return NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *         pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *        pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedElasticsearchInstanceOfferingsRequest withNextToken(String nextToken) {
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
        if (getReservedElasticsearchInstanceOfferingId() != null)
            sb.append("ReservedElasticsearchInstanceOfferingId: ").append(getReservedElasticsearchInstanceOfferingId()).append(",");
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

        if (obj instanceof DescribeReservedElasticsearchInstanceOfferingsRequest == false)
            return false;
        DescribeReservedElasticsearchInstanceOfferingsRequest other = (DescribeReservedElasticsearchInstanceOfferingsRequest) obj;
        if (other.getReservedElasticsearchInstanceOfferingId() == null ^ this.getReservedElasticsearchInstanceOfferingId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() != null
                && other.getReservedElasticsearchInstanceOfferingId().equals(this.getReservedElasticsearchInstanceOfferingId()) == false)
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

        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceOfferingId() == null) ? 0 : getReservedElasticsearchInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedElasticsearchInstanceOfferingsRequest clone() {
        return (DescribeReservedElasticsearchInstanceOfferingsRequest) super.clone();
    }

}
