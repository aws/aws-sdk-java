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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPeeringsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * </p>
     */
    private java.util.List<Peering> peerings;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * </p>
     * 
     * @return Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     */

    public java.util.List<Peering> getPeerings() {
        return peerings;
    }

    /**
     * <p>
     * Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * </p>
     * 
     * @param peerings
     *        Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     */

    public void setPeerings(java.util.Collection<Peering> peerings) {
        if (peerings == null) {
            this.peerings = null;
            return;
        }

        this.peerings = new java.util.ArrayList<Peering>(peerings);
    }

    /**
     * <p>
     * Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPeerings(java.util.Collection)} or {@link #withPeerings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param peerings
     *        Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsResult withPeerings(Peering... peerings) {
        if (this.peerings == null) {
            setPeerings(new java.util.ArrayList<Peering>(peerings.length));
        }
        for (Peering ele : peerings) {
            this.peerings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * </p>
     * 
     * @param peerings
     *        Lists the transit gateway peerings for the <code>ListPeerings</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPeeringsResult withPeerings(java.util.Collection<Peering> peerings) {
        setPeerings(peerings);
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

    public ListPeeringsResult withNextToken(String nextToken) {
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
        if (getPeerings() != null)
            sb.append("Peerings: ").append(getPeerings()).append(",");
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

        if (obj instanceof ListPeeringsResult == false)
            return false;
        ListPeeringsResult other = (ListPeeringsResult) obj;
        if (other.getPeerings() == null ^ this.getPeerings() == null)
            return false;
        if (other.getPeerings() != null && other.getPeerings().equals(this.getPeerings()) == false)
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

        hashCode = prime * hashCode + ((getPeerings() == null) ? 0 : getPeerings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPeeringsResult clone() {
        try {
            return (ListPeeringsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
