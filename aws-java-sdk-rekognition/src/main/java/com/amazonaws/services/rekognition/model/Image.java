/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Provides the source image either as bytes or an S3 object.
 * </p>
 */
public class Image implements Serializable, Cloneable {

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     */
    private java.nio.ByteBuffer bytes;
    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending this request to AWS service by default.
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
     *        Blob of image bytes up to 5 MBs.
     */

    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Blob of image bytes up to 5 MBs.
     */

    public java.nio.ByteBuffer getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * Blob of image bytes up to 5 MBs.
     * </p>
     * 
     * @param bytes
     *        Blob of image bytes up to 5 MBs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withBytes(java.nio.ByteBuffer bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     * 
     * @param s3Object
     *        Identifies an S3 object as the image source.
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     * 
     * @return Identifies an S3 object as the image source.
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the image source.
     * </p>
     * 
     * @param s3Object
     *        Identifies an S3 object as the image source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Bytes: " + getBytes() + ",");
        if (getS3Object() != null)
            sb.append("S3Object: " + getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
