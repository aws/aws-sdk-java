/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a successful ListIdentityPools action.
 * </p>
 */
public class ListIdentityPoolsResult implements Serializable {

    /**
     * The identity pools returned by the ListIdentityPools action.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolShortDescription> identityPools;

    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
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
     * @param identityPools The identity pools returned by the ListIdentityPools action.
     */
    public void setIdentityPools(java.util.Collection<IdentityPoolShortDescription> identityPools) {
        if (identityPools == null) {
            this.identityPools = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolShortDescription> identityPoolsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolShortDescription>(identityPools.size());
        identityPoolsCopy.addAll(identityPools);
        this.identityPools = identityPoolsCopy;
    }
    
    /**
     * The identity pools returned by the ListIdentityPools action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identityPools The identity pools returned by the ListIdentityPools action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolsResult withIdentityPools(IdentityPoolShortDescription... identityPools) {
        if (getIdentityPools() == null) setIdentityPools(new java.util.ArrayList<IdentityPoolShortDescription>(identityPools.length));
        for (IdentityPoolShortDescription value : identityPools) {
            getIdentityPools().add(value);
        }
        return this;
    }
    
    /**
     * The identity pools returned by the ListIdentityPools action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identityPools The identity pools returned by the ListIdentityPools action.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolsResult withIdentityPools(java.util.Collection<IdentityPoolShortDescription> identityPools) {
        if (identityPools == null) {
            this.identityPools = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolShortDescription> identityPoolsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolShortDescription>(identityPools.size());
            identityPoolsCopy.addAll(identityPools);
            this.identityPools = identityPoolsCopy;
        }

        return this;
    }

    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A pagination token.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPools() != null) sb.append("IdentityPools: " + getIdentityPools() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentityPoolsResult == false) return false;
        ListIdentityPoolsResult other = (ListIdentityPoolsResult)obj;
        
        if (other.getIdentityPools() == null ^ this.getIdentityPools() == null) return false;
        if (other.getIdentityPools() != null && other.getIdentityPools().equals(this.getIdentityPools()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    