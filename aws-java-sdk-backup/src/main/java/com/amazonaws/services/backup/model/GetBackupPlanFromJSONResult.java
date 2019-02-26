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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromJSON" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackupPlanFromJSONResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a <code>BackupPlanName</code> and one or more sets of
     * <code>Rules</code>.
     * </p>
     */
    private BackupPlan backupPlan;

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

    public GetBackupPlanFromJSONResult withBackupPlan(BackupPlan backupPlan) {
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

        if (obj instanceof GetBackupPlanFromJSONResult == false)
            return false;
        GetBackupPlanFromJSONResult other = (GetBackupPlanFromJSONResult) obj;
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

        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        return hashCode;
    }

    @Override
    public GetBackupPlanFromJSONResult clone() {
        try {
            return (GetBackupPlanFromJSONResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
