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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a job that deletes all references to specific users from an Amazon Personalize dataset group in batches.
 * For information about creating a data deletion job, see <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/delete-records.html">Deleting users</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DataDeletionJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataDeletionJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data deletion job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data deletion job.
     * </p>
     */
    private String dataDeletionJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     * </p>
     */
    private String datasetGroupArn;

    private DataSource dataSource;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the data deletion job.
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The number of records deleted by a COMPLETED job.
     * </p>
     */
    private Integer numDeleted;
    /**
     * <p>
     * The creation date and time (in Unix time) of the data deletion job.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) the data deletion job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If a data deletion job fails, provides the reason why.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the data deletion job.
     * </p>
     * 
     * @param jobName
     *        The name of the data deletion job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the data deletion job.
     * </p>
     * 
     * @return The name of the data deletion job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the data deletion job.
     * </p>
     * 
     * @param jobName
     *        The name of the data deletion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data deletion job.
     * </p>
     * 
     * @param dataDeletionJobArn
     *        The Amazon Resource Name (ARN) of the data deletion job.
     */

    public void setDataDeletionJobArn(String dataDeletionJobArn) {
        this.dataDeletionJobArn = dataDeletionJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data deletion job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data deletion job.
     */

    public String getDataDeletionJobArn() {
        return this.dataDeletionJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data deletion job.
     * </p>
     * 
     * @param dataDeletionJobArn
     *        The Amazon Resource Name (ARN) of the data deletion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withDataDeletionJobArn(String dataDeletionJobArn) {
        setDataDeletionJobArn(dataDeletionJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group the job deletes records from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * @param dataSource
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * @return
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * @param dataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data
     *        source.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data
     *         source.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that has permissions to read from the Amazon S3 data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the data deletion job.
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the data deletion job.</p>
     *        <p>
     *        A data deletion job can have one of the following statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data deletion job.
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the data deletion job.</p>
     *         <p>
     *         A data deletion job can have one of the following statuses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data deletion job.
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the data deletion job.</p>
     *        <p>
     *        A data deletion job can have one of the following statuses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of records deleted by a COMPLETED job.
     * </p>
     * 
     * @param numDeleted
     *        The number of records deleted by a COMPLETED job.
     */

    public void setNumDeleted(Integer numDeleted) {
        this.numDeleted = numDeleted;
    }

    /**
     * <p>
     * The number of records deleted by a COMPLETED job.
     * </p>
     * 
     * @return The number of records deleted by a COMPLETED job.
     */

    public Integer getNumDeleted() {
        return this.numDeleted;
    }

    /**
     * <p>
     * The number of records deleted by a COMPLETED job.
     * </p>
     * 
     * @param numDeleted
     *        The number of records deleted by a COMPLETED job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withNumDeleted(Integer numDeleted) {
        setNumDeleted(numDeleted);
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the data deletion job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the data deletion job.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the data deletion job.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the data deletion job.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the data deletion job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the data deletion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) the data deletion job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the data deletion job was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the data deletion job was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) the data deletion job was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the data deletion job was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the data deletion job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If a data deletion job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a data deletion job fails, provides the reason why.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a data deletion job fails, provides the reason why.
     * </p>
     * 
     * @return If a data deletion job fails, provides the reason why.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a data deletion job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a data deletion job fails, provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJob withFailureReason(String failureReason) {
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
        if (getDataDeletionJobArn() != null)
            sb.append("DataDeletionJobArn: ").append(getDataDeletionJobArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNumDeleted() != null)
            sb.append("NumDeleted: ").append(getNumDeleted()).append(",");
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

        if (obj instanceof DataDeletionJob == false)
            return false;
        DataDeletionJob other = (DataDeletionJob) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getDataDeletionJobArn() == null ^ this.getDataDeletionJobArn() == null)
            return false;
        if (other.getDataDeletionJobArn() != null && other.getDataDeletionJobArn().equals(this.getDataDeletionJobArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNumDeleted() == null ^ this.getNumDeleted() == null)
            return false;
        if (other.getNumDeleted() != null && other.getNumDeleted().equals(this.getNumDeleted()) == false)
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
        hashCode = prime * hashCode + ((getDataDeletionJobArn() == null) ? 0 : getDataDeletionJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNumDeleted() == null) ? 0 : getNumDeleted().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DataDeletionJob clone() {
        try {
            return (DataDeletionJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DataDeletionJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
