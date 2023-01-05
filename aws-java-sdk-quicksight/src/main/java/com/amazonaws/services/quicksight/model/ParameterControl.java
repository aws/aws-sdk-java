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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The control of a parameter that users can interact with in a dashboard or an analysis.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A control from a date parameter that specifies date and time.
     * </p>
     */
    private ParameterDateTimePickerControl dateTimePicker;
    /**
     * <p>
     * A control to display a list with buttons or boxes that are used to select either a single value or multiple
     * values.
     * </p>
     */
    private ParameterListControl list;
    /**
     * <p>
     * A control to display a dropdown list with buttons that are used to select a single value.
     * </p>
     */
    private ParameterDropDownControl dropdown;
    /**
     * <p>
     * A control to display a text box that is used to enter a single entry.
     * </p>
     */
    private ParameterTextFieldControl textField;
    /**
     * <p>
     * A control to display a text box that is used to enter multiple entries.
     * </p>
     */
    private ParameterTextAreaControl textArea;
    /**
     * <p>
     * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     * </p>
     */
    private ParameterSliderControl slider;

    /**
     * <p>
     * A control from a date parameter that specifies date and time.
     * </p>
     * 
     * @param dateTimePicker
     *        A control from a date parameter that specifies date and time.
     */

    public void setDateTimePicker(ParameterDateTimePickerControl dateTimePicker) {
        this.dateTimePicker = dateTimePicker;
    }

    /**
     * <p>
     * A control from a date parameter that specifies date and time.
     * </p>
     * 
     * @return A control from a date parameter that specifies date and time.
     */

    public ParameterDateTimePickerControl getDateTimePicker() {
        return this.dateTimePicker;
    }

    /**
     * <p>
     * A control from a date parameter that specifies date and time.
     * </p>
     * 
     * @param dateTimePicker
     *        A control from a date parameter that specifies date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withDateTimePicker(ParameterDateTimePickerControl dateTimePicker) {
        setDateTimePicker(dateTimePicker);
        return this;
    }

    /**
     * <p>
     * A control to display a list with buttons or boxes that are used to select either a single value or multiple
     * values.
     * </p>
     * 
     * @param list
     *        A control to display a list with buttons or boxes that are used to select either a single value or
     *        multiple values.
     */

    public void setList(ParameterListControl list) {
        this.list = list;
    }

    /**
     * <p>
     * A control to display a list with buttons or boxes that are used to select either a single value or multiple
     * values.
     * </p>
     * 
     * @return A control to display a list with buttons or boxes that are used to select either a single value or
     *         multiple values.
     */

    public ParameterListControl getList() {
        return this.list;
    }

    /**
     * <p>
     * A control to display a list with buttons or boxes that are used to select either a single value or multiple
     * values.
     * </p>
     * 
     * @param list
     *        A control to display a list with buttons or boxes that are used to select either a single value or
     *        multiple values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withList(ParameterListControl list) {
        setList(list);
        return this;
    }

    /**
     * <p>
     * A control to display a dropdown list with buttons that are used to select a single value.
     * </p>
     * 
     * @param dropdown
     *        A control to display a dropdown list with buttons that are used to select a single value.
     */

    public void setDropdown(ParameterDropDownControl dropdown) {
        this.dropdown = dropdown;
    }

    /**
     * <p>
     * A control to display a dropdown list with buttons that are used to select a single value.
     * </p>
     * 
     * @return A control to display a dropdown list with buttons that are used to select a single value.
     */

    public ParameterDropDownControl getDropdown() {
        return this.dropdown;
    }

    /**
     * <p>
     * A control to display a dropdown list with buttons that are used to select a single value.
     * </p>
     * 
     * @param dropdown
     *        A control to display a dropdown list with buttons that are used to select a single value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withDropdown(ParameterDropDownControl dropdown) {
        setDropdown(dropdown);
        return this;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter a single entry.
     * </p>
     * 
     * @param textField
     *        A control to display a text box that is used to enter a single entry.
     */

    public void setTextField(ParameterTextFieldControl textField) {
        this.textField = textField;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter a single entry.
     * </p>
     * 
     * @return A control to display a text box that is used to enter a single entry.
     */

    public ParameterTextFieldControl getTextField() {
        return this.textField;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter a single entry.
     * </p>
     * 
     * @param textField
     *        A control to display a text box that is used to enter a single entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withTextField(ParameterTextFieldControl textField) {
        setTextField(textField);
        return this;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter multiple entries.
     * </p>
     * 
     * @param textArea
     *        A control to display a text box that is used to enter multiple entries.
     */

    public void setTextArea(ParameterTextAreaControl textArea) {
        this.textArea = textArea;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter multiple entries.
     * </p>
     * 
     * @return A control to display a text box that is used to enter multiple entries.
     */

    public ParameterTextAreaControl getTextArea() {
        return this.textArea;
    }

    /**
     * <p>
     * A control to display a text box that is used to enter multiple entries.
     * </p>
     * 
     * @param textArea
     *        A control to display a text box that is used to enter multiple entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withTextArea(ParameterTextAreaControl textArea) {
        setTextArea(textArea);
        return this;
    }

    /**
     * <p>
     * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     * </p>
     * 
     * @param slider
     *        A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     */

    public void setSlider(ParameterSliderControl slider) {
        this.slider = slider;
    }

    /**
     * <p>
     * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     * </p>
     * 
     * @return A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     */

    public ParameterSliderControl getSlider() {
        return this.slider;
    }

    /**
     * <p>
     * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     * </p>
     * 
     * @param slider
     *        A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterControl withSlider(ParameterSliderControl slider) {
        setSlider(slider);
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
        if (getDateTimePicker() != null)
            sb.append("DateTimePicker: ").append(getDateTimePicker()).append(",");
        if (getList() != null)
            sb.append("List: ").append(getList()).append(",");
        if (getDropdown() != null)
            sb.append("Dropdown: ").append(getDropdown()).append(",");
        if (getTextField() != null)
            sb.append("TextField: ").append(getTextField()).append(",");
        if (getTextArea() != null)
            sb.append("TextArea: ").append(getTextArea()).append(",");
        if (getSlider() != null)
            sb.append("Slider: ").append(getSlider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterControl == false)
            return false;
        ParameterControl other = (ParameterControl) obj;
        if (other.getDateTimePicker() == null ^ this.getDateTimePicker() == null)
            return false;
        if (other.getDateTimePicker() != null && other.getDateTimePicker().equals(this.getDateTimePicker()) == false)
            return false;
        if (other.getList() == null ^ this.getList() == null)
            return false;
        if (other.getList() != null && other.getList().equals(this.getList()) == false)
            return false;
        if (other.getDropdown() == null ^ this.getDropdown() == null)
            return false;
        if (other.getDropdown() != null && other.getDropdown().equals(this.getDropdown()) == false)
            return false;
        if (other.getTextField() == null ^ this.getTextField() == null)
            return false;
        if (other.getTextField() != null && other.getTextField().equals(this.getTextField()) == false)
            return false;
        if (other.getTextArea() == null ^ this.getTextArea() == null)
            return false;
        if (other.getTextArea() != null && other.getTextArea().equals(this.getTextArea()) == false)
            return false;
        if (other.getSlider() == null ^ this.getSlider() == null)
            return false;
        if (other.getSlider() != null && other.getSlider().equals(this.getSlider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateTimePicker() == null) ? 0 : getDateTimePicker().hashCode());
        hashCode = prime * hashCode + ((getList() == null) ? 0 : getList().hashCode());
        hashCode = prime * hashCode + ((getDropdown() == null) ? 0 : getDropdown().hashCode());
        hashCode = prime * hashCode + ((getTextField() == null) ? 0 : getTextField().hashCode());
        hashCode = prime * hashCode + ((getTextArea() == null) ? 0 : getTextArea().hashCode());
        hashCode = prime * hashCode + ((getSlider() == null) ? 0 : getSlider().hashCode());
        return hashCode;
    }

    @Override
    public ParameterControl clone() {
        try {
            return (ParameterControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
