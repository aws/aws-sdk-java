/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the storage configuration for an Amazon EFS file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/EfsStorageConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EfsStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file system identifier.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The mount point for the file system.
     * </p>
     */
    private String mountPoint;

    /**
     * <p>
     * The file system identifier.
     * </p>
     * 
     * @param fileSystemId
     *        The file system identifier.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The file system identifier.
     * </p>
     * 
     * @return The file system identifier.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The file system identifier.
     * </p>
     * 
     * @param fileSystemId
     *        The file system identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfsStorageConfiguration withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The mount point for the file system.
     * </p>
     * 
     * @param mountPoint
     *        The mount point for the file system.
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The mount point for the file system.
     * </p>
     * 
     * @return The mount point for the file system.
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The mount point for the file system.
     * </p>
     * 
     * @param mountPoint
     *        The mount point for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfsStorageConfiguration withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
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
        if (getMountPoint() != null)
            sb.append("MountPoint: ").append(getMountPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EfsStorageConfiguration == false)
            return false;
        EfsStorageConfiguration other = (EfsStorageConfiguration) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        return hashCode;
    }

    @Override
    public EfsStorageConfiguration clone() {
        try {
            return (EfsStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.EfsStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
