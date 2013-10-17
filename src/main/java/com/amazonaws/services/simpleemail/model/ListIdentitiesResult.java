/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a list of all verified identities for the AWS Account.
 * </p>
 */
public class ListIdentitiesResult implements Serializable {

    /**
     * A list of identities.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> identities;

    /**
     * The token used for pagination.
     */
    private String nextToken;

    /**
     * A list of identities.
     *
     * @return A list of identities.
     */
    public java.util.List<String> getIdentities() {
        if (identities == null) {
              identities = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              identities.setAutoConstruct(true);
        }
        return identities;
    }
    
    /**
     * A list of identities.
     *
     * @param identities A list of identities.
     */
    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(identities.size());
        identitiesCopy.addAll(identities);
        this.identities = identitiesCopy;
    }
    
    /**
     * A list of identities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities A list of identities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListIdentitiesResult withIdentities(String... identities) {
        if (getIdentities() == null) setIdentities(new java.util.ArrayList<String>(identities.length));
        for (String value : identities) {
            getIdentities().add(value);
        }
        return this;
    }
    
    /**
     * A list of identities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities A list of identities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListIdentitiesResult withIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(identities.size());
            identitiesCopy.addAll(identities);
            this.identities = identitiesCopy;
        }

        return this;
    }

    /**
     * The token used for pagination.
     *
     * @return The token used for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token used for pagination.
     *
     * @param nextToken The token used for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token used for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token used for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListIdentitiesResult withNextToken(String nextToken) {
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
        if (getIdentities() != null) sb.append("Identities: " + getIdentities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentitiesResult == false) return false;
        ListIdentitiesResult other = (ListIdentitiesResult)obj;
        
        if (other.getIdentities() == null ^ this.getIdentities() == null) return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    