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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for this Microsoft Windows file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/WindowsFileSystemConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowsFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
     * </p>
     */
    private String activeDirectoryId;

    private SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration;
    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     */
    private String deploymentType;
    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on the file
     * system using Amazon FSx Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     * </p>
     */
    private String remoteAdministrationEndpoint;
    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file server
     * is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx serves
     * traffic from this subnet except in the event of a failover to the secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     * </p>
     */
    private String preferredSubnetId;
    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined
     * to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>
     * deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For
     * Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For
     * more information and instruction on mapping and mounting file shares, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     * </p>
     */
    private String preferredFileServerIp;
    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second.
     * </p>
     */
    private Integer throughputCapacity;
    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     */
    private java.util.List<String> maintenanceOperationsInProgress;
    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     */
    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     */
    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain
     * automatic backups for a maximum of 35 days.
     * </p>
     */
    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or
     * more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID for an existing Microsoft Active Directory instance that the file system should join when it's
     *        created.
     */

    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
     * </p>
     * 
     * @return The ID for an existing Microsoft Active Directory instance that the file system should join when it's
     *         created.
     */

    public String getActiveDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID for an existing Microsoft Active Directory instance that the file system should join when it's
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withActiveDirectoryId(String activeDirectoryId) {
        setActiveDirectoryId(activeDirectoryId);
        return this;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     */

    public void setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @return
     */

    public SelfManagedActiveDirectoryAttributes getSelfManagedActiveDirectoryConfiguration() {
        return this.selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryConfiguration) {
        setSelfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ
     *        redundancy to tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     * @see WindowsDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the file system deployment type, valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ
     *         redundancy to tolerate temporary Availability Zone (AZ) unavailability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     *         </p>
     *         </li>
     * @see WindowsDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ
     *        redundancy to tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsDeploymentType
     */

    public WindowsFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - Specifies a high availability file system that is configured for Multi-AZ
     *        redundancy to tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - (Default) Specifies a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsDeploymentType
     */

    public WindowsFileSystemConfiguration withDeploymentType(WindowsDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on the file
     * system using Amazon FSx Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     * </p>
     * 
     * @param remoteAdministrationEndpoint
     *        For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on
     *        the file system using Amazon FSx Remote PowerShell.</p>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     *        </p>
     *        <p>
     *        This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     */

    public void setRemoteAdministrationEndpoint(String remoteAdministrationEndpoint) {
        this.remoteAdministrationEndpoint = remoteAdministrationEndpoint;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on the file
     * system using Amazon FSx Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     * </p>
     * 
     * @return For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on
     *         the file system using Amazon FSx Remote PowerShell.</p>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     *         </p>
     *         <p>
     *         This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     */

    public String getRemoteAdministrationEndpoint() {
        return this.remoteAdministrationEndpoint;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on the file
     * system using Amazon FSx Remote PowerShell.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     * </p>
     * <p>
     * This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     * </p>
     * 
     * @param remoteAdministrationEndpoint
     *        For <code>MULTI_AZ_1</code> deployment types, use this endpoint when performing administrative tasks on
     *        the file system using Amazon FSx Remote PowerShell.</p>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> deployment types, this is the DNS name of the file system.
     *        </p>
     *        <p>
     *        This endpoint is temporarily unavailable when the file system is undergoing maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withRemoteAdministrationEndpoint(String remoteAdministrationEndpoint) {
        setRemoteAdministrationEndpoint(remoteAdministrationEndpoint);
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file server
     * is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx serves
     * traffic from this subnet except in the event of a failover to the secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     * </p>
     * 
     * @param preferredSubnetId
     *        For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file
     *        server is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon
     *        FSx serves traffic from this subnet except in the event of a failover to the secondary file server.</p>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     */

    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file server
     * is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx serves
     * traffic from this subnet except in the event of a failover to the secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     * </p>
     * 
     * @return For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file
     *         server is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon
     *         FSx serves traffic from this subnet except in the event of a failover to the secondary file server.</p>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     */

    public String getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file server
     * is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon FSx serves
     * traffic from this subnet except in the event of a failover to the secondary file server.
     * </p>
     * <p>
     * For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     * </p>
     * 
     * @param preferredSubnetId
     *        For <code>MULTI_AZ_1</code> deployment types, it specifies the ID of the subnet where the preferred file
     *        server is located. Must be one of the two subnet IDs specified in <code>SubnetIds</code> property. Amazon
     *        FSx serves traffic from this subnet except in the event of a failover to the secondary file server.</p>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> deployment types, this value is the same as that for <code>SubnetIDs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withPreferredSubnetId(String preferredSubnetId) {
        setPreferredSubnetId(preferredSubnetId);
        return this;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined
     * to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>
     * deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For
     * Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For
     * more information and instruction on mapping and mounting file shares, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     * </p>
     * 
     * @param preferredFileServerIp
     *        For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file
     *        server.</p>
     *        <p>
     *        Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not
     *        joined to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and
     *        <code>MULTI_AZ_1</code> deployment types. This IP address is temporarily unavailable when the file system
     *        is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use
     *        the file system's DNSName instead. For more information and instruction on mapping and mounting file
     *        shares, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html">https:
     *        //docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     */

    public void setPreferredFileServerIp(String preferredFileServerIp) {
        this.preferredFileServerIp = preferredFileServerIp;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined
     * to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>
     * deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For
     * Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For
     * more information and instruction on mapping and mounting file shares, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     * </p>
     * 
     * @return For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file
     *         server.</p>
     *         <p>
     *         Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are
     *         not joined to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and
     *         <code>MULTI_AZ_1</code> deployment types. This IP address is temporarily unavailable when the file system
     *         is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use
     *         the file system's DNSName instead. For more information and instruction on mapping and mounting file
     *         shares, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html">https
     *         ://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     */

    public String getPreferredFileServerIp() {
        return this.preferredFileServerIp;
    }

    /**
     * <p>
     * For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file server.
     * </p>
     * <p>
     * Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not joined
     * to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>
     * deployment types. This IP address is temporarily unavailable when the file system is undergoing maintenance. For
     * Linux and Windows SMB clients that are joined to an Active Directory, use the file system's DNSName instead. For
     * more information and instruction on mapping and mounting file shares, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html"
     * >https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     * </p>
     * 
     * @param preferredFileServerIp
     *        For <code>MULTI_AZ_1</code> deployment types, the IP address of the primary, or preferred, file
     *        server.</p>
     *        <p>
     *        Use this IP address when mounting the file system on Linux SMB clients or Windows SMB clients that are not
     *        joined to a Microsoft Active Directory. Applicable for both <code>SINGLE_AZ_1</code> and
     *        <code>MULTI_AZ_1</code> deployment types. This IP address is temporarily unavailable when the file system
     *        is undergoing maintenance. For Linux and Windows SMB clients that are joined to an Active Directory, use
     *        the file system's DNSName instead. For more information and instruction on mapping and mounting file
     *        shares, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html">https:
     *        //docs.aws.amazon.com/fsx/latest/WindowsGuide/accessing-file-shares.html</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withPreferredFileServerIp(String preferredFileServerIp) {
        setPreferredFileServerIp(preferredFileServerIp);
        return this;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second.
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second.
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second.
     * </p>
     * 
     * @return The throughput of an Amazon FSx file system, measured in megabytes per second.
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second.
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * 
     * @return The list of maintenance operations in progress for this file system.
     * @see FileSystemMaintenanceOperation
     */

    public java.util.List<String> getMaintenanceOperationsInProgress() {
        return maintenanceOperationsInProgress;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * 
     * @param maintenanceOperationsInProgress
     *        The list of maintenance operations in progress for this file system.
     * @see FileSystemMaintenanceOperation
     */

    public void setMaintenanceOperationsInProgress(java.util.Collection<String> maintenanceOperationsInProgress) {
        if (maintenanceOperationsInProgress == null) {
            this.maintenanceOperationsInProgress = null;
            return;
        }

        this.maintenanceOperationsInProgress = new java.util.ArrayList<String>(maintenanceOperationsInProgress);
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceOperationsInProgress(java.util.Collection)} or
     * {@link #withMaintenanceOperationsInProgress(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param maintenanceOperationsInProgress
     *        The list of maintenance operations in progress for this file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemMaintenanceOperation
     */

    public WindowsFileSystemConfiguration withMaintenanceOperationsInProgress(String... maintenanceOperationsInProgress) {
        if (this.maintenanceOperationsInProgress == null) {
            setMaintenanceOperationsInProgress(new java.util.ArrayList<String>(maintenanceOperationsInProgress.length));
        }
        for (String ele : maintenanceOperationsInProgress) {
            this.maintenanceOperationsInProgress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * 
     * @param maintenanceOperationsInProgress
     *        The list of maintenance operations in progress for this file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemMaintenanceOperation
     */

    public WindowsFileSystemConfiguration withMaintenanceOperationsInProgress(java.util.Collection<String> maintenanceOperationsInProgress) {
        setMaintenanceOperationsInProgress(maintenanceOperationsInProgress);
        return this;
    }

    /**
     * <p>
     * The list of maintenance operations in progress for this file system.
     * </p>
     * 
     * @param maintenanceOperationsInProgress
     *        The list of maintenance operations in progress for this file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemMaintenanceOperation
     */

    public WindowsFileSystemConfiguration withMaintenanceOperationsInProgress(FileSystemMaintenanceOperation... maintenanceOperationsInProgress) {
        java.util.ArrayList<String> maintenanceOperationsInProgressCopy = new java.util.ArrayList<String>(maintenanceOperationsInProgress.length);
        for (FileSystemMaintenanceOperation value : maintenanceOperationsInProgress) {
            maintenanceOperationsInProgressCopy.add(value.toString());
        }
        if (getMaintenanceOperationsInProgress() == null) {
            setMaintenanceOperationsInProgress(maintenanceOperationsInProgressCopy);
        } else {
            getMaintenanceOperationsInProgress().addAll(maintenanceOperationsInProgressCopy);
        }
        return this;
    }

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred time to perform weekly maintenance, in the UTC time zone.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @return The preferred time to perform weekly maintenance, in the UTC time zone.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred time to perform weekly maintenance, in the UTC time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to take daily automatic backups, in the UTC time zone.
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     * 
     * @return The preferred time to take daily automatic backups, in the UTC time zone.
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, in the UTC time zone.
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to take daily automatic backups, in the UTC time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain
     * automatic backups for a maximum of 35 days.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can
     *        retain automatic backups for a maximum of 35 days.
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain
     * automatic backups for a maximum of 35 days.
     * </p>
     * 
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can
     *         retain automatic backups for a maximum of 35 days.
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain
     * automatic backups for a maximum of 35 days.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can
     *        retain automatic backups for a maximum of 35 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or
     * more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults
     *        to false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     *        user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one
     *        or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating
     *        a user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or
     * more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system should be copied to backups. This value
     *         defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups
     *         and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you
     *         specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags
     *         when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or
     * more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults
     *        to false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     *        user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one
     *        or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating
     *        a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowsFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags on the file system are copied to all automatic backups and any
     * user-initiated backups where the user doesn't specify any tags. If this value is true, and you specify one or
     * more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     * user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system should be copied to backups. This value
     *         defaults to false. If it's set to true, all tags on the file system are copied to all automatic backups
     *         and any user-initiated backups where the user doesn't specify any tags. If this value is true, and you
     *         specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags
     *         when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
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
        if (getActiveDirectoryId() != null)
            sb.append("ActiveDirectoryId: ").append(getActiveDirectoryId()).append(",");
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: ").append(getSelfManagedActiveDirectoryConfiguration()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getRemoteAdministrationEndpoint() != null)
            sb.append("RemoteAdministrationEndpoint: ").append(getRemoteAdministrationEndpoint()).append(",");
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: ").append(getPreferredSubnetId()).append(",");
        if (getPreferredFileServerIp() != null)
            sb.append("PreferredFileServerIp: ").append(getPreferredFileServerIp()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getMaintenanceOperationsInProgress() != null)
            sb.append("MaintenanceOperationsInProgress: ").append(getMaintenanceOperationsInProgress()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
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

        if (obj instanceof WindowsFileSystemConfiguration == false)
            return false;
        WindowsFileSystemConfiguration other = (WindowsFileSystemConfiguration) obj;
        if (other.getActiveDirectoryId() == null ^ this.getActiveDirectoryId() == null)
            return false;
        if (other.getActiveDirectoryId() != null && other.getActiveDirectoryId().equals(this.getActiveDirectoryId()) == false)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() == null ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(this.getSelfManagedActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getRemoteAdministrationEndpoint() == null ^ this.getRemoteAdministrationEndpoint() == null)
            return false;
        if (other.getRemoteAdministrationEndpoint() != null && other.getRemoteAdministrationEndpoint().equals(this.getRemoteAdministrationEndpoint()) == false)
            return false;
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getPreferredFileServerIp() == null ^ this.getPreferredFileServerIp() == null)
            return false;
        if (other.getPreferredFileServerIp() != null && other.getPreferredFileServerIp().equals(this.getPreferredFileServerIp()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getMaintenanceOperationsInProgress() == null ^ this.getMaintenanceOperationsInProgress() == null)
            return false;
        if (other.getMaintenanceOperationsInProgress() != null
                && other.getMaintenanceOperationsInProgress().equals(this.getMaintenanceOperationsInProgress()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
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

        hashCode = prime * hashCode + ((getActiveDirectoryId() == null) ? 0 : getActiveDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0 : getSelfManagedActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getRemoteAdministrationEndpoint() == null) ? 0 : getRemoteAdministrationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPreferredFileServerIp() == null) ? 0 : getPreferredFileServerIp().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceOperationsInProgress() == null) ? 0 : getMaintenanceOperationsInProgress().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public WindowsFileSystemConfiguration clone() {
        try {
            return (WindowsFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.WindowsFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
