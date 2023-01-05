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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkSites" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkSitesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the network sites.
     * </p>
     */
    private java.util.List<NetworkSite> networkSites;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the network sites.
     * </p>
     * 
     * @return Information about the network sites.
     */

    public java.util.List<NetworkSite> getNetworkSites() {
        return networkSites;
    }

    /**
     * <p>
     * Information about the network sites.
     * </p>
     * 
     * @param networkSites
     *        Information about the network sites.
     */

    public void setNetworkSites(java.util.Collection<NetworkSite> networkSites) {
        if (networkSites == null) {
            this.networkSites = null;
            return;
        }

        this.networkSites = new java.util.ArrayList<NetworkSite>(networkSites);
    }

    /**
     * <p>
     * Information about the network sites.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkSites(java.util.Collection)} or {@link #withNetworkSites(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param networkSites
     *        Information about the network sites.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkSitesResult withNetworkSites(NetworkSite... networkSites) {
        if (this.networkSites == null) {
            setNetworkSites(new java.util.ArrayList<NetworkSite>(networkSites.length));
        }
        for (NetworkSite ele : networkSites) {
            this.networkSites.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the network sites.
     * </p>
     * 
     * @param networkSites
     *        Information about the network sites.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkSitesResult withNetworkSites(java.util.Collection<NetworkSite> networkSites) {
        setNetworkSites(networkSites);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkSitesResult withNextToken(String nextToken) {
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
        if (getNetworkSites() != null)
            sb.append("NetworkSites: ").append(getNetworkSites()).append(",");
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

        if (obj instanceof ListNetworkSitesResult == false)
            return false;
        ListNetworkSitesResult other = (ListNetworkSitesResult) obj;
        if (other.getNetworkSites() == null ^ this.getNetworkSites() == null)
            return false;
        if (other.getNetworkSites() != null && other.getNetworkSites().equals(this.getNetworkSites()) == false)
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

        hashCode = prime * hashCode + ((getNetworkSites() == null) ? 0 : getNetworkSites().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkSitesResult clone() {
        try {
            return (ListNetworkSitesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
