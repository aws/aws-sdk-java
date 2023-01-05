/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset import job.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>. If you
     * haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported individually is
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     * Personalize replaces any record with the same ID with the new one.
     * </p>
     * </li>
     * </ul>
     */
    private String importMode;
    /**
     * <p>
     * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * </p>
     */
    private Boolean publishAttributionMetricsToS3;

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
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset import job.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *         apply to the dataset import job.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset import job.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset import job.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset import job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the dataset import job.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>. If you
     * haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported individually is
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     * Personalize replaces any record with the same ID with the new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importMode
     *        Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>.
     *        If you haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>
     *        .</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported
     *        individually is not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     *        Personalize replaces any record with the same ID with the new one.
     *        </p>
     *        </li>
     * @see ImportMode
     */

    public void setImportMode(String importMode) {
        this.importMode = importMode;
    }

    /**
     * <p>
     * Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>. If you
     * haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported individually is
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     * Personalize replaces any record with the same ID with the new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>.
     *         If you haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>
     *         .</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported
     *         individually is not replaced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     *         Personalize replaces any record with the same ID with the new one.
     *         </p>
     *         </li>
     * @see ImportMode
     */

    public String getImportMode() {
        return this.importMode;
    }

    /**
     * <p>
     * Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>. If you
     * haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported individually is
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     * Personalize replaces any record with the same ID with the new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importMode
     *        Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>.
     *        If you haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>
     *        .</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported
     *        individually is not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     *        Personalize replaces any record with the same ID with the new one.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportMode
     */

    public CreateDatasetImportJobRequest withImportMode(String importMode) {
        setImportMode(importMode);
        return this;
    }

    /**
     * <p>
     * Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>. If you
     * haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported individually is
     * not replaced.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     * Personalize replaces any record with the same ID with the new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importMode
     *        Specify how to add the new records to an existing dataset. The default import mode is <code>FULL</code>.
     *        If you haven't imported bulk records into the dataset previously, you can only specify <code>FULL</code>
     *        .</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>FULL</code> to overwrite all existing bulk data in your dataset. Data you imported
     *        individually is not replaced.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>INCREMENTAL</code> to append the new records to the existing data in your dataset. Amazon
     *        Personalize replaces any record with the same ID with the new one.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportMode
     */

    public CreateDatasetImportJobRequest withImportMode(ImportMode importMode) {
        this.importMode = importMode.toString();
        return this;
    }

    /**
     * <p>
     * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * </p>
     * 
     * @param publishAttributionMetricsToS3
     *        If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     */

    public void setPublishAttributionMetricsToS3(Boolean publishAttributionMetricsToS3) {
        this.publishAttributionMetricsToS3 = publishAttributionMetricsToS3;
    }

    /**
     * <p>
     * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * </p>
     * 
     * @return If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     */

    public Boolean getPublishAttributionMetricsToS3() {
        return this.publishAttributionMetricsToS3;
    }

    /**
     * <p>
     * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * </p>
     * 
     * @param publishAttributionMetricsToS3
     *        If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetImportJobRequest withPublishAttributionMetricsToS3(Boolean publishAttributionMetricsToS3) {
        setPublishAttributionMetricsToS3(publishAttributionMetricsToS3);
        return this;
    }

    /**
     * <p>
     * If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     * </p>
     * 
     * @return If you created a metric attribution, specify whether to publish metrics for this import job to Amazon S3
     */

    public Boolean isPublishAttributionMetricsToS3() {
        return this.publishAttributionMetricsToS3;
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
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getImportMode() != null)
            sb.append("ImportMode: ").append(getImportMode()).append(",");
        if (getPublishAttributionMetricsToS3() != null)
            sb.append("PublishAttributionMetricsToS3: ").append(getPublishAttributionMetricsToS3());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getImportMode() == null ^ this.getImportMode() == null)
            return false;
        if (other.getImportMode() != null && other.getImportMode().equals(this.getImportMode()) == false)
            return false;
        if (other.getPublishAttributionMetricsToS3() == null ^ this.getPublishAttributionMetricsToS3() == null)
            return false;
        if (other.getPublishAttributionMetricsToS3() != null
                && other.getPublishAttributionMetricsToS3().equals(this.getPublishAttributionMetricsToS3()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getImportMode() == null) ? 0 : getImportMode().hashCode());
        hashCode = prime * hashCode + ((getPublishAttributionMetricsToS3() == null) ? 0 : getPublishAttributionMetricsToS3().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetImportJobRequest clone() {
        return (CreateDatasetImportJobRequest) super.clone();
    }

}
