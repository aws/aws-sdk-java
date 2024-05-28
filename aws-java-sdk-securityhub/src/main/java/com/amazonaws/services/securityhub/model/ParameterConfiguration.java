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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that provides the current value of a security control parameter and identifies whether it has been
 * customized.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ParameterConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub
     * behavior.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When <code>ValueType</code> is
     * set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for the <code>Value</code> field.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be empty.
     * </p>
     */
    private String valueType;
    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     */
    private ParameterValue value;

    /**
     * <p>
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub
     * behavior.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When <code>ValueType</code> is
     * set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for the <code>Value</code> field.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be empty.
     * </p>
     * 
     * @param valueType
     *        Identifies whether a control parameter uses a custom user-defined value or subscribes to the default
     *        Security Hub behavior.</p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific
     *        Security Hub default value, or the default behavior can be to ignore a specific parameter. When
     *        <code>ValueType</code> is set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for
     *        the <code>Value</code> field.
     *        </p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be
     *        empty.
     * @see ParameterValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub
     * behavior.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When <code>ValueType</code> is
     * set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for the <code>Value</code> field.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be empty.
     * </p>
     * 
     * @return Identifies whether a control parameter uses a custom user-defined value or subscribes to the default
     *         Security Hub behavior.</p>
     *         <p>
     *         When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific
     *         Security Hub default value, or the default behavior can be to ignore a specific parameter. When
     *         <code>ValueType</code> is set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for
     *         the <code>Value</code> field.
     *         </p>
     *         <p>
     *         When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be
     *         empty.
     * @see ParameterValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub
     * behavior.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When <code>ValueType</code> is
     * set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for the <code>Value</code> field.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be empty.
     * </p>
     * 
     * @param valueType
     *        Identifies whether a control parameter uses a custom user-defined value or subscribes to the default
     *        Security Hub behavior.</p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific
     *        Security Hub default value, or the default behavior can be to ignore a specific parameter. When
     *        <code>ValueType</code> is set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for
     *        the <code>Value</code> field.
     *        </p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be
     *        empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterValueType
     */

    public ParameterConfiguration withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * Identifies whether a control parameter uses a custom user-defined value or subscribes to the default Security Hub
     * behavior.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific Security
     * Hub default value, or the default behavior can be to ignore a specific parameter. When <code>ValueType</code> is
     * set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for the <code>Value</code> field.
     * </p>
     * <p>
     * When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be empty.
     * </p>
     * 
     * @param valueType
     *        Identifies whether a control parameter uses a custom user-defined value or subscribes to the default
     *        Security Hub behavior.</p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>DEFAULT</code>, the default behavior can be a specific
     *        Security Hub default value, or the default behavior can be to ignore a specific parameter. When
     *        <code>ValueType</code> is set equal to <code>DEFAULT</code>, Security Hub ignores user-provided input for
     *        the <code>Value</code> field.
     *        </p>
     *        <p>
     *        When <code>ValueType</code> is set equal to <code>CUSTOM</code>, the <code>Value</code> field can't be
     *        empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterValueType
     */

    public ParameterConfiguration withValueType(ParameterValueType valueType) {
        this.valueType = valueType.toString();
        return this;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @param value
     *        The current value of a control parameter.
     */

    public void setValue(ParameterValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @return The current value of a control parameter.
     */

    public ParameterValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value of a control parameter.
     * </p>
     * 
     * @param value
     *        The current value of a control parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConfiguration withValue(ParameterValue value) {
        setValue(value);
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
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterConfiguration == false)
            return false;
        ParameterConfiguration other = (ParameterConfiguration) obj;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterConfiguration clone() {
        try {
            return (ParameterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ParameterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
