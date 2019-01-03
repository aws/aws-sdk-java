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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a policy attribute type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/PolicyAttributeTypeDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyAttributeTypeDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     * </p>
     */
    private String attributeType;
    /**
     * <p>
     * A description of the attribute.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     */
    private String cardinality;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttributeTypeDescription withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     * </p>
     * 
     * @param attributeType
     *        The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     */

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     * </p>
     * 
     * @return The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     */

    public String getAttributeType() {
        return this.attributeType;
    }

    /**
     * <p>
     * The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     * </p>
     * 
     * @param attributeType
     *        The type of the attribute. For example, <code>Boolean</code> or <code>Integer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttributeTypeDescription withAttributeType(String attributeType) {
        setAttributeType(attributeType);
        return this;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     * 
     * @param description
     *        A description of the attribute.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     * 
     * @return A description of the attribute.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the attribute.
     * </p>
     * 
     * @param description
     *        A description of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttributeTypeDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute, if applicable.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     * 
     * @return The default value of the attribute, if applicable.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the attribute, if applicable.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the attribute, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttributeTypeDescription withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     * 
     * @param cardinality
     *        The cardinality of the attribute.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE(1) : Single value required
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ZERO_OR_ONE(0..1) : Up to one value is allowed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *        </p>
     *        </li>
     */

    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cardinality of the attribute.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE(1) : Single value required
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ZERO_OR_ONE(0..1) : Up to one value is allowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *         </p>
     *         </li>
     */

    public String getCardinality() {
        return this.cardinality;
    }

    /**
     * <p>
     * The cardinality of the attribute.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE(1) : Single value required
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_ONE(0..1) : Up to one value is allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     * </p>
     * </li>
     * <li>
     * <p>
     * ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     * </p>
     * </li>
     * </ul>
     * 
     * @param cardinality
     *        The cardinality of the attribute.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE(1) : Single value required
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ZERO_OR_ONE(0..1) : Up to one value is allowed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ONE_OR_MORE(1..*0) : Required. Multiple values are allowed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyAttributeTypeDescription withCardinality(String cardinality) {
        setCardinality(cardinality);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeType() != null)
            sb.append("AttributeType: ").append(getAttributeType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getCardinality() != null)
            sb.append("Cardinality: ").append(getCardinality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyAttributeTypeDescription == false)
            return false;
        PolicyAttributeTypeDescription other = (PolicyAttributeTypeDescription) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeType() == null ^ this.getAttributeType() == null)
            return false;
        if (other.getAttributeType() != null && other.getAttributeType().equals(this.getAttributeType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getCardinality() == null ^ this.getCardinality() == null)
            return false;
        if (other.getCardinality() != null && other.getCardinality().equals(this.getCardinality()) == false)
            return false;
        return true;
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
    public PolicyAttributeTypeDescription clone() {
        try {
            return (PolicyAttributeTypeDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
