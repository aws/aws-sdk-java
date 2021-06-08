/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListIdentityProviderConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityProviderConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identity provider configurations for the cluster.
     * </p>
     */
    private java.util.List<IdentityProviderConfig> identityProviderConfigs;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results exceeded
     * the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identity provider configurations for the cluster.
     * </p>
     * 
     * @return The identity provider configurations for the cluster.
     */

    public java.util.List<IdentityProviderConfig> getIdentityProviderConfigs() {
        return identityProviderConfigs;
    }

    /**
     * <p>
     * The identity provider configurations for the cluster.
     * </p>
     * 
     * @param identityProviderConfigs
     *        The identity provider configurations for the cluster.
     */

    public void setIdentityProviderConfigs(java.util.Collection<IdentityProviderConfig> identityProviderConfigs) {
        if (identityProviderConfigs == null) {
            this.identityProviderConfigs = null;
            return;
        }

        this.identityProviderConfigs = new java.util.ArrayList<IdentityProviderConfig>(identityProviderConfigs);
    }

    /**
     * <p>
     * The identity provider configurations for the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityProviderConfigs(java.util.Collection)} or
     * {@link #withIdentityProviderConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityProviderConfigs
     *        The identity provider configurations for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProviderConfigsResult withIdentityProviderConfigs(IdentityProviderConfig... identityProviderConfigs) {
        if (this.identityProviderConfigs == null) {
            setIdentityProviderConfigs(new java.util.ArrayList<IdentityProviderConfig>(identityProviderConfigs.length));
        }
        for (IdentityProviderConfig ele : identityProviderConfigs) {
            this.identityProviderConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identity provider configurations for the cluster.
     * </p>
     * 
     * @param identityProviderConfigs
     *        The identity provider configurations for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProviderConfigsResult withIdentityProviderConfigs(java.util.Collection<IdentityProviderConfig> identityProviderConfigs) {
        setIdentityProviderConfigs(identityProviderConfigs);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results exceeded
     * the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results exceeded
     * the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results
     *         exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *         returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results exceeded
     * the value of that parameter. Pagination continues from the end of the previous results that returned the
     * <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated
     *        <code>ListIdentityProviderConfigsResponse</code> where <code>maxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProviderConfigsResult withNextToken(String nextToken) {
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
        if (getIdentityProviderConfigs() != null)
            sb.append("IdentityProviderConfigs: ").append(getIdentityProviderConfigs()).append(",");
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

        if (obj instanceof ListIdentityProviderConfigsResult == false)
            return false;
        ListIdentityProviderConfigsResult other = (ListIdentityProviderConfigsResult) obj;
        if (other.getIdentityProviderConfigs() == null ^ this.getIdentityProviderConfigs() == null)
            return false;
        if (other.getIdentityProviderConfigs() != null && other.getIdentityProviderConfigs().equals(this.getIdentityProviderConfigs()) == false)
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

        hashCode = prime * hashCode + ((getIdentityProviderConfigs() == null) ? 0 : getIdentityProviderConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentityProviderConfigsResult clone() {
        try {
            return (ListIdentityProviderConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
