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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRecoveryPointRestoreMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecoveryPointRestoreMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     * recovery point.
     * </p>
     */
    private java.util.Map<String, String> restoreMetadata;

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An ARN that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a backup vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An ARN that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryPointRestoreMetadataResult withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryPointRestoreMetadataResult withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     * recovery point.
     * </p>
     * 
     * @return A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore
     *         the recovery point.
     */

    public java.util.Map<String, String> getRestoreMetadata() {
        return restoreMetadata;
    }

    /**
     * <p>
     * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     * recovery point.
     * </p>
     * 
     * @param restoreMetadata
     *        A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     *        recovery point.
     */

    public void setRestoreMetadata(java.util.Map<String, String> restoreMetadata) {
        this.restoreMetadata = restoreMetadata;
    }

    /**
     * <p>
     * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     * recovery point.
     * </p>
     * 
     * @param restoreMetadata
     *        A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the
     *        recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryPointRestoreMetadataResult withRestoreMetadata(java.util.Map<String, String> restoreMetadata) {
        setRestoreMetadata(restoreMetadata);
        return this;
    }

    public GetRecoveryPointRestoreMetadataResult addRestoreMetadataEntry(String key, String value) {
        if (null == this.restoreMetadata) {
            this.restoreMetadata = new java.util.HashMap<String, String>();
        }
        if (this.restoreMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.restoreMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RestoreMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryPointRestoreMetadataResult clearRestoreMetadataEntries() {
        this.restoreMetadata = null;
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
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: ").append(getBackupVaultArn()).append(",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getRestoreMetadata() != null)
            sb.append("RestoreMetadata: ").append(getRestoreMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecoveryPointRestoreMetadataResult == false)
            return false;
        GetRecoveryPointRestoreMetadataResult other = (GetRecoveryPointRestoreMetadataResult) obj;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getRestoreMetadata() == null ^ this.getRestoreMetadata() == null)
            return false;
        if (other.getRestoreMetadata() != null && other.getRestoreMetadata().equals(this.getRestoreMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreMetadata() == null) ? 0 : getRestoreMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetRecoveryPointRestoreMetadataResult clone() {
        try {
            return (GetRecoveryPointRestoreMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
