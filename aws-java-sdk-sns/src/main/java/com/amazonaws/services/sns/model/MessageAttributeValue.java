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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The user-specified message attribute value. For string data types, the value attribute has the same restrictions on
 * the content as the message body. For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a>.
 * </p>
 * <p>
 * Name, type, and value must not be empty or null. In addition, the message body should not be empty or null. All parts
 * of the message attribute, including name, type, and value, are included in the message size restriction, which is
 * currently 256 KB (262,144 bytes). For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html">Using Amazon SNS Message Attributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/MessageAttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageAttributeValue implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes">Message
     * Attribute Data Types</a>.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
     * </p>
     */
    private java.nio.ByteBuffer binaryValue;

    /**
     * <p>
     * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes">Message
     * Attribute Data Types</a>.
     * </p>
     * 
     * @param dataType
     *        Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes"
     *        >Message Attribute Data Types</a>.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes">Message
     * Attribute Data Types</a>.
     * </p>
     * 
     * @return Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes"
     *         >Message Attribute Data Types</a>.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes">Message
     * Attribute Data Types</a>.
     * </p>
     * 
     * @param dataType
     *        Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html#SNSMessageAttributes.DataTypes"
     *        >Message Attribute Data Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * 
     * @param stringValue
     *        Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * 
     * @return Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * 
     * @param stringValue
     *        Strings are Unicode with UTF8 binary encoding. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
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
     *        Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
     */

    public void setBinaryValue(java.nio.ByteBuffer binaryValue) {
        this.binaryValue = binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Binary type attributes can store any binary data, for example, compressed data, encrypted data, or
     *         images.
     */

    public java.nio.ByteBuffer getBinaryValue() {
        return this.binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
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
     *        Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withBinaryValue(java.nio.ByteBuffer binaryValue) {
        setBinaryValue(binaryValue);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getBinaryValue() != null)
            sb.append("BinaryValue: ").append(getBinaryValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageAttributeValue == false)
            return false;
        MessageAttributeValue other = (MessageAttributeValue) obj;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getBinaryValue() == null ^ this.getBinaryValue() == null)
            return false;
        if (other.getBinaryValue() != null && other.getBinaryValue().equals(this.getBinaryValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getBinaryValue() == null) ? 0 : getBinaryValue().hashCode());
        return hashCode;
    }

    @Override
    public MessageAttributeValue clone() {
        try {
            return (MessageAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
