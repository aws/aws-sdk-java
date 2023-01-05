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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeInferenceRecommendationsJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceRecommendationsJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services
     * account.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job description that you provided when you initiated the job.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * The job type that you provided when you initiated the job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you provided
     * when you initiated the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations you provided when you initiated the job.
     * </p>
     */
    private RecommendationJobInputConfig inputConfig;
    /**
     * <p>
     * The stopping conditions that you provided when you initiated the job.
     * </p>
     */
    private RecommendationJobStoppingConditions stoppingConditions;
    /**
     * <p>
     * The recommendations made by Inference Recommender.
     * </p>
     */
    private java.util.List<InferenceRecommendation> inferenceRecommendations;
    /**
     * <p>
     * The performance results from running an Inference Recommender job on an existing endpoint.
     * </p>
     */
    private java.util.List<EndpointPerformance> endpointPerformances;

    /**
     * <p>
     * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services
     * account.
     * </p>
     * 
     * @param jobName
     *        The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web
     *        Services account.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services
     * account.
     * </p>
     * 
     * @return The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web
     *         Services account.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services
     * account.
     * </p>
     * 
     * @param jobName
     *        The name of the job. The name must be unique within an Amazon Web Services Region in the Amazon Web
     *        Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job description that you provided when you initiated the job.
     * </p>
     * 
     * @param jobDescription
     *        The job description that you provided when you initiated the job.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * The job description that you provided when you initiated the job.
     * </p>
     * 
     * @return The job description that you provided when you initiated the job.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * The job description that you provided when you initiated the job.
     * </p>
     * 
     * @param jobDescription
     *        The job description that you provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * The job type that you provided when you initiated the job.
     * </p>
     * 
     * @param jobType
     *        The job type that you provided when you initiated the job.
     * @see RecommendationJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The job type that you provided when you initiated the job.
     * </p>
     * 
     * @return The job type that you provided when you initiated the job.
     * @see RecommendationJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The job type that you provided when you initiated the job.
     * </p>
     * 
     * @param jobType
     *        The job type that you provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public DescribeInferenceRecommendationsJobResult withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The job type that you provided when you initiated the job.
     * </p>
     * 
     * @param jobType
     *        The job type that you provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobType
     */

    public DescribeInferenceRecommendationsJobResult withJobType(RecommendationJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you provided
     * when you initiated the job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you
     *        provided when you initiated the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you provided
     * when you initiated the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you
     *         provided when you initiated the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you provided
     * when you initiated the job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role you
     *        provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @see RecommendationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @return The status of the job.
     * @see RecommendationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public DescribeInferenceRecommendationsJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * 
     * @param status
     *        The status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationJobStatus
     */

    public DescribeInferenceRecommendationsJobResult withStatus(RecommendationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @return A timestamp that shows when the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @return A timestamp that shows when the job completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @return A timestamp that shows when the job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @param failureReason
     *        If the job fails, provides information why the job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @return If the job fails, provides information why the job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the job fails, provides information why the job failed.
     * </p>
     * 
     * @param failureReason
     *        If the job fails, provides information why the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations you provided when you initiated the job.
     * </p>
     * 
     * @param inputConfig
     *        Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     *        endpoint configurations you provided when you initiated the job.
     */

    public void setInputConfig(RecommendationJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations you provided when you initiated the job.
     * </p>
     * 
     * @return Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern,
     *         and endpoint configurations you provided when you initiated the job.
     */

    public RecommendationJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     * endpoint configurations you provided when you initiated the job.
     * </p>
     * 
     * @param inputConfig
     *        Returns information about the versioned model package Amazon Resource Name (ARN), the traffic pattern, and
     *        endpoint configurations you provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withInputConfig(RecommendationJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * The stopping conditions that you provided when you initiated the job.
     * </p>
     * 
     * @param stoppingConditions
     *        The stopping conditions that you provided when you initiated the job.
     */

    public void setStoppingConditions(RecommendationJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * The stopping conditions that you provided when you initiated the job.
     * </p>
     * 
     * @return The stopping conditions that you provided when you initiated the job.
     */

    public RecommendationJobStoppingConditions getStoppingConditions() {
        return this.stoppingConditions;
    }

    /**
     * <p>
     * The stopping conditions that you provided when you initiated the job.
     * </p>
     * 
     * @param stoppingConditions
     *        The stopping conditions that you provided when you initiated the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withStoppingConditions(RecommendationJobStoppingConditions stoppingConditions) {
        setStoppingConditions(stoppingConditions);
        return this;
    }

    /**
     * <p>
     * The recommendations made by Inference Recommender.
     * </p>
     * 
     * @return The recommendations made by Inference Recommender.
     */

    public java.util.List<InferenceRecommendation> getInferenceRecommendations() {
        return inferenceRecommendations;
    }

    /**
     * <p>
     * The recommendations made by Inference Recommender.
     * </p>
     * 
     * @param inferenceRecommendations
     *        The recommendations made by Inference Recommender.
     */

    public void setInferenceRecommendations(java.util.Collection<InferenceRecommendation> inferenceRecommendations) {
        if (inferenceRecommendations == null) {
            this.inferenceRecommendations = null;
            return;
        }

        this.inferenceRecommendations = new java.util.ArrayList<InferenceRecommendation>(inferenceRecommendations);
    }

    /**
     * <p>
     * The recommendations made by Inference Recommender.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceRecommendations(java.util.Collection)} or
     * {@link #withInferenceRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceRecommendations
     *        The recommendations made by Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withInferenceRecommendations(InferenceRecommendation... inferenceRecommendations) {
        if (this.inferenceRecommendations == null) {
            setInferenceRecommendations(new java.util.ArrayList<InferenceRecommendation>(inferenceRecommendations.length));
        }
        for (InferenceRecommendation ele : inferenceRecommendations) {
            this.inferenceRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendations made by Inference Recommender.
     * </p>
     * 
     * @param inferenceRecommendations
     *        The recommendations made by Inference Recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withInferenceRecommendations(java.util.Collection<InferenceRecommendation> inferenceRecommendations) {
        setInferenceRecommendations(inferenceRecommendations);
        return this;
    }

    /**
     * <p>
     * The performance results from running an Inference Recommender job on an existing endpoint.
     * </p>
     * 
     * @return The performance results from running an Inference Recommender job on an existing endpoint.
     */

    public java.util.List<EndpointPerformance> getEndpointPerformances() {
        return endpointPerformances;
    }

    /**
     * <p>
     * The performance results from running an Inference Recommender job on an existing endpoint.
     * </p>
     * 
     * @param endpointPerformances
     *        The performance results from running an Inference Recommender job on an existing endpoint.
     */

    public void setEndpointPerformances(java.util.Collection<EndpointPerformance> endpointPerformances) {
        if (endpointPerformances == null) {
            this.endpointPerformances = null;
            return;
        }

        this.endpointPerformances = new java.util.ArrayList<EndpointPerformance>(endpointPerformances);
    }

    /**
     * <p>
     * The performance results from running an Inference Recommender job on an existing endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointPerformances(java.util.Collection)} or {@link #withEndpointPerformances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param endpointPerformances
     *        The performance results from running an Inference Recommender job on an existing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withEndpointPerformances(EndpointPerformance... endpointPerformances) {
        if (this.endpointPerformances == null) {
            setEndpointPerformances(new java.util.ArrayList<EndpointPerformance>(endpointPerformances.length));
        }
        for (EndpointPerformance ele : endpointPerformances) {
            this.endpointPerformances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The performance results from running an Inference Recommender job on an existing endpoint.
     * </p>
     * 
     * @param endpointPerformances
     *        The performance results from running an Inference Recommender job on an existing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceRecommendationsJobResult withEndpointPerformances(java.util.Collection<EndpointPerformance> endpointPerformances) {
        setEndpointPerformances(endpointPerformances);
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
            sb.append("JobDescription: ").append(getJobDescription()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getStoppingConditions() != null)
            sb.append("StoppingConditions: ").append(getStoppingConditions()).append(",");
        if (getInferenceRecommendations() != null)
            sb.append("InferenceRecommendations: ").append(getInferenceRecommendations()).append(",");
        if (getEndpointPerformances() != null)
            sb.append("EndpointPerformances: ").append(getEndpointPerformances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInferenceRecommendationsJobResult == false)
            return false;
        DescribeInferenceRecommendationsJobResult other = (DescribeInferenceRecommendationsJobResult) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getStoppingConditions() == null ^ this.getStoppingConditions() == null)
            return false;
        if (other.getStoppingConditions() != null && other.getStoppingConditions().equals(this.getStoppingConditions()) == false)
            return false;
        if (other.getInferenceRecommendations() == null ^ this.getInferenceRecommendations() == null)
            return false;
        if (other.getInferenceRecommendations() != null && other.getInferenceRecommendations().equals(this.getInferenceRecommendations()) == false)
            return false;
        if (other.getEndpointPerformances() == null ^ this.getEndpointPerformances() == null)
            return false;
        if (other.getEndpointPerformances() != null && other.getEndpointPerformances().equals(this.getEndpointPerformances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getStoppingConditions() == null) ? 0 : getStoppingConditions().hashCode());
        hashCode = prime * hashCode + ((getInferenceRecommendations() == null) ? 0 : getInferenceRecommendations().hashCode());
        hashCode = prime * hashCode + ((getEndpointPerformances() == null) ? 0 : getEndpointPerformances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInferenceRecommendationsJobResult clone() {
        try {
            return (DescribeInferenceRecommendationsJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
