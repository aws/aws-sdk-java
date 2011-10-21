/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

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
        java.util.List<String> protocolsCopy = new java.util.ArrayList<String>();
        if (protocols != null) {
            protocolsCopy.addAll(protocols);
        }
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
        if (getProtocols() == null) setProtocols(new java.util.ArrayList<String>());
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
        java.util.List<String> protocolsCopy = new java.util.ArrayList<String>();
        if (protocols != null) {
            protocolsCopy.addAll(protocols);
        }
        this.protocols = protocolsCopy;

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
        sb.append("Protocols: " + protocols + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    