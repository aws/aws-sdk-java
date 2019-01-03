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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Value of a segment annotation. Has one of three value types: Number, Boolean or String.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/AnnotationValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnnotationValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Value for a Number annotation.
     * </p>
     */
    private Double numberValue;
    /**
     * <p>
     * Value for a Boolean annotation.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * Value for a String annotation.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * Value for a Number annotation.
     * </p>
     * 
     * @param numberValue
     *        Value for a Number annotation.
     */

    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * <p>
     * Value for a Number annotation.
     * </p>
     * 
     * @return Value for a Number annotation.
     */

    public Double getNumberValue() {
        return this.numberValue;
    }

    /**
     * <p>
     * Value for a Number annotation.
     * </p>
     * 
     * @param numberValue
     *        Value for a Number annotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationValue withNumberValue(Double numberValue) {
        setNumberValue(numberValue);
        return this;
    }

    /**
     * <p>
     * Value for a Boolean annotation.
     * </p>
     * 
     * @param booleanValue
     *        Value for a Boolean annotation.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * Value for a Boolean annotation.
     * </p>
     * 
     * @return Value for a Boolean annotation.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * Value for a Boolean annotation.
     * </p>
     * 
     * @param booleanValue
     *        Value for a Boolean annotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationValue withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * Value for a Boolean annotation.
     * </p>
     * 
     * @return Value for a Boolean annotation.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * Value for a String annotation.
     * </p>
     * 
     * @param stringValue
     *        Value for a String annotation.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Value for a String annotation.
     * </p>
     * 
     * @return Value for a String annotation.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * Value for a String annotation.
     * </p>
     * 
     * @param stringValue
     *        Value for a String annotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationValue withStringValue(String stringValue) {
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
        if (getNumberValue() != null)
            sb.append("NumberValue: ").append(getNumberValue()).append(",");
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
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

        if (obj instanceof AnnotationValue == false)
            return false;
        AnnotationValue other = (AnnotationValue) obj;
        if (other.getNumberValue() == null ^ this.getNumberValue() == null)
            return false;
        if (other.getNumberValue() != null && other.getNumberValue().equals(this.getNumberValue()) == false)
            return false;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
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

        hashCode = prime * hashCode + ((getNumberValue() == null) ? 0 : getNumberValue().hashCode());
        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public AnnotationValue clone() {
        try {
            return (AnnotationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.AnnotationValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
