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
 * Item
 */
public class Item {
        
    /**
     * Item Name.
     */
    private String name;

    private String alternateNameEncoding;

    /**
     * List of Attributes.
     */
    private java.util.List<Attribute> attributes;

    /**
     * Item Name.
     *
     * @return Item Name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Item Name.
     *
     * @param name Item Name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Item Name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name Item Name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the AlternateNameEncoding property for this
     * object.
     *
     * @return The value of the AlternateNameEncoding property for this object.
     */
    public String getAlternateNameEncoding() {
        return alternateNameEncoding;
    }
    
    /**
     * Sets the value of the AlternateNameEncoding property for this object.
     *
     * @param alternateNameEncoding The new value for the AlternateNameEncoding property for this object.
     */
    public void setAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
    }
    
    /**
     * Sets the value of the AlternateNameEncoding property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alternateNameEncoding The new value for the AlternateNameEncoding property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
        return this;
    }
    
    
    /**
     * List of Attributes.
     *
     * @return List of Attributes.
     */
    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.ArrayList<Attribute>();
        }
        return attributes;
    }
    
    /**
     * List of Attributes.
     *
     * @param attributes List of Attributes.
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;
    }
    
    /**
     * List of Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of Attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAttributes(Attribute... attributes) {
        for (Attribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * List of Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of Attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Item withAttributes(java.util.Collection<Attribute> attributes) {
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;

        return this;
    }
    
}
    