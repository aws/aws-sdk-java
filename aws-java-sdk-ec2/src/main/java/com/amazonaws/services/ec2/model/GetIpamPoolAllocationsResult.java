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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamPoolAllocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IPAM pool allocations you want information on.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamPoolAllocation> ipamPoolAllocations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IPAM pool allocations you want information on.
     * </p>
     * 
     * @return The IPAM pool allocations you want information on.
     */

    public java.util.List<IpamPoolAllocation> getIpamPoolAllocations() {
        if (ipamPoolAllocations == null) {
            ipamPoolAllocations = new com.amazonaws.internal.SdkInternalList<IpamPoolAllocation>();
        }
        return ipamPoolAllocations;
    }

    /**
     * <p>
     * The IPAM pool allocations you want information on.
     * </p>
     * 
     * @param ipamPoolAllocations
     *        The IPAM pool allocations you want information on.
     */

    public void setIpamPoolAllocations(java.util.Collection<IpamPoolAllocation> ipamPoolAllocations) {
        if (ipamPoolAllocations == null) {
            this.ipamPoolAllocations = null;
            return;
        }

        this.ipamPoolAllocations = new com.amazonaws.internal.SdkInternalList<IpamPoolAllocation>(ipamPoolAllocations);
    }

    /**
     * <p>
     * The IPAM pool allocations you want information on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamPoolAllocations(java.util.Collection)} or {@link #withIpamPoolAllocations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ipamPoolAllocations
     *        The IPAM pool allocations you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamPoolAllocationsResult withIpamPoolAllocations(IpamPoolAllocation... ipamPoolAllocations) {
        if (this.ipamPoolAllocations == null) {
            setIpamPoolAllocations(new com.amazonaws.internal.SdkInternalList<IpamPoolAllocation>(ipamPoolAllocations.length));
        }
        for (IpamPoolAllocation ele : ipamPoolAllocations) {
            this.ipamPoolAllocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPAM pool allocations you want information on.
     * </p>
     * 
     * @param ipamPoolAllocations
     *        The IPAM pool allocations you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamPoolAllocationsResult withIpamPoolAllocations(java.util.Collection<IpamPoolAllocation> ipamPoolAllocations) {
        setIpamPoolAllocations(ipamPoolAllocations);
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

    public GetIpamPoolAllocationsResult withNextToken(String nextToken) {
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
        if (getIpamPoolAllocations() != null)
            sb.append("IpamPoolAllocations: ").append(getIpamPoolAllocations()).append(",");
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

        if (obj instanceof GetIpamPoolAllocationsResult == false)
            return false;
        GetIpamPoolAllocationsResult other = (GetIpamPoolAllocationsResult) obj;
        if (other.getIpamPoolAllocations() == null ^ this.getIpamPoolAllocations() == null)
            return false;
        if (other.getIpamPoolAllocations() != null && other.getIpamPoolAllocations().equals(this.getIpamPoolAllocations()) == false)
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

        hashCode = prime * hashCode + ((getIpamPoolAllocations() == null) ? 0 : getIpamPoolAllocations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamPoolAllocationsResult clone() {
        try {
            return (GetIpamPoolAllocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
