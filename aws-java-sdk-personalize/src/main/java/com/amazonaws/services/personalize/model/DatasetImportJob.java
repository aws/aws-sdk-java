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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon Personalize dataset.
 * For more information, see <a>CreateDatasetImportJob</a>.
 * </p>
 * <p>
 * A dataset ACTIVE -or- CREATE FAILED
 * </p>
 * </li> </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DatasetImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetImportJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the import job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     */
    private String datasetImportJobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data
     * source.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the dataset ACTIVE -or- CREATE FAILED
     * </p>
     * </li> </ul>
     */
    private String status;
    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the import job.
     * </p>
     * 
     * @param jobName
     *        The name of the import job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the import job.
     * </p>
     * 
     * @return The name of the import job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the import job.
     * </p>
     * 
     * @param jobName
     *        The name of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The ARN of the dataset import job.
     */

    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @return The ARN of the dataset import job.
     */

    public String getDatasetImportJobArn() {
        return this.datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The ARN of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withDatasetImportJobArn(String datasetImportJobArn) {
        setDatasetImportJobArn(datasetImportJobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that receives the imported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     * 
     * @param dataSource
     *        The Amazon S3 bucket that contains the training data to import.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains the training data to import.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     * 
     * @param dataSource
     *        The Amazon S3 bucket that contains the training data to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data
     * source.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon
     *        S3 data source.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data
     * source.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon
     *         S3 data source.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data
     * source.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon
     *        S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
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
     *        The status of the dataset import job.</p>
     *        <p>
     *        A dataset import job can be in one of the following states:
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
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the dataset import job.</p>
     *         <p>
     *         A dataset import job can be in one of the following states:
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
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
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
     *        The status of the dataset import job.</p>
     *        <p>
     *        A dataset import job can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset import job.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     * 
     * @return The creation date and time (in Unix time) of the dataset import job.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time (in Unix time) of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the dataset was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) the dataset was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) the dataset was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a dataset import job fails, provides the reason why.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     * 
     * @return If a dataset import job fails, provides the reason why.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     * 
     * @param failureReason
     *        If a dataset import job fails, provides the reason why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJob withFailureReason(String failureReason) {
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
        if (getDatasetImportJobArn() != null)
            sb.append("DatasetImportJobArn: ").append(getDatasetImportJobArn()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof DatasetImportJob == false)
            return false;
        DatasetImportJob other = (DatasetImportJob) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
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
        hashCode = prime * hashCode + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DatasetImportJob clone() {
        try {
            return (DatasetImportJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DatasetImportJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
