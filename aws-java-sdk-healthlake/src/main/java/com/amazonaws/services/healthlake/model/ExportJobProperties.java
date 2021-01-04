/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a FHIR export job, including the ID, ARN, name, and the status of the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ExportJobProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS generated ID for an export job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The time an export job was initiated.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time an export job completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     */
    private OutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * An explanation of any errors that may have occurred during the export job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The AWS generated ID for an export job.
     * </p>
     * 
     * @param jobId
     *        The AWS generated ID for an export job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The AWS generated ID for an export job.
     * </p>
     * 
     * @return The AWS generated ID for an export job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The AWS generated ID for an export job.
     * </p>
     * 
     * @param jobId
     *        The AWS generated ID for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @param jobName
     *        The user generated name for an export job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @return The user generated name for an export job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The user generated name for an export job.
     * </p>
     * 
     * @param jobName
     *        The user generated name for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @return The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The status of a FHIR export job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ExportJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time an export job was initiated.
     * </p>
     * 
     * @param submitTime
     *        The time an export job was initiated.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time an export job was initiated.
     * </p>
     * 
     * @return The time an export job was initiated.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time an export job was initiated.
     * </p>
     * 
     * @param submitTime
     *        The time an export job was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time an export job completed.
     * </p>
     * 
     * @param endTime
     *        The time an export job completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time an export job completed.
     * </p>
     * 
     * @return The time an export job completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time an export job completed.
     * </p>
     * 
     * @param endTime
     *        The time an export job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @param datastoreId
     *        The AWS generated ID for the Data Store from which files are being exported for an export job.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @return The AWS generated ID for the Data Store from which files are being exported for an export job.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS generated ID for the Data Store from which files are being exported for an export job.
     * </p>
     * 
     * @param datastoreId
     *        The AWS generated ID for the Data Store from which files are being exported for an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that was supplied when the export job was created.
     */

    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @return The output data configuration that was supplied when the export job was created.
     */

    public OutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * The output data configuration that was supplied when the export job was created.
     * </p>
     * 
     * @param outputDataConfig
     *        The output data configuration that was supplied when the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withOutputDataConfig(OutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name used during the initiation of the job.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @return The Amazon Resource Name used during the initiation of the job.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name used during the initiation of the job.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name used during the initiation of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the export job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occurred during the export job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the export job.
     * </p>
     * 
     * @return An explanation of any errors that may have occurred during the export job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the export job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occurred during the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJobProperties withMessage(String message) {
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
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
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

        if (obj instanceof ExportJobProperties == false)
            return false;
        ExportJobProperties other = (ExportJobProperties) obj;
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
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ExportJobProperties clone() {
        try {
            return (ExportJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.ExportJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
