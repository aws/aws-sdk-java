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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>PolicyAttributeDescription</code> data type. This data type is used to describe the attributes and values associated with a policy.
 * </p>
 */
public class PolicyAttributeDescription implements Serializable {

    /**
     * The name of the attribute associated with the policy.
     */
    private String attributeName;

    /**
     * The value of the attribute associated with the policy.
     */
    private String attributeValue;

    /**
     * The name of the attribute associated with the policy.
     *
     * @return The name of the attribute associated with the policy.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the attribute associated with the policy.
     *
     * @param attributeName The name of the attribute associated with the policy.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the attribute associated with the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the attribute associated with the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The value of the attribute associated with the policy.
     *
     * @return The value of the attribute associated with the policy.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * The value of the attribute associated with the policy.
     *
     * @param attributeValue The value of the attribute associated with the policy.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * The value of the attribute associated with the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValue The value of the attribute associated with the policy.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeDescription withAttributeValue(String attributeValue) {
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
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null) sb.append("AttributeValue: " + getAttributeValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyAttributeDescription == false) return false;
        PolicyAttributeDescription other = (PolicyAttributeDescription)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null) return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false) return false; 
        return true;
    }
    
}
    