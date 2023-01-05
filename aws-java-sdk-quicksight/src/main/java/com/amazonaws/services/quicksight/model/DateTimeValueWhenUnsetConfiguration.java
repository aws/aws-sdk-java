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
 * The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DateTimeValueWhenUnsetConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DateTimeValueWhenUnsetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The built-in options for default values. The value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECOMMENDED</code>: The recommended value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULL</code>: The <code>NULL</code> value.
     * </p>
     * </li>
     * </ul>
     */
    private String valueWhenUnsetOption;
    /**
     * <p>
     * A custom value that's used when the value of a parameter isn't set.
     * </p>
     */
    private java.util.Date customValue;

    /**
     * <p>
     * The built-in options for default values. The value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECOMMENDED</code>: The recommended value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULL</code>: The <code>NULL</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueWhenUnsetOption
     *        The built-in options for default values. The value can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECOMMENDED</code>: The recommended value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULL</code>: The <code>NULL</code> value.
     *        </p>
     *        </li>
     * @see ValueWhenUnsetOption
     */

    public void setValueWhenUnsetOption(String valueWhenUnsetOption) {
        this.valueWhenUnsetOption = valueWhenUnsetOption;
    }

    /**
     * <p>
     * The built-in options for default values. The value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECOMMENDED</code>: The recommended value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULL</code>: The <code>NULL</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The built-in options for default values. The value can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RECOMMENDED</code>: The recommended value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NULL</code>: The <code>NULL</code> value.
     *         </p>
     *         </li>
     * @see ValueWhenUnsetOption
     */

    public String getValueWhenUnsetOption() {
        return this.valueWhenUnsetOption;
    }

    /**
     * <p>
     * The built-in options for default values. The value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECOMMENDED</code>: The recommended value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULL</code>: The <code>NULL</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueWhenUnsetOption
     *        The built-in options for default values. The value can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECOMMENDED</code>: The recommended value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULL</code>: The <code>NULL</code> value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValueWhenUnsetOption
     */

    public DateTimeValueWhenUnsetConfiguration withValueWhenUnsetOption(String valueWhenUnsetOption) {
        setValueWhenUnsetOption(valueWhenUnsetOption);
        return this;
    }

    /**
     * <p>
     * The built-in options for default values. The value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RECOMMENDED</code>: The recommended value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULL</code>: The <code>NULL</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param valueWhenUnsetOption
     *        The built-in options for default values. The value can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RECOMMENDED</code>: The recommended value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULL</code>: The <code>NULL</code> value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValueWhenUnsetOption
     */

    public DateTimeValueWhenUnsetConfiguration withValueWhenUnsetOption(ValueWhenUnsetOption valueWhenUnsetOption) {
        this.valueWhenUnsetOption = valueWhenUnsetOption.toString();
        return this;
    }

    /**
     * <p>
     * A custom value that's used when the value of a parameter isn't set.
     * </p>
     * 
     * @param customValue
     *        A custom value that's used when the value of a parameter isn't set.
     */

    public void setCustomValue(java.util.Date customValue) {
        this.customValue = customValue;
    }

    /**
     * <p>
     * A custom value that's used when the value of a parameter isn't set.
     * </p>
     * 
     * @return A custom value that's used when the value of a parameter isn't set.
     */

    public java.util.Date getCustomValue() {
        return this.customValue;
    }

    /**
     * <p>
     * A custom value that's used when the value of a parameter isn't set.
     * </p>
     * 
     * @param customValue
     *        A custom value that's used when the value of a parameter isn't set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DateTimeValueWhenUnsetConfiguration withCustomValue(java.util.Date customValue) {
        setCustomValue(customValue);
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
        if (getValueWhenUnsetOption() != null)
            sb.append("ValueWhenUnsetOption: ").append(getValueWhenUnsetOption()).append(",");
        if (getCustomValue() != null)
            sb.append("CustomValue: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DateTimeValueWhenUnsetConfiguration == false)
            return false;
        DateTimeValueWhenUnsetConfiguration other = (DateTimeValueWhenUnsetConfiguration) obj;
        if (other.getValueWhenUnsetOption() == null ^ this.getValueWhenUnsetOption() == null)
            return false;
        if (other.getValueWhenUnsetOption() != null && other.getValueWhenUnsetOption().equals(this.getValueWhenUnsetOption()) == false)
            return false;
        if (other.getCustomValue() == null ^ this.getCustomValue() == null)
            return false;
        if (other.getCustomValue() != null && other.getCustomValue().equals(this.getCustomValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValueWhenUnsetOption() == null) ? 0 : getValueWhenUnsetOption().hashCode());
        hashCode = prime * hashCode + ((getCustomValue() == null) ? 0 : getCustomValue().hashCode());
        return hashCode;
    }

    @Override
    public DateTimeValueWhenUnsetConfiguration clone() {
        try {
            return (DateTimeValueWhenUnsetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DateTimeValueWhenUnsetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
