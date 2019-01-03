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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePublicIpv4PoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the address pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PublicIpv4Pool> publicIpv4Pools;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @return Information about the address pools.
     */

    public java.util.List<PublicIpv4Pool> getPublicIpv4Pools() {
        if (publicIpv4Pools == null) {
            publicIpv4Pools = new com.amazonaws.internal.SdkInternalList<PublicIpv4Pool>();
        }
        return publicIpv4Pools;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @param publicIpv4Pools
     *        Information about the address pools.
     */

    public void setPublicIpv4Pools(java.util.Collection<PublicIpv4Pool> publicIpv4Pools) {
        if (publicIpv4Pools == null) {
            this.publicIpv4Pools = null;
            return;
        }

        this.publicIpv4Pools = new com.amazonaws.internal.SdkInternalList<PublicIpv4Pool>(publicIpv4Pools);
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicIpv4Pools(java.util.Collection)} or {@link #withPublicIpv4Pools(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param publicIpv4Pools
     *        Information about the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePublicIpv4PoolsResult withPublicIpv4Pools(PublicIpv4Pool... publicIpv4Pools) {
        if (this.publicIpv4Pools == null) {
            setPublicIpv4Pools(new com.amazonaws.internal.SdkInternalList<PublicIpv4Pool>(publicIpv4Pools.length));
        }
        for (PublicIpv4Pool ele : publicIpv4Pools) {
            this.publicIpv4Pools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @param publicIpv4Pools
     *        Information about the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePublicIpv4PoolsResult withPublicIpv4Pools(java.util.Collection<PublicIpv4Pool> publicIpv4Pools) {
        setPublicIpv4Pools(publicIpv4Pools);
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

    public DescribePublicIpv4PoolsResult withNextToken(String nextToken) {
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
        if (getPublicIpv4Pools() != null)
            sb.append("PublicIpv4Pools: ").append(getPublicIpv4Pools()).append(",");
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

        if (obj instanceof DescribePublicIpv4PoolsResult == false)
            return false;
        DescribePublicIpv4PoolsResult other = (DescribePublicIpv4PoolsResult) obj;
        if (other.getPublicIpv4Pools() == null ^ this.getPublicIpv4Pools() == null)
            return false;
        if (other.getPublicIpv4Pools() != null && other.getPublicIpv4Pools().equals(this.getPublicIpv4Pools()) == false)
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

        hashCode = prime * hashCode + ((getPublicIpv4Pools() == null) ? 0 : getPublicIpv4Pools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePublicIpv4PoolsResult clone() {
        try {
            return (DescribePublicIpv4PoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
