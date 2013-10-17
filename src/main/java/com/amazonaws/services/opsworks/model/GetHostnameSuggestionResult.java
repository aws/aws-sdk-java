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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>GetHostnameSuggestion</code> request.
 * </p>
 */
public class GetHostnameSuggestionResult implements Serializable {

    /**
     * The layer ID.
     */
    private String layerId;

    /**
     * The generated host name.
     */
    private String hostname;

    /**
     * The layer ID.
     *
     * @return The layer ID.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * The layer ID.
     *
     * @param layerId The layer ID.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * The layer ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId The layer ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetHostnameSuggestionResult withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * The generated host name.
     *
     * @return The generated host name.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The generated host name.
     *
     * @param hostname The generated host name.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The generated host name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The generated host name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetHostnameSuggestionResult withHostname(String hostname) {
        this.hostname = hostname;
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
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetHostnameSuggestionResult == false) return false;
        GetHostnameSuggestionResult other = (GetHostnameSuggestionResult)obj;
        
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        return true;
    }
    
}
    