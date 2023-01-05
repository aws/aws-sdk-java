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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an Amazon FSx for NetApp ONTAP volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OntapVolumeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OntapVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the FlexCache endpoint type of the volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CACHE</code> specifies that the volume is a FlexCache volume.
     * </p>
     * </li>
     * </ul>
     */
    private String flexCacheEndpointType;
    /**
     * <p>
     * Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with the
     * storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     * <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     * <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     * <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     * </p>
     */
    private String junctionPath;
    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     */
    private String securityStyle;
    /**
     * <p>
     * The configured size of the volume, in megabytes (MBs).
     * </p>
     */
    private Integer sizeInMegabytes;
    /**
     * <p>
     * The volume's storage efficiency setting.
     * </p>
     */
    private Boolean storageEfficiencyEnabled;
    /**
     * <p>
     * The ID of the volume's storage virtual machine.
     * </p>
     */
    private String storageVirtualMachineId;
    /**
     * <p>
     * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one
     * volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value is
     * <code>true</code>, then this is the SVM root volume.
     * </p>
     * <p>
     * This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag,
     * when set to <code>false</code>, helps you identify which volumes to delete before you can delete the SVM.
     * </p>
     */
    private Boolean storageVirtualMachineRoot;
    /**
     * <p>
     * The volume's <code>TieringPolicy</code> setting.
     * </p>
     */
    private TieringPolicy tieringPolicy;
    /**
     * <p>
     * The volume's universally unique identifier (UUID).
     * </p>
     */
    private String uUID;
    /**
     * <p>
     * Specifies the type of volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to data-protection
     * mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a
     * FlexVol volume by providing additional read-only access to clients.
     * </p>
     * </li>
     * </ul>
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
     * policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     * Specifies the FlexCache endpoint type of the volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CACHE</code> specifies that the volume is a FlexCache volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flexCacheEndpointType
     *        Specifies the FlexCache endpoint type of the volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is
     *        the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CACHE</code> specifies that the volume is a FlexCache volume.
     *        </p>
     *        </li>
     * @see FlexCacheEndpointType
     */

    public void setFlexCacheEndpointType(String flexCacheEndpointType) {
        this.flexCacheEndpointType = flexCacheEndpointType;
    }

    /**
     * <p>
     * Specifies the FlexCache endpoint type of the volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CACHE</code> specifies that the volume is a FlexCache volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the FlexCache endpoint type of the volume. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is
     *         the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CACHE</code> specifies that the volume is a FlexCache volume.
     *         </p>
     *         </li>
     * @see FlexCacheEndpointType
     */

    public String getFlexCacheEndpointType() {
        return this.flexCacheEndpointType;
    }

    /**
     * <p>
     * Specifies the FlexCache endpoint type of the volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CACHE</code> specifies that the volume is a FlexCache volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flexCacheEndpointType
     *        Specifies the FlexCache endpoint type of the volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is
     *        the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CACHE</code> specifies that the volume is a FlexCache volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlexCacheEndpointType
     */

    public OntapVolumeConfiguration withFlexCacheEndpointType(String flexCacheEndpointType) {
        setFlexCacheEndpointType(flexCacheEndpointType);
        return this;
    }

    /**
     * <p>
     * Specifies the FlexCache endpoint type of the volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CACHE</code> specifies that the volume is a FlexCache volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param flexCacheEndpointType
     *        Specifies the FlexCache endpoint type of the volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> specifies that the volume doesn't have a FlexCache configuration. <code>NONE</code> is
     *        the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORIGIN</code> specifies that the volume is the origin volume for a FlexCache volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CACHE</code> specifies that the volume is a FlexCache volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlexCacheEndpointType
     */

    public OntapVolumeConfiguration withFlexCacheEndpointType(FlexCacheEndpointType flexCacheEndpointType) {
        this.flexCacheEndpointType = flexCacheEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with the
     * storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     * <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     * <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     * <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with
     *        the storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     *        <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     *        <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     *        <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     */

    public void setJunctionPath(String junctionPath) {
        this.junctionPath = junctionPath;
    }

    /**
     * <p>
     * Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with the
     * storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     * <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     * <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     * <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     * </p>
     * 
     * @return Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with
     *         the storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     *         <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     *         <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     *         <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     */

    public String getJunctionPath() {
        return this.junctionPath;
    }

    /**
     * <p>
     * Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with the
     * storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     * <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     * <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     * <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the directory that network-attached storage (NAS) clients use to mount the volume, along with
     *        the storage virtual machine (SVM) Domain Name System (DNS) name or IP address. You can create a
     *        <code>JunctionPath</code> directly below a parent volume junction or on a directory within a volume. A
     *        <code>JunctionPath</code> for a volume named <code>vol3</code> might be <code>/vol1/vol2/vol3</code>, or
     *        <code>/vol1/dir2/vol3</code>, or even <code>/dir1/dir2/vol3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withJunctionPath(String junctionPath) {
        setJunctionPath(junctionPath);
        return this;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @see SecurityStyle
     */

    public void setSecurityStyle(String securityStyle) {
        this.securityStyle = securityStyle;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @return The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or
     *         <code>MIXED</code>.
     * @see SecurityStyle
     */

    public String getSecurityStyle() {
        return this.securityStyle;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public OntapVolumeConfiguration withSecurityStyle(String securityStyle) {
        setSecurityStyle(securityStyle);
        return this;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>, <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public OntapVolumeConfiguration withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle.toString();
        return this;
    }

    /**
     * <p>
     * The configured size of the volume, in megabytes (MBs).
     * </p>
     * 
     * @param sizeInMegabytes
     *        The configured size of the volume, in megabytes (MBs).
     */

    public void setSizeInMegabytes(Integer sizeInMegabytes) {
        this.sizeInMegabytes = sizeInMegabytes;
    }

    /**
     * <p>
     * The configured size of the volume, in megabytes (MBs).
     * </p>
     * 
     * @return The configured size of the volume, in megabytes (MBs).
     */

    public Integer getSizeInMegabytes() {
        return this.sizeInMegabytes;
    }

    /**
     * <p>
     * The configured size of the volume, in megabytes (MBs).
     * </p>
     * 
     * @param sizeInMegabytes
     *        The configured size of the volume, in megabytes (MBs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withSizeInMegabytes(Integer sizeInMegabytes) {
        setSizeInMegabytes(sizeInMegabytes);
        return this;
    }

    /**
     * <p>
     * The volume's storage efficiency setting.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        The volume's storage efficiency setting.
     */

    public void setStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        this.storageEfficiencyEnabled = storageEfficiencyEnabled;
    }

    /**
     * <p>
     * The volume's storage efficiency setting.
     * </p>
     * 
     * @return The volume's storage efficiency setting.
     */

    public Boolean getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * The volume's storage efficiency setting.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        The volume's storage efficiency setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        setStorageEfficiencyEnabled(storageEfficiencyEnabled);
        return this;
    }

    /**
     * <p>
     * The volume's storage efficiency setting.
     * </p>
     * 
     * @return The volume's storage efficiency setting.
     */

    public Boolean isStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * The ID of the volume's storage virtual machine.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the volume's storage virtual machine.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the volume's storage virtual machine.
     * </p>
     * 
     * @return The ID of the volume's storage virtual machine.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * The ID of the volume's storage virtual machine.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The ID of the volume's storage virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
        return this;
    }

    /**
     * <p>
     * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one
     * volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value is
     * <code>true</code>, then this is the SVM root volume.
     * </p>
     * <p>
     * This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag,
     * when set to <code>false</code>, helps you identify which volumes to delete before you can delete the SVM.
     * </p>
     * 
     * @param storageVirtualMachineRoot
     *        A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM).
     *        Only one volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value
     *        is <code>true</code>, then this is the SVM root volume.</p>
     *        <p>
     *        This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This
     *        flag, when set to <code>false</code>, helps you identify which volumes to delete before you can delete the
     *        SVM.
     */

    public void setStorageVirtualMachineRoot(Boolean storageVirtualMachineRoot) {
        this.storageVirtualMachineRoot = storageVirtualMachineRoot;
    }

    /**
     * <p>
     * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one
     * volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value is
     * <code>true</code>, then this is the SVM root volume.
     * </p>
     * <p>
     * This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag,
     * when set to <code>false</code>, helps you identify which volumes to delete before you can delete the SVM.
     * </p>
     * 
     * @return A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM).
     *         Only one volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this
     *         value is <code>true</code>, then this is the SVM root volume.</p>
     *         <p>
     *         This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This
     *         flag, when set to <code>false</code>, helps you identify which volumes to delete before you can delete
     *         the SVM.
     */

    public Boolean getStorageVirtualMachineRoot() {
        return this.storageVirtualMachineRoot;
    }

    /**
     * <p>
     * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one
     * volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value is
     * <code>true</code>, then this is the SVM root volume.
     * </p>
     * <p>
     * This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag,
     * when set to <code>false</code>, helps you identify which volumes to delete before you can delete the SVM.
     * </p>
     * 
     * @param storageVirtualMachineRoot
     *        A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM).
     *        Only one volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value
     *        is <code>true</code>, then this is the SVM root volume.</p>
     *        <p>
     *        This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This
     *        flag, when set to <code>false</code>, helps you identify which volumes to delete before you can delete the
     *        SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withStorageVirtualMachineRoot(Boolean storageVirtualMachineRoot) {
        setStorageVirtualMachineRoot(storageVirtualMachineRoot);
        return this;
    }

    /**
     * <p>
     * A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM). Only one
     * volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this value is
     * <code>true</code>, then this is the SVM root volume.
     * </p>
     * <p>
     * This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This flag,
     * when set to <code>false</code>, helps you identify which volumes to delete before you can delete the SVM.
     * </p>
     * 
     * @return A Boolean flag indicating whether this volume is the root volume for its storage virtual machine (SVM).
     *         Only one volume on an SVM can be the root volume. This value defaults to <code>false</code>. If this
     *         value is <code>true</code>, then this is the SVM root volume.</p>
     *         <p>
     *         This flag is useful when you're deleting an SVM, because you must first delete all non-root volumes. This
     *         flag, when set to <code>false</code>, helps you identify which volumes to delete before you can delete
     *         the SVM.
     */

    public Boolean isStorageVirtualMachineRoot() {
        return this.storageVirtualMachineRoot;
    }

    /**
     * <p>
     * The volume's <code>TieringPolicy</code> setting.
     * </p>
     * 
     * @param tieringPolicy
     *        The volume's <code>TieringPolicy</code> setting.
     */

    public void setTieringPolicy(TieringPolicy tieringPolicy) {
        this.tieringPolicy = tieringPolicy;
    }

    /**
     * <p>
     * The volume's <code>TieringPolicy</code> setting.
     * </p>
     * 
     * @return The volume's <code>TieringPolicy</code> setting.
     */

    public TieringPolicy getTieringPolicy() {
        return this.tieringPolicy;
    }

    /**
     * <p>
     * The volume's <code>TieringPolicy</code> setting.
     * </p>
     * 
     * @param tieringPolicy
     *        The volume's <code>TieringPolicy</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withTieringPolicy(TieringPolicy tieringPolicy) {
        setTieringPolicy(tieringPolicy);
        return this;
    }

    /**
     * <p>
     * The volume's universally unique identifier (UUID).
     * </p>
     * 
     * @param uUID
     *        The volume's universally unique identifier (UUID).
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The volume's universally unique identifier (UUID).
     * </p>
     * 
     * @return The volume's universally unique identifier (UUID).
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The volume's universally unique identifier (UUID).
     * </p>
     * 
     * @param uUID
     *        The volume's universally unique identifier (UUID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * <p>
     * Specifies the type of volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to data-protection
     * mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a
     * FlexVol volume by providing additional read-only access to clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to
     *        data-protection mirror copies. If a disaster occurs, you can use these data-protection mirror copies to
     *        recover data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic
     *        to a FlexVol volume by providing additional read-only access to clients.
     *        </p>
     *        </li>
     * @see OntapVolumeType
     */

    public void setOntapVolumeType(String ontapVolumeType) {
        this.ontapVolumeType = ontapVolumeType;
    }

    /**
     * <p>
     * Specifies the type of volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to data-protection
     * mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a
     * FlexVol volume by providing additional read-only access to clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of volume. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to
     *         data-protection mirror copies. If a disaster occurs, you can use these data-protection mirror copies to
     *         recover data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic
     *         to a FlexVol volume by providing additional read-only access to clients.
     *         </p>
     *         </li>
     * @see OntapVolumeType
     */

    public String getOntapVolumeType() {
        return this.ontapVolumeType;
    }

    /**
     * <p>
     * Specifies the type of volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to data-protection
     * mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a
     * FlexVol volume by providing additional read-only access to clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to
     *        data-protection mirror copies. If a disaster occurs, you can use these data-protection mirror copies to
     *        recover data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic
     *        to a FlexVol volume by providing additional read-only access to clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapVolumeType
     */

    public OntapVolumeConfiguration withOntapVolumeType(String ontapVolumeType) {
        setOntapVolumeType(ontapVolumeType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of volume. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to data-protection
     * mirror copies. If a disaster occurs, you can use these data-protection mirror copies to recover data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic to a
     * FlexVol volume by providing additional read-only access to clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param ontapVolumeType
     *        Specifies the type of volume. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RW</code> specifies a read/write volume. <code>RW</code> is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DP</code> specifies a data-protection volume. You can protect data by replicating it to
     *        data-protection mirror copies. If a disaster occurs, you can use these data-protection mirror copies to
     *        recover data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LS</code> specifies a load-sharing mirror volume. A load-sharing mirror reduces the network traffic
     *        to a FlexVol volume by providing additional read-only access to clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapVolumeType
     */

    public OntapVolumeConfiguration withOntapVolumeType(OntapVolumeType ontapVolumeType) {
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
     * policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     *        policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     * policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     *         policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     * policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
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
     *        policies</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapVolumeConfiguration withSnapshotPolicy(String snapshotPolicy) {
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

    public OntapVolumeConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
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
        if (getFlexCacheEndpointType() != null)
            sb.append("FlexCacheEndpointType: ").append(getFlexCacheEndpointType()).append(",");
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
        if (getStorageVirtualMachineRoot() != null)
            sb.append("StorageVirtualMachineRoot: ").append(getStorageVirtualMachineRoot()).append(",");
        if (getTieringPolicy() != null)
            sb.append("TieringPolicy: ").append(getTieringPolicy()).append(",");
        if (getUUID() != null)
            sb.append("UUID: ").append(getUUID()).append(",");
        if (getOntapVolumeType() != null)
            sb.append("OntapVolumeType: ").append(getOntapVolumeType()).append(",");
        if (getSnapshotPolicy() != null)
            sb.append("SnapshotPolicy: ").append(getSnapshotPolicy()).append(",");
        if (getCopyTagsToBackups() != null)
            sb.append("CopyTagsToBackups: ").append(getCopyTagsToBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OntapVolumeConfiguration == false)
            return false;
        OntapVolumeConfiguration other = (OntapVolumeConfiguration) obj;
        if (other.getFlexCacheEndpointType() == null ^ this.getFlexCacheEndpointType() == null)
            return false;
        if (other.getFlexCacheEndpointType() != null && other.getFlexCacheEndpointType().equals(this.getFlexCacheEndpointType()) == false)
            return false;
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
        if (other.getStorageVirtualMachineRoot() == null ^ this.getStorageVirtualMachineRoot() == null)
            return false;
        if (other.getStorageVirtualMachineRoot() != null && other.getStorageVirtualMachineRoot().equals(this.getStorageVirtualMachineRoot()) == false)
            return false;
        if (other.getTieringPolicy() == null ^ this.getTieringPolicy() == null)
            return false;
        if (other.getTieringPolicy() != null && other.getTieringPolicy().equals(this.getTieringPolicy()) == false)
            return false;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlexCacheEndpointType() == null) ? 0 : getFlexCacheEndpointType().hashCode());
        hashCode = prime * hashCode + ((getJunctionPath() == null) ? 0 : getJunctionPath().hashCode());
        hashCode = prime * hashCode + ((getSecurityStyle() == null) ? 0 : getSecurityStyle().hashCode());
        hashCode = prime * hashCode + ((getSizeInMegabytes() == null) ? 0 : getSizeInMegabytes().hashCode());
        hashCode = prime * hashCode + ((getStorageEfficiencyEnabled() == null) ? 0 : getStorageEfficiencyEnabled().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineRoot() == null) ? 0 : getStorageVirtualMachineRoot().hashCode());
        hashCode = prime * hashCode + ((getTieringPolicy() == null) ? 0 : getTieringPolicy().hashCode());
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getOntapVolumeType() == null) ? 0 : getOntapVolumeType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotPolicy() == null) ? 0 : getSnapshotPolicy().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public OntapVolumeConfiguration clone() {
        try {
            return (OntapVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OntapVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
