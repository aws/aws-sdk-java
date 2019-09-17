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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a file system data source for a channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FileSystemDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file system id.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in
     * <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * </p>
     */
    private String fileSystemAccessMode;
    /**
     * <p>
     * The file system type.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     */
    private String directoryPath;

    /**
     * <p>
     * The file system id.
     * </p>
     * 
     * @param fileSystemId
     *        The file system id.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The file system id.
     * </p>
     * 
     * @return The file system id.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The file system id.
     * </p>
     * 
     * @param fileSystemId
     *        The file system id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDataSource withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in
     * <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * </p>
     * 
     * @param fileSystemAccessMode
     *        The access mode of the mount of the directory associated with the channel. A directory can be mounted
     *        either in <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * @see FileSystemAccessMode
     */

    public void setFileSystemAccessMode(String fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in
     * <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * </p>
     * 
     * @return The access mode of the mount of the directory associated with the channel. A directory can be mounted
     *         either in <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * @see FileSystemAccessMode
     */

    public String getFileSystemAccessMode() {
        return this.fileSystemAccessMode;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in
     * <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * </p>
     * 
     * @param fileSystemAccessMode
     *        The access mode of the mount of the directory associated with the channel. A directory can be mounted
     *        either in <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemAccessMode
     */

    public FileSystemDataSource withFileSystemAccessMode(String fileSystemAccessMode) {
        setFileSystemAccessMode(fileSystemAccessMode);
        return this;
    }

    /**
     * <p>
     * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in
     * <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * </p>
     * 
     * @param fileSystemAccessMode
     *        The access mode of the mount of the directory associated with the channel. A directory can be mounted
     *        either in <code>ro</code> (read-only) or <code>rw</code> (read-write).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemAccessMode
     */

    public FileSystemDataSource withFileSystemAccessMode(FileSystemAccessMode fileSystemAccessMode) {
        this.fileSystemAccessMode = fileSystemAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * 
     * @param fileSystemType
     *        The file system type.
     * @see FileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * 
     * @return The file system type.
     * @see FileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * 
     * @param fileSystemType
     *        The file system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystemDataSource withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * The file system type.
     * </p>
     * 
     * @param fileSystemType
     *        The file system type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystemDataSource withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * 
     * @param directoryPath
     *        The full path to the directory to associate with the channel.
     */

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * 
     * @return The full path to the directory to associate with the channel.
     */

    public String getDirectoryPath() {
        return this.directoryPath;
    }

    /**
     * <p>
     * The full path to the directory to associate with the channel.
     * </p>
     * 
     * @param directoryPath
     *        The full path to the directory to associate with the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemDataSource withDirectoryPath(String directoryPath) {
        setDirectoryPath(directoryPath);
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
        if (getFileSystemAccessMode() != null)
            sb.append("FileSystemAccessMode: ").append(getFileSystemAccessMode()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getDirectoryPath() != null)
            sb.append("DirectoryPath: ").append(getDirectoryPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemDataSource == false)
            return false;
        FileSystemDataSource other = (FileSystemDataSource) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemAccessMode() == null ^ this.getFileSystemAccessMode() == null)
            return false;
        if (other.getFileSystemAccessMode() != null && other.getFileSystemAccessMode().equals(this.getFileSystemAccessMode()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getDirectoryPath() == null ^ this.getDirectoryPath() == null)
            return false;
        if (other.getDirectoryPath() != null && other.getDirectoryPath().equals(this.getDirectoryPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAccessMode() == null) ? 0 : getFileSystemAccessMode().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getDirectoryPath() == null) ? 0 : getDirectoryPath().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemDataSource clone() {
        try {
            return (FileSystemDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FileSystemDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
