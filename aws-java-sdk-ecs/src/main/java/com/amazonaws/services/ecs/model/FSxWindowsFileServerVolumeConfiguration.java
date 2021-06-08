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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This parameter is specified when you are using <a
 * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/what-is.html">Amazon FSx for Windows File Server</a> file
 * system for task storage.
 * </p>
 * <p>
 * For more information and the input format, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/wfsx-volumes.html">Amazon FSx for Windows File
 * Server Volumes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/FSxWindowsFileServerVolumeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FSxWindowsFileServerVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon FSx for Windows File Server file system ID to use.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the
     * host.
     * </p>
     */
    private String rootDirectory;
    /**
     * <p>
     * The authorization configuration details for the Amazon FSx for Windows File Server file system.
     * </p>
     */
    private FSxWindowsFileServerAuthorizationConfig authorizationConfig;

    /**
     * <p>
     * The Amazon FSx for Windows File Server file system ID to use.
     * </p>
     * 
     * @param fileSystemId
     *        The Amazon FSx for Windows File Server file system ID to use.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The Amazon FSx for Windows File Server file system ID to use.
     * </p>
     * 
     * @return The Amazon FSx for Windows File Server file system ID to use.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The Amazon FSx for Windows File Server file system ID to use.
     * </p>
     * 
     * @param fileSystemId
     *        The Amazon FSx for Windows File Server file system ID to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FSxWindowsFileServerVolumeConfiguration withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the
     * host.
     * </p>
     * 
     * @param rootDirectory
     *        The directory within the Amazon FSx for Windows File Server file system to mount as the root directory
     *        inside the host.
     */

    public void setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the
     * host.
     * </p>
     * 
     * @return The directory within the Amazon FSx for Windows File Server file system to mount as the root directory
     *         inside the host.
     */

    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the
     * host.
     * </p>
     * 
     * @param rootDirectory
     *        The directory within the Amazon FSx for Windows File Server file system to mount as the root directory
     *        inside the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FSxWindowsFileServerVolumeConfiguration withRootDirectory(String rootDirectory) {
        setRootDirectory(rootDirectory);
        return this;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param authorizationConfig
     *        The authorization configuration details for the Amazon FSx for Windows File Server file system.
     */

    public void setAuthorizationConfig(FSxWindowsFileServerAuthorizationConfig authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @return The authorization configuration details for the Amazon FSx for Windows File Server file system.
     */

    public FSxWindowsFileServerAuthorizationConfig getAuthorizationConfig() {
        return this.authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param authorizationConfig
     *        The authorization configuration details for the Amazon FSx for Windows File Server file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FSxWindowsFileServerVolumeConfiguration withAuthorizationConfig(FSxWindowsFileServerAuthorizationConfig authorizationConfig) {
        setAuthorizationConfig(authorizationConfig);
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
            sb.append("RootDirectory: ").append(getRootDirectory()).append(",");
        if (getAuthorizationConfig() != null)
            sb.append("AuthorizationConfig: ").append(getAuthorizationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FSxWindowsFileServerVolumeConfiguration == false)
            return false;
        FSxWindowsFileServerVolumeConfiguration other = (FSxWindowsFileServerVolumeConfiguration) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        if (other.getAuthorizationConfig() == null ^ this.getAuthorizationConfig() == null)
            return false;
        if (other.getAuthorizationConfig() != null && other.getAuthorizationConfig().equals(this.getAuthorizationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationConfig() == null) ? 0 : getAuthorizationConfig().hashCode());
        return hashCode;
    }

    @Override
    public FSxWindowsFileServerVolumeConfiguration clone() {
        try {
            return (FSxWindowsFileServerVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.FSxWindowsFileServerVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
