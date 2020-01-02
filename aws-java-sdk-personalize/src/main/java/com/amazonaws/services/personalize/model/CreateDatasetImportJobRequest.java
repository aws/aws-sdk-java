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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
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
     * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * 
     * @param jobName
     *        The name for the dataset import job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * 
     * @return The name for the dataset import job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * 
     * @param jobName
     *        The name for the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of the dataset that receives the imported data.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
     * </p>
     * 
     * @return The ARN of the dataset that receives the imported data.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of the dataset that receives the imported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withDatasetArn(String datasetArn) {
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

    public CreateDatasetImportJobRequest withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @return The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withRoleArn(String roleArn) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
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

        if (obj instanceof CreateDatasetImportJobRequest == false)
            return false;
        CreateDatasetImportJobRequest other = (CreateDatasetImportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetImportJobRequest clone() {
        return (CreateDatasetImportJobRequest) super.clone();
    }

}
