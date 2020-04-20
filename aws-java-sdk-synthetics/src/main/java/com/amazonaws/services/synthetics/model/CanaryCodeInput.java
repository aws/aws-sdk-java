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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this structure to input your script code for the canary. This structure contains the Lambda handler with the
 * location where the canary should start running the script. If the script is stored in an S3 bucket, the bucket name,
 * key, and version are also included. If the script was passed into the canary directly, the script code is contained
 * in the value of <code>Zipfile</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryCodeInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryCodeInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify
     * the full bucket name, including <code>s3://</code> as the start of the bucket name.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The S3 key of your script. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3 Objects</a>.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     */
    private String s3Version;
    /**
     * <p>
     * If you input your canary script directly into the canary instead of referring to an S3 location, the value of
     * this parameter is the .zip file that contains the script. It can be up to 5 MB.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;
    /**
     * <p>
     * The entry point to use for the source code when running the canary. This value must end with the string
     * <code>.handler</code>.
     * </p>
     */
    private String handler;

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify
     * the full bucket name, including <code>s3://</code> as the start of the bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        If your canary script is located in S3, specify the full bucket name here. The bucket must already exist.
     *        Specify the full bucket name, including <code>s3://</code> as the start of the bucket name.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify
     * the full bucket name, including <code>s3://</code> as the start of the bucket name.
     * </p>
     * 
     * @return If your canary script is located in S3, specify the full bucket name here. The bucket must already exist.
     *         Specify the full bucket name, including <code>s3://</code> as the start of the bucket name.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name here. The bucket must already exist. Specify
     * the full bucket name, including <code>s3://</code> as the start of the bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        If your canary script is located in S3, specify the full bucket name here. The bucket must already exist.
     *        Specify the full bucket name, including <code>s3://</code> as the start of the bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeInput withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3 Objects</a>.
     * </p>
     * 
     * @param s3Key
     *        The S3 key of your script. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3
     *        Objects</a>.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3 Objects</a>.
     * </p>
     * 
     * @return The S3 key of your script. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3
     *         Objects</a>.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3 Objects</a>.
     * </p>
     * 
     * @param s3Key
     *        The S3 key of your script. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html">Working with Amazon S3
     *        Objects</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeInput withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * 
     * @param s3Version
     *        The S3 version ID of your script.
     */

    public void setS3Version(String s3Version) {
        this.s3Version = s3Version;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * 
     * @return The S3 version ID of your script.
     */

    public String getS3Version() {
        return this.s3Version;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * 
     * @param s3Version
     *        The S3 version ID of your script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeInput withS3Version(String s3Version) {
        setS3Version(s3Version);
        return this;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of referring to an S3 location, the value of
     * this parameter is the .zip file that contains the script. It can be up to 5 MB.
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
     *        If you input your canary script directly into the canary instead of referring to an S3 location, the value
     *        of this parameter is the .zip file that contains the script. It can be up to 5 MB.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of referring to an S3 location, the value of
     * this parameter is the .zip file that contains the script. It can be up to 5 MB.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return If you input your canary script directly into the canary instead of referring to an S3 location, the
     *         value of this parameter is the .zip file that contains the script. It can be up to 5 MB.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of referring to an S3 location, the value of
     * this parameter is the .zip file that contains the script. It can be up to 5 MB.
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
     *        If you input your canary script directly into the canary instead of referring to an S3 location, the value
     *        of this parameter is the .zip file that contains the script. It can be up to 5 MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeInput withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
        return this;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This value must end with the string
     * <code>.handler</code>.
     * </p>
     * 
     * @param handler
     *        The entry point to use for the source code when running the canary. This value must end with the string
     *        <code>.handler</code>.
     */

    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This value must end with the string
     * <code>.handler</code>.
     * </p>
     * 
     * @return The entry point to use for the source code when running the canary. This value must end with the string
     *         <code>.handler</code>.
     */

    public String getHandler() {
        return this.handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This value must end with the string
     * <code>.handler</code>.
     * </p>
     * 
     * @param handler
     *        The entry point to use for the source code when running the canary. This value must end with the string
     *        <code>.handler</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryCodeInput withHandler(String handler) {
        setHandler(handler);
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
        if (getS3Version() != null)
            sb.append("S3Version: ").append(getS3Version()).append(",");
        if (getZipFile() != null)
            sb.append("ZipFile: ").append(getZipFile()).append(",");
        if (getHandler() != null)
            sb.append("Handler: ").append(getHandler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryCodeInput == false)
            return false;
        CanaryCodeInput other = (CanaryCodeInput) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3Version() == null ^ this.getS3Version() == null)
            return false;
        if (other.getS3Version() != null && other.getS3Version().equals(this.getS3Version()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3Version() == null) ? 0 : getS3Version().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        return hashCode;
    }

    @Override
    public CanaryCodeInput clone() {
        try {
            return (CanaryCodeInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryCodeInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
