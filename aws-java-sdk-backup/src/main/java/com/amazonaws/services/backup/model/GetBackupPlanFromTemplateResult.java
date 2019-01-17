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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackupPlanFromTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of
     * the plan.
     * </p>
     */
    private BackupPlan backupPlanDocument;

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of
     * the plan.
     * </p>
     * 
     * @param backupPlanDocument
     *        Returns the body of a backup plan based on the target template, including the name, rules, and backup
     *        vault of the plan.
     */

    public void setBackupPlanDocument(BackupPlan backupPlanDocument) {
        this.backupPlanDocument = backupPlanDocument;
    }

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of
     * the plan.
     * </p>
     * 
     * @return Returns the body of a backup plan based on the target template, including the name, rules, and backup
     *         vault of the plan.
     */

    public BackupPlan getBackupPlanDocument() {
        return this.backupPlanDocument;
    }

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of
     * the plan.
     * </p>
     * 
     * @param backupPlanDocument
     *        Returns the body of a backup plan based on the target template, including the name, rules, and backup
     *        vault of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupPlanFromTemplateResult withBackupPlanDocument(BackupPlan backupPlanDocument) {
        setBackupPlanDocument(backupPlanDocument);
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
        if (getBackupPlanDocument() != null)
            sb.append("BackupPlanDocument: ").append(getBackupPlanDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanFromTemplateResult == false)
            return false;
        GetBackupPlanFromTemplateResult other = (GetBackupPlanFromTemplateResult) obj;
        if (other.getBackupPlanDocument() == null ^ this.getBackupPlanDocument() == null)
            return false;
        if (other.getBackupPlanDocument() != null && other.getBackupPlanDocument().equals(this.getBackupPlanDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanDocument() == null) ? 0 : getBackupPlanDocument().hashCode());
        return hashCode;
    }

    @Override
    public GetBackupPlanFromTemplateResult clone() {
        try {
            return (GetBackupPlanFromTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
