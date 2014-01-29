/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a value of an account attribute.
 * </p>
 */
public class AccountAttributeValue implements Serializable {

    /**
     * The value.
     */
    private String attributeValue;

    /**
     * The value.
     *
     * @return The value.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * The value.
     *
     * @param attributeValue The value.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * The value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValue The value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AccountAttributeValue withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (getAttributeValue() != null) sb.append("AttributeValue: " + getAttributeValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccountAttributeValue == false) return false;
        AccountAttributeValue other = (AccountAttributeValue)obj;
        
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null) return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false) return false; 
        return true;
    }
    
}
    