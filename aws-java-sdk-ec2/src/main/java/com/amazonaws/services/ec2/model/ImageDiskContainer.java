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
 * Describes the disk container object for an import image task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImageDiskContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageDiskContainer implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the disk image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     * </p>
     */
    private String format;
    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an
     * Amazon S3 URL (s3://..)
     * </p>
     */
    private String url;
    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     */
    private UserBucket userBucket;

    /**
     * <p>
     * The description of the disk image.
     * </p>
     * 
     * @param description
     *        The description of the disk image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the disk image.
     * </p>
     * 
     * @return The description of the disk image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the disk image.
     * </p>
     * 
     * @param description
     *        The description of the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     * 
     * @param deviceName
     *        The block device mapping for the disk.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     * 
     * @return The block device mapping for the disk.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The block device mapping for the disk.
     * </p>
     * 
     * @param deviceName
     *        The block device mapping for the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     * </p>
     * 
     * @param format
     *        The format of the disk image being imported.</p>
     *        <p>
     *        Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     * </p>
     * 
     * @return The format of the disk image being imported.</p>
     *         <p>
     *         Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the disk image being imported.
     * </p>
     * <p>
     * Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     * </p>
     * 
     * @param format
     *        The format of the disk image being imported.</p>
     *        <p>
     *        Valid values: <code>VHD</code> | <code>VMDK</code> | <code>OVA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot to be used for importing the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     * 
     * @return The ID of the EBS snapshot to be used for importing the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot to be used for importing the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an
     * Amazon S3 URL (s3://..)
     * </p>
     * 
     * @param url
     *        The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..)
     *        or an Amazon S3 URL (s3://..)
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an
     * Amazon S3 URL (s3://..)
     * </p>
     * 
     * @return The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..)
     *         or an Amazon S3 URL (s3://..)
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an
     * Amazon S3 URL (s3://..)
     * </p>
     * 
     * @param url
     *        The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..)
     *        or an Amazon S3 URL (s3://..)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @param userBucket
     *        The S3 bucket for the disk image.
     */

    public void setUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @return The S3 bucket for the disk image.
     */

    public UserBucket getUserBucket() {
        return this.userBucket;
    }

    /**
     * <p>
     * The S3 bucket for the disk image.
     * </p>
     * 
     * @param userBucket
     *        The S3 bucket for the disk image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageDiskContainer withUserBucket(UserBucket userBucket) {
        setUserBucket(userBucket);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUserBucket() != null)
            sb.append("UserBucket: ").append(getUserBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageDiskContainer == false)
            return false;
        ImageDiskContainer other = (ImageDiskContainer) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUserBucket() == null ^ this.getUserBucket() == null)
            return false;
        if (other.getUserBucket() != null && other.getUserBucket().equals(this.getUserBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode());
        return hashCode;
    }

    @Override
    public ImageDiskContainer clone() {
        try {
            return (ImageDiskContainer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
