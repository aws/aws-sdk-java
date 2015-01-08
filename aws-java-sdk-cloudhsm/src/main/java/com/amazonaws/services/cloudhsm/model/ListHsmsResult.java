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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of the ListHsms action.
 * </p>
 */
public class ListHsmsResult implements Serializable {

    /**
     * The list of ARNs that identify the HSMs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmList;

    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHsms</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     */
    private String nextToken;

    /**
     * The list of ARNs that identify the HSMs.
     *
     * @return The list of ARNs that identify the HSMs.
     */
    public java.util.List<String> getHsmList() {
        if (hsmList == null) {
              hsmList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hsmList.setAutoConstruct(true);
        }
        return hsmList;
    }
    
    /**
     * The list of ARNs that identify the HSMs.
     *
     * @param hsmList The list of ARNs that identify the HSMs.
     */
    public void setHsmList(java.util.Collection<String> hsmList) {
        if (hsmList == null) {
            this.hsmList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmList.size());
        hsmListCopy.addAll(hsmList);
        this.hsmList = hsmListCopy;
    }
    
    /**
     * The list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmList The list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHsmsResult withHsmList(String... hsmList) {
        if (getHsmList() == null) setHsmList(new java.util.ArrayList<String>(hsmList.length));
        for (String value : hsmList) {
            getHsmList().add(value);
        }
        return this;
    }
    
    /**
     * The list of ARNs that identify the HSMs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmList The list of ARNs that identify the HSMs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHsmsResult withHsmList(java.util.Collection<String> hsmList) {
        if (hsmList == null) {
            this.hsmList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hsmListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hsmList.size());
            hsmListCopy.addAll(hsmList);
            this.hsmList = hsmListCopy;
        }

        return this;
    }

    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHsms</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @return If not null, more results are available. Pass this value to
     *         <a>ListHsms</a> to retrieve the next set of items.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHsms</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value to
     *         <a>ListHsms</a> to retrieve the next set of items.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHsms</a> to retrieve the next set of items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value to
     *         <a>ListHsms</a> to retrieve the next set of items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHsmsResult withNextToken(String nextToken) {
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
        if (getHsmList() != null) sb.append("HsmList: " + getHsmList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmList() == null) ? 0 : getHsmList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListHsmsResult == false) return false;
        ListHsmsResult other = (ListHsmsResult)obj;
        
        if (other.getHsmList() == null ^ this.getHsmList() == null) return false;
        if (other.getHsmList() != null && other.getHsmList().equals(this.getHsmList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    