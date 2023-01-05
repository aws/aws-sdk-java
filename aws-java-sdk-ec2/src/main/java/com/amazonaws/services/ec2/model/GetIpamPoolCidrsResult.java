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
public class GetIpamPoolCidrsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the CIDRs provisioned to an IPAM pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamPoolCidr> ipamPoolCidrs;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the CIDRs provisioned to an IPAM pool.
     * </p>
     * 
     * @return Information about the CIDRs provisioned to an IPAM pool.
     */

    public java.util.List<IpamPoolCidr> getIpamPoolCidrs() {
        if (ipamPoolCidrs == null) {
            ipamPoolCidrs = new com.amazonaws.internal.SdkInternalList<IpamPoolCidr>();
        }
        return ipamPoolCidrs;
    }

    /**
     * <p>
     * Information about the CIDRs provisioned to an IPAM pool.
     * </p>
     * 
     * @param ipamPoolCidrs
     *        Information about the CIDRs provisioned to an IPAM pool.
     */

    public void setIpamPoolCidrs(java.util.Collection<IpamPoolCidr> ipamPoolCidrs) {
        if (ipamPoolCidrs == null) {
            this.ipamPoolCidrs = null;
            return;
        }

        this.ipamPoolCidrs = new com.amazonaws.internal.SdkInternalList<IpamPoolCidr>(ipamPoolCidrs);
    }

    /**
     * <p>
     * Information about the CIDRs provisioned to an IPAM pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamPoolCidrs(java.util.Collection)} or {@link #withIpamPoolCidrs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipamPoolCidrs
     *        Information about the CIDRs provisioned to an IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamPoolCidrsResult withIpamPoolCidrs(IpamPoolCidr... ipamPoolCidrs) {
        if (this.ipamPoolCidrs == null) {
            setIpamPoolCidrs(new com.amazonaws.internal.SdkInternalList<IpamPoolCidr>(ipamPoolCidrs.length));
        }
        for (IpamPoolCidr ele : ipamPoolCidrs) {
            this.ipamPoolCidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the CIDRs provisioned to an IPAM pool.
     * </p>
     * 
     * @param ipamPoolCidrs
     *        Information about the CIDRs provisioned to an IPAM pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamPoolCidrsResult withIpamPoolCidrs(java.util.Collection<IpamPoolCidr> ipamPoolCidrs) {
        setIpamPoolCidrs(ipamPoolCidrs);
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

    public GetIpamPoolCidrsResult withNextToken(String nextToken) {
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
        if (getIpamPoolCidrs() != null)
            sb.append("IpamPoolCidrs: ").append(getIpamPoolCidrs()).append(",");
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

        if (obj instanceof GetIpamPoolCidrsResult == false)
            return false;
        GetIpamPoolCidrsResult other = (GetIpamPoolCidrsResult) obj;
        if (other.getIpamPoolCidrs() == null ^ this.getIpamPoolCidrs() == null)
            return false;
        if (other.getIpamPoolCidrs() != null && other.getIpamPoolCidrs().equals(this.getIpamPoolCidrs()) == false)
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

        hashCode = prime * hashCode + ((getIpamPoolCidrs() == null) ? 0 : getIpamPoolCidrs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamPoolCidrsResult clone() {
        try {
            return (GetIpamPoolCidrsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
