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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpv6PoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Ipv6Pool> ipv6Pools;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * 
     * @return Information about the IPv6 address pools.
     */

    public java.util.List<Ipv6Pool> getIpv6Pools() {
        if (ipv6Pools == null) {
            ipv6Pools = new com.amazonaws.internal.SdkInternalList<Ipv6Pool>();
        }
        return ipv6Pools;
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * 
     * @param ipv6Pools
     *        Information about the IPv6 address pools.
     */

    public void setIpv6Pools(java.util.Collection<Ipv6Pool> ipv6Pools) {
        if (ipv6Pools == null) {
            this.ipv6Pools = null;
            return;
        }

        this.ipv6Pools = new com.amazonaws.internal.SdkInternalList<Ipv6Pool>(ipv6Pools);
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Pools(java.util.Collection)} or {@link #withIpv6Pools(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv6Pools
     *        Information about the IPv6 address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpv6PoolsResult withIpv6Pools(Ipv6Pool... ipv6Pools) {
        if (this.ipv6Pools == null) {
            setIpv6Pools(new com.amazonaws.internal.SdkInternalList<Ipv6Pool>(ipv6Pools.length));
        }
        for (Ipv6Pool ele : ipv6Pools) {
            this.ipv6Pools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 address pools.
     * </p>
     * 
     * @param ipv6Pools
     *        Information about the IPv6 address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpv6PoolsResult withIpv6Pools(java.util.Collection<Ipv6Pool> ipv6Pools) {
        setIpv6Pools(ipv6Pools);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpv6PoolsResult withNextToken(String nextToken) {
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
        if (getIpv6Pools() != null)
            sb.append("Ipv6Pools: ").append(getIpv6Pools()).append(",");
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

        if (obj instanceof DescribeIpv6PoolsResult == false)
            return false;
        DescribeIpv6PoolsResult other = (DescribeIpv6PoolsResult) obj;
        if (other.getIpv6Pools() == null ^ this.getIpv6Pools() == null)
            return false;
        if (other.getIpv6Pools() != null && other.getIpv6Pools().equals(this.getIpv6Pools()) == false)
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

        hashCode = prime * hashCode + ((getIpv6Pools() == null) ? 0 : getIpv6Pools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpv6PoolsResult clone() {
        try {
            return (DescribeIpv6PoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
