/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProtectedResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or an
     * Amazon RDS database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastBackupTime;
    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     */
    private String lastBackupVaultArn;
    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     */
    private String lastRecoveryPointArn;
    /**
     * <p>
     * This is the time in minutes the most recent restore job took to complete.
     * </p>
     */
    private Long latestRestoreExecutionTimeMinutes;
    /**
     * <p>
     * This is the creation date of the most recent restore job.
     * </p>
     */
    private java.util.Date latestRestoreJobCreationDate;
    /**
     * <p>
     * This is the date the most recent recovery point was created.
     * </p>
     */
    private java.util.Date latestRestoreRecoveryPointCreationDate;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @return An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or an
     * Amazon RDS database.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or
     *        an Amazon RDS database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or an
     * Amazon RDS database.
     * </p>
     * 
     * @return The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or
     *         an Amazon RDS database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or an
     * Amazon RDS database.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource saved as a recovery point; for example, an Amazon EBS volume or
     *        an Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastBackupTime(java.util.Date lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time
     *         (UTC). The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastBackupTime() {
        return this.lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLastBackupTime(java.util.Date lastBackupTime) {
        setLastBackupTime(lastBackupTime);
        return this;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @param resourceName
     *        This is the non-unique name of the resource that belongs to the specified backup.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @return This is the non-unique name of the resource that belongs to the specified backup.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * This is the non-unique name of the resource that belongs to the specified backup.
     * </p>
     * 
     * @param resourceName
     *        This is the non-unique name of the resource that belongs to the specified backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @param lastBackupVaultArn
     *        This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *        point.
     */

    public void setLastBackupVaultArn(String lastBackupVaultArn) {
        this.lastBackupVaultArn = lastBackupVaultArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @return This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *         point.
     */

    public String getLastBackupVaultArn() {
        return this.lastBackupVaultArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery point.
     * </p>
     * 
     * @param lastBackupVaultArn
     *        This is the ARN (Amazon Resource Name) of the backup vault that contains the most recent backup recovery
     *        point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLastBackupVaultArn(String lastBackupVaultArn) {
        setLastBackupVaultArn(lastBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @param lastRecoveryPointArn
     *        This is the ARN (Amazon Resource Name) of the most recent recovery point.
     */

    public void setLastRecoveryPointArn(String lastRecoveryPointArn) {
        this.lastRecoveryPointArn = lastRecoveryPointArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @return This is the ARN (Amazon Resource Name) of the most recent recovery point.
     */

    public String getLastRecoveryPointArn() {
        return this.lastRecoveryPointArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * </p>
     * 
     * @param lastRecoveryPointArn
     *        This is the ARN (Amazon Resource Name) of the most recent recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLastRecoveryPointArn(String lastRecoveryPointArn) {
        setLastRecoveryPointArn(lastRecoveryPointArn);
        return this;
    }

    /**
     * <p>
     * This is the time in minutes the most recent restore job took to complete.
     * </p>
     * 
     * @param latestRestoreExecutionTimeMinutes
     *        This is the time in minutes the most recent restore job took to complete.
     */

    public void setLatestRestoreExecutionTimeMinutes(Long latestRestoreExecutionTimeMinutes) {
        this.latestRestoreExecutionTimeMinutes = latestRestoreExecutionTimeMinutes;
    }

    /**
     * <p>
     * This is the time in minutes the most recent restore job took to complete.
     * </p>
     * 
     * @return This is the time in minutes the most recent restore job took to complete.
     */

    public Long getLatestRestoreExecutionTimeMinutes() {
        return this.latestRestoreExecutionTimeMinutes;
    }

    /**
     * <p>
     * This is the time in minutes the most recent restore job took to complete.
     * </p>
     * 
     * @param latestRestoreExecutionTimeMinutes
     *        This is the time in minutes the most recent restore job took to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLatestRestoreExecutionTimeMinutes(Long latestRestoreExecutionTimeMinutes) {
        setLatestRestoreExecutionTimeMinutes(latestRestoreExecutionTimeMinutes);
        return this;
    }

    /**
     * <p>
     * This is the creation date of the most recent restore job.
     * </p>
     * 
     * @param latestRestoreJobCreationDate
     *        This is the creation date of the most recent restore job.
     */

    public void setLatestRestoreJobCreationDate(java.util.Date latestRestoreJobCreationDate) {
        this.latestRestoreJobCreationDate = latestRestoreJobCreationDate;
    }

    /**
     * <p>
     * This is the creation date of the most recent restore job.
     * </p>
     * 
     * @return This is the creation date of the most recent restore job.
     */

    public java.util.Date getLatestRestoreJobCreationDate() {
        return this.latestRestoreJobCreationDate;
    }

    /**
     * <p>
     * This is the creation date of the most recent restore job.
     * </p>
     * 
     * @param latestRestoreJobCreationDate
     *        This is the creation date of the most recent restore job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLatestRestoreJobCreationDate(java.util.Date latestRestoreJobCreationDate) {
        setLatestRestoreJobCreationDate(latestRestoreJobCreationDate);
        return this;
    }

    /**
     * <p>
     * This is the date the most recent recovery point was created.
     * </p>
     * 
     * @param latestRestoreRecoveryPointCreationDate
     *        This is the date the most recent recovery point was created.
     */

    public void setLatestRestoreRecoveryPointCreationDate(java.util.Date latestRestoreRecoveryPointCreationDate) {
        this.latestRestoreRecoveryPointCreationDate = latestRestoreRecoveryPointCreationDate;
    }

    /**
     * <p>
     * This is the date the most recent recovery point was created.
     * </p>
     * 
     * @return This is the date the most recent recovery point was created.
     */

    public java.util.Date getLatestRestoreRecoveryPointCreationDate() {
        return this.latestRestoreRecoveryPointCreationDate;
    }

    /**
     * <p>
     * This is the date the most recent recovery point was created.
     * </p>
     * 
     * @param latestRestoreRecoveryPointCreationDate
     *        This is the date the most recent recovery point was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLatestRestoreRecoveryPointCreationDate(java.util.Date latestRestoreRecoveryPointCreationDate) {
        setLatestRestoreRecoveryPointCreationDate(latestRestoreRecoveryPointCreationDate);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLastBackupTime() != null)
            sb.append("LastBackupTime: ").append(getLastBackupTime()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getLastBackupVaultArn() != null)
            sb.append("LastBackupVaultArn: ").append(getLastBackupVaultArn()).append(",");
        if (getLastRecoveryPointArn() != null)
            sb.append("LastRecoveryPointArn: ").append(getLastRecoveryPointArn()).append(",");
        if (getLatestRestoreExecutionTimeMinutes() != null)
            sb.append("LatestRestoreExecutionTimeMinutes: ").append(getLatestRestoreExecutionTimeMinutes()).append(",");
        if (getLatestRestoreJobCreationDate() != null)
            sb.append("LatestRestoreJobCreationDate: ").append(getLatestRestoreJobCreationDate()).append(",");
        if (getLatestRestoreRecoveryPointCreationDate() != null)
            sb.append("LatestRestoreRecoveryPointCreationDate: ").append(getLatestRestoreRecoveryPointCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectedResourceResult == false)
            return false;
        DescribeProtectedResourceResult other = (DescribeProtectedResourceResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastBackupTime() == null ^ this.getLastBackupTime() == null)
            return false;
        if (other.getLastBackupTime() != null && other.getLastBackupTime().equals(this.getLastBackupTime()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getLastBackupVaultArn() == null ^ this.getLastBackupVaultArn() == null)
            return false;
        if (other.getLastBackupVaultArn() != null && other.getLastBackupVaultArn().equals(this.getLastBackupVaultArn()) == false)
            return false;
        if (other.getLastRecoveryPointArn() == null ^ this.getLastRecoveryPointArn() == null)
            return false;
        if (other.getLastRecoveryPointArn() != null && other.getLastRecoveryPointArn().equals(this.getLastRecoveryPointArn()) == false)
            return false;
        if (other.getLatestRestoreExecutionTimeMinutes() == null ^ this.getLatestRestoreExecutionTimeMinutes() == null)
            return false;
        if (other.getLatestRestoreExecutionTimeMinutes() != null
                && other.getLatestRestoreExecutionTimeMinutes().equals(this.getLatestRestoreExecutionTimeMinutes()) == false)
            return false;
        if (other.getLatestRestoreJobCreationDate() == null ^ this.getLatestRestoreJobCreationDate() == null)
            return false;
        if (other.getLatestRestoreJobCreationDate() != null && other.getLatestRestoreJobCreationDate().equals(this.getLatestRestoreJobCreationDate()) == false)
            return false;
        if (other.getLatestRestoreRecoveryPointCreationDate() == null ^ this.getLatestRestoreRecoveryPointCreationDate() == null)
            return false;
        if (other.getLatestRestoreRecoveryPointCreationDate() != null
                && other.getLatestRestoreRecoveryPointCreationDate().equals(this.getLatestRestoreRecoveryPointCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLastBackupTime() == null) ? 0 : getLastBackupTime().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getLastBackupVaultArn() == null) ? 0 : getLastBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getLastRecoveryPointArn() == null) ? 0 : getLastRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getLatestRestoreExecutionTimeMinutes() == null) ? 0 : getLatestRestoreExecutionTimeMinutes().hashCode());
        hashCode = prime * hashCode + ((getLatestRestoreJobCreationDate() == null) ? 0 : getLatestRestoreJobCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLatestRestoreRecoveryPointCreationDate() == null) ? 0 : getLatestRestoreRecoveryPointCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProtectedResourceResult clone() {
        try {
            return (DescribeProtectedResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
