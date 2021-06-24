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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Amazon Elastic File System file system that is used for task storage.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     */
    private AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails authorizationConfig;
    /**
     * <p>
     * The Amazon EFS file system identifier to use.
     * </p>
     */
    private String filesystemId;
    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host.
     * </p>
     */
    private String rootDirectory;
    /**
     * <p>
     * Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server.
     * </p>
     */
    private String transitEncryption;
    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     * </p>
     */
    private Integer transitEncryptionPort;

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * 
     * @param authorizationConfig
     *        The authorization configuration details for the Amazon EFS file system.
     */

    public void setAuthorizationConfig(AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * 
     * @return The authorization configuration details for the Amazon EFS file system.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails getAuthorizationConfig() {
        return this.authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * 
     * @param authorizationConfig
     *        The authorization configuration details for the Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails withAuthorizationConfig(
            AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails authorizationConfig) {
        setAuthorizationConfig(authorizationConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon EFS file system identifier to use.
     * </p>
     * 
     * @param filesystemId
     *        The Amazon EFS file system identifier to use.
     */

    public void setFilesystemId(String filesystemId) {
        this.filesystemId = filesystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system identifier to use.
     * </p>
     * 
     * @return The Amazon EFS file system identifier to use.
     */

    public String getFilesystemId() {
        return this.filesystemId;
    }

    /**
     * <p>
     * The Amazon EFS file system identifier to use.
     * </p>
     * 
     * @param filesystemId
     *        The Amazon EFS file system identifier to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails withFilesystemId(String filesystemId) {
        setFilesystemId(filesystemId);
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

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails withRootDirectory(String rootDirectory) {
        setRootDirectory(rootDirectory);
        return this;
    }

    /**
     * <p>
     * Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server.
     * </p>
     * 
     * @param transitEncryption
     *        Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     *        server.
     */

    public void setTransitEncryption(String transitEncryption) {
        this.transitEncryption = transitEncryption;
    }

    /**
     * <p>
     * Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server.
     * </p>
     * 
     * @return Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
     *         EFS server.
     */

    public String getTransitEncryption() {
        return this.transitEncryption;
    }

    /**
     * <p>
     * Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server.
     * </p>
     * 
     * @param transitEncryption
     *        Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     *        server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails withTransitEncryption(String transitEncryption) {
        setTransitEncryption(transitEncryption);
        return this;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     * </p>
     * 
     * @param transitEncryptionPort
     *        The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     */

    public void setTransitEncryptionPort(Integer transitEncryptionPort) {
        this.transitEncryptionPort = transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     * </p>
     * 
     * @return The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     */

    public Integer getTransitEncryptionPort() {
        return this.transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     * </p>
     * 
     * @param transitEncryptionPort
     *        The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails withTransitEncryptionPort(Integer transitEncryptionPort) {
        setTransitEncryptionPort(transitEncryptionPort);
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
        if (getAuthorizationConfig() != null)
            sb.append("AuthorizationConfig: ").append(getAuthorizationConfig()).append(",");
        if (getFilesystemId() != null)
            sb.append("FilesystemId: ").append(getFilesystemId()).append(",");
        if (getRootDirectory() != null)
            sb.append("RootDirectory: ").append(getRootDirectory()).append(",");
        if (getTransitEncryption() != null)
            sb.append("TransitEncryption: ").append(getTransitEncryption()).append(",");
        if (getTransitEncryptionPort() != null)
            sb.append("TransitEncryptionPort: ").append(getTransitEncryptionPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails == false)
            return false;
        AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails other = (AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails) obj;
        if (other.getAuthorizationConfig() == null ^ this.getAuthorizationConfig() == null)
            return false;
        if (other.getAuthorizationConfig() != null && other.getAuthorizationConfig().equals(this.getAuthorizationConfig()) == false)
            return false;
        if (other.getFilesystemId() == null ^ this.getFilesystemId() == null)
            return false;
        if (other.getFilesystemId() != null && other.getFilesystemId().equals(this.getFilesystemId()) == false)
            return false;
        if (other.getRootDirectory() == null ^ this.getRootDirectory() == null)
            return false;
        if (other.getRootDirectory() != null && other.getRootDirectory().equals(this.getRootDirectory()) == false)
            return false;
        if (other.getTransitEncryption() == null ^ this.getTransitEncryption() == null)
            return false;
        if (other.getTransitEncryption() != null && other.getTransitEncryption().equals(this.getTransitEncryption()) == false)
            return false;
        if (other.getTransitEncryptionPort() == null ^ this.getTransitEncryptionPort() == null)
            return false;
        if (other.getTransitEncryptionPort() != null && other.getTransitEncryptionPort().equals(this.getTransitEncryptionPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationConfig() == null) ? 0 : getAuthorizationConfig().hashCode());
        hashCode = prime * hashCode + ((getFilesystemId() == null) ? 0 : getFilesystemId().hashCode());
        hashCode = prime * hashCode + ((getRootDirectory() == null) ? 0 : getRootDirectory().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryption() == null) ? 0 : getTransitEncryption().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionPort() == null) ? 0 : getTransitEncryptionPort().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails clone() {
        try {
            return (AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
