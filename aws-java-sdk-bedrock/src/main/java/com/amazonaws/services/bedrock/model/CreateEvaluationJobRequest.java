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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateEvaluationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEvaluationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and your
     * account's AWS region.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * A description of the model evaluation job.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any Amazon S3
     * buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon Bedrock, the caller of
     * this API must have the <code>iam:PassRole</code> permission. To learn more about the required permissions, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     * permissions</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     * </p>
     */
    private String customerEncryptionKeyId;
    /**
     * <p>
     * Tags to attach to the model evaluation job.
     * </p>
     */
    private java.util.List<Tag> jobTags;
    /**
     * <p>
     * Specifies whether the model evaluation job is automatic or uses human worker.
     * </p>
     */
    private EvaluationConfig evaluationConfig;
    /**
     * <p>
     * Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a single
     * model, and model evaluation job that use human workers support two models.
     * </p>
     */
    private EvaluationInferenceConfig inferenceConfig;
    /**
     * <p>
     * An object that defines where the results of model evaluation job will be saved in Amazon S3.
     * </p>
     */
    private EvaluationOutputDataConfig outputDataConfig;

    /**
     * <p>
     * The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and your
     * account's AWS region.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and
     *        your account's AWS region.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and your
     * account's AWS region.
     * </p>
     * 
     * @return The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and
     *         your account's AWS region.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and your
     * account's AWS region.
     * </p>
     * 
     * @param jobName
     *        The name of the model evaluation job. Model evaluation job names must unique with your AWS account, and
     *        your account's AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * A description of the model evaluation job.
     * </p>
     * 
     * @param jobDescription
     *        A description of the model evaluation job.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * A description of the model evaluation job.
     * </p>
     * 
     * @return A description of the model evaluation job.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * A description of the model evaluation job.
     * </p>
     * 
     * @param jobDescription
     *        A description of the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any Amazon S3
     * buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon Bedrock, the caller of
     * this API must have the <code>iam:PassRole</code> permission. To learn more about the required permissions, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     * permissions</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *        your behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any
     *        Amazon S3 buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon
     *        Bedrock, the caller of this API must have the <code>iam:PassRole</code> permission. To learn more about
     *        the required permissions, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     *        permissions</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any Amazon S3
     * buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon Bedrock, the caller of
     * this API must have the <code>iam:PassRole</code> permission. To learn more about the required permissions, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     * permissions</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *         your behalf. The service role must have Amazon Bedrock as the service principal, and provide access to
     *         any Amazon S3 buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon
     *         Bedrock, the caller of this API must have the <code>iam:PassRole</code> permission. To learn more about
     *         the required permissions, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     *         permissions</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on your
     * behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any Amazon S3
     * buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon Bedrock, the caller of
     * this API must have the <code>iam:PassRole</code> permission. To learn more about the required permissions, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     * permissions</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM service role that Amazon Bedrock can assume to perform tasks on
     *        your behalf. The service role must have Amazon Bedrock as the service principal, and provide access to any
     *        Amazon S3 buckets specified in the <code>EvaluationConfig</code> object. To pass this role to Amazon
     *        Bedrock, the caller of this API must have the <code>iam:PassRole</code> permission. To learn more about
     *        the required permissions, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-evaluation-security.html">Required
     *        permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     * </p>
     * 
     * @param customerEncryptionKeyId
     *        Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     */

    public void setCustomerEncryptionKeyId(String customerEncryptionKeyId) {
        this.customerEncryptionKeyId = customerEncryptionKeyId;
    }

    /**
     * <p>
     * Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     * </p>
     * 
     * @return Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     */

    public String getCustomerEncryptionKeyId() {
        return this.customerEncryptionKeyId;
    }

    /**
     * <p>
     * Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     * </p>
     * 
     * @param customerEncryptionKeyId
     *        Specify your customer managed key ARN that will be used to encrypt your model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withCustomerEncryptionKeyId(String customerEncryptionKeyId) {
        setCustomerEncryptionKeyId(customerEncryptionKeyId);
        return this;
    }

    /**
     * <p>
     * Tags to attach to the model evaluation job.
     * </p>
     * 
     * @return Tags to attach to the model evaluation job.
     */

    public java.util.List<Tag> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * Tags to attach to the model evaluation job.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the model evaluation job.
     */

    public void setJobTags(java.util.Collection<Tag> jobTags) {
        if (jobTags == null) {
            this.jobTags = null;
            return;
        }

        this.jobTags = new java.util.ArrayList<Tag>(jobTags);
    }

    /**
     * <p>
     * Tags to attach to the model evaluation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTags(java.util.Collection)} or {@link #withJobTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withJobTags(Tag... jobTags) {
        if (this.jobTags == null) {
            setJobTags(new java.util.ArrayList<Tag>(jobTags.length));
        }
        for (Tag ele : jobTags) {
            this.jobTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to attach to the model evaluation job.
     * </p>
     * 
     * @param jobTags
     *        Tags to attach to the model evaluation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withJobTags(java.util.Collection<Tag> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether the model evaluation job is automatic or uses human worker.
     * </p>
     * 
     * @param evaluationConfig
     *        Specifies whether the model evaluation job is automatic or uses human worker.
     */

    public void setEvaluationConfig(EvaluationConfig evaluationConfig) {
        this.evaluationConfig = evaluationConfig;
    }

    /**
     * <p>
     * Specifies whether the model evaluation job is automatic or uses human worker.
     * </p>
     * 
     * @return Specifies whether the model evaluation job is automatic or uses human worker.
     */

    public EvaluationConfig getEvaluationConfig() {
        return this.evaluationConfig;
    }

    /**
     * <p>
     * Specifies whether the model evaluation job is automatic or uses human worker.
     * </p>
     * 
     * @param evaluationConfig
     *        Specifies whether the model evaluation job is automatic or uses human worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withEvaluationConfig(EvaluationConfig evaluationConfig) {
        setEvaluationConfig(evaluationConfig);
        return this;
    }

    /**
     * <p>
     * Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a single
     * model, and model evaluation job that use human workers support two models.
     * </p>
     * 
     * @param inferenceConfig
     *        Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a
     *        single model, and model evaluation job that use human workers support two models.
     */

    public void setInferenceConfig(EvaluationInferenceConfig inferenceConfig) {
        this.inferenceConfig = inferenceConfig;
    }

    /**
     * <p>
     * Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a single
     * model, and model evaluation job that use human workers support two models.
     * </p>
     * 
     * @return Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support
     *         a single model, and model evaluation job that use human workers support two models.
     */

    public EvaluationInferenceConfig getInferenceConfig() {
        return this.inferenceConfig;
    }

    /**
     * <p>
     * Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a single
     * model, and model evaluation job that use human workers support two models.
     * </p>
     * 
     * @param inferenceConfig
     *        Specify the models you want to use in your model evaluation job. Automatic model evaluation jobs support a
     *        single model, and model evaluation job that use human workers support two models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withInferenceConfig(EvaluationInferenceConfig inferenceConfig) {
        setInferenceConfig(inferenceConfig);
        return this;
    }

    /**
     * <p>
     * An object that defines where the results of model evaluation job will be saved in Amazon S3.
     * </p>
     * 
     * @param outputDataConfig
     *        An object that defines where the results of model evaluation job will be saved in Amazon S3.
     */

    public void setOutputDataConfig(EvaluationOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * An object that defines where the results of model evaluation job will be saved in Amazon S3.
     * </p>
     * 
     * @return An object that defines where the results of model evaluation job will be saved in Amazon S3.
     */

    public EvaluationOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * An object that defines where the results of model evaluation job will be saved in Amazon S3.
     * </p>
     * 
     * @param outputDataConfig
     *        An object that defines where the results of model evaluation job will be saved in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEvaluationJobRequest withOutputDataConfig(EvaluationOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
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
        if (getJobDescription() != null)
            sb.append("JobDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCustomerEncryptionKeyId() != null)
            sb.append("CustomerEncryptionKeyId: ").append(getCustomerEncryptionKeyId()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getEvaluationConfig() != null)
            sb.append("EvaluationConfig: ").append(getEvaluationConfig()).append(",");
        if (getInferenceConfig() != null)
            sb.append("InferenceConfig: ").append(getInferenceConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEvaluationJobRequest == false)
            return false;
        CreateEvaluationJobRequest other = (CreateEvaluationJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCustomerEncryptionKeyId() == null ^ this.getCustomerEncryptionKeyId() == null)
            return false;
        if (other.getCustomerEncryptionKeyId() != null && other.getCustomerEncryptionKeyId().equals(this.getCustomerEncryptionKeyId()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyId() == null) ? 0 : getCustomerEncryptionKeyId().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getEvaluationConfig() == null) ? 0 : getEvaluationConfig().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfig() == null) ? 0 : getInferenceConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateEvaluationJobRequest clone() {
        return (CreateEvaluationJobRequest) super.clone();
    }

}
