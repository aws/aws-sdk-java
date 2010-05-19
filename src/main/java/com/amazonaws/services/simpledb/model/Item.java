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
 * <p>
 * </p>
 */
public class Item {

    /**
     * The name of the item.
     */
    private String name;

    /**
     * <p/>
     */
    private String alternateNameEncoding;

    /**
     * A list of attributes.
     */
    private java.util.List<Attribute> attributes;

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
     * <p/>
     *
     * @return <p/>
     */
    public String getAlternateNameEncoding() {
        return alternateNameEncoding;
    }
    
    /**
     * <p/>
     *
     * @param alternateNameEncoding <p/>
     */
    public void setAlternateNameEncoding(String alternateNameEncoding) {
        this.alternateNameEncoding = alternateNameEncoding;
    }
    
    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alternateNameEncoding <p/>
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
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
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
        java.util.List<Attribute> attributesCopy = new java.util.ArrayList<Attribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Name: " + name + ", ");
        sb.append("AlternateNameEncoding: " + alternateNameEncoding + ", ");
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    