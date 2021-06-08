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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEdgePackagingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEdgePackagingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobArn;
    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobName;
    /**
     * <p>
     * The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being packaged.
     * </p>
     */
    private String compilationJobName;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact Neo.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The output configuration for the edge packaging job.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the job run on.
     * </p>
     */
    private String resourceKey;
    /**
     * <p>
     * The current status of the packaging job.
     * </p>
     */
    private String edgePackagingJobStatus;
    /**
     * <p>
     * Returns a message describing the job status and error messages.
     * </p>
     */
    private String edgePackagingJobStatusMessage;
    /**
     * <p>
     * The timestamp of when the packaging job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of when the job was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     * </p>
     */
    private String modelArtifact;
    /**
     * <p>
     * The signature document of files in the model artifact.
     * </p>
     */
    private String modelSignature;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobArn
     *        The Amazon Resource Name (ARN) of the edge packaging job.
     */

    public void setEdgePackagingJobArn(String edgePackagingJobArn) {
        this.edgePackagingJobArn = edgePackagingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the edge packaging job.
     */

    public String getEdgePackagingJobArn() {
        return this.edgePackagingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobArn
     *        The Amazon Resource Name (ARN) of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withEdgePackagingJobArn(String edgePackagingJobArn) {
        setEdgePackagingJobArn(edgePackagingJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     */

    public void setEdgePackagingJobName(String edgePackagingJobName) {
        this.edgePackagingJobName = edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @return The name of the edge packaging job.
     */

    public String getEdgePackagingJobName() {
        return this.edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withEdgePackagingJobName(String edgePackagingJobName) {
        setEdgePackagingJobName(edgePackagingJobName);
        return this;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being packaged.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being
     *        packaged.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being packaged.
     * </p>
     * 
     * @return The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being
     *         packaged.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being packaged.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being
     *        packaged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withCompilationJobName(String compilationJobName) {
        setCompilationJobName(compilationJobName);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact Neo.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *        model, and to contact Neo.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact Neo.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *         model, and to contact Neo.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact Neo.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *        model, and to contact Neo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The output configuration for the edge packaging job.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for the edge packaging job.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The output configuration for the edge packaging job.
     * </p>
     * 
     * @return The output configuration for the edge packaging job.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The output configuration for the edge packaging job.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the job run on.
     * </p>
     * 
     * @param resourceKey
     *        The CMK to use when encrypting the EBS volume the job run on.
     */

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the job run on.
     * </p>
     * 
     * @return The CMK to use when encrypting the EBS volume the job run on.
     */

    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the job run on.
     * </p>
     * 
     * @param resourceKey
     *        The CMK to use when encrypting the EBS volume the job run on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withResourceKey(String resourceKey) {
        setResourceKey(resourceKey);
        return this;
    }

    /**
     * <p>
     * The current status of the packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The current status of the packaging job.
     * @see EdgePackagingJobStatus
     */

    public void setEdgePackagingJobStatus(String edgePackagingJobStatus) {
        this.edgePackagingJobStatus = edgePackagingJobStatus;
    }

    /**
     * <p>
     * The current status of the packaging job.
     * </p>
     * 
     * @return The current status of the packaging job.
     * @see EdgePackagingJobStatus
     */

    public String getEdgePackagingJobStatus() {
        return this.edgePackagingJobStatus;
    }

    /**
     * <p>
     * The current status of the packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The current status of the packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public DescribeEdgePackagingJobResult withEdgePackagingJobStatus(String edgePackagingJobStatus) {
        setEdgePackagingJobStatus(edgePackagingJobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the packaging job.
     * </p>
     * 
     * @param edgePackagingJobStatus
     *        The current status of the packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public DescribeEdgePackagingJobResult withEdgePackagingJobStatus(EdgePackagingJobStatus edgePackagingJobStatus) {
        this.edgePackagingJobStatus = edgePackagingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Returns a message describing the job status and error messages.
     * </p>
     * 
     * @param edgePackagingJobStatusMessage
     *        Returns a message describing the job status and error messages.
     */

    public void setEdgePackagingJobStatusMessage(String edgePackagingJobStatusMessage) {
        this.edgePackagingJobStatusMessage = edgePackagingJobStatusMessage;
    }

    /**
     * <p>
     * Returns a message describing the job status and error messages.
     * </p>
     * 
     * @return Returns a message describing the job status and error messages.
     */

    public String getEdgePackagingJobStatusMessage() {
        return this.edgePackagingJobStatusMessage;
    }

    /**
     * <p>
     * Returns a message describing the job status and error messages.
     * </p>
     * 
     * @param edgePackagingJobStatusMessage
     *        Returns a message describing the job status and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withEdgePackagingJobStatusMessage(String edgePackagingJobStatusMessage) {
        setEdgePackagingJobStatusMessage(edgePackagingJobStatusMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the packaging job was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the packaging job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of when the packaging job was created.
     * </p>
     * 
     * @return The timestamp of when the packaging job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of when the packaging job was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the packaging job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the job was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the job was last updated.
     * </p>
     * 
     * @return The timestamp of when the job was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp of when the job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp of when the job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     * </p>
     * 
     * @param modelArtifact
     *        The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     */

    public void setModelArtifact(String modelArtifact) {
        this.modelArtifact = modelArtifact;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     * </p>
     * 
     * @return The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     */

    public String getModelArtifact() {
        return this.modelArtifact;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     * </p>
     * 
     * @param modelArtifact
     *        The Amazon Simple Storage (S3) URI where model artifacts ares stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withModelArtifact(String modelArtifact) {
        setModelArtifact(modelArtifact);
        return this;
    }

    /**
     * <p>
     * The signature document of files in the model artifact.
     * </p>
     * 
     * @param modelSignature
     *        The signature document of files in the model artifact.
     */

    public void setModelSignature(String modelSignature) {
        this.modelSignature = modelSignature;
    }

    /**
     * <p>
     * The signature document of files in the model artifact.
     * </p>
     * 
     * @return The signature document of files in the model artifact.
     */

    public String getModelSignature() {
        return this.modelSignature;
    }

    /**
     * <p>
     * The signature document of files in the model artifact.
     * </p>
     * 
     * @param modelSignature
     *        The signature document of files in the model artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEdgePackagingJobResult withModelSignature(String modelSignature) {
        setModelSignature(modelSignature);
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
        if (getEdgePackagingJobArn() != null)
            sb.append("EdgePackagingJobArn: ").append(getEdgePackagingJobArn()).append(",");
        if (getEdgePackagingJobName() != null)
            sb.append("EdgePackagingJobName: ").append(getEdgePackagingJobName()).append(",");
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: ").append(getCompilationJobName()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getResourceKey() != null)
            sb.append("ResourceKey: ").append(getResourceKey()).append(",");
        if (getEdgePackagingJobStatus() != null)
            sb.append("EdgePackagingJobStatus: ").append(getEdgePackagingJobStatus()).append(",");
        if (getEdgePackagingJobStatusMessage() != null)
            sb.append("EdgePackagingJobStatusMessage: ").append(getEdgePackagingJobStatusMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getModelArtifact() != null)
            sb.append("ModelArtifact: ").append(getModelArtifact()).append(",");
        if (getModelSignature() != null)
            sb.append("ModelSignature: ").append(getModelSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEdgePackagingJobResult == false)
            return false;
        DescribeEdgePackagingJobResult other = (DescribeEdgePackagingJobResult) obj;
        if (other.getEdgePackagingJobArn() == null ^ this.getEdgePackagingJobArn() == null)
            return false;
        if (other.getEdgePackagingJobArn() != null && other.getEdgePackagingJobArn().equals(this.getEdgePackagingJobArn()) == false)
            return false;
        if (other.getEdgePackagingJobName() == null ^ this.getEdgePackagingJobName() == null)
            return false;
        if (other.getEdgePackagingJobName() != null && other.getEdgePackagingJobName().equals(this.getEdgePackagingJobName()) == false)
            return false;
        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getResourceKey() == null ^ this.getResourceKey() == null)
            return false;
        if (other.getResourceKey() != null && other.getResourceKey().equals(this.getResourceKey()) == false)
            return false;
        if (other.getEdgePackagingJobStatus() == null ^ this.getEdgePackagingJobStatus() == null)
            return false;
        if (other.getEdgePackagingJobStatus() != null && other.getEdgePackagingJobStatus().equals(this.getEdgePackagingJobStatus()) == false)
            return false;
        if (other.getEdgePackagingJobStatusMessage() == null ^ this.getEdgePackagingJobStatusMessage() == null)
            return false;
        if (other.getEdgePackagingJobStatusMessage() != null
                && other.getEdgePackagingJobStatusMessage().equals(this.getEdgePackagingJobStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getModelArtifact() == null ^ this.getModelArtifact() == null)
            return false;
        if (other.getModelArtifact() != null && other.getModelArtifact().equals(this.getModelArtifact()) == false)
            return false;
        if (other.getModelSignature() == null ^ this.getModelSignature() == null)
            return false;
        if (other.getModelSignature() != null && other.getModelSignature().equals(this.getModelSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgePackagingJobArn() == null) ? 0 : getEdgePackagingJobArn().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobName() == null) ? 0 : getEdgePackagingJobName().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceKey() == null) ? 0 : getResourceKey().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobStatus() == null) ? 0 : getEdgePackagingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getEdgePackagingJobStatusMessage() == null) ? 0 : getEdgePackagingJobStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getModelArtifact() == null) ? 0 : getModelArtifact().hashCode());
        hashCode = prime * hashCode + ((getModelSignature() == null) ? 0 : getModelSignature().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEdgePackagingJobResult clone() {
        try {
            return (DescribeEdgePackagingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
