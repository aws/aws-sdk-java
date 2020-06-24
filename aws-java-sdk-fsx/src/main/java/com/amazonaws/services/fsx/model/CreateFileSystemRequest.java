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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object used to create a new Amazon FSx file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     * increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre file
     * systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in the
     * console as the file system name.
     * </p>
     */
    private java.util.List<Tag> tags;

    private String kmsKeyId;
    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     */
    private CreateFileSystemWindowsConfiguration windowsConfiguration;

    private CreateFileSystemLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *        automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *         automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     *        automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * @see FileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * </p>
     * 
     * @return The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * @see FileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public CreateFileSystemRequest withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system to create, either <code>WINDOWS</code> or <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public CreateFileSystemRequest withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     * increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageCapacity
     *        Sets the storage capacity of the file system that you're creating.</p>
     *        <p>
     *        For Lustre file systems:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     *        increments of 2.4 TiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Windows file systems:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     * increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets the storage capacity of the file system that you're creating.</p>
     *         <p>
     *         For Lustre file systems:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     *         increments of 2.4 TiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For Windows file systems:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     *         </p>
     *         </li>
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * Sets the storage capacity of the file system that you're creating.
     * </p>
     * <p>
     * For Lustre file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     * increments of 2.4 TiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Windows file systems:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageCapacity
     *        Sets the storage capacity of the file system that you're creating.</p>
     *        <p>
     *        For Lustre file systems:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, valid values are 1.2, 2.4, and
     *        increments of 2.4 TiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SCRATCH_1</code> deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For Windows file systems:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>StorageType=SSD</code>, valid values are 32 GiB - 65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>StorageType=HDD</code>, valid values are 2000 GiB - 65,536 GiB (64 TiB).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment
     *        types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * </p>
     * 
     * @return Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     *         <code>SSD</code> and <code>HDD</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment
     *         types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *         <code>MULTI_AZ_1</code> Windows file system deployment types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value is <code>SSD</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *         Storage Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment
     *        types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options"> Storage
     * Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * </p>
     * 
     * @param storageType
     *        Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. SSD is supported on all Windows deployment
     *        types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. HDD is supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/optimize-fsx-costs.html#storage-type-options">
     *        Storage Type Options</a> in the <i>Amazon FSx for Windows User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre file
     * systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @return Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *         <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *         preferred file server and one for the standby file server. You specify one of these subnets as the
     *         preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *         <p>
     *         For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre
     *         file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability
     *         Zone.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre file
     * systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *        <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *        preferred file server and one for the standby file server. You specify one of these subnets as the
     *        preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre
     *        file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability
     *        Zone.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre file
     * systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *        <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *        preferred file server and one for the standby file server. You specify one of these subnets as the
     *        preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre
     *        file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability
     *        Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre file
     * systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *        <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *        preferred file server and one for the standby file server. You specify one of these subnets as the
     *        preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> file system deployment types and Lustre
     *        file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability
     *        Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @return A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *         access. This list isn't returned in later requests to describe the file system.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for file system access.
     * This list isn't returned in later requests to describe the file system.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for file system
     *        access. This list isn't returned in later requests to describe the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in the
     * console as the file system name.
     * </p>
     * 
     * @return The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in
     *         the console as the file system name.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in the
     * console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in
     *        the console as the file system name.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in the
     * console as the file system name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in
     *        the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in the
     * console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the file system being created. The key value of the <code>Name</code> tag appears in
     *        the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @param kmsKeyId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     * 
     * @param windowsConfiguration
     *        The Microsoft Windows configuration for the file system being created.
     */

    public void setWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     * 
     * @return The Microsoft Windows configuration for the file system being created.
     */

    public CreateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The Microsoft Windows configuration for the file system being created.
     * </p>
     * 
     * @param windowsConfiguration
     *        The Microsoft Windows configuration for the file system being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        setWindowsConfiguration(windowsConfiguration);
        return this;
    }

    /**
     * @param lustreConfiguration
     */

    public void setLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * @return
     */

    public CreateFileSystemLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * @param lustreConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemRequest clone() {
        return (CreateFileSystemRequest) super.clone();
    }

}
