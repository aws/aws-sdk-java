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
 * Contains the value of a column.
 * </p>
 * 
 * <pre>
 * <code> &lt;important&gt; &lt;p&gt;This data type is deprecated.&lt;/p&gt; &lt;/important&gt; </code>
 * </pre>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/Value" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Value implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of column values.
     * </p>
     */
    private java.util.List<Value> arrayValues;
    /**
     * <p>
     * A value for a column of big integer data type.
     * </p>
     */
    private Long bigIntValue;
    /**
     * <p>
     * A value for a column of BIT data type.
     * </p>
     */
    private Boolean bitValue;
    /**
     * <p>
     * A value for a column of BLOB data type.
     * </p>
     */
    private java.nio.ByteBuffer blobValue;
    /**
     * <p>
     * A value for a column of double data type.
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * A value for a column of integer data type.
     * </p>
     */
    private Integer intValue;
    /**
     * <p>
     * A NULL value.
     * </p>
     */
    private Boolean isNull;
    /**
     * <p>
     * A value for a column of real data type.
     * </p>
     */
    private Float realValue;
    /**
     * <p>
     * A value for a column of string data type.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * A value for a column of STRUCT data type.
     * </p>
     */
    private StructValue structValue;

    /**
     * <p>
     * An array of column values.
     * </p>
     * 
     * @return An array of column values.
     */

    public java.util.List<Value> getArrayValues() {
        return arrayValues;
    }

    /**
     * <p>
     * An array of column values.
     * </p>
     * 
     * @param arrayValues
     *        An array of column values.
     */

    public void setArrayValues(java.util.Collection<Value> arrayValues) {
        if (arrayValues == null) {
            this.arrayValues = null;
            return;
        }

        this.arrayValues = new java.util.ArrayList<Value>(arrayValues);
    }

    /**
     * <p>
     * An array of column values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayValues(java.util.Collection)} or {@link #withArrayValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayValues
     *        An array of column values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withArrayValues(Value... arrayValues) {
        if (this.arrayValues == null) {
            setArrayValues(new java.util.ArrayList<Value>(arrayValues.length));
        }
        for (Value ele : arrayValues) {
            this.arrayValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of column values.
     * </p>
     * 
     * @param arrayValues
     *        An array of column values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withArrayValues(java.util.Collection<Value> arrayValues) {
        setArrayValues(arrayValues);
        return this;
    }

    /**
     * <p>
     * A value for a column of big integer data type.
     * </p>
     * 
     * @param bigIntValue
     *        A value for a column of big integer data type.
     */

    public void setBigIntValue(Long bigIntValue) {
        this.bigIntValue = bigIntValue;
    }

    /**
     * <p>
     * A value for a column of big integer data type.
     * </p>
     * 
     * @return A value for a column of big integer data type.
     */

    public Long getBigIntValue() {
        return this.bigIntValue;
    }

    /**
     * <p>
     * A value for a column of big integer data type.
     * </p>
     * 
     * @param bigIntValue
     *        A value for a column of big integer data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBigIntValue(Long bigIntValue) {
        setBigIntValue(bigIntValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of BIT data type.
     * </p>
     * 
     * @param bitValue
     *        A value for a column of BIT data type.
     */

    public void setBitValue(Boolean bitValue) {
        this.bitValue = bitValue;
    }

    /**
     * <p>
     * A value for a column of BIT data type.
     * </p>
     * 
     * @return A value for a column of BIT data type.
     */

    public Boolean getBitValue() {
        return this.bitValue;
    }

    /**
     * <p>
     * A value for a column of BIT data type.
     * </p>
     * 
     * @param bitValue
     *        A value for a column of BIT data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBitValue(Boolean bitValue) {
        setBitValue(bitValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of BIT data type.
     * </p>
     * 
     * @return A value for a column of BIT data type.
     */

    public Boolean isBitValue() {
        return this.bitValue;
    }

    /**
     * <p>
     * A value for a column of BLOB data type.
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
     *        A value for a column of BLOB data type.
     */

    public void setBlobValue(java.nio.ByteBuffer blobValue) {
        this.blobValue = blobValue;
    }

    /**
     * <p>
     * A value for a column of BLOB data type.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A value for a column of BLOB data type.
     */

    public java.nio.ByteBuffer getBlobValue() {
        return this.blobValue;
    }

    /**
     * <p>
     * A value for a column of BLOB data type.
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
     *        A value for a column of BLOB data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBlobValue(java.nio.ByteBuffer blobValue) {
        setBlobValue(blobValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of double data type.
     * </p>
     * 
     * @param doubleValue
     *        A value for a column of double data type.
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * A value for a column of double data type.
     * </p>
     * 
     * @return A value for a column of double data type.
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * A value for a column of double data type.
     * </p>
     * 
     * @param doubleValue
     *        A value for a column of double data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of integer data type.
     * </p>
     * 
     * @param intValue
     *        A value for a column of integer data type.
     */

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    /**
     * <p>
     * A value for a column of integer data type.
     * </p>
     * 
     * @return A value for a column of integer data type.
     */

    public Integer getIntValue() {
        return this.intValue;
    }

    /**
     * <p>
     * A value for a column of integer data type.
     * </p>
     * 
     * @param intValue
     *        A value for a column of integer data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withIntValue(Integer intValue) {
        setIntValue(intValue);
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

    public Value withIsNull(Boolean isNull) {
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
     * A value for a column of real data type.
     * </p>
     * 
     * @param realValue
     *        A value for a column of real data type.
     */

    public void setRealValue(Float realValue) {
        this.realValue = realValue;
    }

    /**
     * <p>
     * A value for a column of real data type.
     * </p>
     * 
     * @return A value for a column of real data type.
     */

    public Float getRealValue() {
        return this.realValue;
    }

    /**
     * <p>
     * A value for a column of real data type.
     * </p>
     * 
     * @param realValue
     *        A value for a column of real data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withRealValue(Float realValue) {
        setRealValue(realValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of string data type.
     * </p>
     * 
     * @param stringValue
     *        A value for a column of string data type.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * A value for a column of string data type.
     * </p>
     * 
     * @return A value for a column of string data type.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * A value for a column of string data type.
     * </p>
     * 
     * @param stringValue
     *        A value for a column of string data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * A value for a column of STRUCT data type.
     * </p>
     * 
     * @param structValue
     *        A value for a column of STRUCT data type.
     */

    public void setStructValue(StructValue structValue) {
        this.structValue = structValue;
    }

    /**
     * <p>
     * A value for a column of STRUCT data type.
     * </p>
     * 
     * @return A value for a column of STRUCT data type.
     */

    public StructValue getStructValue() {
        return this.structValue;
    }

    /**
     * <p>
     * A value for a column of STRUCT data type.
     * </p>
     * 
     * @param structValue
     *        A value for a column of STRUCT data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withStructValue(StructValue structValue) {
        setStructValue(structValue);
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
        if (getArrayValues() != null)
            sb.append("ArrayValues: ").append(getArrayValues()).append(",");
        if (getBigIntValue() != null)
            sb.append("BigIntValue: ").append(getBigIntValue()).append(",");
        if (getBitValue() != null)
            sb.append("BitValue: ").append(getBitValue()).append(",");
        if (getBlobValue() != null)
            sb.append("BlobValue: ").append(getBlobValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getIntValue() != null)
            sb.append("IntValue: ").append(getIntValue()).append(",");
        if (getIsNull() != null)
            sb.append("IsNull: ").append(getIsNull()).append(",");
        if (getRealValue() != null)
            sb.append("RealValue: ").append(getRealValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getStructValue() != null)
            sb.append("StructValue: ").append(getStructValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Value == false)
            return false;
        Value other = (Value) obj;
        if (other.getArrayValues() == null ^ this.getArrayValues() == null)
            return false;
        if (other.getArrayValues() != null && other.getArrayValues().equals(this.getArrayValues()) == false)
            return false;
        if (other.getBigIntValue() == null ^ this.getBigIntValue() == null)
            return false;
        if (other.getBigIntValue() != null && other.getBigIntValue().equals(this.getBigIntValue()) == false)
            return false;
        if (other.getBitValue() == null ^ this.getBitValue() == null)
            return false;
        if (other.getBitValue() != null && other.getBitValue().equals(this.getBitValue()) == false)
            return false;
        if (other.getBlobValue() == null ^ this.getBlobValue() == null)
            return false;
        if (other.getBlobValue() != null && other.getBlobValue().equals(this.getBlobValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getIntValue() == null ^ this.getIntValue() == null)
            return false;
        if (other.getIntValue() != null && other.getIntValue().equals(this.getIntValue()) == false)
            return false;
        if (other.getIsNull() == null ^ this.getIsNull() == null)
            return false;
        if (other.getIsNull() != null && other.getIsNull().equals(this.getIsNull()) == false)
            return false;
        if (other.getRealValue() == null ^ this.getRealValue() == null)
            return false;
        if (other.getRealValue() != null && other.getRealValue().equals(this.getRealValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getStructValue() == null ^ this.getStructValue() == null)
            return false;
        if (other.getStructValue() != null && other.getStructValue().equals(this.getStructValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayValues() == null) ? 0 : getArrayValues().hashCode());
        hashCode = prime * hashCode + ((getBigIntValue() == null) ? 0 : getBigIntValue().hashCode());
        hashCode = prime * hashCode + ((getBitValue() == null) ? 0 : getBitValue().hashCode());
        hashCode = prime * hashCode + ((getBlobValue() == null) ? 0 : getBlobValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getIntValue() == null) ? 0 : getIntValue().hashCode());
        hashCode = prime * hashCode + ((getIsNull() == null) ? 0 : getIsNull().hashCode());
        hashCode = prime * hashCode + ((getRealValue() == null) ? 0 : getRealValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getStructValue() == null) ? 0 : getStructValue().hashCode());
        return hashCode;
    }

    @Override
    public Value clone() {
        try {
            return (Value) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
