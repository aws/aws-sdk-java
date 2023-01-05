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
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     * <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     */
    private String weeklyMaintenanceStartTime;

    private DataRepositoryConfiguration dataRepositoryConfiguration;
    /**
     * <p>
     * The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term storage and
     * workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre v2.12 and offers higher
     * <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower minimum storage capacity
     * requirement (600 GiB). To learn more about FSx for Lustre deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre deployment
     * options</a>.
     * </p>
     * <p>
     * The default is <code>SCRATCH_1</code>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     * <code>PERSISTENT_2</code> deployment types.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     * </p>
     * </li>
     * </ul>
     */
    private Integer perUnitStorageThroughput;
    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this value is
     * a string that is unique within an Amazon Web Services Region.
     * </p>
     */
    private String mountName;

    private String dailyAutomaticBackupStartTime;

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on
     * the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify
     * any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
     * If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     * regardless of this value. (Default = false)
     * </p>
     */
    private Boolean copyTagsToBackups;
    /**
     * <p>
     * The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD storage
     * devices. This parameter is required when <code>StorageType</code> is HDD. When set to <code>READ</code> the file
     * system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the
     * performance for frequently accessed files by caching up to 20% of the total storage capacity.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     */
    private String driveCacheType;
    /**
     * <p>
     * The data compression configuration for the file system. <code>DataCompressionType</code> can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Data compression is turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data compression</a>.
     * </p>
     */
    private String dataCompressionType;
    /**
     * <p>
     * The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to Amazon
     * CloudWatch Logs.
     * </p>
     */
    private LustreLogConfiguration logConfiguration;
    /**
     * <p>
     * The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     * restricts root-level access from clients that try to access your file system as a root user.
     * </p>
     */
    private LustreRootSquashConfiguration rootSquashConfiguration;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     * <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     *        <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     * <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @return The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     *         <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     * <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Here,
     *        <code>d</code> is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
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
     * The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term storage and
     * workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre v2.12 and offers higher
     * <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower minimum storage capacity
     * requirement (600 GiB). To learn more about FSx for Lustre deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre deployment
     * options</a>.
     * </p>
     * <p>
     * The default is <code>SCRATCH_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term
     *        storage and workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre
     *        v2.12 and offers higher <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower
     *        minimum storage capacity requirement (600 GiB). To learn more about FSx for Lustre deployment types, see
     *        <a href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        deployment options</a>.
     *        </p>
     *        <p>
     *        The default is <code>SCRATCH_1</code>.
     * @see LustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term storage and
     * workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre v2.12 and offers higher
     * <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower minimum storage capacity
     * requirement (600 GiB). To learn more about FSx for Lustre deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre deployment
     * options</a>.
     * </p>
     * <p>
     * The default is <code>SCRATCH_1</code>.
     * </p>
     * 
     * @return The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for
     *         temporary storage and shorter-term processing of data.</p>
     *         <p>
     *         <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *         temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type
     *         provides in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *         </p>
     *         <p>
     *         The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term
     *         storage and workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre
     *         v2.12 and offers higher <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower
     *         minimum storage capacity requirement (600 GiB). To learn more about FSx for Lustre deployment types, see
     *         <a href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *         deployment options</a>.
     *         </p>
     *         <p>
     *         The default is <code>SCRATCH_1</code>.
     * @see LustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term storage and
     * workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre v2.12 and offers higher
     * <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower minimum storage capacity
     * requirement (600 GiB). To learn more about FSx for Lustre deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre deployment
     * options</a>.
     * </p>
     * <p>
     * The default is <code>SCRATCH_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term
     *        storage and workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre
     *        v2.12 and offers higher <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower
     *        minimum storage capacity requirement (600 GiB). To learn more about FSx for Lustre deployment types, see
     *        <a href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        deployment options</a>.
     *        </p>
     *        <p>
     *        The default is <code>SCRATCH_1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public LustreFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for temporary
     * storage and shorter-term processing of data.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need temporary
     * storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides in-transit
     * encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     * </p>
     * <p>
     * The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term storage and
     * workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre v2.12 and offers higher
     * <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower minimum storage capacity
     * requirement (600 GiB). To learn more about FSx for Lustre deployment types, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre deployment
     * options</a>.
     * </p>
     * <p>
     * The default is <code>SCRATCH_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSx for Lustre file system. <i>Scratch deployment type</i> is designed for
     *        temporary storage and shorter-term processing of data.</p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> deployment types are best suited for when you need
     *        temporary storage and shorter-term processing of data. The <code>SCRATCH_2</code> deployment type provides
     *        in-transit encryption of data and higher burst throughput capacity than <code>SCRATCH_1</code>.
     *        </p>
     *        <p>
     *        The <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment type is used for longer-term
     *        storage and workloads and encryption of data in transit. <code>PERSISTENT_2</code> is built on Lustre
     *        v2.12 and offers higher <code>PerUnitStorageThroughput</code> (up to 1000 MB/s/TiB) along with a lower
     *        minimum storage capacity requirement (600 GiB). To learn more about FSx for Lustre deployment types, see
     *        <a href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/lustre-deployment-types.html"> FSx for Lustre
     *        deployment options</a>.
     *        </p>
     *        <p>
     *        The default is <code>SCRATCH_1</code>.
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
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     * <code>PERSISTENT_2</code> deployment types.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     *        <code>PERSISTENT_2</code> deployment types. </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     *        </p>
     *        </li>
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     * <code>PERSISTENT_2</code> deployment types.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Per unit storage throughput represents the megabytes per second of read or write throughput per 1
     *         tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *         PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     *         <code>PERSISTENT_2</code> deployment types. </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     *         </p>
     *         </li>
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     * <code>PERSISTENT_2</code> deployment types.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> and
     *        <code>PERSISTENT_2</code> deployment types. </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> SSD storage: 50, 100, 200.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_1</code> HDD storage: 12, 40.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>PERSISTENT_2</code> SSD storage: 125, 250, 500, 1000.
     *        </p>
     *        </li>
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
     * <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this value is
     * a string that is unique within an Amazon Web Services Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this
     *        value is a string that is unique within an Amazon Web Services Region.
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
     * <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this value is
     * a string that is unique within an Amazon Web Services Region.
     * </p>
     * 
     * @return You use the <code>MountName</code> value when mounting the file system.</p>
     *         <p>
     *         For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *         <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this
     *         value is a string that is unique within an Amazon Web Services Region.
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
     * <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this value is
     * a string that is unique within an Amazon Web Services Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code>, <code>PERSISTENT_1</code>, and <code>PERSISTENT_2</code> deployment types, this
     *        value is a string that is unique within an Amazon Web Services Region.
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
     * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on
     * the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify
     * any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
     * If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     * regardless of this value. (Default = false)
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all
     *        tags on the file system are copied to all automatic backups and any user-initiated backups where the user
     *        doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags
     *        are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     *        copied from the file system, regardless of this value. (Default = false)
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on
     * the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify
     * any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
     * If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     * regardless of this value. (Default = false)
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all
     *         tags on the file system are copied to all automatic backups and any user-initiated backups where the user
     *         doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified
     *         tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no
     *         tags are copied from the file system, regardless of this value. (Default = false)
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on
     * the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify
     * any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
     * If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     * regardless of this value. (Default = false)
     * </p>
     * 
     * @param copyTagsToBackups
     *        A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all
     *        tags on the file system are copied to all automatic backups and any user-initiated backups where the user
     *        doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified tags
     *        are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are
     *        copied from the file system, regardless of this value. (Default = false)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all tags on
     * the file system are copied to all automatic backups and any user-initiated backups where the user doesn't specify
     * any tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups.
     * If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     * regardless of this value. (Default = false)
     * </p>
     * 
     * @return A boolean flag indicating whether tags on the file system are copied to backups. If it's set to true, all
     *         tags on the file system are copied to all automatic backups and any user-initiated backups where the user
     *         doesn't specify any tags. If this value is true, and you specify one or more tags, only the specified
     *         tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no
     *         tags are copied from the file system, regardless of this value. (Default = false)
     */

    public Boolean isCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD storage
     * devices. This parameter is required when <code>StorageType</code> is HDD. When set to <code>READ</code> the file
     * system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the
     * performance for frequently accessed files by caching up to 20% of the total storage capacity.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD
     *        storage devices. This parameter is required when <code>StorageType</code> is HDD. When set to
     *        <code>READ</code> the file system has an SSD storage cache that is sized to 20% of the file system's
     *        storage capacity. This improves the performance for frequently accessed files by caching up to 20% of the
     *        total storage capacity.</p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @see DriveCacheType
     */

    public void setDriveCacheType(String driveCacheType) {
        this.driveCacheType = driveCacheType;
    }

    /**
     * <p>
     * The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD storage
     * devices. This parameter is required when <code>StorageType</code> is HDD. When set to <code>READ</code> the file
     * system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the
     * performance for frequently accessed files by caching up to 20% of the total storage capacity.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @return The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD
     *         storage devices. This parameter is required when <code>StorageType</code> is HDD. When set to
     *         <code>READ</code> the file system has an SSD storage cache that is sized to 20% of the file system's
     *         storage capacity. This improves the performance for frequently accessed files by caching up to 20% of the
     *         total storage capacity.</p>
     *         <p>
     *         This parameter is required when <code>StorageType</code> is set to HDD.
     * @see DriveCacheType
     */

    public String getDriveCacheType() {
        return this.driveCacheType;
    }

    /**
     * <p>
     * The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD storage
     * devices. This parameter is required when <code>StorageType</code> is HDD. When set to <code>READ</code> the file
     * system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the
     * performance for frequently accessed files by caching up to 20% of the total storage capacity.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD
     *        storage devices. This parameter is required when <code>StorageType</code> is HDD. When set to
     *        <code>READ</code> the file system has an SSD storage cache that is sized to 20% of the file system's
     *        storage capacity. This improves the performance for frequently accessed files by caching up to 20% of the
     *        total storage capacity.</p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriveCacheType
     */

    public LustreFileSystemConfiguration withDriveCacheType(String driveCacheType) {
        setDriveCacheType(driveCacheType);
        return this;
    }

    /**
     * <p>
     * The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD storage
     * devices. This parameter is required when <code>StorageType</code> is HDD. When set to <code>READ</code> the file
     * system has an SSD storage cache that is sized to 20% of the file system's storage capacity. This improves the
     * performance for frequently accessed files by caching up to 20% of the total storage capacity.
     * </p>
     * <p>
     * This parameter is required when <code>StorageType</code> is set to HDD.
     * </p>
     * 
     * @param driveCacheType
     *        The type of drive cache used by <code>PERSISTENT_1</code> file systems that are provisioned with HDD
     *        storage devices. This parameter is required when <code>StorageType</code> is HDD. When set to
     *        <code>READ</code> the file system has an SSD storage cache that is sized to 20% of the file system's
     *        storage capacity. This improves the performance for frequently accessed files by caching up to 20% of the
     *        total storage capacity.</p>
     *        <p>
     *        This parameter is required when <code>StorageType</code> is set to HDD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriveCacheType
     */

    public LustreFileSystemConfiguration withDriveCacheType(DriveCacheType driveCacheType) {
        this.driveCacheType = driveCacheType.toString();
        return this;
    }

    /**
     * <p>
     * The data compression configuration for the file system. <code>DataCompressionType</code> can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Data compression is turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data compression</a>.
     * </p>
     * 
     * @param dataCompressionType
     *        The data compression configuration for the file system. <code>DataCompressionType</code> can have the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Data compression is turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data
     *        compression</a>.
     * @see DataCompressionType
     */

    public void setDataCompressionType(String dataCompressionType) {
        this.dataCompressionType = dataCompressionType;
    }

    /**
     * <p>
     * The data compression configuration for the file system. <code>DataCompressionType</code> can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Data compression is turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data compression</a>.
     * </p>
     * 
     * @return The data compression configuration for the file system. <code>DataCompressionType</code> can have the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - Data compression is turned off for the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data
     *         compression</a>.
     * @see DataCompressionType
     */

    public String getDataCompressionType() {
        return this.dataCompressionType;
    }

    /**
     * <p>
     * The data compression configuration for the file system. <code>DataCompressionType</code> can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Data compression is turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data compression</a>.
     * </p>
     * 
     * @param dataCompressionType
     *        The data compression configuration for the file system. <code>DataCompressionType</code> can have the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Data compression is turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data
     *        compression</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCompressionType
     */

    public LustreFileSystemConfiguration withDataCompressionType(String dataCompressionType) {
        setDataCompressionType(dataCompressionType);
        return this;
    }

    /**
     * <p>
     * The data compression configuration for the file system. <code>DataCompressionType</code> can have the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - Data compression is turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data compression</a>.
     * </p>
     * 
     * @param dataCompressionType
     *        The data compression configuration for the file system. <code>DataCompressionType</code> can have the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - Data compression is turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LZ4</code> - Data compression is turned on with the LZ4 algorithm.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html">Lustre data
     *        compression</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCompressionType
     */

    public LustreFileSystemConfiguration withDataCompressionType(DataCompressionType dataCompressionType) {
        this.dataCompressionType = dataCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to Amazon
     * CloudWatch Logs.
     * </p>
     * 
     * @param logConfiguration
     *        The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to
     *        Amazon CloudWatch Logs.
     */

    public void setLogConfiguration(LustreLogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to Amazon
     * CloudWatch Logs.
     * </p>
     * 
     * @return The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to
     *         Amazon CloudWatch Logs.
     */

    public LustreLogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to Amazon
     * CloudWatch Logs.
     * </p>
     * 
     * @param logConfiguration
     *        The Lustre logging configuration. Lustre logging writes the enabled log events for your file system to
     *        Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withLogConfiguration(LustreLogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     * restricts root-level access from clients that try to access your file system as a root user.
     * </p>
     * 
     * @param rootSquashConfiguration
     *        The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     *        restricts root-level access from clients that try to access your file system as a root user.
     */

    public void setRootSquashConfiguration(LustreRootSquashConfiguration rootSquashConfiguration) {
        this.rootSquashConfiguration = rootSquashConfiguration;
    }

    /**
     * <p>
     * The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     * restricts root-level access from clients that try to access your file system as a root user.
     * </p>
     * 
     * @return The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     *         restricts root-level access from clients that try to access your file system as a root user.
     */

    public LustreRootSquashConfiguration getRootSquashConfiguration() {
        return this.rootSquashConfiguration;
    }

    /**
     * <p>
     * The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     * restricts root-level access from clients that try to access your file system as a root user.
     * </p>
     * 
     * @param rootSquashConfiguration
     *        The Lustre root squash configuration for an Amazon FSx for Lustre file system. When enabled, root squash
     *        restricts root-level access from clients that try to access your file system as a root user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withRootSquashConfiguration(LustreRootSquashConfiguration rootSquashConfiguration) {
        setRootSquashConfiguration(rootSquashConfiguration);
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
            sb.append("CopyTagsToBackups: ").append(getCopyTagsToBackups()).append(",");
        if (getDriveCacheType() != null)
            sb.append("DriveCacheType: ").append(getDriveCacheType()).append(",");
        if (getDataCompressionType() != null)
            sb.append("DataCompressionType: ").append(getDataCompressionType()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getRootSquashConfiguration() != null)
            sb.append("RootSquashConfiguration: ").append(getRootSquashConfiguration());
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
        if (other.getDriveCacheType() == null ^ this.getDriveCacheType() == null)
            return false;
        if (other.getDriveCacheType() != null && other.getDriveCacheType().equals(this.getDriveCacheType()) == false)
            return false;
        if (other.getDataCompressionType() == null ^ this.getDataCompressionType() == null)
            return false;
        if (other.getDataCompressionType() != null && other.getDataCompressionType().equals(this.getDataCompressionType()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getRootSquashConfiguration() == null ^ this.getRootSquashConfiguration() == null)
            return false;
        if (other.getRootSquashConfiguration() != null && other.getRootSquashConfiguration().equals(this.getRootSquashConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getDriveCacheType() == null) ? 0 : getDriveCacheType().hashCode());
        hashCode = prime * hashCode + ((getDataCompressionType() == null) ? 0 : getDataCompressionType().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRootSquashConfiguration() == null) ? 0 : getRootSquashConfiguration().hashCode());
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
