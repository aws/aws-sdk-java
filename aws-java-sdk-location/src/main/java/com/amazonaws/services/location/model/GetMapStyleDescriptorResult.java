/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetMapStyleDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMapStyleDescriptorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the body of the style descriptor.
     * </p>
     */
    private java.nio.ByteBuffer blob;
    /**
     * <p>
     * The style descriptor's content type. For example, <code>application/json</code>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Contains the body of the style descriptor.
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
     * @param blob
     *        Contains the body of the style descriptor.
     */

    public void setBlob(java.nio.ByteBuffer blob) {
        this.blob = blob;
    }

    /**
     * <p>
     * Contains the body of the style descriptor.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Contains the body of the style descriptor.
     */

    public java.nio.ByteBuffer getBlob() {
        return this.blob;
    }

    /**
     * <p>
     * Contains the body of the style descriptor.
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
     * @param blob
     *        Contains the body of the style descriptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapStyleDescriptorResult withBlob(java.nio.ByteBuffer blob) {
        setBlob(blob);
        return this;
    }

    /**
     * <p>
     * The style descriptor's content type. For example, <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The style descriptor's content type. For example, <code>application/json</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The style descriptor's content type. For example, <code>application/json</code>.
     * </p>
     * 
     * @return The style descriptor's content type. For example, <code>application/json</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The style descriptor's content type. For example, <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The style descriptor's content type. For example, <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMapStyleDescriptorResult withContentType(String contentType) {
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
        if (getBlob() != null)
            sb.append("Blob: ").append(getBlob()).append(",");
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

        if (obj instanceof GetMapStyleDescriptorResult == false)
            return false;
        GetMapStyleDescriptorResult other = (GetMapStyleDescriptorResult) obj;
        if (other.getBlob() == null ^ this.getBlob() == null)
            return false;
        if (other.getBlob() != null && other.getBlob().equals(this.getBlob()) == false)
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

        hashCode = prime * hashCode + ((getBlob() == null) ? 0 : getBlob().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public GetMapStyleDescriptorResult clone() {
        try {
            return (GetMapStyleDescriptorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
