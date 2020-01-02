/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/Field" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Field implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of values.
     * </p>
     */
    private ArrayValue arrayValue;
    /**
     * <p>
     * A value of BLOB data type.
     * </p>
     */
    private java.nio.ByteBuffer blobValue;
    /**
     * <p>
     * A value of Boolean data type.
     * </p>
     */
    private Boolean booleanValue;
    /**
     * <p>
     * A value of double data type.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * A NULL value.
     * </p>
     */
    private Boolean isNull;
    /**
     * <p>
     * A value of long data type.
     * </p>
     */
    private Long longValue;
    /**
     * <p>
     * A value of string data type.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * An array of values.
     * </p>
     * 
     * @param arrayValue
     *        An array of values.
     */

    public void setArrayValue(ArrayValue arrayValue) {
        this.arrayValue = arrayValue;
    }

    /**
     * <p>
     * An array of values.
     * </p>
     * 
     * @return An array of values.
     */

    public ArrayValue getArrayValue() {
        return this.arrayValue;
    }

    /**
     * <p>
     * An array of values.
     * </p>
     * 
     * @param arrayValue
     *        An array of values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withArrayValue(ArrayValue arrayValue) {
        setArrayValue(arrayValue);
        return this;
    }

    /**
     * <p>
     * A value of BLOB data type.
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
     * @param blobValue
     *        A value of BLOB data type.
     */

    public void setBlobValue(java.nio.ByteBuffer blobValue) {
        this.blobValue = blobValue;
    }

    /**
     * <p>
     * A value of BLOB data type.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A value of BLOB data type.
     */

    public java.nio.ByteBuffer getBlobValue() {
        return this.blobValue;
    }

    /**
     * <p>
     * A value of BLOB data type.
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
     * @param blobValue
     *        A value of BLOB data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withBlobValue(java.nio.ByteBuffer blobValue) {
        setBlobValue(blobValue);
        return this;
    }

    /**
     * <p>
     * A value of Boolean data type.
     * </p>
     * 
     * @param booleanValue
     *        A value of Boolean data type.
     */

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    /**
     * <p>
     * A value of Boolean data type.
     * </p>
     * 
     * @return A value of Boolean data type.
     */

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A value of Boolean data type.
     * </p>
     * 
     * @param booleanValue
     *        A value of Boolean data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withBooleanValue(Boolean booleanValue) {
        setBooleanValue(booleanValue);
        return this;
    }

    /**
     * <p>
     * A value of Boolean data type.
     * </p>
     * 
     * @return A value of Boolean data type.
     */

    public Boolean isBooleanValue() {
        return this.booleanValue;
    }

    /**
     * <p>
     * A value of double data type.
     * </p>
     * 
     * @param doubleValue
     *        A value of double data type.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * A value of double data type.
     * </p>
     * 
     * @return A value of double data type.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * A value of double data type.
     * </p>
     * 
     * @param doubleValue
     *        A value of double data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * A NULL value.
     * </p>
     * 
     * @param isNull
     *        A NULL value.
     */

    public void setIsNull(Boolean isNull) {
        this.isNull = isNull;
    }

    /**
     * <p>
     * A NULL value.
     * </p>
     * 
     * @return A NULL value.
     */

    public Boolean getIsNull() {
        return this.isNull;
    }

    /**
     * <p>
     * A NULL value.
     * </p>
     * 
     * @param isNull
     *        A NULL value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withIsNull(Boolean isNull) {
        setIsNull(isNull);
        return this;
    }

    /**
     * <p>
     * A NULL value.
     * </p>
     * 
     * @return A NULL value.
     */

    public Boolean isNull() {
        return this.isNull;
    }

    /**
     * <p>
     * A value of long data type.
     * </p>
     * 
     * @param longValue
     *        A value of long data type.
     */

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /**
     * <p>
     * A value of long data type.
     * </p>
     * 
     * @return A value of long data type.
     */

    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * <p>
     * A value of long data type.
     * </p>
     * 
     * @param longValue
     *        A value of long data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withLongValue(Long longValue) {
        setLongValue(longValue);
        return this;
    }

    /**
     * <p>
     * A value of string data type.
     * </p>
     * 
     * @param stringValue
     *        A value of string data type.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A value of string data type.
     * </p>
     * 
     * @return A value of string data type.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * A value of string data type.
     * </p>
     * 
     * @param stringValue
     *        A value of string data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Field withStringValue(String stringValue) {
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
        if (getArrayValue() != null)
            sb.append("ArrayValue: ").append(getArrayValue()).append(",");
        if (getBlobValue() != null)
            sb.append("BlobValue: ").append(getBlobValue()).append(",");
        if (getBooleanValue() != null)
            sb.append("BooleanValue: ").append(getBooleanValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getIsNull() != null)
            sb.append("IsNull: ").append(getIsNull()).append(",");
        if (getLongValue() != null)
            sb.append("LongValue: ").append(getLongValue()).append(",");
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

        if (obj instanceof Field == false)
            return false;
        Field other = (Field) obj;
        if (other.getArrayValue() == null ^ this.getArrayValue() == null)
            return false;
        if (other.getArrayValue() != null && other.getArrayValue().equals(this.getArrayValue()) == false)
            return false;
        if (other.getBlobValue() == null ^ this.getBlobValue() == null)
            return false;
        if (other.getBlobValue() != null && other.getBlobValue().equals(this.getBlobValue()) == false)
            return false;
        if (other.getBooleanValue() == null ^ this.getBooleanValue() == null)
            return false;
        if (other.getBooleanValue() != null && other.getBooleanValue().equals(this.getBooleanValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getIsNull() == null ^ this.getIsNull() == null)
            return false;
        if (other.getIsNull() != null && other.getIsNull().equals(this.getIsNull()) == false)
            return false;
        if (other.getLongValue() == null ^ this.getLongValue() == null)
            return false;
        if (other.getLongValue() != null && other.getLongValue().equals(this.getLongValue()) == false)
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

        hashCode = prime * hashCode + ((getArrayValue() == null) ? 0 : getArrayValue().hashCode());
        hashCode = prime * hashCode + ((getBlobValue() == null) ? 0 : getBlobValue().hashCode());
        hashCode = prime * hashCode + ((getBooleanValue() == null) ? 0 : getBooleanValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getIsNull() == null) ? 0 : getIsNull().hashCode());
        hashCode = prime * hashCode + ((getLongValue() == null) ? 0 : getLongValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        return hashCode;
    }

    @Override
    public Field clone() {
        try {
            return (Field) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.FieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
