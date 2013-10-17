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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * Represents the information required for client programs to connect to a cache node.
 * </p>
 */
public class Endpoint implements Serializable {

    /**
     * The DNS hostname of the cache node.
     */
    private String address;

    /**
     * The port number that the cache engine is listening on.
     */
    private Integer port;

    /**
     * Default constructor for a new Endpoint object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Endpoint() {}
    
    /**
     * The DNS hostname of the cache node.
     *
     * @return The DNS hostname of the cache node.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * The DNS hostname of the cache node.
     *
     * @param address The DNS hostname of the cache node.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * The DNS hostname of the cache node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param address The DNS hostname of the cache node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Endpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * The port number that the cache engine is listening on.
     *
     * @return The port number that the cache engine is listening on.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number that the cache engine is listening on.
     *
     * @param port The port number that the cache engine is listening on.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number that the cache engine is listening on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number that the cache engine is listening on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Endpoint withPort(Integer port) {
        this.port = port;
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
        if (getAddress() != null) sb.append("Address: " + getAddress() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Endpoint == false) return false;
        Endpoint other = (Endpoint)obj;
        
        if (other.getAddress() == null ^ this.getAddress() == null) return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        return true;
    }
    
}
    