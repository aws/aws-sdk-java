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
     * Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     * <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     */
    private String junctionPath;
    /**
     * <p>
     * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically
     * set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP
     * uses to control data access. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a> in the
     * <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
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
     * <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     * href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the security
     * styles and their effects are</a> in the NetApp Documentation Center.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security style</a> in
     * the FSx for ONTAP User Guide.
     * </p>
     */
    private String securityStyle;
    /**
     * <p>
     * Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     */
    @Deprecated
    private Integer sizeInMegabytes;
    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume, or
     * set to false to disable them.
     * </p>
     * <p>
     * <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     * <code>OntapVolumeType</code> set to <code>RW</code>).
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
     * Specifies the type of volume you are creating. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     * types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     */
    private String ontapVolumeType;
    /**
     * <p>
     * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes past the
     * hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of
     * two weekly snapshots taken every Sunday at 15 minutes after midnight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it only
     * retains one snapshot from the weekly schedule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to prevent
     * automatic snapshots from being taken.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     * policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     */
    private String snapshotPolicy;
    /**
     * <p>
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false.
     * If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the
     * user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the volume, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;
    /**
     * <p>
     * Specifies the SnapLock configuration for an FSx for ONTAP volume.
     * </p>
     */
    private CreateSnaplockConfiguration snaplockConfiguration;
    /**
     * <p>
     * Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use for
     * different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the Amazon FSx
     * for NetApp ONTAP User Guide.
     * </p>
     */
    private String volumeStyle;
    /**
     * <p>
     * Use to specify configuration options for a volume’s storage aggregate or aggregates.
     * </p>
     */
    private CreateAggregateConfiguration aggregateConfiguration;
    /**
     * <p>
     * Specifies the configured size of the volume, in bytes.
     * </p>
     */
    private Long sizeInBytes;

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     * <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     *        <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     */

    public void setJunctionPath(String junctionPath) {
        this.junctionPath = junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     * <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @return Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required.
     *         The <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     */

    public String getJunctionPath() {
        return this.junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     * <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. This parameter is required. The
     *        <code>JunctionPath</code> must have a leading forward slash, such as <code>/vol3</code>.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a> in the
     * <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
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
     * <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     * href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the security
     * styles and their effects are</a> in the NetApp Documentation Center.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security style</a> in
     * the FSx for ONTAP User Guide.
     * </p>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a>
     *        in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:</p>
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
     *        <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     *        href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the
     *        security styles and their effects are</a> in the NetApp Documentation Center.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security
     *        style</a> in the FSx for ONTAP User Guide.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a> in the
     * <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
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
     * <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     * href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the security
     * styles and their effects are</a> in the NetApp Documentation Center.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security style</a> in
     * the FSx for ONTAP User Guide.
     * </p>
     * 
     * @return Specifies the security style for the volume. If a volume's security style is not specified, it is
     *         automatically set to the root volume's security style. The security style determines the type of
     *         permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a>
     *         in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:</p>
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
     *         <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     *         href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the
     *         security styles and their effects are</a> in the NetApp Documentation Center.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security
     *         style</a> in the FSx for ONTAP User Guide.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a> in the
     * <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
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
     * <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     * href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the security
     * styles and their effects are</a> in the NetApp Documentation Center.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security style</a> in
     * the FSx for ONTAP User Guide.
     * </p>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a>
     *        in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:</p>
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
     *        <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     *        href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the
     *        security styles and their effects are</a> in the NetApp Documentation Center.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security
     *        style</a> in the FSx for ONTAP User Guide.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a> in the
     * <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:
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
     * <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     * href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the security
     * styles and their effects are</a> in the NetApp Documentation Center.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security style</a> in
     * the FSx for ONTAP User Guide.
     * </p>
     * 
     * @param securityStyle
     *        Specifies the security style for the volume. If a volume's security style is not specified, it is
     *        automatically set to the root volume's security style. The security style determines the type of
     *        permissions that FSx for ONTAP uses to control data access. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style">Volume security style</a>
     *        in the <i>Amazon FSx for NetApp ONTAP User Guide</i>. Specify one of the following values:</p>
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
     *        <code>MIXED</code> This is an advanced setting. For more information, see the topic <a
     *        href="https://docs.netapp.com/us-en/ontap/nfs-admin/security-styles-their-effects-concept.html">What the
     *        security styles and their effects are</a> in the NetApp Documentation Center.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-security-style.html">Volume security
     *        style</a> in the FSx for ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public CreateOntapVolumeConfiguration withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle.toString();
        return this;
    }

    /**
     * <p>
     * Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are
     *        creating.
     */
    @Deprecated
    public void setSizeInMegabytes(Integer sizeInMegabytes) {
        this.sizeInMegabytes = sizeInMegabytes;
    }

    /**
     * <p>
     * Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @return Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are
     *         creating.
     */
    @Deprecated
    public Integer getSizeInMegabytes() {
        return this.sizeInMegabytes;
    }

    /**
     * <p>
     * Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are creating.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Use <code>SizeInBytes</code> instead. Specifies the size of the volume, in megabytes (MB), that you are
     *        creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateOntapVolumeConfiguration withSizeInMegabytes(Integer sizeInMegabytes) {
        setSizeInMegabytes(sizeInMegabytes);
        return this;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume, or
     * set to false to disable them.
     * </p>
     * <p>
     * <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     * <code>OntapVolumeType</code> set to <code>RW</code>).
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *        volume, or set to false to disable them.</p>
     *        <p>
     *        <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     *        <code>OntapVolumeType</code> set to <code>RW</code>).
     */

    public void setStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        this.storageEfficiencyEnabled = storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume, or
     * set to false to disable them.
     * </p>
     * <p>
     * <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     * <code>OntapVolumeType</code> set to <code>RW</code>).
     * </p>
     * 
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *         volume, or set to false to disable them.</p>
     *         <p>
     *         <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     *         <code>OntapVolumeType</code> set to <code>RW</code>).
     */

    public Boolean getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume, or
     * set to false to disable them.
     * </p>
     * <p>
     * <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     * <code>OntapVolumeType</code> set to <code>RW</code>).
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *        volume, or set to false to disable them.</p>
     *        <p>
     *        <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     *        <code>OntapVolumeType</code> set to <code>RW</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        setStorageEfficiencyEnabled(storageEfficiencyEnabled);
        return this;
    }

    /**
     * <p>
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume, or
     * set to false to disable them.
     * </p>
     * <p>
     * <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     * <code>OntapVolumeType</code> set to <code>RW</code>).
     * </p>
     * 
     * @return Set to true to enable deduplication, compression, and compaction storage efficiency features on the
     *         volume, or set to false to disable them.</p>
     *         <p>
     *         <code>StorageEfficiencyEnabled</code> is required when creating a <code>RW</code> volume (
     *         <code>OntapVolumeType</code> set to <code>RW</code>).
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
     * <p>
     * Specifies the type of volume you are creating. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     * types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume you are creating. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used
     *        as the destination of a NetApp SnapMirror relationship.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     *        types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * @see InputOntapVolumeType
     */

    public void setOntapVolumeType(String ontapVolumeType) {
        this.ontapVolumeType = ontapVolumeType;
    }

    /**
     * <p>
     * Specifies the type of volume you are creating. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     * types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @return Specifies the type of volume you are creating. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used
     *         as the destination of a NetApp SnapMirror relationship.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     *         types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * @see InputOntapVolumeType
     */

    public String getOntapVolumeType() {
        return this.ontapVolumeType;
    }

    /**
     * <p>
     * Specifies the type of volume you are creating. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     * types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume you are creating. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used
     *        as the destination of a NetApp SnapMirror relationship.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     *        types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputOntapVolumeType
     */

    public CreateOntapVolumeConfiguration withOntapVolumeType(String ontapVolumeType) {
        setOntapVolumeType(ontapVolumeType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of volume you are creating. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used as the
     * destination of a NetApp SnapMirror relationship.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     * types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume you are creating. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. A <code>DP</code> volume is read-only and can be used
     *        as the destination of a NetApp SnapMirror relationship.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-types">Volume
     *        types</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputOntapVolumeType
     */

    public CreateOntapVolumeConfiguration withOntapVolumeType(InputOntapVolumeType ontapVolumeType) {
        this.ontapVolumeType = ontapVolumeType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes past the
     * hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of
     * two weekly snapshots taken every Sunday at 15 minutes after midnight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it only
     * retains one snapshot from the weekly schedule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to prevent
     * automatic snapshots from being taken.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     * policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param snapshotPolicy
     *        Specifies the snapshot policy for the volume. There are three built-in snapshot policies:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes
     *        past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after
     *        midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it
     *        only retains one snapshot from the weekly schedule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to
     *        prevent automatic snapshots from being taken.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     *        policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     */

    public void setSnapshotPolicy(String snapshotPolicy) {
        this.snapshotPolicy = snapshotPolicy;
    }

    /**
     * <p>
     * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes past the
     * hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of
     * two weekly snapshots taken every Sunday at 15 minutes after midnight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it only
     * retains one snapshot from the weekly schedule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to prevent
     * automatic snapshots from being taken.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     * policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @return Specifies the snapshot policy for the volume. There are three built-in snapshot policies:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes
     *         past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after
     *         midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it
     *         only retains one snapshot from the weekly schedule.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to
     *         prevent automatic snapshots from being taken.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     *         policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     */

    public String getSnapshotPolicy() {
        return this.snapshotPolicy;
    }

    /**
     * <p>
     * Specifies the snapshot policy for the volume. There are three built-in snapshot policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes past the
     * hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after midnight. A maximum of
     * two weekly snapshots taken every Sunday at 15 minutes after midnight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it only
     * retains one snapshot from the weekly schedule.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to prevent
     * automatic snapshots from being taken.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     * policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param snapshotPolicy
     *        Specifies the snapshot policy for the volume. There are three built-in snapshot policies:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>default</code>: This is the default policy. A maximum of six hourly snapshots taken five minutes
     *        past the hour. A maximum of two daily snapshots taken Monday through Saturday at 10 minutes after
     *        midnight. A maximum of two weekly snapshots taken every Sunday at 15 minutes after midnight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>default-1weekly</code>: This policy is the same as the <code>default</code> policy except that it
     *        only retains one snapshot from the weekly schedule.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code>: This policy does not take any snapshots. This policy can be assigned to volumes to
     *        prevent automatic snapshots from being taken.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can also provide the name of a custom policy that you created with the ONTAP CLI or REST API.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/snapshots-ontap.html#snapshot-policies">Snapshot
     *        policies</a> in the Amazon FSx for NetApp ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withSnapshotPolicy(String snapshotPolicy) {
        setSnapshotPolicy(snapshotPolicy);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false.
     * If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the
     * user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to
     *        false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups
     *        where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the
     *        specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *        backup, no tags are copied from the volume, regardless of this value.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false.
     * If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the
     * user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the volume, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to
     *         false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated
     *         backups where the user doesn't specify tags. If this value is true, and you specify one or more tags,
     *         only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the volume, regardless of this value.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false.
     * If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the
     * user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to
     *        false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups
     *        where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the
     *        specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *        backup, no tags are copied from the volume, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to false.
     * If it's set to true, all tags for the volume are copied to all automatic and user-initiated backups where the
     * user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are
     * copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from
     * the volume, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the volume should be copied to backups. This value defaults to
     *         false. If it's set to true, all tags for the volume are copied to all automatic and user-initiated
     *         backups where the user doesn't specify tags. If this value is true, and you specify one or more tags,
     *         only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the volume, regardless of this value.
     */

    public Boolean isCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * Specifies the SnapLock configuration for an FSx for ONTAP volume.
     * </p>
     * 
     * @param snaplockConfiguration
     *        Specifies the SnapLock configuration for an FSx for ONTAP volume.
     */

    public void setSnaplockConfiguration(CreateSnaplockConfiguration snaplockConfiguration) {
        this.snaplockConfiguration = snaplockConfiguration;
    }

    /**
     * <p>
     * Specifies the SnapLock configuration for an FSx for ONTAP volume.
     * </p>
     * 
     * @return Specifies the SnapLock configuration for an FSx for ONTAP volume.
     */

    public CreateSnaplockConfiguration getSnaplockConfiguration() {
        return this.snaplockConfiguration;
    }

    /**
     * <p>
     * Specifies the SnapLock configuration for an FSx for ONTAP volume.
     * </p>
     * 
     * @param snaplockConfiguration
     *        Specifies the SnapLock configuration for an FSx for ONTAP volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withSnaplockConfiguration(CreateSnaplockConfiguration snaplockConfiguration) {
        setSnaplockConfiguration(snaplockConfiguration);
        return this;
    }

    /**
     * <p>
     * Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use for
     * different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the Amazon FSx
     * for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param volumeStyle
     *        Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use
     *        for different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the
     *        Amazon FSx for NetApp ONTAP User Guide.
     * @see VolumeStyle
     */

    public void setVolumeStyle(String volumeStyle) {
        this.volumeStyle = volumeStyle;
    }

    /**
     * <p>
     * Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use for
     * different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the Amazon FSx
     * for NetApp ONTAP User Guide.
     * </p>
     * 
     * @return Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use
     *         for different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the
     *         Amazon FSx for NetApp ONTAP User Guide.
     * @see VolumeStyle
     */

    public String getVolumeStyle() {
        return this.volumeStyle;
    }

    /**
     * <p>
     * Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use for
     * different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the Amazon FSx
     * for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param volumeStyle
     *        Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use
     *        for different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the
     *        Amazon FSx for NetApp ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStyle
     */

    public CreateOntapVolumeConfiguration withVolumeStyle(String volumeStyle) {
        setVolumeStyle(volumeStyle);
        return this;
    }

    /**
     * <p>
     * Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use for
     * different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the Amazon FSx
     * for NetApp ONTAP User Guide.
     * </p>
     * 
     * @param volumeStyle
     *        Use to specify the style of an ONTAP volume. FSx for ONTAP offers two styles of volumes that you can use
     *        for different purposes, FlexVol and FlexGroup volumes. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/volume-styles.html">Volume styles</a> in the
     *        Amazon FSx for NetApp ONTAP User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStyle
     */

    public CreateOntapVolumeConfiguration withVolumeStyle(VolumeStyle volumeStyle) {
        this.volumeStyle = volumeStyle.toString();
        return this;
    }

    /**
     * <p>
     * Use to specify configuration options for a volume’s storage aggregate or aggregates.
     * </p>
     * 
     * @param aggregateConfiguration
     *        Use to specify configuration options for a volume’s storage aggregate or aggregates.
     */

    public void setAggregateConfiguration(CreateAggregateConfiguration aggregateConfiguration) {
        this.aggregateConfiguration = aggregateConfiguration;
    }

    /**
     * <p>
     * Use to specify configuration options for a volume’s storage aggregate or aggregates.
     * </p>
     * 
     * @return Use to specify configuration options for a volume’s storage aggregate or aggregates.
     */

    public CreateAggregateConfiguration getAggregateConfiguration() {
        return this.aggregateConfiguration;
    }

    /**
     * <p>
     * Use to specify configuration options for a volume’s storage aggregate or aggregates.
     * </p>
     * 
     * @param aggregateConfiguration
     *        Use to specify configuration options for a volume’s storage aggregate or aggregates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withAggregateConfiguration(CreateAggregateConfiguration aggregateConfiguration) {
        setAggregateConfiguration(aggregateConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the configured size of the volume, in bytes.
     * </p>
     * 
     * @param sizeInBytes
     *        Specifies the configured size of the volume, in bytes.
     */

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * Specifies the configured size of the volume, in bytes.
     * </p>
     * 
     * @return Specifies the configured size of the volume, in bytes.
     */

    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * <p>
     * Specifies the configured size of the volume, in bytes.
     * </p>
     * 
     * @param sizeInBytes
     *        Specifies the configured size of the volume, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOntapVolumeConfiguration withSizeInBytes(Long sizeInBytes) {
        setSizeInBytes(sizeInBytes);
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
            sb.append("TieringPolicy: ").append(getTieringPolicy()).append(",");
        if (getOntapVolumeType() != null)
            sb.append("OntapVolumeType: ").append(getOntapVolumeType()).append(",");
        if (getSnapshotPolicy() != null)
            sb.append("SnapshotPolicy: ").append(getSnapshotPolicy()).append(",");
        if (getCopyTagsToBackups() != null)
            sb.append("CopyTagsToBackups: ").append(getCopyTagsToBackups()).append(",");
        if (getSnaplockConfiguration() != null)
            sb.append("SnaplockConfiguration: ").append(getSnaplockConfiguration()).append(",");
        if (getVolumeStyle() != null)
            sb.append("VolumeStyle: ").append(getVolumeStyle()).append(",");
        if (getAggregateConfiguration() != null)
            sb.append("AggregateConfiguration: ").append(getAggregateConfiguration()).append(",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: ").append(getSizeInBytes());
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
        if (other.getOntapVolumeType() == null ^ this.getOntapVolumeType() == null)
            return false;
        if (other.getOntapVolumeType() != null && other.getOntapVolumeType().equals(this.getOntapVolumeType()) == false)
            return false;
        if (other.getSnapshotPolicy() == null ^ this.getSnapshotPolicy() == null)
            return false;
        if (other.getSnapshotPolicy() != null && other.getSnapshotPolicy().equals(this.getSnapshotPolicy()) == false)
            return false;
        if (other.getCopyTagsToBackups() == null ^ this.getCopyTagsToBackups() == null)
            return false;
        if (other.getCopyTagsToBackups() != null && other.getCopyTagsToBackups().equals(this.getCopyTagsToBackups()) == false)
            return false;
        if (other.getSnaplockConfiguration() == null ^ this.getSnaplockConfiguration() == null)
            return false;
        if (other.getSnaplockConfiguration() != null && other.getSnaplockConfiguration().equals(this.getSnaplockConfiguration()) == false)
            return false;
        if (other.getVolumeStyle() == null ^ this.getVolumeStyle() == null)
            return false;
        if (other.getVolumeStyle() != null && other.getVolumeStyle().equals(this.getVolumeStyle()) == false)
            return false;
        if (other.getAggregateConfiguration() == null ^ this.getAggregateConfiguration() == null)
            return false;
        if (other.getAggregateConfiguration() != null && other.getAggregateConfiguration().equals(this.getAggregateConfiguration()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
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
        hashCode = prime * hashCode + ((getOntapVolumeType() == null) ? 0 : getOntapVolumeType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotPolicy() == null) ? 0 : getSnapshotPolicy().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        hashCode = prime * hashCode + ((getSnaplockConfiguration() == null) ? 0 : getSnaplockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVolumeStyle() == null) ? 0 : getVolumeStyle().hashCode());
        hashCode = prime * hashCode + ((getAggregateConfiguration() == null) ? 0 : getAggregateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
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
