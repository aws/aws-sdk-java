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
 * The <code>PolicyAttributeTypeDescription</code> data type. This data type is used to describe values that are acceptable for the policy attribute.
 * </p>
 */
public class PolicyAttributeTypeDescription implements Serializable {

    /**
     * The name of the attribute associated with the policy type.
     */
    private String attributeName;

    /**
     * The type of attribute. For example, Boolean, Integer, etc.
     */
    private String attributeType;

    /**
     * A human-readable description of the attribute.
     */
    private String description;

    /**
     * The default value of the attribute, if applicable.
     */
    private String defaultValue;

    /**
     * The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     * Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     * be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     * are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     * are allowed</li> </ul>
     */
    private String cardinality;

    /**
     * The name of the attribute associated with the policy type.
     *
     * @return The name of the attribute associated with the policy type.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the attribute associated with the policy type.
     *
     * @param attributeName The name of the attribute associated with the policy type.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the attribute associated with the policy type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the attribute associated with the policy type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeTypeDescription withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The type of attribute. For example, Boolean, Integer, etc.
     *
     * @return The type of attribute. For example, Boolean, Integer, etc.
     */
    public String getAttributeType() {
        return attributeType;
    }
    
    /**
     * The type of attribute. For example, Boolean, Integer, etc.
     *
     * @param attributeType The type of attribute. For example, Boolean, Integer, etc.
     */
    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }
    
    /**
     * The type of attribute. For example, Boolean, Integer, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeType The type of attribute. For example, Boolean, Integer, etc.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeTypeDescription withAttributeType(String attributeType) {
        this.attributeType = attributeType;
        return this;
    }

    /**
     * A human-readable description of the attribute.
     *
     * @return A human-readable description of the attribute.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A human-readable description of the attribute.
     *
     * @param description A human-readable description of the attribute.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A human-readable description of the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A human-readable description of the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeTypeDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The default value of the attribute, if applicable.
     *
     * @return The default value of the attribute, if applicable.
     */
    public String getDefaultValue() {
        return defaultValue;
    }
    
    /**
     * The default value of the attribute, if applicable.
     *
     * @param defaultValue The default value of the attribute, if applicable.
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    /**
     * The default value of the attribute, if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue The default value of the attribute, if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeTypeDescription withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     * Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     * be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     * are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     * are allowed</li> </ul>
     *
     * @return The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     *         Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     *         be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     *         are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     *         are allowed</li> </ul>
     */
    public String getCardinality() {
        return cardinality;
    }
    
    /**
     * The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     * Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     * be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     * are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     * are allowed</li> </ul>
     *
     * @param cardinality The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     *         Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     *         be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     *         are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     *         are allowed</li> </ul>
     */
    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }
    
    /**
     * The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     * Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     * be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     * are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     * are allowed</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cardinality The cardinality of the attribute. Valid Values: <ul> <li>ONE(1) :
     *         Single value required</li> <li>ZERO_OR_ONE(0..1) : Up to one value can
     *         be supplied</li> <li>ZERO_OR_MORE(0..*) : Optional. Multiple values
     *         are allowed</li> <li>ONE_OR_MORE(1..*0) : Required. Multiple values
     *         are allowed</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PolicyAttributeTypeDescription withCardinality(String cardinality) {
        this.cardinality = cardinality;
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
        if (getAttributeType() != null) sb.append("AttributeType: " + getAttributeType() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getCardinality() != null) sb.append("Cardinality: " + getCardinality() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeType() == null) ? 0 : getAttributeType().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode()); 
        hashCode = prime * hashCode + ((getCardinality() == null) ? 0 : getCardinality().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyAttributeTypeDescription == false) return false;
        PolicyAttributeTypeDescription other = (PolicyAttributeTypeDescription)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeType() == null ^ this.getAttributeType() == null) return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false; 
        if (other.getCardinality() == null ^ this.getCardinality() == null) return false;
        if (other.getCardinality() != null && other.getCardinality().equals(this.getCardinality()) == false) return false; 
        return true;
    }
    
}
    