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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultLockConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBackupVaultLockConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to retain
     * certain data for at least seven years (2555 days).
     * </p>
     * <p>
     * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     * minimum retention period, then the vault fails that backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The shortest minimum retention period you can specify is 1 day.
     * Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     */
    private Long minRetentionDays;
    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to destroy
     * certain data after retaining it for four years (1460 days).
     * </p>
     * <p>
     * If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery points
     * in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum retention
     * period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     * maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The longest maximum retention period you can specify is 36500 days
     * (approximately 100 years). Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     */
    private Long maxRetentionDays;
    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the number of days before the lock date. For example, setting
     * <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31, 2022 at 8pm
     * UTC.
     * </p>
     * <p>
     * Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable. Therefore, you
     * must set <code>ChangeableForDays</code> to 3 or greater.
     * </p>
     * <p>
     * Before the lock date, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable and
     * cannot be changed or deleted.
     * </p>
     * <p>
     * If this parameter is not specified, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code> at any time.
     * </p>
     */
    private Long changeableForDays;

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     * </p>
     * 
     * @param backupVaultName
     *        The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     * </p>
     * 
     * @return The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     * </p>
     * 
     * @param backupVaultName
     *        The Backup Vault Lock configuration that specifies the name of the backup vault it protects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultLockConfigurationRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to retain
     * certain data for at least seven years (2555 days).
     * </p>
     * <p>
     * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     * minimum retention period, then the vault fails that backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The shortest minimum retention period you can specify is 1 day.
     * Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param minRetentionDays
     *        The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     *        recovery points. This setting can be useful if, for example, your organization's policies require you to
     *        retain certain data for at least seven years (2555 days).</p>
     *        <p>
     *        If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     *        </p>
     *        <p>
     *        If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *        retention period equal to or longer than the minimum retention period. If the job's retention period is
     *        shorter than that minimum retention period, then the vault fails that backup or copy job, and you should
     *        either modify your lifecycle settings or use a different vault. The shortest minimum retention period you
     *        can specify is 1 day. Recovery points already saved in the vault prior to Vault Lock are not affected.
     */

    public void setMinRetentionDays(Long minRetentionDays) {
        this.minRetentionDays = minRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to retain
     * certain data for at least seven years (2555 days).
     * </p>
     * <p>
     * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     * minimum retention period, then the vault fails that backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The shortest minimum retention period you can specify is 1 day.
     * Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @return The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains
     *         its recovery points. This setting can be useful if, for example, your organization's policies require you
     *         to retain certain data for at least seven years (2555 days).</p>
     *         <p>
     *         If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     *         </p>
     *         <p>
     *         If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *         retention period equal to or longer than the minimum retention period. If the job's retention period is
     *         shorter than that minimum retention period, then the vault fails that backup or copy job, and you should
     *         either modify your lifecycle settings or use a different vault. The shortest minimum retention period you
     *         can specify is 1 day. Recovery points already saved in the vault prior to Vault Lock are not affected.
     */

    public Long getMinRetentionDays() {
        return this.minRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to retain
     * certain data for at least seven years (2555 days).
     * </p>
     * <p>
     * If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     * minimum retention period, then the vault fails that backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The shortest minimum retention period you can specify is 1 day.
     * Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param minRetentionDays
     *        The Backup Vault Lock configuration that specifies the minimum retention period that the vault retains its
     *        recovery points. This setting can be useful if, for example, your organization's policies require you to
     *        retain certain data for at least seven years (2555 days).</p>
     *        <p>
     *        If this parameter is not specified, Vault Lock will not enforce a minimum retention period.
     *        </p>
     *        <p>
     *        If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *        retention period equal to or longer than the minimum retention period. If the job's retention period is
     *        shorter than that minimum retention period, then the vault fails that backup or copy job, and you should
     *        either modify your lifecycle settings or use a different vault. The shortest minimum retention period you
     *        can specify is 1 day. Recovery points already saved in the vault prior to Vault Lock are not affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultLockConfigurationRequest withMinRetentionDays(Long minRetentionDays) {
        setMinRetentionDays(minRetentionDays);
        return this;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to destroy
     * certain data after retaining it for four years (1460 days).
     * </p>
     * <p>
     * If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery points
     * in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum retention
     * period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     * maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The longest maximum retention period you can specify is 36500 days
     * (approximately 100 years). Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param maxRetentionDays
     *        The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     *        recovery points. This setting can be useful if, for example, your organization's policies require you to
     *        destroy certain data after retaining it for four years (1460 days).</p>
     *        <p>
     *        If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery
     *        points in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum
     *        retention period.
     *        </p>
     *        <p>
     *        If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *        retention period equal to or shorter than the maximum retention period. If the job's retention period is
     *        longer than that maximum retention period, then the vault fails the backup or copy job, and you should
     *        either modify your lifecycle settings or use a different vault. The longest maximum retention period you
     *        can specify is 36500 days (approximately 100 years). Recovery points already saved in the vault prior to
     *        Vault Lock are not affected.
     */

    public void setMaxRetentionDays(Long maxRetentionDays) {
        this.maxRetentionDays = maxRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to destroy
     * certain data after retaining it for four years (1460 days).
     * </p>
     * <p>
     * If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery points
     * in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum retention
     * period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     * maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The longest maximum retention period you can specify is 36500 days
     * (approximately 100 years). Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @return The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains
     *         its recovery points. This setting can be useful if, for example, your organization's policies require you
     *         to destroy certain data after retaining it for four years (1460 days).</p>
     *         <p>
     *         If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery
     *         points in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum
     *         retention period.
     *         </p>
     *         <p>
     *         If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *         retention period equal to or shorter than the maximum retention period. If the job's retention period is
     *         longer than that maximum retention period, then the vault fails the backup or copy job, and you should
     *         either modify your lifecycle settings or use a different vault. The longest maximum retention period you
     *         can specify is 36500 days (approximately 100 years). Recovery points already saved in the vault prior to
     *         Vault Lock are not affected.
     */

    public Long getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     * recovery points. This setting can be useful if, for example, your organization's policies require you to destroy
     * certain data after retaining it for four years (1460 days).
     * </p>
     * <p>
     * If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery points
     * in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum retention
     * period.
     * </p>
     * <p>
     * If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a retention
     * period equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     * maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     * lifecycle settings or use a different vault. The longest maximum retention period you can specify is 36500 days
     * (approximately 100 years). Recovery points already saved in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param maxRetentionDays
     *        The Backup Vault Lock configuration that specifies the maximum retention period that the vault retains its
     *        recovery points. This setting can be useful if, for example, your organization's policies require you to
     *        destroy certain data after retaining it for four years (1460 days).</p>
     *        <p>
     *        If this parameter is not included, Vault Lock does not enforce a maximum retention period on the recovery
     *        points in the vault. If this parameter is included without a value, Vault Lock will not enforce a maximum
     *        retention period.
     *        </p>
     *        <p>
     *        If this parameter is specified, any backup or copy job to the vault must have a lifecycle policy with a
     *        retention period equal to or shorter than the maximum retention period. If the job's retention period is
     *        longer than that maximum retention period, then the vault fails the backup or copy job, and you should
     *        either modify your lifecycle settings or use a different vault. The longest maximum retention period you
     *        can specify is 36500 days (approximately 100 years). Recovery points already saved in the vault prior to
     *        Vault Lock are not affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultLockConfigurationRequest withMaxRetentionDays(Long maxRetentionDays) {
        setMaxRetentionDays(maxRetentionDays);
        return this;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the number of days before the lock date. For example, setting
     * <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31, 2022 at 8pm
     * UTC.
     * </p>
     * <p>
     * Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable. Therefore, you
     * must set <code>ChangeableForDays</code> to 3 or greater.
     * </p>
     * <p>
     * Before the lock date, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable and
     * cannot be changed or deleted.
     * </p>
     * <p>
     * If this parameter is not specified, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code> at any time.
     * </p>
     * 
     * @param changeableForDays
     *        The Backup Vault Lock configuration that specifies the number of days before the lock date. For example,
     *        setting <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31,
     *        2022 at 8pm UTC.</p>
     *        <p>
     *        Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable.
     *        Therefore, you must set <code>ChangeableForDays</code> to 3 or greater.
     *        </p>
     *        <p>
     *        Before the lock date, you can delete Vault Lock from the vault using
     *        <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *        <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable
     *        and cannot be changed or deleted.
     *        </p>
     *        <p>
     *        If this parameter is not specified, you can delete Vault Lock from the vault using
     *        <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *        <code>PutBackupVaultLockConfiguration</code> at any time.
     */

    public void setChangeableForDays(Long changeableForDays) {
        this.changeableForDays = changeableForDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the number of days before the lock date. For example, setting
     * <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31, 2022 at 8pm
     * UTC.
     * </p>
     * <p>
     * Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable. Therefore, you
     * must set <code>ChangeableForDays</code> to 3 or greater.
     * </p>
     * <p>
     * Before the lock date, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable and
     * cannot be changed or deleted.
     * </p>
     * <p>
     * If this parameter is not specified, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code> at any time.
     * </p>
     * 
     * @return The Backup Vault Lock configuration that specifies the number of days before the lock date. For example,
     *         setting <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan.
     *         31, 2022 at 8pm UTC.</p>
     *         <p>
     *         Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable.
     *         Therefore, you must set <code>ChangeableForDays</code> to 3 or greater.
     *         </p>
     *         <p>
     *         Before the lock date, you can delete Vault Lock from the vault using
     *         <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *         <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes
     *         immutable and cannot be changed or deleted.
     *         </p>
     *         <p>
     *         If this parameter is not specified, you can delete Vault Lock from the vault using
     *         <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *         <code>PutBackupVaultLockConfiguration</code> at any time.
     */

    public Long getChangeableForDays() {
        return this.changeableForDays;
    }

    /**
     * <p>
     * The Backup Vault Lock configuration that specifies the number of days before the lock date. For example, setting
     * <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31, 2022 at 8pm
     * UTC.
     * </p>
     * <p>
     * Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable. Therefore, you
     * must set <code>ChangeableForDays</code> to 3 or greater.
     * </p>
     * <p>
     * Before the lock date, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable and
     * cannot be changed or deleted.
     * </p>
     * <p>
     * If this parameter is not specified, you can delete Vault Lock from the vault using
     * <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     * <code>PutBackupVaultLockConfiguration</code> at any time.
     * </p>
     * 
     * @param changeableForDays
     *        The Backup Vault Lock configuration that specifies the number of days before the lock date. For example,
     *        setting <code>ChangeableForDays</code> to 30 on Jan. 1, 2022 at 8pm UTC will set the lock date to Jan. 31,
     *        2022 at 8pm UTC.</p>
     *        <p>
     *        Backup enforces a 72-hour cooling-off period before Vault Lock takes effect and becomes immutable.
     *        Therefore, you must set <code>ChangeableForDays</code> to 3 or greater.
     *        </p>
     *        <p>
     *        Before the lock date, you can delete Vault Lock from the vault using
     *        <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *        <code>PutBackupVaultLockConfiguration</code>. On and after the lock date, the Vault Lock becomes immutable
     *        and cannot be changed or deleted.
     *        </p>
     *        <p>
     *        If this parameter is not specified, you can delete Vault Lock from the vault using
     *        <code>DeleteBackupVaultLockConfiguration</code> or change the Vault Lock configuration using
     *        <code>PutBackupVaultLockConfiguration</code> at any time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultLockConfigurationRequest withChangeableForDays(Long changeableForDays) {
        setChangeableForDays(changeableForDays);
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getMinRetentionDays() != null)
            sb.append("MinRetentionDays: ").append(getMinRetentionDays()).append(",");
        if (getMaxRetentionDays() != null)
            sb.append("MaxRetentionDays: ").append(getMaxRetentionDays()).append(",");
        if (getChangeableForDays() != null)
            sb.append("ChangeableForDays: ").append(getChangeableForDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBackupVaultLockConfigurationRequest == false)
            return false;
        PutBackupVaultLockConfigurationRequest other = (PutBackupVaultLockConfigurationRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getMinRetentionDays() == null ^ this.getMinRetentionDays() == null)
            return false;
        if (other.getMinRetentionDays() != null && other.getMinRetentionDays().equals(this.getMinRetentionDays()) == false)
            return false;
        if (other.getMaxRetentionDays() == null ^ this.getMaxRetentionDays() == null)
            return false;
        if (other.getMaxRetentionDays() != null && other.getMaxRetentionDays().equals(this.getMaxRetentionDays()) == false)
            return false;
        if (other.getChangeableForDays() == null ^ this.getChangeableForDays() == null)
            return false;
        if (other.getChangeableForDays() != null && other.getChangeableForDays().equals(this.getChangeableForDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getMinRetentionDays() == null) ? 0 : getMinRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getMaxRetentionDays() == null) ? 0 : getMaxRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getChangeableForDays() == null) ? 0 : getChangeableForDays().hashCode());
        return hashCode;
    }

    @Override
    public PutBackupVaultLockConfigurationRequest clone() {
        return (PutBackupVaultLockConfigurationRequest) super.clone();
    }

}
