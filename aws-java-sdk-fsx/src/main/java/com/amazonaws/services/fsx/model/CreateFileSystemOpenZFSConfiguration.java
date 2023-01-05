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
 * The Amazon FSx for OpenZFS configuration properties for the file system that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemOpenZFSConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemOpenZFSConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to all automatic
     * and user-initiated backups where the user doesn't specify tags. If this value is <code>true</code>, and you
     * specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     * creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;
    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to volumes where
     * the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToVolumes;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a
     * single Availability Zone in an Amazon Web Services Region . Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     * available, except US West (Oregon).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe
     * L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio), US West
     * (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see: <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     * >Deployment type availability</a> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     * performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second (MB/s). Valid
     * values depend on the DeploymentType you choose, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pay for additional throughput capacity that you provision.
     * </p>
     */
    private Integer throughputCapacity;

    private String weeklyMaintenanceStartTime;

    private DiskIopsConfiguration diskIopsConfiguration;
    /**
     * <p>
     * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system. All
     * volumes are children of the root volume.
     * </p>
     */
    private OpenZFSCreateRootVolumeConfiguration rootVolumeConfiguration;

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

    public CreateFileSystemOpenZFSConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to all automatic
     * and user-initiated backups where the user doesn't specify tags. If this value is <code>true</code>, and you
     * specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     * creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A Boolean value indicating whether tags for the file system should be copied to backups. This value
     *        defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *        to all automatic and user-initiated backups where the user doesn't specify tags. If this value is
     *        <code>true</code>, and you specify one or more tags, only the specified tags are copied to backups. If you
     *        specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     *        regardless of this value.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to all automatic
     * and user-initiated backups where the user doesn't specify tags. If this value is <code>true</code>, and you
     * specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     * creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the file system should be copied to backups. This value
     *         defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *         to all automatic and user-initiated backups where the user doesn't specify tags. If this value is
     *         <code>true</code>, and you specify one or more tags, only the specified tags are copied to backups. If
     *         you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     *         system, regardless of this value.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to all automatic
     * and user-initiated backups where the user doesn't specify tags. If this value is <code>true</code>, and you
     * specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     * creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A Boolean value indicating whether tags for the file system should be copied to backups. This value
     *        defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *        to all automatic and user-initiated backups where the user doesn't specify tags. If this value is
     *        <code>true</code>, and you specify one or more tags, only the specified tags are copied to backups. If you
     *        specify one or more tags when creating a user-initiated backup, no tags are copied from the file system,
     *        regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to backups. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to all automatic
     * and user-initiated backups where the user doesn't specify tags. If this value is <code>true</code>, and you
     * specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     * creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the file system should be copied to backups. This value
     *         defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *         to all automatic and user-initiated backups where the user doesn't specify tags. If this value is
     *         <code>true</code>, and you specify one or more tags, only the specified tags are copied to backups. If
     *         you specify one or more tags when creating a user-initiated backup, no tags are copied from the file
     *         system, regardless of this value.
     */

    public Boolean isCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to volumes where
     * the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToVolumes
     *        A Boolean value indicating whether tags for the file system should be copied to volumes. This value
     *        defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *        to volumes where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or
     *        more tags, only the specified tags are copied to volumes. If you specify one or more tags when creating
     *        the volume, no tags are copied from the file system, regardless of this value.
     */

    public void setCopyTagsToVolumes(Boolean copyTagsToVolumes) {
        this.copyTagsToVolumes = copyTagsToVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to volumes where
     * the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the file system should be copied to volumes. This value
     *         defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *         to volumes where the user doesn't specify tags. If this value is <code>true</code>, and you specify one
     *         or more tags, only the specified tags are copied to volumes. If you specify one or more tags when
     *         creating the volume, no tags are copied from the file system, regardless of this value.
     */

    public Boolean getCopyTagsToVolumes() {
        return this.copyTagsToVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to volumes where
     * the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToVolumes
     *        A Boolean value indicating whether tags for the file system should be copied to volumes. This value
     *        defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *        to volumes where the user doesn't specify tags. If this value is <code>true</code>, and you specify one or
     *        more tags, only the specified tags are copied to volumes. If you specify one or more tags when creating
     *        the volume, no tags are copied from the file system, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withCopyTagsToVolumes(Boolean copyTagsToVolumes) {
        setCopyTagsToVolumes(copyTagsToVolumes);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the file system should be copied to volumes. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied to volumes where
     * the user doesn't specify tags. If this value is <code>true</code>, and you specify one or more tags, only the
     * specified tags are copied to volumes. If you specify one or more tags when creating the volume, no tags are
     * copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the file system should be copied to volumes. This value
     *         defaults to <code>false</code>. If it's set to <code>true</code>, all tags for the file system are copied
     *         to volumes where the user doesn't specify tags. If this value is <code>true</code>, and you specify one
     *         or more tags, only the specified tags are copied to volumes. If you specify one or more tags when
     *         creating the volume, no tags are copied from the file system, regardless of this value.
     */

    public Boolean isCopyTagsToVolumes() {
        return this.copyTagsToVolumes;
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

    public CreateFileSystemOpenZFSConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a
     * single Availability Zone in an Amazon Web Services Region . Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     * available, except US West (Oregon).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe
     * L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio), US West
     * (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see: <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     * >Deployment type availability</a> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     * performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within
     *        a single Availability Zone in an Amazon Web Services Region . Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     *        <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     *        available, except US West (Oregon).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an
     *        NVMe L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio),
     *        US West (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see: <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     *        >Deployment type availability</a> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     *        performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @see OpenZFSDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a
     * single Availability Zone in an Amazon Web Services Region . Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     * available, except US West (Oregon).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe
     * L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio), US West
     * (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see: <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     * >Deployment type availability</a> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     * performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @return Specifies the file system deployment type. Single AZ deployment types are configured for redundancy
     *         within a single Availability Zone in an Amazon Web Services Region . Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     *         <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     *         available, except US West (Oregon).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an
     *         NVMe L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East
     *         (Ohio), US West (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see: <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     *         >Deployment type availability</a> and <a
     *         href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File
     *         system performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @see OpenZFSDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a
     * single Availability Zone in an Amazon Web Services Region . Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     * available, except US West (Oregon).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe
     * L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio), US West
     * (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see: <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     * >Deployment type availability</a> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     * performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within
     *        a single Availability Zone in an Amazon Web Services Region . Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     *        <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     *        available, except US West (Oregon).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an
     *        NVMe L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio),
     *        US West (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see: <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     *        >Deployment type availability</a> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     *        performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDeploymentType
     */

    public CreateFileSystemOpenZFSConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within a
     * single Availability Zone in an Amazon Web Services Region . Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     * <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     * available, except US West (Oregon).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an NVMe
     * L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio), US West
     * (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see: <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     * >Deployment type availability</a> and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     * performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file system deployment type. Single AZ deployment types are configured for redundancy within
     *        a single Availability Zone in an Amazon Web Services Region . Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code>- (Default) Creates file systems with throughput capacities of 64 - 4,096 MB/s.
     *        <code>Single_AZ_1</code> is available in all Amazon Web Services Regions where Amazon FSx for OpenZFS is
     *        available, except US West (Oregon).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code>- Creates file systems with throughput capacities of 160 - 10,240 MB/s using an
     *        NVMe L2ARC cache. <code>Single_AZ_2</code> is available only in the US East (N. Virginia), US East (Ohio),
     *        US West (Oregon), and Europe (Ireland) Amazon Web Services Regions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see: <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/availability-durability.html#available-aws-regions"
     *        >Deployment type availability</a> and <a
     *        href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/performance.html#zfs-fs-performance">File system
     *        performance</a> in the <i>Amazon FSx for OpenZFS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDeploymentType
     */

    public CreateFileSystemOpenZFSConfiguration withDeploymentType(OpenZFSDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second (MB/s). Valid
     * values depend on the DeploymentType you choose, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pay for additional throughput capacity that you provision.
     * </p>
     * 
     * @param throughputCapacity
     *        Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second
     *        (MB/s). Valid values depend on the DeploymentType you choose, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You pay for additional throughput capacity that you provision.
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second (MB/s). Valid
     * values depend on the DeploymentType you choose, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pay for additional throughput capacity that you provision.
     * </p>
     * 
     * @return Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second
     *         (MB/s). Valid values depend on the DeploymentType you choose, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240
     *         MB/s.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You pay for additional throughput capacity that you provision.
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second (MB/s). Valid
     * values depend on the DeploymentType you choose, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You pay for additional throughput capacity that you provision.
     * </p>
     * 
     * @param throughputCapacity
     *        Specifies the throughput of an Amazon FSx for OpenZFS file system, measured in megabytes per second
     *        (MB/s). Valid values depend on the DeploymentType you choose, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code>, valid values are 64, 128, 256, 512, 1024, 2048, 3072, or 4096 MB/s.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code>, valid values are 160, 320, 640, 1280, 2560, 3840, 5120, 7680, or 10240 MB/s.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You pay for additional throughput capacity that you provision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * @param weeklyMaintenanceStartTime
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * @return
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * @param weeklyMaintenanceStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * @param diskIopsConfiguration
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * @return
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * @param diskIopsConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system. All
     * volumes are children of the root volume.
     * </p>
     * 
     * @param rootVolumeConfiguration
     *        The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system.
     *        All volumes are children of the root volume.
     */

    public void setRootVolumeConfiguration(OpenZFSCreateRootVolumeConfiguration rootVolumeConfiguration) {
        this.rootVolumeConfiguration = rootVolumeConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system. All
     * volumes are children of the root volume.
     * </p>
     * 
     * @return The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system.
     *         All volumes are children of the root volume.
     */

    public OpenZFSCreateRootVolumeConfiguration getRootVolumeConfiguration() {
        return this.rootVolumeConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system. All
     * volumes are children of the root volume.
     * </p>
     * 
     * @param rootVolumeConfiguration
     *        The configuration Amazon FSx uses when creating the root value of the Amazon FSx for OpenZFS file system.
     *        All volumes are children of the root volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOpenZFSConfiguration withRootVolumeConfiguration(OpenZFSCreateRootVolumeConfiguration rootVolumeConfiguration) {
        setRootVolumeConfiguration(rootVolumeConfiguration);
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
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getCopyTagsToBackups() != null)
            sb.append("CopyTagsToBackups: ").append(getCopyTagsToBackups()).append(",");
        if (getCopyTagsToVolumes() != null)
            sb.append("CopyTagsToVolumes: ").append(getCopyTagsToVolumes()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDiskIopsConfiguration() != null)
            sb.append("DiskIopsConfiguration: ").append(getDiskIopsConfiguration()).append(",");
        if (getRootVolumeConfiguration() != null)
            sb.append("RootVolumeConfiguration: ").append(getRootVolumeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemOpenZFSConfiguration == false)
            return false;
        CreateFileSystemOpenZFSConfiguration other = (CreateFileSystemOpenZFSConfiguration) obj;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getCopyTagsToBackups() == null ^ this.getCopyTagsToBackups() == null)
            return false;
        if (other.getCopyTagsToBackups() != null && other.getCopyTagsToBackups().equals(this.getCopyTagsToBackups()) == false)
            return false;
        if (other.getCopyTagsToVolumes() == null ^ this.getCopyTagsToVolumes() == null)
            return false;
        if (other.getCopyTagsToVolumes() != null && other.getCopyTagsToVolumes().equals(this.getCopyTagsToVolumes()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDiskIopsConfiguration() == null ^ this.getDiskIopsConfiguration() == null)
            return false;
        if (other.getDiskIopsConfiguration() != null && other.getDiskIopsConfiguration().equals(this.getDiskIopsConfiguration()) == false)
            return false;
        if (other.getRootVolumeConfiguration() == null ^ this.getRootVolumeConfiguration() == null)
            return false;
        if (other.getRootVolumeConfiguration() != null && other.getRootVolumeConfiguration().equals(this.getRootVolumeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToBackups() == null) ? 0 : getCopyTagsToBackups().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToVolumes() == null) ? 0 : getCopyTagsToVolumes().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDiskIopsConfiguration() == null) ? 0 : getDiskIopsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeConfiguration() == null) ? 0 : getRootVolumeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemOpenZFSConfiguration clone() {
        try {
            return (CreateFileSystemOpenZFSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemOpenZFSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
