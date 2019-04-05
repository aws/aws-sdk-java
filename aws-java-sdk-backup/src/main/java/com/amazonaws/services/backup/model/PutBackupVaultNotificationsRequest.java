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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultNotifications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBackupVaultNotificationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     */
    private String sNSTopicArn;
    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     */
    private java.util.List<String> backupVaultEvents;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the AWS Region where they are created. They consist of
     *         lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultNotificationsRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     * 
     * @param sNSTopicArn
     *        The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     *        <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     */

    public void setSNSTopicArn(String sNSTopicArn) {
        this.sNSTopicArn = sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     *         <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     */

    public String getSNSTopicArn() {
        return this.sNSTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     * <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * </p>
     * 
     * @param sNSTopicArn
     *        The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example,
     *        <code>arn:aws:sns:us-west-2:111122223333:MyVaultTopic</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupVaultNotificationsRequest withSNSTopicArn(String sNSTopicArn) {
        setSNSTopicArn(sNSTopicArn);
        return this;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     * 
     * @return An array of events that indicate the status of jobs to back up resources to the backup vault.
     * @see BackupVaultEvent
     */

    public java.util.List<String> getBackupVaultEvents() {
        return backupVaultEvents;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault.
     * @see BackupVaultEvent
     */

    public void setBackupVaultEvents(java.util.Collection<String> backupVaultEvents) {
        if (backupVaultEvents == null) {
            this.backupVaultEvents = null;
            return;
        }

        this.backupVaultEvents = new java.util.ArrayList<String>(backupVaultEvents);
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupVaultEvents(java.util.Collection)} or {@link #withBackupVaultEvents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupVaultEvent
     */

    public PutBackupVaultNotificationsRequest withBackupVaultEvents(String... backupVaultEvents) {
        if (this.backupVaultEvents == null) {
            setBackupVaultEvents(new java.util.ArrayList<String>(backupVaultEvents.length));
        }
        for (String ele : backupVaultEvents) {
            this.backupVaultEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupVaultEvent
     */

    public PutBackupVaultNotificationsRequest withBackupVaultEvents(java.util.Collection<String> backupVaultEvents) {
        setBackupVaultEvents(backupVaultEvents);
        return this;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault.
     * </p>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupVaultEvent
     */

    public PutBackupVaultNotificationsRequest withBackupVaultEvents(BackupVaultEvent... backupVaultEvents) {
        java.util.ArrayList<String> backupVaultEventsCopy = new java.util.ArrayList<String>(backupVaultEvents.length);
        for (BackupVaultEvent value : backupVaultEvents) {
            backupVaultEventsCopy.add(value.toString());
        }
        if (getBackupVaultEvents() == null) {
            setBackupVaultEvents(backupVaultEventsCopy);
        } else {
            getBackupVaultEvents().addAll(backupVaultEventsCopy);
        }
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
        if (getSNSTopicArn() != null)
            sb.append("SNSTopicArn: ").append(getSNSTopicArn()).append(",");
        if (getBackupVaultEvents() != null)
            sb.append("BackupVaultEvents: ").append(getBackupVaultEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBackupVaultNotificationsRequest == false)
            return false;
        PutBackupVaultNotificationsRequest other = (PutBackupVaultNotificationsRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getSNSTopicArn() == null ^ this.getSNSTopicArn() == null)
            return false;
        if (other.getSNSTopicArn() != null && other.getSNSTopicArn().equals(this.getSNSTopicArn()) == false)
            return false;
        if (other.getBackupVaultEvents() == null ^ this.getBackupVaultEvents() == null)
            return false;
        if (other.getBackupVaultEvents() != null && other.getBackupVaultEvents().equals(this.getBackupVaultEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getSNSTopicArn() == null) ? 0 : getSNSTopicArn().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultEvents() == null) ? 0 : getBackupVaultEvents().hashCode());
        return hashCode;
    }

    @Override
    public PutBackupVaultNotificationsRequest clone() {
        return (PutBackupVaultNotificationsRequest) super.clone();
    }

}
