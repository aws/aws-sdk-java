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
 * Describes whether an identity has a bounce topic or complaint topic set, or feedback forwarding enabled.
 * </p>
 */
public class GetIdentityNotificationAttributesResult implements Serializable {

    /**
     * A map of Identity to IdentityNotificationAttributes.
     */
    private java.util.Map<String,IdentityNotificationAttributes> notificationAttributes;

    /**
     * A map of Identity to IdentityNotificationAttributes.
     *
     * @return A map of Identity to IdentityNotificationAttributes.
     */
    public java.util.Map<String,IdentityNotificationAttributes> getNotificationAttributes() {
        
        if (notificationAttributes == null) {
            notificationAttributes = new java.util.HashMap<String,IdentityNotificationAttributes>();
        }
        return notificationAttributes;
    }
    
    /**
     * A map of Identity to IdentityNotificationAttributes.
     *
     * @param notificationAttributes A map of Identity to IdentityNotificationAttributes.
     */
    public void setNotificationAttributes(java.util.Map<String,IdentityNotificationAttributes> notificationAttributes) {
        this.notificationAttributes = notificationAttributes;
    }
    
    /**
     * A map of Identity to IdentityNotificationAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationAttributes A map of Identity to IdentityNotificationAttributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetIdentityNotificationAttributesResult withNotificationAttributes(java.util.Map<String,IdentityNotificationAttributes> notificationAttributes) {
        setNotificationAttributes(notificationAttributes);
        return this;
    }

    /**
     * A map of Identity to IdentityNotificationAttributes.
     * <p>
     * The method adds a new key-value pair into NotificationAttributes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into NotificationAttributes.
     * @param value The corresponding value of the entry to be added into NotificationAttributes.
     */
	public GetIdentityNotificationAttributesResult addNotificationAttributesEntry(String key, IdentityNotificationAttributes value) {
		if (null == this.notificationAttributes) {
			this.notificationAttributes = new java.util.HashMap<String,IdentityNotificationAttributes>();
		}
		if (this.notificationAttributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.notificationAttributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into NotificationAttributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetIdentityNotificationAttributesResult clearNotificationAttributesEntries() {
		this.notificationAttributes = null;
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
        if (getNotificationAttributes() != null) sb.append("NotificationAttributes: " + getNotificationAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNotificationAttributes() == null) ? 0 : getNotificationAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityNotificationAttributesResult == false) return false;
        GetIdentityNotificationAttributesResult other = (GetIdentityNotificationAttributesResult)obj;
        
        if (other.getNotificationAttributes() == null ^ this.getNotificationAttributes() == null) return false;
        if (other.getNotificationAttributes() != null && other.getNotificationAttributes().equals(this.getNotificationAttributes()) == false) return false; 
        return true;
    }
    
}
    