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
 * <p>
 * </p>
 */
public class ReplaceableItem implements Serializable {

    /**
     * The name of the replaceable item.
     */
    private String name;

    /**
     * The list of attributes for a replaceable item.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributes;

    /**
     * Default constructor for a new ReplaceableItem object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReplaceableItem() {}
    
    /**
     * Constructs a new ReplaceableItem object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the replaceable item.
     */
    public ReplaceableItem(String name) {
        setName(name);
    }

    /**
     * Constructs a new ReplaceableItem object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the replaceable item.
     * @param attributes The list of attributes for a replaceable item.
     */
    public ReplaceableItem(String name, java.util.List<ReplaceableAttribute> attributes) {
        setName(name);
        setAttributes(attributes);
    }

    /**
     * The name of the replaceable item.
     *
     * @return The name of the replaceable item.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the replaceable item.
     *
     * @param name The name of the replaceable item.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the replaceable item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the replaceable item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The list of attributes for a replaceable item.
     *
     * @return The list of attributes for a replaceable item.
     */
    public java.util.List<ReplaceableAttribute> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * The list of attributes for a replaceable item.
     *
     * @param attributes The list of attributes for a replaceable item.
     */
    public void setAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>(attributes.size());
        attributesCopy.addAll(attributes);
        this.attributes = attributesCopy;
    }
    
    /**
     * The list of attributes for a replaceable item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes for a replaceable item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableItem withAttributes(ReplaceableAttribute... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<ReplaceableAttribute>(attributes.length));
        for (ReplaceableAttribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The list of attributes for a replaceable item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes for a replaceable item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableItem withAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>(attributes.size());
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

        if (obj instanceof ReplaceableItem == false) return false;
        ReplaceableItem other = (ReplaceableItem)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    