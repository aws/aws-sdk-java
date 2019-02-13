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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A ZIP archive that contains the contents of an <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda layer</a>. You can specify
 * either an Amazon S3 location, or upload a layer archive directly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/LayerVersionContentInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayerVersionContentInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket of the layer archive.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 key of the layer archive.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * For versioned objects, the version of the layer archive object to use.
     * </p>
     */
    private String s3ObjectVersion;
    /**
     * <p>
     * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * <p>
     * The Amazon S3 bucket of the layer archive.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket of the layer archive.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket of the layer archive.
     * </p>
     * 
     * @return The Amazon S3 bucket of the layer archive.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket of the layer archive.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket of the layer archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentInput withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key of the layer archive.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key of the layer archive.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the layer archive.
     * </p>
     * 
     * @return The Amazon S3 key of the layer archive.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The Amazon S3 key of the layer archive.
     * </p>
     * 
     * @param s3Key
     *        The Amazon S3 key of the layer archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentInput withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * For versioned objects, the version of the layer archive object to use.
     * </p>
     * 
     * @param s3ObjectVersion
     *        For versioned objects, the version of the layer archive object to use.
     */

    public void setS3ObjectVersion(String s3ObjectVersion) {
        this.s3ObjectVersion = s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the layer archive object to use.
     * </p>
     * 
     * @return For versioned objects, the version of the layer archive object to use.
     */

    public String getS3ObjectVersion() {
        return this.s3ObjectVersion;
    }

    /**
     * <p>
     * For versioned objects, the version of the layer archive object to use.
     * </p>
     * 
     * @param s3ObjectVersion
     *        For versioned objects, the version of the layer archive object to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentInput withS3ObjectVersion(String s3ObjectVersion) {
        setS3ObjectVersion(s3ObjectVersion);
        return this;
    }

    /**
     * <p>
     * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
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
     * @param zipFile
     *        The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for
     *         you.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
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
     * @param zipFile
     *        The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionContentInput withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getS3ObjectVersion() != null)
            sb.append("S3ObjectVersion: ").append(getS3ObjectVersion()).append(",");
        if (getZipFile() != null)
            sb.append("ZipFile: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayerVersionContentInput == false)
            return false;
        LayerVersionContentInput other = (LayerVersionContentInput) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3ObjectVersion() == null ^ this.getS3ObjectVersion() == null)
            return false;
        if (other.getS3ObjectVersion() != null && other.getS3ObjectVersion().equals(this.getS3ObjectVersion()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectVersion() == null) ? 0 : getS3ObjectVersion().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        return hashCode;
    }

    @Override
    public LayerVersionContentInput clone() {
        try {
            return (LayerVersionContentInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LayerVersionContentInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
