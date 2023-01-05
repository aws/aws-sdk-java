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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A legal hold is an administrative tool that helps prevent backups from being deleted while under a hold. While the
 * hold is in place, backups under a hold cannot be deleted and lifecycle policies that would alter the backup status
 * (such as transition to cold storage) are delayed until the legal hold is removed. A backup can have more than one
 * legal hold. Legal holds are applied to one or more backups (also known as recovery points). These backups can be
 * filtered by resource types and by resource IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/LegalHold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LegalHold implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the title of a legal hold.
     * </p>
     */
    private String title;
    /**
     * <p>
     * This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     * <code>CANCELED</code>, and <code>CANCELING</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * This is the description of a legal hold.
     * </p>
     */
    private String description;
    /**
     * <p>
     * ID of specific legal hold on one or more recovery points.
     * </p>
     */
    private String legalHoldId;
    /**
     * <p>
     * This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String legalHoldArn;
    /**
     * <p>
     * This is the time in number format when legal hold was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * This is the time in number format when legal hold was cancelled.
     * </p>
     */
    private java.util.Date cancellationDate;

    /**
     * <p>
     * This is the title of a legal hold.
     * </p>
     * 
     * @param title
     *        This is the title of a legal hold.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * This is the title of a legal hold.
     * </p>
     * 
     * @return This is the title of a legal hold.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * This is the title of a legal hold.
     * </p>
     * 
     * @param title
     *        This is the title of a legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     * <code>CANCELED</code>, and <code>CANCELING</code>.
     * </p>
     * 
     * @param status
     *        This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     *        <code>CANCELED</code>, and <code>CANCELING</code>.
     * @see LegalHoldStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     * <code>CANCELED</code>, and <code>CANCELING</code>.
     * </p>
     * 
     * @return This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     *         <code>CANCELED</code>, and <code>CANCELING</code>.
     * @see LegalHoldStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     * <code>CANCELED</code>, and <code>CANCELING</code>.
     * </p>
     * 
     * @param status
     *        This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     *        <code>CANCELED</code>, and <code>CANCELING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegalHoldStatus
     */

    public LegalHold withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     * <code>CANCELED</code>, and <code>CANCELING</code>.
     * </p>
     * 
     * @param status
     *        This is the status of the legal hold. Statuses can be <code>ACTIVE</code>, <code>CREATING</code>,
     *        <code>CANCELED</code>, and <code>CANCELING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegalHoldStatus
     */

    public LegalHold withStatus(LegalHoldStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * This is the description of a legal hold.
     * </p>
     * 
     * @param description
     *        This is the description of a legal hold.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * This is the description of a legal hold.
     * </p>
     * 
     * @return This is the description of a legal hold.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * This is the description of a legal hold.
     * </p>
     * 
     * @param description
     *        This is the description of a legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * ID of specific legal hold on one or more recovery points.
     * </p>
     * 
     * @param legalHoldId
     *        ID of specific legal hold on one or more recovery points.
     */

    public void setLegalHoldId(String legalHoldId) {
        this.legalHoldId = legalHoldId;
    }

    /**
     * <p>
     * ID of specific legal hold on one or more recovery points.
     * </p>
     * 
     * @return ID of specific legal hold on one or more recovery points.
     */

    public String getLegalHoldId() {
        return this.legalHoldId;
    }

    /**
     * <p>
     * ID of specific legal hold on one or more recovery points.
     * </p>
     * 
     * @param legalHoldId
     *        ID of specific legal hold on one or more recovery points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withLegalHoldId(String legalHoldId) {
        setLegalHoldId(legalHoldId);
        return this;
    }

    /**
     * <p>
     * This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param legalHoldArn
     *        This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setLegalHoldArn(String legalHoldArn) {
        this.legalHoldArn = legalHoldArn;
    }

    /**
     * <p>
     * This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getLegalHoldArn() {
        return this.legalHoldArn;
    }

    /**
     * <p>
     * This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param legalHoldArn
     *        This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withLegalHoldArn(String legalHoldArn) {
        setLegalHoldArn(legalHoldArn);
        return this;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was created.
     * </p>
     * 
     * @param creationDate
     *        This is the time in number format when legal hold was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was created.
     * </p>
     * 
     * @return This is the time in number format when legal hold was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was created.
     * </p>
     * 
     * @param creationDate
     *        This is the time in number format when legal hold was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was cancelled.
     * </p>
     * 
     * @param cancellationDate
     *        This is the time in number format when legal hold was cancelled.
     */

    public void setCancellationDate(java.util.Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was cancelled.
     * </p>
     * 
     * @return This is the time in number format when legal hold was cancelled.
     */

    public java.util.Date getCancellationDate() {
        return this.cancellationDate;
    }

    /**
     * <p>
     * This is the time in number format when legal hold was cancelled.
     * </p>
     * 
     * @param cancellationDate
     *        This is the time in number format when legal hold was cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalHold withCancellationDate(java.util.Date cancellationDate) {
        setCancellationDate(cancellationDate);
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
        if (getCancellationDate() != null)
            sb.append("CancellationDate: ").append(getCancellationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LegalHold == false)
            return false;
        LegalHold other = (LegalHold) obj;
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
        if (other.getCancellationDate() == null ^ this.getCancellationDate() == null)
            return false;
        if (other.getCancellationDate() != null && other.getCancellationDate().equals(this.getCancellationDate()) == false)
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
        hashCode = prime * hashCode + ((getCancellationDate() == null) ? 0 : getCancellationDate().hashCode());
        return hashCode;
    }

    @Override
    public LegalHold clone() {
        try {
            return (LegalHold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.LegalHoldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
