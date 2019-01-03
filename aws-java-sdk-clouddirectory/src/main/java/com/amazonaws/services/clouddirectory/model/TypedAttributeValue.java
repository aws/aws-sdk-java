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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data for a typed attribute. You can set one, and only one, of the elements. Each attribute in an item
 * is a name-value pair. Attributes have a single value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/TypedAttributeValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypedAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string data value.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * A binary data value.
     * </p>
     */
    private java.nio.ByteBuffer binaryValue;
    /**
     * <p>
     * A Boolean data value.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * A number data value.
     * </p>
     */
    private String numberValue;
    /**
     * <p>
     * A date and time value.
     * </p>
     */
    private java.util.Date datetimeValue;

    /**
     * <p>
     * A string data value.
     * </p>
     * 
     * @param stringValue
     *        A string data value.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A string data value.
     * </p>
     * 
     * @return A string data value.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * A string data value.
     * </p>
     * 
     * @param stringValue
     *        A string data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * A binary data value.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param binaryValue
     *        A binary data value.
     */

    public void setBinaryValue(java.nio.ByteBuffer binaryValue) {
        this.binaryValue = binaryValue;
    }

    /**
     * <p>
     * A binary data value.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A binary data value.
     */

    public java.nio.ByteBuffer getBinaryValue() {
        return this.binaryValue;
    }

    /**
     * <p>
     * A binary data value.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param binaryValue
     *        A binary data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValue withBinaryValue(java.nio.ByteBuffer binaryValue) {
        setBinaryValue(binaryValue);
        return this;
    }

    /**
     * <p>
     * A Boolean data value.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean data value.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A Boolean data value.
     * </p>
     * 
     * @return A Boolean data value.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A Boolean data value.
     * </p>
     * 
     * @param booleanValue
     *        A Boolean data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValue withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * A Boolean data value.
     * </p>
     * 
     * @return A Boolean data value.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A number data value.
     * </p>
     * 
     * @param numberValue
     *        A number data value.
     */

    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }

    /**
     * <p>
     * A number data value.
     * </p>
     * 
     * @return A number data value.
     */

    public String getNumberValue() {
        return this.numberValue;
    }

    /**
     * <p>
     * A number data value.
     * </p>
     * 
     * @param numberValue
     *        A number data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValue withNumberValue(String numberValue) {
        setNumberValue(numberValue);
        return this;
    }

    /**
     * <p>
     * A date and time value.
     * </p>
     * 
     * @param datetimeValue
     *        A date and time value.
     */

    public void setDatetimeValue(java.util.Date datetimeValue) {
        this.datetimeValue = datetimeValue;
    }

    /**
     * <p>
     * A date and time value.
     * </p>
     * 
     * @return A date and time value.
     */

    public java.util.Date getDatetimeValue() {
        return this.datetimeValue;
    }

    /**
     * <p>
     * A date and time value.
     * </p>
     * 
     * @param datetimeValue
     *        A date and time value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypedAttributeValue withDatetimeValue(java.util.Date datetimeValue) {
        setDatetimeValue(datetimeValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getBinaryValue() != null)
            sb.append("BinaryValue: ").append(getBinaryValue()).append(",");
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
        if (getNumberValue() != null)
            sb.append("NumberValue: ").append(getNumberValue()).append(",");
        if (getDatetimeValue() != null)
            sb.append("DatetimeValue: ").append(getDatetimeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypedAttributeValue == false)
            return false;
        TypedAttributeValue other = (TypedAttributeValue) obj;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getBinaryValue() == null ^ this.getBinaryValue() == null)
            return false;
        if (other.getBinaryValue() != null && other.getBinaryValue().equals(this.getBinaryValue()) == false)
            return false;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        if (other.getNumberValue() == null ^ this.getNumberValue() == null)
            return false;
        if (other.getNumberValue() != null && other.getNumberValue().equals(this.getNumberValue()) == false)
            return false;
        if (other.getDatetimeValue() == null ^ this.getDatetimeValue() == null)
            return false;
        if (other.getDatetimeValue() != null && other.getDatetimeValue().equals(this.getDatetimeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getBinaryValue() == null) ? 0 : getBinaryValue().hashCode());
        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getNumberValue() == null) ? 0 : getNumberValue().hashCode());
        hashCode = prime * hashCode + ((getDatetimeValue() == null) ? 0 : getDatetimeValue().hashCode());
        return hashCode;
    }

    @Override
    public TypedAttributeValue clone() {
        try {
            return (TypedAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.TypedAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
