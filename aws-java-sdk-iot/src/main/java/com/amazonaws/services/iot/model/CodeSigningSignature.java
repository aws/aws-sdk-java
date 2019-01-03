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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the signature for a file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSigningSignature implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     */
    private java.nio.ByteBuffer inlineDocument;

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
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
     * @param inlineDocument
     *        A base64 encoded binary representation of the code signing signature.
     */

    public void setInlineDocument(java.nio.ByteBuffer inlineDocument) {
        this.inlineDocument = inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A base64 encoded binary representation of the code signing signature.
     */

    public java.nio.ByteBuffer getInlineDocument() {
        return this.inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing signature.
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
     * @param inlineDocument
     *        A base64 encoded binary representation of the code signing signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningSignature withInlineDocument(java.nio.ByteBuffer inlineDocument) {
        setInlineDocument(inlineDocument);
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
        if (getInlineDocument() != null)
            sb.append("InlineDocument: ").append(getInlineDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigningSignature == false)
            return false;
        CodeSigningSignature other = (CodeSigningSignature) obj;
        if (other.getInlineDocument() == null ^ this.getInlineDocument() == null)
            return false;
        if (other.getInlineDocument() != null && other.getInlineDocument().equals(this.getInlineDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInlineDocument() == null) ? 0 : getInlineDocument().hashCode());
        return hashCode;
    }

    @Override
    public CodeSigningSignature clone() {
        try {
            return (CodeSigningSignature) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CodeSigningSignatureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
