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
 * Container for parameters to <code>DescribeReservedElasticsearchInstances</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedElasticsearchInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved Elasticsearch instance ID.
     * </p>
     */
    private String reservedElasticsearchInstanceId;
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
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved Elasticsearch instance ID.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved Elasticsearch instance ID.
     */

    public void setReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved Elasticsearch instance ID.
     * </p>
     * 
     * @return The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *         matches the specified reserved Elasticsearch instance ID.
     */

    public String getReservedElasticsearchInstanceId() {
        return this.reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved Elasticsearch instance ID.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved Elasticsearch instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedElasticsearchInstancesRequest withReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        setReservedElasticsearchInstanceId(reservedElasticsearchInstanceId);
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

    public DescribeReservedElasticsearchInstancesRequest withMaxResults(Integer maxResults) {
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

    public DescribeReservedElasticsearchInstancesRequest withNextToken(String nextToken) {
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
        if (getReservedElasticsearchInstanceId() != null)
            sb.append("ReservedElasticsearchInstanceId: ").append(getReservedElasticsearchInstanceId()).append(",");
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

        if (obj instanceof DescribeReservedElasticsearchInstancesRequest == false)
            return false;
        DescribeReservedElasticsearchInstancesRequest other = (DescribeReservedElasticsearchInstancesRequest) obj;
        if (other.getReservedElasticsearchInstanceId() == null ^ this.getReservedElasticsearchInstanceId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceId() != null
                && other.getReservedElasticsearchInstanceId().equals(this.getReservedElasticsearchInstanceId()) == false)
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

        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceId() == null) ? 0 : getReservedElasticsearchInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedElasticsearchInstancesRequest clone() {
        return (DescribeReservedElasticsearchInstancesRequest) super.clone();
    }

}
