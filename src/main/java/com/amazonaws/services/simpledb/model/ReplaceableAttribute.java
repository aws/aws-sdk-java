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
public class ReplaceableAttribute implements Serializable {

    /**
     * The name of the replaceable attribute.
     */
    private String name;

    /**
     * The value of the replaceable attribute.
     */
    private String value;

    /**
     * A flag specifying whether or not to replace the attribute/value pair
     * or to add a new attribute/value pair. The default setting is
     * <code>false</code>.
     */
    private Boolean replace;

    /**
     * Default constructor for a new ReplaceableAttribute object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ReplaceableAttribute() {}
    
    /**
     * Constructs a new ReplaceableAttribute object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the replaceable attribute.
     * @param value The value of the replaceable attribute.
     * @param replace A flag specifying whether or not to replace the
     * attribute/value pair or to add a new attribute/value pair. The default
     * setting is <code>false</code>.
     */
    public ReplaceableAttribute(String name, String value, Boolean replace) {
        setName(name);
        setValue(value);
        setReplace(replace);
    }

    /**
     * The name of the replaceable attribute.
     *
     * @return The name of the replaceable attribute.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the replaceable attribute.
     *
     * @param name The name of the replaceable attribute.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the replaceable attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the replaceable attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The value of the replaceable attribute.
     *
     * @return The value of the replaceable attribute.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the replaceable attribute.
     *
     * @param value The value of the replaceable attribute.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the replaceable attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of the replaceable attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableAttribute withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair
     * or to add a new attribute/value pair. The default setting is
     * <code>false</code>.
     *
     * @return A flag specifying whether or not to replace the attribute/value pair
     *         or to add a new attribute/value pair. The default setting is
     *         <code>false</code>.
     */
    public Boolean isReplace() {
        return replace;
    }
    
    /**
     * A flag specifying whether or not to replace the attribute/value pair
     * or to add a new attribute/value pair. The default setting is
     * <code>false</code>.
     *
     * @param replace A flag specifying whether or not to replace the attribute/value pair
     *         or to add a new attribute/value pair. The default setting is
     *         <code>false</code>.
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }
    
    /**
     * A flag specifying whether or not to replace the attribute/value pair
     * or to add a new attribute/value pair. The default setting is
     * <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param replace A flag specifying whether or not to replace the attribute/value pair
     *         or to add a new attribute/value pair. The default setting is
     *         <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReplaceableAttribute withReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    /**
     * A flag specifying whether or not to replace the attribute/value pair
     * or to add a new attribute/value pair. The default setting is
     * <code>false</code>.
     *
     * @return A flag specifying whether or not to replace the attribute/value pair
     *         or to add a new attribute/value pair. The default setting is
     *         <code>false</code>.
     */
    public Boolean getReplace() {
        return replace;
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isReplace() != null) sb.append("Replace: " + isReplace() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isReplace() == null) ? 0 : isReplace().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReplaceableAttribute == false) return false;
        ReplaceableAttribute other = (ReplaceableAttribute)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isReplace() == null ^ this.isReplace() == null) return false;
        if (other.isReplace() != null && other.isReplace().equals(this.isReplace()) == false) return false; 
        return true;
    }
    
}
    