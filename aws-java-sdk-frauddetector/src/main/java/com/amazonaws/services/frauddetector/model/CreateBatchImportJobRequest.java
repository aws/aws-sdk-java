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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateBatchImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBatchImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     * <code>CREATE_FAILED</code> state.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The URI that points to the Amazon S3 location of your data file.
     * </p>
     */
    private String inputPath;
    /**
     * <p>
     * The URI that points to the Amazon S3 location for storing your results.
     * </p>
     */
    private String outputPath;
    /**
     * <p>
     * The name of the event type.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The ARN of the IAM role created for Amazon S3 bucket that holds your data file.
     * </p>
     * <p>
     * The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3 bucket.
     * For more information about bucket permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy examples</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A collection of key-value pairs associated with this request.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     * <code>CREATE_FAILED</code> state.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     *        <code>CREATE_FAILED</code> state.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     * <code>CREATE_FAILED</code> state.
     * </p>
     * 
     * @return The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     *         <code>CREATE_FAILED</code> state.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     * <code>CREATE_FAILED</code> state.
     * </p>
     * 
     * @param jobId
     *        The ID of the batch import job. The ID cannot be of a past job, unless the job exists in
     *        <code>CREATE_FAILED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location of your data file.
     * </p>
     * 
     * @param inputPath
     *        The URI that points to the Amazon S3 location of your data file.
     */

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location of your data file.
     * </p>
     * 
     * @return The URI that points to the Amazon S3 location of your data file.
     */

    public String getInputPath() {
        return this.inputPath;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location of your data file.
     * </p>
     * 
     * @param inputPath
     *        The URI that points to the Amazon S3 location of your data file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withInputPath(String inputPath) {
        setInputPath(inputPath);
        return this;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location for storing your results.
     * </p>
     * 
     * @param outputPath
     *        The URI that points to the Amazon S3 location for storing your results.
     */

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location for storing your results.
     * </p>
     * 
     * @return The URI that points to the Amazon S3 location for storing your results.
     */

    public String getOutputPath() {
        return this.outputPath;
    }

    /**
     * <p>
     * The URI that points to the Amazon S3 location for storing your results.
     * </p>
     * 
     * @param outputPath
     *        The URI that points to the Amazon S3 location for storing your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withOutputPath(String outputPath) {
        setOutputPath(outputPath);
        return this;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @return The name of the event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role created for Amazon S3 bucket that holds your data file.
     * </p>
     * <p>
     * The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3 bucket.
     * For more information about bucket permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy examples</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role created for Amazon S3 bucket that holds your data file.</p>
     *        <p>
     *        The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3
     *        bucket. For more information about bucket permissions, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy
     *        examples</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role created for Amazon S3 bucket that holds your data file.
     * </p>
     * <p>
     * The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3 bucket.
     * For more information about bucket permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy examples</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return The ARN of the IAM role created for Amazon S3 bucket that holds your data file.</p>
     *         <p>
     *         The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3
     *         bucket. For more information about bucket permissions, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy
     *         examples</a> in the <i>Amazon S3 User Guide</i>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role created for Amazon S3 bucket that holds your data file.
     * </p>
     * <p>
     * The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3 bucket.
     * For more information about bucket permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy examples</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role created for Amazon S3 bucket that holds your data file.</p>
     *        <p>
     *        The IAM role must have read permissions to your input S3 bucket and write permissions to your output S3
     *        bucket. For more information about bucket permissions, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-policies-s3.html">User policy
     *        examples</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A collection of key-value pairs associated with this request.
     * </p>
     * 
     * @return A collection of key-value pairs associated with this request.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key-value pairs associated with this request.
     * </p>
     * 
     * @param tags
     *        A collection of key-value pairs associated with this request.
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
     * A collection of key-value pairs associated with this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key-value pairs associated with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withTags(Tag... tags) {
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
     * A collection of key-value pairs associated with this request.
     * </p>
     * 
     * @param tags
     *        A collection of key-value pairs associated with this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchImportJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInputPath() != null)
            sb.append("InputPath: ").append(getInputPath()).append(",");
        if (getOutputPath() != null)
            sb.append("OutputPath: ").append(getOutputPath()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchImportJobRequest == false)
            return false;
        CreateBatchImportJobRequest other = (CreateBatchImportJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getInputPath() == null ^ this.getInputPath() == null)
            return false;
        if (other.getInputPath() != null && other.getInputPath().equals(this.getInputPath()) == false)
            return false;
        if (other.getOutputPath() == null ^ this.getOutputPath() == null)
            return false;
        if (other.getOutputPath() != null && other.getOutputPath().equals(this.getOutputPath()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getInputPath() == null) ? 0 : getInputPath().hashCode());
        hashCode = prime * hashCode + ((getOutputPath() == null) ? 0 : getOutputPath().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchImportJobRequest clone() {
        return (CreateBatchImportJobRequest) super.clone();
    }

}
