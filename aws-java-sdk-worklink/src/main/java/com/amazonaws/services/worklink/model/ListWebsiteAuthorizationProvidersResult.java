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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListWebsiteAuthorizationProviders"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWebsiteAuthorizationProvidersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The website authorization providers.
     * </p>
     */
    private java.util.List<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * 
     * @return The website authorization providers.
     */

    public java.util.List<WebsiteAuthorizationProviderSummary> getWebsiteAuthorizationProviders() {
        return websiteAuthorizationProviders;
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * 
     * @param websiteAuthorizationProviders
     *        The website authorization providers.
     */

    public void setWebsiteAuthorizationProviders(java.util.Collection<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders) {
        if (websiteAuthorizationProviders == null) {
            this.websiteAuthorizationProviders = null;
            return;
        }

        this.websiteAuthorizationProviders = new java.util.ArrayList<WebsiteAuthorizationProviderSummary>(websiteAuthorizationProviders);
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWebsiteAuthorizationProviders(java.util.Collection)} or
     * {@link #withWebsiteAuthorizationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param websiteAuthorizationProviders
     *        The website authorization providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebsiteAuthorizationProvidersResult withWebsiteAuthorizationProviders(WebsiteAuthorizationProviderSummary... websiteAuthorizationProviders) {
        if (this.websiteAuthorizationProviders == null) {
            setWebsiteAuthorizationProviders(new java.util.ArrayList<WebsiteAuthorizationProviderSummary>(websiteAuthorizationProviders.length));
        }
        for (WebsiteAuthorizationProviderSummary ele : websiteAuthorizationProviders) {
            this.websiteAuthorizationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The website authorization providers.
     * </p>
     * 
     * @param websiteAuthorizationProviders
     *        The website authorization providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebsiteAuthorizationProvidersResult withWebsiteAuthorizationProviders(
            java.util.Collection<WebsiteAuthorizationProviderSummary> websiteAuthorizationProviders) {
        setWebsiteAuthorizationProviders(websiteAuthorizationProviders);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If this value is
     *         null, it retrieves the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it
     * retrieves the first page.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If this value is
     *        null, it retrieves the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebsiteAuthorizationProvidersResult withNextToken(String nextToken) {
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
        if (getWebsiteAuthorizationProviders() != null)
            sb.append("WebsiteAuthorizationProviders: ").append(getWebsiteAuthorizationProviders()).append(",");
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

        if (obj instanceof ListWebsiteAuthorizationProvidersResult == false)
            return false;
        ListWebsiteAuthorizationProvidersResult other = (ListWebsiteAuthorizationProvidersResult) obj;
        if (other.getWebsiteAuthorizationProviders() == null ^ this.getWebsiteAuthorizationProviders() == null)
            return false;
        if (other.getWebsiteAuthorizationProviders() != null
                && other.getWebsiteAuthorizationProviders().equals(this.getWebsiteAuthorizationProviders()) == false)
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

        hashCode = prime * hashCode + ((getWebsiteAuthorizationProviders() == null) ? 0 : getWebsiteAuthorizationProviders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWebsiteAuthorizationProvidersResult clone() {
        try {
            return (ListWebsiteAuthorizationProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
