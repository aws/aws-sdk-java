/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A facet attribute definition. See <a
 * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_attributereferences.html">Attribute
 * References</a> for more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/FacetAttributeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetAttributeDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the attribute.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The default value of the attribute (if configured).
     * </p>
     */
    private TypedAttributeValue defaultValue;
    /**
     * <p>
     * Whether the attribute is mutable or not.
     * </p>
     */
    private Boolean isImmutable;
    /**
     * <p>
     * Validation rules attached to the attribute definition.
     * </p>
     */
    private java.util.Map<String, Rule> rules;

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param type
     *        The type of the attribute.
     * @see FacetAttributeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @return The type of the attribute.
     * @see FacetAttributeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param type
     *        The type of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FacetAttributeType
     */

    public FacetAttributeDefinition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param type
     *        The type of the attribute.
     * @see FacetAttributeType
     */

    public void setType(FacetAttributeType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the attribute.
     * </p>
     * 
     * @param type
     *        The type of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FacetAttributeType
     */

    public FacetAttributeDefinition withType(FacetAttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The default value of the attribute (if configured).
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute (if configured).
     */

    public void setDefaultValue(TypedAttributeValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute (if configured).
     * </p>
     * 
     * @return The default value of the attribute (if configured).
     */

    public TypedAttributeValue getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute (if configured).
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute (if configured).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeDefinition withDefaultValue(TypedAttributeValue defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * Whether the attribute is mutable or not.
     * </p>
     * 
     * @param isImmutable
     *        Whether the attribute is mutable or not.
     */

    public void setIsImmutable(Boolean isImmutable) {
        this.isImmutable = isImmutable;
    }

    /**
     * <p>
     * Whether the attribute is mutable or not.
     * </p>
     * 
     * @return Whether the attribute is mutable or not.
     */

    public Boolean getIsImmutable() {
        return this.isImmutable;
    }

    /**
     * <p>
     * Whether the attribute is mutable or not.
     * </p>
     * 
     * @param isImmutable
     *        Whether the attribute is mutable or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeDefinition withIsImmutable(Boolean isImmutable) {
        setIsImmutable(isImmutable);
        return this;
    }

    /**
     * <p>
     * Whether the attribute is mutable or not.
     * </p>
     * 
     * @return Whether the attribute is mutable or not.
     */

    public Boolean isImmutable() {
        return this.isImmutable;
    }

    /**
     * <p>
     * Validation rules attached to the attribute definition.
     * </p>
     * 
     * @return Validation rules attached to the attribute definition.
     */

    public java.util.Map<String, Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Validation rules attached to the attribute definition.
     * </p>
     * 
     * @param rules
     *        Validation rules attached to the attribute definition.
     */

    public void setRules(java.util.Map<String, Rule> rules) {
        this.rules = rules;
    }

    /**
     * <p>
     * Validation rules attached to the attribute definition.
     * </p>
     * 
     * @param rules
     *        Validation rules attached to the attribute definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeDefinition withRules(java.util.Map<String, Rule> rules) {
        setRules(rules);
        return this;
    }

    public FacetAttributeDefinition addRulesEntry(String key, Rule value) {
        if (null == this.rules) {
            this.rules = new java.util.HashMap<String, Rule>();
        }
        if (this.rules.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.rules.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Rules.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetAttributeDefinition clearRulesEntries() {
        this.rules = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getIsImmutable() != null)
            sb.append("IsImmutable: ").append(getIsImmutable()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetAttributeDefinition == false)
            return false;
        FacetAttributeDefinition other = (FacetAttributeDefinition) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getIsImmutable() == null ^ this.getIsImmutable() == null)
            return false;
        if (other.getIsImmutable() != null && other.getIsImmutable().equals(this.getIsImmutable()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getIsImmutable() == null) ? 0 : getIsImmutable().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public FacetAttributeDefinition clone() {
        try {
            return (FacetAttributeDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.FacetAttributeDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
