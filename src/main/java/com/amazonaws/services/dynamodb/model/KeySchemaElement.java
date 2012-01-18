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
 * Key Schema Element
 */
public class KeySchemaElement {

    private String attributeName;

    private String attributeType;

    /**
     * Default constructor for a new KeySchemaElement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public KeySchemaElement() {}
    
    /**
     * Returns the value of the AttributeName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the AttributeName property for this object.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * Sets the value of the AttributeName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName The new value for the AttributeName property for this object.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * Sets the value of the AttributeName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName The new value for the AttributeName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeySchemaElement withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    /**
     * Returns the value of the AttributeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N
     *
     * @return The value of the AttributeType property for this object.
     *
     * @see ScalarAttributeType
     */
    public String getAttributeType() {
        return attributeType;
    }
    
    /**
     * Sets the value of the AttributeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N
     *
     * @param attributeType The new value for the AttributeType property for this object.
     *
     * @see ScalarAttributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
    
    /**
     * Sets the value of the AttributeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N
     *
     * @param attributeType The new value for the AttributeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ScalarAttributeType
     */
    public KeySchemaElement withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }
    
    
    /**
     * Sets the value of the AttributeType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N
     *
     * @param attributeType The new value for the AttributeType property for this object.
     *
     * @see ScalarAttributeType
     */
    public void setAttributeType(ScalarAttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }
    
    /**
     * Sets the value of the AttributeType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N
     *
     * @param attributeType The new value for the AttributeType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ScalarAttributeType
     */
    public KeySchemaElement withAttributeType(ScalarAttributeType attributeType) {
        this.attributeType = attributeType.toString();
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
        if (attributeName != null) sb.append("AttributeName: " + attributeName + ", ");
        if (attributeType != null) sb.append("AttributeType: " + attributeType + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof KeySchemaElement == false) return false;
        KeySchemaElement other = (KeySchemaElement)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeType() == null ^ this.getAttributeType() == null) return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false) return false; 
        return true;
    }
    
}
    