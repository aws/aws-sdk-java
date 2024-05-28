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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object to store union of Field values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/FieldValueUnion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldValueUnion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * a Double number value type.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * An empty value.
     * </p>
     */
    private EmptyFieldValue emptyValue;
    /**
     * <p>
     * String value type.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean number value type.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     * 
     * @return A Boolean number value type.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean number value type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValueUnion withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * A Boolean number value type.
     * </p>
     * 
     * @return A Boolean number value type.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     * 
     * @param doubleValue
     *        a Double number value type.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     * 
     * @return a Double number value type.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * a Double number value type.
     * </p>
     * 
     * @param doubleValue
     *        a Double number value type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValueUnion withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     * 
     * @param emptyValue
     *        An empty value.
     */

    public void setEmptyValue(EmptyFieldValue emptyValue) {
        this.emptyValue = emptyValue;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     * 
     * @return An empty value.
     */

    public EmptyFieldValue getEmptyValue() {
        return this.emptyValue;
    }

    /**
     * <p>
     * An empty value.
     * </p>
     * 
     * @param emptyValue
     *        An empty value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValueUnion withEmptyValue(EmptyFieldValue emptyValue) {
        setEmptyValue(emptyValue);
        return this;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * 
     * @param stringValue
     *        String value type.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * 
     * @return String value type.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * String value type.
     * </p>
     * 
     * @param stringValue
     *        String value type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldValueUnion withStringValue(String stringValue) {
        setStringValue(stringValue);
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
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getEmptyValue() != null)
            sb.append("EmptyValue: ").append(getEmptyValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldValueUnion == false)
            return false;
        FieldValueUnion other = (FieldValueUnion) obj;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getEmptyValue() == null ^ this.getEmptyValue() == null)
            return false;
        if (other.getEmptyValue() != null && other.getEmptyValue().equals(this.getEmptyValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getEmptyValue() == null) ? 0 : getEmptyValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public FieldValueUnion clone() {
        try {
            return (FieldValueUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.FieldValueUnionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
