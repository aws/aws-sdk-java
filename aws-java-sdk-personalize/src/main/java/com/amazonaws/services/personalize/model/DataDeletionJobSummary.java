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
 * Provides a summary of the properties of a data deletion job. For a complete listing, call the <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataDeletionJob.html">DescribeDataDeletionJob</a>
 * API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DataDeletionJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataDeletionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data deletion job.
     * </p>
     */
    private String dataDeletionJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The name of the data deletion job.
     * </p>
     */
    private String jobName;
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

    public DataDeletionJobSummary withDataDeletionJobArn(String dataDeletionJobArn) {
        setDataDeletionJobArn(dataDeletionJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group the job deleted records from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataDeletionJobSummary withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

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

    public DataDeletionJobSummary withJobName(String jobName) {
        setJobName(jobName);
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

    public DataDeletionJobSummary withStatus(String status) {
        setStatus(status);
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

    public DataDeletionJobSummary withCreationDateTime(java.util.Date creationDateTime) {
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

    public DataDeletionJobSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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

    public DataDeletionJobSummary withFailureReason(String failureReason) {
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
        if (getDataDeletionJobArn() != null)
            sb.append("DataDeletionJobArn: ").append(getDataDeletionJobArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DataDeletionJobSummary == false)
            return false;
        DataDeletionJobSummary other = (DataDeletionJobSummary) obj;
        if (other.getDataDeletionJobArn() == null ^ this.getDataDeletionJobArn() == null)
            return false;
        if (other.getDataDeletionJobArn() != null && other.getDataDeletionJobArn().equals(this.getDataDeletionJobArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getDataDeletionJobArn() == null) ? 0 : getDataDeletionJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DataDeletionJobSummary clone() {
        try {
            return (DataDeletionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DataDeletionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
