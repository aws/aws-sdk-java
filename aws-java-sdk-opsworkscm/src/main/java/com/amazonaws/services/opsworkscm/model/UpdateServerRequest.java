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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated backups
     * are enabled by default.
     * </p>
     */
    private Boolean disableAutomatedBackup;
    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     */
    private Integer backupRetentionCount;
    /**
     * <p>
     * The name of the server to update.
     * </p>
     */
    private String serverName;

    private String preferredMaintenanceWindow;

    private String preferredBackupWindow;

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated backups
     * are enabled by default.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated
     *        backups are enabled by default.
     */

    public void setDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        this.disableAutomatedBackup = disableAutomatedBackup;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated backups
     * are enabled by default.
     * </p>
     * 
     * @return Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated
     *         backups are enabled by default.
     */

    public Boolean getDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated backups
     * are enabled by default.
     * </p>
     * 
     * @param disableAutomatedBackup
     *        Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated
     *        backups are enabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withDisableAutomatedBackup(Boolean disableAutomatedBackup) {
        setDisableAutomatedBackup(disableAutomatedBackup);
        return this;
    }

    /**
     * <p>
     * Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated backups
     * are enabled by default.
     * </p>
     * 
     * @return Setting DisableAutomatedBackup to <code>true</code> disables automated or scheduled backups. Automated
     *         backups are enabled by default.
     */

    public Boolean isDisableAutomatedBackup() {
        return this.disableAutomatedBackup;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     * 
     * @param backupRetentionCount
     *        Sets the number of automated backups that you want to keep.
     */

    public void setBackupRetentionCount(Integer backupRetentionCount) {
        this.backupRetentionCount = backupRetentionCount;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     * 
     * @return Sets the number of automated backups that you want to keep.
     */

    public Integer getBackupRetentionCount() {
        return this.backupRetentionCount;
    }

    /**
     * <p>
     * Sets the number of automated backups that you want to keep.
     * </p>
     * 
     * @param backupRetentionCount
     *        Sets the number of automated backups that you want to keep.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withBackupRetentionCount(Integer backupRetentionCount) {
        setBackupRetentionCount(backupRetentionCount);
        return this;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @param serverName
     *        The name of the server to update.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @return The name of the server to update.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @param serverName
     *        The name of the server to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * @param preferredMaintenanceWindow
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * @return
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * @param preferredMaintenanceWindow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * @param preferredBackupWindow
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * @return
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * @param preferredBackupWindow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
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
        if (getDisableAutomatedBackup() != null)
            sb.append("DisableAutomatedBackup: ").append(getDisableAutomatedBackup()).append(",");
        if (getBackupRetentionCount() != null)
            sb.append("BackupRetentionCount: ").append(getBackupRetentionCount()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerRequest == false)
            return false;
        UpdateServerRequest other = (UpdateServerRequest) obj;
        if (other.getDisableAutomatedBackup() == null ^ this.getDisableAutomatedBackup() == null)
            return false;
        if (other.getDisableAutomatedBackup() != null && other.getDisableAutomatedBackup().equals(this.getDisableAutomatedBackup()) == false)
            return false;
        if (other.getBackupRetentionCount() == null ^ this.getBackupRetentionCount() == null)
            return false;
        if (other.getBackupRetentionCount() != null && other.getBackupRetentionCount().equals(this.getBackupRetentionCount()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableAutomatedBackup() == null) ? 0 : getDisableAutomatedBackup().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionCount() == null) ? 0 : getBackupRetentionCount().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServerRequest clone() {
        return (UpdateServerRequest) super.clone();
    }

}
