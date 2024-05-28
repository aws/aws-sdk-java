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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetEvaluationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvaluationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The status of the model evaluation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The description of the model evaluation job.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was created.
     * </p>
     */
    private String customerEncryptionKeyId;
    /**
     * <p>
     * The type of model evaluation job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * Contains details about the type of model evaluation job, the metrics used, the task type selected, the datasets
     * used, and any custom metrics you defined.
     * </p>
     */
    private EvaluationConfig evaluationConfig;
    /**
     * <p>
     * Details about the models you specified in your model evaluation job.
     * </p>
     */
    private EvaluationInferenceConfig inferenceConfig;
    /**
     * <p>
     * Amazon S3 location for where output data is saved.
     * </p>
     */
    private EvaluationOutputDataConfig outputDataConfig;
    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the model evaluation job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * An array of strings the specify why the model evaluation job has failed.
     * </p>
     */
    private java.util.List<String> failureMessages;

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @return The name of the model evaluation job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The status of the model evaluation job.
     * @see EvaluationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model evaluation job.
     * </p>
     * 
     * @return The status of the model evaluation job.
     * @see EvaluationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The status of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public GetEvaluationJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the model evaluation job.
     * </p>
     * 
     * @param status
     *        The status of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public GetEvaluationJobResult withStatus(EvaluationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model evaluation job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model evaluation job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The description of the model evaluation job.
     * </p>
     * 
     * @param jobDescription
     *        The description of the model evaluation job.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * The description of the model evaluation job.
     * </p>
     * 
     * @return The description of the model evaluation job.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * The description of the model evaluation job.
     * </p>
     * 
     * @param jobDescription
     *        The description of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM service role used in the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was created.
     * </p>
     * 
     * @param customerEncryptionKeyId
     *        The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was
     *        created.
     */

    public void setCustomerEncryptionKeyId(String customerEncryptionKeyId) {
        this.customerEncryptionKeyId = customerEncryptionKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was
     *         created.
     */

    public String getCustomerEncryptionKeyId() {
        return this.customerEncryptionKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was created.
     * </p>
     * 
     * @param customerEncryptionKeyId
     *        The Amazon Resource Name (ARN) of the customer managed key specified when the model evaluation job was
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withCustomerEncryptionKeyId(String customerEncryptionKeyId) {
        setCustomerEncryptionKeyId(customerEncryptionKeyId);
        return this;
    }

    /**
     * <p>
     * The type of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type of model evaluation job.
     * @see EvaluationJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of model evaluation job.
     * </p>
     * 
     * @return The type of model evaluation job.
     * @see EvaluationJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type of model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobType
     */

    public GetEvaluationJobResult withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of model evaluation job.
     * </p>
     * 
     * @param jobType
     *        The type of model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobType
     */

    public GetEvaluationJobResult withJobType(EvaluationJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * Contains details about the type of model evaluation job, the metrics used, the task type selected, the datasets
     * used, and any custom metrics you defined.
     * </p>
     * 
     * @param evaluationConfig
     *        Contains details about the type of model evaluation job, the metrics used, the task type selected, the
     *        datasets used, and any custom metrics you defined.
     */

    public void setEvaluationConfig(EvaluationConfig evaluationConfig) {
        this.evaluationConfig = evaluationConfig;
    }

    /**
     * <p>
     * Contains details about the type of model evaluation job, the metrics used, the task type selected, the datasets
     * used, and any custom metrics you defined.
     * </p>
     * 
     * @return Contains details about the type of model evaluation job, the metrics used, the task type selected, the
     *         datasets used, and any custom metrics you defined.
     */

    public EvaluationConfig getEvaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * <p>
     * Contains details about the type of model evaluation job, the metrics used, the task type selected, the datasets
     * used, and any custom metrics you defined.
     * </p>
     * 
     * @param evaluationConfig
     *        Contains details about the type of model evaluation job, the metrics used, the task type selected, the
     *        datasets used, and any custom metrics you defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withEvaluationConfig(EvaluationConfig evaluationConfig) {
        setEvaluationConfig(evaluationConfig);
        return this;
    }

    /**
     * <p>
     * Details about the models you specified in your model evaluation job.
     * </p>
     * 
     * @param inferenceConfig
     *        Details about the models you specified in your model evaluation job.
     */

    public void setInferenceConfig(EvaluationInferenceConfig inferenceConfig) {
        this.inferenceConfig = inferenceConfig;
    }

    /**
     * <p>
     * Details about the models you specified in your model evaluation job.
     * </p>
     * 
     * @return Details about the models you specified in your model evaluation job.
     */

    public EvaluationInferenceConfig getInferenceConfig() {
        return this.inferenceConfig;
    }

    /**
     * <p>
     * Details about the models you specified in your model evaluation job.
     * </p>
     * 
     * @param inferenceConfig
     *        Details about the models you specified in your model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withInferenceConfig(EvaluationInferenceConfig inferenceConfig) {
        setInferenceConfig(inferenceConfig);
        return this;
    }

    /**
     * <p>
     * Amazon S3 location for where output data is saved.
     * </p>
     * 
     * @param outputDataConfig
     *        Amazon S3 location for where output data is saved.
     */

    public void setOutputDataConfig(EvaluationOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Amazon S3 location for where output data is saved.
     * </p>
     * 
     * @return Amazon S3 location for where output data is saved.
     */

    public EvaluationOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Amazon S3 location for where output data is saved.
     * </p>
     * 
     * @param outputDataConfig
     *        Amazon S3 location for where output data is saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withOutputDataConfig(EvaluationOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @param creationTime
     *        When the model evaluation job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @return When the model evaluation job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the model evaluation job was created.
     * </p>
     * 
     * @param creationTime
     *        When the model evaluation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the model evaluation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the model evaluation job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the model evaluation job was last modified.
     * </p>
     * 
     * @return When the model evaluation job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the model evaluation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the model evaluation job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * An array of strings the specify why the model evaluation job has failed.
     * </p>
     * 
     * @return An array of strings the specify why the model evaluation job has failed.
     */

    public java.util.List<String> getFailureMessages() {
        return failureMessages;
    }

    /**
     * <p>
     * An array of strings the specify why the model evaluation job has failed.
     * </p>
     * 
     * @param failureMessages
     *        An array of strings the specify why the model evaluation job has failed.
     */

    public void setFailureMessages(java.util.Collection<String> failureMessages) {
        if (failureMessages == null) {
            this.failureMessages = null;
            return;
        }

        this.failureMessages = new java.util.ArrayList<String>(failureMessages);
    }

    /**
     * <p>
     * An array of strings the specify why the model evaluation job has failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureMessages(java.util.Collection)} or {@link #withFailureMessages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failureMessages
     *        An array of strings the specify why the model evaluation job has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withFailureMessages(String... failureMessages) {
        if (this.failureMessages == null) {
            setFailureMessages(new java.util.ArrayList<String>(failureMessages.length));
        }
        for (String ele : failureMessages) {
            this.failureMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings the specify why the model evaluation job has failed.
     * </p>
     * 
     * @param failureMessages
     *        An array of strings the specify why the model evaluation job has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvaluationJobResult withFailureMessages(java.util.Collection<String> failureMessages) {
        setFailureMessages(failureMessages);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobDescription() != null)
            sb.append("JobDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCustomerEncryptionKeyId() != null)
            sb.append("CustomerEncryptionKeyId: ").append(getCustomerEncryptionKeyId()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getEvaluationConfig() != null)
            sb.append("EvaluationConfig: ").append(getEvaluationConfig()).append(",");
        if (getInferenceConfig() != null)
            sb.append("InferenceConfig: ").append(getInferenceConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureMessages() != null)
            sb.append("FailureMessages: ").append(getFailureMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvaluationJobResult == false)
            return false;
        GetEvaluationJobResult other = (GetEvaluationJobResult) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCustomerEncryptionKeyId() == null ^ this.getCustomerEncryptionKeyId() == null)
            return false;
        if (other.getCustomerEncryptionKeyId() != null && other.getCustomerEncryptionKeyId().equals(this.getCustomerEncryptionKeyId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getEvaluationConfig() == null ^ this.getEvaluationConfig() == null)
            return false;
        if (other.getEvaluationConfig() != null && other.getEvaluationConfig().equals(this.getEvaluationConfig()) == false)
            return false;
        if (other.getInferenceConfig() == null ^ this.getInferenceConfig() == null)
            return false;
        if (other.getInferenceConfig() != null && other.getInferenceConfig().equals(this.getInferenceConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureMessages() == null ^ this.getFailureMessages() == null)
            return false;
        if (other.getFailureMessages() != null && other.getFailureMessages().equals(this.getFailureMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyId() == null) ? 0 : getCustomerEncryptionKeyId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getEvaluationConfig() == null) ? 0 : getEvaluationConfig().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfig() == null) ? 0 : getInferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureMessages() == null) ? 0 : getFailureMessages().hashCode());
        return hashCode;
    }

    @Override
    public GetEvaluationJobResult clone() {
        try {
            return (GetEvaluationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
