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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Backup backup vault. In Backup, a backup vault is a container that stores and organizes
 * your backups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupVaultDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupVaultDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your backups from
     * services that support full Backup management. If you do not specify a key, Backup creates an KMS key for you by
     * default.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The Amazon SNS event notifications for the specified backup vault.
     * </p>
     */
    private AwsBackupBackupVaultNotificationsDetails notifications;
    /**
     * <p>
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     * </p>
     */
    private String accessPolicy;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultDetails withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *         they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultDetails withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your backups from
     * services that support full Backup management. If you do not specify a key, Backup creates an KMS key for you by
     * default.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your
     *        backups from services that support full Backup management. If you do not specify a key, Backup creates an
     *        KMS key for you by default.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your backups from
     * services that support full Backup management. If you do not specify a key, Backup creates an KMS key for you by
     * default.
     * </p>
     * 
     * @return The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your
     *         backups from services that support full Backup management. If you do not specify a key, Backup creates an
     *         KMS key for you by default.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your backups from
     * services that support full Backup management. If you do not specify a key, Backup creates an KMS key for you by
     * default.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The unique ARN associated with the server-side encryption key. You can specify a key to encrypt your
     *        backups from services that support full Backup management. If you do not specify a key, Backup creates an
     *        KMS key for you by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultDetails withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS event notifications for the specified backup vault.
     * </p>
     * 
     * @param notifications
     *        The Amazon SNS event notifications for the specified backup vault.
     */

    public void setNotifications(AwsBackupBackupVaultNotificationsDetails notifications) {
        this.notifications = notifications;
    }

    /**
     * <p>
     * The Amazon SNS event notifications for the specified backup vault.
     * </p>
     * 
     * @return The Amazon SNS event notifications for the specified backup vault.
     */

    public AwsBackupBackupVaultNotificationsDetails getNotifications() {
        return this.notifications;
    }

    /**
     * <p>
     * The Amazon SNS event notifications for the specified backup vault.
     * </p>
     * 
     * @param notifications
     *        The Amazon SNS event notifications for the specified backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultDetails withNotifications(AwsBackupBackupVaultNotificationsDetails notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     * </p>
     * 
     * @param accessPolicy
     *        A resource-based policy that is used to manage access permissions on the target backup vault.
     */

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    /**
     * <p>
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     * </p>
     * 
     * @return A resource-based policy that is used to manage access permissions on the target backup vault.
     */

    public String getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * <p>
     * A resource-based policy that is used to manage access permissions on the target backup vault.
     * </p>
     * 
     * @param accessPolicy
     *        A resource-based policy that is used to manage access permissions on the target backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultDetails withAccessPolicy(String accessPolicy) {
        setAccessPolicy(accessPolicy);
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
        if (getAccessPolicy() != null)
            sb.append("AccessPolicy: ").append(getAccessPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupVaultDetails == false)
            return false;
        AwsBackupBackupVaultDetails other = (AwsBackupBackupVaultDetails) obj;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null)
            return false;
        if (other.getAccessPolicy() != null && other.getAccessPolicy().equals(this.getAccessPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupVaultDetails clone() {
        try {
            return (AwsBackupBackupVaultDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupVaultDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
