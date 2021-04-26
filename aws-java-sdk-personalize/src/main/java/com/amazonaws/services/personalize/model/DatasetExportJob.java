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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a job that exports a dataset to an Amazon S3 bucket. For more information, see
 * <a>CreateDatasetExportJob</a>.
 * </p>
 * <p>
 * A dataset export job can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DatasetExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetExportJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the export job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     */
    private String datasetExportJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to export.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data that you
     * imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using the console,
     * PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     */
    private String ingestionMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions to add
     * data to your output Amazon S3 bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the dataset export job.
     * </p>
     * <p>
     * A dataset export job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/folder-name/</code>
     * </p>
     */
    private DatasetExportJobOutput jobOutput;
    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset export job.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) the status of the dataset export job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If a dataset export job fails, provides the reason why.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the export job.
     * </p>
     * 
     * @param jobName
     *        The name of the export job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the export job.
     * </p>
     * 
     * @return The name of the export job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the export job.
     * </p>
     * 
     * @param jobName
     *        The name of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job.
     */

    public void setDatasetExportJobArn(String datasetExportJobArn) {
        this.datasetExportJobArn = datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset export job.
     */

    public String getDatasetExportJobArn() {
        return this.datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withDatasetExportJobArn(String datasetExportJobArn) {
        setDatasetExportJobArn(datasetExportJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to export.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset to export.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset to export.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset to export.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data that you
     * imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using the console,
     * PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data
     *        that you imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using
     *        the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default
     *        value is <code>PUT</code>.
     * @see IngestionMode
     */

    public void setIngestionMode(String ingestionMode) {
        this.ingestionMode = ingestionMode;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data that you
     * imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using the console,
     * PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @return The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data
     *         that you imported using a dataset import job, <code>PUT</code> data that you imported incrementally
     *         (using the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The
     *         default value is <code>PUT</code>.
     * @see IngestionMode
     */

    public String getIngestionMode() {
        return this.ingestionMode;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data that you
     * imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using the console,
     * PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data
     *        that you imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using
     *        the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default
     *        value is <code>PUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionMode
     */

    public DatasetExportJob withIngestionMode(String ingestionMode) {
        setIngestionMode(ingestionMode);
        return this;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data that you
     * imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using the console,
     * PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export <code>BULK</code> data
     *        that you imported using a dataset import job, <code>PUT</code> data that you imported incrementally (using
     *        the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default
     *        value is <code>PUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionMode
     */

    public DatasetExportJob withIngestionMode(IngestionMode ingestionMode) {
        this.ingestionMode = ingestionMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions to add
     * data to your output Amazon S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions
     *        to add data to your output Amazon S3 bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions to add
     * data to your output Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has
     *         permissions to add data to your output Amazon S3 bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions to add
     * data to your output Amazon S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management service role that has permissions
     *        to add data to your output Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the dataset export job.
     * </p>
     * <p>
     * A dataset export job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset export job.</p>
     *        <p>
     *        A dataset export job can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset export job.
     * </p>
     * <p>
     * A dataset export job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the dataset export job.</p>
     *         <p>
     *         A dataset export job can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset export job.
     * </p>
     * <p>
     * A dataset export job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset export job.</p>
     *        <p>
     *        A dataset export job can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/folder-name/</code>
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output is stored. For example:</p>
     *        <p>
     *        <code>s3://bucket-name/folder-name/</code>
     */

    public void setJobOutput(DatasetExportJobOutput jobOutput) {
        this.jobOutput = jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/folder-name/</code>
     * </p>
     * 
     * @return The path to the Amazon S3 bucket where the job's output is stored. For example:</p>
     *         <p>
     *         <code>s3://bucket-name/folder-name/</code>
     */

    public DatasetExportJobOutput getJobOutput() {
        return this.jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/folder-name/</code>
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output is stored. For example:</p>
     *        <p>
     *        <code>s3://bucket-name/folder-name/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withJobOutput(DatasetExportJobOutput jobOutput) {
        setJobOutput(jobOutput);
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset export job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset export job.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset export job.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the dataset export job.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset export job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) the status of the dataset export job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the status of the dataset export job was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the status of the dataset export job was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) the status of the dataset export job was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the status of the dataset export job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the status of the dataset export job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If a dataset export job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a dataset export job fails, provides the reason why.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a dataset export job fails, provides the reason why.
     * </p>
     * 
     * @return If a dataset export job fails, provides the reason why.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a dataset export job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a dataset export job fails, provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getDatasetExportJobArn() != null)
            sb.append("DatasetExportJobArn: ").append(getDatasetExportJobArn()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getIngestionMode() != null)
            sb.append("IngestionMode: ").append(getIngestionMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobOutput() != null)
            sb.append("JobOutput: ").append(getJobOutput()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetExportJob == false)
            return false;
        DatasetExportJob other = (DatasetExportJob) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getDatasetExportJobArn() == null ^ this.getDatasetExportJobArn() == null)
            return false;
        if (other.getDatasetExportJobArn() != null && other.getDatasetExportJobArn().equals(this.getDatasetExportJobArn()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getIngestionMode() == null ^ this.getIngestionMode() == null)
            return false;
        if (other.getIngestionMode() != null && other.getIngestionMode().equals(this.getIngestionMode()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobOutput() == null ^ this.getJobOutput() == null)
            return false;
        if (other.getJobOutput() != null && other.getJobOutput().equals(this.getJobOutput()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetExportJobArn() == null) ? 0 : getDatasetExportJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionMode() == null) ? 0 : getIngestionMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJobOutput() == null) ? 0 : getJobOutput().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DatasetExportJob clone() {
        try {
            return (DatasetExportJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DatasetExportJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
