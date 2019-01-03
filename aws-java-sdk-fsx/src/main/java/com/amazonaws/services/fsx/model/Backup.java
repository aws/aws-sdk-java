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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A backup of an Amazon FSx for Windows File Server file system. You can create a new file system from a backup to
 * protect against data loss.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/Backup" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     */
    private BackupFailureDetails failureDetails;
    /**
     * <p>
     * The type of the backup.
     * </p>
     */
    private String type;

    private Integer progressPercent;
    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is
     * deleted.
     * </p>
     */
    private FileSystem fileSystem;

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @return The ID of the backup.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the backup.
     * @see BackupLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * 
     * @return The lifecycle status of the backup.
     * @see BackupLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupLifecycle
     */

    public Backup withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the backup.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupLifecycle
     */

    public Backup withLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     * 
     * @param failureDetails
     *        Details explaining any failures that occur when creating a backup.
     */

    public void setFailureDetails(BackupFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     * 
     * @return Details explaining any failures that occur when creating a backup.
     */

    public BackupFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Details explaining any failures that occur when creating a backup.
     * </p>
     * 
     * @param failureDetails
     *        Details explaining any failures that occur when creating a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withFailureDetails(BackupFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * 
     * @param type
     *        The type of the backup.
     * @see BackupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * 
     * @return The type of the backup.
     * @see BackupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * 
     * @param type
     *        The type of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public Backup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the backup.
     * </p>
     * 
     * @param type
     *        The type of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public Backup withType(BackupType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param progressPercent
     */

    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * @return
     */

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * @param progressPercent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withProgressPercent(Integer progressPercent) {
        setProgressPercent(progressPercent);
        return this;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     * 
     * @param creationTime
     *        The time when a particular backup was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     * 
     * @return The time when a particular backup was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when a particular backup was created.
     * </p>
     * 
     * @param creationTime
     *        The time when a particular backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     * </p>
     * 
     * @return The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key used to encrypt this backup's data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) for the backup resource.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the backup resource.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the backup resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) for the backup resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     * 
     * @return Tags associated with a particular file system.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     * 
     * @param tags
     *        Tags associated with a particular file system.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with a particular file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags associated with a particular file system.
     * </p>
     * 
     * @param tags
     *        Tags associated with a particular file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is
     * deleted.
     * </p>
     * 
     * @param fileSystem
     *        Metadata of the file system associated with the backup. This metadata is persisted even if the file system
     *        is deleted.
     */

    public void setFileSystem(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is
     * deleted.
     * </p>
     * 
     * @return Metadata of the file system associated with the backup. This metadata is persisted even if the file
     *         system is deleted.
     */

    public FileSystem getFileSystem() {
        return this.fileSystem;
    }

    /**
     * <p>
     * Metadata of the file system associated with the backup. This metadata is persisted even if the file system is
     * deleted.
     * </p>
     * 
     * @param fileSystem
     *        Metadata of the file system associated with the backup. This metadata is persisted even if the file system
     *        is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withFileSystem(FileSystem fileSystem) {
        setFileSystem(fileSystem);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFileSystem() != null)
            sb.append("FileSystem: ").append(getFileSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backup == false)
            return false;
        Backup other = (Backup) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileSystem() == null ^ this.getFileSystem() == null)
            return false;
        if (other.getFileSystem() != null && other.getFileSystem().equals(this.getFileSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileSystem() == null) ? 0 : getFileSystem().hashCode());
        return hashCode;
    }

    @Override
    public Backup clone() {
        try {
            return (Backup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.BackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
