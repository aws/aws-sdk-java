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
 * Deletable Item
 */
public class DeletableItem implements Serializable {

    private String name;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> attributes;

    /**
     * Default constructor for a new DeletableItem object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeletableItem() {}
    
    /**
     * Constructs a new DeletableItem object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     * @param attributes
     */
    public DeletableItem(String name, java.util.List<Attribute> attributes) {
        setName(name);
        setAttributes(attributes);
    }

    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeletableItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the Attributes property for this object.
     *
     * @return The value of the Attributes property for this object.
     */
    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     *
     * @param attributes The new value for the Attributes property for this object.
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
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeletableItem withAttributes(Attribute... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        for (Attribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeletableItem withAttributes(java.util.Collection<Attribute> attributes) {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeletableItem == false) return false;
        DeletableItem other = (DeletableItem)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    