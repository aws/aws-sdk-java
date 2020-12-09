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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEdgePackagingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEdgePackagingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobName;
    /**
     * <p>
     * The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
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
     * to contact SageMaker Neo.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides information about the output location for the packaged model.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     * </p>
     */
    private String resourceKey;
    /**
     * <p>
     * Creates tags for the packaging job.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateEdgePackagingJobRequest withEdgePackagingJobName(String edgePackagingJobName) {
        setEdgePackagingJobName(edgePackagingJobName);
        return this;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     */

    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     * </p>
     * 
     * @return The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     */

    public String getCompilationJobName() {
        return this.compilationJobName;
    }

    /**
     * <p>
     * The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     * </p>
     * 
     * @param compilationJobName
     *        The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withCompilationJobName(String compilationJobName) {
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

    public CreateEdgePackagingJobRequest withModelName(String modelName) {
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

    public CreateEdgePackagingJobRequest withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact SageMaker Neo.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *        model, and to contact SageMaker Neo.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact SageMaker Neo.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *         model, and to contact SageMaker Neo.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and
     * to contact SageMaker Neo.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the
     *        model, and to contact SageMaker Neo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides information about the output location for the packaged model.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output location for the packaged model.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the packaged model.
     * </p>
     * 
     * @return Provides information about the output location for the packaged model.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the packaged model.
     * </p>
     * 
     * @param outputConfig
     *        Provides information about the output location for the packaged model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     * </p>
     * 
     * @param resourceKey
     *        The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     */

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     * </p>
     * 
     * @return The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     */

    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
     * <p>
     * The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     * </p>
     * 
     * @param resourceKey
     *        The CMK to use when encrypting the EBS volume the edge packaging job runs on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withResourceKey(String resourceKey) {
        setResourceKey(resourceKey);
        return this;
    }

    /**
     * <p>
     * Creates tags for the packaging job.
     * </p>
     * 
     * @return Creates tags for the packaging job.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Creates tags for the packaging job.
     * </p>
     * 
     * @param tags
     *        Creates tags for the packaging job.
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
     * Creates tags for the packaging job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Creates tags for the packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withTags(Tag... tags) {
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
     * Creates tags for the packaging job.
     * </p>
     * 
     * @param tags
     *        Creates tags for the packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEdgePackagingJobRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateEdgePackagingJobRequest == false)
            return false;
        CreateEdgePackagingJobRequest other = (CreateEdgePackagingJobRequest) obj;
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

        hashCode = prime * hashCode + ((getEdgePackagingJobName() == null) ? 0 : getEdgePackagingJobName().hashCode());
        hashCode = prime * hashCode + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceKey() == null) ? 0 : getResourceKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEdgePackagingJobRequest clone() {
        return (CreateEdgePackagingJobRequest) super.clone();
    }

}
