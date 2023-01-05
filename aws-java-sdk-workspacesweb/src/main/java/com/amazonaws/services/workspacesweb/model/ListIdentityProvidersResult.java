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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIdentityProviders"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identity providers.
     * </p>
     */
    private java.util.List<IdentityProviderSummary> identityProviders;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identity providers.
     * </p>
     * 
     * @return The identity providers.
     */

    public java.util.List<IdentityProviderSummary> getIdentityProviders() {
        return identityProviders;
    }

    /**
     * <p>
     * The identity providers.
     * </p>
     * 
     * @param identityProviders
     *        The identity providers.
     */

    public void setIdentityProviders(java.util.Collection<IdentityProviderSummary> identityProviders) {
        if (identityProviders == null) {
            this.identityProviders = null;
            return;
        }

        this.identityProviders = new java.util.ArrayList<IdentityProviderSummary>(identityProviders);
    }

    /**
     * <p>
     * The identity providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityProviders(java.util.Collection)} or {@link #withIdentityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param identityProviders
     *        The identity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withIdentityProviders(IdentityProviderSummary... identityProviders) {
        if (this.identityProviders == null) {
            setIdentityProviders(new java.util.ArrayList<IdentityProviderSummary>(identityProviders.length));
        }
        for (IdentityProviderSummary ele : identityProviders) {
            this.identityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identity providers.
     * </p>
     * 
     * @param identityProviders
     *        The identity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withIdentityProviders(java.util.Collection<IdentityProviderSummary> identityProviders) {
        setIdentityProviders(identityProviders);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
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
        if (getIdentityProviders() != null)
            sb.append("IdentityProviders: ").append(getIdentityProviders()).append(",");
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
        if (other.getIdentityProviders() == null ^ this.getIdentityProviders() == null)
            return false;
        if (other.getIdentityProviders() != null && other.getIdentityProviders().equals(this.getIdentityProviders()) == false)
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

        hashCode = prime * hashCode + ((getIdentityProviders() == null) ? 0 : getIdentityProviders().hashCode());
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
