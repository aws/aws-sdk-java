/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about a journal export job, including the ledger name, export ID, when it was created, current
 * status, and its start and end time export parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/JournalS3ExportDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JournalS3ExportDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String ledgerName;
    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of
     * seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date exportCreationTime;
    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     */
    private java.util.Date inclusiveStartTime;
    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     */
    private java.util.Date exclusiveEndTime;

    private S3ExportConfiguration s3ExportConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * 
     * @param exportId
     *        The unique ID of the journal export job.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * 
     * @return The unique ID of the journal export job.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * 
     * @param exportId
     *        The unique ID of the journal export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of
     * seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param exportCreationTime
     *        The date and time, in epoch time format, when the export job was created. (Epoch time format is the number
     *        of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public void setExportCreationTime(java.util.Date exportCreationTime) {
        this.exportCreationTime = exportCreationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of
     * seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @return The date and time, in epoch time format, when the export job was created. (Epoch time format is the
     *         number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public java.util.Date getExportCreationTime() {
        return this.exportCreationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of
     * seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param exportCreationTime
     *        The date and time, in epoch time format, when the export job was created. (Epoch time format is the number
     *        of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withExportCreationTime(java.util.Date exportCreationTime) {
        setExportCreationTime(exportCreationTime);
        return this;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * 
     * @param status
     *        The current state of the journal export job.
     * @see ExportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * 
     * @return The current state of the journal export job.
     * @see ExportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * 
     * @param status
     *        The current state of the journal export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public JournalS3ExportDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * 
     * @param status
     *        The current state of the journal export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public JournalS3ExportDescription withStatus(ExportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time for the range of journal contents that are specified in the original
     *        export request.
     */

    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @return The inclusive start date and time for the range of journal contents that are specified in the original
     *         export request.
     */

    public java.util.Date getInclusiveStartTime() {
        return this.inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @param inclusiveStartTime
     *        The inclusive start date and time for the range of journal contents that are specified in the original
     *        export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        setInclusiveStartTime(inclusiveStartTime);
        return this;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive end date and time for the range of journal contents that are specified in the original
     *        export request.
     */

    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @return The exclusive end date and time for the range of journal contents that are specified in the original
     *         export request.
     */

    public java.util.Date getExclusiveEndTime() {
        return this.exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that are specified in the original export
     * request.
     * </p>
     * 
     * @param exclusiveEndTime
     *        The exclusive end date and time for the range of journal contents that are specified in the original
     *        export request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        setExclusiveEndTime(exclusiveEndTime);
        return this;
    }

    /**
     * @param s3ExportConfiguration
     */

    public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
    }

    /**
     * @return
     */

    public S3ExportConfiguration getS3ExportConfiguration() {
        return this.s3ExportConfiguration;
    }

    /**
     * @param s3ExportConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        setS3ExportConfiguration(s3ExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *        encryption of your exported data.
     *        </p>
     *        </li>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to
     *         do the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *         encryption of your exported data.
     *         </p>
     *         </li>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption
     * of your exported data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side
     *        encryption of your exported data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JournalS3ExportDescription withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName()).append(",");
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
        if (getExportCreationTime() != null)
            sb.append("ExportCreationTime: ").append(getExportCreationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: ").append(getInclusiveStartTime()).append(",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: ").append(getExclusiveEndTime()).append(",");
        if (getS3ExportConfiguration() != null)
            sb.append("S3ExportConfiguration: ").append(getS3ExportConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JournalS3ExportDescription == false)
            return false;
        JournalS3ExportDescription other = (JournalS3ExportDescription) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getExportCreationTime() == null ^ this.getExportCreationTime() == null)
            return false;
        if (other.getExportCreationTime() != null && other.getExportCreationTime().equals(this.getExportCreationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getS3ExportConfiguration() == null ^ this.getS3ExportConfiguration() == null)
            return false;
        if (other.getS3ExportConfiguration() != null && other.getS3ExportConfiguration().equals(this.getS3ExportConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getExportCreationTime() == null) ? 0 : getExportCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime * hashCode + ((getS3ExportConfiguration() == null) ? 0 : getS3ExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public JournalS3ExportDescription clone() {
        try {
            return (JournalS3ExportDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.JournalS3ExportDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
