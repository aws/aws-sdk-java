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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an image file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ImageFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
     * </p>
     */
    private java.nio.ByteBuffer encodedString;
    /**
     * <p>
     * The file type of the image.
     * </p>
     */
    private String fileType;

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
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
     * @param encodedString
     *        The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
     */

    public void setEncodedString(java.nio.ByteBuffer encodedString) {
        this.encodedString = encodedString;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
     */

    public java.nio.ByteBuffer getEncodedString() {
        return this.encodedString;
    }

    /**
     * <p>
     * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
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
     * @param encodedString
     *        The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageFile withEncodedString(java.nio.ByteBuffer encodedString) {
        setEncodedString(encodedString);
        return this;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * 
     * @param fileType
     *        The file type of the image.
     * @see ImageFileType
     */

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * 
     * @return The file type of the image.
     * @see ImageFileType
     */

    public String getFileType() {
        return this.fileType;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * 
     * @param fileType
     *        The file type of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFileType
     */

    public ImageFile withFileType(String fileType) {
        setFileType(fileType);
        return this;
    }

    /**
     * <p>
     * The file type of the image.
     * </p>
     * 
     * @param fileType
     *        The file type of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFileType
     */

    public ImageFile withFileType(ImageFileType fileType) {
        this.fileType = fileType.toString();
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
        if (getEncodedString() != null)
            sb.append("EncodedString: ").append(getEncodedString()).append(",");
        if (getFileType() != null)
            sb.append("FileType: ").append(getFileType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageFile == false)
            return false;
        ImageFile other = (ImageFile) obj;
        if (other.getEncodedString() == null ^ this.getEncodedString() == null)
            return false;
        if (other.getEncodedString() != null && other.getEncodedString().equals(this.getEncodedString()) == false)
            return false;
        if (other.getFileType() == null ^ this.getFileType() == null)
            return false;
        if (other.getFileType() != null && other.getFileType().equals(this.getFileType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncodedString() == null) ? 0 : getEncodedString().hashCode());
        hashCode = prime * hashCode + ((getFileType() == null) ? 0 : getFileType().hashCode());
        return hashCode;
    }

    @Override
    public ImageFile clone() {
        try {
            return (ImageFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ImageFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
