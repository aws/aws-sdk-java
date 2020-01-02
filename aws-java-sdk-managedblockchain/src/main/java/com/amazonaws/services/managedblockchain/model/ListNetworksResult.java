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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ListNetworks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * </p>
     */
    private java.util.List<NetworkSummary> networks;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * </p>
     * 
     * @return An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     */

    public java.util.List<NetworkSummary> getNetworks() {
        return networks;
    }

    /**
     * <p>
     * An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * </p>
     * 
     * @param networks
     *        An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     */

    public void setNetworks(java.util.Collection<NetworkSummary> networks) {
        if (networks == null) {
            this.networks = null;
            return;
        }

        this.networks = new java.util.ArrayList<NetworkSummary>(networks);
    }

    /**
     * <p>
     * An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworks(java.util.Collection)} or {@link #withNetworks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param networks
     *        An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksResult withNetworks(NetworkSummary... networks) {
        if (this.networks == null) {
            setNetworks(new java.util.ArrayList<NetworkSummary>(networks.length));
        }
        for (NetworkSummary ele : networks) {
            this.networks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * </p>
     * 
     * @param networks
     *        An array of <code>NetworkSummary</code> objects that contain configuration properties for each network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksResult withNetworks(java.util.Collection<NetworkSummary> networks) {
        setNetworks(networks);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworksResult withNextToken(String nextToken) {
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
        if (getNetworks() != null)
            sb.append("Networks: ").append(getNetworks()).append(",");
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

        if (obj instanceof ListNetworksResult == false)
            return false;
        ListNetworksResult other = (ListNetworksResult) obj;
        if (other.getNetworks() == null ^ this.getNetworks() == null)
            return false;
        if (other.getNetworks() != null && other.getNetworks().equals(this.getNetworks()) == false)
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

        hashCode = prime * hashCode + ((getNetworks() == null) ? 0 : getNetworks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworksResult clone() {
        try {
            return (ListNetworksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
