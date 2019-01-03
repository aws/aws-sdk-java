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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Column value
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/Value" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Value implements Serializable, Cloneable, StructuredPojo {

    /** Arbitrarily nested arrays */
    private java.util.List<Value> arrayValues;
    /** Long value */
    private Long bigIntValue;
    /** Bit value */
    private Boolean bitValue;
    /** Blob value */
    private java.nio.ByteBuffer blobValue;
    /** Double value */
    private Double doubleValue;
    /** Integer value */
    private Integer intValue;
    /** Is column null */
    private Boolean isNull;
    /** Float value */
    private Float realValue;
    /** String value */
    private String stringValue;
    /** Struct or UDT */
    private StructValue structValue;

    /**
     * Arbitrarily nested arrays
     * 
     * @return Arbitrarily nested arrays
     */

    public java.util.List<Value> getArrayValues() {
        return arrayValues;
    }

    /**
     * Arbitrarily nested arrays
     * 
     * @param arrayValues
     *        Arbitrarily nested arrays
     */

    public void setArrayValues(java.util.Collection<Value> arrayValues) {
        if (arrayValues == null) {
            this.arrayValues = null;
            return;
        }

        this.arrayValues = new java.util.ArrayList<Value>(arrayValues);
    }

    /**
     * Arbitrarily nested arrays
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayValues(java.util.Collection)} or {@link #withArrayValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayValues
     *        Arbitrarily nested arrays
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
     * Arbitrarily nested arrays
     * 
     * @param arrayValues
     *        Arbitrarily nested arrays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withArrayValues(java.util.Collection<Value> arrayValues) {
        setArrayValues(arrayValues);
        return this;
    }

    /**
     * Long value
     * 
     * @param bigIntValue
     *        Long value
     */

    public void setBigIntValue(Long bigIntValue) {
        this.bigIntValue = bigIntValue;
    }

    /**
     * Long value
     * 
     * @return Long value
     */

    public Long getBigIntValue() {
        return this.bigIntValue;
    }

    /**
     * Long value
     * 
     * @param bigIntValue
     *        Long value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBigIntValue(Long bigIntValue) {
        setBigIntValue(bigIntValue);
        return this;
    }

    /**
     * Bit value
     * 
     * @param bitValue
     *        Bit value
     */

    public void setBitValue(Boolean bitValue) {
        this.bitValue = bitValue;
    }

    /**
     * Bit value
     * 
     * @return Bit value
     */

    public Boolean getBitValue() {
        return this.bitValue;
    }

    /**
     * Bit value
     * 
     * @param bitValue
     *        Bit value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBitValue(Boolean bitValue) {
        setBitValue(bitValue);
        return this;
    }

    /**
     * Bit value
     * 
     * @return Bit value
     */

    public Boolean isBitValue() {
        return this.bitValue;
    }

    /**
     * Blob value
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
     *        Blob value
     */

    public void setBlobValue(java.nio.ByteBuffer blobValue) {
        this.blobValue = blobValue;
    }

    /**
     * Blob value
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Blob value
     */

    public java.nio.ByteBuffer getBlobValue() {
        return this.blobValue;
    }

    /**
     * Blob value
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
     *        Blob value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withBlobValue(java.nio.ByteBuffer blobValue) {
        setBlobValue(blobValue);
        return this;
    }

    /**
     * Double value
     * 
     * @param doubleValue
     *        Double value
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * Double value
     * 
     * @return Double value
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * Double value
     * 
     * @param doubleValue
     *        Double value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * Integer value
     * 
     * @param intValue
     *        Integer value
     */

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    /**
     * Integer value
     * 
     * @return Integer value
     */

    public Integer getIntValue() {
        return this.intValue;
    }

    /**
     * Integer value
     * 
     * @param intValue
     *        Integer value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withIntValue(Integer intValue) {
        setIntValue(intValue);
        return this;
    }

    /**
     * Is column null
     * 
     * @param isNull
     *        Is column null
     */

    public void setIsNull(Boolean isNull) {
        this.isNull = isNull;
    }

    /**
     * Is column null
     * 
     * @return Is column null
     */

    public Boolean getIsNull() {
        return this.isNull;
    }

    /**
     * Is column null
     * 
     * @param isNull
     *        Is column null
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withIsNull(Boolean isNull) {
        setIsNull(isNull);
        return this;
    }

    /**
     * Is column null
     * 
     * @return Is column null
     */

    public Boolean isNull() {
        return this.isNull;
    }

    /**
     * Float value
     * 
     * @param realValue
     *        Float value
     */

    public void setRealValue(Float realValue) {
        this.realValue = realValue;
    }

    /**
     * Float value
     * 
     * @return Float value
     */

    public Float getRealValue() {
        return this.realValue;
    }

    /**
     * Float value
     * 
     * @param realValue
     *        Float value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withRealValue(Float realValue) {
        setRealValue(realValue);
        return this;
    }

    /**
     * String value
     * 
     * @param stringValue
     *        String value
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * String value
     * 
     * @return String value
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * String value
     * 
     * @param stringValue
     *        String value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Value withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * Struct or UDT
     * 
     * @param structValue
     *        Struct or UDT
     */

    public void setStructValue(StructValue structValue) {
        this.structValue = structValue;
    }

    /**
     * Struct or UDT
     * 
     * @return Struct or UDT
     */

    public StructValue getStructValue() {
        return this.structValue;
    }

    /**
     * Struct or UDT
     * 
     * @param structValue
     *        Struct or UDT
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
