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
 * The request object for the <code>CreateFileSystemFromBackup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemFromBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String backupId;
    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is
     * automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     * <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the preferred file
     * server and one for the standby file server. You specify one of these subnets as the preferred subnet using the
     * <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.
     * </p>
     * <p>
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file systems,
     * provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system
     * access. These security groups apply to all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The key value of the <code>Name</code> tag
     * appears in the console as the file system name.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     */
    private CreateFileSystemWindowsConfiguration windowsConfiguration;

    private CreateFileSystemLustreConfiguration lustreConfiguration;
    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage
     * capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a
     * backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at
     * least 2000 GiB.
     * </p>
     * </note>
     */
    private String storageType;

    /**
     * @param backupId
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * @return
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @param backupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
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

    public CreateFileSystemFromBackupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file systems,
     * provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @return Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *         <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *         preferred file server and one for the standby file server. You specify one of these subnets as the
     *         preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *         <p>
     *         For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *         systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file systems,
     * provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *        <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *        preferred file server and one for the standby file server. You specify one of these subnets as the
     *        preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *        systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file systems,
     * provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
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
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *        systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withSubnetIds(String... subnetIds) {
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
     * For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file systems,
     * provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system will be accessible from. For Windows
     *        <code>MULTI_AZ_1</code> file system deployment types, provide exactly two subnet IDs, one for the
     *        preferred file server and one for the standby file server. You specify one of these subnets as the
     *        preferred subnet using the <code>WindowsConfiguration &gt; PreferredSubnetID</code> property.</p>
     *        <p>
     *        For Windows <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code> deployment types and Lustre file
     *        systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system
     * access. These security groups apply to all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * 
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file
     *         system access. These security groups apply to all network interfaces. This value isn't returned in later
     *         DescribeFileSystem requests.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system
     * access. These security groups apply to all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs for the security groups that apply to the specified network interfaces created for file
     *        system access. These security groups apply to all network interfaces. This value isn't returned in later
     *        DescribeFileSystem requests.
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
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system
     * access. These security groups apply to all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs for the security groups that apply to the specified network interfaces created for file
     *        system access. These security groups apply to all network interfaces. This value isn't returned in later
     *        DescribeFileSystem requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system
     * access. These security groups apply to all network interfaces. This value isn't returned in later
     * DescribeFileSystem requests.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs for the security groups that apply to the specified network interfaces created for file
     *        system access. These security groups apply to all network interfaces. This value isn't returned in later
     *        DescribeFileSystem requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The key value of the <code>Name</code> tag
     * appears in the console as the file system name.
     * </p>
     * 
     * @return The tags to be applied to the file system at file system creation. The key value of the <code>Name</code>
     *         tag appears in the console as the file system name.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be applied to the file system at file system creation. The key value of the <code>Name</code> tag
     * appears in the console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to be applied to the file system at file system creation. The key value of the <code>Name</code>
     *        tag appears in the console as the file system name.
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
     * The tags to be applied to the file system at file system creation. The key value of the <code>Name</code> tag
     * appears in the console as the file system name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be applied to the file system at file system creation. The key value of the <code>Name</code>
     *        tag appears in the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withTags(Tag... tags) {
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
     * The tags to be applied to the file system at file system creation. The key value of the <code>Name</code> tag
     * appears in the console as the file system name.
     * </p>
     * 
     * @param tags
     *        The tags to be applied to the file system at file system creation. The key value of the <code>Name</code>
     *        tag appears in the console as the file system name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Microsoft Windows file system.
     */

    public void setWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @return The configuration for this Microsoft Windows file system.
     */

    public CreateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Microsoft Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemFromBackupRequest withWindowsConfiguration(CreateFileSystemWindowsConfiguration windowsConfiguration) {
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

    public CreateFileSystemFromBackupRequest withLustreConfiguration(CreateFileSystemLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage
     * capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a
     * backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at
     * least 2000 GiB.
     * </p>
     * </note>
     * 
     * @param storageType
     *        Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>.
     *        </p>
     *        <note>
     *        <p>
     *        HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's
     *        storage capacity is tied to the file system that was backed up. You can create a file system that uses HDD
     *        storage from a backup of a file system that used SSD storage only if the original SSD file system had a
     *        storage capacity of at least 2000 GiB.
     *        </p>
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage
     * capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a
     * backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at
     * least 2000 GiB.
     * </p>
     * </note>
     * 
     * @return Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     *         <code>SSD</code> and <code>HDD</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     *         <code>MULTI_AZ_1</code> Windows file system deployment types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default value is <code>SSD</code>.
     *         </p>
     *         <note>
     *         <p>
     *         HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's
     *         storage capacity is tied to the file system that was backed up. You can create a file system that uses
     *         HDD storage from a backup of a file system that used SSD storage only if the original SSD file system had
     *         a storage capacity of at least 2000 GiB.
     *         </p>
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage
     * capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a
     * backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at
     * least 2000 GiB.
     * </p>
     * </note>
     * 
     * @param storageType
     *        Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>.
     *        </p>
     *        <note>
     *        <p>
     *        HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's
     *        storage capacity is tied to the file system that was backed up. You can create a file system that uses HDD
     *        storage from a backup of a file system that used SSD storage only if the original SSD file system had a
     *        storage capacity of at least 2000 GiB.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemFromBackupRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     * <code>SSD</code> and <code>HDD</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     * <code>MULTI_AZ_1</code> Windows file system deployment types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default value is <code>SSD</code>.
     * </p>
     * <note>
     * <p>
     * HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's storage
     * capacity is tied to the file system that was backed up. You can create a file system that uses HDD storage from a
     * backup of a file system that used SSD storage only if the original SSD file system had a storage capacity of at
     * least 2000 GiB.
     * </p>
     * </note>
     * 
     * @param storageType
     *        Sets the storage type for the Windows file system you're creating from a backup. Valid values are
     *        <code>SSD</code> and <code>HDD</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Set to <code>SSD</code> to use solid state drive storage. Supported on all Windows deployment types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Set to <code>HDD</code> to use hard disk drive storage. Supported on <code>SINGLE_AZ_2</code> and
     *        <code>MULTI_AZ_1</code> Windows file system deployment types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default value is <code>SSD</code>.
     *        </p>
     *        <note>
     *        <p>
     *        HDD and SSD storage types have different minimum storage capacity requirements. A restored file system's
     *        storage capacity is tied to the file system that was backed up. You can create a file system that uses HDD
     *        storage from a backup of a file system that used SSD storage only if the original SSD file system had a
     *        storage capacity of at least 2000 GiB.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public CreateFileSystemFromBackupRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemFromBackupRequest == false)
            return false;
        CreateFileSystemFromBackupRequest other = (CreateFileSystemFromBackupRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemFromBackupRequest clone() {
        return (CreateFileSystemFromBackupRequest) super.clone();
    }

}
