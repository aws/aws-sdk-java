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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateLegalHold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLegalHoldResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This is the string title of the legal hold returned after creating the legal hold.
     * </p>
     */
    private String title;
    /**
     * <p>
     * This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     * <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * This is the returned string description of the legal hold.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Legal hold ID returned for the specified legal hold on a recovery point.
     * </p>
     */
    private String legalHoldId;
    /**
     * <p>
     * This is the ARN (Amazon Resource Number) of the created legal hold.
     * </p>
     */
    private String legalHoldArn;
    /**
     * <p>
     * Time in number format when legal hold was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     */
    private RecoveryPointSelection recoveryPointSelection;

    /**
     * <p>
     * This is the string title of the legal hold returned after creating the legal hold.
     * </p>
     * 
     * @param title
     *        This is the string title of the legal hold returned after creating the legal hold.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * This is the string title of the legal hold returned after creating the legal hold.
     * </p>
     * 
     * @return This is the string title of the legal hold returned after creating the legal hold.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * This is the string title of the legal hold returned after creating the legal hold.
     * </p>
     * 
     * @param title
     *        This is the string title of the legal hold returned after creating the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     * <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     *        <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or
     *        <code>FAILED</code>.
     * @see LegalHoldStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     * <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @return This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     *         <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or
     *         <code>FAILED</code>.
     * @see LegalHoldStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     * <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     *        <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegalHoldStatus
     */

    public CreateLegalHoldResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     * <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        This displays the status of the legal hold returned after creating the legal hold. Statuses can be
     *        <code>ACTIVE</code>, <code>PENDING</code>, <code>CANCELED</code>, <code>CANCELING</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegalHoldStatus
     */

    public CreateLegalHoldResult withStatus(LegalHoldStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * This is the returned string description of the legal hold.
     * </p>
     * 
     * @param description
     *        This is the returned string description of the legal hold.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * This is the returned string description of the legal hold.
     * </p>
     * 
     * @return This is the returned string description of the legal hold.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * This is the returned string description of the legal hold.
     * </p>
     * 
     * @param description
     *        This is the returned string description of the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Legal hold ID returned for the specified legal hold on a recovery point.
     * </p>
     * 
     * @param legalHoldId
     *        Legal hold ID returned for the specified legal hold on a recovery point.
     */

    public void setLegalHoldId(String legalHoldId) {
        this.legalHoldId = legalHoldId;
    }

    /**
     * <p>
     * Legal hold ID returned for the specified legal hold on a recovery point.
     * </p>
     * 
     * @return Legal hold ID returned for the specified legal hold on a recovery point.
     */

    public String getLegalHoldId() {
        return this.legalHoldId;
    }

    /**
     * <p>
     * Legal hold ID returned for the specified legal hold on a recovery point.
     * </p>
     * 
     * @param legalHoldId
     *        Legal hold ID returned for the specified legal hold on a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withLegalHoldId(String legalHoldId) {
        setLegalHoldId(legalHoldId);
        return this;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Number) of the created legal hold.
     * </p>
     * 
     * @param legalHoldArn
     *        This is the ARN (Amazon Resource Number) of the created legal hold.
     */

    public void setLegalHoldArn(String legalHoldArn) {
        this.legalHoldArn = legalHoldArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Number) of the created legal hold.
     * </p>
     * 
     * @return This is the ARN (Amazon Resource Number) of the created legal hold.
     */

    public String getLegalHoldArn() {
        return this.legalHoldArn;
    }

    /**
     * <p>
     * This is the ARN (Amazon Resource Number) of the created legal hold.
     * </p>
     * 
     * @param legalHoldArn
     *        This is the ARN (Amazon Resource Number) of the created legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withLegalHoldArn(String legalHoldArn) {
        setLegalHoldArn(legalHoldArn);
        return this;
    }

    /**
     * <p>
     * Time in number format when legal hold was created.
     * </p>
     * 
     * @param creationDate
     *        Time in number format when legal hold was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Time in number format when legal hold was created.
     * </p>
     * 
     * @return Time in number format when legal hold was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * Time in number format when legal hold was created.
     * </p>
     * 
     * @param creationDate
     *        Time in number format when legal hold was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     */

    public void setRecoveryPointSelection(RecoveryPointSelection recoveryPointSelection) {
        this.recoveryPointSelection = recoveryPointSelection;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @return This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     */

    public RecoveryPointSelection getRecoveryPointSelection() {
        return this.recoveryPointSelection;
    }

    /**
     * <p>
     * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * </p>
     * 
     * @param recoveryPointSelection
     *        This specifies criteria to assign a set of resources, such as resource types or backup vaults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLegalHoldResult withRecoveryPointSelection(RecoveryPointSelection recoveryPointSelection) {
        setRecoveryPointSelection(recoveryPointSelection);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLegalHoldId() != null)
            sb.append("LegalHoldId: ").append(getLegalHoldId()).append(",");
        if (getLegalHoldArn() != null)
            sb.append("LegalHoldArn: ").append(getLegalHoldArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getRecoveryPointSelection() != null)
            sb.append("RecoveryPointSelection: ").append(getRecoveryPointSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLegalHoldResult == false)
            return false;
        CreateLegalHoldResult other = (CreateLegalHoldResult) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLegalHoldId() == null ^ this.getLegalHoldId() == null)
            return false;
        if (other.getLegalHoldId() != null && other.getLegalHoldId().equals(this.getLegalHoldId()) == false)
            return false;
        if (other.getLegalHoldArn() == null ^ this.getLegalHoldArn() == null)
            return false;
        if (other.getLegalHoldArn() != null && other.getLegalHoldArn().equals(this.getLegalHoldArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getRecoveryPointSelection() == null ^ this.getRecoveryPointSelection() == null)
            return false;
        if (other.getRecoveryPointSelection() != null && other.getRecoveryPointSelection().equals(this.getRecoveryPointSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLegalHoldId() == null) ? 0 : getLegalHoldId().hashCode());
        hashCode = prime * hashCode + ((getLegalHoldArn() == null) ? 0 : getLegalHoldArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointSelection() == null) ? 0 : getRecoveryPointSelection().hashCode());
        return hashCode;
    }

    @Override
    public CreateLegalHoldResult clone() {
        try {
            return (CreateLegalHoldResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
