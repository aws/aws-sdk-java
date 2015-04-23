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
 * The details of the snapshot created from the imported disk.
 * </p>
 */
public class SnapshotDetail implements Serializable, Cloneable {

    /**
     * The size of the disk in the snapshot.
     */
    private Double diskImageSize;

    /**
     * Description for the snapshot.
     */
    private String description;

    /**
     * The format of the disk image from which the snapshot is created.
     */
    private String format;

    /**
     * The URL used to access the disk image.
     */
    private String url;

    /**
     * 
     */
    private UserBucketDetails userBucket;

    /**
     * The Amazon EBS block device mapping for the snapshot.
     */
    private String deviceName;

    /**
     * The snapshot ID of the disk being imported.
     */
    private String snapshotId;

    /**
     * The percentage of progress for the task.
     */
    private String progress;

    /**
     * A detailed status message for the snapshot creation.
     */
    private String statusMessage;

    /**
     * A brief status of the snapshot creation.
     */
    private String status;

    /**
     * The size of the disk in the snapshot.
     *
     * @return The size of the disk in the snapshot.
     */
    public Double getDiskImageSize() {
        return diskImageSize;
    }
    
    /**
     * The size of the disk in the snapshot.
     *
     * @param diskImageSize The size of the disk in the snapshot.
     */
    public void setDiskImageSize(Double diskImageSize) {
        this.diskImageSize = diskImageSize;
    }
    
    /**
     * The size of the disk in the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskImageSize The size of the disk in the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withDiskImageSize(Double diskImageSize) {
        this.diskImageSize = diskImageSize;
        return this;
    }

    /**
     * Description for the snapshot.
     *
     * @return Description for the snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description for the snapshot.
     *
     * @param description Description for the snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Description for the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The format of the disk image from which the snapshot is created.
     *
     * @return The format of the disk image from which the snapshot is created.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of the disk image from which the snapshot is created.
     *
     * @param format The format of the disk image from which the snapshot is created.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of the disk image from which the snapshot is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param format The format of the disk image from which the snapshot is created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The URL used to access the disk image.
     *
     * @return The URL used to access the disk image.
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * The URL used to access the disk image.
     *
     * @param url The URL used to access the disk image.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * The URL used to access the disk image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param url The URL used to access the disk image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public UserBucketDetails getUserBucket() {
        return userBucket;
    }
    
    /**
     * 
     *
     * @param userBucket 
     */
    public void setUserBucket(UserBucketDetails userBucket) {
        this.userBucket = userBucket;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userBucket 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withUserBucket(UserBucketDetails userBucket) {
        this.userBucket = userBucket;
        return this;
    }

    /**
     * The Amazon EBS block device mapping for the snapshot.
     *
     * @return The Amazon EBS block device mapping for the snapshot.
     */
    public String getDeviceName() {
        return deviceName;
    }
    
    /**
     * The Amazon EBS block device mapping for the snapshot.
     *
     * @param deviceName The Amazon EBS block device mapping for the snapshot.
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    /**
     * The Amazon EBS block device mapping for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceName The Amazon EBS block device mapping for the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * The snapshot ID of the disk being imported.
     *
     * @return The snapshot ID of the disk being imported.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot ID of the disk being imported.
     *
     * @param snapshotId The snapshot ID of the disk being imported.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot ID of the disk being imported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The snapshot ID of the disk being imported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The percentage of progress for the task.
     *
     * @return The percentage of progress for the task.
     */
    public String getProgress() {
        return progress;
    }
    
    /**
     * The percentage of progress for the task.
     *
     * @param progress The percentage of progress for the task.
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }
    
    /**
     * The percentage of progress for the task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress The percentage of progress for the task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * A detailed status message for the snapshot creation.
     *
     * @return A detailed status message for the snapshot creation.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * A detailed status message for the snapshot creation.
     *
     * @param statusMessage A detailed status message for the snapshot creation.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * A detailed status message for the snapshot creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage A detailed status message for the snapshot creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * A brief status of the snapshot creation.
     *
     * @return A brief status of the snapshot creation.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * A brief status of the snapshot creation.
     *
     * @param status A brief status of the snapshot creation.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * A brief status of the snapshot creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status A brief status of the snapshot creation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotDetail withStatus(String status) {
        this.status = status;
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
        if (getDiskImageSize() != null) sb.append("DiskImageSize: " + getDiskImageSize() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getUrl() != null) sb.append("Url: " + getUrl() + ",");
        if (getUserBucket() != null) sb.append("UserBucket: " + getUserBucket() + ",");
        if (getDeviceName() != null) sb.append("DeviceName: " + getDeviceName() + ",");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDiskImageSize() == null) ? 0 : getDiskImageSize().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode()); 
        hashCode = prime * hashCode + ((getUserBucket() == null) ? 0 : getUserBucket().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SnapshotDetail == false) return false;
        SnapshotDetail other = (SnapshotDetail)obj;
        
        if (other.getDiskImageSize() == null ^ this.getDiskImageSize() == null) return false;
        if (other.getDiskImageSize() != null && other.getDiskImageSize().equals(this.getDiskImageSize()) == false) return false; 
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
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public SnapshotDetail clone() {
        try {
            return (SnapshotDetail) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    