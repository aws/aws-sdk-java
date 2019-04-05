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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an update to the code of a Java-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CodeContentUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeContentUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes an update to the text code for an application.
     * </p>
     */
    private String textContentUpdate;
    /**
     * <p>
     * Describes an update to the zipped code for an application.
     * </p>
     */
    private java.nio.ByteBuffer zipFileContentUpdate;
    /**
     * <p>
     * Describes an update to the location of code for an application.
     * </p>
     */
    private S3ContentLocationUpdate s3ContentLocationUpdate;

    /**
     * <p>
     * Describes an update to the text code for an application.
     * </p>
     * 
     * @param textContentUpdate
     *        Describes an update to the text code for an application.
     */

    public void setTextContentUpdate(String textContentUpdate) {
        this.textContentUpdate = textContentUpdate;
    }

    /**
     * <p>
     * Describes an update to the text code for an application.
     * </p>
     * 
     * @return Describes an update to the text code for an application.
     */

    public String getTextContentUpdate() {
        return this.textContentUpdate;
    }

    /**
     * <p>
     * Describes an update to the text code for an application.
     * </p>
     * 
     * @param textContentUpdate
     *        Describes an update to the text code for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentUpdate withTextContentUpdate(String textContentUpdate) {
        setTextContentUpdate(textContentUpdate);
        return this;
    }

    /**
     * <p>
     * Describes an update to the zipped code for an application.
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
     * @param zipFileContentUpdate
     *        Describes an update to the zipped code for an application.
     */

    public void setZipFileContentUpdate(java.nio.ByteBuffer zipFileContentUpdate) {
        this.zipFileContentUpdate = zipFileContentUpdate;
    }

    /**
     * <p>
     * Describes an update to the zipped code for an application.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Describes an update to the zipped code for an application.
     */

    public java.nio.ByteBuffer getZipFileContentUpdate() {
        return this.zipFileContentUpdate;
    }

    /**
     * <p>
     * Describes an update to the zipped code for an application.
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
     * @param zipFileContentUpdate
     *        Describes an update to the zipped code for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentUpdate withZipFileContentUpdate(java.nio.ByteBuffer zipFileContentUpdate) {
        setZipFileContentUpdate(zipFileContentUpdate);
        return this;
    }

    /**
     * <p>
     * Describes an update to the location of code for an application.
     * </p>
     * 
     * @param s3ContentLocationUpdate
     *        Describes an update to the location of code for an application.
     */

    public void setS3ContentLocationUpdate(S3ContentLocationUpdate s3ContentLocationUpdate) {
        this.s3ContentLocationUpdate = s3ContentLocationUpdate;
    }

    /**
     * <p>
     * Describes an update to the location of code for an application.
     * </p>
     * 
     * @return Describes an update to the location of code for an application.
     */

    public S3ContentLocationUpdate getS3ContentLocationUpdate() {
        return this.s3ContentLocationUpdate;
    }

    /**
     * <p>
     * Describes an update to the location of code for an application.
     * </p>
     * 
     * @param s3ContentLocationUpdate
     *        Describes an update to the location of code for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentUpdate withS3ContentLocationUpdate(S3ContentLocationUpdate s3ContentLocationUpdate) {
        setS3ContentLocationUpdate(s3ContentLocationUpdate);
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
        if (getTextContentUpdate() != null)
            sb.append("TextContentUpdate: ").append(getTextContentUpdate()).append(",");
        if (getZipFileContentUpdate() != null)
            sb.append("ZipFileContentUpdate: ").append(getZipFileContentUpdate()).append(",");
        if (getS3ContentLocationUpdate() != null)
            sb.append("S3ContentLocationUpdate: ").append(getS3ContentLocationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeContentUpdate == false)
            return false;
        CodeContentUpdate other = (CodeContentUpdate) obj;
        if (other.getTextContentUpdate() == null ^ this.getTextContentUpdate() == null)
            return false;
        if (other.getTextContentUpdate() != null && other.getTextContentUpdate().equals(this.getTextContentUpdate()) == false)
            return false;
        if (other.getZipFileContentUpdate() == null ^ this.getZipFileContentUpdate() == null)
            return false;
        if (other.getZipFileContentUpdate() != null && other.getZipFileContentUpdate().equals(this.getZipFileContentUpdate()) == false)
            return false;
        if (other.getS3ContentLocationUpdate() == null ^ this.getS3ContentLocationUpdate() == null)
            return false;
        if (other.getS3ContentLocationUpdate() != null && other.getS3ContentLocationUpdate().equals(this.getS3ContentLocationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextContentUpdate() == null) ? 0 : getTextContentUpdate().hashCode());
        hashCode = prime * hashCode + ((getZipFileContentUpdate() == null) ? 0 : getZipFileContentUpdate().hashCode());
        hashCode = prime * hashCode + ((getS3ContentLocationUpdate() == null) ? 0 : getS3ContentLocationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public CodeContentUpdate clone() {
        try {
            return (CodeContentUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CodeContentUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
