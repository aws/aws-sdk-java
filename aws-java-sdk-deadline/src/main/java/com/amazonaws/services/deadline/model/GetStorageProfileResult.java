/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStorageProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The display name of the storage profile.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The location of the files for the storage profile.
     * </p>
     */
    private java.util.List<FileSystemLocation> fileSystemLocations;
    /**
     * <p>
     * The operating system (OS) for the storage profile.
     * </p>
     */
    private String osFamily;
    /**
     * <p>
     * The storage profile ID.
     * </p>
     */
    private String storageProfileId;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The display name of the storage profile.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the storage profile.
     * </p>
     * 
     * @return The display name of the storage profile.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the storage profile.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The location of the files for the storage profile.
     * </p>
     * 
     * @return The location of the files for the storage profile.
     */

    public java.util.List<FileSystemLocation> getFileSystemLocations() {
        return fileSystemLocations;
    }

    /**
     * <p>
     * The location of the files for the storage profile.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile.
     */

    public void setFileSystemLocations(java.util.Collection<FileSystemLocation> fileSystemLocations) {
        if (fileSystemLocations == null) {
            this.fileSystemLocations = null;
            return;
        }

        this.fileSystemLocations = new java.util.ArrayList<FileSystemLocation>(fileSystemLocations);
    }

    /**
     * <p>
     * The location of the files for the storage profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocations(java.util.Collection)} or {@link #withFileSystemLocations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withFileSystemLocations(FileSystemLocation... fileSystemLocations) {
        if (this.fileSystemLocations == null) {
            setFileSystemLocations(new java.util.ArrayList<FileSystemLocation>(fileSystemLocations.length));
        }
        for (FileSystemLocation ele : fileSystemLocations) {
            this.fileSystemLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The location of the files for the storage profile.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withFileSystemLocations(java.util.Collection<FileSystemLocation> fileSystemLocations) {
        setFileSystemLocations(fileSystemLocations);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) for the storage profile.
     * @see StorageProfileOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The operating system (OS) for the storage profile.
     * </p>
     * 
     * @return The operating system (OS) for the storage profile.
     * @see StorageProfileOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public GetStorageProfileResult withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public GetStorageProfileResult withOsFamily(StorageProfileOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
        return this;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @return The storage profile ID.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFileSystemLocations() != null)
            sb.append("FileSystemLocations: ").append("***Sensitive Data Redacted***").append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStorageProfileResult == false)
            return false;
        GetStorageProfileResult other = (GetStorageProfileResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFileSystemLocations() == null ^ this.getFileSystemLocations() == null)
            return false;
        if (other.getFileSystemLocations() != null && other.getFileSystemLocations().equals(this.getFileSystemLocations()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFileSystemLocations() == null) ? 0 : getFileSystemLocations().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetStorageProfileResult clone() {
        try {
            return (GetStorageProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
