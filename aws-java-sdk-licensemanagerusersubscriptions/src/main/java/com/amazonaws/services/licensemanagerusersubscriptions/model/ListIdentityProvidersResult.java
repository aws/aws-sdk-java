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
package com.amazonaws.services.licensemanagerusersubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-user-subscriptions-2018-05-10/ListIdentityProviders"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata that describes the list identity providers operation.
     * </p>
     */
    private java.util.List<IdentityProviderSummary> identityProviderSummaries;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Metadata that describes the list identity providers operation.
     * </p>
     * 
     * @return Metadata that describes the list identity providers operation.
     */

    public java.util.List<IdentityProviderSummary> getIdentityProviderSummaries() {
        return identityProviderSummaries;
    }

    /**
     * <p>
     * Metadata that describes the list identity providers operation.
     * </p>
     * 
     * @param identityProviderSummaries
     *        Metadata that describes the list identity providers operation.
     */

    public void setIdentityProviderSummaries(java.util.Collection<IdentityProviderSummary> identityProviderSummaries) {
        if (identityProviderSummaries == null) {
            this.identityProviderSummaries = null;
            return;
        }

        this.identityProviderSummaries = new java.util.ArrayList<IdentityProviderSummary>(identityProviderSummaries);
    }

    /**
     * <p>
     * Metadata that describes the list identity providers operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityProviderSummaries(java.util.Collection)} or
     * {@link #withIdentityProviderSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param identityProviderSummaries
     *        Metadata that describes the list identity providers operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withIdentityProviderSummaries(IdentityProviderSummary... identityProviderSummaries) {
        if (this.identityProviderSummaries == null) {
            setIdentityProviderSummaries(new java.util.ArrayList<IdentityProviderSummary>(identityProviderSummaries.length));
        }
        for (IdentityProviderSummary ele : identityProviderSummaries) {
            this.identityProviderSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that describes the list identity providers operation.
     * </p>
     * 
     * @param identityProviderSummaries
     *        Metadata that describes the list identity providers operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityProvidersResult withIdentityProviderSummaries(java.util.Collection<IdentityProviderSummary> identityProviderSummaries) {
        setIdentityProviderSummaries(identityProviderSummaries);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
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
        if (getIdentityProviderSummaries() != null)
            sb.append("IdentityProviderSummaries: ").append(getIdentityProviderSummaries()).append(",");
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
        if (other.getIdentityProviderSummaries() == null ^ this.getIdentityProviderSummaries() == null)
            return false;
        if (other.getIdentityProviderSummaries() != null && other.getIdentityProviderSummaries().equals(this.getIdentityProviderSummaries()) == false)
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

        hashCode = prime * hashCode + ((getIdentityProviderSummaries() == null) ? 0 : getIdentityProviderSummaries().hashCode());
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
