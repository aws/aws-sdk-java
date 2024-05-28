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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJobV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoMLJobV2Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the name of the AutoML job V2.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * Returns an array of channel objects describing the input data and their location.
     * </p>
     */
    private java.util.List<AutoMLJobChannel> autoMLJobInputDataConfig;
    /**
     * <p>
     * Returns the job's output data config.
     * </p>
     */
    private AutoMLOutputDataConfig outputDataConfig;
    /**
     * <p>
     * The ARN of the IAM role that has read permission to the input data location and write permission to the output
     * data location in Amazon S3.
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
     * Returns the configuration settings of the problem type set for the AutoML job V2.
     * </p>
     */
    private AutoMLProblemTypeConfig autoMLProblemTypeConfig;
    /**
     * <p>
     * Returns the name of the problem type configuration set for the AutoML job V2.
     * </p>
     */
    private String autoMLProblemTypeConfigName;
    /**
     * <p>
     * Returns the creation time of the AutoML job V2.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Returns the end time of the AutoML job V2.
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
     * Returns the reason for the failure of the AutoML job V2, when applicable.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job V2.
     * </p>
     */
    private java.util.List<AutoMLPartialFailureReason> partialFailureReasons;
    /**
     * <p>
     * Information about the candidate produced by an AutoML training job V2, including its status, steps, and other
     * properties.
     * </p>
     */
    private AutoMLCandidate bestCandidate;
    /**
     * <p>
     * Returns the status of the AutoML job V2.
     * </p>
     */
    private String autoMLJobStatus;
    /**
     * <p>
     * Returns the secondary status of the AutoML job V2.
     * </p>
     */
    private String autoMLJobSecondaryStatus;

    private AutoMLJobArtifacts autoMLJobArtifacts;
    /**
     * <p>
     * Returns the resolved attributes used by the AutoML job V2.
     * </p>
     */
    private AutoMLResolvedAttributes resolvedAttributes;
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
     * Returns the configuration settings of how the data are split into train and validation datasets.
     * </p>
     */
    private AutoMLDataSplitConfig dataSplitConfig;
    /**
     * <p>
     * Returns the security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     */
    private AutoMLSecurityConfig securityConfig;

    /**
     * <p>
     * Returns the name of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of the AutoML job V2.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of the AutoML job V2.
     * </p>
     * 
     * @return Returns the name of the AutoML job V2.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * Returns the name of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobName
     *        Returns the name of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     * </p>
     * 
     * @return Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobArn
     *        Returns the Amazon Resource Name (ARN) of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * Returns an array of channel objects describing the input data and their location.
     * </p>
     * 
     * @return Returns an array of channel objects describing the input data and their location.
     */

    public java.util.List<AutoMLJobChannel> getAutoMLJobInputDataConfig() {
        return autoMLJobInputDataConfig;
    }

    /**
     * <p>
     * Returns an array of channel objects describing the input data and their location.
     * </p>
     * 
     * @param autoMLJobInputDataConfig
     *        Returns an array of channel objects describing the input data and their location.
     */

    public void setAutoMLJobInputDataConfig(java.util.Collection<AutoMLJobChannel> autoMLJobInputDataConfig) {
        if (autoMLJobInputDataConfig == null) {
            this.autoMLJobInputDataConfig = null;
            return;
        }

        this.autoMLJobInputDataConfig = new java.util.ArrayList<AutoMLJobChannel>(autoMLJobInputDataConfig);
    }

    /**
     * <p>
     * Returns an array of channel objects describing the input data and their location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoMLJobInputDataConfig(java.util.Collection)} or
     * {@link #withAutoMLJobInputDataConfig(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoMLJobInputDataConfig
     *        Returns an array of channel objects describing the input data and their location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLJobInputDataConfig(AutoMLJobChannel... autoMLJobInputDataConfig) {
        if (this.autoMLJobInputDataConfig == null) {
            setAutoMLJobInputDataConfig(new java.util.ArrayList<AutoMLJobChannel>(autoMLJobInputDataConfig.length));
        }
        for (AutoMLJobChannel ele : autoMLJobInputDataConfig) {
            this.autoMLJobInputDataConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array of channel objects describing the input data and their location.
     * </p>
     * 
     * @param autoMLJobInputDataConfig
     *        Returns an array of channel objects describing the input data and their location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLJobInputDataConfig(java.util.Collection<AutoMLJobChannel> autoMLJobInputDataConfig) {
        setAutoMLJobInputDataConfig(autoMLJobInputDataConfig);
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

    public DescribeAutoMLJobV2Result withOutputDataConfig(AutoMLOutputDataConfig outputDataConfig) {
        setOutputDataConfig(outputDataConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that has read permission to the input data location and write permission to the output
     * data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has read permission to the input data location and write permission to the
     *        output data location in Amazon S3.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has read permission to the input data location and write permission to the output
     * data location in Amazon S3.
     * </p>
     * 
     * @return The ARN of the IAM role that has read permission to the input data location and write permission to the
     *         output data location in Amazon S3.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has read permission to the input data location and write permission to the output
     * data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has read permission to the input data location and write permission to the
     *        output data location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withRoleArn(String roleArn) {
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

    public DescribeAutoMLJobV2Result withAutoMLJobObjective(AutoMLJobObjective autoMLJobObjective) {
        setAutoMLJobObjective(autoMLJobObjective);
        return this;
    }

    /**
     * <p>
     * Returns the configuration settings of the problem type set for the AutoML job V2.
     * </p>
     * 
     * @param autoMLProblemTypeConfig
     *        Returns the configuration settings of the problem type set for the AutoML job V2.
     */

    public void setAutoMLProblemTypeConfig(AutoMLProblemTypeConfig autoMLProblemTypeConfig) {
        this.autoMLProblemTypeConfig = autoMLProblemTypeConfig;
    }

    /**
     * <p>
     * Returns the configuration settings of the problem type set for the AutoML job V2.
     * </p>
     * 
     * @return Returns the configuration settings of the problem type set for the AutoML job V2.
     */

    public AutoMLProblemTypeConfig getAutoMLProblemTypeConfig() {
        return this.autoMLProblemTypeConfig;
    }

    /**
     * <p>
     * Returns the configuration settings of the problem type set for the AutoML job V2.
     * </p>
     * 
     * @param autoMLProblemTypeConfig
     *        Returns the configuration settings of the problem type set for the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLProblemTypeConfig(AutoMLProblemTypeConfig autoMLProblemTypeConfig) {
        setAutoMLProblemTypeConfig(autoMLProblemTypeConfig);
        return this;
    }

    /**
     * <p>
     * Returns the name of the problem type configuration set for the AutoML job V2.
     * </p>
     * 
     * @param autoMLProblemTypeConfigName
     *        Returns the name of the problem type configuration set for the AutoML job V2.
     * @see AutoMLProblemTypeConfigName
     */

    public void setAutoMLProblemTypeConfigName(String autoMLProblemTypeConfigName) {
        this.autoMLProblemTypeConfigName = autoMLProblemTypeConfigName;
    }

    /**
     * <p>
     * Returns the name of the problem type configuration set for the AutoML job V2.
     * </p>
     * 
     * @return Returns the name of the problem type configuration set for the AutoML job V2.
     * @see AutoMLProblemTypeConfigName
     */

    public String getAutoMLProblemTypeConfigName() {
        return this.autoMLProblemTypeConfigName;
    }

    /**
     * <p>
     * Returns the name of the problem type configuration set for the AutoML job V2.
     * </p>
     * 
     * @param autoMLProblemTypeConfigName
     *        Returns the name of the problem type configuration set for the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLProblemTypeConfigName
     */

    public DescribeAutoMLJobV2Result withAutoMLProblemTypeConfigName(String autoMLProblemTypeConfigName) {
        setAutoMLProblemTypeConfigName(autoMLProblemTypeConfigName);
        return this;
    }

    /**
     * <p>
     * Returns the name of the problem type configuration set for the AutoML job V2.
     * </p>
     * 
     * @param autoMLProblemTypeConfigName
     *        Returns the name of the problem type configuration set for the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLProblemTypeConfigName
     */

    public DescribeAutoMLJobV2Result withAutoMLProblemTypeConfigName(AutoMLProblemTypeConfigName autoMLProblemTypeConfigName) {
        this.autoMLProblemTypeConfigName = autoMLProblemTypeConfigName.toString();
        return this;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job V2.
     * </p>
     * 
     * @param creationTime
     *        Returns the creation time of the AutoML job V2.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job V2.
     * </p>
     * 
     * @return Returns the creation time of the AutoML job V2.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Returns the creation time of the AutoML job V2.
     * </p>
     * 
     * @param creationTime
     *        Returns the creation time of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job V2.
     * </p>
     * 
     * @param endTime
     *        Returns the end time of the AutoML job V2.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job V2.
     * </p>
     * 
     * @return Returns the end time of the AutoML job V2.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Returns the end time of the AutoML job V2.
     * </p>
     * 
     * @param endTime
     *        Returns the end time of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withEndTime(java.util.Date endTime) {
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

    public DescribeAutoMLJobV2Result withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Returns the reason for the failure of the AutoML job V2, when applicable.
     * </p>
     * 
     * @param failureReason
     *        Returns the reason for the failure of the AutoML job V2, when applicable.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Returns the reason for the failure of the AutoML job V2, when applicable.
     * </p>
     * 
     * @return Returns the reason for the failure of the AutoML job V2, when applicable.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Returns the reason for the failure of the AutoML job V2, when applicable.
     * </p>
     * 
     * @param failureReason
     *        Returns the reason for the failure of the AutoML job V2, when applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job V2.
     * </p>
     * 
     * @return Returns a list of reasons for partial failures within an AutoML job V2.
     */

    public java.util.List<AutoMLPartialFailureReason> getPartialFailureReasons() {
        return partialFailureReasons;
    }

    /**
     * <p>
     * Returns a list of reasons for partial failures within an AutoML job V2.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job V2.
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
     * Returns a list of reasons for partial failures within an AutoML job V2.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartialFailureReasons(java.util.Collection)} or
     * {@link #withPartialFailureReasons(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withPartialFailureReasons(AutoMLPartialFailureReason... partialFailureReasons) {
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
     * Returns a list of reasons for partial failures within an AutoML job V2.
     * </p>
     * 
     * @param partialFailureReasons
     *        Returns a list of reasons for partial failures within an AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withPartialFailureReasons(java.util.Collection<AutoMLPartialFailureReason> partialFailureReasons) {
        setPartialFailureReasons(partialFailureReasons);
        return this;
    }

    /**
     * <p>
     * Information about the candidate produced by an AutoML training job V2, including its status, steps, and other
     * properties.
     * </p>
     * 
     * @param bestCandidate
     *        Information about the candidate produced by an AutoML training job V2, including its status, steps, and
     *        other properties.
     */

    public void setBestCandidate(AutoMLCandidate bestCandidate) {
        this.bestCandidate = bestCandidate;
    }

    /**
     * <p>
     * Information about the candidate produced by an AutoML training job V2, including its status, steps, and other
     * properties.
     * </p>
     * 
     * @return Information about the candidate produced by an AutoML training job V2, including its status, steps, and
     *         other properties.
     */

    public AutoMLCandidate getBestCandidate() {
        return this.bestCandidate;
    }

    /**
     * <p>
     * Information about the candidate produced by an AutoML training job V2, including its status, steps, and other
     * properties.
     * </p>
     * 
     * @param bestCandidate
     *        Information about the candidate produced by an AutoML training job V2, including its status, steps, and
     *        other properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withBestCandidate(AutoMLCandidate bestCandidate) {
        setBestCandidate(bestCandidate);
        return this;
    }

    /**
     * <p>
     * Returns the status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job V2.
     * @see AutoMLJobStatus
     */

    public void setAutoMLJobStatus(String autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the status of the AutoML job V2.
     * </p>
     * 
     * @return Returns the status of the AutoML job V2.
     * @see AutoMLJobStatus
     */

    public String getAutoMLJobStatus() {
        return this.autoMLJobStatus;
    }

    /**
     * <p>
     * Returns the status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobV2Result withAutoMLJobStatus(String autoMLJobStatus) {
        setAutoMLJobStatus(autoMLJobStatus);
        return this;
    }

    /**
     * <p>
     * Returns the status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobStatus
     *        Returns the status of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public DescribeAutoMLJobV2Result withAutoMLJobStatus(AutoMLJobStatus autoMLJobStatus) {
        this.autoMLJobStatus = autoMLJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job V2.
     * @see AutoMLJobSecondaryStatus
     */

    public void setAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job V2.
     * </p>
     * 
     * @return Returns the secondary status of the AutoML job V2.
     * @see AutoMLJobSecondaryStatus
     */

    public String getAutoMLJobSecondaryStatus() {
        return this.autoMLJobSecondaryStatus;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobV2Result withAutoMLJobSecondaryStatus(String autoMLJobSecondaryStatus) {
        setAutoMLJobSecondaryStatus(autoMLJobSecondaryStatus);
        return this;
    }

    /**
     * <p>
     * Returns the secondary status of the AutoML job V2.
     * </p>
     * 
     * @param autoMLJobSecondaryStatus
     *        Returns the secondary status of the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobSecondaryStatus
     */

    public DescribeAutoMLJobV2Result withAutoMLJobSecondaryStatus(AutoMLJobSecondaryStatus autoMLJobSecondaryStatus) {
        this.autoMLJobSecondaryStatus = autoMLJobSecondaryStatus.toString();
        return this;
    }

    /**
     * @param autoMLJobArtifacts
     */

    public void setAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        this.autoMLJobArtifacts = autoMLJobArtifacts;
    }

    /**
     * @return
     */

    public AutoMLJobArtifacts getAutoMLJobArtifacts() {
        return this.autoMLJobArtifacts;
    }

    /**
     * @param autoMLJobArtifacts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withAutoMLJobArtifacts(AutoMLJobArtifacts autoMLJobArtifacts) {
        setAutoMLJobArtifacts(autoMLJobArtifacts);
        return this;
    }

    /**
     * <p>
     * Returns the resolved attributes used by the AutoML job V2.
     * </p>
     * 
     * @param resolvedAttributes
     *        Returns the resolved attributes used by the AutoML job V2.
     */

    public void setResolvedAttributes(AutoMLResolvedAttributes resolvedAttributes) {
        this.resolvedAttributes = resolvedAttributes;
    }

    /**
     * <p>
     * Returns the resolved attributes used by the AutoML job V2.
     * </p>
     * 
     * @return Returns the resolved attributes used by the AutoML job V2.
     */

    public AutoMLResolvedAttributes getResolvedAttributes() {
        return this.resolvedAttributes;
    }

    /**
     * <p>
     * Returns the resolved attributes used by the AutoML job V2.
     * </p>
     * 
     * @param resolvedAttributes
     *        Returns the resolved attributes used by the AutoML job V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withResolvedAttributes(AutoMLResolvedAttributes resolvedAttributes) {
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

    public DescribeAutoMLJobV2Result withModelDeployConfig(ModelDeployConfig modelDeployConfig) {
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

    public DescribeAutoMLJobV2Result withModelDeployResult(ModelDeployResult modelDeployResult) {
        setModelDeployResult(modelDeployResult);
        return this;
    }

    /**
     * <p>
     * Returns the configuration settings of how the data are split into train and validation datasets.
     * </p>
     * 
     * @param dataSplitConfig
     *        Returns the configuration settings of how the data are split into train and validation datasets.
     */

    public void setDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        this.dataSplitConfig = dataSplitConfig;
    }

    /**
     * <p>
     * Returns the configuration settings of how the data are split into train and validation datasets.
     * </p>
     * 
     * @return Returns the configuration settings of how the data are split into train and validation datasets.
     */

    public AutoMLDataSplitConfig getDataSplitConfig() {
        return this.dataSplitConfig;
    }

    /**
     * <p>
     * Returns the configuration settings of how the data are split into train and validation datasets.
     * </p>
     * 
     * @param dataSplitConfig
     *        Returns the configuration settings of how the data are split into train and validation datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        setDataSplitConfig(dataSplitConfig);
        return this;
    }

    /**
     * <p>
     * Returns the security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        Returns the security configuration for traffic encryption or Amazon VPC settings.
     */

    public void setSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * Returns the security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @return Returns the security configuration for traffic encryption or Amazon VPC settings.
     */

    public AutoMLSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * Returns the security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        Returns the security configuration for traffic encryption or Amazon VPC settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoMLJobV2Result withSecurityConfig(AutoMLSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
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
        if (getAutoMLJobInputDataConfig() != null)
            sb.append("AutoMLJobInputDataConfig: ").append(getAutoMLJobInputDataConfig()).append(",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: ").append(getOutputDataConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAutoMLJobObjective() != null)
            sb.append("AutoMLJobObjective: ").append(getAutoMLJobObjective()).append(",");
        if (getAutoMLProblemTypeConfig() != null)
            sb.append("AutoMLProblemTypeConfig: ").append(getAutoMLProblemTypeConfig()).append(",");
        if (getAutoMLProblemTypeConfigName() != null)
            sb.append("AutoMLProblemTypeConfigName: ").append(getAutoMLProblemTypeConfigName()).append(",");
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
        if (getAutoMLJobArtifacts() != null)
            sb.append("AutoMLJobArtifacts: ").append(getAutoMLJobArtifacts()).append(",");
        if (getResolvedAttributes() != null)
            sb.append("ResolvedAttributes: ").append(getResolvedAttributes()).append(",");
        if (getModelDeployConfig() != null)
            sb.append("ModelDeployConfig: ").append(getModelDeployConfig()).append(",");
        if (getModelDeployResult() != null)
            sb.append("ModelDeployResult: ").append(getModelDeployResult()).append(",");
        if (getDataSplitConfig() != null)
            sb.append("DataSplitConfig: ").append(getDataSplitConfig()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutoMLJobV2Result == false)
            return false;
        DescribeAutoMLJobV2Result other = (DescribeAutoMLJobV2Result) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getAutoMLJobInputDataConfig() == null ^ this.getAutoMLJobInputDataConfig() == null)
            return false;
        if (other.getAutoMLJobInputDataConfig() != null && other.getAutoMLJobInputDataConfig().equals(this.getAutoMLJobInputDataConfig()) == false)
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
        if (other.getAutoMLProblemTypeConfig() == null ^ this.getAutoMLProblemTypeConfig() == null)
            return false;
        if (other.getAutoMLProblemTypeConfig() != null && other.getAutoMLProblemTypeConfig().equals(this.getAutoMLProblemTypeConfig()) == false)
            return false;
        if (other.getAutoMLProblemTypeConfigName() == null ^ this.getAutoMLProblemTypeConfigName() == null)
            return false;
        if (other.getAutoMLProblemTypeConfigName() != null && other.getAutoMLProblemTypeConfigName().equals(this.getAutoMLProblemTypeConfigName()) == false)
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
        if (other.getDataSplitConfig() == null ^ this.getDataSplitConfig() == null)
            return false;
        if (other.getDataSplitConfig() != null && other.getDataSplitConfig().equals(this.getDataSplitConfig()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobInputDataConfig() == null) ? 0 : getAutoMLJobInputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobObjective() == null) ? 0 : getAutoMLJobObjective().hashCode());
        hashCode = prime * hashCode + ((getAutoMLProblemTypeConfig() == null) ? 0 : getAutoMLProblemTypeConfig().hashCode());
        hashCode = prime * hashCode + ((getAutoMLProblemTypeConfigName() == null) ? 0 : getAutoMLProblemTypeConfigName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getPartialFailureReasons() == null) ? 0 : getPartialFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getBestCandidate() == null) ? 0 : getBestCandidate().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobStatus() == null) ? 0 : getAutoMLJobStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobSecondaryStatus() == null) ? 0 : getAutoMLJobSecondaryStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArtifacts() == null) ? 0 : getAutoMLJobArtifacts().hashCode());
        hashCode = prime * hashCode + ((getResolvedAttributes() == null) ? 0 : getResolvedAttributes().hashCode());
        hashCode = prime * hashCode + ((getModelDeployConfig() == null) ? 0 : getModelDeployConfig().hashCode());
        hashCode = prime * hashCode + ((getModelDeployResult() == null) ? 0 : getModelDeployResult().hashCode());
        hashCode = prime * hashCode + ((getDataSplitConfig() == null) ? 0 : getDataSplitConfig().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoMLJobV2Result clone() {
        try {
            return (DescribeAutoMLJobV2Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
