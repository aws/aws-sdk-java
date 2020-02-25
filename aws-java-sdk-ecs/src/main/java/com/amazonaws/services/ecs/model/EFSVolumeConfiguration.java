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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This parameter is specified when you are using an Amazon Elastic File System (Amazon EFS) file storage. Amazon EFS
 * file systems are only supported when you are using the EC2 launch type.
 * </p>
 * <important>
 * <p>
 * <code>EFSVolumeConfiguration</code> remains in preview and is a Beta Service as defined by and subject to the Beta
 * Service Participation Service Terms located at <a
 * href="https://aws.amazon.com/service-terms">https://aws.amazon.com/service-terms</a> ("Beta Terms"). These Beta Terms
 * apply to your participation in this preview of <code>EFSVolumeConfiguration</code>.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/EFSVolumeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EFSVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * </p>
     */
    private String rootDirectory;

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     * 
     * @param fileSystemId
     *        The Amazon EFS file system ID to use.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     * 
     * @return The Amazon EFS file system ID to use.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system ID to use.
     * </p>
     * 
     * @param fileSystemId
     *        The Amazon EFS file system ID to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSVolumeConfiguration withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * </p>
     * 
     * @param rootDirectory
     *        The directory within the Amazon EFS file system to mount as the root directory inside the host.
     */

    public void setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * </p>
     * 
     * @return The directory within the Amazon EFS file system to mount as the root directory inside the host.
     */

    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * </p>
     * 
     * @param rootDirectory
     *        The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSVolumeConfiguration withRootDirectory(String rootDirectory) {
        setRootDirectory(rootDirectory);
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
        if (getRootDirectory() != null)
            sb.append("RootDirectory: ").append(getRootDirectory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EFSVolumeConfiguration == false)
            return false;
        EFSVolumeConfiguration other = (EFSVolumeConfiguration) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        return hashCode;
    }

    @Override
    public EFSVolumeConfiguration clone() {
        try {
            return (EFSVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.EFSVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
