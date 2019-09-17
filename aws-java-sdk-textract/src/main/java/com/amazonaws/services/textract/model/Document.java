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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input document, either as bytes or as an S3 object.
 * </p>
 * <p>
 * You pass image bytes to an Amazon Textract API operation by using the <code>Bytes</code> property. For example, you
 * would use the <code>Bytes</code> property to pass a document loaded from a local file system. Image bytes passed by
 * using the <code>Bytes</code> property must be base64 encoded. Your code might not need to encode document file bytes
 * if you're using an AWS SDK to call Amazon Textract API operations.
 * </p>
 * <p>
 * You pass images stored in an S3 bucket to an Amazon Textract API operation by using the <code>S3Object</code>
 * property. Documents stored in an S3 bucket don't need to be base64 encoded.
 * </p>
 * <p>
 * The AWS Region for the S3 bucket that contains the S3 object must match the AWS Region that you use for Amazon
 * Textract operations.
 * </p>
 * <p>
 * If you use the AWS CLI to call Amazon Textract operations, passing image bytes using the Bytes property isn't
 * supported. You must first upload the document to an Amazon S3 bucket, and then call the operation using the S3Object
 * property.
 * </p>
 * <p>
 * For Amazon Textract to process an S3 object, the user must have permission to access the S3 object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Document" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Document implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of bytes is 5
     * MB. The document bytes must be in PNG or JPG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     */
    private java.nio.ByteBuffer bytes;
    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of bytes is 5
     * MB. The document bytes must be in PNG or JPG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
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
     *        A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of
     *        bytes is 5 MB. The document bytes must be in PNG or JPG format.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field.
     */

    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of bytes is 5
     * MB. The document bytes must be in PNG or JPG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of
     *         bytes is 5 MB. The document bytes must be in PNG or JPG format.</p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field.
     */

    public java.nio.ByteBuffer getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of bytes is 5
     * MB. The document bytes must be in PNG or JPG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
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
     *        A blob of base-64 encoded documents bytes. The maximum size of a document that's provided in a blob of
     *        bytes is 5 MB. The document bytes must be in PNG or JPG format.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withBytes(java.nio.ByteBuffer bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
     * </p>
     * 
     * @param s3Object
     *        Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5
     *        MB.
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
     * </p>
     * 
     * @return Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is
     *         5 MB.
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * <p>
     * Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5 MB.
     * </p>
     * 
     * @param s3Object
     *        Identifies an S3 object as the document source. The maximum size of a document stored in an S3 bucket is 5
     *        MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Document withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
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
            sb.append("Bytes: ").append(getBytes()).append(",");
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object());
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
        com.amazonaws.services.textract.model.transform.DocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
