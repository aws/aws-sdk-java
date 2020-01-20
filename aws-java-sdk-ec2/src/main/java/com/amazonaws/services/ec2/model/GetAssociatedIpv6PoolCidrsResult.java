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
public class GetAssociatedIpv6PoolCidrsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IPv6 CIDR block associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Ipv6CidrAssociation> ipv6CidrAssociations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the IPv6 CIDR block associations.
     * </p>
     * 
     * @return Information about the IPv6 CIDR block associations.
     */

    public java.util.List<Ipv6CidrAssociation> getIpv6CidrAssociations() {
        if (ipv6CidrAssociations == null) {
            ipv6CidrAssociations = new com.amazonaws.internal.SdkInternalList<Ipv6CidrAssociation>();
        }
        return ipv6CidrAssociations;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block associations.
     * </p>
     * 
     * @param ipv6CidrAssociations
     *        Information about the IPv6 CIDR block associations.
     */

    public void setIpv6CidrAssociations(java.util.Collection<Ipv6CidrAssociation> ipv6CidrAssociations) {
        if (ipv6CidrAssociations == null) {
            this.ipv6CidrAssociations = null;
            return;
        }

        this.ipv6CidrAssociations = new com.amazonaws.internal.SdkInternalList<Ipv6CidrAssociation>(ipv6CidrAssociations);
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6CidrAssociations(java.util.Collection)} or {@link #withIpv6CidrAssociations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ipv6CidrAssociations
     *        Information about the IPv6 CIDR block associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedIpv6PoolCidrsResult withIpv6CidrAssociations(Ipv6CidrAssociation... ipv6CidrAssociations) {
        if (this.ipv6CidrAssociations == null) {
            setIpv6CidrAssociations(new com.amazonaws.internal.SdkInternalList<Ipv6CidrAssociation>(ipv6CidrAssociations.length));
        }
        for (Ipv6CidrAssociation ele : ipv6CidrAssociations) {
            this.ipv6CidrAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR block associations.
     * </p>
     * 
     * @param ipv6CidrAssociations
     *        Information about the IPv6 CIDR block associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedIpv6PoolCidrsResult withIpv6CidrAssociations(java.util.Collection<Ipv6CidrAssociation> ipv6CidrAssociations) {
        setIpv6CidrAssociations(ipv6CidrAssociations);
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

    public GetAssociatedIpv6PoolCidrsResult withNextToken(String nextToken) {
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
        if (getIpv6CidrAssociations() != null)
            sb.append("Ipv6CidrAssociations: ").append(getIpv6CidrAssociations()).append(",");
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

        if (obj instanceof GetAssociatedIpv6PoolCidrsResult == false)
            return false;
        GetAssociatedIpv6PoolCidrsResult other = (GetAssociatedIpv6PoolCidrsResult) obj;
        if (other.getIpv6CidrAssociations() == null ^ this.getIpv6CidrAssociations() == null)
            return false;
        if (other.getIpv6CidrAssociations() != null && other.getIpv6CidrAssociations().equals(this.getIpv6CidrAssociations()) == false)
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

        hashCode = prime * hashCode + ((getIpv6CidrAssociations() == null) ? 0 : getIpv6CidrAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedIpv6PoolCidrsResult clone() {
        try {
            return (GetAssociatedIpv6PoolCidrsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
