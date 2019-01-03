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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribePublicIpv4PoolsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublicIpv4PoolsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribePublicIpv4PoolsRequest> {

    /**
     * <p>
     * The IDs of the address pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> poolIds;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

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

    public DescribePublicIpv4PoolsRequest withPoolIds(String... poolIds) {
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

    public DescribePublicIpv4PoolsRequest withPoolIds(java.util.Collection<String> poolIds) {
        setPoolIds(poolIds);
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

    public DescribePublicIpv4PoolsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public DescribePublicIpv4PoolsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribePublicIpv4PoolsRequest> getDryRunRequest() {
        Request<DescribePublicIpv4PoolsRequest> request = new DescribePublicIpv4PoolsRequestMarshaller().marshall(this);
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

        if (obj instanceof DescribePublicIpv4PoolsRequest == false)
            return false;
        DescribePublicIpv4PoolsRequest other = (DescribePublicIpv4PoolsRequest) obj;
        if (other.getPoolIds() == null ^ this.getPoolIds() == null)
            return false;
        if (other.getPoolIds() != null && other.getPoolIds().equals(this.getPoolIds()) == false)
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

        hashCode = prime * hashCode + ((getPoolIds() == null) ? 0 : getPoolIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribePublicIpv4PoolsRequest clone() {
        return (DescribePublicIpv4PoolsRequest) super.clone();
    }
}
