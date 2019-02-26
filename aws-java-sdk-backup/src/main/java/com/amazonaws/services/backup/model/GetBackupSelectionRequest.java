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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackupSelectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;
    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     */
    private String selectionId;

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

    public GetBackupSelectionRequest withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * 
     * @param selectionId
     *        Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     */

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * 
     * @return Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     */

    public String getSelectionId() {
        return this.selectionId;
    }

    /**
     * <p>
     * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     * </p>
     * 
     * @param selectionId
     *        Uniquely identifies the body of a request to assign a set of resources to a backup plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackupSelectionRequest withSelectionId(String selectionId) {
        setSelectionId(selectionId);
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
        if (getSelectionId() != null)
            sb.append("SelectionId: ").append(getSelectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupSelectionRequest == false)
            return false;
        GetBackupSelectionRequest other = (GetBackupSelectionRequest) obj;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getSelectionId() == null ^ this.getSelectionId() == null)
            return false;
        if (other.getSelectionId() != null && other.getSelectionId().equals(this.getSelectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getSelectionId() == null) ? 0 : getSelectionId().hashCode());
        return hashCode;
    }

    @Override
    public GetBackupSelectionRequest clone() {
        return (GetBackupSelectionRequest) super.clone();
    }

}
