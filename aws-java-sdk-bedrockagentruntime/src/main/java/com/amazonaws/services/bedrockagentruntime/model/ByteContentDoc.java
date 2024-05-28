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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This property contains the document to chat with, along with its attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/ByteContentDoc"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ByteContentDoc implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MIME type of the document contained in the wrapper object.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The byte value of the file to upload, encoded as a Base-64 string.
     * </p>
     */
    private java.nio.ByteBuffer data;
    /**
     * <p>
     * The file name of the document contained in the wrapper object.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The MIME type of the document contained in the wrapper object.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the document contained in the wrapper object.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the document contained in the wrapper object.
     * </p>
     * 
     * @return The MIME type of the document contained in the wrapper object.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the document contained in the wrapper object.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the document contained in the wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteContentDoc withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The byte value of the file to upload, encoded as a Base-64 string.
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
     * @param data
     *        The byte value of the file to upload, encoded as a Base-64 string.
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The byte value of the file to upload, encoded as a Base-64 string.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The byte value of the file to upload, encoded as a Base-64 string.
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The byte value of the file to upload, encoded as a Base-64 string.
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
     * @param data
     *        The byte value of the file to upload, encoded as a Base-64 string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteContentDoc withData(java.nio.ByteBuffer data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The file name of the document contained in the wrapper object.
     * </p>
     * 
     * @param identifier
     *        The file name of the document contained in the wrapper object.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The file name of the document contained in the wrapper object.
     * </p>
     * 
     * @return The file name of the document contained in the wrapper object.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The file name of the document contained in the wrapper object.
     * </p>
     * 
     * @param identifier
     *        The file name of the document contained in the wrapper object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ByteContentDoc withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getData() != null)
            sb.append("Data: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ByteContentDoc == false)
            return false;
        ByteContentDoc other = (ByteContentDoc) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ByteContentDoc clone() {
        try {
            return (ByteContentDoc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.ByteContentDocMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
