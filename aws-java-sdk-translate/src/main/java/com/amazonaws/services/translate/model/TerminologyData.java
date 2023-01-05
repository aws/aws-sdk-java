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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data associated with the custom terminology. For information about the custom terminology file, see <a
 * href="https://docs.aws.amazon.com/translate/latest/dg/creating-custom-terminology.html"> Creating a Custom
 * Terminology</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TerminologyData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminologyData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this
     * field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     */
    private java.nio.ByteBuffer file;
    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or
     * multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first column in a CSV file), and all of its
     * other languages are target languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a target language. A single
     * multi-directional terminology resource can be used for jobs that translate different language pairs. For example,
     * if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish
     * and Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the directionality, it behaves as
     * uni-directional terminology, although this parameter will have a null value.
     * </p>
     */
    private String directionality;

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this
     * field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
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
     * @param file
     *        The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on
     *        this field before sending a request to the AWS service. Users of the SDK should not perform
     *        Base64-encoding themselves.
     */

    public void setFile(java.nio.ByteBuffer file) {
        this.file = file;
    }

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this
     * field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding
     *         on this field before sending a request to the AWS service. Users of the SDK should not perform
     *         Base64-encoding themselves.
     */

    public java.nio.ByteBuffer getFile() {
        return this.file;
    }

    /**
     * <p>
     * The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on this
     * field before sending a request to the AWS service. Users of the SDK should not perform Base64-encoding
     * themselves.
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
     * @param file
     *        The file containing the custom terminology data. Your version of the AWS SDK performs a Base64-encoding on
     *        this field before sending a request to the AWS service. Users of the SDK should not perform
     *        Base64-encoding themselves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyData withFile(java.nio.ByteBuffer file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology.
     * @see TerminologyDataFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * 
     * @return The data format of the custom terminology.
     * @see TerminologyDataFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public TerminologyData withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public TerminologyData withFormat(TerminologyDataFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or
     * multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first column in a CSV file), and all of its
     * other languages are target languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a target language. A single
     * multi-directional terminology resource can be used for jobs that translate different language pairs. For example,
     * if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish
     * and Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the directionality, it behaves as
     * uni-directional terminology, although this parameter will have a null value.
     * </p>
     * 
     * @param directionality
     *        The directionality of your terminology resource indicates whether it has one source language
     *        (uni-directional) or multiple (multi-directional).</p>
     *        <dl>
     *        <dt>UNI</dt>
     *        <dd>
     *        <p>
     *        The terminology resource has one source language (for example, the first column in a CSV file), and all of
     *        its other languages are target languages.
     *        </p>
     *        </dd>
     *        <dt>MULTI</dt>
     *        <dd>
     *        <p>
     *        Any language in the terminology resource can be the source language or a target language. A single
     *        multi-directional terminology resource can be used for jobs that translate different language pairs. For
     *        example, if the terminology contains English and Spanish terms, it can be used for jobs that translate
     *        English to Spanish and Spanish to English.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When you create a custom terminology resource without specifying the directionality, it behaves as
     *        uni-directional terminology, although this parameter will have a null value.
     * @see Directionality
     */

    public void setDirectionality(String directionality) {
        this.directionality = directionality;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or
     * multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first column in a CSV file), and all of its
     * other languages are target languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a target language. A single
     * multi-directional terminology resource can be used for jobs that translate different language pairs. For example,
     * if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish
     * and Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the directionality, it behaves as
     * uni-directional terminology, although this parameter will have a null value.
     * </p>
     * 
     * @return The directionality of your terminology resource indicates whether it has one source language
     *         (uni-directional) or multiple (multi-directional).</p>
     *         <dl>
     *         <dt>UNI</dt>
     *         <dd>
     *         <p>
     *         The terminology resource has one source language (for example, the first column in a CSV file), and all
     *         of its other languages are target languages.
     *         </p>
     *         </dd>
     *         <dt>MULTI</dt>
     *         <dd>
     *         <p>
     *         Any language in the terminology resource can be the source language or a target language. A single
     *         multi-directional terminology resource can be used for jobs that translate different language pairs. For
     *         example, if the terminology contains English and Spanish terms, it can be used for jobs that translate
     *         English to Spanish and Spanish to English.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         When you create a custom terminology resource without specifying the directionality, it behaves as
     *         uni-directional terminology, although this parameter will have a null value.
     * @see Directionality
     */

    public String getDirectionality() {
        return this.directionality;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or
     * multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first column in a CSV file), and all of its
     * other languages are target languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a target language. A single
     * multi-directional terminology resource can be used for jobs that translate different language pairs. For example,
     * if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish
     * and Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the directionality, it behaves as
     * uni-directional terminology, although this parameter will have a null value.
     * </p>
     * 
     * @param directionality
     *        The directionality of your terminology resource indicates whether it has one source language
     *        (uni-directional) or multiple (multi-directional).</p>
     *        <dl>
     *        <dt>UNI</dt>
     *        <dd>
     *        <p>
     *        The terminology resource has one source language (for example, the first column in a CSV file), and all of
     *        its other languages are target languages.
     *        </p>
     *        </dd>
     *        <dt>MULTI</dt>
     *        <dd>
     *        <p>
     *        Any language in the terminology resource can be the source language or a target language. A single
     *        multi-directional terminology resource can be used for jobs that translate different language pairs. For
     *        example, if the terminology contains English and Spanish terms, it can be used for jobs that translate
     *        English to Spanish and Spanish to English.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When you create a custom terminology resource without specifying the directionality, it behaves as
     *        uni-directional terminology, although this parameter will have a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Directionality
     */

    public TerminologyData withDirectionality(String directionality) {
        setDirectionality(directionality);
        return this;
    }

    /**
     * <p>
     * The directionality of your terminology resource indicates whether it has one source language (uni-directional) or
     * multiple (multi-directional).
     * </p>
     * <dl>
     * <dt>UNI</dt>
     * <dd>
     * <p>
     * The terminology resource has one source language (for example, the first column in a CSV file), and all of its
     * other languages are target languages.
     * </p>
     * </dd>
     * <dt>MULTI</dt>
     * <dd>
     * <p>
     * Any language in the terminology resource can be the source language or a target language. A single
     * multi-directional terminology resource can be used for jobs that translate different language pairs. For example,
     * if the terminology contains English and Spanish terms, it can be used for jobs that translate English to Spanish
     * and Spanish to English.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * When you create a custom terminology resource without specifying the directionality, it behaves as
     * uni-directional terminology, although this parameter will have a null value.
     * </p>
     * 
     * @param directionality
     *        The directionality of your terminology resource indicates whether it has one source language
     *        (uni-directional) or multiple (multi-directional).</p>
     *        <dl>
     *        <dt>UNI</dt>
     *        <dd>
     *        <p>
     *        The terminology resource has one source language (for example, the first column in a CSV file), and all of
     *        its other languages are target languages.
     *        </p>
     *        </dd>
     *        <dt>MULTI</dt>
     *        <dd>
     *        <p>
     *        Any language in the terminology resource can be the source language or a target language. A single
     *        multi-directional terminology resource can be used for jobs that translate different language pairs. For
     *        example, if the terminology contains English and Spanish terms, it can be used for jobs that translate
     *        English to Spanish and Spanish to English.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        When you create a custom terminology resource without specifying the directionality, it behaves as
     *        uni-directional terminology, although this parameter will have a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Directionality
     */

    public TerminologyData withDirectionality(Directionality directionality) {
        this.directionality = directionality.toString();
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
        if (getFile() != null)
            sb.append("File: ").append("***Sensitive Data Redacted***").append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getDirectionality() != null)
            sb.append("Directionality: ").append(getDirectionality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyData == false)
            return false;
        TerminologyData other = (TerminologyData) obj;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getDirectionality() == null ^ this.getDirectionality() == null)
            return false;
        if (other.getDirectionality() != null && other.getDirectionality().equals(this.getDirectionality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getDirectionality() == null) ? 0 : getDirectionality().hashCode());
        return hashCode;
    }

    @Override
    public TerminologyData clone() {
        try {
            return (TerminologyData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TerminologyDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
