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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelBiasJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelBiasJobDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model bias job.
     * </p>
     */
    private String jobDefinitionArn;
    /**
     * <p>
     * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon
     * Web Services account.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The time at which the model bias job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The baseline configuration for a model bias job.
     * </p>
     */
    private ModelBiasBaselineConfig modelBiasBaselineConfig;
    /**
     * <p>
     * Configures the model bias job to run a specified Docker container image.
     * </p>
     */
    private ModelBiasAppSpecification modelBiasAppSpecification;
    /**
     * <p>
     * Inputs for the model bias job.
     * </p>
     */
    private ModelBiasJobInput modelBiasJobInput;

    private MonitoringOutputConfig modelBiasJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * Networking options for a model bias job.
     * </p>
     */
    private MonitoringNetworkConfig networkConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read
     * permission to the input data location and write permission to the output data location in Amazon S3.
     * </p>
     */
    private String roleArn;

    private MonitoringStoppingCondition stoppingCondition;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model bias job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model bias job.
     */

    public void setJobDefinitionArn(String jobDefinitionArn) {
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model bias job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model bias job.
     */

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model bias job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withJobDefinitionArn(String jobDefinitionArn) {
        setJobDefinitionArn(jobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon
     * Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the
     *        Amazon Web Services account.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon
     * Web Services account.
     * </p>
     * 
     * @return The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the
     *         Amazon Web Services account.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon
     * Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The time at which the model bias job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model bias job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the model bias job was created.
     * </p>
     * 
     * @return The time at which the model bias job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the model bias job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model bias job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The baseline configuration for a model bias job.
     * </p>
     * 
     * @param modelBiasBaselineConfig
     *        The baseline configuration for a model bias job.
     */

    public void setModelBiasBaselineConfig(ModelBiasBaselineConfig modelBiasBaselineConfig) {
        this.modelBiasBaselineConfig = modelBiasBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model bias job.
     * </p>
     * 
     * @return The baseline configuration for a model bias job.
     */

    public ModelBiasBaselineConfig getModelBiasBaselineConfig() {
        return this.modelBiasBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model bias job.
     * </p>
     * 
     * @param modelBiasBaselineConfig
     *        The baseline configuration for a model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withModelBiasBaselineConfig(ModelBiasBaselineConfig modelBiasBaselineConfig) {
        setModelBiasBaselineConfig(modelBiasBaselineConfig);
        return this;
    }

    /**
     * <p>
     * Configures the model bias job to run a specified Docker container image.
     * </p>
     * 
     * @param modelBiasAppSpecification
     *        Configures the model bias job to run a specified Docker container image.
     */

    public void setModelBiasAppSpecification(ModelBiasAppSpecification modelBiasAppSpecification) {
        this.modelBiasAppSpecification = modelBiasAppSpecification;
    }

    /**
     * <p>
     * Configures the model bias job to run a specified Docker container image.
     * </p>
     * 
     * @return Configures the model bias job to run a specified Docker container image.
     */

    public ModelBiasAppSpecification getModelBiasAppSpecification() {
        return this.modelBiasAppSpecification;
    }

    /**
     * <p>
     * Configures the model bias job to run a specified Docker container image.
     * </p>
     * 
     * @param modelBiasAppSpecification
     *        Configures the model bias job to run a specified Docker container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withModelBiasAppSpecification(ModelBiasAppSpecification modelBiasAppSpecification) {
        setModelBiasAppSpecification(modelBiasAppSpecification);
        return this;
    }

    /**
     * <p>
     * Inputs for the model bias job.
     * </p>
     * 
     * @param modelBiasJobInput
     *        Inputs for the model bias job.
     */

    public void setModelBiasJobInput(ModelBiasJobInput modelBiasJobInput) {
        this.modelBiasJobInput = modelBiasJobInput;
    }

    /**
     * <p>
     * Inputs for the model bias job.
     * </p>
     * 
     * @return Inputs for the model bias job.
     */

    public ModelBiasJobInput getModelBiasJobInput() {
        return this.modelBiasJobInput;
    }

    /**
     * <p>
     * Inputs for the model bias job.
     * </p>
     * 
     * @param modelBiasJobInput
     *        Inputs for the model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withModelBiasJobInput(ModelBiasJobInput modelBiasJobInput) {
        setModelBiasJobInput(modelBiasJobInput);
        return this;
    }

    /**
     * @param modelBiasJobOutputConfig
     */

    public void setModelBiasJobOutputConfig(MonitoringOutputConfig modelBiasJobOutputConfig) {
        this.modelBiasJobOutputConfig = modelBiasJobOutputConfig;
    }

    /**
     * @return
     */

    public MonitoringOutputConfig getModelBiasJobOutputConfig() {
        return this.modelBiasJobOutputConfig;
    }

    /**
     * @param modelBiasJobOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withModelBiasJobOutputConfig(MonitoringOutputConfig modelBiasJobOutputConfig) {
        setModelBiasJobOutputConfig(modelBiasJobOutputConfig);
        return this;
    }

    /**
     * @param jobResources
     */

    public void setJobResources(MonitoringResources jobResources) {
        this.jobResources = jobResources;
    }

    /**
     * @return
     */

    public MonitoringResources getJobResources() {
        return this.jobResources;
    }

    /**
     * @param jobResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * Networking options for a model bias job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model bias job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a model bias job.
     * </p>
     * 
     * @return Networking options for a model bias job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Networking options for a model bias job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model bias job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withNetworkConfig(MonitoringNetworkConfig networkConfig) {
        setNetworkConfig(networkConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read
     * permission to the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that
     *        has read permission to the input data location and write permission to the output data location in Amazon
     *        S3.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read
     * permission to the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that
     *         has read permission to the input data location and write permission to the output data location in Amazon
     *         S3.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read
     * permission to the input data location and write permission to the output data location in Amazon S3.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that
     *        has read permission to the input data location and write permission to the output data location in Amazon
     *        S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param stoppingCondition
     */

    public void setStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * @return
     */

    public MonitoringStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * @param stoppingCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelBiasJobDefinitionResult withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
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
        if (getJobDefinitionArn() != null)
            sb.append("JobDefinitionArn: ").append(getJobDefinitionArn()).append(",");
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModelBiasBaselineConfig() != null)
            sb.append("ModelBiasBaselineConfig: ").append(getModelBiasBaselineConfig()).append(",");
        if (getModelBiasAppSpecification() != null)
            sb.append("ModelBiasAppSpecification: ").append(getModelBiasAppSpecification()).append(",");
        if (getModelBiasJobInput() != null)
            sb.append("ModelBiasJobInput: ").append(getModelBiasJobInput()).append(",");
        if (getModelBiasJobOutputConfig() != null)
            sb.append("ModelBiasJobOutputConfig: ").append(getModelBiasJobOutputConfig()).append(",");
        if (getJobResources() != null)
            sb.append("JobResources: ").append(getJobResources()).append(",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: ").append(getNetworkConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelBiasJobDefinitionResult == false)
            return false;
        DescribeModelBiasJobDefinitionResult other = (DescribeModelBiasJobDefinitionResult) obj;
        if (other.getJobDefinitionArn() == null ^ this.getJobDefinitionArn() == null)
            return false;
        if (other.getJobDefinitionArn() != null && other.getJobDefinitionArn().equals(this.getJobDefinitionArn()) == false)
            return false;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModelBiasBaselineConfig() == null ^ this.getModelBiasBaselineConfig() == null)
            return false;
        if (other.getModelBiasBaselineConfig() != null && other.getModelBiasBaselineConfig().equals(this.getModelBiasBaselineConfig()) == false)
            return false;
        if (other.getModelBiasAppSpecification() == null ^ this.getModelBiasAppSpecification() == null)
            return false;
        if (other.getModelBiasAppSpecification() != null && other.getModelBiasAppSpecification().equals(this.getModelBiasAppSpecification()) == false)
            return false;
        if (other.getModelBiasJobInput() == null ^ this.getModelBiasJobInput() == null)
            return false;
        if (other.getModelBiasJobInput() != null && other.getModelBiasJobInput().equals(this.getModelBiasJobInput()) == false)
            return false;
        if (other.getModelBiasJobOutputConfig() == null ^ this.getModelBiasJobOutputConfig() == null)
            return false;
        if (other.getModelBiasJobOutputConfig() != null && other.getModelBiasJobOutputConfig().equals(this.getModelBiasJobOutputConfig()) == false)
            return false;
        if (other.getJobResources() == null ^ this.getJobResources() == null)
            return false;
        if (other.getJobResources() != null && other.getJobResources().equals(this.getJobResources()) == false)
            return false;
        if (other.getNetworkConfig() == null ^ this.getNetworkConfig() == null)
            return false;
        if (other.getNetworkConfig() != null && other.getNetworkConfig().equals(this.getNetworkConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobDefinitionArn() == null) ? 0 : getJobDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModelBiasBaselineConfig() == null) ? 0 : getModelBiasBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelBiasAppSpecification() == null) ? 0 : getModelBiasAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelBiasJobInput() == null) ? 0 : getModelBiasJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelBiasJobOutputConfig() == null) ? 0 : getModelBiasJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelBiasJobDefinitionResult clone() {
        try {
            return (DescribeModelBiasJobDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
