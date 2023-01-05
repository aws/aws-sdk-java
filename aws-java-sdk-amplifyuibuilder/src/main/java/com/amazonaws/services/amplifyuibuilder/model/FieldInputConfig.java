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
 * Describes the configuration for the default input values to display for a field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FieldInputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether a field has a default value.
     * </p>
     */
    private Boolean defaultChecked;
    /**
     * <p>
     * The default country code for a phone number.
     * </p>
     */
    private String defaultCountryCode;
    /**
     * <p>
     * The default value for the field.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The text to display to describe the field.
     * </p>
     */
    private String descriptiveText;
    /**
     * <p>
     * Specifies whether to render the field as an array. This property is ignored if the <code>dataSourceType</code>
     * for the form is a Data Store.
     * </p>
     */
    private Boolean isArray;
    /**
     * <p>
     * The maximum value to display for the field.
     * </p>
     */
    private Float maxValue;
    /**
     * <p>
     * The minimum value to display for the field.
     * </p>
     */
    private Float minValue;
    /**
     * <p>
     * The name of the field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The text to display as a placeholder for the field.
     * </p>
     */
    private String placeholder;
    /**
     * <p>
     * Specifies a read only field.
     * </p>
     */
    private Boolean readOnly;
    /**
     * <p>
     * Specifies a field that requires input.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The stepping increment for a numeric value in a field.
     * </p>
     */
    private Float step;
    /**
     * <p>
     * The input type for the field.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value for the field.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The information to use to customize the input fields with data at runtime.
     * </p>
     */
    private ValueMappings valueMappings;

    /**
     * <p>
     * Specifies whether a field has a default value.
     * </p>
     * 
     * @param defaultChecked
     *        Specifies whether a field has a default value.
     */

    public void setDefaultChecked(Boolean defaultChecked) {
        this.defaultChecked = defaultChecked;
    }

    /**
     * <p>
     * Specifies whether a field has a default value.
     * </p>
     * 
     * @return Specifies whether a field has a default value.
     */

    public Boolean getDefaultChecked() {
        return this.defaultChecked;
    }

    /**
     * <p>
     * Specifies whether a field has a default value.
     * </p>
     * 
     * @param defaultChecked
     *        Specifies whether a field has a default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withDefaultChecked(Boolean defaultChecked) {
        setDefaultChecked(defaultChecked);
        return this;
    }

    /**
     * <p>
     * Specifies whether a field has a default value.
     * </p>
     * 
     * @return Specifies whether a field has a default value.
     */

    public Boolean isDefaultChecked() {
        return this.defaultChecked;
    }

    /**
     * <p>
     * The default country code for a phone number.
     * </p>
     * 
     * @param defaultCountryCode
     *        The default country code for a phone number.
     */

    public void setDefaultCountryCode(String defaultCountryCode) {
        this.defaultCountryCode = defaultCountryCode;
    }

    /**
     * <p>
     * The default country code for a phone number.
     * </p>
     * 
     * @return The default country code for a phone number.
     */

    public String getDefaultCountryCode() {
        return this.defaultCountryCode;
    }

    /**
     * <p>
     * The default country code for a phone number.
     * </p>
     * 
     * @param defaultCountryCode
     *        The default country code for a phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withDefaultCountryCode(String defaultCountryCode) {
        setDefaultCountryCode(defaultCountryCode);
        return this;
    }

    /**
     * <p>
     * The default value for the field.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the field.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the field.
     * </p>
     * 
     * @return The default value for the field.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the field.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The text to display to describe the field.
     * </p>
     * 
     * @param descriptiveText
     *        The text to display to describe the field.
     */

    public void setDescriptiveText(String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }

    /**
     * <p>
     * The text to display to describe the field.
     * </p>
     * 
     * @return The text to display to describe the field.
     */

    public String getDescriptiveText() {
        return this.descriptiveText;
    }

    /**
     * <p>
     * The text to display to describe the field.
     * </p>
     * 
     * @param descriptiveText
     *        The text to display to describe the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withDescriptiveText(String descriptiveText) {
        setDescriptiveText(descriptiveText);
        return this;
    }

    /**
     * <p>
     * Specifies whether to render the field as an array. This property is ignored if the <code>dataSourceType</code>
     * for the form is a Data Store.
     * </p>
     * 
     * @param isArray
     *        Specifies whether to render the field as an array. This property is ignored if the
     *        <code>dataSourceType</code> for the form is a Data Store.
     */

    public void setIsArray(Boolean isArray) {
        this.isArray = isArray;
    }

    /**
     * <p>
     * Specifies whether to render the field as an array. This property is ignored if the <code>dataSourceType</code>
     * for the form is a Data Store.
     * </p>
     * 
     * @return Specifies whether to render the field as an array. This property is ignored if the
     *         <code>dataSourceType</code> for the form is a Data Store.
     */

    public Boolean getIsArray() {
        return this.isArray;
    }

    /**
     * <p>
     * Specifies whether to render the field as an array. This property is ignored if the <code>dataSourceType</code>
     * for the form is a Data Store.
     * </p>
     * 
     * @param isArray
     *        Specifies whether to render the field as an array. This property is ignored if the
     *        <code>dataSourceType</code> for the form is a Data Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withIsArray(Boolean isArray) {
        setIsArray(isArray);
        return this;
    }

    /**
     * <p>
     * Specifies whether to render the field as an array. This property is ignored if the <code>dataSourceType</code>
     * for the form is a Data Store.
     * </p>
     * 
     * @return Specifies whether to render the field as an array. This property is ignored if the
     *         <code>dataSourceType</code> for the form is a Data Store.
     */

    public Boolean isArray() {
        return this.isArray;
    }

    /**
     * <p>
     * The maximum value to display for the field.
     * </p>
     * 
     * @param maxValue
     *        The maximum value to display for the field.
     */

    public void setMaxValue(Float maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum value to display for the field.
     * </p>
     * 
     * @return The maximum value to display for the field.
     */

    public Float getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum value to display for the field.
     * </p>
     * 
     * @param maxValue
     *        The maximum value to display for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withMaxValue(Float maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * <p>
     * The minimum value to display for the field.
     * </p>
     * 
     * @param minValue
     *        The minimum value to display for the field.
     */

    public void setMinValue(Float minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum value to display for the field.
     * </p>
     * 
     * @return The minimum value to display for the field.
     */

    public Float getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum value to display for the field.
     * </p>
     * 
     * @param minValue
     *        The minimum value to display for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withMinValue(Float minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @return The name of the field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param name
     *        The name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The text to display as a placeholder for the field.
     * </p>
     * 
     * @param placeholder
     *        The text to display as a placeholder for the field.
     */

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * <p>
     * The text to display as a placeholder for the field.
     * </p>
     * 
     * @return The text to display as a placeholder for the field.
     */

    public String getPlaceholder() {
        return this.placeholder;
    }

    /**
     * <p>
     * The text to display as a placeholder for the field.
     * </p>
     * 
     * @param placeholder
     *        The text to display as a placeholder for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withPlaceholder(String placeholder) {
        setPlaceholder(placeholder);
        return this;
    }

    /**
     * <p>
     * Specifies a read only field.
     * </p>
     * 
     * @param readOnly
     *        Specifies a read only field.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * Specifies a read only field.
     * </p>
     * 
     * @return Specifies a read only field.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Specifies a read only field.
     * </p>
     * 
     * @param readOnly
     *        Specifies a read only field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * Specifies a read only field.
     * </p>
     * 
     * @return Specifies a read only field.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * Specifies a field that requires input.
     * </p>
     * 
     * @param required
     *        Specifies a field that requires input.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Specifies a field that requires input.
     * </p>
     * 
     * @return Specifies a field that requires input.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Specifies a field that requires input.
     * </p>
     * 
     * @param required
     *        Specifies a field that requires input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Specifies a field that requires input.
     * </p>
     * 
     * @return Specifies a field that requires input.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The stepping increment for a numeric value in a field.
     * </p>
     * 
     * @param step
     *        The stepping increment for a numeric value in a field.
     */

    public void setStep(Float step) {
        this.step = step;
    }

    /**
     * <p>
     * The stepping increment for a numeric value in a field.
     * </p>
     * 
     * @return The stepping increment for a numeric value in a field.
     */

    public Float getStep() {
        return this.step;
    }

    /**
     * <p>
     * The stepping increment for a numeric value in a field.
     * </p>
     * 
     * @param step
     *        The stepping increment for a numeric value in a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withStep(Float step) {
        setStep(step);
        return this;
    }

    /**
     * <p>
     * The input type for the field.
     * </p>
     * 
     * @param type
     *        The input type for the field.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The input type for the field.
     * </p>
     * 
     * @return The input type for the field.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The input type for the field.
     * </p>
     * 
     * @param type
     *        The input type for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The value for the field.
     * </p>
     * 
     * @param value
     *        The value for the field.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the field.
     * </p>
     * 
     * @return The value for the field.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the field.
     * </p>
     * 
     * @param value
     *        The value for the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The information to use to customize the input fields with data at runtime.
     * </p>
     * 
     * @param valueMappings
     *        The information to use to customize the input fields with data at runtime.
     */

    public void setValueMappings(ValueMappings valueMappings) {
        this.valueMappings = valueMappings;
    }

    /**
     * <p>
     * The information to use to customize the input fields with data at runtime.
     * </p>
     * 
     * @return The information to use to customize the input fields with data at runtime.
     */

    public ValueMappings getValueMappings() {
        return this.valueMappings;
    }

    /**
     * <p>
     * The information to use to customize the input fields with data at runtime.
     * </p>
     * 
     * @param valueMappings
     *        The information to use to customize the input fields with data at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldInputConfig withValueMappings(ValueMappings valueMappings) {
        setValueMappings(valueMappings);
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
        if (getDefaultChecked() != null)
            sb.append("DefaultChecked: ").append(getDefaultChecked()).append(",");
        if (getDefaultCountryCode() != null)
            sb.append("DefaultCountryCode: ").append(getDefaultCountryCode()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescriptiveText() != null)
            sb.append("DescriptiveText: ").append(getDescriptiveText()).append(",");
        if (getIsArray() != null)
            sb.append("IsArray: ").append(getIsArray()).append(",");
        if (getMaxValue() != null)
            sb.append("MaxValue: ").append(getMaxValue()).append(",");
        if (getMinValue() != null)
            sb.append("MinValue: ").append(getMinValue()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlaceholder() != null)
            sb.append("Placeholder: ").append(getPlaceholder()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getStep() != null)
            sb.append("Step: ").append(getStep()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getValueMappings() != null)
            sb.append("ValueMappings: ").append(getValueMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldInputConfig == false)
            return false;
        FieldInputConfig other = (FieldInputConfig) obj;
        if (other.getDefaultChecked() == null ^ this.getDefaultChecked() == null)
            return false;
        if (other.getDefaultChecked() != null && other.getDefaultChecked().equals(this.getDefaultChecked()) == false)
            return false;
        if (other.getDefaultCountryCode() == null ^ this.getDefaultCountryCode() == null)
            return false;
        if (other.getDefaultCountryCode() != null && other.getDefaultCountryCode().equals(this.getDefaultCountryCode()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescriptiveText() == null ^ this.getDescriptiveText() == null)
            return false;
        if (other.getDescriptiveText() != null && other.getDescriptiveText().equals(this.getDescriptiveText()) == false)
            return false;
        if (other.getIsArray() == null ^ this.getIsArray() == null)
            return false;
        if (other.getIsArray() != null && other.getIsArray().equals(this.getIsArray()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaceholder() == null ^ this.getPlaceholder() == null)
            return false;
        if (other.getPlaceholder() != null && other.getPlaceholder().equals(this.getPlaceholder()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getStep() == null ^ this.getStep() == null)
            return false;
        if (other.getStep() != null && other.getStep().equals(this.getStep()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValueMappings() == null ^ this.getValueMappings() == null)
            return false;
        if (other.getValueMappings() != null && other.getValueMappings().equals(this.getValueMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultChecked() == null) ? 0 : getDefaultChecked().hashCode());
        hashCode = prime * hashCode + ((getDefaultCountryCode() == null) ? 0 : getDefaultCountryCode().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescriptiveText() == null) ? 0 : getDescriptiveText().hashCode());
        hashCode = prime * hashCode + ((getIsArray() == null) ? 0 : getIsArray().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaceholder() == null) ? 0 : getPlaceholder().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getStep() == null) ? 0 : getStep().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getValueMappings() == null) ? 0 : getValueMappings().hashCode());
        return hashCode;
    }

    @Override
    public FieldInputConfig clone() {
        try {
            return (FieldInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FieldInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
