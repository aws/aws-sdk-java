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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListIdentityProviders" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of identity provider objects.
     * </p>
     */
    private java.util.List<ProviderDescription> providers;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of identity provider objects.
     * </p>
     * 
     * @return A list of identity provider objects.
     */

    public java.util.List<ProviderDescription> getProviders() {
        return providers;
    }

    /**
     * <p>
     * A list of identity provider objects.
     * </p>
     * 
     * @param providers
     *        A list of identity provider objects.
     */

    public void setProviders(java.util.Collection<ProviderDescription> providers) {
        if (providers == null) {
            this.providers = null;
            return;
        }

        this.providers = new java.util.ArrayList<ProviderDescription>(providers);
    }

    /**
     * <p>
     * A list of identity provider objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProviders(java.util.Collection)} or {@link #withProviders(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param providers
     *        A list of identity provider objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withProviders(ProviderDescription... providers) {
        if (this.providers == null) {
            setProviders(new java.util.ArrayList<ProviderDescription>(providers.length));
        }
        for (ProviderDescription ele : providers) {
            this.providers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identity provider objects.
     * </p>
     * 
     * @param providers
     *        A list of identity provider objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withProviders(java.util.Collection<ProviderDescription> providers) {
        setProviders(providers);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withNextToken(String nextToken) {
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
        if (getProviders() != null)
            sb.append("Providers: ").append(getProviders()).append(",");
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

        if (obj instanceof ListIdentityProvidersResult == false)
            return false;
        ListIdentityProvidersResult other = (ListIdentityProvidersResult) obj;
        if (other.getProviders() == null ^ this.getProviders() == null)
            return false;
        if (other.getProviders() != null && other.getProviders().equals(this.getProviders()) == false)
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

        hashCode = prime * hashCode + ((getProviders() == null) ? 0 : getProviders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentityProvidersResult clone() {
        try {
            return (ListIdentityProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
