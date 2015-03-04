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
 * 
 */
public class ListHapgsResult implements Serializable, Cloneable {

    /**
     * The list of high-availability partition groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgList;

    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHapgs</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     */
    private String nextToken;

    /**
     * The list of high-availability partition groups.
     *
     * @return The list of high-availability partition groups.
     */
    public java.util.List<String> getHapgList() {
        if (hapgList == null) {
              hapgList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hapgList.setAutoConstruct(true);
        }
        return hapgList;
    }
    
    /**
     * The list of high-availability partition groups.
     *
     * @param hapgList The list of high-availability partition groups.
     */
    public void setHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hapgList.size());
        hapgListCopy.addAll(hapgList);
        this.hapgList = hapgListCopy;
    }
    
    /**
     * The list of high-availability partition groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hapgList The list of high-availability partition groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHapgsResult withHapgList(String... hapgList) {
        if (getHapgList() == null) setHapgList(new java.util.ArrayList<String>(hapgList.length));
        for (String value : hapgList) {
            getHapgList().add(value);
        }
        return this;
    }
    
    /**
     * The list of high-availability partition groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hapgList The list of high-availability partition groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHapgsResult withHapgList(java.util.Collection<String> hapgList) {
        if (hapgList == null) {
            this.hapgList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hapgListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hapgList.size());
            hapgListCopy.addAll(hapgList);
            this.hapgList = hapgListCopy;
        }

        return this;
    }

    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHapgs</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @return If not null, more results are available. Pass this value to
     *         <a>ListHapgs</a> to retrieve the next set of items.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHapgs</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value to
     *         <a>ListHapgs</a> to retrieve the next set of items.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value to
     * <a>ListHapgs</a> to retrieve the next set of items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value to
     *         <a>ListHapgs</a> to retrieve the next set of items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHapgsResult withNextToken(String nextToken) {
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
        if (getHapgList() != null) sb.append("HapgList: " + getHapgList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHapgList() == null) ? 0 : getHapgList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListHapgsResult == false) return false;
        ListHapgsResult other = (ListHapgsResult)obj;
        
        if (other.getHapgList() == null ^ this.getHapgList() == null) return false;
        if (other.getHapgList() != null && other.getHapgList().equals(this.getHapgList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListHapgsResult clone() {
        try {
            return (ListHapgsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    