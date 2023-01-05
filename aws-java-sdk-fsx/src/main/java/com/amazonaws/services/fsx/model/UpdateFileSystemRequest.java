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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for the <code>UpdateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system that you are updating.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx for
     * Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in GiB, to
     * increase the storage capacity for the file system that you're updating.
     * </p>
     * <note>
     * <p>
     * You can't make a storage capacity increase request if there is an existing storage capacity increase request in
     * progress.
     * </p>
     * </note>
     * <p>
     * For Windows file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. To increase storage capacity, the file system must have at least 16 MBps of throughput
     * capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     * </p>
     * <p>
     * For Lustre file systems, the storage capacity target value can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types, valid
     * values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps throughput per
     * TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The values must be
     * greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage and
     * throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     * </p>
     * <p>
     * For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage capacity
     * and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     */
    private UpdateFileSystemWindowsConfiguration windowsConfiguration;

    private UpdateFileSystemLustreConfiguration lustreConfiguration;

    private UpdateFileSystemOntapConfiguration ontapConfiguration;
    /**
     * <p>
     * The configuration updates for an Amazon FSx for OpenZFS file system.
     * </p>
     */
    private UpdateFileSystemOpenZFSConfiguration openZFSConfiguration;

    /**
     * <p>
     * The ID of the file system that you are updating.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you are updating.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you are updating.
     * </p>
     * 
     * @return The ID of the file system that you are updating.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you are updating.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *         automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *         Services SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     * automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent updates. This string is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx for
     * Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in GiB, to
     * increase the storage capacity for the file system that you're updating.
     * </p>
     * <note>
     * <p>
     * You can't make a storage capacity increase request if there is an existing storage capacity increase request in
     * progress.
     * </p>
     * </note>
     * <p>
     * For Windows file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. To increase storage capacity, the file system must have at least 16 MBps of throughput
     * capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     * </p>
     * <p>
     * For Lustre file systems, the storage capacity target value can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types, valid
     * values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps throughput per
     * TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The values must be
     * greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage and
     * throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     * </p>
     * <p>
     * For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage capacity
     * and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * 
     * @param storageCapacity
     *        Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx
     *        for Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in
     *        GiB, to increase the storage capacity for the file system that you're updating. </p> <note>
     *        <p>
     *        You can't make a storage capacity increase request if there is an existing storage capacity increase
     *        request in progress.
     *        </p>
     *        </note>
     *        <p>
     *        For Windows file systems, the storage capacity target value must be at least 10 percent greater than the
     *        current storage capacity value. To increase storage capacity, the file system must have at least 16 MBps
     *        of throughput capacity. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     *        capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     *        </p>
     *        <p>
     *        For Lustre file systems, the storage capacity target value can be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types,
     *        valid values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps
     *        throughput per TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The
     *        values must be greater than the current storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage
     *        and throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     *        </p>
     *        <p>
     *        For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the
     *        current storage capacity value. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage
     *        capacity and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx for
     * Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in GiB, to
     * increase the storage capacity for the file system that you're updating.
     * </p>
     * <note>
     * <p>
     * You can't make a storage capacity increase request if there is an existing storage capacity increase request in
     * progress.
     * </p>
     * </note>
     * <p>
     * For Windows file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. To increase storage capacity, the file system must have at least 16 MBps of throughput
     * capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     * </p>
     * <p>
     * For Lustre file systems, the storage capacity target value can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types, valid
     * values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps throughput per
     * TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The values must be
     * greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage and
     * throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     * </p>
     * <p>
     * For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage capacity
     * and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * 
     * @return Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx
     *         for Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in
     *         GiB, to increase the storage capacity for the file system that you're updating. </p> <note>
     *         <p>
     *         You can't make a storage capacity increase request if there is an existing storage capacity increase
     *         request in progress.
     *         </p>
     *         </note>
     *         <p>
     *         For Windows file systems, the storage capacity target value must be at least 10 percent greater than the
     *         current storage capacity value. To increase storage capacity, the file system must have at least 16 MBps
     *         of throughput capacity. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing
     *         storage capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     *         </p>
     *         <p>
     *         For Lustre file systems, the storage capacity target value can be the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment
     *         types, valid values are in multiples of 2400 GiB. The value must be greater than the current storage
     *         capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps
     *         throughput per TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems.
     *         The values must be greater than the current storage capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage
     *         and throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     *         </p>
     *         <p>
     *         For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the
     *         current storage capacity value. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage
     *         capacity and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx for
     * Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in GiB, to
     * increase the storage capacity for the file system that you're updating.
     * </p>
     * <note>
     * <p>
     * You can't make a storage capacity increase request if there is an existing storage capacity increase request in
     * progress.
     * </p>
     * </note>
     * <p>
     * For Windows file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. To increase storage capacity, the file system must have at least 16 MBps of throughput
     * capacity. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     * capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     * </p>
     * <p>
     * For Lustre file systems, the storage capacity target value can be the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types, valid
     * values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps throughput per
     * TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The values must be
     * greater than the current storage capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage and
     * throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     * </p>
     * <p>
     * For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the current
     * storage capacity value. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage capacity
     * and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * </p>
     * 
     * @param storageCapacity
     *        Use this parameter to increase the storage capacity of an Amazon FSx for Windows File Server, Amazon FSx
     *        for Lustre, or Amazon FSx for NetApp ONTAP file system. Specifies the storage capacity target value, in
     *        GiB, to increase the storage capacity for the file system that you're updating. </p> <note>
     *        <p>
     *        You can't make a storage capacity increase request if there is an existing storage capacity increase
     *        request in progress.
     *        </p>
     *        </note>
     *        <p>
     *        For Windows file systems, the storage capacity target value must be at least 10 percent greater than the
     *        current storage capacity value. To increase storage capacity, the file system must have at least 16 MBps
     *        of throughput capacity. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html">Managing storage
     *        capacity</a> in the <i>Amazon FSx for Windows File Server User Guide</i>.
     *        </p>
     *        <p>
     *        For Lustre file systems, the storage capacity target value can be the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2 SSD</code> deployment types,
     *        valid values are in multiples of 2400 GiB. The value must be greater than the current storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT HDD</code> file systems, valid values are multiples of 6000 GiB for 12-MBps
     *        throughput per TiB file systems and multiples of 1800 GiB for 40-MBps throughput per TiB file systems. The
     *        values must be greater than the current storage capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> file systems, you can't increase the storage capacity.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/managing-storage-capacity.html">Managing storage
     *        and throughput capacity</a> in the <i>Amazon FSx for Lustre User Guide</i>.
     *        </p>
     *        <p>
     *        For ONTAP file systems, the storage capacity target value must be at least 10 percent greater than the
     *        current storage capacity value. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-storage-capacity.html">Managing storage
     *        capacity and provisioned IOPS</a> in the <i>Amazon FSx for NetApp ONTAP User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration updates for an Amazon FSx for Windows File Server file system.
     */

    public void setWindowsConfiguration(UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @return The configuration updates for an Amazon FSx for Windows File Server file system.
     */

    public UpdateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration updates for an Amazon FSx for Windows File Server file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withWindowsConfiguration(UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        setWindowsConfiguration(windowsConfiguration);
        return this;
    }

    /**
     * @param lustreConfiguration
     */

    public void setLustreConfiguration(UpdateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * @return
     */

    public UpdateFileSystemLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * @param lustreConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withLustreConfiguration(UpdateFileSystemLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * @param ontapConfiguration
     */

    public void setOntapConfiguration(UpdateFileSystemOntapConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * @return
     */

    public UpdateFileSystemOntapConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * @param ontapConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withOntapConfiguration(UpdateFileSystemOntapConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration updates for an Amazon FSx for OpenZFS file system.
     */

    public void setOpenZFSConfiguration(UpdateFileSystemOpenZFSConfiguration openZFSConfiguration) {
        this.openZFSConfiguration = openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @return The configuration updates for an Amazon FSx for OpenZFS file system.
     */

    public UpdateFileSystemOpenZFSConfiguration getOpenZFSConfiguration() {
        return this.openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration updates for an Amazon FSx for OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withOpenZFSConfiguration(UpdateFileSystemOpenZFSConfiguration openZFSConfiguration) {
        setOpenZFSConfiguration(openZFSConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getOpenZFSConfiguration() != null)
            sb.append("OpenZFSConfiguration: ").append(getOpenZFSConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getOpenZFSConfiguration() == null ^ this.getOpenZFSConfiguration() == null)
            return false;
        if (other.getOpenZFSConfiguration() != null && other.getOpenZFSConfiguration().equals(this.getOpenZFSConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOpenZFSConfiguration() == null) ? 0 : getOpenZFSConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemRequest clone() {
        return (UpdateFileSystemRequest) super.clone();
    }

}
