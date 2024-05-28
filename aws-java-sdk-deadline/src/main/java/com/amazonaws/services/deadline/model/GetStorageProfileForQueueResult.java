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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfileForQueue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStorageProfileForQueueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The display name of the storage profile connected to a queue.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The location of the files for the storage profile within the queue.
     * </p>
     */
    private java.util.List<FileSystemLocation> fileSystemLocations;
    /**
     * <p>
     * The operating system of the storage profile in the queue.
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
     * The display name of the storage profile connected to a queue.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile connected to a queue.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the storage profile connected to a queue.
     * </p>
     * 
     * @return The display name of the storage profile connected to a queue.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the storage profile connected to a queue.
     * </p>
     * 
     * @param displayName
     *        The display name of the storage profile connected to a queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileForQueueResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The location of the files for the storage profile within the queue.
     * </p>
     * 
     * @return The location of the files for the storage profile within the queue.
     */

    public java.util.List<FileSystemLocation> getFileSystemLocations() {
        return fileSystemLocations;
    }

    /**
     * <p>
     * The location of the files for the storage profile within the queue.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile within the queue.
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
     * The location of the files for the storage profile within the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocations(java.util.Collection)} or {@link #withFileSystemLocations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile within the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileForQueueResult withFileSystemLocations(FileSystemLocation... fileSystemLocations) {
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
     * The location of the files for the storage profile within the queue.
     * </p>
     * 
     * @param fileSystemLocations
     *        The location of the files for the storage profile within the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileForQueueResult withFileSystemLocations(java.util.Collection<FileSystemLocation> fileSystemLocations) {
        setFileSystemLocations(fileSystemLocations);
        return this;
    }

    /**
     * <p>
     * The operating system of the storage profile in the queue.
     * </p>
     * 
     * @param osFamily
     *        The operating system of the storage profile in the queue.
     * @see StorageProfileOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The operating system of the storage profile in the queue.
     * </p>
     * 
     * @return The operating system of the storage profile in the queue.
     * @see StorageProfileOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The operating system of the storage profile in the queue.
     * </p>
     * 
     * @param osFamily
     *        The operating system of the storage profile in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public GetStorageProfileForQueueResult withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The operating system of the storage profile in the queue.
     * </p>
     * 
     * @param osFamily
     *        The operating system of the storage profile in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public GetStorageProfileForQueueResult withOsFamily(StorageProfileOperatingSystemFamily osFamily) {
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

    public GetStorageProfileForQueueResult withStorageProfileId(String storageProfileId) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFileSystemLocations() != null)
            sb.append("FileSystemLocations: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetStorageProfileForQueueResult == false)
            return false;
        GetStorageProfileForQueueResult other = (GetStorageProfileForQueueResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFileSystemLocations() == null) ? 0 : getFileSystemLocations().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        return hashCode;
    }

    @Override
    public GetStorageProfileForQueueResult clone() {
        try {
            return (GetStorageProfileForQueueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
