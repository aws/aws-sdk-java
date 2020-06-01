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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for the <code>UpdateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     * Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current storage capacity value. In order to
     * increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make
     * a storage capacity increase request if there is an existing storage capacity increase request in progress. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     */
    private UpdateFileSystemWindowsConfiguration windowsConfiguration;

    private UpdateFileSystemLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * 
     * @param fileSystemId
     *        Identifies the file system that you are updating.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * 
     * @return Identifies the file system that you are updating.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * 
     * @param fileSystemId
     *        Identifies the file system that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *        automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *         automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *        automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     * Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current storage capacity value. In order to
     * increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make
     * a storage capacity increase request if there is an existing storage capacity increase request in progress. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * 
     * @param storageCapacity
     *        Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     *        Specifies the storage capacity target value, GiB, for the file system you're updating. The storage
     *        capacity target value must be at least 10 percent (%) greater than the current storage capacity value. In
     *        order to increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity.
     *        You cannot make a storage capacity increase request if there is an existing storage capacity increase
     *        request in progress. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     *        Capacity</a>.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     * Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current storage capacity value. In order to
     * increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make
     * a storage capacity increase request if there is an existing storage capacity increase request in progress. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * 
     * @return Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     *         Specifies the storage capacity target value, GiB, for the file system you're updating. The storage
     *         capacity target value must be at least 10 percent (%) greater than the current storage capacity value. In
     *         order to increase storage capacity, the file system needs to have at least 16 MB/s of throughput
     *         capacity. You cannot make a storage capacity increase request if there is an existing storage capacity
     *         increase request in progress. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing
     *         Storage Capacity</a>.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     * Specifies the storage capacity target value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current storage capacity value. In order to
     * increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity. You cannot make
     * a storage capacity increase request if there is an existing storage capacity increase request in progress. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     * Capacity</a>.
     * </p>
     * 
     * @param storageCapacity
     *        Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server file system.
     *        Specifies the storage capacity target value, GiB, for the file system you're updating. The storage
     *        capacity target value must be at least 10 percent (%) greater than the current storage capacity value. In
     *        order to increase storage capacity, the file system needs to have at least 16 MB/s of throughput capacity.
     *        You cannot make a storage capacity increase request if there is an existing storage capacity increase
     *        request in progress. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing Storage
     *        Capacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration updates for an Amazon FSx for Windows File Server file system.
     */

    public void setWindowsConfiguration(UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @return The configuration updates for an Amazon FSx for Windows File Server file system.
     */

    public UpdateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration updates for an Amazon FSx for Windows File Server file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withWindowsConfiguration(UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        setWindowsConfiguration(windowsConfiguration);
        return this;
    }

    /**
     * @param lustreConfiguration
     */

    public void setLustreConfiguration(UpdateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * @return
     */

    public UpdateFileSystemLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * @param lustreConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withLustreConfiguration(UpdateFileSystemLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemRequest clone() {
        return (UpdateFileSystemRequest) super.clone();
    }

}
