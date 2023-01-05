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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information relating to dates in a document, including the type of value, and the value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/NormalizedValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NormalizedValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     */
    private String valueType;

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     * 
     * @param value
     *        The value of the date, written as Year-Month-DayTHour:Minute:Second.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     * 
     * @return The value of the date, written as Year-Month-DayTHour:Minute:Second.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * </p>
     * 
     * @param value
     *        The value of the date, written as Year-Month-DayTHour:Minute:Second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NormalizedValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * 
     * @param valueType
     *        The normalized type of the value detected. In this case, DATE.
     * @see ValueType
     */

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * 
     * @return The normalized type of the value detected. In this case, DATE.
     * @see ValueType
     */

    public String getValueType() {
        return this.valueType;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * 
     * @param valueType
     *        The normalized type of the value detected. In this case, DATE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValueType
     */

    public NormalizedValue withValueType(String valueType) {
        setValueType(valueType);
        return this;
    }

    /**
     * <p>
     * The normalized type of the value detected. In this case, DATE.
     * </p>
     * 
     * @param valueType
     *        The normalized type of the value detected. In this case, DATE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValueType
     */

    public NormalizedValue withValueType(ValueType valueType) {
        this.valueType = valueType.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getValueType() != null)
            sb.append("ValueType: ").append(getValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NormalizedValue == false)
            return false;
        NormalizedValue other = (NormalizedValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValueType() == null ^ this.getValueType() == null)
            return false;
        if (other.getValueType() != null && other.getValueType().equals(this.getValueType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getValueType() == null) ? 0 : getValueType().hashCode());
        return hashCode;
    }

    @Override
    public NormalizedValue clone() {
        try {
            return (NormalizedValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.NormalizedValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
