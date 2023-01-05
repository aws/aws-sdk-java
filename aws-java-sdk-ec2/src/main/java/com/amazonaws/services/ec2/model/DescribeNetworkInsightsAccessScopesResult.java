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
public class DescribeNetworkInsightsAccessScopesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Network Access Scopes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScope> networkInsightsAccessScopes;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Network Access Scopes.
     * </p>
     * 
     * @return The Network Access Scopes.
     */

    public java.util.List<NetworkInsightsAccessScope> getNetworkInsightsAccessScopes() {
        if (networkInsightsAccessScopes == null) {
            networkInsightsAccessScopes = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScope>();
        }
        return networkInsightsAccessScopes;
    }

    /**
     * <p>
     * The Network Access Scopes.
     * </p>
     * 
     * @param networkInsightsAccessScopes
     *        The Network Access Scopes.
     */

    public void setNetworkInsightsAccessScopes(java.util.Collection<NetworkInsightsAccessScope> networkInsightsAccessScopes) {
        if (networkInsightsAccessScopes == null) {
            this.networkInsightsAccessScopes = null;
            return;
        }

        this.networkInsightsAccessScopes = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScope>(networkInsightsAccessScopes);
    }

    /**
     * <p>
     * The Network Access Scopes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsAccessScopes(java.util.Collection)} or
     * {@link #withNetworkInsightsAccessScopes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInsightsAccessScopes
     *        The Network Access Scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopesResult withNetworkInsightsAccessScopes(NetworkInsightsAccessScope... networkInsightsAccessScopes) {
        if (this.networkInsightsAccessScopes == null) {
            setNetworkInsightsAccessScopes(new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScope>(networkInsightsAccessScopes.length));
        }
        for (NetworkInsightsAccessScope ele : networkInsightsAccessScopes) {
            this.networkInsightsAccessScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Network Access Scopes.
     * </p>
     * 
     * @param networkInsightsAccessScopes
     *        The Network Access Scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopesResult withNetworkInsightsAccessScopes(
            java.util.Collection<NetworkInsightsAccessScope> networkInsightsAccessScopes) {
        setNetworkInsightsAccessScopes(networkInsightsAccessScopes);
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

    public DescribeNetworkInsightsAccessScopesResult withNextToken(String nextToken) {
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
        if (getNetworkInsightsAccessScopes() != null)
            sb.append("NetworkInsightsAccessScopes: ").append(getNetworkInsightsAccessScopes()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsAccessScopesResult == false)
            return false;
        DescribeNetworkInsightsAccessScopesResult other = (DescribeNetworkInsightsAccessScopesResult) obj;
        if (other.getNetworkInsightsAccessScopes() == null ^ this.getNetworkInsightsAccessScopes() == null)
            return false;
        if (other.getNetworkInsightsAccessScopes() != null && other.getNetworkInsightsAccessScopes().equals(this.getNetworkInsightsAccessScopes()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopes() == null) ? 0 : getNetworkInsightsAccessScopes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsAccessScopesResult clone() {
        try {
            return (DescribeNetworkInsightsAccessScopesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
