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
 * Displays the properties of the import job, including the ID, Arn, Name, and the status of the Data Store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/ImportJobProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS-generated id number for the Import job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user-generated name for an Import job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The time that the Import job was submitted for processing.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The time that the Import job was completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The datastore id used when the Import job was created.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The input data configuration that was supplied when the Import job was created.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    private OutputDataConfig jobOutputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * An explanation of any errors that may have occurred during the FHIR import job.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The AWS-generated id number for the Import job.
     * </p>
     * 
     * @param jobId
     *        The AWS-generated id number for the Import job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The AWS-generated id number for the Import job.
     * </p>
     * 
     * @return The AWS-generated id number for the Import job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The AWS-generated id number for the Import job.
     * </p>
     * 
     * @param jobId
     *        The AWS-generated id number for the Import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user-generated name for an Import job.
     * </p>
     * 
     * @param jobName
     *        The user-generated name for an Import job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The user-generated name for an Import job.
     * </p>
     * 
     * @return The user-generated name for an Import job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The user-generated name for an Import job.
     * </p>
     * 
     * @param jobName
     *        The user-generated name for an Import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * </p>
     * 
     * @return The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobProperties withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * </p>
     * 
     * @param jobStatus
     *        The job status for an Import job. Possible statuses are SUBMITTED, IN_PROGRESS, COMPLETED, FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ImportJobProperties withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the Import job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the Import job was submitted for processing.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The time that the Import job was submitted for processing.
     * </p>
     * 
     * @return The time that the Import job was submitted for processing.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The time that the Import job was submitted for processing.
     * </p>
     * 
     * @param submitTime
     *        The time that the Import job was submitted for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The time that the Import job was completed.
     * </p>
     * 
     * @param endTime
     *        The time that the Import job was completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the Import job was completed.
     * </p>
     * 
     * @return The time that the Import job was completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the Import job was completed.
     * </p>
     * 
     * @param endTime
     *        The time that the Import job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The datastore id used when the Import job was created.
     * </p>
     * 
     * @param datastoreId
     *        The datastore id used when the Import job was created.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The datastore id used when the Import job was created.
     * </p>
     * 
     * @return The datastore id used when the Import job was created.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The datastore id used when the Import job was created.
     * </p>
     * 
     * @param datastoreId
     *        The datastore id used when the Import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The input data configuration that was supplied when the Import job was created.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that was supplied when the Import job was created.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that was supplied when the Import job was created.
     * </p>
     * 
     * @return The input data configuration that was supplied when the Import job was created.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The input data configuration that was supplied when the Import job was created.
     * </p>
     * 
     * @param inputDataConfig
     *        The input data configuration that was supplied when the Import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * @param jobOutputDataConfig
     */

    public void setJobOutputDataConfig(OutputDataConfig jobOutputDataConfig) {
        this.jobOutputDataConfig = jobOutputDataConfig;
    }

    /**
     * @return
     */

    public OutputDataConfig getJobOutputDataConfig() {
        return this.jobOutputDataConfig;
    }

    /**
     * @param jobOutputDataConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withJobOutputDataConfig(OutputDataConfig jobOutputDataConfig) {
        setJobOutputDataConfig(jobOutputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that gives Amazon HealthLake access to your input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the FHIR import job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occurred during the FHIR import job.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the FHIR import job.
     * </p>
     * 
     * @return An explanation of any errors that may have occurred during the FHIR import job.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An explanation of any errors that may have occurred during the FHIR import job.
     * </p>
     * 
     * @param message
     *        An explanation of any errors that may have occurred during the FHIR import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobProperties withMessage(String message) {
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
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getJobOutputDataConfig() != null)
            sb.append("JobOutputDataConfig: ").append(getJobOutputDataConfig()).append(",");
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

        if (obj instanceof ImportJobProperties == false)
            return false;
        ImportJobProperties other = (ImportJobProperties) obj;
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
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getJobOutputDataConfig() == null ^ this.getJobOutputDataConfig() == null)
            return false;
        if (other.getJobOutputDataConfig() != null && other.getJobOutputDataConfig().equals(this.getJobOutputDataConfig()) == false)
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
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getJobOutputDataConfig() == null) ? 0 : getJobOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImportJobProperties clone() {
        try {
            return (ImportJobProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.ImportJobPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
