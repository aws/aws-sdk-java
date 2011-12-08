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
package com.amazonaws.services.simpledb.model;

/**
 * Deletable Item
 */
public class DeletableItem {

    private String name;

    private java.util.List<Attribute> attributes;

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
        this.name = name;
        this.attributes = attributes;
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
            attributes = new java.util.ArrayList<Attribute>();
        }
        return attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     *
     * @param attributes The new value for the Attributes property for this object.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
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
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<Attribute>());
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
        sb.append("Name: " + name + ", ");
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    