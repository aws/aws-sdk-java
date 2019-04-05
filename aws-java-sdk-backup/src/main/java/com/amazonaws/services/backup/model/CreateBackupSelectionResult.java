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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackupSelectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     */
    private String backupPlanId;
    /**
     * <p>
     * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

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

    public CreateBackupSelectionResult withSelectionId(String selectionId) {
        setSelectionId(selectionId);
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

    public CreateBackupSelectionResult withBackupPlanId(String backupPlanId) {
        setBackupPlanId(backupPlanId);
        return this;
    }

    /**
     * <p>
     * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackupSelectionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getSelectionId() != null)
            sb.append("SelectionId: ").append(getSelectionId()).append(",");
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: ").append(getBackupPlanId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupSelectionResult == false)
            return false;
        CreateBackupSelectionResult other = (CreateBackupSelectionResult) obj;
        if (other.getSelectionId() == null ^ this.getSelectionId() == null)
            return false;
        if (other.getSelectionId() != null && other.getSelectionId().equals(this.getSelectionId()) == false)
            return false;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectionId() == null) ? 0 : getSelectionId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackupSelectionResult clone() {
        try {
            return (CreateBackupSelectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
