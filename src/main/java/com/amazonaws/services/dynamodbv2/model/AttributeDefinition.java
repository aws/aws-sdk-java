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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * Specifies an attribute for describing the key schema for the table and indexes.
 * </p>
 */
public class AttributeDefinition implements Serializable {

    /**
     * A name for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String attributeName;

    /**
     * The data type for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     */
    private String attributeType;

    /**
     * Default constructor for a new AttributeDefinition object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttributeDefinition() {}
    
    /**
     * Constructs a new AttributeDefinition object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName A name for the attribute.
     * @param attributeType The data type for the attribute.
     */
    public AttributeDefinition(String attributeName, String attributeType) {
        setAttributeName(attributeName);
        setAttributeType(attributeType);
    }

    /**
     * Constructs a new AttributeDefinition object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName A name for the attribute.
     * @param attributeType The data type for the attribute.
     */
    public AttributeDefinition(String attributeName, ScalarAttributeType attributeType) {
        this.attributeName = attributeName;
        this.attributeType = attributeType.toString();
    }

    /**
     * A name for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return A name for the attribute.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * A name for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName A name for the attribute.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * A name for the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName A name for the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttributeDefinition withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The data type for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     *
     * @return The data type for the attribute.
     *
     * @see ScalarAttributeType
     */
    public String getAttributeType() {
        return attributeType;
    }
    
    /**
     * The data type for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     *
     * @param attributeType The data type for the attribute.
     *
     * @see ScalarAttributeType
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
    
    /**
     * The data type for the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     *
     * @param attributeType The data type for the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ScalarAttributeType
     */
    public AttributeDefinition withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * The data type for the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     *
     * @param attributeType The data type for the attribute.
     *
     * @see ScalarAttributeType
     */
    public void setAttributeType(ScalarAttributeType attributeType) {
        this.attributeType = attributeType.toString();
    }
    
    /**
     * The data type for the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S, N, B
     *
     * @param attributeType The data type for the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ScalarAttributeType
     */
    public AttributeDefinition withAttributeType(ScalarAttributeType attributeType) {
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
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeType() != null) sb.append("AttributeType: " + getAttributeType() );
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

        if (obj instanceof AttributeDefinition == false) return false;
        AttributeDefinition other = (AttributeDefinition)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeType() == null ^ this.getAttributeType() == null) return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false) return false; 
        return true;
    }
    
}
    