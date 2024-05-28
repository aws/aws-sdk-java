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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DICOMImportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMImportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The import job identifier.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The import job name.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The timestamp when an import job ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The timestamp when an import job was submitted.
     * </p>
     */
    private java.util.Date submittedAt;
    /**
     * <p>
     * The error message thrown if an import job fails.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The import job identifier.
     * </p>
     * 
     * @param jobId
     *        The import job identifier.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The import job identifier.
     * </p>
     * 
     * @return The import job identifier.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The import job identifier.
     * </p>
     * 
     * @param jobId
     *        The import job identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @param jobName
     *        The import job name.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @return The import job name.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @param jobName
     *        The import job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @return The filters for listing import jobs based on status.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DICOMImportJobSummary withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The filters for listing import jobs based on status.
     * </p>
     * 
     * @param jobStatus
     *        The filters for listing import jobs based on status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DICOMImportJobSummary withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that grants permissions to access medical imaging resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The timestamp when an import job ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp when an import job ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The timestamp when an import job ended.
     * </p>
     * 
     * @return The timestamp when an import job ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The timestamp when an import job ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp when an import job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when an import job was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp when an import job was submitted.
     */

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The timestamp when an import job was submitted.
     * </p>
     * 
     * @return The timestamp when an import job was submitted.
     */

    public java.util.Date getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * <p>
     * The timestamp when an import job was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp when an import job was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withSubmittedAt(java.util.Date submittedAt) {
        setSubmittedAt(submittedAt);
        return this;
    }

    /**
     * <p>
     * The error message thrown if an import job fails.
     * </p>
     * 
     * @param message
     *        The error message thrown if an import job fails.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message thrown if an import job fails.
     * </p>
     * 
     * @return The error message thrown if an import job fails.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message thrown if an import job fails.
     * </p>
     * 
     * @param message
     *        The error message thrown if an import job fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobSummary withMessage(String message) {
        setMessage(message);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getSubmittedAt() != null)
            sb.append("SubmittedAt: ").append(getSubmittedAt()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DICOMImportJobSummary == false)
            return false;
        DICOMImportJobSummary other = (DICOMImportJobSummary) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null)
            return false;
        if (other.getSubmittedAt() != null && other.getSubmittedAt().equals(this.getSubmittedAt()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DICOMImportJobSummary clone() {
        try {
            return (DICOMImportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.DICOMImportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
