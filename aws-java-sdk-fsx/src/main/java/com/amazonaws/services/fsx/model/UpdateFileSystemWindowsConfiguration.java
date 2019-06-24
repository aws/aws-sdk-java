/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates the Microsoft Windows configuration for an existing Amazon FSx for Windows File Server file system. Amazon
 * FSx overwrites existing properties with non-null values provided in the request. If you don't specify a non-null
 * value for a property, that property is not updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystemWindowsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemWindowsConfiguration implements Serializable, Cloneable, StructuredPojo {

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
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory.
     * </p>
     */
    private SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration;

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

    public UpdateFileSystemWindowsConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
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

    public UpdateFileSystemWindowsConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
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

    public UpdateFileSystemWindowsConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory.
     * </p>
     * 
     * @param selfManagedActiveDirectoryConfiguration
     *        The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *        AD directory.
     */

    public void setSelfManagedActiveDirectoryConfiguration(SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory.
     * </p>
     * 
     * @return The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *         AD directory.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates getSelfManagedActiveDirectoryConfiguration() {
        return this.selfManagedActiveDirectoryConfiguration;
    }

    /**
     * <p>
     * The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft AD
     * directory.
     * </p>
     * 
     * @param selfManagedActiveDirectoryConfiguration
     *        The configuration Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft
     *        AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemWindowsConfiguration withSelfManagedActiveDirectoryConfiguration(
            SelfManagedActiveDirectoryConfigurationUpdates selfManagedActiveDirectoryConfiguration) {
        setSelfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration);
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
        if (getSelfManagedActiveDirectoryConfiguration() != null)
            sb.append("SelfManagedActiveDirectoryConfiguration: ").append(getSelfManagedActiveDirectoryConfiguration());
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
        if (other.getSelfManagedActiveDirectoryConfiguration() == null ^ this.getSelfManagedActiveDirectoryConfiguration() == null)
            return false;
        if (other.getSelfManagedActiveDirectoryConfiguration() != null
                && other.getSelfManagedActiveDirectoryConfiguration().equals(this.getSelfManagedActiveDirectoryConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getSelfManagedActiveDirectoryConfiguration() == null) ? 0 : getSelfManagedActiveDirectoryConfiguration().hashCode());
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
