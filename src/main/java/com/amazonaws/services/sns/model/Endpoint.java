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
 * Endpoint for mobile app and device.
 * </p>
 */
public class Endpoint implements Serializable {

    /**
     * EndpointArn for mobile app and device.
     */
    private String endpointArn;

    /**
     * Attributes for endpoint.
     */
    private java.util.Map<String,String> attributes;

    /**
     * EndpointArn for mobile app and device.
     *
     * @return EndpointArn for mobile app and device.
     */
    public String getEndpointArn() {
        return endpointArn;
    }
    
    /**
     * EndpointArn for mobile app and device.
     *
     * @param endpointArn EndpointArn for mobile app and device.
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }
    
    /**
     * EndpointArn for mobile app and device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpointArn EndpointArn for mobile app and device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Endpoint withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * Attributes for endpoint.
     *
     * @return Attributes for endpoint.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * Attributes for endpoint.
     *
     * @param attributes Attributes for endpoint.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Attributes for endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes Attributes for endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Endpoint withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Attributes for endpoint.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
	public Endpoint addAttributesEntry(String key, String value) {
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
	public Endpoint clearAttributesEntries() {
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
        if (getEndpointArn() != null) sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Endpoint == false) return false;
        Endpoint other = (Endpoint)obj;
        
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null) return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    