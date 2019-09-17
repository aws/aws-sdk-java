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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the format and location for an instance export task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ExportToS3Task" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportToS3Task implements Serializable, Cloneable {

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     */
    private String containerFormat;
    /**
     * <p>
     * The format for the exported image.
     * </p>
     */
    private String diskImageFormat;
    /**
     * <p>
     * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     * permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The encryption key for your S3 bucket.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     * 
     * @param containerFormat
     *        The container format used to combine disk images with metadata (such as OVF). If absent, only the disk
     *        image is exported.
     * @see ContainerFormat
     */

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     * 
     * @return The container format used to combine disk images with metadata (such as OVF). If absent, only the disk
     *         image is exported.
     * @see ContainerFormat
     */

    public String getContainerFormat() {
        return this.containerFormat;
    }

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     * 
     * @param containerFormat
     *        The container format used to combine disk images with metadata (such as OVF). If absent, only the disk
     *        image is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerFormat
     */

    public ExportToS3Task withContainerFormat(String containerFormat) {
        setContainerFormat(containerFormat);
        return this;
    }

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     * 
     * @param containerFormat
     *        The container format used to combine disk images with metadata (such as OVF). If absent, only the disk
     *        image is exported.
     * @see ContainerFormat
     */

    public void setContainerFormat(ContainerFormat containerFormat) {
        withContainerFormat(containerFormat);
    }

    /**
     * <p>
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     * </p>
     * 
     * @param containerFormat
     *        The container format used to combine disk images with metadata (such as OVF). If absent, only the disk
     *        image is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerFormat
     */

    public ExportToS3Task withContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
        return this;
    }

    /**
     * <p>
     * The format for the exported image.
     * </p>
     * 
     * @param diskImageFormat
     *        The format for the exported image.
     * @see DiskImageFormat
     */

    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }

    /**
     * <p>
     * The format for the exported image.
     * </p>
     * 
     * @return The format for the exported image.
     * @see DiskImageFormat
     */

    public String getDiskImageFormat() {
        return this.diskImageFormat;
    }

    /**
     * <p>
     * The format for the exported image.
     * </p>
     * 
     * @param diskImageFormat
     *        The format for the exported image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public ExportToS3Task withDiskImageFormat(String diskImageFormat) {
        setDiskImageFormat(diskImageFormat);
        return this;
    }

    /**
     * <p>
     * The format for the exported image.
     * </p>
     * 
     * @param diskImageFormat
     *        The format for the exported image.
     * @see DiskImageFormat
     */

    public void setDiskImageFormat(DiskImageFormat diskImageFormat) {
        withDiskImageFormat(diskImageFormat);
    }

    /**
     * <p>
     * The format for the exported image.
     * </p>
     * 
     * @param diskImageFormat
     *        The format for the exported image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskImageFormat
     */

    public ExportToS3Task withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     * permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     *        permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     * permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     * </p>
     * 
     * @return The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     *         permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     * permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP
     *        permissions to the AWS account <code>vm-import-export@amazon.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportToS3Task withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The encryption key for your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The encryption key for your S3 bucket.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The encryption key for your S3 bucket.
     * </p>
     * 
     * @return The encryption key for your S3 bucket.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The encryption key for your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The encryption key for your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportToS3Task withS3Key(String s3Key) {
        setS3Key(s3Key);
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
        if (getContainerFormat() != null)
            sb.append("ContainerFormat: ").append(getContainerFormat()).append(",");
        if (getDiskImageFormat() != null)
            sb.append("DiskImageFormat: ").append(getDiskImageFormat()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportToS3Task == false)
            return false;
        ExportToS3Task other = (ExportToS3Task) obj;
        if (other.getContainerFormat() == null ^ this.getContainerFormat() == null)
            return false;
        if (other.getContainerFormat() != null && other.getContainerFormat().equals(this.getContainerFormat()) == false)
            return false;
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null)
            return false;
        if (other.getDiskImageFormat() != null && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerFormat() == null) ? 0 : getContainerFormat().hashCode());
        hashCode = prime * hashCode + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public ExportToS3Task clone() {
        try {
            return (ExportToS3Task) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
