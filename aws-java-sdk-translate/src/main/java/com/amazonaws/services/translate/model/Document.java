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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The content and content type of a document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This object contains the document content
     * converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the Base64-encoding
     * on this field before sending the request.
     * </p>
     */
    private java.nio.ByteBuffer content;
    /**
     * <p>
     * Describes the format of the document. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the text in
     * the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     * character in the content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data consists of
     * a Word document (.docx).
     * </p>
     * </li>
     * </ul>
     */
    private String contentType;

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This object contains the document content
     * converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the Base64-encoding
     * on this field before sending the request.
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
     * @param content
     *        The <code>Content</code>field type is Binary large object (blob). This object contains the document
     *        content converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the
     *        Base64-encoding on this field before sending the request.
     */

    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This object contains the document content
     * converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the Base64-encoding
     * on this field before sending the request.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The <code>Content</code>field type is Binary large object (blob). This object contains the document
     *         content converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the
     *         Base64-encoding on this field before sending the request.
     */

    public java.nio.ByteBuffer getContent() {
        return this.content;
    }

    /**
     * <p>
     * The <code>Content</code>field type is Binary large object (blob). This object contains the document content
     * converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the Base64-encoding
     * on this field before sending the request.
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
     * @param content
     *        The <code>Content</code>field type is Binary large object (blob). This object contains the document
     *        content converted into base64-encoded binary data. If you use one of the AWS SDKs, the SDK performs the
     *        Base64-encoding on this field before sending the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withContent(java.nio.ByteBuffer content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the text in
     * the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     * character in the content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data consists of
     * a Word document (.docx).
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        Describes the format of the document. You can specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the
     *        text in the HTML element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     *        character in the content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data
     *        consists of a Word document (.docx).
     *        </p>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the text in
     * the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     * character in the content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data consists of
     * a Word document (.docx).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the format of the document. You can specify one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the
     *         text in the HTML element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     *         character in the content.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data
     *         consists of a Word document (.docx).
     *         </p>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Describes the format of the document. You can specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the text in
     * the HTML element.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     * character in the content.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data consists of
     * a Word document (.docx).
     * </p>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        Describes the format of the document. You can specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>text/html</code> - The input data consists of HTML content. Amazon Translate translates only the
     *        text in the HTML element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>text/plain</code> - The input data consists of unformatted text. Amazon Translate translates every
     *        character in the content.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> - The input data
     *        consists of a Word document (.docx).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withContentType(String contentType) {
        setContentType(contentType);
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
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Document == false)
            return false;
        Document other = (Document) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
