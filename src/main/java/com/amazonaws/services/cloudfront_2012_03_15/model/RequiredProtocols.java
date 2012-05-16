/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * <p>
 * The required protocol to access your distribution.
 * </p>
 */
public class RequiredProtocols {

    /**
     * Currently, https is the only acceptable value for the
     * RequiredProtocols element.
     */
    private java.util.List<String> protocols;

    /**
     * Default constructor for a new RequiredProtocols object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RequiredProtocols() {}
    
    /**
     * Currently, https is the only acceptable value for the
     * RequiredProtocols element.
     *
     * @return Currently, https is the only acceptable value for the
     *         RequiredProtocols element.
     */
    public java.util.List<String> getProtocols() {
        
        if (protocols == null) {
            protocols = new java.util.ArrayList<String>();
        }
        return protocols;
    }
    
    /**
     * Currently, https is the only acceptable value for the
     * RequiredProtocols element.
     *
     * @param protocols Currently, https is the only acceptable value for the
     *         RequiredProtocols element.
     */
    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        java.util.List<String> protocolsCopy = new java.util.ArrayList<String>(protocols.size());
        protocolsCopy.addAll(protocols);
        this.protocols = protocolsCopy;
    }
    
    /**
     * Currently, https is the only acceptable value for the
     * RequiredProtocols element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocols Currently, https is the only acceptable value for the
     *         RequiredProtocols element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequiredProtocols withProtocols(String... protocols) {
        if (getProtocols() == null) setProtocols(new java.util.ArrayList<String>(protocols.length));
        for (String value : protocols) {
            getProtocols().add(value);
        }
        return this;
    }
    
    /**
     * Currently, https is the only acceptable value for the
     * RequiredProtocols element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocols Currently, https is the only acceptable value for the
     *         RequiredProtocols element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequiredProtocols withProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
        } else {
            java.util.List<String> protocolsCopy = new java.util.ArrayList<String>(protocols.size());
            protocolsCopy.addAll(protocols);
            this.protocols = protocolsCopy;
        }

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
        if (protocols != null) sb.append("Protocols: " + protocols + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RequiredProtocols == false) return false;
        RequiredProtocols other = (RequiredProtocols)obj;
        
        if (other.getProtocols() == null ^ this.getProtocols() == null) return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false) return false; 
        return true;
    }
    
}
    
