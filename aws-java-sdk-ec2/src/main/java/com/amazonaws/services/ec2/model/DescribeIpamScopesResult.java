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
public class DescribeIpamScopesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The scopes you want information on.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamScope> ipamScopes;

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

    public DescribeIpamScopesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The scopes you want information on.
     * </p>
     * 
     * @return The scopes you want information on.
     */

    public java.util.List<IpamScope> getIpamScopes() {
        if (ipamScopes == null) {
            ipamScopes = new com.amazonaws.internal.SdkInternalList<IpamScope>();
        }
        return ipamScopes;
    }

    /**
     * <p>
     * The scopes you want information on.
     * </p>
     * 
     * @param ipamScopes
     *        The scopes you want information on.
     */

    public void setIpamScopes(java.util.Collection<IpamScope> ipamScopes) {
        if (ipamScopes == null) {
            this.ipamScopes = null;
            return;
        }

        this.ipamScopes = new com.amazonaws.internal.SdkInternalList<IpamScope>(ipamScopes);
    }

    /**
     * <p>
     * The scopes you want information on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamScopes(java.util.Collection)} or {@link #withIpamScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipamScopes
     *        The scopes you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesResult withIpamScopes(IpamScope... ipamScopes) {
        if (this.ipamScopes == null) {
            setIpamScopes(new com.amazonaws.internal.SdkInternalList<IpamScope>(ipamScopes.length));
        }
        for (IpamScope ele : ipamScopes) {
            this.ipamScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scopes you want information on.
     * </p>
     * 
     * @param ipamScopes
     *        The scopes you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesResult withIpamScopes(java.util.Collection<IpamScope> ipamScopes) {
        setIpamScopes(ipamScopes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIpamScopes() != null)
            sb.append("IpamScopes: ").append(getIpamScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIpamScopesResult == false)
            return false;
        DescribeIpamScopesResult other = (DescribeIpamScopesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIpamScopes() == null ^ this.getIpamScopes() == null)
            return false;
        if (other.getIpamScopes() != null && other.getIpamScopes().equals(this.getIpamScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIpamScopes() == null) ? 0 : getIpamScopes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamScopesResult clone() {
        try {
            return (DescribeIpamScopesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
