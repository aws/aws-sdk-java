/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration information for a field in a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FieldConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to hide a field.
     * </p>
     */
    private Boolean excluded;
    /**
     * <p>
     * Describes the configuration for the default input value to display for a field.
     * </p>
     */
    private FieldInputConfig inputType;
    /**
     * <p>
     * The label for the field.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Specifies the field position.
     * </p>
     */
    private FieldPosition position;
    /**
     * <p>
     * The validations to perform on the value in the field.
     * </p>
     */
    private java.util.List<FieldValidationConfiguration> validations;

    /**
     * <p>
     * Specifies whether to hide a field.
     * </p>
     * 
     * @param excluded
     *        Specifies whether to hide a field.
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Specifies whether to hide a field.
     * </p>
     * 
     * @return Specifies whether to hide a field.
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Specifies whether to hide a field.
     * </p>
     * 
     * @param excluded
     *        Specifies whether to hide a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Specifies whether to hide a field.
     * </p>
     * 
     * @return Specifies whether to hide a field.
     */

    public Boolean isExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Describes the configuration for the default input value to display for a field.
     * </p>
     * 
     * @param inputType
     *        Describes the configuration for the default input value to display for a field.
     */

    public void setInputType(FieldInputConfig inputType) {
        this.inputType = inputType;
    }

    /**
     * <p>
     * Describes the configuration for the default input value to display for a field.
     * </p>
     * 
     * @return Describes the configuration for the default input value to display for a field.
     */

    public FieldInputConfig getInputType() {
        return this.inputType;
    }

    /**
     * <p>
     * Describes the configuration for the default input value to display for a field.
     * </p>
     * 
     * @param inputType
     *        Describes the configuration for the default input value to display for a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withInputType(FieldInputConfig inputType) {
        setInputType(inputType);
        return this;
    }

    /**
     * <p>
     * The label for the field.
     * </p>
     * 
     * @param label
     *        The label for the field.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label for the field.
     * </p>
     * 
     * @return The label for the field.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label for the field.
     * </p>
     * 
     * @param label
     *        The label for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Specifies the field position.
     * </p>
     * 
     * @param position
     *        Specifies the field position.
     */

    public void setPosition(FieldPosition position) {
        this.position = position;
    }

    /**
     * <p>
     * Specifies the field position.
     * </p>
     * 
     * @return Specifies the field position.
     */

    public FieldPosition getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Specifies the field position.
     * </p>
     * 
     * @param position
     *        Specifies the field position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withPosition(FieldPosition position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The validations to perform on the value in the field.
     * </p>
     * 
     * @return The validations to perform on the value in the field.
     */

    public java.util.List<FieldValidationConfiguration> getValidations() {
        return validations;
    }

    /**
     * <p>
     * The validations to perform on the value in the field.
     * </p>
     * 
     * @param validations
     *        The validations to perform on the value in the field.
     */

    public void setValidations(java.util.Collection<FieldValidationConfiguration> validations) {
        if (validations == null) {
            this.validations = null;
            return;
        }

        this.validations = new java.util.ArrayList<FieldValidationConfiguration>(validations);
    }

    /**
     * <p>
     * The validations to perform on the value in the field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidations(java.util.Collection)} or {@link #withValidations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validations
     *        The validations to perform on the value in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withValidations(FieldValidationConfiguration... validations) {
        if (this.validations == null) {
            setValidations(new java.util.ArrayList<FieldValidationConfiguration>(validations.length));
        }
        for (FieldValidationConfiguration ele : validations) {
            this.validations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validations to perform on the value in the field.
     * </p>
     * 
     * @param validations
     *        The validations to perform on the value in the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldConfig withValidations(java.util.Collection<FieldValidationConfiguration> validations) {
        setValidations(validations);
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
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getInputType() != null)
            sb.append("InputType: ").append(getInputType()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getValidations() != null)
            sb.append("Validations: ").append(getValidations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldConfig == false)
            return false;
        FieldConfig other = (FieldConfig) obj;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getInputType() == null ^ this.getInputType() == null)
            return false;
        if (other.getInputType() != null && other.getInputType().equals(this.getInputType()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getValidations() == null ^ this.getValidations() == null)
            return false;
        if (other.getValidations() != null && other.getValidations().equals(this.getValidations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getInputType() == null) ? 0 : getInputType().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getValidations() == null) ? 0 : getValidations().hashCode());
        return hashCode;
    }

    @Override
    public FieldConfig clone() {
        try {
            return (FieldConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FieldConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
