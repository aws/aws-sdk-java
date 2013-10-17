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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;


/**
 * Get Attributes Result
 */
public class GetAttributesResult implements Serializable {

    /**
     * The list of attributes returned by the operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> attributes;

    /**
     * The list of attributes returned by the operation.
     *
     * @return The list of attributes returned by the operation.
     */
    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * The list of attributes returned by the operation.
     *
     * @param attributes The list of attributes returned by the operation.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(attributes.size());
        attributesCopy.addAll(attributes);
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
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
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
        if (attributes == null) {
            this.attributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(attributes.size());
            attributesCopy.addAll(attributes);
            this.attributes = attributesCopy;
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

        if (obj instanceof GetAttributesResult == false) return false;
        GetAttributesResult other = (GetAttributesResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    