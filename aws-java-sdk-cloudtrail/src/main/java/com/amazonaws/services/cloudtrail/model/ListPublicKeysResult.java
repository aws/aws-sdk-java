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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise,
 * returns an error.
 * </p>
 */
public class ListPublicKeysResult implements Serializable, Cloneable {

    /**
     * Contains an array of PublicKey objects. <note>The returned public keys
     * may have validity time ranges that overlap.</note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey> publicKeyList;

    /**
     * Reserved for future use.
     */
    private String nextToken;

    /**
     * Contains an array of PublicKey objects. <note>The returned public keys
     * may have validity time ranges that overlap.</note>
     *
     * @return Contains an array of PublicKey objects. <note>The returned public keys
     *         may have validity time ranges that overlap.</note>
     */
    public java.util.List<PublicKey> getPublicKeyList() {
        if (publicKeyList == null) {
              publicKeyList = new com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey>();
              publicKeyList.setAutoConstruct(true);
        }
        return publicKeyList;
    }
    
    /**
     * Contains an array of PublicKey objects. <note>The returned public keys
     * may have validity time ranges that overlap.</note>
     *
     * @param publicKeyList Contains an array of PublicKey objects. <note>The returned public keys
     *         may have validity time ranges that overlap.</note>
     */
    public void setPublicKeyList(java.util.Collection<PublicKey> publicKeyList) {
        if (publicKeyList == null) {
            this.publicKeyList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey> publicKeyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey>(publicKeyList.size());
        publicKeyListCopy.addAll(publicKeyList);
        this.publicKeyList = publicKeyListCopy;
    }
    
    /**
     * Contains an array of PublicKey objects. <note>The returned public keys
     * may have validity time ranges that overlap.</note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPublicKeyList(java.util.Collection)} or {@link
     * #withPublicKeyList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicKeyList Contains an array of PublicKey objects. <note>The returned public keys
     *         may have validity time ranges that overlap.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysResult withPublicKeyList(PublicKey... publicKeyList) {
        if (getPublicKeyList() == null) setPublicKeyList(new java.util.ArrayList<PublicKey>(publicKeyList.length));
        for (PublicKey value : publicKeyList) {
            getPublicKeyList().add(value);
        }
        return this;
    }
    
    /**
     * Contains an array of PublicKey objects. <note>The returned public keys
     * may have validity time ranges that overlap.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicKeyList Contains an array of PublicKey objects. <note>The returned public keys
     *         may have validity time ranges that overlap.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysResult withPublicKeyList(java.util.Collection<PublicKey> publicKeyList) {
        if (publicKeyList == null) {
            this.publicKeyList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey> publicKeyListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PublicKey>(publicKeyList.size());
            publicKeyListCopy.addAll(publicKeyList);
            this.publicKeyList = publicKeyListCopy;
        }

        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Reserved for future use.
     *
     * @param nextToken Reserved for future use.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPublicKeysResult withNextToken(String nextToken) {
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
        if (getPublicKeyList() != null) sb.append("PublicKeyList: " + getPublicKeyList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicKeyList() == null) ? 0 : getPublicKeyList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPublicKeysResult == false) return false;
        ListPublicKeysResult other = (ListPublicKeysResult)obj;
        
        if (other.getPublicKeyList() == null ^ this.getPublicKeyList() == null) return false;
        if (other.getPublicKeyList() != null && other.getPublicKeyList().equals(this.getPublicKeyList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPublicKeysResult clone() {
        try {
            return (ListPublicKeysResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    