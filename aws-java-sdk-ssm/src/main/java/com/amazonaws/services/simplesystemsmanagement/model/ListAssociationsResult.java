/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAssociationsResult implements Serializable {

    /**
     * The associations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Association> associations;

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * The associations.
     *
     * @return The associations.
     */
    public java.util.List<Association> getAssociations() {
        if (associations == null) {
              associations = new com.amazonaws.internal.ListWithAutoConstructFlag<Association>();
              associations.setAutoConstruct(true);
        }
        return associations;
    }
    
    /**
     * The associations.
     *
     * @param associations The associations.
     */
    public void setAssociations(java.util.Collection<Association> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Association> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Association>(associations.size());
        associationsCopy.addAll(associations);
        this.associations = associationsCopy;
    }
    
    /**
     * The associations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The associations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAssociationsResult withAssociations(Association... associations) {
        if (getAssociations() == null) setAssociations(new java.util.ArrayList<Association>(associations.length));
        for (Association value : associations) {
            getAssociations().add(value);
        }
        return this;
    }
    
    /**
     * The associations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The associations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAssociationsResult withAssociations(java.util.Collection<Association> associations) {
        if (associations == null) {
            this.associations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Association> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Association>(associations.size());
            associationsCopy.addAll(associations);
            this.associations = associationsCopy;
        }

        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @return The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use when requesting the next set of items. If there are
     * no additional items to return, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use when requesting the next set of items. If there are
     *         no additional items to return, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAssociationsResult withNextToken(String nextToken) {
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
        if (getAssociations() != null) sb.append("Associations: " + getAssociations() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAssociationsResult == false) return false;
        ListAssociationsResult other = (ListAssociationsResult)obj;
        
        if (other.getAssociations() == null ^ this.getAssociations() == null) return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    