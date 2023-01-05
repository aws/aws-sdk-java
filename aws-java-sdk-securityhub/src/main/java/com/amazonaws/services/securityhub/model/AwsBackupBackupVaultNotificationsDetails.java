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
 * Provides details about the Amazon SNS event notifications for the specified backup vault.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupVaultNotificationsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupVaultNotificationsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault. The following
     * events are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> backupVaultEvents;
    /**
     * <p>
     * An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault. The following
     * events are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of events that indicate the status of jobs to back up resources to the backup vault. The
     *         following events are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getBackupVaultEvents() {
        return backupVaultEvents;
    }

    /**
     * <p>
     * An array of events that indicate the status of jobs to back up resources to the backup vault. The following
     * events are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault. The
     *        following events are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     *        </p>
     *        </li>
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
     * An array of events that indicate the status of jobs to back up resources to the backup vault. The following
     * events are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupVaultEvents(java.util.Collection)} or {@link #withBackupVaultEvents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault. The
     *        following events are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultNotificationsDetails withBackupVaultEvents(String... backupVaultEvents) {
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
     * An array of events that indicate the status of jobs to back up resources to the backup vault. The following
     * events are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupVaultEvents
     *        An array of events that indicate the status of jobs to back up resources to the backup vault. The
     *        following events are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BACKUP_JOB_STARTED | BACKUP_JOB_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COPY_JOB_STARTED | COPY_JOB_SUCCESSFUL | COPY_JOB_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESTORE_JOB_STARTED | RESTORE_JOB_COMPLETED | RECOVERY_POINT_MODIFIED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3_BACKUP_OBJECT_FAILED | S3_RESTORE_OBJECT_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultNotificationsDetails withBackupVaultEvents(java.util.Collection<String> backupVaultEvents) {
        setBackupVaultEvents(backupVaultEvents);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     * </p>
     * 
     * @param snsTopicArn
     *        An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     * </p>
     * 
     * @return An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     * </p>
     * 
     * @param snsTopicArn
     *        An ARN that uniquely identifies the Amazon SNS topic for a backup vault’s events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupVaultNotificationsDetails withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
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
        if (getBackupVaultEvents() != null)
            sb.append("BackupVaultEvents: ").append(getBackupVaultEvents()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupVaultNotificationsDetails == false)
            return false;
        AwsBackupBackupVaultNotificationsDetails other = (AwsBackupBackupVaultNotificationsDetails) obj;
        if (other.getBackupVaultEvents() == null ^ this.getBackupVaultEvents() == null)
            return false;
        if (other.getBackupVaultEvents() != null && other.getBackupVaultEvents().equals(this.getBackupVaultEvents()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultEvents() == null) ? 0 : getBackupVaultEvents().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupVaultNotificationsDetails clone() {
        try {
            return (AwsBackupBackupVaultNotificationsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupVaultNotificationsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
