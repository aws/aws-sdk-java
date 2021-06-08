/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a shared file storage system that is associated with a studio resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/SharedFileSystemConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharedFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint of the shared file system that is accessed by the studio component resource.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The unique identifier for a file system.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The mount location for a shared file system on a Linux virtual workstation.
     * </p>
     */
    private String linuxMountPoint;
    /**
     * <p>
     * The name of the file share.
     * </p>
     */
    private String shareName;
    /**
     * <p>
     * The mount location for a shared file system on a Windows virtual workstation.
     * </p>
     */
    private String windowsMountDrive;

    /**
     * <p>
     * The endpoint of the shared file system that is accessed by the studio component resource.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of the shared file system that is accessed by the studio component resource.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint of the shared file system that is accessed by the studio component resource.
     * </p>
     * 
     * @return The endpoint of the shared file system that is accessed by the studio component resource.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint of the shared file system that is accessed by the studio component resource.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of the shared file system that is accessed by the studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedFileSystemConfiguration withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a file system.
     * </p>
     * 
     * @param fileSystemId
     *        The unique identifier for a file system.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The unique identifier for a file system.
     * </p>
     * 
     * @return The unique identifier for a file system.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The unique identifier for a file system.
     * </p>
     * 
     * @param fileSystemId
     *        The unique identifier for a file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedFileSystemConfiguration withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Linux virtual workstation.
     * </p>
     * 
     * @param linuxMountPoint
     *        The mount location for a shared file system on a Linux virtual workstation.
     */

    public void setLinuxMountPoint(String linuxMountPoint) {
        this.linuxMountPoint = linuxMountPoint;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Linux virtual workstation.
     * </p>
     * 
     * @return The mount location for a shared file system on a Linux virtual workstation.
     */

    public String getLinuxMountPoint() {
        return this.linuxMountPoint;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Linux virtual workstation.
     * </p>
     * 
     * @param linuxMountPoint
     *        The mount location for a shared file system on a Linux virtual workstation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedFileSystemConfiguration withLinuxMountPoint(String linuxMountPoint) {
        setLinuxMountPoint(linuxMountPoint);
        return this;
    }

    /**
     * <p>
     * The name of the file share.
     * </p>
     * 
     * @param shareName
     *        The name of the file share.
     */

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * <p>
     * The name of the file share.
     * </p>
     * 
     * @return The name of the file share.
     */

    public String getShareName() {
        return this.shareName;
    }

    /**
     * <p>
     * The name of the file share.
     * </p>
     * 
     * @param shareName
     *        The name of the file share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedFileSystemConfiguration withShareName(String shareName) {
        setShareName(shareName);
        return this;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Windows virtual workstation.
     * </p>
     * 
     * @param windowsMountDrive
     *        The mount location for a shared file system on a Windows virtual workstation.
     */

    public void setWindowsMountDrive(String windowsMountDrive) {
        this.windowsMountDrive = windowsMountDrive;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Windows virtual workstation.
     * </p>
     * 
     * @return The mount location for a shared file system on a Windows virtual workstation.
     */

    public String getWindowsMountDrive() {
        return this.windowsMountDrive;
    }

    /**
     * <p>
     * The mount location for a shared file system on a Windows virtual workstation.
     * </p>
     * 
     * @param windowsMountDrive
     *        The mount location for a shared file system on a Windows virtual workstation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedFileSystemConfiguration withWindowsMountDrive(String windowsMountDrive) {
        setWindowsMountDrive(windowsMountDrive);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLinuxMountPoint() != null)
            sb.append("LinuxMountPoint: ").append(getLinuxMountPoint()).append(",");
        if (getShareName() != null)
            sb.append("ShareName: ").append(getShareName()).append(",");
        if (getWindowsMountDrive() != null)
            sb.append("WindowsMountDrive: ").append(getWindowsMountDrive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharedFileSystemConfiguration == false)
            return false;
        SharedFileSystemConfiguration other = (SharedFileSystemConfiguration) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLinuxMountPoint() == null ^ this.getLinuxMountPoint() == null)
            return false;
        if (other.getLinuxMountPoint() != null && other.getLinuxMountPoint().equals(this.getLinuxMountPoint()) == false)
            return false;
        if (other.getShareName() == null ^ this.getShareName() == null)
            return false;
        if (other.getShareName() != null && other.getShareName().equals(this.getShareName()) == false)
            return false;
        if (other.getWindowsMountDrive() == null ^ this.getWindowsMountDrive() == null)
            return false;
        if (other.getWindowsMountDrive() != null && other.getWindowsMountDrive().equals(this.getWindowsMountDrive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLinuxMountPoint() == null) ? 0 : getLinuxMountPoint().hashCode());
        hashCode = prime * hashCode + ((getShareName() == null) ? 0 : getShareName().hashCode());
        hashCode = prime * hashCode + ((getWindowsMountDrive() == null) ? 0 : getWindowsMountDrive().hashCode());
        return hashCode;
    }

    @Override
    public SharedFileSystemConfiguration clone() {
        try {
            return (SharedFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.SharedFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
