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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <code>ModifyDBCluster</code> operation and contains changes that
 * will be applied during the next maintenance window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ClusterPendingModifiedValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterPendingModifiedValues implements Serializable, Cloneable {

    private PendingCloudwatchLogsExports pendingCloudwatchLogsExports;
    /**
     * <p>
     * The DBClusterIdentifier value for the DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The master credentials for the DB cluster.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * The database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The number of days for which automatic DB snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     * <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     */
    private Integer iops;

    /**
     * @param pendingCloudwatchLogsExports
     */

    public void setPendingCloudwatchLogsExports(PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        this.pendingCloudwatchLogsExports = pendingCloudwatchLogsExports;
    }

    /**
     * @return
     */

    public PendingCloudwatchLogsExports getPendingCloudwatchLogsExports() {
        return this.pendingCloudwatchLogsExports;
    }

    /**
     * @param pendingCloudwatchLogsExports
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withPendingCloudwatchLogsExports(PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        setPendingCloudwatchLogsExports(pendingCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DBClusterIdentifier value for the DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DBClusterIdentifier value for the DB cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DBClusterIdentifier value for the DB cluster.
     * </p>
     * 
     * @return The DBClusterIdentifier value for the DB cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DBClusterIdentifier value for the DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DBClusterIdentifier value for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The master credentials for the DB cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The master credentials for the DB cluster.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The master credentials for the DB cluster.
     * </p>
     * 
     * @return The master credentials for the DB cluster.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The master credentials for the DB cluster.
     * </p>
     * 
     * @param masterUserPassword
     *        The master credentials for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM)
     *        accounts to database accounts is enabled.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts is enabled.
     * </p>
     * 
     * @return A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM)
     *         accounts to database accounts is enabled.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM)
     *        accounts to database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts is enabled.
     * </p>
     * 
     * @return A value that indicates whether mapping of Amazon Web Services Identity and Access Management (IAM)
     *         accounts to database accounts is enabled.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @return The database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic DB snapshots are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @return The number of days for which automatic DB snapshots are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic DB snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     * <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     *        <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but
     *        instead automatically adjusts as needed.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     * <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     * 
     * @return The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     *         <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but
     *         instead automatically adjusts as needed.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     * <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but instead
     * automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size in gibibytes (GiB) for all database engines except Amazon Aurora. For Aurora,
     *        <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage size isn't fixed, but
     *        instead automatically adjusts as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param iops
     *        The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB
     *        clusters.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @return The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB
     *         clusters.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param iops
     *        The Provisioned IOPS (I/O operations per second) value. This setting is only for non-Aurora Multi-AZ DB
     *        clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingModifiedValues withIops(Integer iops) {
        setIops(iops);
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
        if (getPendingCloudwatchLogsExports() != null)
            sb.append("PendingCloudwatchLogsExports: ").append(getPendingCloudwatchLogsExports()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterPendingModifiedValues == false)
            return false;
        ClusterPendingModifiedValues other = (ClusterPendingModifiedValues) obj;
        if (other.getPendingCloudwatchLogsExports() == null ^ this.getPendingCloudwatchLogsExports() == null)
            return false;
        if (other.getPendingCloudwatchLogsExports() != null && other.getPendingCloudwatchLogsExports().equals(this.getPendingCloudwatchLogsExports()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPendingCloudwatchLogsExports() == null) ? 0 : getPendingCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public ClusterPendingModifiedValues clone() {
        try {
            return (ClusterPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
