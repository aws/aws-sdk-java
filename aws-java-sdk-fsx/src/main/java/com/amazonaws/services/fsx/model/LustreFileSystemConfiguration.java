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
 * The configuration for the Amazon FSx for Lustre file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/LustreFileSystemConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     */
    private String weeklyMaintenanceStartTime;

    private DataRepositoryConfiguration dataRepositoryConfiguration;
    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption of
     * data in transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     */
    private Integer perUnitStorageThroughput;
    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     */
    private String mountName;

    private String dailyAutomaticBackupStartTime;

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't
     * specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value. (Default = false)
     * </p>
     */
    private Boolean copyTagsToBackups;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *        weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @return The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *         weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday
     * number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the
     *        weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * @param dataRepositoryConfiguration
     */

    public void setDataRepositoryConfiguration(DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
    }

    /**
     * @return
     */

    public DataRepositoryConfiguration getDataRepositoryConfiguration() {
        return this.dataRepositoryConfiguration;
    }

    /**
     * @param dataRepositoryConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withDataRepositoryConfiguration(DataRepositoryConfiguration dataRepositoryConfiguration) {
        setDataRepositoryConfiguration(dataRepositoryConfiguration);
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption of
     * data in transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption
     *        of data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>. (Default = <code>SCRATCH_1</code>)
     * @see LustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption of
     * data in transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * 
     * @return The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for
     *         temporary storage and shorter-term processing of data.</p>
     *         <p>
     *         <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *         temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type
     *         provides in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *         </p>
     *         <p>
     *         The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and
     *         encryption of data in transit. To learn more about deployment types, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *         Deployment Options</a>. (Default = <code>SCRATCH_1</code>)
     * @see LustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption of
     * data in transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption
     *        of data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>. (Default = <code>SCRATCH_1</code>)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public LustreFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption of
     * data in transit. To learn more about deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre Deployment
     * Options</a>. (Default = <code>SCRATCH_1</code>)
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> deployment type is used for longer-term storage and workloads and encryption
     *        of data in transit. To learn more about deployment types, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        Deployment Options</a>. (Default = <code>SCRATCH_1</code>)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public LustreFileSystemConfiguration withDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *        types. Valid values are 50, 100, 200.
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @return Per unit storage throughput represents the megabytes per second of read or write throughput per 1
     *         tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *         PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *         types. Valid values are 50, 100, 200.
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *        types. Valid values are 50, 100, 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        setPerUnitStorageThroughput(perUnitStorageThroughput);
        return this;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *        unique within an AWS Region.
     */

    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @return You use the <code>MountName</code> value when mounting the file system.</p>
     *         <p>
     *         For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *         <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *         unique within an AWS Region.
     */

    public String getMountName() {
        return this.mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *        unique within an AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withMountName(String mountName) {
        setMountName(mountName);
        return this;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * @return
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * @param automaticBackupRetentionDays
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * @return
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * @param automaticBackupRetentionDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't
     * specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value. (Default = false)
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to
     *        true, all tags on the file system are copied to all automatic backups and any user-initiated backups where
     *        the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the
     *        specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *        backup, no tags are copied from the file system, regardless of this value. (Default = false)
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't
     * specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value. (Default = false)
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to
     *         true, all tags on the file system are copied to all automatic backups and any user-initiated backups
     *         where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only
     *         the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *         backup, no tags are copied from the file system, regardless of this value. (Default = false)
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't
     * specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value. (Default = false)
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to
     *        true, all tags on the file system are copied to all automatic backups and any user-initiated backups where
     *        the user doesn't specify any tags. If this value is true, and you specify one or more tags, only the
     *        specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *        backup, no tags are copied from the file system, regardless of this value. (Default = false)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to true, all
     * tags on the file system are copied to all automatic backups and any user-initiated backups where the user doesn't
     * specify any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to
     * backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     * system, regardless of this value. (Default = false)
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system should be copied to backups. If it's set to
     *         true, all tags on the file system are copied to all automatic backups and any user-initiated backups
     *         where the user doesn't specify any tags. If this value is true, and you specify one or more tags, only
     *         the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     *         backup, no tags are copied from the file system, regardless of this value. (Default = false)
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDataRepositoryConfiguration() != null)
            sb.append("DataRepositoryConfiguration: ").append(getDataRepositoryConfiguration()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: ").append(getPerUnitStorageThroughput()).append(",");
        if (getMountName() != null)
            sb.append("MountName: ").append(getMountName()).append(",");
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

        if (obj instanceof LustreFileSystemConfiguration == false)
            return false;
        LustreFileSystemConfiguration other = (LustreFileSystemConfiguration) obj;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDataRepositoryConfiguration() == null ^ this.getDataRepositoryConfiguration() == null)
            return false;
        if (other.getDataRepositoryConfiguration() != null && other.getDataRepositoryConfiguration().equals(this.getDataRepositoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getMountName() == null ^ this.getMountName() == null)
            return false;
        if (other.getMountName() != null && other.getMountName().equals(this.getMountName()) == false)
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

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryConfiguration() == null) ? 0 : getDataRepositoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getMountName() == null) ? 0 : getMountName().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        return hashCode;
    }

    @Override
    public LustreFileSystemConfiguration clone() {
        try {
            return (LustreFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.LustreFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
