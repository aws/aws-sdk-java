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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     */
    private String reservedInstanceId;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code> operations,
     * which returns results in the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @param reservedInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved OpenSearch instance ID.
     */

    public void setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @return The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *         matches the specified reserved OpenSearch instance ID.
     */

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * <p>
     * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reserved OpenSearch instance ID.
     * </p>
     * 
     * @param reservedInstanceId
     *        The reserved instance identifier filter value. Use this parameter to show only the reservation that
     *        matches the specified reserved OpenSearch instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withReservedInstanceId(String reservedInstanceId) {
        setReservedInstanceId(reservedInstanceId);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code>
     *        operations, which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @return If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you
     *         can include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code>
     *         operations, which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     * include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code> operations,
     * which returns results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>DescribeReservedInstances</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>DescribeReservedInstances</code>
     *        operations, which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesRequest withNextToken(String nextToken) {
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
        if (getReservedInstanceId() != null)
            sb.append("ReservedInstanceId: ").append(getReservedInstanceId()).append(",");
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

        if (obj instanceof DescribeReservedInstancesRequest == false)
            return false;
        DescribeReservedInstancesRequest other = (DescribeReservedInstancesRequest) obj;
        if (other.getReservedInstanceId() == null ^ this.getReservedInstanceId() == null)
            return false;
        if (other.getReservedInstanceId() != null && other.getReservedInstanceId().equals(this.getReservedInstanceId()) == false)
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

        hashCode = prime * hashCode + ((getReservedInstanceId() == null) ? 0 : getReservedInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesRequest clone() {
        return (DescribeReservedInstancesRequest) super.clone();
    }

}
