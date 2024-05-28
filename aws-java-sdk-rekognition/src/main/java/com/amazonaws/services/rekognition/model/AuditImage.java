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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An image that is picked from the Face Liveness video and returned for audit trail purposes, returned as
 * Base64-encoded bytes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for audit
     * purposes.
     * </p>
     */
    private java.nio.ByteBuffer bytes;

    private S3Object s3Object;

    private BoundingBox boundingBox;

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for audit
     * purposes.
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
     * @param bytes
     *        The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for
     *        audit purposes.
     */

    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for audit
     * purposes.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for
     *         audit purposes.
     */

    public java.nio.ByteBuffer getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for audit
     * purposes.
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
     * @param bytes
     *        The Base64-encoded bytes representing an image selected from the Face Liveness video and returned for
     *        audit purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditImage withBytes(java.nio.ByteBuffer bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * @param s3Object
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * @return
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * @param s3Object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditImage withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
        return this;
    }

    /**
     * @param boundingBox
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * @return
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * @param boundingBox
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditImage withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
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
        if (getBytes() != null)
            sb.append("Bytes: ").append("***Sensitive Data Redacted***").append(",");
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object()).append(",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditImage == false)
            return false;
        AuditImage other = (AuditImage) obj;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        return hashCode;
    }

    @Override
    public AuditImage clone() {
        try {
            return (AuditImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.AuditImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
