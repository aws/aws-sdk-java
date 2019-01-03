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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about each of the domain entries in the user's account.
     * </p>
     */
    private java.util.List<Domain> domains;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about each of the domain entries in the user's account.
     * </p>
     * 
     * @return An array of key-value pairs containing information about each of the domain entries in the user's
     *         account.
     */

    public java.util.List<Domain> getDomains() {
        return domains;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about each of the domain entries in the user's account.
     * </p>
     * 
     * @param domains
     *        An array of key-value pairs containing information about each of the domain entries in the user's account.
     */

    public void setDomains(java.util.Collection<Domain> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<Domain>(domains);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about each of the domain entries in the user's account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        An array of key-value pairs containing information about each of the domain entries in the user's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainsResult withDomains(Domain... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<Domain>(domains.length));
        }
        for (Domain ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about each of the domain entries in the user's account.
     * </p>
     * 
     * @param domains
     *        An array of key-value pairs containing information about each of the domain entries in the user's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainsResult withDomains(java.util.Collection<Domain> domains) {
        setDomains(domains);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get active names request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get active names request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get active names request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get active names request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainsResult == false)
            return false;
        GetDomainsResult other = (GetDomainsResult) obj;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainsResult clone() {
        try {
            return (GetDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
