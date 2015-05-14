/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the disk container object for an import image task.
 * </p>
 */
public class ImageDiskContainer implements Serializable, Cloneable {

    /**
     * The description of the disk image.
     */
    private String description;

    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     */
    private String format;

    /**
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     */
    private String url;

    /**
     * The S3 bucket for the disk image.
     */
    private UserBucket userBucket;

    /**
     * The block device mapping for the disk.
     */
    private String deviceName;

    /**
     * The ID of the EBS snapshot to be used for importing the snapshot.
     */
    private String snapshotId;

    /**
     * The description of the disk image.
     *
     * @return The description of the disk image.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the disk image.
     *
     * @param description The description of the disk image.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     *
     * @return The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     *
     * @param format The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of the disk image being imported. <p>Valid values:
     * <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     * <code>OVA</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param format The format of the disk image being imported. <p>Valid values:
     *         <code>RAW</code> | <code>VHD</code> | <code>VMDK</code> |
     *         <code>OVA</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     *
     * @return The URL to the Amazon S3-based disk image being imported. The URL can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     *
     * @param url The URL to the Amazon S3-based disk image being imported. The URL can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The URL to the Amazon S3-based disk image being imported. The URL can
     * either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The URL to the Amazon S3-based disk image being imported. The URL can
     *         either be a https URL (https://..) or an Amazon S3 URL (s3://..)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * The S3 bucket for the disk image.
     *
     * @return The S3 bucket for the disk image.
     */
    public UserBucket getUserBucket() {
        return userBucket;
    }
    
    /**
     * The S3 bucket for the disk image.
     *
     * @param userBucket The S3 bucket for the disk image.
     */
    public void setUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
    }
    
    /**
     * The S3 bucket for the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userBucket The S3 bucket for the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withUserBucket(UserBucket userBucket) {
        this.userBucket = userBucket;
        return this;
    }

    /**
     * The block device mapping for the disk.
     *
     * @return The block device mapping for the disk.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The block device mapping for the disk.
     *
     * @param deviceName The block device mapping for the disk.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The block device mapping for the disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The block device mapping for the disk.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * The ID of the EBS snapshot to be used for importing the snapshot.
     *
     * @return The ID of the EBS snapshot to be used for importing the snapshot.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the EBS snapshot to be used for importing the snapshot.
     *
     * @param snapshotId The ID of the EBS snapshot to be used for importing the snapshot.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the EBS snapshot to be used for importing the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the EBS snapshot to be used for importing the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageDiskContainer withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getUserBucket() != null) sb.append("UserBucket: " + getUserBucket() + ",");
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImageDiskContainer == false) return false;
        ImageDiskContainer other = (ImageDiskContainer)obj;
        
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getUrl() == null ^ this.getUrl() == null) return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false) return false; 
        if (other.getUserBucket() == null ^ this.getUserBucket() == null) return false;
        if (other.getUserBucket() != null && other.getUserBucket().equals(this.getUserBucket()) == false) return false; 
        if (other.getDeviceName() == null ^ this.getDeviceName() == null) return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false) return false; 
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        return true;
    }
    
    @Override
    public ImageDiskContainer clone() {
        try {
            return (ImageDiskContainer) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    