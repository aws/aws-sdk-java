/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The option that corresponds to the control type of the filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DefaultFilterControlOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultFilterControlOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     * </p>
     */
    private DefaultDateTimePickerControlOptions defaultDateTimePickerOptions;
    /**
     * <p>
     * The default options that correspond to the <code>List</code> filter control type.
     * </p>
     */
    private DefaultFilterListControlOptions defaultListOptions;
    /**
     * <p>
     * The default options that correspond to the <code>Dropdown</code> filter control type.
     * </p>
     */
    private DefaultFilterDropDownControlOptions defaultDropdownOptions;
    /**
     * <p>
     * The default options that correspond to the <code>TextField</code> filter control type.
     * </p>
     */
    private DefaultTextFieldControlOptions defaultTextFieldOptions;
    /**
     * <p>
     * The default options that correspond to the <code>TextArea</code> filter control type.
     * </p>
     */
    private DefaultTextAreaControlOptions defaultTextAreaOptions;
    /**
     * <p>
     * The default options that correspond to the <code>Slider</code> filter control type.
     * </p>
     */
    private DefaultSliderControlOptions defaultSliderOptions;
    /**
     * <p>
     * The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     * </p>
     */
    private DefaultRelativeDateTimeControlOptions defaultRelativeDateTimeOptions;

    /**
     * <p>
     * The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     * </p>
     * 
     * @param defaultDateTimePickerOptions
     *        The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     */

    public void setDefaultDateTimePickerOptions(DefaultDateTimePickerControlOptions defaultDateTimePickerOptions) {
        this.defaultDateTimePickerOptions = defaultDateTimePickerOptions;
    }

    /**
     * <p>
     * The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     * </p>
     * 
     * @return The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     */

    public DefaultDateTimePickerControlOptions getDefaultDateTimePickerOptions() {
        return this.defaultDateTimePickerOptions;
    }

    /**
     * <p>
     * The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     * </p>
     * 
     * @param defaultDateTimePickerOptions
     *        The default options that correspond to the filter control type of a <code>DateTimePicker</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultDateTimePickerOptions(DefaultDateTimePickerControlOptions defaultDateTimePickerOptions) {
        setDefaultDateTimePickerOptions(defaultDateTimePickerOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>List</code> filter control type.
     * </p>
     * 
     * @param defaultListOptions
     *        The default options that correspond to the <code>List</code> filter control type.
     */

    public void setDefaultListOptions(DefaultFilterListControlOptions defaultListOptions) {
        this.defaultListOptions = defaultListOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>List</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>List</code> filter control type.
     */

    public DefaultFilterListControlOptions getDefaultListOptions() {
        return this.defaultListOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>List</code> filter control type.
     * </p>
     * 
     * @param defaultListOptions
     *        The default options that correspond to the <code>List</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultListOptions(DefaultFilterListControlOptions defaultListOptions) {
        setDefaultListOptions(defaultListOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Dropdown</code> filter control type.
     * </p>
     * 
     * @param defaultDropdownOptions
     *        The default options that correspond to the <code>Dropdown</code> filter control type.
     */

    public void setDefaultDropdownOptions(DefaultFilterDropDownControlOptions defaultDropdownOptions) {
        this.defaultDropdownOptions = defaultDropdownOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Dropdown</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>Dropdown</code> filter control type.
     */

    public DefaultFilterDropDownControlOptions getDefaultDropdownOptions() {
        return this.defaultDropdownOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Dropdown</code> filter control type.
     * </p>
     * 
     * @param defaultDropdownOptions
     *        The default options that correspond to the <code>Dropdown</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultDropdownOptions(DefaultFilterDropDownControlOptions defaultDropdownOptions) {
        setDefaultDropdownOptions(defaultDropdownOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextField</code> filter control type.
     * </p>
     * 
     * @param defaultTextFieldOptions
     *        The default options that correspond to the <code>TextField</code> filter control type.
     */

    public void setDefaultTextFieldOptions(DefaultTextFieldControlOptions defaultTextFieldOptions) {
        this.defaultTextFieldOptions = defaultTextFieldOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextField</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>TextField</code> filter control type.
     */

    public DefaultTextFieldControlOptions getDefaultTextFieldOptions() {
        return this.defaultTextFieldOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextField</code> filter control type.
     * </p>
     * 
     * @param defaultTextFieldOptions
     *        The default options that correspond to the <code>TextField</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultTextFieldOptions(DefaultTextFieldControlOptions defaultTextFieldOptions) {
        setDefaultTextFieldOptions(defaultTextFieldOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextArea</code> filter control type.
     * </p>
     * 
     * @param defaultTextAreaOptions
     *        The default options that correspond to the <code>TextArea</code> filter control type.
     */

    public void setDefaultTextAreaOptions(DefaultTextAreaControlOptions defaultTextAreaOptions) {
        this.defaultTextAreaOptions = defaultTextAreaOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextArea</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>TextArea</code> filter control type.
     */

    public DefaultTextAreaControlOptions getDefaultTextAreaOptions() {
        return this.defaultTextAreaOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>TextArea</code> filter control type.
     * </p>
     * 
     * @param defaultTextAreaOptions
     *        The default options that correspond to the <code>TextArea</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultTextAreaOptions(DefaultTextAreaControlOptions defaultTextAreaOptions) {
        setDefaultTextAreaOptions(defaultTextAreaOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Slider</code> filter control type.
     * </p>
     * 
     * @param defaultSliderOptions
     *        The default options that correspond to the <code>Slider</code> filter control type.
     */

    public void setDefaultSliderOptions(DefaultSliderControlOptions defaultSliderOptions) {
        this.defaultSliderOptions = defaultSliderOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Slider</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>Slider</code> filter control type.
     */

    public DefaultSliderControlOptions getDefaultSliderOptions() {
        return this.defaultSliderOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>Slider</code> filter control type.
     * </p>
     * 
     * @param defaultSliderOptions
     *        The default options that correspond to the <code>Slider</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultSliderOptions(DefaultSliderControlOptions defaultSliderOptions) {
        setDefaultSliderOptions(defaultSliderOptions);
        return this;
    }

    /**
     * <p>
     * The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     * </p>
     * 
     * @param defaultRelativeDateTimeOptions
     *        The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     */

    public void setDefaultRelativeDateTimeOptions(DefaultRelativeDateTimeControlOptions defaultRelativeDateTimeOptions) {
        this.defaultRelativeDateTimeOptions = defaultRelativeDateTimeOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     * </p>
     * 
     * @return The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     */

    public DefaultRelativeDateTimeControlOptions getDefaultRelativeDateTimeOptions() {
        return this.defaultRelativeDateTimeOptions;
    }

    /**
     * <p>
     * The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     * </p>
     * 
     * @param defaultRelativeDateTimeOptions
     *        The default options that correspond to the <code>RelativeDateTime</code> filter control type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultFilterControlOptions withDefaultRelativeDateTimeOptions(DefaultRelativeDateTimeControlOptions defaultRelativeDateTimeOptions) {
        setDefaultRelativeDateTimeOptions(defaultRelativeDateTimeOptions);
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
        if (getDefaultDateTimePickerOptions() != null)
            sb.append("DefaultDateTimePickerOptions: ").append(getDefaultDateTimePickerOptions()).append(",");
        if (getDefaultListOptions() != null)
            sb.append("DefaultListOptions: ").append(getDefaultListOptions()).append(",");
        if (getDefaultDropdownOptions() != null)
            sb.append("DefaultDropdownOptions: ").append(getDefaultDropdownOptions()).append(",");
        if (getDefaultTextFieldOptions() != null)
            sb.append("DefaultTextFieldOptions: ").append(getDefaultTextFieldOptions()).append(",");
        if (getDefaultTextAreaOptions() != null)
            sb.append("DefaultTextAreaOptions: ").append(getDefaultTextAreaOptions()).append(",");
        if (getDefaultSliderOptions() != null)
            sb.append("DefaultSliderOptions: ").append(getDefaultSliderOptions()).append(",");
        if (getDefaultRelativeDateTimeOptions() != null)
            sb.append("DefaultRelativeDateTimeOptions: ").append(getDefaultRelativeDateTimeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultFilterControlOptions == false)
            return false;
        DefaultFilterControlOptions other = (DefaultFilterControlOptions) obj;
        if (other.getDefaultDateTimePickerOptions() == null ^ this.getDefaultDateTimePickerOptions() == null)
            return false;
        if (other.getDefaultDateTimePickerOptions() != null && other.getDefaultDateTimePickerOptions().equals(this.getDefaultDateTimePickerOptions()) == false)
            return false;
        if (other.getDefaultListOptions() == null ^ this.getDefaultListOptions() == null)
            return false;
        if (other.getDefaultListOptions() != null && other.getDefaultListOptions().equals(this.getDefaultListOptions()) == false)
            return false;
        if (other.getDefaultDropdownOptions() == null ^ this.getDefaultDropdownOptions() == null)
            return false;
        if (other.getDefaultDropdownOptions() != null && other.getDefaultDropdownOptions().equals(this.getDefaultDropdownOptions()) == false)
            return false;
        if (other.getDefaultTextFieldOptions() == null ^ this.getDefaultTextFieldOptions() == null)
            return false;
        if (other.getDefaultTextFieldOptions() != null && other.getDefaultTextFieldOptions().equals(this.getDefaultTextFieldOptions()) == false)
            return false;
        if (other.getDefaultTextAreaOptions() == null ^ this.getDefaultTextAreaOptions() == null)
            return false;
        if (other.getDefaultTextAreaOptions() != null && other.getDefaultTextAreaOptions().equals(this.getDefaultTextAreaOptions()) == false)
            return false;
        if (other.getDefaultSliderOptions() == null ^ this.getDefaultSliderOptions() == null)
            return false;
        if (other.getDefaultSliderOptions() != null && other.getDefaultSliderOptions().equals(this.getDefaultSliderOptions()) == false)
            return false;
        if (other.getDefaultRelativeDateTimeOptions() == null ^ this.getDefaultRelativeDateTimeOptions() == null)
            return false;
        if (other.getDefaultRelativeDateTimeOptions() != null
                && other.getDefaultRelativeDateTimeOptions().equals(this.getDefaultRelativeDateTimeOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultDateTimePickerOptions() == null) ? 0 : getDefaultDateTimePickerOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultListOptions() == null) ? 0 : getDefaultListOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultDropdownOptions() == null) ? 0 : getDefaultDropdownOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultTextFieldOptions() == null) ? 0 : getDefaultTextFieldOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultTextAreaOptions() == null) ? 0 : getDefaultTextAreaOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultSliderOptions() == null) ? 0 : getDefaultSliderOptions().hashCode());
        hashCode = prime * hashCode + ((getDefaultRelativeDateTimeOptions() == null) ? 0 : getDefaultRelativeDateTimeOptions().hashCode());
        return hashCode;
    }

    @Override
    public DefaultFilterControlOptions clone() {
        try {
            return (DefaultFilterControlOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DefaultFilterControlOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
