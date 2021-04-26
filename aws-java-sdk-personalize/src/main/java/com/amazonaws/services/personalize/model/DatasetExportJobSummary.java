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
 * Provides a summary of the properties of a dataset export job. For a complete listing, call the
 * <a>DescribeDatasetExportJob</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DatasetExportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetExportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job.
     * </p>
     */
    private String datasetExportJobArn;
    /**
     * <p>
     * The name of the dataset export job.
     * </p>
     */
    private String jobName;
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
     * The date and time (in Unix time) that the dataset export job was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If a dataset export job fails, the reason behind the failure.
     * </p>
     */
    private String failureReason;

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

    public DatasetExportJobSummary withDatasetExportJobArn(String datasetExportJobArn) {
        setDatasetExportJobArn(datasetExportJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset export job.
     * </p>
     * 
     * @param jobName
     *        The name of the dataset export job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the dataset export job.
     * </p>
     * 
     * @return The name of the dataset export job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the dataset export job.
     * </p>
     * 
     * @param jobName
     *        The name of the dataset export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJobSummary withJobName(String jobName) {
        setJobName(jobName);
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

    public DatasetExportJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the dataset export job was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job was created.
     * </p>
     * 
     * @return The date and time (in Unix time) that the dataset export job was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that the dataset export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJobSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job status was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the dataset export job status was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job status was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the dataset export job status was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset export job status was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the dataset export job status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJobSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If a dataset export job fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a dataset export job fails, the reason behind the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a dataset export job fails, the reason behind the failure.
     * </p>
     * 
     * @return If a dataset export job fails, the reason behind the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a dataset export job fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a dataset export job fails, the reason behind the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJobSummary withFailureReason(String failureReason) {
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
        if (getDatasetExportJobArn() != null)
            sb.append("DatasetExportJobArn: ").append(getDatasetExportJobArn()).append(",");
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

        if (obj instanceof DatasetExportJobSummary == false)
            return false;
        DatasetExportJobSummary other = (DatasetExportJobSummary) obj;
        if (other.getDatasetExportJobArn() == null ^ this.getDatasetExportJobArn() == null)
            return false;
        if (other.getDatasetExportJobArn() != null && other.getDatasetExportJobArn().equals(this.getDatasetExportJobArn()) == false)
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

        hashCode = prime * hashCode + ((getDatasetExportJobArn() == null) ? 0 : getDatasetExportJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DatasetExportJobSummary clone() {
        try {
            return (DatasetExportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DatasetExportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
