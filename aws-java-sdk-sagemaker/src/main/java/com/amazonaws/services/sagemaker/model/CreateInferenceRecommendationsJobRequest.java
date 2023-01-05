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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateInferenceRecommendationsJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInferenceRecommendationsJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the recommendation job. The name must be unique within the Amazon Web Services Region and within your
     * Amazon Web Services account.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance recommendation and
     * <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will
     * run an instance recommendation (<code>DEFAULT</code>) job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations.
     * </p>
     */
    private RecommendationJobInputConfig inputConfig;
    /**
     * <p>
     * Description of the recommendation job.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     */
    private RecommendationJobStoppingConditions stoppingConditions;
    /**
     * <p>
     * Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side encryption.
     * </p>
     */
    private RecommendationJobOutputConfig outputConfig;
    /**
     * <p>
     * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag
     * consists of a key and a value, both of which you define. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * in the Amazon Web Services General Reference.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A name for the recommendation job. The name must be unique within the Amazon Web Services Region and within your
     * Amazon Web Services account.
     * </p>
     * 
     * @param jobName
     *        A name for the recommendation job. The name must be unique within the Amazon Web Services Region and
     *        within your Amazon Web Services account.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * A name for the recommendation job. The name must be unique within the Amazon Web Services Region and within your
     * Amazon Web Services account.
     * </p>
     * 
     * @return A name for the recommendation job. The name must be unique within the Amazon Web Services Region and
     *         within your Amazon Web Services account.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * A name for the recommendation job. The name must be unique within the Amazon Web Services Region and within your
     * Amazon Web Services account.
     * </p>
     * 
     * @param jobName
     *        A name for the recommendation job. The name must be unique within the Amazon Web Services Region and
     *        within your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance recommendation and
     * <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will
     * run an instance recommendation (<code>DEFAULT</code>) job.
     * </p>
     * 
     * @param jobType
     *        Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance
     *        recommendation and <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker
     *        Inference Recommender will run an instance recommendation (<code>DEFAULT</code>) job.
     * @see RecommendationJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance recommendation and
     * <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will
     * run an instance recommendation (<code>DEFAULT</code>) job.
     * </p>
     * 
     * @return Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance
     *         recommendation and <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker
     *         Inference Recommender will run an instance recommendation (<code>DEFAULT</code>) job.
     * @see RecommendationJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance recommendation and
     * <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will
     * run an instance recommendation (<code>DEFAULT</code>) job.
     * </p>
     * 
     * @param jobType
     *        Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance
     *        recommendation and <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker
     *        Inference Recommender will run an instance recommendation (<code>DEFAULT</code>) job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public CreateInferenceRecommendationsJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance recommendation and
     * <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker Inference Recommender will
     * run an instance recommendation (<code>DEFAULT</code>) job.
     * </p>
     * 
     * @param jobType
     *        Defines the type of recommendation job. Specify <code>Default</code> to initiate an instance
     *        recommendation and <code>Advanced</code> to initiate a load test. If left unspecified, Amazon SageMaker
     *        Inference Recommender will run an instance recommendation (<code>DEFAULT</code>) job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public CreateInferenceRecommendationsJobRequest withJobType(RecommendationJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations.
     * </p>
     * 
     * @param inputConfig
     *        Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern,
     *        and endpoint configurations.
     */

    public void setInputConfig(RecommendationJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations.
     * </p>
     * 
     * @return Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern,
     *         and endpoint configurations.
     */

    public RecommendationJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations.
     * </p>
     * 
     * @param inputConfig
     *        Provides information about the versioned model package Amazon Resource Name (ARN), the traffic pattern,
     *        and endpoint configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withInputConfig(RecommendationJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * Description of the recommendation job.
     * </p>
     * 
     * @param jobDescription
     *        Description of the recommendation job.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * Description of the recommendation job.
     * </p>
     * 
     * @return Description of the recommendation job.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * Description of the recommendation job.
     * </p>
     * 
     * @param jobDescription
     *        Description of the recommendation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is
     *        automatically stopped.
     */

    public void setStoppingConditions(RecommendationJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @return A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is
     *         automatically stopped.
     */

    public RecommendationJobStoppingConditions getStoppingConditions() {
        return this.stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping a recommendation job. If any of the conditions are met, the job is
     *        automatically stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withStoppingConditions(RecommendationJobStoppingConditions stoppingConditions) {
        setStoppingConditions(stoppingConditions);
        return this;
    }

    /**
     * <p>
     * Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side encryption.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side
     *        encryption.
     */

    public void setOutputConfig(RecommendationJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side encryption.
     * </p>
     * 
     * @return Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side
     *         encryption.
     */

    public RecommendationJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side encryption.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output artifacts and the KMS key to use for Amazon S3 server-side
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withOutputConfig(RecommendationJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag
     * consists of a key and a value, both of which you define. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The metadata that you apply to Amazon Web Services resources to help you categorize and organize them.
     *         Each tag consists of a key and a value, both of which you define. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a> in the Amazon Web Services General Reference.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag
     * consists of a key and a value, both of which you define. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to Amazon Web Services resources to help you categorize and organize them.
     *        Each tag consists of a key and a value, both of which you define. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> in the Amazon Web Services General Reference.
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
     * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag
     * consists of a key and a value, both of which you define. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to Amazon Web Services resources to help you categorize and organize them.
     *        Each tag consists of a key and a value, both of which you define. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withTags(Tag... tags) {
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
     * The metadata that you apply to Amazon Web Services resources to help you categorize and organize them. Each tag
     * consists of a key and a value, both of which you define. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>
     * in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to Amazon Web Services resources to help you categorize and organize them.
     *        Each tag consists of a key and a value, both of which you define. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceRecommendationsJobRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getJobDescription() != null)
            sb.append("JobDescription: ").append(getJobDescription()).append(",");
        if (getStoppingConditions() != null)
            sb.append("StoppingConditions: ").append(getStoppingConditions()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
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

        if (obj instanceof CreateInferenceRecommendationsJobRequest == false)
            return false;
        CreateInferenceRecommendationsJobRequest other = (CreateInferenceRecommendationsJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getStoppingConditions() == null ^ this.getStoppingConditions() == null)
            return false;
        if (other.getStoppingConditions() != null && other.getStoppingConditions().equals(this.getStoppingConditions()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
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

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
        hashCode = prime * hashCode + ((getStoppingConditions() == null) ? 0 : getStoppingConditions().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInferenceRecommendationsJobRequest clone() {
        return (CreateInferenceRecommendationsJobRequest) super.clone();
    }

}
