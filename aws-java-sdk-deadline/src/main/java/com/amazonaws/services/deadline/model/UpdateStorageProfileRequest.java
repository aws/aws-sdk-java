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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStorageProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The display name of the storage profile to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID to update.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The file system location names to add.
     * </p>
     */
    private java.util.List<FileSystemLocation> fileSystemLocationsToAdd;
    /**
     * <p>
     * The file system location names to remove.
     * </p>
     */
    private java.util.List<FileSystemLocation> fileSystemLocationsToRemove;
    /**
     * <p>
     * The OS system to update.
     * </p>
     */
    private String osFamily;
    /**
     * <p>
     * The storage profile ID to update.
     * </p>
     */
    private String storageProfileId;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The display name of the storage profile to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the storage profile to update.
     * </p>
     * 
     * @return The display name of the storage profile to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the storage profile to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @return The farm ID to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The file system location names to add.
     * </p>
     * 
     * @return The file system location names to add.
     */

    public java.util.List<FileSystemLocation> getFileSystemLocationsToAdd() {
        return fileSystemLocationsToAdd;
    }

    /**
     * <p>
     * The file system location names to add.
     * </p>
     * 
     * @param fileSystemLocationsToAdd
     *        The file system location names to add.
     */

    public void setFileSystemLocationsToAdd(java.util.Collection<FileSystemLocation> fileSystemLocationsToAdd) {
        if (fileSystemLocationsToAdd == null) {
            this.fileSystemLocationsToAdd = null;
            return;
        }

        this.fileSystemLocationsToAdd = new java.util.ArrayList<FileSystemLocation>(fileSystemLocationsToAdd);
    }

    /**
     * <p>
     * The file system location names to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocationsToAdd(java.util.Collection)} or
     * {@link #withFileSystemLocationsToAdd(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocationsToAdd
     *        The file system location names to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withFileSystemLocationsToAdd(FileSystemLocation... fileSystemLocationsToAdd) {
        if (this.fileSystemLocationsToAdd == null) {
            setFileSystemLocationsToAdd(new java.util.ArrayList<FileSystemLocation>(fileSystemLocationsToAdd.length));
        }
        for (FileSystemLocation ele : fileSystemLocationsToAdd) {
            this.fileSystemLocationsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file system location names to add.
     * </p>
     * 
     * @param fileSystemLocationsToAdd
     *        The file system location names to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withFileSystemLocationsToAdd(java.util.Collection<FileSystemLocation> fileSystemLocationsToAdd) {
        setFileSystemLocationsToAdd(fileSystemLocationsToAdd);
        return this;
    }

    /**
     * <p>
     * The file system location names to remove.
     * </p>
     * 
     * @return The file system location names to remove.
     */

    public java.util.List<FileSystemLocation> getFileSystemLocationsToRemove() {
        return fileSystemLocationsToRemove;
    }

    /**
     * <p>
     * The file system location names to remove.
     * </p>
     * 
     * @param fileSystemLocationsToRemove
     *        The file system location names to remove.
     */

    public void setFileSystemLocationsToRemove(java.util.Collection<FileSystemLocation> fileSystemLocationsToRemove) {
        if (fileSystemLocationsToRemove == null) {
            this.fileSystemLocationsToRemove = null;
            return;
        }

        this.fileSystemLocationsToRemove = new java.util.ArrayList<FileSystemLocation>(fileSystemLocationsToRemove);
    }

    /**
     * <p>
     * The file system location names to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocationsToRemove(java.util.Collection)} or
     * {@link #withFileSystemLocationsToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocationsToRemove
     *        The file system location names to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withFileSystemLocationsToRemove(FileSystemLocation... fileSystemLocationsToRemove) {
        if (this.fileSystemLocationsToRemove == null) {
            setFileSystemLocationsToRemove(new java.util.ArrayList<FileSystemLocation>(fileSystemLocationsToRemove.length));
        }
        for (FileSystemLocation ele : fileSystemLocationsToRemove) {
            this.fileSystemLocationsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file system location names to remove.
     * </p>
     * 
     * @param fileSystemLocationsToRemove
     *        The file system location names to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withFileSystemLocationsToRemove(java.util.Collection<FileSystemLocation> fileSystemLocationsToRemove) {
        setFileSystemLocationsToRemove(fileSystemLocationsToRemove);
        return this;
    }

    /**
     * <p>
     * The OS system to update.
     * </p>
     * 
     * @param osFamily
     *        The OS system to update.
     * @see StorageProfileOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The OS system to update.
     * </p>
     * 
     * @return The OS system to update.
     * @see StorageProfileOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The OS system to update.
     * </p>
     * 
     * @param osFamily
     *        The OS system to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public UpdateStorageProfileRequest withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The OS system to update.
     * </p>
     * 
     * @param osFamily
     *        The OS system to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public UpdateStorageProfileRequest withOsFamily(StorageProfileOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
        return this;
    }

    /**
     * <p>
     * The storage profile ID to update.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID to update.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID to update.
     * </p>
     * 
     * @return The storage profile ID to update.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID to update.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageProfileRequest withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFileSystemLocationsToAdd() != null)
            sb.append("FileSystemLocationsToAdd: ").append("***Sensitive Data Redacted***").append(",");
        if (getFileSystemLocationsToRemove() != null)
            sb.append("FileSystemLocationsToRemove: ").append("***Sensitive Data Redacted***").append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageProfileRequest == false)
            return false;
        UpdateStorageProfileRequest other = (UpdateStorageProfileRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFileSystemLocationsToAdd() == null ^ this.getFileSystemLocationsToAdd() == null)
            return false;
        if (other.getFileSystemLocationsToAdd() != null && other.getFileSystemLocationsToAdd().equals(this.getFileSystemLocationsToAdd()) == false)
            return false;
        if (other.getFileSystemLocationsToRemove() == null ^ this.getFileSystemLocationsToRemove() == null)
            return false;
        if (other.getFileSystemLocationsToRemove() != null && other.getFileSystemLocationsToRemove().equals(this.getFileSystemLocationsToRemove()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemLocationsToAdd() == null) ? 0 : getFileSystemLocationsToAdd().hashCode());
        hashCode = prime * hashCode + ((getFileSystemLocationsToRemove() == null) ? 0 : getFileSystemLocationsToRemove().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageProfileRequest clone() {
        return (UpdateStorageProfileRequest) super.clone();
    }

}
