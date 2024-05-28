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
 * Properties of the import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DICOMImportJobProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMImportJobProperties implements Serializable, Cloneable, StructuredPojo {

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
     * The timestamp for when the import job was ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The timestamp for when the import job was submitted.
     * </p>
     */
    private java.util.Date submittedAt;
    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     * </p>
     */
    private String inputS3Uri;
    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     */
    private String outputS3Uri;
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

    public DICOMImportJobProperties withJobId(String jobId) {
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

    public DICOMImportJobProperties withJobName(String jobName) {
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

    public DICOMImportJobProperties withJobStatus(String jobStatus) {
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

    public DICOMImportJobProperties withJobStatus(JobStatus jobStatus) {
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

    public DICOMImportJobProperties withDatastoreId(String datastoreId) {
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

    public DICOMImportJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the import job was ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp for when the import job was ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The timestamp for when the import job was ended.
     * </p>
     * 
     * @return The timestamp for when the import job was ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The timestamp for when the import job was ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp for when the import job was ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobProperties withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the import job was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp for when the import job was submitted.
     */

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The timestamp for when the import job was submitted.
     * </p>
     * 
     * @return The timestamp for when the import job was submitted.
     */

    public java.util.Date getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * <p>
     * The timestamp for when the import job was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp for when the import job was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobProperties withSubmittedAt(java.util.Date submittedAt) {
        setSubmittedAt(submittedAt);
        return this;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     * </p>
     * 
     * @param inputS3Uri
     *        The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     */

    public void setInputS3Uri(String inputS3Uri) {
        this.inputS3Uri = inputS3Uri;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     * </p>
     * 
     * @return The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     */

    public String getInputS3Uri() {
        return this.inputS3Uri;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     * </p>
     * 
     * @param inputS3Uri
     *        The input prefix path for the S3 bucket that contains the DICOM P10 files to be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobProperties withInputS3Uri(String inputS3Uri) {
        setInputS3Uri(inputS3Uri);
        return this;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @param outputS3Uri
     *        The output prefix of the S3 bucket to upload the results of the DICOM import job.
     */

    public void setOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @return The output prefix of the S3 bucket to upload the results of the DICOM import job.
     */

    public String getOutputS3Uri() {
        return this.outputS3Uri;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @param outputS3Uri
     *        The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMImportJobProperties withOutputS3Uri(String outputS3Uri) {
        setOutputS3Uri(outputS3Uri);
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

    public DICOMImportJobProperties withMessage(String message) {
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
        if (getInputS3Uri() != null)
            sb.append("InputS3Uri: ").append(getInputS3Uri()).append(",");
        if (getOutputS3Uri() != null)
            sb.append("OutputS3Uri: ").append(getOutputS3Uri()).append(",");
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

        if (obj instanceof DICOMImportJobProperties == false)
            return false;
        DICOMImportJobProperties other = (DICOMImportJobProperties) obj;
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
        if (other.getInputS3Uri() == null ^ this.getInputS3Uri() == null)
            return false;
        if (other.getInputS3Uri() != null && other.getInputS3Uri().equals(this.getInputS3Uri()) == false)
            return false;
        if (other.getOutputS3Uri() == null ^ this.getOutputS3Uri() == null)
            return false;
        if (other.getOutputS3Uri() != null && other.getOutputS3Uri().equals(this.getOutputS3Uri()) == false)
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
        hashCode = prime * hashCode + ((getInputS3Uri() == null) ? 0 : getInputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Uri() == null) ? 0 : getOutputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DICOMImportJobProperties clone() {
        try {
            return (DICOMImportJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.DICOMImportJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
