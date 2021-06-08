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
     * Returns the name of the AutoML job.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * Returns the ARN of the AutoML job.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * Returns the input data configuration for the AutoML job..
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
     * Returns the configuration for the AutoML job.
     * </p>
     */
    private AutoMLJobConfig autoMLJobConfig;
    /**
     * <p>
     * Returns the creation time of the AutoML job.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Returns the end time of the AutoML job.
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
     * Returns the failure reason for an AutoML job, when applicable.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job.
     * </p>
     */
    private java.util.List<AutoMLPartialFailureReason> partialFailureReasons;
    /**
     * <p>
     * Returns the job's best <code>AutoMLCandidate</code>.
     * </p>
     */
    private AutoMLCandidate bestCandidate;
    /**
     * <p>
     * Returns the status of the AutoML job.
     * </p>
     */
    private String autoMLJobStatus;
    /**
     * <p>
     * Returns the secondary status of the AutoML job.
     * </p>
     */
    private String autoMLJobSecondaryStatus;
    /**
     * <p>
     * Indicates whether the output for an AutoML job generates candidate definitions only.
     * </p>
     */
    private Boolean generateCandidateDefinitionsOnly;
    /**
     * <p>
     * Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     * </p>
     */
    private AutoMLJobArtifacts autoMLJobArtifacts;
    /**
     * <p>
     * This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and <code>CompletionCriteria</code>. If
     * you do not provide these values, they are auto-inferred. If you do provide them, the values used are the ones you
     * provide.
     * </p>
     */
    private ResolvedAttributes resolvedAttributes;
    /**
     * <p>
     * Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if deployed
     * automatically.
     * </p>
     */
    private ModelDeployConfig modelDeployConfig;
    /**
     * <p>
     * Provides information about endpoint for the model deployment.
     * </p>
     */
    private ModelDeployResult modelDeployResult;

    /**
     * <p>
     * Returns the name of the AutoML job.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of the AutoML job.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of the AutoML job.
     * </p>
     * 
     * @return Returns the name of the AutoML job.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of the AutoML job.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * Returns the ARN of the AutoML job.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the ARN of the AutoML job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * Returns the ARN of the AutoML job.
     * </p>
     * 
     * @return Returns the ARN of the AutoML job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * Returns the ARN of the AutoML job.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the ARN of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * Returns the input data configuration for the AutoML job..
     * </p>
     * 
     * @return Returns the input data configuration for the AutoML job..
     */

    public java.util.List<AutoMLChannel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Returns the input data configuration for the AutoML job..
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the input data configuration for the AutoML job..
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
     * Returns the input data configuration for the AutoML job..
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDataConfig(java.util.Collection)} or {@link #withInputDataConfig(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the input data configuration for the AutoML job..
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
     * Returns the input data configuration for the AutoML job..
     * </p>
     * 
     * @param inputDataConfig
     *        Returns the input data configuration for the AutoML job..
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
     * Returns the configuration for the AutoML job.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Returns the configuration for the AutoML job.
     */

    public void setAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        this.autoMLJobConfig = autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the configuration for the AutoML job.
     * </p>
     * 
     * @return Returns the configuration for the AutoML job.
     */

    public AutoMLJobConfig getAutoMLJobConfig() {
        return this.autoMLJobConfig;
    }

    /**
     * <p>
     * Returns the configuration for the AutoML job.
     * </p>
     * 
     * @param autoMLJobConfig
     *        Returns the configuration for the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobConfig(AutoMLJobConfig autoMLJobConfig) {
        setAutoMLJobConfig(autoMLJobConfig);
        return this;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job.
     * </p>
     * 
     * @param creationTime
     *        Returns the creation time of the AutoML job.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job.
     * </p>
     * 
     * @return Returns the creation time of the AutoML job.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job.
     * </p>
     * 
     * @param creationTime
     *        Returns the creation time of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job.
     * </p>
     * 
     * @param endTime
     *        Returns the end time of the AutoML job.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job.
     * </p>
     * 
     * @return Returns the end time of the AutoML job.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job.
     * </p>
     * 
     * @param endTime
     *        Returns the end time of the AutoML job.
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
     * Returns the failure reason for an AutoML job, when applicable.
     * </p>
     * 
     * @param failureReason
     *        Returns the failure reason for an AutoML job, when applicable.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Returns the failure reason for an AutoML job, when applicable.
     * </p>
     * 
     * @return Returns the failure reason for an AutoML job, when applicable.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Returns the failure reason for an AutoML job, when applicable.
     * </p>
     * 
     * @param failureReason
     *        Returns the failure reason for an AutoML job, when applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job.
     * </p>
     * 
     * @return Returns a list of reasons for partial failures within an AutoML job.
     */

    public java.util.List<AutoMLPartialFailureReason> getPartialFailureReasons() {
        return partialFailureReasons;
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job.
     */

    public void setPartialFailureReasons(java.util.Collection<AutoMLPartialFailureReason> partialFailureReasons) {
        if (partialFailureReasons == null) {
            this.partialFailureReasons = null;
            return;
        }

        this.partialFailureReasons = new java.util.ArrayList<AutoMLPartialFailureReason>(partialFailureReasons);
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartialFailureReasons(java.util.Collection)} or
     * {@link #withPartialFailureReasons(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withPartialFailureReasons(AutoMLPartialFailureReason... partialFailureReasons) {
        if (this.partialFailureReasons == null) {
            setPartialFailureReasons(new java.util.ArrayList<AutoMLPartialFailureReason>(partialFailureReasons.length));
        }
        for (AutoMLPartialFailureReason ele : partialFailureReasons) {
            this.partialFailureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withPartialFailureReasons(java.util.Collection<AutoMLPartialFailureReason> partialFailureReasons) {
        setPartialFailureReasons(partialFailureReasons);
        return this;
    }

    /**
     * <p>
     * Returns the job's best <code>AutoMLCandidate</code>.
     * </p>
     * 
     * @param bestCandidate
     *        Returns the job's best <code>AutoMLCandidate</code>.
     */

    public void setBestCandidate(AutoMLCandidate bestCandidate) {
        this.bestCandidate = bestCandidate;
    }

    /**
     * <p>
     * Returns the job's best <code>AutoMLCandidate</code>.
     * </p>
     * 
     * @return Returns the job's best <code>AutoMLCandidate</code>.
     */

    public AutoMLCandidate getBestCandidate() {
        return this.bestCandidate;
    }

    /**
     * <p>
     * Returns the job's best <code>AutoMLCandidate</code>.
     * </p>
     * 
     * @param bestCandidate
     *        Returns the job's best <code>AutoMLCandidate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withBestCandidate(AutoMLCandidate bestCandidate) {
        setBestCandidate(bestCandidate);
        return this;
    }

    /**
     * <p>
     * Returns the status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job.
     * @see AutoMLJobStatus
     */

    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the status of the AutoML job.
     * </p>
     * 
     * @return Returns the status of the AutoML job.
     * @see AutoMLJobStatus
     */

    public String getAutoMLJobStatus() {
        return this.autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobStatus(String autoMLJobStatus) {
        setAutoMLJobStatus(autoMLJobStatus);
        return this;
    }

    /**
     * <p>
     * Returns the status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job.
     * @see AutoMLJobSecondaryStatus
     */

    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job.
     * </p>
     * 
     * @return Returns the secondary status of the AutoML job.
     * @see AutoMLJobSecondaryStatus
     */

    public String getAutoMLJobSecondaryStatus() {
        return this.autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        setAutoMLJobSecondaryStatus(autoMLJobSecondaryStatus);
        return this;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobResult withAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the output for an AutoML job generates candidate definitions only.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Indicates whether the output for an AutoML job generates candidate definitions only.
     */

    public void setGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        this.generateCandidateDefinitionsOnly = generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Indicates whether the output for an AutoML job generates candidate definitions only.
     * </p>
     * 
     * @return Indicates whether the output for an AutoML job generates candidate definitions only.
     */

    public Boolean getGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Indicates whether the output for an AutoML job generates candidate definitions only.
     * </p>
     * 
     * @param generateCandidateDefinitionsOnly
     *        Indicates whether the output for an AutoML job generates candidate definitions only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withGenerateCandidateDefinitionsOnly(Boolean generateCandidateDefinitionsOnly) {
        setGenerateCandidateDefinitionsOnly(generateCandidateDefinitionsOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether the output for an AutoML job generates candidate definitions only.
     * </p>
     * 
     * @return Indicates whether the output for an AutoML job generates candidate definitions only.
     */

    public Boolean isGenerateCandidateDefinitionsOnly() {
        return this.generateCandidateDefinitionsOnly;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     * </p>
     * 
     * @param autoMLJobArtifacts
     *        Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     */

    public void setAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        this.autoMLJobArtifacts = autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     * </p>
     * 
     * @return Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     */

    public AutoMLJobArtifacts getAutoMLJobArtifacts() {
        return this.autoMLJobArtifacts;
    }

    /**
     * <p>
     * Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     * </p>
     * 
     * @param autoMLJobArtifacts
     *        Returns information on the job's artifacts found in <code>AutoMLJobArtifacts</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        setAutoMLJobArtifacts(autoMLJobArtifacts);
        return this;
    }

    /**
     * <p>
     * This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and <code>CompletionCriteria</code>. If
     * you do not provide these values, they are auto-inferred. If you do provide them, the values used are the ones you
     * provide.
     * </p>
     * 
     * @param resolvedAttributes
     *        This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and
     *        <code>CompletionCriteria</code>. If you do not provide these values, they are auto-inferred. If you do
     *        provide them, the values used are the ones you provide.
     */

    public void setResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        this.resolvedAttributes = resolvedAttributes;
    }

    /**
     * <p>
     * This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and <code>CompletionCriteria</code>. If
     * you do not provide these values, they are auto-inferred. If you do provide them, the values used are the ones you
     * provide.
     * </p>
     * 
     * @return This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and
     *         <code>CompletionCriteria</code>. If you do not provide these values, they are auto-inferred. If you do
     *         provide them, the values used are the ones you provide.
     */

    public ResolvedAttributes getResolvedAttributes() {
        return this.resolvedAttributes;
    }

    /**
     * <p>
     * This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and <code>CompletionCriteria</code>. If
     * you do not provide these values, they are auto-inferred. If you do provide them, the values used are the ones you
     * provide.
     * </p>
     * 
     * @param resolvedAttributes
     *        This contains <code>ProblemType</code>, <code>AutoMLJobObjective</code> and
     *        <code>CompletionCriteria</code>. If you do not provide these values, they are auto-inferred. If you do
     *        provide them, the values used are the ones you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withResolvedAttributes(ResolvedAttributes resolvedAttributes) {
        setResolvedAttributes(resolvedAttributes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if deployed
     * automatically.
     * </p>
     * 
     * @param modelDeployConfig
     *        Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if
     *        deployed automatically.
     */

    public void setModelDeployConfig(ModelDeployConfig modelDeployConfig) {
        this.modelDeployConfig = modelDeployConfig;
    }

    /**
     * <p>
     * Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if deployed
     * automatically.
     * </p>
     * 
     * @return Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if
     *         deployed automatically.
     */

    public ModelDeployConfig getModelDeployConfig() {
        return this.modelDeployConfig;
    }

    /**
     * <p>
     * Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if deployed
     * automatically.
     * </p>
     * 
     * @param modelDeployConfig
     *        Indicates whether the model was deployed automatically to an endpoint and the name of that endpoint if
     *        deployed automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withModelDeployConfig(ModelDeployConfig modelDeployConfig) {
        setModelDeployConfig(modelDeployConfig);
        return this;
    }

    /**
     * <p>
     * Provides information about endpoint for the model deployment.
     * </p>
     * 
     * @param modelDeployResult
     *        Provides information about endpoint for the model deployment.
     */

    public void setModelDeployResult(ModelDeployResult modelDeployResult) {
        this.modelDeployResult = modelDeployResult;
    }

    /**
     * <p>
     * Provides information about endpoint for the model deployment.
     * </p>
     * 
     * @return Provides information about endpoint for the model deployment.
     */

    public ModelDeployResult getModelDeployResult() {
        return this.modelDeployResult;
    }

    /**
     * <p>
     * Provides information about endpoint for the model deployment.
     * </p>
     * 
     * @param modelDeployResult
     *        Provides information about endpoint for the model deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobResult withModelDeployResult(ModelDeployResult modelDeployResult) {
        setModelDeployResult(modelDeployResult);
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
        if (getPartialFailureReasons() != null)
            sb.append("PartialFailureReasons: ").append(getPartialFailureReasons()).append(",");
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
            sb.append("ResolvedAttributes: ").append(getResolvedAttributes()).append(",");
        if (getModelDeployConfig() != null)
            sb.append("ModelDeployConfig: ").append(getModelDeployConfig()).append(",");
        if (getModelDeployResult() != null)
            sb.append("ModelDeployResult: ").append(getModelDeployResult());
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
        if (other.getPartialFailureReasons() == null ^ this.getPartialFailureReasons() == null)
            return false;
        if (other.getPartialFailureReasons() != null && other.getPartialFailureReasons().equals(this.getPartialFailureReasons()) == false)
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
        if (other.getModelDeployConfig() == null ^ this.getModelDeployConfig() == null)
            return false;
        if (other.getModelDeployConfig() != null && other.getModelDeployConfig().equals(this.getModelDeployConfig()) == false)
            return false;
        if (other.getModelDeployResult() == null ^ this.getModelDeployResult() == null)
            return false;
        if (other.getModelDeployResult() != null && other.getModelDeployResult().equals(this.getModelDeployResult()) == false)
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
        hashCode = prime * hashCode + ((getPartialFailureReasons() == null) ? 0 : getPartialFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getBestCandidate() == null) ? 0 : getBestCandidate().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getGenerateCandidateDefinitionsOnly() == null) ? 0 : getGenerateCandidateDefinitionsOnly().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArtifacts() == null) ? 0 : getAutoMLJobArtifacts().hashCode());
        hashCode = prime * hashCode + ((getResolvedAttributes() == null) ? 0 : getResolvedAttributes().hashCode());
        hashCode = prime * hashCode + ((getModelDeployConfig() == null) ? 0 : getModelDeployConfig().hashCode());
        hashCode = prime * hashCode + ((getModelDeployResult() == null) ? 0 : getModelDeployResult().hashCode());
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
