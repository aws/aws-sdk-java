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
 * Replaceable Item
 */
public class ReplaceableItem {

    /**
     * Item Name.
     */
    private String name;

    /**
     * List of Replaceable Attributes.
     */
    private java.util.List<ReplaceableAttribute> attributes;

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
    public ReplaceableItem withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * List of Replaceable Attributes.
     *
     * @return List of Replaceable Attributes.
     */
    public java.util.List<ReplaceableAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.ArrayList<ReplaceableAttribute>();
        }
        return attributes;
    }
    
    /**
     * List of Replaceable Attributes.
     *
     * @param attributes List of Replaceable Attributes.
     */
    public void setAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        java.util.List<ReplaceableAttribute> attributesCopy = new java.util.ArrayList<ReplaceableAttribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;
    }
    
    /**
     * List of Replaceable Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of Replaceable Attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceableItem withAttributes(ReplaceableAttribute... attributes) {
        for (ReplaceableAttribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * List of Replaceable Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of Replaceable Attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceableItem withAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        java.util.List<ReplaceableAttribute> attributesCopy = new java.util.ArrayList<ReplaceableAttribute>();
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
        sb.append("Attributes: " + attributes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    