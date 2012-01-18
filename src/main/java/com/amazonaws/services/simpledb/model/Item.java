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
package com.amazonaws.services.simpledb.model;

/**
 * <p>
 * </p>
 */
public class Item {

    /**
     * The name of the item.
     */
    private String name;

    /**
     * 
     */
    private String alternateNameEncoding;

    /**
     * A list of attributes.
     */
    private java.util.List<Attribute> attributes;

    /**
     * Default constructor for a new Item object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Item() {}
    
    /**
     * Constructs a new Item object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the item.
     * @param attributes A list of attributes.
     */
    public Item(String name, java.util.List<Attribute> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    
    
    /**
     * The name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the item.
     *
     * @param name The name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getAlternateNameEncoding() {
        return alternateNameEncoding;
    }
    
    /**
     * 
     *
     * @param alternateNameEncoding 
     */
    public void setAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alternateNameEncoding 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
        return this;
    }
    
    
    /**
     * A list of attributes.
     *
     * @return A list of attributes.
     */
    public java.util.List<Attribute> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.ArrayList<Attribute>();
        }
        return attributes;
    }
    
    /**
     * A list of attributes.
     *
     * @param attributes A list of attributes.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>(attributes.size());
        attributesCopy.addAll(attributes);
        this.attributes = attributesCopy;
    }
    
    /**
     * A list of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A list of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAttributes(Attribute... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        for (Attribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * A list of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A list of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
        } else {
            java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>(attributes.size());
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (alternateNameEncoding != null) sb.append("AlternateNameEncoding: " + alternateNameEncoding + ", ");
        if (attributes != null) sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getAlternateNameEncoding() == null) ? 0 : getAlternateNameEncoding().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof Item == false) return false;
        Item other = (Item)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getAlternateNameEncoding() == null ^ this.getAlternateNameEncoding() == null) return false;
        if (other.getAlternateNameEncoding() != null && other.getAlternateNameEncoding().equals(this.getAlternateNameEncoding()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    