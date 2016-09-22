/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the schema attribute.
 * </p>
 */
public class SchemaAttributeType implements Serializable, Cloneable {

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The attribute data type.
     * </p>
     */
    private String attributeDataType;
    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     */
    private Boolean developerOnlyAttribute;
    /**
     * <p>
     * Specifies whether the attribute can be changed once it has been created.
     * </p>
     */
    private Boolean mutable;
    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a
     * value, registration or sign-in will fail.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     */
    private NumberAttributeConstraintsType numberAttributeConstraints;
    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     */
    private StringAttributeConstraintsType stringAttributeConstraints;

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * 
     * @param name
     *        A schema attribute of the name type.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * 
     * @return A schema attribute of the name type.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A schema attribute of the name type.
     * </p>
     * 
     * @param name
     *        A schema attribute of the name type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * 
     * @param attributeDataType
     *        The attribute data type.
     * @see AttributeDataType
     */

    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * 
     * @return The attribute data type.
     * @see AttributeDataType
     */

    public String getAttributeDataType() {
        return this.attributeDataType;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * 
     * @param attributeDataType
     *        The attribute data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeDataType
     */

    public SchemaAttributeType withAttributeDataType(String attributeDataType) {
        setAttributeDataType(attributeDataType);
        return this;
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * 
     * @param attributeDataType
     *        The attribute data type.
     * @see AttributeDataType
     */

    public void setAttributeDataType(AttributeDataType attributeDataType) {
        this.attributeDataType = attributeDataType.toString();
    }

    /**
     * <p>
     * The attribute data type.
     * </p>
     * 
     * @param attributeDataType
     *        The attribute data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeDataType
     */

    public SchemaAttributeType withAttributeDataType(AttributeDataType attributeDataType) {
        setAttributeDataType(attributeDataType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     * 
     * @param developerOnlyAttribute
     *        Specifies whether the attribute type is developer only.
     */

    public void setDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        this.developerOnlyAttribute = developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     * 
     * @return Specifies whether the attribute type is developer only.
     */

    public Boolean getDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     * 
     * @param developerOnlyAttribute
     *        Specifies whether the attribute type is developer only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withDeveloperOnlyAttribute(Boolean developerOnlyAttribute) {
        setDeveloperOnlyAttribute(developerOnlyAttribute);
        return this;
    }

    /**
     * <p>
     * Specifies whether the attribute type is developer only.
     * </p>
     * 
     * @return Specifies whether the attribute type is developer only.
     */

    public Boolean isDeveloperOnlyAttribute() {
        return this.developerOnlyAttribute;
    }

    /**
     * <p>
     * Specifies whether the attribute can be changed once it has been created.
     * </p>
     * 
     * @param mutable
     *        Specifies whether the attribute can be changed once it has been created.
     */

    public void setMutable(Boolean mutable) {
        this.mutable = mutable;
    }

    /**
     * <p>
     * Specifies whether the attribute can be changed once it has been created.
     * </p>
     * 
     * @return Specifies whether the attribute can be changed once it has been created.
     */

    public Boolean getMutable() {
        return this.mutable;
    }

    /**
     * <p>
     * Specifies whether the attribute can be changed once it has been created.
     * </p>
     * 
     * @param mutable
     *        Specifies whether the attribute can be changed once it has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withMutable(Boolean mutable) {
        setMutable(mutable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the attribute can be changed once it has been created.
     * </p>
     * 
     * @return Specifies whether the attribute can be changed once it has been created.
     */

    public Boolean isMutable() {
        return this.mutable;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @param required
     *        Specifies whether a user pool attribute is required. If the attribute is required and the user does not
     *        provide a value, registration or sign-in will fail.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @return Specifies whether a user pool attribute is required. If the attribute is required and the user does not
     *         provide a value, registration or sign-in will fail.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @param required
     *        Specifies whether a user pool attribute is required. If the attribute is required and the user does not
     *        provide a value, registration or sign-in will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a
     * value, registration or sign-in will fail.
     * </p>
     * 
     * @return Specifies whether a user pool attribute is required. If the attribute is required and the user does not
     *         provide a value, registration or sign-in will fail.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @param numberAttributeConstraints
     *        Specifies the constraints for an attribute of the number type.
     */

    public void setNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        this.numberAttributeConstraints = numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @return Specifies the constraints for an attribute of the number type.
     */

    public NumberAttributeConstraintsType getNumberAttributeConstraints() {
        return this.numberAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the number type.
     * </p>
     * 
     * @param numberAttributeConstraints
     *        Specifies the constraints for an attribute of the number type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withNumberAttributeConstraints(NumberAttributeConstraintsType numberAttributeConstraints) {
        setNumberAttributeConstraints(numberAttributeConstraints);
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @param stringAttributeConstraints
     *        Specifies the constraints for an attribute of the string type.
     */

    public void setStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        this.stringAttributeConstraints = stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @return Specifies the constraints for an attribute of the string type.
     */

    public StringAttributeConstraintsType getStringAttributeConstraints() {
        return this.stringAttributeConstraints;
    }

    /**
     * <p>
     * Specifies the constraints for an attribute of the string type.
     * </p>
     * 
     * @param stringAttributeConstraints
     *        Specifies the constraints for an attribute of the string type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaAttributeType withStringAttributeConstraints(StringAttributeConstraintsType stringAttributeConstraints) {
        setStringAttributeConstraints(stringAttributeConstraints);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAttributeDataType() != null)
            sb.append("AttributeDataType: " + getAttributeDataType() + ",");
        if (getDeveloperOnlyAttribute() != null)
            sb.append("DeveloperOnlyAttribute: " + getDeveloperOnlyAttribute() + ",");
        if (getMutable() != null)
            sb.append("Mutable: " + getMutable() + ",");
        if (getRequired() != null)
            sb.append("Required: " + getRequired() + ",");
        if (getNumberAttributeConstraints() != null)
            sb.append("NumberAttributeConstraints: " + getNumberAttributeConstraints() + ",");
        if (getStringAttributeConstraints() != null)
            sb.append("StringAttributeConstraints: " + getStringAttributeConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaAttributeType == false)
            return false;
        SchemaAttributeType other = (SchemaAttributeType) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributeDataType() == null ^ this.getAttributeDataType() == null)
            return false;
        if (other.getAttributeDataType() != null && other.getAttributeDataType().equals(this.getAttributeDataType()) == false)
            return false;
        if (other.getDeveloperOnlyAttribute() == null ^ this.getDeveloperOnlyAttribute() == null)
            return false;
        if (other.getDeveloperOnlyAttribute() != null && other.getDeveloperOnlyAttribute().equals(this.getDeveloperOnlyAttribute()) == false)
            return false;
        if (other.getMutable() == null ^ this.getMutable() == null)
            return false;
        if (other.getMutable() != null && other.getMutable().equals(this.getMutable()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getNumberAttributeConstraints() == null ^ this.getNumberAttributeConstraints() == null)
            return false;
        if (other.getNumberAttributeConstraints() != null && other.getNumberAttributeConstraints().equals(this.getNumberAttributeConstraints()) == false)
            return false;
        if (other.getStringAttributeConstraints() == null ^ this.getStringAttributeConstraints() == null)
            return false;
        if (other.getStringAttributeConstraints() != null && other.getStringAttributeConstraints().equals(this.getStringAttributeConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributeDataType() == null) ? 0 : getAttributeDataType().hashCode());
        hashCode = prime * hashCode + ((getDeveloperOnlyAttribute() == null) ? 0 : getDeveloperOnlyAttribute().hashCode());
        hashCode = prime * hashCode + ((getMutable() == null) ? 0 : getMutable().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getNumberAttributeConstraints() == null) ? 0 : getNumberAttributeConstraints().hashCode());
        hashCode = prime * hashCode + ((getStringAttributeConstraints() == null) ? 0 : getStringAttributeConstraints().hashCode());
        return hashCode;
    }

    @Override
    public SchemaAttributeType clone() {
        try {
            return (SchemaAttributeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
