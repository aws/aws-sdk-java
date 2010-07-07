/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;

/**
 * Get Attributes Result
 */
public class GetAttributesResult {

    /**
     * The list of attributes returned by the operation.
     */
    private java.util.List<Attribute> attributes;

    /**
     * The list of attributes returned by the operation.
     *
     * @return The list of attributes returned by the operation.
     */
    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.ArrayList<Attribute>();
        }
        return attributes;
    }
    
    /**
     * The list of attributes returned by the operation.
     *
     * @param attributes The list of attributes returned by the operation.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;
    }
    
    /**
     * The list of attributes returned by the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes returned by the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesResult withAttributes(Attribute... attributes) {
        for (Attribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The list of attributes returned by the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes returned by the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesResult withAttributes(java.util.Collection<Attribute> attributes) {
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;

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
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    