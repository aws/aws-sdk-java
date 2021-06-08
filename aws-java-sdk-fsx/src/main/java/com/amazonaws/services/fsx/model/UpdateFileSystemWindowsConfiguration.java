/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates the configuration for an existing Amazon FSx for Windows File Server file system. Amazon FSx only overwrites
 * existing properties with non-null values provided in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystemWindowsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemWindowsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the
     * weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     * </p>
     */
    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time zone, for example, <code>02:00</code>
     * </p>
     */
    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups.
     * You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working with
     * Automatic Daily Backups</a>.
     * </p>
     */
    private Integer automaticBackupRetentionDays;
    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to.
     * Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request
     * if there is an existing throughput capacity update request in progress. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing Throughput
     * Capacity</a>.
     * </p>
     */
    private Integer throughputCapacity;
    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed
     * Microsoft AD update request in progress.
     * </p>
     */
    private SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration;
    /**
     * <p>
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders,
     * and file shares on the Amazon FSx for Windows File Server file system..
     * </p>
     */
    private WindowsAuditLogCreateConfiguration auditLogConfiguration;

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the
     * weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is
     *        the weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the
     * weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     * </p>
     * 
     * @return The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d
     *         is the weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is the
     * weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. Where d is
     *        the weekday number, from 1 through 7, with 1 = Monday and 7 = Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time zone, for example, <code>02:00</code>
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to start the daily automatic backup, in the UTC time zone, for example,
     *        <code>02:00</code>
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time zone, for example, <code>02:00</code>
     * </p>
     * 
     * @return The preferred time to start the daily automatic backup, in the UTC time zone, for example,
     *         <code>02:00</code>
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * <p>
     * The preferred time to start the daily automatic backup, in the UTC time zone, for example, <code>02:00</code>
     * </p>
     * 
     * @param dailyAutomaticBackupStartTime
     *        The preferred time to start the daily automatic backup, in the UTC time zone, for example,
     *        <code>02:00</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups.
     * You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working with
     * Automatic Daily Backups</a>.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily
     *        backups. You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working
     *        with Automatic Daily Backups</a>.
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups.
     * You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working with
     * Automatic Daily Backups</a>.
     * </p>
     * 
     * @return The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily
     *         backups. You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working
     *         with Automatic Daily Backups</a>.
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * <p>
     * The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily backups.
     * You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working with
     * Automatic Daily Backups</a>.
     * </p>
     * 
     * @param automaticBackupRetentionDays
     *        The number of days to retain automatic daily backups. Setting this to zero (0) disables automatic daily
     *        backups. You can retain automatic daily backups for a maximum of 90 days. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#automatic-backups">Working
     *        with Automatic Daily Backups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to.
     * Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request
     * if there is an existing throughput capacity update request in progress. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing Throughput
     * Capacity</a>.
     * </p>
     * 
     * @param throughputCapacity
     *        Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file
     *        system to. Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput
     *        capacity update request if there is an existing throughput capacity update request in progress. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing
     *        Throughput Capacity</a>.
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to.
     * Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request
     * if there is an existing throughput capacity update request in progress. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing Throughput
     * Capacity</a>.
     * </p>
     * 
     * @return Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file
     *         system to. Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput
     *         capacity update request if there is an existing throughput capacity update request in progress. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing
     *         Throughput Capacity</a>.
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file system to.
     * Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput capacity update request
     * if there is an existing throughput capacity update request in progress. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing Throughput
     * Capacity</a>.
     * </p>
     * 
     * @param throughputCapacity
     *        Sets the target value for a file system's throughput capacity, in MB/s, that you are updating the file
     *        system to. Valid values are 8, 16, 32, 64, 128, 256, 512, 1024, 2048. You cannot make a throughput
     *        capacity update request if there is an existing throughput capacity update request in progress. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-throughput-capacity.html">Managing
     *        Throughput Capacity</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed
     * Microsoft AD update request in progress.
     * </p>
     * 
     * @param selfManagedActiveDirectoryConfiguration
     *        The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *        AD directory. You cannot make a self-managed Microsoft AD update request if there is an existing
     *        self-managed Microsoft AD update request in progress.
     */

    public void setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed
     * Microsoft AD update request in progress.
     * </p>
     * 
     * @return The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *         AD directory. You cannot make a self-managed Microsoft AD update request if there is an existing
     *         self-managed Microsoft AD update request in progress.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates getSelfManagedActiveDirectoryConfiguration() {
        return this.selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory. You cannot make a self-managed Microsoft AD update request if there is an existing self-managed
     * Microsoft AD update request in progress.
     * </p>
     * 
     * @param selfManagedActiveDirectoryConfiguration
     *        The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *        AD directory. You cannot make a self-managed Microsoft AD update request if there is an existing
     *        self-managed Microsoft AD update request in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        setSelfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders,
     * and file shares on the Amazon FSx for Windows File Server file system..
     * </p>
     * 
     * @param auditLogConfiguration
     *        The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files,
     *        folders, and file shares on the Amazon FSx for Windows File Server file system..
     */

    public void setAuditLogConfiguration(WindowsAuditLogCreateConfiguration auditLogConfiguration) {
        this.auditLogConfiguration = auditLogConfiguration;
    }

    /**
     * <p>
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders,
     * and file shares on the Amazon FSx for Windows File Server file system..
     * </p>
     * 
     * @return The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files,
     *         folders, and file shares on the Amazon FSx for Windows File Server file system..
     */

    public WindowsAuditLogCreateConfiguration getAuditLogConfiguration() {
        return this.auditLogConfiguration;
    }

    /**
     * <p>
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders,
     * and file shares on the Amazon FSx for Windows File Server file system..
     * </p>
     * 
     * @param auditLogConfiguration
     *        The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files,
     *        folders, and file shares on the Amazon FSx for Windows File Server file system..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withAuditLogConfiguration(WindowsAuditLogCreateConfiguration auditLogConfiguration) {
        setAuditLogConfiguration(auditLogConfiguration);
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
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: ").append(getSelfManagedActiveDirectoryConfiguration()).append(",");
        if (getAuditLogConfiguration() != null)
            sb.append("AuditLogConfiguration: ").append(getAuditLogConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemWindowsConfiguration == false)
            return false;
        UpdateFileSystemWindowsConfiguration other = (UpdateFileSystemWindowsConfiguration) obj;
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
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() == null ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(this.getSelfManagedActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getAuditLogConfiguration() == null ^ this.getAuditLogConfiguration() == null)
            return false;
        if (other.getAuditLogConfiguration() != null && other.getAuditLogConfiguration().equals(this.getAuditLogConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0 : getSelfManagedActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuditLogConfiguration() == null) ? 0 : getAuditLogConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemWindowsConfiguration clone() {
        try {
            return (UpdateFileSystemWindowsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateFileSystemWindowsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
