/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeCoipPoolsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCoipPoolsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeCoipPoolsRequest> {

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> poolIds;
    /**
     * <p>
     * The filters. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.pool-id</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.local-gateway-route-table-id</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     * 
     * @return The IDs of the address pools.
     */

    public java.util.List<String> getPoolIds() {
        if (poolIds == null) {
            poolIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return poolIds;
    }

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     * 
     * @param poolIds
     *        The IDs of the address pools.
     */

    public void setPoolIds(java.util.Collection<String> poolIds) {
        if (poolIds == null) {
            this.poolIds = null;
            return;
        }

        this.poolIds = new com.amazonaws.internal.SdkInternalList<String>(poolIds);
    }

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoolIds(java.util.Collection)} or {@link #withPoolIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param poolIds
     *        The IDs of the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withPoolIds(String... poolIds) {
        if (this.poolIds == null) {
            setPoolIds(new com.amazonaws.internal.SdkInternalList<String>(poolIds.length));
        }
        for (String ele : poolIds) {
            this.poolIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     * 
     * @param poolIds
     *        The IDs of the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withPoolIds(java.util.Collection<String> poolIds) {
        setPoolIds(poolIds);
        return this;
    }

    /**
     * <p>
     * The filters. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.pool-id</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.local-gateway-route-table-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>coip-pool.pool-id</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>coip-pool.local-gateway-route-table-id</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.pool-id</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.local-gateway-route-table-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.pool-id</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.local-gateway-route-table-id</code>
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.pool-id</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.local-gateway-route-table-id</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.pool-id</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.local-gateway-route-table-id</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.pool-id</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>coip-pool.local-gateway-route-table-id</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.pool-id</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>coip-pool.local-gateway-route-table-id</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCoipPoolsRequest> getDryRunRequest() {
        Request<DescribeCoipPoolsRequest> request = new DescribeCoipPoolsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPoolIds() != null)
            sb.append("PoolIds: ").append(getPoolIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeCoipPoolsRequest == false)
            return false;
        DescribeCoipPoolsRequest other = (DescribeCoipPoolsRequest) obj;
        if (other.getPoolIds() == null ^ this.getPoolIds() == null)
            return false;
        if (other.getPoolIds() != null && other.getPoolIds().equals(this.getPoolIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getPoolIds() == null) ? 0 : getPoolIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCoipPoolsRequest clone() {
        return (DescribeCoipPoolsRequest) super.clone();
    }
}
