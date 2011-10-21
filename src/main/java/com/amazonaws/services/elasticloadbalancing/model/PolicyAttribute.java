/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The PolicyAttribute data type. This data type contains a key/value
 * pair that defines properties of a specific policy.
 * </p>
 */
public class PolicyAttribute {

    /**
     * The name of the attribute associated with the policy.
     */
    private String attributeName;

    /**
     * The value of the attribute associated with the policy.
     */
    private String attributeValue;

    /**
     * Default constructor for a new PolicyAttribute object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PolicyAttribute() {}
    
    /**
     * Constructs a new PolicyAttribute object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName The name of the attribute associated with the
     * policy.
     * @param attributeValue The value of the attribute associated with the
     * policy.
     */
    public PolicyAttribute(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }
    
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
    public PolicyAttribute withAttributeName(String attributeName) {
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
    public PolicyAttribute withAttributeValue(String attributeValue) {
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
        sb.append("AttributeName: " + attributeName + ", ");
        sb.append("AttributeValue: " + attributeValue + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    