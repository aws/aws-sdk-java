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
 * Represents a list of all the DKIM attributes for the specified identity.
 * </p>
 */
public class GetIdentityDkimAttributesResult implements Serializable {

    /**
     * The DKIM attributes for an email address or a domain.
     */
    private java.util.Map<String,IdentityDkimAttributes> dkimAttributes;

    /**
     * The DKIM attributes for an email address or a domain.
     *
     * @return The DKIM attributes for an email address or a domain.
     */
    public java.util.Map<String,IdentityDkimAttributes> getDkimAttributes() {
        
        if (dkimAttributes == null) {
            dkimAttributes = new java.util.HashMap<String,IdentityDkimAttributes>();
        }
        return dkimAttributes;
    }
    
    /**
     * The DKIM attributes for an email address or a domain.
     *
     * @param dkimAttributes The DKIM attributes for an email address or a domain.
     */
    public void setDkimAttributes(java.util.Map<String,IdentityDkimAttributes> dkimAttributes) {
        this.dkimAttributes = dkimAttributes;
    }
    
    /**
     * The DKIM attributes for an email address or a domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dkimAttributes The DKIM attributes for an email address or a domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetIdentityDkimAttributesResult withDkimAttributes(java.util.Map<String,IdentityDkimAttributes> dkimAttributes) {
        setDkimAttributes(dkimAttributes);
        return this;
    }

    /**
     * The DKIM attributes for an email address or a domain.
     * <p>
     * The method adds a new key-value pair into DkimAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into DkimAttributes.
     * @param value The corresponding value of the entry to be added into DkimAttributes.
     */
	public GetIdentityDkimAttributesResult addDkimAttributesEntry(String key, IdentityDkimAttributes value) {
		if (null == this.dkimAttributes) {
			this.dkimAttributes = new java.util.HashMap<String,IdentityDkimAttributes>();
		}
		if (this.dkimAttributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.dkimAttributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into DkimAttributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetIdentityDkimAttributesResult clearDkimAttributesEntries() {
		this.dkimAttributes = null;
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
        if (getDkimAttributes() != null) sb.append("DkimAttributes: " + getDkimAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDkimAttributes() == null) ? 0 : getDkimAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityDkimAttributesResult == false) return false;
        GetIdentityDkimAttributesResult other = (GetIdentityDkimAttributesResult)obj;
        
        if (other.getDkimAttributes() == null ^ this.getDkimAttributes() == null) return false;
        if (other.getDkimAttributes() != null && other.getDkimAttributes().equals(this.getDkimAttributes()) == false) return false; 
        return true;
    }
    
}
    