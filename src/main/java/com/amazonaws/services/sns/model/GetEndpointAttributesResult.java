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
package com.amazonaws.services.sns.model;

import java.io.Serializable;


/**
 * <p>
 * Response from GetEndpointAttributes of the EndpointArn.
 * </p>
 */
public class GetEndpointAttributesResult implements Serializable {

    /**
     * Attributes include the following: <ul> <!-- Policy is not yet
     * supported. Will remove comments once it is available -->
     * <li><code>CustomUserData</code> -- arbitrary user data to associate
     * with the endpoint. SNS does not use this data. The data must be in
     * UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     * that enables/disables delivery to the endpoint. Message Processor will
     * set this to false when a notification service indicates to SNS that
     * the endpoint is invalid. Users can set it back to true, typically
     * after updating Token.</li> <!-- <li><code>Policy</code> access policy
     * controlling who can send messages to this endpoint .</li> -->
     * <li><code>Token</code> -- device token, also referred to as a
     * registration id, for an app and mobile device. This is returned from
     * the notification service when an app and mobile device are registered
     * with the notification service.</li> </ul>
     */
    private java.util.Map<String,String> attributes;

    /**
     * Attributes include the following: <ul> <!-- Policy is not yet
     * supported. Will remove comments once it is available -->
     * <li><code>CustomUserData</code> -- arbitrary user data to associate
     * with the endpoint. SNS does not use this data. The data must be in
     * UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     * that enables/disables delivery to the endpoint. Message Processor will
     * set this to false when a notification service indicates to SNS that
     * the endpoint is invalid. Users can set it back to true, typically
     * after updating Token.</li> <!-- <li><code>Policy</code> access policy
     * controlling who can send messages to this endpoint .</li> -->
     * <li><code>Token</code> -- device token, also referred to as a
     * registration id, for an app and mobile device. This is returned from
     * the notification service when an app and mobile device are registered
     * with the notification service.</li> </ul>
     *
     * @return Attributes include the following: <ul> <!-- Policy is not yet
     *         supported. Will remove comments once it is available -->
     *         <li><code>CustomUserData</code> -- arbitrary user data to associate
     *         with the endpoint. SNS does not use this data. The data must be in
     *         UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     *         that enables/disables delivery to the endpoint. Message Processor will
     *         set this to false when a notification service indicates to SNS that
     *         the endpoint is invalid. Users can set it back to true, typically
     *         after updating Token.</li> <!-- <li><code>Policy</code> access policy
     *         controlling who can send messages to this endpoint .</li> -->
     *         <li><code>Token</code> -- device token, also referred to as a
     *         registration id, for an app and mobile device. This is returned from
     *         the notification service when an app and mobile device are registered
     *         with the notification service.</li> </ul>
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * Attributes include the following: <ul> <!-- Policy is not yet
     * supported. Will remove comments once it is available -->
     * <li><code>CustomUserData</code> -- arbitrary user data to associate
     * with the endpoint. SNS does not use this data. The data must be in
     * UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     * that enables/disables delivery to the endpoint. Message Processor will
     * set this to false when a notification service indicates to SNS that
     * the endpoint is invalid. Users can set it back to true, typically
     * after updating Token.</li> <!-- <li><code>Policy</code> access policy
     * controlling who can send messages to this endpoint .</li> -->
     * <li><code>Token</code> -- device token, also referred to as a
     * registration id, for an app and mobile device. This is returned from
     * the notification service when an app and mobile device are registered
     * with the notification service.</li> </ul>
     *
     * @param attributes Attributes include the following: <ul> <!-- Policy is not yet
     *         supported. Will remove comments once it is available -->
     *         <li><code>CustomUserData</code> -- arbitrary user data to associate
     *         with the endpoint. SNS does not use this data. The data must be in
     *         UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     *         that enables/disables delivery to the endpoint. Message Processor will
     *         set this to false when a notification service indicates to SNS that
     *         the endpoint is invalid. Users can set it back to true, typically
     *         after updating Token.</li> <!-- <li><code>Policy</code> access policy
     *         controlling who can send messages to this endpoint .</li> -->
     *         <li><code>Token</code> -- device token, also referred to as a
     *         registration id, for an app and mobile device. This is returned from
     *         the notification service when an app and mobile device are registered
     *         with the notification service.</li> </ul>
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Attributes include the following: <ul> <!-- Policy is not yet
     * supported. Will remove comments once it is available -->
     * <li><code>CustomUserData</code> -- arbitrary user data to associate
     * with the endpoint. SNS does not use this data. The data must be in
     * UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     * that enables/disables delivery to the endpoint. Message Processor will
     * set this to false when a notification service indicates to SNS that
     * the endpoint is invalid. Users can set it back to true, typically
     * after updating Token.</li> <!-- <li><code>Policy</code> access policy
     * controlling who can send messages to this endpoint .</li> -->
     * <li><code>Token</code> -- device token, also referred to as a
     * registration id, for an app and mobile device. This is returned from
     * the notification service when an app and mobile device are registered
     * with the notification service.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes Attributes include the following: <ul> <!-- Policy is not yet
     *         supported. Will remove comments once it is available -->
     *         <li><code>CustomUserData</code> -- arbitrary user data to associate
     *         with the endpoint. SNS does not use this data. The data must be in
     *         UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     *         that enables/disables delivery to the endpoint. Message Processor will
     *         set this to false when a notification service indicates to SNS that
     *         the endpoint is invalid. Users can set it back to true, typically
     *         after updating Token.</li> <!-- <li><code>Policy</code> access policy
     *         controlling who can send messages to this endpoint .</li> -->
     *         <li><code>Token</code> -- device token, also referred to as a
     *         registration id, for an app and mobile device. This is returned from
     *         the notification service when an app and mobile device are registered
     *         with the notification service.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetEndpointAttributesResult withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Attributes include the following: <ul> <!-- Policy is not yet
     * supported. Will remove comments once it is available -->
     * <li><code>CustomUserData</code> -- arbitrary user data to associate
     * with the endpoint. SNS does not use this data. The data must be in
     * UTF-8 format and less than 2KB.</li> <li><code>Enabled</code> -- flag
     * that enables/disables delivery to the endpoint. Message Processor will
     * set this to false when a notification service indicates to SNS that
     * the endpoint is invalid. Users can set it back to true, typically
     * after updating Token.</li> <!-- <li><code>Policy</code> access policy
     * controlling who can send messages to this endpoint .</li> -->
     * <li><code>Token</code> -- device token, also referred to as a
     * registration id, for an app and mobile device. This is returned from
     * the notification service when an app and mobile device are registered
     * with the notification service.</li> </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public GetEndpointAttributesResult addAttributesEntry(String key, String value) {
		if (null == this.attributes) {
			this.attributes = new java.util.HashMap<String,String>();
		}
		if (this.attributes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.attributes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Attributes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetEndpointAttributesResult clearAttributesEntries() {
		this.attributes = null;
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
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEndpointAttributesResult == false) return false;
        GetEndpointAttributesResult other = (GetEndpointAttributesResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    