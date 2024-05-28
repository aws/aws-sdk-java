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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateStorageProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStorageProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The display name of the storage profile.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID of the farm to connect to the storage profile.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * File system paths to include in the storage profile.
     * </p>
     */
    private java.util.List<FileSystemLocation> fileSystemLocations;
    /**
     * <p>
     * The type of operating system (OS) for the storage profile.
     * </p>
     */
    private String osFamily;

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

    public CreateStorageProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateStorageProfileRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the storage profile.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the storage profile.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the storage profile.
     * </p>
     * 
     * @return The farm ID of the farm to connect to the storage profile.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the storage profile.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageProfileRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * File system paths to include in the storage profile.
     * </p>
     * 
     * @return File system paths to include in the storage profile.
     */

    public java.util.List<FileSystemLocation> getFileSystemLocations() {
        return fileSystemLocations;
    }

    /**
     * <p>
     * File system paths to include in the storage profile.
     * </p>
     * 
     * @param fileSystemLocations
     *        File system paths to include in the storage profile.
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
     * File system paths to include in the storage profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemLocations(java.util.Collection)} or {@link #withFileSystemLocations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fileSystemLocations
     *        File system paths to include in the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageProfileRequest withFileSystemLocations(FileSystemLocation... fileSystemLocations) {
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
     * File system paths to include in the storage profile.
     * </p>
     * 
     * @param fileSystemLocations
     *        File system paths to include in the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageProfileRequest withFileSystemLocations(java.util.Collection<FileSystemLocation> fileSystemLocations) {
        setFileSystemLocations(fileSystemLocations);
        return this;
    }

    /**
     * <p>
     * The type of operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The type of operating system (OS) for the storage profile.
     * @see StorageProfileOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The type of operating system (OS) for the storage profile.
     * </p>
     * 
     * @return The type of operating system (OS) for the storage profile.
     * @see StorageProfileOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The type of operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The type of operating system (OS) for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public CreateStorageProfileRequest withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The type of operating system (OS) for the storage profile.
     * </p>
     * 
     * @param osFamily
     *        The type of operating system (OS) for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageProfileOperatingSystemFamily
     */

    public CreateStorageProfileRequest withOsFamily(StorageProfileOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
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
        if (getFileSystemLocations() != null)
            sb.append("FileSystemLocations: ").append("***Sensitive Data Redacted***").append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStorageProfileRequest == false)
            return false;
        CreateStorageProfileRequest other = (CreateStorageProfileRequest) obj;
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
        if (other.getFileSystemLocations() == null ^ this.getFileSystemLocations() == null)
            return false;
        if (other.getFileSystemLocations() != null && other.getFileSystemLocations().equals(this.getFileSystemLocations()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
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
        hashCode = prime * hashCode + ((getFileSystemLocations() == null) ? 0 : getFileSystemLocations().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        return hashCode;
    }

    @Override
    public CreateStorageProfileRequest clone() {
        return (CreateStorageProfileRequest) super.clone();
    }

}
