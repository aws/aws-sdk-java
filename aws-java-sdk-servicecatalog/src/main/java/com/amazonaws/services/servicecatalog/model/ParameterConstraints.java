/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The constraints that the administrator has put on the parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ParameterConstraints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterConstraints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values that the administrator has allowed for the parameter.
     * </p>
     */
    private java.util.List<String> allowedValues;
    /**
     * <p>
     * A regular expression that represents the patterns that allow for <code>String</code> types. The pattern must
     * match the entire parameter value provided.
     * </p>
     */
    private String allowedPattern;
    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following error
     * message when the user specifies an invalid value:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     * </p>
     * <p>
     * By adding a constraint description, such as must only contain letters (uppercase and lowercase) and numbers, you
     * can display the following customized error message:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     * </p>
     */
    private String constraintDescription;
    /**
     * <p>
     * An integer value that determines the largest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     */
    private String maxLength;
    /**
     * <p>
     * An integer value that determines the smallest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     */
    private String minLength;
    /**
     * <p>
     * A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     * </p>
     */
    private String maxValue;
    /**
     * <p>
     * A numeric value that determines the smallest numeric value you want to allow for <code>Number</code> types.
     * </p>
     */
    private String minValue;

    /**
     * <p>
     * The values that the administrator has allowed for the parameter.
     * </p>
     * 
     * @return The values that the administrator has allowed for the parameter.
     */

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The values that the administrator has allowed for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The values that the administrator has allowed for the parameter.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<String>(allowedValues);
    }

    /**
     * <p>
     * The values that the administrator has allowed for the parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        The values that the administrator has allowed for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values that the administrator has allowed for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The values that the administrator has allowed for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * A regular expression that represents the patterns that allow for <code>String</code> types. The pattern must
     * match the entire parameter value provided.
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression that represents the patterns that allow for <code>String</code> types. The pattern
     *        must match the entire parameter value provided.
     */

    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * A regular expression that represents the patterns that allow for <code>String</code> types. The pattern must
     * match the entire parameter value provided.
     * </p>
     * 
     * @return A regular expression that represents the patterns that allow for <code>String</code> types. The pattern
     *         must match the entire parameter value provided.
     */

    public String getAllowedPattern() {
        return this.allowedPattern;
    }

    /**
     * <p>
     * A regular expression that represents the patterns that allow for <code>String</code> types. The pattern must
     * match the entire parameter value provided.
     * </p>
     * 
     * @param allowedPattern
     *        A regular expression that represents the patterns that allow for <code>String</code> types. The pattern
     *        must match the entire parameter value provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withAllowedPattern(String allowedPattern) {
        setAllowedPattern(allowedPattern);
        return this;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following error
     * message when the user specifies an invalid value:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     * </p>
     * <p>
     * By adding a constraint description, such as must only contain letters (uppercase and lowercase) and numbers, you
     * can display the following customized error message:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     * </p>
     * 
     * @param constraintDescription
     *        A string that explains a constraint when the constraint is violated. For example, without a constraint
     *        description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following
     *        error message when the user specifies an invalid value:</p>
     *        <p>
     *        <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     *        </p>
     *        <p>
     *        By adding a constraint description, such as must only contain letters (uppercase and lowercase) and
     *        numbers, you can display the following customized error message:
     *        </p>
     *        <p>
     *        <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     */

    public void setConstraintDescription(String constraintDescription) {
        this.constraintDescription = constraintDescription;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following error
     * message when the user specifies an invalid value:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     * </p>
     * <p>
     * By adding a constraint description, such as must only contain letters (uppercase and lowercase) and numbers, you
     * can display the following customized error message:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     * </p>
     * 
     * @return A string that explains a constraint when the constraint is violated. For example, without a constraint
     *         description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following
     *         error message when the user specifies an invalid value:</p>
     *         <p>
     *         <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     *         </p>
     *         <p>
     *         By adding a constraint description, such as must only contain letters (uppercase and lowercase) and
     *         numbers, you can display the following customized error message:
     *         </p>
     *         <p>
     *         <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     */

    public String getConstraintDescription() {
        return this.constraintDescription;
    }

    /**
     * <p>
     * A string that explains a constraint when the constraint is violated. For example, without a constraint
     * description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following error
     * message when the user specifies an invalid value:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     * </p>
     * <p>
     * By adding a constraint description, such as must only contain letters (uppercase and lowercase) and numbers, you
     * can display the following customized error message:
     * </p>
     * <p>
     * <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     * </p>
     * 
     * @param constraintDescription
     *        A string that explains a constraint when the constraint is violated. For example, without a constraint
     *        description, a parameter that has an allowed pattern of <code>[A-Za-z0-9]+</code> displays the following
     *        error message when the user specifies an invalid value:</p>
     *        <p>
     *        <code>Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+</code>
     *        </p>
     *        <p>
     *        By adding a constraint description, such as must only contain letters (uppercase and lowercase) and
     *        numbers, you can display the following customized error message:
     *        </p>
     *        <p>
     *        <code>Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withConstraintDescription(String constraintDescription) {
        setConstraintDescription(constraintDescription);
        return this;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @param maxLength
     *        An integer value that determines the largest number of characters you want to allow for
     *        <code>String</code> types.
     */

    public void setMaxLength(String maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @return An integer value that determines the largest number of characters you want to allow for
     *         <code>String</code> types.
     */

    public String getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * An integer value that determines the largest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @param maxLength
     *        An integer value that determines the largest number of characters you want to allow for
     *        <code>String</code> types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withMaxLength(String maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @param minLength
     *        An integer value that determines the smallest number of characters you want to allow for
     *        <code>String</code> types.
     */

    public void setMinLength(String minLength) {
        this.minLength = minLength;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @return An integer value that determines the smallest number of characters you want to allow for
     *         <code>String</code> types.
     */

    public String getMinLength() {
        return this.minLength;
    }

    /**
     * <p>
     * An integer value that determines the smallest number of characters you want to allow for <code>String</code>
     * types.
     * </p>
     * 
     * @param minLength
     *        An integer value that determines the smallest number of characters you want to allow for
     *        <code>String</code> types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withMinLength(String minLength) {
        setMinLength(minLength);
        return this;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @param maxValue
     *        A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     */

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @return A numeric value that determines the largest numeric value you want to allow for <code>Number</code>
     *         types.
     */

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @param maxValue
     *        A numeric value that determines the largest numeric value you want to allow for <code>Number</code> types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withMaxValue(String maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @param minValue
     *        A numeric value that determines the smallest numeric value you want to allow for <code>Number</code>
     *        types.
     */

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @return A numeric value that determines the smallest numeric value you want to allow for <code>Number</code>
     *         types.
     */

    public String getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * A numeric value that determines the smallest numeric value you want to allow for <code>Number</code> types.
     * </p>
     * 
     * @param minValue
     *        A numeric value that determines the smallest numeric value you want to allow for <code>Number</code>
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withMinValue(String minValue) {
        setMinValue(minValue);
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: ").append(getAllowedPattern()).append(",");
        if (getConstraintDescription() != null)
            sb.append("ConstraintDescription: ").append(getConstraintDescription()).append(",");
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength()).append(",");
        if (getMinLength() != null)
            sb.append("MinLength: ").append(getMinLength()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterConstraints == false)
            return false;
        ParameterConstraints other = (ParameterConstraints) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        if (other.getConstraintDescription() == null ^ this.getConstraintDescription() == null)
            return false;
        if (other.getConstraintDescription() != null && other.getConstraintDescription().equals(this.getConstraintDescription()) == false)
            return false;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        if (other.getMinLength() == null ^ this.getMinLength() == null)
            return false;
        if (other.getMinLength() != null && other.getMinLength().equals(this.getMinLength()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        hashCode = prime * hashCode + ((getConstraintDescription() == null) ? 0 : getConstraintDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        hashCode = prime * hashCode + ((getMinLength() == null) ? 0 : getMinLength().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterConstraints clone() {
        try {
            return (ParameterConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ParameterConstraintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
