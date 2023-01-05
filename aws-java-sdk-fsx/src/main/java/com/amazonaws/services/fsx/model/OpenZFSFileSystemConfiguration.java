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
 * The configuration for the Amazon FSx for OpenZFS file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSFileSystemConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     * <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated backups
     * where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or more tags,
     * only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToBackups;
    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     */
    private Boolean copyTagsToVolumes;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028; <code>SINGLE_AZ_1</code> and
     * <code>SINGLE_AZ_2</code>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     * </p>
     */
    private Integer throughputCapacity;

    private String weeklyMaintenanceStartTime;

    private DiskIopsConfiguration diskIopsConfiguration;
    /**
     * <p>
     * The ID of the root volume of the OpenZFS file system.
     * </p>
     */
    private String rootVolumeId;

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

    public OpenZFSFileSystemConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     * <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated backups
     * where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or more tags,
     * only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     *        <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated
     *        backups where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or
     *        more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public void setCopyTagsToBackups(Boolean copyTagsToBackups) {
        this.copyTagsToBackups = copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     * <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated backups
     * where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or more tags,
     * only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     *         <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated
     *         backups where the user doesn't specify any tags. If this value is <code>true</code> and you specify one
     *         or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     *         creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public Boolean getCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     * <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated backups
     * where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or more tags,
     * only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @param copyTagsToBackups
     *        A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     *        <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated
     *        backups where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or
     *        more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a
     *        user-initiated backup, no tags are copied from the file system, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSFileSystemConfiguration withCopyTagsToBackups(Boolean copyTagsToBackups) {
        setCopyTagsToBackups(copyTagsToBackups);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     * <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated backups
     * where the user doesn't specify any tags. If this value is <code>true</code> and you specify one or more tags,
     * only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated
     * backup, no tags are copied from the file system, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags on the file system should be copied to backups. If it's set to
     *         <code>true</code>, all tags on the file system are copied to all automatic backups and any user-initiated
     *         backups where the user doesn't specify any tags. If this value is <code>true</code> and you specify one
     *         or more tags, only the specified tags are copied to backups. If you specify one or more tags when
     *         creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
     */

    public Boolean isCopyTagsToBackups() {
        return this.copyTagsToBackups;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToVolumes
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *        only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *        snapshot, no tags are copied from the volume, regardless of this value.
     */

    public void setCopyTagsToVolumes(Boolean copyTagsToVolumes) {
        this.copyTagsToVolumes = copyTagsToVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *         only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *         snapshot, no tags are copied from the volume, regardless of this value.
     */

    public Boolean getCopyTagsToVolumes() {
        return this.copyTagsToVolumes;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @param copyTagsToVolumes
     *        A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *        to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *        where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *        only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *        snapshot, no tags are copied from the volume, regardless of this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSFileSystemConfiguration withCopyTagsToVolumes(Boolean copyTagsToVolumes) {
        setCopyTagsToVolumes(copyTagsToVolumes);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to
     * <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots where the
     * user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags, only the
     * specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are
     * copied from the volume, regardless of this value.
     * </p>
     * 
     * @return A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults
     *         to <code>false</code>. If it's set to <code>true</code>, all tags for the volume are copied to snapshots
     *         where the user doesn't specify tags. If this value is <code>true</code> and you specify one or more tags,
     *         only the specified tags are copied to snapshots. If you specify one or more tags when creating the
     *         snapshot, no tags are copied from the volume, regardless of this value.
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

    public OpenZFSFileSystemConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028; <code>SINGLE_AZ_1</code> and
     * <code>SINGLE_AZ_2</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028;
     *        <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>.
     * @see OpenZFSDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028; <code>SINGLE_AZ_1</code> and
     * <code>SINGLE_AZ_2</code>.
     * </p>
     * 
     * @return Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028;
     *         <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>.
     * @see OpenZFSDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028; <code>SINGLE_AZ_1</code> and
     * <code>SINGLE_AZ_2</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028;
     *        <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDeploymentType
     */

    public OpenZFSFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028; <code>SINGLE_AZ_1</code> and
     * <code>SINGLE_AZ_2</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the file-system deployment type. Amazon FSx for OpenZFS supports&#x2028;
     *        <code>SINGLE_AZ_1</code> and <code>SINGLE_AZ_2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenZFSDeploymentType
     */

    public OpenZFSFileSystemConfiguration withDeploymentType(OpenZFSDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     * </p>
     * 
     * @return The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     * </p>
     * 
     * @param throughputCapacity
     *        The throughput of an Amazon FSx file system, measured in megabytes per second (MBps).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSFileSystemConfiguration withThroughputCapacity(Integer throughputCapacity) {
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

    public OpenZFSFileSystemConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
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

    public OpenZFSFileSystemConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID of the root volume of the OpenZFS file system.
     * </p>
     * 
     * @param rootVolumeId
     *        The ID of the root volume of the OpenZFS file system.
     */

    public void setRootVolumeId(String rootVolumeId) {
        this.rootVolumeId = rootVolumeId;
    }

    /**
     * <p>
     * The ID of the root volume of the OpenZFS file system.
     * </p>
     * 
     * @return The ID of the root volume of the OpenZFS file system.
     */

    public String getRootVolumeId() {
        return this.rootVolumeId;
    }

    /**
     * <p>
     * The ID of the root volume of the OpenZFS file system.
     * </p>
     * 
     * @param rootVolumeId
     *        The ID of the root volume of the OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSFileSystemConfiguration withRootVolumeId(String rootVolumeId) {
        setRootVolumeId(rootVolumeId);
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
        if (getRootVolumeId() != null)
            sb.append("RootVolumeId: ").append(getRootVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSFileSystemConfiguration == false)
            return false;
        OpenZFSFileSystemConfiguration other = (OpenZFSFileSystemConfiguration) obj;
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
        if (other.getRootVolumeId() == null ^ this.getRootVolumeId() == null)
            return false;
        if (other.getRootVolumeId() != null && other.getRootVolumeId().equals(this.getRootVolumeId()) == false)
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
        hashCode = prime * hashCode + ((getRootVolumeId() == null) ? 0 : getRootVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSFileSystemConfiguration clone() {
        try {
            return (OpenZFSFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
