/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCompilationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     */
    private String compilationJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
     * </p>
     */
    private String compilationJobArn;
    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     */
    private String compilationJobStatus;
    /**
     * <p>
     * The time when the model compilation job started the <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in the
     * <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time might
     * be later than this time. That's because it takes time to download the compilation job, which depends on the size
     * of the compilation job container.
     * </p>
     */
    private java.util.Date compilationStartTime;
    /**
     * <p>
     * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job,
     * this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     */
    private java.util.Date compilationEndTime;
    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     */
    private StoppingCondition stoppingCondition;
    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the
     * compilation job.
     * </p>
     */
    private ModelArtifacts modelArtifacts;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data
     * inputs, and the framework in which the model was trained.
     * </p>
     */
    private InputConfig inputConfig;
    /**
     * <p>
     * Information about the output location for the compiled model and the target device that the model runs on.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the model compilation job.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * 
     * @return The name of the model compilation job.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * The name of the model compilation job.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withCompilationJobName(String compilationJobName) {
        setCompilationJobName(compilationJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
     * </p>
     * 
     * @param compilationJobArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model
     *        compilation job.
     */

    public void setCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model
     *         compilation job.
     */

    public String getCompilationJobArn() {
        return this.compilationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
     * </p>
     * 
     * @param compilationJobArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model
     *        compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withCompilationJobArn(String compilationJobArn) {
        setCompilationJobArn(compilationJobArn);
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @see CompilationJobStatus
     */

    public void setCompilationJobStatus(String compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @return The status of the model compilation job.
     * @see CompilationJobStatus
     */

    public String getCompilationJobStatus() {
        return this.compilationJobStatus;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompilationJobStatus
     */

    public DescribeCompilationJobResult withCompilationJobStatus(String compilationJobStatus) {
        setCompilationJobStatus(compilationJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the model compilation job.
     * </p>
     * 
     * @param compilationJobStatus
     *        The status of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompilationJobStatus
     */

    public DescribeCompilationJobResult withCompilationJobStatus(CompilationJobStatus compilationJobStatus) {
        this.compilationJobStatus = compilationJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job started the <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in the
     * <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time might
     * be later than this time. That's because it takes time to download the compilation job, which depends on the size
     * of the compilation job container.
     * </p>
     * 
     * @param compilationStartTime
     *        The time when the model compilation job started the <code>CompilationJob</code> instances. </p>
     *        <p>
     *        You are billed for the time between this timestamp and the timestamp in the
     *        <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time
     *        might be later than this time. That's because it takes time to download the compilation job, which depends
     *        on the size of the compilation job container.
     */

    public void setCompilationStartTime(java.util.Date compilationStartTime) {
        this.compilationStartTime = compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started the <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in the
     * <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time might
     * be later than this time. That's because it takes time to download the compilation job, which depends on the size
     * of the compilation job container.
     * </p>
     * 
     * @return The time when the model compilation job started the <code>CompilationJob</code> instances. </p>
     *         <p>
     *         You are billed for the time between this timestamp and the timestamp in the
     *         <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time
     *         might be later than this time. That's because it takes time to download the compilation job, which
     *         depends on the size of the compilation job container.
     */

    public java.util.Date getCompilationStartTime() {
        return this.compilationStartTime;
    }

    /**
     * <p>
     * The time when the model compilation job started the <code>CompilationJob</code> instances.
     * </p>
     * <p>
     * You are billed for the time between this timestamp and the timestamp in the
     * <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time might
     * be later than this time. That's because it takes time to download the compilation job, which depends on the size
     * of the compilation job container.
     * </p>
     * 
     * @param compilationStartTime
     *        The time when the model compilation job started the <code>CompilationJob</code> instances. </p>
     *        <p>
     *        You are billed for the time between this timestamp and the timestamp in the
     *        <a>DescribeCompilationJobResponse$CompilationEndTime</a> field. In Amazon CloudWatch Logs, the start time
     *        might be later than this time. That's because it takes time to download the compilation job, which depends
     *        on the size of the compilation job container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withCompilationStartTime(java.util.Date compilationStartTime) {
        setCompilationStartTime(compilationStartTime);
        return this;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job,
     * this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     * 
     * @param compilationEndTime
     *        The time when the model compilation job on a compilation job instance ended. For a successful or stopped
     *        job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon
     *        SageMaker detected that the job failed.
     */

    public void setCompilationEndTime(java.util.Date compilationEndTime) {
        this.compilationEndTime = compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job,
     * this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     * 
     * @return The time when the model compilation job on a compilation job instance ended. For a successful or stopped
     *         job, this is when the job's model artifacts have finished uploading. For a failed job, this is when
     *         Amazon SageMaker detected that the job failed.
     */

    public java.util.Date getCompilationEndTime() {
        return this.compilationEndTime;
    }

    /**
     * <p>
     * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job,
     * this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker
     * detected that the job failed.
     * </p>
     * 
     * @param compilationEndTime
     *        The time when the model compilation job on a compilation job instance ended. For a successful or stopped
     *        job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon
     *        SageMaker detected that the job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withCompilationEndTime(java.util.Date compilationEndTime) {
        setCompilationEndTime(compilationEndTime);
        return this;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @param stoppingCondition
     *        The duration allowed for model compilation.
     */

    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @return The duration allowed for model compilation.
     */

    public StoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The duration allowed for model compilation.
     * </p>
     * 
     * @param stoppingCondition
     *        The duration allowed for model compilation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withStoppingCondition(StoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model compilation job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     * 
     * @return The time that the model compilation job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the model compilation job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model compilation job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that the status of the model compilation job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     * 
     * @return The time that the status of the model compilation job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time that the status of the model compilation job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that the status of the model compilation job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If a model compilation job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * 
     * @return If a model compilation job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a model compilation job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If a model compilation job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the
     * compilation job.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the location in Amazon S3 that has been configured for storing the model artifacts used
     *        in the compilation job.
     */

    public void setModelArtifacts(ModelArtifacts modelArtifacts) {
        this.modelArtifacts = modelArtifacts;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the
     * compilation job.
     * </p>
     * 
     * @return Information about the location in Amazon S3 that has been configured for storing the model artifacts used
     *         in the compilation job.
     */

    public ModelArtifacts getModelArtifacts() {
        return this.modelArtifacts;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the
     * compilation job.
     * </p>
     * 
     * @param modelArtifacts
     *        Information about the location in Amazon S3 that has been configured for storing the model artifacts used
     *        in the compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withModelArtifacts(ModelArtifacts modelArtifacts) {
        setModelArtifacts(modelArtifacts);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the model compilation job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model compilation job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model compilation job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data
     * inputs, and the framework in which the model was trained.
     * </p>
     * 
     * @param inputConfig
     *        Information about the location in Amazon S3 of the input model artifacts, the name and shape of the
     *        expected data inputs, and the framework in which the model was trained.
     */

    public void setInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data
     * inputs, and the framework in which the model was trained.
     * </p>
     * 
     * @return Information about the location in Amazon S3 of the input model artifacts, the name and shape of the
     *         expected data inputs, and the framework in which the model was trained.
     */

    public InputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data
     * inputs, and the framework in which the model was trained.
     * </p>
     * 
     * @param inputConfig
     *        Information about the location in Amazon S3 of the input model artifacts, the name and shape of the
     *        expected data inputs, and the framework in which the model was trained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withInputConfig(InputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the target device that the model runs on.
     * </p>
     * 
     * @param outputConfig
     *        Information about the output location for the compiled model and the target device that the model runs on.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the target device that the model runs on.
     * </p>
     * 
     * @return Information about the output location for the compiled model and the target device that the model runs
     *         on.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Information about the output location for the compiled model and the target device that the model runs on.
     * </p>
     * 
     * @param outputConfig
     *        Information about the output location for the compiled model and the target device that the model runs on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCompilationJobResult withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: ").append(getCompilationJobName()).append(",");
        if (getCompilationJobArn() != null)
            sb.append("CompilationJobArn: ").append(getCompilationJobArn()).append(",");
        if (getCompilationJobStatus() != null)
            sb.append("CompilationJobStatus: ").append(getCompilationJobStatus()).append(",");
        if (getCompilationStartTime() != null)
            sb.append("CompilationStartTime: ").append(getCompilationStartTime()).append(",");
        if (getCompilationEndTime() != null)
            sb.append("CompilationEndTime: ").append(getCompilationEndTime()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getModelArtifacts() != null)
            sb.append("ModelArtifacts: ").append(getModelArtifacts()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCompilationJobResult == false)
            return false;
        DescribeCompilationJobResult other = (DescribeCompilationJobResult) obj;
        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getCompilationJobArn() == null ^ this.getCompilationJobArn() == null)
            return false;
        if (other.getCompilationJobArn() != null && other.getCompilationJobArn().equals(this.getCompilationJobArn()) == false)
            return false;
        if (other.getCompilationJobStatus() == null ^ this.getCompilationJobStatus() == null)
            return false;
        if (other.getCompilationJobStatus() != null && other.getCompilationJobStatus().equals(this.getCompilationJobStatus()) == false)
            return false;
        if (other.getCompilationStartTime() == null ^ this.getCompilationStartTime() == null)
            return false;
        if (other.getCompilationStartTime() != null && other.getCompilationStartTime().equals(this.getCompilationStartTime()) == false)
            return false;
        if (other.getCompilationEndTime() == null ^ this.getCompilationEndTime() == null)
            return false;
        if (other.getCompilationEndTime() != null && other.getCompilationEndTime().equals(this.getCompilationEndTime()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getModelArtifacts() == null ^ this.getModelArtifacts() == null)
            return false;
        if (other.getModelArtifacts() != null && other.getModelArtifacts().equals(this.getModelArtifacts()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobArn() == null) ? 0 : getCompilationJobArn().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobStatus() == null) ? 0 : getCompilationJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCompilationStartTime() == null) ? 0 : getCompilationStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompilationEndTime() == null) ? 0 : getCompilationEndTime().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getModelArtifacts() == null) ? 0 : getModelArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCompilationJobResult clone() {
        try {
            return (DescribeCompilationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
