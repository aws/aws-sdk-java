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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoMLJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     */
    private java.util.List<AutoMLChannel> inputDataConfig;
    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to
     * the input data location and write permission to the output data location in Amazon S3.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Returns the job's objective.
     * </p>
     */
    private AutoMLJobObjective autoMLJobObjective;
    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     */
    private String problemType;
    /**
     * <p>
     * Returns the job's config.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;
    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Returns the job's end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     */
    private AutoMLCandidate bestCandidate;
    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     */
    private String autoMLJobStatus;
    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     */
    private String autoMLJobSecondaryStatus;
    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;
    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     */
    private AutoMLJobArtifacts autoMLJobArtifacts;
    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     * provided by you. If you do provide them, then they'll be the same as provided.
     * </p>
     */
    private ResolvedAttributes resolvedAttributes;

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of a job.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * 
     * @return Returns the name of a job.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of a job.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the job's ARN.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * 
     * @return Returns the job's ARN.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * Returns the job's ARN.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the job's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * 
     * @return Returns the job's input data config.
     */

    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the job's input data config.
     */

    public void setInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<AutoMLChannel>(inputDataConfig);
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the job's input data config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withInputDataConfig(AutoMLChannel... inputDataConfig) {
        if (this.inputDataConfig == null) {
            setInputDataConfig(new java.util.ArrayList<AutoMLChannel>(inputDataConfig.length));
        }
        for (AutoMLChannel ele : inputDataConfig) {
            this.inputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the job's input data config.
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the job's input data config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withInputDataConfig(java.util.Collection<AutoMLChannel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     * 
     * @param outputDataConfig
     *        Returns the job's output data config.
     */

    public void setOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     * 
     * @return Returns the job's output data config.
     */

    public AutoMLOutputDataConfig getOutputDataConfig() {
        return this.outputDataConfig;
    }

    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     * 
     * @param outputDataConfig
     *        Returns the job's output data config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to
     * the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read
     *        permission to the input data location and write permission to the output data location in Amazon S3.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to
     * the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read
     *         permission to the input data location and write permission to the output data location in Amazon S3.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read permission to
     * the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that has read
     *        permission to the input data location and write permission to the output data location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Returns the job's objective.
     */

    public void setAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        this.autoMLJobObjective = autoMLJobObjective;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     * 
     * @return Returns the job's objective.
     */

    public AutoMLJobObjective getAutoMLJobObjective() {
        return this.autoMLJobObjective;
    }

    /**
     * <p>
     * Returns the job's objective.
     * </p>
     * 
     * @param autoMLJobObjective
     *        Returns the job's objective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
        return this;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * 
     * @param problemType
     *        Returns the job's problem type.
     * @see ProblemType
     */

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * 
     * @return Returns the job's problem type.
     * @see ProblemType
     */

    public String getProblemType() {
        return this.problemType;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * 
     * @param problemType
     *        Returns the job's problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public DescribeAutoMLJobResult withProblemType(String problemType) {
        setProblemType(problemType);
        return this;
    }

    /**
     * <p>
     * Returns the job's problem type.
     * </p>
     * 
     * @param problemType
     *        Returns the job's problem type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProblemType
     */

    public DescribeAutoMLJobResult withProblemType(ProblemType problemType) {
        this.problemType = problemType.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Returns the job's config.
     */

    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     * 
     * @return Returns the job's config.
     */

    public AutoMLJobConfig getAutoMLJobConfig() {
        return this.autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the job's config.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Returns the job's config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        setAutoMLJobConfig(autoMLJobConfig);
        return this;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     * 
     * @param creationTime
     *        Returns the job's creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     * 
     * @return Returns the job's creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Returns the job's creation time.
     * </p>
     * 
     * @param creationTime
     *        Returns the job's creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     * 
     * @param endTime
     *        Returns the job's end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     * 
     * @return Returns the job's end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Returns the job's end time.
     * </p>
     * 
     * @param endTime
     *        Returns the job's end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        Returns the job's last modified time.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     * 
     * @return Returns the job's last modified time.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Returns the job's last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        Returns the job's last modified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * 
     * @param failureReason
     *        Returns the job's FailureReason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * 
     * @return Returns the job's FailureReason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Returns the job's FailureReason.
     * </p>
     * 
     * @param failureReason
     *        Returns the job's FailureReason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     * 
     * @param bestCandidate
     *        Returns the job's BestCandidate.
     */

    public void setBestCandidate(AutoMLCandidate bestCandidate) {
        this.bestCandidate = bestCandidate;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     * 
     * @return Returns the job's BestCandidate.
     */

    public AutoMLCandidate getBestCandidate() {
        return this.bestCandidate;
    }

    /**
     * <p>
     * Returns the job's BestCandidate.
     * </p>
     * 
     * @param bestCandidate
     *        Returns the job's BestCandidate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withBestCandidate(AutoMLCandidate bestCandidate) {
        setBestCandidate(bestCandidate);
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the job's AutoMLJobStatus.
     * @see AutoMLJobStatus
     */

    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * 
     * @return Returns the job's AutoMLJobStatus.
     * @see AutoMLJobStatus
     */

    public String getAutoMLJobStatus() {
        return this.autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the job's AutoMLJobStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobStatus(String autoMLJobStatus) {
        setAutoMLJobStatus(autoMLJobStatus);
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobStatus.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the job's AutoMLJobStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the job's AutoMLJobSecondaryStatus.
     * @see AutoMLJobSecondaryStatus
     */

    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * 
     * @return Returns the job's AutoMLJobSecondaryStatus.
     * @see AutoMLJobSecondaryStatus
     */

    public String getAutoMLJobSecondaryStatus() {
        return this.autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the job's AutoMLJobSecondaryStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        setAutoMLJobSecondaryStatus(autoMLJobSecondaryStatus);
        return this;
    }

    /**
     * <p>
     * Returns the job's AutoMLJobSecondaryStatus.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the job's AutoMLJobSecondaryStatus.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Returns the job's output from GenerateCandidateDefinitionsOnly.
     */

    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     * 
     * @return Returns the job's output from GenerateCandidateDefinitionsOnly.
     */

    public Boolean getGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Returns the job's output from GenerateCandidateDefinitionsOnly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        setGenerateCandidateDefinitionsOnly(generateCandidateDefinitionsOnly);
        return this;
    }

    /**
     * <p>
     * Returns the job's output from GenerateCandidateDefinitionsOnly.
     * </p>
     * 
     * @return Returns the job's output from GenerateCandidateDefinitionsOnly.
     */

    public Boolean isGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     * 
     * @param autoMLJobArtifacts
     *        Returns information on the job's artifacts found in AutoMLJobArtifacts.
     */

    public void setAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        this.autoMLJobArtifacts = autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     * 
     * @return Returns information on the job's artifacts found in AutoMLJobArtifacts.
     */

    public AutoMLJobArtifacts getAutoMLJobArtifacts() {
        return this.autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * </p>
     * 
     * @param autoMLJobArtifacts
     *        Returns information on the job's artifacts found in AutoMLJobArtifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        setAutoMLJobArtifacts(autoMLJobArtifacts);
        return this;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     * provided by you. If you do provide them, then they'll be the same as provided.
     * </p>
     * 
     * @param resolvedAttributes
     *        This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     *        provided by you. If you do provide them, then they'll be the same as provided.
     */

    public void setResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        this.resolvedAttributes = resolvedAttributes;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     * provided by you. If you do provide them, then they'll be the same as provided.
     * </p>
     * 
     * @return This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if
     *         not provided by you. If you do provide them, then they'll be the same as provided.
     */

    public ResolvedAttributes getResolvedAttributes() {
        return this.resolvedAttributes;
    }

    /**
     * <p>
     * This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     * provided by you. If you do provide them, then they'll be the same as provided.
     * </p>
     * 
     * @param resolvedAttributes
     *        This contains ProblemType, AutoMLJobObjective and CompletionCriteria. They're auto-inferred values, if not
     *        provided by you. If you do provide them, then they'll be the same as provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        setResolvedAttributes(resolvedAttributes);
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: ").append(getAutoMLJobName()).append(",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: ").append(getAutoMLJobArn()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: ").append(getAutoMLJobObjective()).append(",");
        if (getProblemType() != null)
            sb.append("ProblemType: ").append(getProblemType()).append(",");
        if (getAutoMLJobConfig() != null)
            sb.append("AutoMLJobConfig: ").append(getAutoMLJobConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getBestCandidate() != null)
            sb.append("BestCandidate: ").append(getBestCandidate()).append(",");
        if (getAutoMLJobStatus() != null)
            sb.append("AutoMLJobStatus: ").append(getAutoMLJobStatus()).append(",");
        if (getAutoMLJobSecondaryStatus() != null)
            sb.append("AutoMLJobSecondaryStatus: ").append(getAutoMLJobSecondaryStatus()).append(",");
        if (getGenerateCandidateDefinitionsOnly() != null)
            sb.append("GenerateCandidateDefinitionsOnly: ").append(getGenerateCandidateDefinitionsOnly()).append(",");
        if (getAutoMLJobArtifacts() != null)
            sb.append("AutoMLJobArtifacts: ").append(getAutoMLJobArtifacts()).append(",");
        if (getResolvedAttributes() != null)
            sb.append("ResolvedAttributes: ").append(getResolvedAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutoMLJobResult == false)
            return false;
        DescribeAutoMLJobResult other = (DescribeAutoMLJobResult) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAutoMLJobObjective() == null ^ this.getAutoMLJobObjective() == null)
            return false;
        if (other.getAutoMLJobObjective() != null && other.getAutoMLJobObjective().equals(this.getAutoMLJobObjective()) == false)
            return false;
        if (other.getProblemType() == null ^ this.getProblemType() == null)
            return false;
        if (other.getProblemType() != null && other.getProblemType().equals(this.getProblemType()) == false)
            return false;
        if (other.getAutoMLJobConfig() == null ^ this.getAutoMLJobConfig() == null)
            return false;
        if (other.getAutoMLJobConfig() != null && other.getAutoMLJobConfig().equals(this.getAutoMLJobConfig()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getBestCandidate() == null ^ this.getBestCandidate() == null)
            return false;
        if (other.getBestCandidate() != null && other.getBestCandidate().equals(this.getBestCandidate()) == false)
            return false;
        if (other.getAutoMLJobStatus() == null ^ this.getAutoMLJobStatus() == null)
            return false;
        if (other.getAutoMLJobStatus() != null && other.getAutoMLJobStatus().equals(this.getAutoMLJobStatus()) == false)
            return false;
        if (other.getAutoMLJobSecondaryStatus() == null ^ this.getAutoMLJobSecondaryStatus() == null)
            return false;
        if (other.getAutoMLJobSecondaryStatus() != null && other.getAutoMLJobSecondaryStatus().equals(this.getAutoMLJobSecondaryStatus()) == false)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() == null ^ this.getGenerateCandidateDefinitionsOnly() == null)
            return false;
        if (other.getGenerateCandidateDefinitionsOnly() != null
                && other.getGenerateCandidateDefinitionsOnly().equals(this.getGenerateCandidateDefinitionsOnly()) == false)
            return false;
        if (other.getAutoMLJobArtifacts() == null ^ this.getAutoMLJobArtifacts() == null)
            return false;
        if (other.getAutoMLJobArtifacts() != null && other.getAutoMLJobArtifacts().equals(this.getAutoMLJobArtifacts()) == false)
            return false;
        if (other.getResolvedAttributes() == null ^ this.getResolvedAttributes() == null)
            return false;
        if (other.getResolvedAttributes() != null && other.getResolvedAttributes().equals(this.getResolvedAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode + ((getProblemType() == null) ? 0 : getProblemType().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobConfig() == null) ? 0 : getAutoMLJobConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getBestCandidate() == null) ? 0 : getBestCandidate().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getGenerateCandidateDefinitionsOnly() == null) ? 0 : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArtifacts() == null) ? 0 : getAutoMLJobArtifacts().hashCode());
        hashCode = prime * hashCode + ((getResolvedAttributes() == null) ? 0 : getResolvedAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoMLJobResult clone() {
        try {
            return (DescribeAutoMLJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
