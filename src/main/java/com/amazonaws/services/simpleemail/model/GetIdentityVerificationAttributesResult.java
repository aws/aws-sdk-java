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
 * Represents the verification attributes for a list of identities.
 * </p>
 */
public class GetIdentityVerificationAttributesResult implements Serializable {

    /**
     * A map of Identities to IdentityVerificationAttributes objects.
     */
    private java.util.Map<String,IdentityVerificationAttributes> verificationAttributes;

    /**
     * A map of Identities to IdentityVerificationAttributes objects.
     *
     * @return A map of Identities to IdentityVerificationAttributes objects.
     */
    public java.util.Map<String,IdentityVerificationAttributes> getVerificationAttributes() {
        
        if (verificationAttributes == null) {
            verificationAttributes = new java.util.HashMap<String,IdentityVerificationAttributes>();
        }
        return verificationAttributes;
    }
    
    /**
     * A map of Identities to IdentityVerificationAttributes objects.
     *
     * @param verificationAttributes A map of Identities to IdentityVerificationAttributes objects.
     */
    public void setVerificationAttributes(java.util.Map<String,IdentityVerificationAttributes> verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
    }
    
    /**
     * A map of Identities to IdentityVerificationAttributes objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param verificationAttributes A map of Identities to IdentityVerificationAttributes objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetIdentityVerificationAttributesResult withVerificationAttributes(java.util.Map<String,IdentityVerificationAttributes> verificationAttributes) {
        setVerificationAttributes(verificationAttributes);
        return this;
    }

    /**
     * A map of Identities to IdentityVerificationAttributes objects.
     * <p>
     * The method adds a new key-value pair into VerificationAttributes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into VerificationAttributes.
     * @param value The corresponding value of the entry to be added into VerificationAttributes.
     */
	public GetIdentityVerificationAttributesResult addVerificationAttributesEntry(String key, IdentityVerificationAttributes value) {
		if (null == this.verificationAttributes) {
			this.verificationAttributes = new java.util.HashMap<String,IdentityVerificationAttributes>();
		}
		if (this.verificationAttributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.verificationAttributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into VerificationAttributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetIdentityVerificationAttributesResult clearVerificationAttributesEntries() {
		this.verificationAttributes = null;
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
        if (getVerificationAttributes() != null) sb.append("VerificationAttributes: " + getVerificationAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityVerificationAttributesResult == false) return false;
        GetIdentityVerificationAttributesResult other = (GetIdentityVerificationAttributesResult)obj;
        
        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null) return false;
        if (other.getVerificationAttributes() != null && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false) return false; 
        return true;
    }
    
}
    