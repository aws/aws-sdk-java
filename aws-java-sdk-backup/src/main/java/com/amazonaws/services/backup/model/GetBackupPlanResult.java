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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackupPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     */
    private BackupPlan backupPlan;
    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     */
    private String backupPlanArn;
    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot
     * be edited.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date deletionDate;
    /**
     * <p>
     * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastExecutionDate;

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     * 
     * @param backupPlan
     *        Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     *        <code>Rules</code>.
     */

    public void setBackupPlan(BackupPlan backupPlan) {
        this.backupPlan = backupPlan;
    }

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     * 
     * @return Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     *         <code>Rules</code>.
     */

    public BackupPlan getBackupPlan() {
        return this.backupPlan;
    }

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     * 
     * @param backupPlan
     *        Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     *        <code>Rules</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withBackupPlan(BackupPlan backupPlan) {
        setBackupPlan(backupPlan);
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies a backup plan.
     */

    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @return Uniquely identifies a backup plan.
     */

    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * 
     * @param backupPlanId
     *        Uniquely identifies a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     */

    public void setBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     */

    public String getBackupPlanArn() {
        return this.backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * </p>
     * 
     * @param backupPlanArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withBackupPlanArn(String backupPlanArn) {
        setBackupPlanArn(backupPlanArn);
        return this;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot
     * be edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs
     *        cannot be edited.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot
     * be edited.
     * </p>
     * 
     * @return Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs
     *         cannot be edited.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot
     * be edited.
     * </p>
     * 
     * @param versionId
     *        Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs
     *        cannot be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        executing the operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @return A unique string that identifies the request and allows failed requests to be retried without the risk of
     *         executing the operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of
     * executing the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        executing the operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param deletionDate
     *        The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param deletionDate
     *        The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withDeletionDate(java.util.Date deletionDate) {
        setDeletionDate(deletionDate);
        return this;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastExecutionDate
     *        The last time a job to back up resources was executed with this backup plan. A date and time, in Unix
     *        format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The last time a job to back up resources was executed with this backup plan. A date and time, in Unix
     *         format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *         milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastExecutionDate() {
        return this.lastExecutionDate;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastExecutionDate
     *        The last time a job to back up resources was executed with this backup plan. A date and time, in Unix
     *        format and Coordinated Universal Time (UTC). The value of <code>LastExecutionDate</code> is accurate to
     *        milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanResult withLastExecutionDate(java.util.Date lastExecutionDate) {
        setLastExecutionDate(lastExecutionDate);
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
        if (getBackupPlan() != null)
            sb.append("BackupPlan: ").append(getBackupPlan()).append(",");
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getBackupPlanArn() != null)
            sb.append("BackupPlanArn: ").append(getBackupPlanArn()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: ").append(getDeletionDate()).append(",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: ").append(getLastExecutionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanResult == false)
            return false;
        GetBackupPlanResult other = (GetBackupPlanResult) obj;
        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupPlanArn() == null ^ this.getBackupPlanArn() == null)
            return false;
        if (other.getBackupPlanArn() != null && other.getBackupPlanArn().equals(this.getBackupPlanArn()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanArn() == null) ? 0 : getBackupPlanArn().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        return hashCode;
    }

    @Override
    public GetBackupPlanResult clone() {
        try {
            return (GetBackupPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
