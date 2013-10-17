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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Account Attribute
 */
public class AccountAttribute implements Serializable {

    private String attributeName;

    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue> attributeValues;

    /**
     * Returns the value of the AttributeName property for this object.
     *
     * @return The value of the AttributeName property for this object.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * Sets the value of the AttributeName property for this object.
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
     *
     * @param attributeName The new value for the AttributeName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccountAttribute withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * Returns the value of the AttributeValues property for this object.
     *
     * @return The value of the AttributeValues property for this object.
     */
    public java.util.List<AccountAttributeValue> getAttributeValues() {
        if (attributeValues == null) {
              attributeValues = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue>();
              attributeValues.setAutoConstruct(true);
        }
        return attributeValues;
    }
    
    /**
     * Sets the value of the AttributeValues property for this object.
     *
     * @param attributeValues The new value for the AttributeValues property for this object.
     */
    public void setAttributeValues(java.util.Collection<AccountAttributeValue> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue> attributeValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue>(attributeValues.size());
        attributeValuesCopy.addAll(attributeValues);
        this.attributeValues = attributeValuesCopy;
    }
    
    /**
     * Sets the value of the AttributeValues property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValues The new value for the AttributeValues property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccountAttribute withAttributeValues(AccountAttributeValue... attributeValues) {
        if (getAttributeValues() == null) setAttributeValues(new java.util.ArrayList<AccountAttributeValue>(attributeValues.length));
        for (AccountAttributeValue value : attributeValues) {
            getAttributeValues().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributeValues property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValues The new value for the AttributeValues property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccountAttribute withAttributeValues(java.util.Collection<AccountAttributeValue> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue> attributeValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue>(attributeValues.size());
            attributeValuesCopy.addAll(attributeValues);
            this.attributeValues = attributeValuesCopy;
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
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValues() != null) sb.append("AttributeValues: " + getAttributeValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountAttribute == false) return false;
        AccountAttribute other = (AccountAttribute)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null) return false;
        if (other.getAttributeValues() != null && other.getAttributeValues().equals(this.getAttributeValues()) == false) return false; 
        return true;
    }
    
}
    