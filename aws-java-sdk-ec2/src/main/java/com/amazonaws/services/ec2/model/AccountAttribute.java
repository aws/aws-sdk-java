/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Describes an account attribute.
 * </p>
 */
public class AccountAttribute implements Serializable {

    /**
     * The name of the account attribute.
     */
    private String attributeName;

    /**
     * One or more values for the account attribute.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue> attributeValues;

    /**
     * The name of the account attribute.
     *
     * @return The name of the account attribute.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the account attribute.
     *
     * @param attributeName The name of the account attribute.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the account attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the account attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccountAttribute withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * One or more values for the account attribute.
     *
     * @return One or more values for the account attribute.
     */
    public java.util.List<AccountAttributeValue> getAttributeValues() {
        if (attributeValues == null) {
              attributeValues = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountAttributeValue>();
              attributeValues.setAutoConstruct(true);
        }
        return attributeValues;
    }
    
    /**
     * One or more values for the account attribute.
     *
     * @param attributeValues One or more values for the account attribute.
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
     * One or more values for the account attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValues One or more values for the account attribute.
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
     * One or more values for the account attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValues One or more values for the account attribute.
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
    