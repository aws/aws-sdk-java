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
 * Exists : Use this parameter to specify whether or not a value already
 * exists for the attribute name-value pair. Value : Use this parameter
 * to specify whether or not a value already exists and has a specific
 * content for the attribute name-value pair.
 * </p>
 */
public class ExpectedAttributeValue {

    /**
     * AttributeValue can be String, Number, StringSet, NumberSet.
     */
    private AttributeValue value;

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
     * @param value AttributeValue can be String, Number, StringSet,
     * NumberSet.
     */
    public ExpectedAttributeValue(AttributeValue value) {
        this.value = value;
    }

    
    
    /**
     * Constructs a new ExpectedAttributeValue object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param exists
     */
    public ExpectedAttributeValue(Boolean exists) {
        this.exists = exists;
    }

    
    
    /**
     * AttributeValue can be String, Number, StringSet, NumberSet.
     *
     * @return AttributeValue can be String, Number, StringSet, NumberSet.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * AttributeValue can be String, Number, StringSet, NumberSet.
     *
     * @param value AttributeValue can be String, Number, StringSet, NumberSet.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * AttributeValue can be String, Number, StringSet, NumberSet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value AttributeValue can be String, Number, StringSet, NumberSet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExpectedAttributeValue withValue(AttributeValue value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Returns the value of the Exists property for this object.
     *
     * @return The value of the Exists property for this object.
     */
    public Boolean isExists() {
        return exists;
    }
    
    /**
     * Sets the value of the Exists property for this object.
     *
     * @param exists The new value for the Exists property for this object.
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }
    
    /**
     * Sets the value of the Exists property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exists The new value for the Exists property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ExpectedAttributeValue withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    
    
    /**
     * Returns the value of the Exists property for this object.
     *
     * @return The value of the Exists property for this object.
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
    