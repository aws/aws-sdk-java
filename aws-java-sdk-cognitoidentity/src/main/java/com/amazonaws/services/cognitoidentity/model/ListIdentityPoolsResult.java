/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * The result of a successful ListIdentityPools action.
 */
public class ListIdentityPoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The identity pools returned by the ListIdentityPools action. */
    private java.util.List<IdentityPoolShortDescription> identityPools;
    /** A pagination token. */
    private String nextToken;

    /**
     * The identity pools returned by the ListIdentityPools action.
     * 
     * @return The identity pools returned by the ListIdentityPools action.
     */

    public java.util.List<IdentityPoolShortDescription> getIdentityPools() {
        return identityPools;
    }

    /**
     * The identity pools returned by the ListIdentityPools action.
     * 
     * @param identityPools
     *        The identity pools returned by the ListIdentityPools action.
     */

    public void setIdentityPools(java.util.Collection<IdentityPoolShortDescription> identityPools) {
        if (identityPools == null) {
            this.identityPools = null;
            return;
        }

        this.identityPools = new java.util.ArrayList<IdentityPoolShortDescription>(identityPools);
    }

    /**
     * The identity pools returned by the ListIdentityPools action.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentityPools(java.util.Collection)} or {@link #withIdentityPools(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param identityPools
     *        The identity pools returned by the ListIdentityPools action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolsResult withIdentityPools(IdentityPoolShortDescription... identityPools) {
        if (this.identityPools == null) {
            setIdentityPools(new java.util.ArrayList<IdentityPoolShortDescription>(identityPools.length));
        }
        for (IdentityPoolShortDescription ele : identityPools) {
            this.identityPools.add(ele);
        }
        return this;
    }

    /**
     * The identity pools returned by the ListIdentityPools action.
     * 
     * @param identityPools
     *        The identity pools returned by the ListIdentityPools action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolsResult withIdentityPools(java.util.Collection<IdentityPoolShortDescription> identityPools) {
        setIdentityPools(identityPools);
        return this;
    }

    /**
     * A pagination token.
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token.
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token.
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIdentityPoolsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPools() != null)
            sb.append("IdentityPools: " + getIdentityPools() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentityPoolsResult == false)
            return false;
        ListIdentityPoolsResult other = (ListIdentityPoolsResult) obj;
        if (other.getIdentityPools() == null ^ this.getIdentityPools() == null)
            return false;
        if (other.getIdentityPools() != null && other.getIdentityPools().equals(this.getIdentityPools()) == false)
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

        hashCode = prime * hashCode + ((getIdentityPools() == null) ? 0 : getIdentityPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIdentityPoolsResult clone() {
        try {
            return (ListIdentityPoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
