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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The user-specified message attribute value. For string data types, the <code>Value</code> attribute has the same
 * restrictions on the content as the message body. For more information, see <code> <a>SendMessage</a>.</code>
 * </p>
 * <p>
 * <code>Name</code>, <code>type</code>, <code>value</code> and the message body must not be empty or null. All parts of
 * the message attribute, including <code>Name</code>, <code>Type</code>, and <code>Value</code>, are part of the
 * message size restriction (256 KB or 262,144 bytes).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/MessageAttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageAttributeValue implements Serializable, Cloneable {

    /**
     * <p>
     * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
     * </p>
     */
    private java.nio.ByteBuffer binaryValue;
    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stringListValues;
    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer> binaryListValues;
    /**
     * <p>
     * Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     * <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     * </p>
     * 
     * @param stringValue
     *        Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     * </p>
     * 
     * @return Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     *         href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     * </p>
     * 
     * @param stringValue
     *        Strings are Unicode with UTF-8 binary encoding. For a list of code values, see <a
     *        href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">ASCII Printable Characters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
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
     *        Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
     */

    public void setBinaryValue(java.nio.ByteBuffer binaryValue) {
        this.binaryValue = binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
     */

    public java.nio.ByteBuffer getBinaryValue() {
        return this.binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
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
     *        Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withBinaryValue(java.nio.ByteBuffer binaryValue) {
        setBinaryValue(binaryValue);
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @return Not implemented. Reserved for future use.
     */

    public java.util.List<String> getStringListValues() {
        if (stringListValues == null) {
            stringListValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stringListValues;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @param stringListValues
     *        Not implemented. Reserved for future use.
     */

    public void setStringListValues(java.util.Collection<String> stringListValues) {
        if (stringListValues == null) {
            this.stringListValues = null;
            return;
        }

        this.stringListValues = new com.amazonaws.internal.SdkInternalList<String>(stringListValues);
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringListValues(java.util.Collection)} or {@link #withStringListValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stringListValues
     *        Not implemented. Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringListValues(String... stringListValues) {
        if (this.stringListValues == null) {
            setStringListValues(new com.amazonaws.internal.SdkInternalList<String>(stringListValues.length));
        }
        for (String ele : stringListValues) {
            this.stringListValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @param stringListValues
     *        Not implemented. Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withStringListValues(java.util.Collection<String> stringListValues) {
        setStringListValues(stringListValues);
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @return Not implemented. Reserved for future use.
     */

    public java.util.List<java.nio.ByteBuffer> getBinaryListValues() {
        if (binaryListValues == null) {
            binaryListValues = new com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer>();
        }
        return binaryListValues;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @param binaryListValues
     *        Not implemented. Reserved for future use.
     */

    public void setBinaryListValues(java.util.Collection<java.nio.ByteBuffer> binaryListValues) {
        if (binaryListValues == null) {
            this.binaryListValues = null;
            return;
        }

        this.binaryListValues = new com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer>(binaryListValues);
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBinaryListValues(java.util.Collection)} or {@link #withBinaryListValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param binaryListValues
     *        Not implemented. Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withBinaryListValues(java.nio.ByteBuffer... binaryListValues) {
        if (this.binaryListValues == null) {
            setBinaryListValues(new com.amazonaws.internal.SdkInternalList<java.nio.ByteBuffer>(binaryListValues.length));
        }
        for (java.nio.ByteBuffer ele : binaryListValues) {
            this.binaryListValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * 
     * @param binaryListValues
     *        Not implemented. Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withBinaryListValues(java.util.Collection<java.nio.ByteBuffer> binaryListValues) {
        setBinaryListValues(binaryListValues);
        return this;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     * <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param dataType
     *        Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     *        <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p>
     *        <p>
     *        You can also append custom labels. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     * <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @return Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     *         <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p>
     *         <p>
     *         You can also append custom labels. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *         >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     * <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     * >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * </p>
     * 
     * @param dataType
     *        Amazon SQS supports the following logical data types: <code>String</code>, <code>Number</code>, and
     *        <code>Binary</code>. For the <code>Number</code> data type, you must use <code>StringValue</code>.</p>
     *        <p>
     *        You can also append custom labels. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html"
     *        >Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageAttributeValue withDataType(String dataType) {
        setDataType(dataType);
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
        if (getStringListValues() != null)
            sb.append("StringListValues: ").append(getStringListValues()).append(",");
        if (getBinaryListValues() != null)
            sb.append("BinaryListValues: ").append(getBinaryListValues()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType());
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
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getBinaryValue() == null ^ this.getBinaryValue() == null)
            return false;
        if (other.getBinaryValue() != null && other.getBinaryValue().equals(this.getBinaryValue()) == false)
            return false;
        if (other.getStringListValues() == null ^ this.getStringListValues() == null)
            return false;
        if (other.getStringListValues() != null && other.getStringListValues().equals(this.getStringListValues()) == false)
            return false;
        if (other.getBinaryListValues() == null ^ this.getBinaryListValues() == null)
            return false;
        if (other.getBinaryListValues() != null && other.getBinaryListValues().equals(this.getBinaryListValues()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getBinaryValue() == null) ? 0 : getBinaryValue().hashCode());
        hashCode = prime * hashCode + ((getStringListValues() == null) ? 0 : getStringListValues().hashCode());
        hashCode = prime * hashCode + ((getBinaryListValues() == null) ? 0 : getBinaryListValues().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
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
