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
public class ReplaceableAttribute {

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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Name: " + name + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("Replace: " + replace + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    