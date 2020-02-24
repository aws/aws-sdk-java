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
 * The configuration object for the Microsoft Windows file system used in <code>CreateFileSystem</code> and
 * <code>CreateFileSystemFromBackup</code> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemWindowsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemWindowsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when
     * it's created.
     * </p>
     */
    private String activeDirectoryId;

    private SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;
    /**
     * <p>
     * Specifies the file system deployment type, valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate
     * temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that
     * have a minimum of three Availability Zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about high availability Multi-AZ file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High Availability for
     * Amazon FSx for Windows File Server</a>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your
     * clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs
     * and minimize latency.
     * </p>
     */
    private String preferredSubnetId;
    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th increments,
     * between 2^3 (8) and 2^11 (2048).
     * </p>
     */
    private Integer throughputCapacity;
    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     * </p>
     */
    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     * </p>
     */
    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value
     * to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     */
    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups
     * where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified
     * tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when
     * it's created.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should
     *        join when it's created.
     */

    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when
     * it's created.
     * </p>
     * 
     * @return The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should
     *         join when it's created.
     */

    public String getActiveDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * <p>
     * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when
     * it's created.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should
     *        join when it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withActiveDirectoryId(String activeDirectoryId) {
        setActiveDirectoryId(activeDirectoryId);
        return this;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     */

    public void setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @return
     */

    public SelfManagedActiveDirectoryConfiguration getSelfManagedActiveDirectoryConfiguration() {
        return this.selfManagedActiveDirectoryConfiguration;
    }

    /**
     * @param selfManagedActiveDirectoryConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
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
     * MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate
     * temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that
     * have a minimum of three Availability Zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about high availability Multi-AZ file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High Availability for
     * Amazon FSx for Windows File Server</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     *        AWS Regions that have a minimum of three Availability Zones.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn more about high availability Multi-AZ file systems, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High
     *        Availability for Amazon FSx for Windows File Server</a>.
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
     * MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate
     * temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that
     * have a minimum of three Availability Zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about high availability Multi-AZ file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High Availability for
     * Amazon FSx for Windows File Server</a>.
     * </p>
     * 
     * @return Specifies the file system deployment type, valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to
     *         tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     *         AWS Regions that have a minimum of three Availability Zones.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn more about high availability Multi-AZ file systems, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High
     *         Availability for Amazon FSx for Windows File Server</a>.
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
     * MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate
     * temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that
     * have a minimum of three Availability Zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about high availability Multi-AZ file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High Availability for
     * Amazon FSx for Windows File Server</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     *        AWS Regions that have a minimum of three Availability Zones.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn more about high availability Multi-AZ file systems, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High
     *        Availability for Amazon FSx for Windows File Server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsDeploymentType
     */

    public CreateFileSystemWindowsConfiguration withDeploymentType(String deploymentType) {
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
     * MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate
     * temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that
     * have a minimum of three Availability Zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn more about high availability Multi-AZ file systems, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High Availability for
     * Amazon FSx for Windows File Server</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type, valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in
     *        AWS Regions that have a minimum of three Availability Zones.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn more about high availability Multi-AZ file systems, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/high-availability-multiAZ.html"> High
     *        Availability for Amazon FSx for Windows File Server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WindowsDeploymentType
     */

    public CreateFileSystemWindowsConfiguration withDeploymentType(WindowsDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your
     * clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs
     * and minimize latency.
     * </p>
     * 
     * @param preferredSubnetId
     *        Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *        which you want the preferred file server to be located. For in-AWS applications, we recommend that you
     *        launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ
     *        data transfer costs and minimize latency.
     */

    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your
     * clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs
     * and minimize latency.
     * </p>
     * 
     * @return Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *         which you want the preferred file server to be located. For in-AWS applications, we recommend that you
     *         launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ
     *         data transfer costs and minimize latency.
     */

    public String getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your
     * clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs
     * and minimize latency.
     * </p>
     * 
     * @param preferredSubnetId
     *        Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *        which you want the preferred file server to be located. For in-AWS applications, we recommend that you
     *        launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ
     *        data transfer costs and minimize latency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withPreferredSubnetId(String preferredSubnetId) {
        setPreferredSubnetId(preferredSubnetId);
        return this;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th increments,
     * between 2^3 (8) and 2^11 (2048).
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th
     *        increments, between 2^3 (8) and 2^11 (2048).
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th increments,
     * between 2^3 (8) and 2^11 (2048).
     * </p>
     * 
     * @return The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th
     *         increments, between 2^3 (8) and 2^11 (2048).
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th increments,
     * between 2^3 (8) and 2^11 (2048).
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the <i>n</i>th
     *        increments, between 2^3 (8) and 2^11 (2048).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     * </p>
     * 
     * @return The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     * </p>
     * 
     * @return The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value
     * to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this
     *        value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35
     *        days.
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value
     * to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * 
     * @return The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this
     *         value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35
     *         days.
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value
     * to 0 disables the creation of automatic backups. The maximum retention period for backups is 35 days.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this
     *        value to 0 disables the creation of automatic backups. The maximum retention period for backups is 35
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups
     * where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified
     * tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags for the file system should be copied to backups. This value
     *        defaults to false. If it's set to true, all tags for the file system are copied to all automatic and
     *        user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or
     *        more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups
     * where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified
     * tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. This value
     *         defaults to false. If it's set to true, all tags for the file system are copied to all automatic and
     *         user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or
     *         more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups
     * where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified
     * tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags for the file system should be copied to backups. This value
     *        defaults to false. If it's set to true, all tags for the file system are copied to all automatic and
     *        user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or
     *        more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemWindowsConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to
     * false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups
     * where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified
     * tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the file system should be copied to backups. This value
     *         defaults to false. If it's set to true, all tags for the file system are copied to all automatic and
     *         user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or
     *         more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *         user-initiated backup, no tags are copied from the file system, regardless of this value.
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
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: ").append(getPreferredSubnetId()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
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

        if (obj instanceof CreateFileSystemWindowsConfiguration == false)
            return false;
        CreateFileSystemWindowsConfiguration other = (CreateFileSystemWindowsConfiguration) obj;
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
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
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
        hashCode = prime * hashCode + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemWindowsConfiguration clone() {
        try {
            return (CreateFileSystemWindowsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemWindowsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
