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
 * This parameter is specified when you are using an Amazon Elastic File System file system for task storage. For more
 * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/efs-volumes.html">Amazon EFS
 * Volumes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
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
     * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter
     * is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have the same effect
     * as omitting this parameter.
     * </p>
     * <important>
     * <p>
     * If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter must
     * either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     * </p>
     * </important>
     */
    private String rootDirectory;
    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted,
     * the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a> in the
     * <i>Amazon Elastic File System User Guide</i>.
     * </p>
     */
    private String transitEncryption;
    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not
     * specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount
     * Helper</a> in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     */
    private Integer transitEncryptionPort;
    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     */
    private EFSAuthorizationConfig authorizationConfig;

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
     * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter
     * is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have the same effect
     * as omitting this parameter.
     * </p>
     * <important>
     * <p>
     * If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter must
     * either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     * </p>
     * </important>
     * 
     * @param rootDirectory
     *        The directory within the Amazon EFS file system to mount as the root directory inside the host. If this
     *        parameter is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have
     *        the same effect as omitting this parameter.</p> <important>
     *        <p>
     *        If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter
     *        must either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     *        </p>
     */

    public void setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter
     * is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have the same effect
     * as omitting this parameter.
     * </p>
     * <important>
     * <p>
     * If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter must
     * either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     * </p>
     * </important>
     * 
     * @return The directory within the Amazon EFS file system to mount as the root directory inside the host. If this
     *         parameter is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have
     *         the same effect as omitting this parameter.</p> <important>
     *         <p>
     *         If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter
     *         must either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     *         </p>
     */

    public String getRootDirectory() {
        return this.rootDirectory;
    }

    /**
     * <p>
     * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter
     * is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have the same effect
     * as omitting this parameter.
     * </p>
     * <important>
     * <p>
     * If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter must
     * either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     * </p>
     * </important>
     * 
     * @param rootDirectory
     *        The directory within the Amazon EFS file system to mount as the root directory inside the host. If this
     *        parameter is omitted, the root of the Amazon EFS volume will be used. Specifying <code>/</code> will have
     *        the same effect as omitting this parameter.</p> <important>
     *        <p>
     *        If an EFS access point is specified in the <code>authorizationConfig</code>, the root directory parameter
     *        must either be omitted or set to <code>/</code> which will enforce the path set on the EFS access point.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSVolumeConfiguration withRootDirectory(String rootDirectory) {
        setRootDirectory(rootDirectory);
        return this;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted,
     * the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a> in the
     * <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param transitEncryption
     *        Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the
     *        Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
     *        parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a>
     *        in the <i>Amazon Elastic File System User Guide</i>.
     * @see EFSTransitEncryption
     */

    public void setTransitEncryption(String transitEncryption) {
        this.transitEncryption = transitEncryption;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted,
     * the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a> in the
     * <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @return Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the
     *         Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
     *         parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     *         href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in
     *         Transit</a> in the <i>Amazon Elastic File System User Guide</i>.
     * @see EFSTransitEncryption
     */

    public String getTransitEncryption() {
        return this.transitEncryption;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted,
     * the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a> in the
     * <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param transitEncryption
     *        Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the
     *        Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
     *        parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a>
     *        in the <i>Amazon Elastic File System User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EFSTransitEncryption
     */

    public EFSVolumeConfiguration withTransitEncryption(String transitEncryption) {
        setTransitEncryption(transitEncryption);
        return this;
    }

    /**
     * <p>
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS
     * server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted,
     * the default value of <code>DISABLED</code> is used. For more information, see <a
     * href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a> in the
     * <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param transitEncryption
     *        Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the
     *        Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this
     *        parameter is omitted, the default value of <code>DISABLED</code> is used. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html">Encrypting Data in Transit</a>
     *        in the <i>Amazon Elastic File System User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EFSTransitEncryption
     */

    public EFSVolumeConfiguration withTransitEncryption(EFSTransitEncryption transitEncryption) {
        this.transitEncryption = transitEncryption.toString();
        return this;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not
     * specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount
     * Helper</a> in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param transitEncryptionPort
     *        The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you
     *        do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS
     *        mount helper uses. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount Helper</a> in the
     *        <i>Amazon Elastic File System User Guide</i>.
     */

    public void setTransitEncryptionPort(Integer transitEncryptionPort) {
        this.transitEncryptionPort = transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not
     * specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount
     * Helper</a> in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @return The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you
     *         do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS
     *         mount helper uses. For more information, see <a
     *         href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount Helper</a> in the
     *         <i>Amazon Elastic File System User Guide</i>.
     */

    public Integer getTransitEncryptionPort() {
        return this.transitEncryptionPort;
    }

    /**
     * <p>
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not
     * specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * For more information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount
     * Helper</a> in the <i>Amazon Elastic File System User Guide</i>.
     * </p>
     * 
     * @param transitEncryptionPort
     *        The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you
     *        do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS
     *        mount helper uses. For more information, see <a
     *        href="https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html">EFS Mount Helper</a> in the
     *        <i>Amazon Elastic File System User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EFSVolumeConfiguration withTransitEncryptionPort(Integer transitEncryptionPort) {
        setTransitEncryptionPort(transitEncryptionPort);
        return this;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * 
     * @param authorizationConfig
     *        The authorization configuration details for the Amazon EFS file system.
     */

    public void setAuthorizationConfig(EFSAuthorizationConfig authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
    }

    /**
     * <p>
     * The authorization configuration details for the Amazon EFS file system.
     * </p>
     * 
     * @return The authorization configuration details for the Amazon EFS file system.
     */

    public EFSAuthorizationConfig getAuthorizationConfig() {
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

    public EFSVolumeConfiguration withAuthorizationConfig(EFSAuthorizationConfig authorizationConfig) {
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
        if (getTransitEncryption() != null)
            sb.append("TransitEncryption: ").append(getTransitEncryption()).append(",");
        if (getTransitEncryptionPort() != null)
            sb.append("TransitEncryptionPort: ").append(getTransitEncryptionPort()).append(",");
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
        if (other.getTransitEncryption() == null ^ this.getTransitEncryption() == null)
            return false;
        if (other.getTransitEncryption() != null && other.getTransitEncryption().equals(this.getTransitEncryption()) == false)
            return false;
        if (other.getTransitEncryptionPort() == null ^ this.getTransitEncryptionPort() == null)
            return false;
        if (other.getTransitEncryptionPort() != null && other.getTransitEncryptionPort().equals(this.getTransitEncryptionPort()) == false)
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
        hashCode = prime * hashCode + ((getTransitEncryption() == null) ? 0 : getTransitEncryption().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionPort() == null) ? 0 : getTransitEncryptionPort().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationConfig() == null) ? 0 : getAuthorizationConfig().hashCode());
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
