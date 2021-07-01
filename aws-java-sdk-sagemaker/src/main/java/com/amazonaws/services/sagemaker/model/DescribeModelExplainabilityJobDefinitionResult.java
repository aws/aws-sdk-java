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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelExplainabilityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelExplainabilityJobDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model explainability job.
     * </p>
     */
    private String jobDefinitionArn;
    /**
     * <p>
     * The name of the explainability job definition. The name must be unique within an Amazon Web Services Region in
     * the Amazon Web Services account.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The time at which the model explainability job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The baseline configuration for a model explainability job.
     * </p>
     */
    private ModelExplainabilityBaselineConfig modelExplainabilityBaselineConfig;
    /**
     * <p>
     * Configures the model explainability job to run a specified Docker container image.
     * </p>
     */
    private ModelExplainabilityAppSpecification modelExplainabilityAppSpecification;
    /**
     * <p>
     * Inputs for the model explainability job.
     * </p>
     */
    private ModelExplainabilityJobInput modelExplainabilityJobInput;

    private MonitoringOutputConfig modelExplainabilityJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * Networking options for a model explainability job.
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
     * The Amazon Resource Name (ARN) of the model explainability job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model explainability job.
     */

    public void setJobDefinitionArn(String jobDefinitionArn) {
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model explainability job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model explainability job.
     */

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model explainability job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model explainability job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withJobDefinitionArn(String jobDefinitionArn) {
        setJobDefinitionArn(jobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The name of the explainability job definition. The name must be unique within an Amazon Web Services Region in
     * the Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the explainability job definition. The name must be unique within an Amazon Web Services
     *        Region in the Amazon Web Services account.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the explainability job definition. The name must be unique within an Amazon Web Services Region in
     * the Amazon Web Services account.
     * </p>
     * 
     * @return The name of the explainability job definition. The name must be unique within an Amazon Web Services
     *         Region in the Amazon Web Services account.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the explainability job definition. The name must be unique within an Amazon Web Services Region in
     * the Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the explainability job definition. The name must be unique within an Amazon Web Services
     *        Region in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The time at which the model explainability job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model explainability job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the model explainability job was created.
     * </p>
     * 
     * @return The time at which the model explainability job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the model explainability job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model explainability job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The baseline configuration for a model explainability job.
     * </p>
     * 
     * @param modelExplainabilityBaselineConfig
     *        The baseline configuration for a model explainability job.
     */

    public void setModelExplainabilityBaselineConfig(ModelExplainabilityBaselineConfig modelExplainabilityBaselineConfig) {
        this.modelExplainabilityBaselineConfig = modelExplainabilityBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model explainability job.
     * </p>
     * 
     * @return The baseline configuration for a model explainability job.
     */

    public ModelExplainabilityBaselineConfig getModelExplainabilityBaselineConfig() {
        return this.modelExplainabilityBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model explainability job.
     * </p>
     * 
     * @param modelExplainabilityBaselineConfig
     *        The baseline configuration for a model explainability job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withModelExplainabilityBaselineConfig(
            ModelExplainabilityBaselineConfig modelExplainabilityBaselineConfig) {
        setModelExplainabilityBaselineConfig(modelExplainabilityBaselineConfig);
        return this;
    }

    /**
     * <p>
     * Configures the model explainability job to run a specified Docker container image.
     * </p>
     * 
     * @param modelExplainabilityAppSpecification
     *        Configures the model explainability job to run a specified Docker container image.
     */

    public void setModelExplainabilityAppSpecification(ModelExplainabilityAppSpecification modelExplainabilityAppSpecification) {
        this.modelExplainabilityAppSpecification = modelExplainabilityAppSpecification;
    }

    /**
     * <p>
     * Configures the model explainability job to run a specified Docker container image.
     * </p>
     * 
     * @return Configures the model explainability job to run a specified Docker container image.
     */

    public ModelExplainabilityAppSpecification getModelExplainabilityAppSpecification() {
        return this.modelExplainabilityAppSpecification;
    }

    /**
     * <p>
     * Configures the model explainability job to run a specified Docker container image.
     * </p>
     * 
     * @param modelExplainabilityAppSpecification
     *        Configures the model explainability job to run a specified Docker container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withModelExplainabilityAppSpecification(
            ModelExplainabilityAppSpecification modelExplainabilityAppSpecification) {
        setModelExplainabilityAppSpecification(modelExplainabilityAppSpecification);
        return this;
    }

    /**
     * <p>
     * Inputs for the model explainability job.
     * </p>
     * 
     * @param modelExplainabilityJobInput
     *        Inputs for the model explainability job.
     */

    public void setModelExplainabilityJobInput(ModelExplainabilityJobInput modelExplainabilityJobInput) {
        this.modelExplainabilityJobInput = modelExplainabilityJobInput;
    }

    /**
     * <p>
     * Inputs for the model explainability job.
     * </p>
     * 
     * @return Inputs for the model explainability job.
     */

    public ModelExplainabilityJobInput getModelExplainabilityJobInput() {
        return this.modelExplainabilityJobInput;
    }

    /**
     * <p>
     * Inputs for the model explainability job.
     * </p>
     * 
     * @param modelExplainabilityJobInput
     *        Inputs for the model explainability job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withModelExplainabilityJobInput(ModelExplainabilityJobInput modelExplainabilityJobInput) {
        setModelExplainabilityJobInput(modelExplainabilityJobInput);
        return this;
    }

    /**
     * @param modelExplainabilityJobOutputConfig
     */

    public void setModelExplainabilityJobOutputConfig(MonitoringOutputConfig modelExplainabilityJobOutputConfig) {
        this.modelExplainabilityJobOutputConfig = modelExplainabilityJobOutputConfig;
    }

    /**
     * @return
     */

    public MonitoringOutputConfig getModelExplainabilityJobOutputConfig() {
        return this.modelExplainabilityJobOutputConfig;
    }

    /**
     * @param modelExplainabilityJobOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withModelExplainabilityJobOutputConfig(MonitoringOutputConfig modelExplainabilityJobOutputConfig) {
        setModelExplainabilityJobOutputConfig(modelExplainabilityJobOutputConfig);
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

    public DescribeModelExplainabilityJobDefinitionResult withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * Networking options for a model explainability job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model explainability job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a model explainability job.
     * </p>
     * 
     * @return Networking options for a model explainability job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Networking options for a model explainability job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model explainability job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelExplainabilityJobDefinitionResult withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public DescribeModelExplainabilityJobDefinitionResult withRoleArn(String roleArn) {
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

    public DescribeModelExplainabilityJobDefinitionResult withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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
        if (getModelExplainabilityBaselineConfig() != null)
            sb.append("ModelExplainabilityBaselineConfig: ").append(getModelExplainabilityBaselineConfig()).append(",");
        if (getModelExplainabilityAppSpecification() != null)
            sb.append("ModelExplainabilityAppSpecification: ").append(getModelExplainabilityAppSpecification()).append(",");
        if (getModelExplainabilityJobInput() != null)
            sb.append("ModelExplainabilityJobInput: ").append(getModelExplainabilityJobInput()).append(",");
        if (getModelExplainabilityJobOutputConfig() != null)
            sb.append("ModelExplainabilityJobOutputConfig: ").append(getModelExplainabilityJobOutputConfig()).append(",");
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

        if (obj instanceof DescribeModelExplainabilityJobDefinitionResult == false)
            return false;
        DescribeModelExplainabilityJobDefinitionResult other = (DescribeModelExplainabilityJobDefinitionResult) obj;
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
        if (other.getModelExplainabilityBaselineConfig() == null ^ this.getModelExplainabilityBaselineConfig() == null)
            return false;
        if (other.getModelExplainabilityBaselineConfig() != null
                && other.getModelExplainabilityBaselineConfig().equals(this.getModelExplainabilityBaselineConfig()) == false)
            return false;
        if (other.getModelExplainabilityAppSpecification() == null ^ this.getModelExplainabilityAppSpecification() == null)
            return false;
        if (other.getModelExplainabilityAppSpecification() != null
                && other.getModelExplainabilityAppSpecification().equals(this.getModelExplainabilityAppSpecification()) == false)
            return false;
        if (other.getModelExplainabilityJobInput() == null ^ this.getModelExplainabilityJobInput() == null)
            return false;
        if (other.getModelExplainabilityJobInput() != null && other.getModelExplainabilityJobInput().equals(this.getModelExplainabilityJobInput()) == false)
            return false;
        if (other.getModelExplainabilityJobOutputConfig() == null ^ this.getModelExplainabilityJobOutputConfig() == null)
            return false;
        if (other.getModelExplainabilityJobOutputConfig() != null
                && other.getModelExplainabilityJobOutputConfig().equals(this.getModelExplainabilityJobOutputConfig()) == false)
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
        hashCode = prime * hashCode + ((getModelExplainabilityBaselineConfig() == null) ? 0 : getModelExplainabilityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityAppSpecification() == null) ? 0 : getModelExplainabilityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityJobInput() == null) ? 0 : getModelExplainabilityJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityJobOutputConfig() == null) ? 0 : getModelExplainabilityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelExplainabilityJobDefinitionResult clone() {
        try {
            return (DescribeModelExplainabilityJobDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
