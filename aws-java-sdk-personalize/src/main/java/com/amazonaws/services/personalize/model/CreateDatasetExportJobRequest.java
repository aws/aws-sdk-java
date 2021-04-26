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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the dataset export job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export only <code>BULK</code> data that
     * you imported using a dataset import job, only <code>PUT</code> data that you imported incrementally (using the
     * console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
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
     * The path to the Amazon S3 bucket where the job's output is stored.
     * </p>
     */
    private DatasetExportJobOutput jobOutput;

    /**
     * <p>
     * The name for the dataset export job.
     * </p>
     * 
     * @param jobName
     *        The name for the dataset export job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name for the dataset export job.
     * </p>
     * 
     * @return The name for the dataset export job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name for the dataset export job.
     * </p>
     * 
     * @param jobName
     *        The name for the dataset export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetExportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that contains the data to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetExportJobRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export only <code>BULK</code> data that
     * you imported using a dataset import job, only <code>PUT</code> data that you imported incrementally (using the
     * console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export only <code>BULK</code>
     *        data that you imported using a dataset import job, only <code>PUT</code> data that you imported
     *        incrementally (using the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for
     *        both types. The default value is <code>PUT</code>.
     * @see IngestionMode
     */

    public void setIngestionMode(String ingestionMode) {
        this.ingestionMode = ingestionMode;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export only <code>BULK</code> data that
     * you imported using a dataset import job, only <code>PUT</code> data that you imported incrementally (using the
     * console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @return The data to export, based on how you imported the data. You can choose to export only <code>BULK</code>
     *         data that you imported using a dataset import job, only <code>PUT</code> data that you imported
     *         incrementally (using the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for
     *         both types. The default value is <code>PUT</code>.
     * @see IngestionMode
     */

    public String getIngestionMode() {
        return this.ingestionMode;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export only <code>BULK</code> data that
     * you imported using a dataset import job, only <code>PUT</code> data that you imported incrementally (using the
     * console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export only <code>BULK</code>
     *        data that you imported using a dataset import job, only <code>PUT</code> data that you imported
     *        incrementally (using the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for
     *        both types. The default value is <code>PUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionMode
     */

    public CreateDatasetExportJobRequest withIngestionMode(String ingestionMode) {
        setIngestionMode(ingestionMode);
        return this;
    }

    /**
     * <p>
     * The data to export, based on how you imported the data. You can choose to export only <code>BULK</code> data that
     * you imported using a dataset import job, only <code>PUT</code> data that you imported incrementally (using the
     * console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for both types. The default value is
     * <code>PUT</code>.
     * </p>
     * 
     * @param ingestionMode
     *        The data to export, based on how you imported the data. You can choose to export only <code>BULK</code>
     *        data that you imported using a dataset import job, only <code>PUT</code> data that you imported
     *        incrementally (using the console, PutEvents, PutUsers and PutItems operations), or <code>ALL</code> for
     *        both types. The default value is <code>PUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionMode
     */

    public CreateDatasetExportJobRequest withIngestionMode(IngestionMode ingestionMode) {
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

    public CreateDatasetExportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored.
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output is stored.
     */

    public void setJobOutput(DatasetExportJobOutput jobOutput) {
        this.jobOutput = jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored.
     * </p>
     * 
     * @return The path to the Amazon S3 bucket where the job's output is stored.
     */

    public DatasetExportJobOutput getJobOutput() {
        return this.jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output is stored.
     * </p>
     * 
     * @param jobOutput
     *        The path to the Amazon S3 bucket where the job's output is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetExportJobRequest withJobOutput(DatasetExportJobOutput jobOutput) {
        setJobOutput(jobOutput);
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
        if (getIngestionMode() != null)
            sb.append("IngestionMode: ").append(getIngestionMode()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getJobOutput() != null)
            sb.append("JobOutput: ").append(getJobOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetExportJobRequest == false)
            return false;
        CreateDatasetExportJobRequest other = (CreateDatasetExportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
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
        if (other.getJobOutput() == null ^ this.getJobOutput() == null)
            return false;
        if (other.getJobOutput() != null && other.getJobOutput().equals(this.getJobOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionMode() == null) ? 0 : getIngestionMode().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobOutput() == null) ? 0 : getJobOutput().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetExportJobRequest clone() {
        return (CreateDatasetExportJobRequest) super.clone();
    }

}
