/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of the ONTAP volume that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateOntapVolumeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOntapVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     */
    private String junctionPath;
    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style">Volume
     * security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     */
    private String securityStyle;
    /**
     * <p>
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     */
    private Integer sizeInMegabytes;
    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * </p>
     */
    private Boolean storageEfficiencyEnabled;
    /**
     * <p>
     * Specifies the ONTAP SVM in which to create the volume.
     * </p>
     */
    private String storageVirtualMachineId;

    private TieringPolicy tieringPolicy;

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *        must have a leading forward slash, such as <code>/vol3</code>.
     */

    public void setJunctionPath(String junctionPath) {
        this.junctionPath = junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @return Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *         must have a leading forward slash, such as <code>/vol3</code>.
     */

    public String getJunctionPath() {
        return this.junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *        must have a leading forward slash, such as <code>/vol3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withJunctionPath(String junctionPath) {
        setJunctionPath(junctionPath);
        return this;
    }

    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style">Volume
     * security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style"
     *        >Volume security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @see SecurityStyle
     */

    public void setSecurityStyle(String securityStyle) {
        this.securityStyle = securityStyle;
    }

    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style">Volume
     * security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the security style for the volume. If a volume's security style is not specified, it is
     *         automatically set to the root volume's security style. The security style determines the type of
     *         permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style"
     *         >Volume security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *         clients, and an application accessing the data uses a UNIX user as the service account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *         clients, and an application accessing the data uses a Windows user as the service account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users
     *         consist of both NFS and SMB clients.
     *         </p>
     *         </li>
     * @see SecurityStyle
     */

    public String getSecurityStyle() {
        return this.securityStyle;
    }

    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style">Volume
     * security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style"
     *        >Volume security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public CreateOntapVolumeConfiguration withSecurityStyle(String securityStyle) {
        setSecurityStyle(securityStyle);
        return this;
    }

    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style">Volume
     * security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html#volume-security-style"
     *        >Volume security style</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public CreateOntapVolumeConfiguration withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Specifies the size of the volume, in megabytes (MB), that you are creating.
     */

    public void setSizeInMegabytes(Integer sizeInMegabytes) {
        this.sizeInMegabytes = sizeInMegabytes;
    }

    /**
     * <p>
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @return Specifies the size of the volume, in megabytes (MB), that you are creating.
     */

    public Integer getSizeInMegabytes() {
        return this.sizeInMegabytes;
    }

    /**
     * <p>
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Specifies the size of the volume, in megabytes (MB), that you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withSizeInMegabytes(Integer sizeInMegabytes) {
        setSizeInMegabytes(sizeInMegabytes);
        return this;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *        volume.
     */

    public void setStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        this.storageEfficiencyEnabled = storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * </p>
     * 
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *         volume.
     */

    public Boolean getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *        volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        setStorageEfficiencyEnabled(storageEfficiencyEnabled);
        return this;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     * </p>
     * 
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *         volume.
     */

    public Boolean isStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Specifies the ONTAP SVM in which to create the volume.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        Specifies the ONTAP SVM in which to create the volume.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * Specifies the ONTAP SVM in which to create the volume.
     * </p>
     * 
     * @return Specifies the ONTAP SVM in which to create the volume.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * Specifies the ONTAP SVM in which to create the volume.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        Specifies the ONTAP SVM in which to create the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
        return this;
    }

    /**
     * @param tieringPolicy
     */

    public void setTieringPolicy(TieringPolicy tieringPolicy) {
        this.tieringPolicy = tieringPolicy;
    }

    /**
     * @return
     */

    public TieringPolicy getTieringPolicy() {
        return this.tieringPolicy;
    }

    /**
     * @param tieringPolicy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withTieringPolicy(TieringPolicy tieringPolicy) {
        setTieringPolicy(tieringPolicy);
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
        if (getJunctionPath() != null)
            sb.append("JunctionPath: ").append(getJunctionPath()).append(",");
        if (getSecurityStyle() != null)
            sb.append("SecurityStyle: ").append(getSecurityStyle()).append(",");
        if (getSizeInMegabytes() != null)
            sb.append("SizeInMegabytes: ").append(getSizeInMegabytes()).append(",");
        if (getStorageEfficiencyEnabled() != null)
            sb.append("StorageEfficiencyEnabled: ").append(getStorageEfficiencyEnabled()).append(",");
        if (getStorageVirtualMachineId() != null)
            sb.append("StorageVirtualMachineId: ").append(getStorageVirtualMachineId()).append(",");
        if (getTieringPolicy() != null)
            sb.append("TieringPolicy: ").append(getTieringPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOntapVolumeConfiguration == false)
            return false;
        CreateOntapVolumeConfiguration other = (CreateOntapVolumeConfiguration) obj;
        if (other.getJunctionPath() == null ^ this.getJunctionPath() == null)
            return false;
        if (other.getJunctionPath() != null && other.getJunctionPath().equals(this.getJunctionPath()) == false)
            return false;
        if (other.getSecurityStyle() == null ^ this.getSecurityStyle() == null)
            return false;
        if (other.getSecurityStyle() != null && other.getSecurityStyle().equals(this.getSecurityStyle()) == false)
            return false;
        if (other.getSizeInMegabytes() == null ^ this.getSizeInMegabytes() == null)
            return false;
        if (other.getSizeInMegabytes() != null && other.getSizeInMegabytes().equals(this.getSizeInMegabytes()) == false)
            return false;
        if (other.getStorageEfficiencyEnabled() == null ^ this.getStorageEfficiencyEnabled() == null)
            return false;
        if (other.getStorageEfficiencyEnabled() != null && other.getStorageEfficiencyEnabled().equals(this.getStorageEfficiencyEnabled()) == false)
            return false;
        if (other.getStorageVirtualMachineId() == null ^ this.getStorageVirtualMachineId() == null)
            return false;
        if (other.getStorageVirtualMachineId() != null && other.getStorageVirtualMachineId().equals(this.getStorageVirtualMachineId()) == false)
            return false;
        if (other.getTieringPolicy() == null ^ this.getTieringPolicy() == null)
            return false;
        if (other.getTieringPolicy() != null && other.getTieringPolicy().equals(this.getTieringPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJunctionPath() == null) ? 0 : getJunctionPath().hashCode());
        hashCode = prime * hashCode + ((getSecurityStyle() == null) ? 0 : getSecurityStyle().hashCode());
        hashCode = prime * hashCode + ((getSizeInMegabytes() == null) ? 0 : getSizeInMegabytes().hashCode());
        hashCode = prime * hashCode + ((getStorageEfficiencyEnabled() == null) ? 0 : getStorageEfficiencyEnabled().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        hashCode = prime * hashCode + ((getTieringPolicy() == null) ? 0 : getTieringPolicy().hashCode());
        return hashCode;
    }

    @Override
    public CreateOntapVolumeConfiguration clone() {
        try {
            return (CreateOntapVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateOntapVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
