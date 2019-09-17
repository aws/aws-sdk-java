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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateBackupPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackupPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     */
    private BackupPlanInput backupPlan;

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

    public UpdateBackupPlanRequest withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
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
     */

    public void setBackupPlan(BackupPlanInput backupPlan) {
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

    public BackupPlanInput getBackupPlan() {
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

    public UpdateBackupPlanRequest withBackupPlan(BackupPlanInput backupPlan) {
        setBackupPlan(backupPlan);
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getBackupPlan() != null)
            sb.append("BackupPlan: ").append(getBackupPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackupPlanRequest == false)
            return false;
        UpdateBackupPlanRequest other = (UpdateBackupPlanRequest) obj;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackupPlanRequest clone() {
        return (UpdateBackupPlanRequest) super.clone();
    }

}
