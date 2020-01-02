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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A pre-formed Amazon SageMaker model input you can include if your detector version includes an imported Amazon
 * SageMaker model endpoint with pass-through input configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelEndpointDataBlob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelEndpointDataBlob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     */
    private java.nio.ByteBuffer byteBuffer;
    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
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
     * @param byteBuffer
     *        The byte buffer of the Amazon SageMaker model endpoint input data blob.
     */

    public void setByteBuffer(java.nio.ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The byte buffer of the Amazon SageMaker model endpoint input data blob.
     */

    public java.nio.ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    /**
     * <p>
     * The byte buffer of the Amazon SageMaker model endpoint input data blob.
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
     * @param byteBuffer
     *        The byte buffer of the Amazon SageMaker model endpoint input data blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelEndpointDataBlob withByteBuffer(java.nio.ByteBuffer byteBuffer) {
        setByteBuffer(byteBuffer);
        return this;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * 
     * @param contentType
     *        The content type of the Amazon SageMaker model endpoint input data blob.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * 
     * @return The content type of the Amazon SageMaker model endpoint input data blob.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the Amazon SageMaker model endpoint input data blob.
     * </p>
     * 
     * @param contentType
     *        The content type of the Amazon SageMaker model endpoint input data blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelEndpointDataBlob withContentType(String contentType) {
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
        if (getByteBuffer() != null)
            sb.append("ByteBuffer: ").append(getByteBuffer()).append(",");
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

        if (obj instanceof ModelEndpointDataBlob == false)
            return false;
        ModelEndpointDataBlob other = (ModelEndpointDataBlob) obj;
        if (other.getByteBuffer() == null ^ this.getByteBuffer() == null)
            return false;
        if (other.getByteBuffer() != null && other.getByteBuffer().equals(this.getByteBuffer()) == false)
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

        hashCode = prime * hashCode + ((getByteBuffer() == null) ? 0 : getByteBuffer().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public ModelEndpointDataBlob clone() {
        try {
            return (ModelEndpointDataBlob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelEndpointDataBlobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
