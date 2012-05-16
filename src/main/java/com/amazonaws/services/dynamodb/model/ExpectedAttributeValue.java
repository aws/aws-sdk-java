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
package com.amazonaws.services.dynamodb.model;

/**
 * <p>
 * Allows you to provide an attribute name, and whether or not Amazon DynamoDB should check to see if the attribute value already exists; or if the
 * attribute value exists and has a particular value before changing it.
 * </p>
 */
public class ExpectedAttributeValue {

    /**
     * Specify whether or not a value already exists and has a specific
     * content for the attribute name-value pair.
     */
    private AttributeValue value;

    /**
     * Specify whether or not a value already exists for the attribute
     * name-value pair.
     */
    private Boolean exists;

    /**
     * Default constructor for a new ExpectedAttributeValue object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ExpectedAttributeValue() {}
    
    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value Specify whether or not a value already exists and has a
     * specific content for the attribute name-value pair.
     */
    public ExpectedAttributeValue(AttributeValue value) {
        this.value = value;
    }

    
    
    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exists Specify whether or not a value already exists for the
     * attribute name-value pair.
     */
    public ExpectedAttributeValue(Boolean exists) {
        this.exists = exists;
    }

    
    
    /**
     * Specify whether or not a value already exists and has a specific
     * content for the attribute name-value pair.
     *
     * @return Specify whether or not a value already exists and has a specific
     *         content for the attribute name-value pair.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * Specify whether or not a value already exists and has a specific
     * content for the attribute name-value pair.
     *
     * @param value Specify whether or not a value already exists and has a specific
     *         content for the attribute name-value pair.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * Specify whether or not a value already exists and has a specific
     * content for the attribute name-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value Specify whether or not a value already exists and has a specific
     *         content for the attribute name-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExpectedAttributeValue withValue(AttributeValue value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Specify whether or not a value already exists for the attribute
     * name-value pair.
     *
     * @return Specify whether or not a value already exists for the attribute
     *         name-value pair.
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * Specify whether or not a value already exists for the attribute
     * name-value pair.
     *
     * @param exists Specify whether or not a value already exists for the attribute
     *         name-value pair.
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * Specify whether or not a value already exists for the attribute
     * name-value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists Specify whether or not a value already exists for the attribute
     *         name-value pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExpectedAttributeValue withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    
    
    /**
     * Specify whether or not a value already exists for the attribute
     * name-value pair.
     *
     * @return Specify whether or not a value already exists for the attribute
     *         name-value pair.
     */
    public Boolean getExists() {
        return exists;
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
        if (value != null) sb.append("Value: " + value + ", ");
        if (exists != null) sb.append("Exists: " + exists + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isExists() == null) ? 0 : isExists().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ExpectedAttributeValue == false) return false;
        ExpectedAttributeValue other = (ExpectedAttributeValue)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isExists() == null ^ this.isExists() == null) return false;
        if (other.isExists() != null && other.isExists().equals(this.isExists()) == false) return false; 
        return true;
    }
    
}
    