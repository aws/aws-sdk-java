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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelQualityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelQualityJobDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model quality job.
     * </p>
     */
    private String jobDefinitionArn;
    /**
     * <p>
     * The name of the quality job definition. The name must be unique within an Amazon Web Services Region in the
     * Amazon Web Services account.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The time at which the model quality job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The baseline configuration for a model quality job.
     * </p>
     */
    private ModelQualityBaselineConfig modelQualityBaselineConfig;
    /**
     * <p>
     * Configures the model quality job to run a specified Docker container image.
     * </p>
     */
    private ModelQualityAppSpecification modelQualityAppSpecification;
    /**
     * <p>
     * Inputs for the model quality job.
     * </p>
     */
    private ModelQualityJobInput modelQualityJobInput;

    private MonitoringOutputConfig modelQualityJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * Networking options for a model quality job.
     * </p>
     */
    private MonitoringNetworkConfig networkConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;

    private MonitoringStoppingCondition stoppingCondition;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model quality job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model quality job.
     */

    public void setJobDefinitionArn(String jobDefinitionArn) {
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model quality job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model quality job.
     */

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model quality job.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the model quality job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withJobDefinitionArn(String jobDefinitionArn) {
        setJobDefinitionArn(jobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The name of the quality job definition. The name must be unique within an Amazon Web Services Region in the
     * Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the quality job definition. The name must be unique within an Amazon Web Services Region in
     *        the Amazon Web Services account.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the quality job definition. The name must be unique within an Amazon Web Services Region in the
     * Amazon Web Services account.
     * </p>
     * 
     * @return The name of the quality job definition. The name must be unique within an Amazon Web Services Region in
     *         the Amazon Web Services account.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the quality job definition. The name must be unique within an Amazon Web Services Region in the
     * Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the quality job definition. The name must be unique within an Amazon Web Services Region in
     *        the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The time at which the model quality job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model quality job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the model quality job was created.
     * </p>
     * 
     * @return The time at which the model quality job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the model quality job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the model quality job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The baseline configuration for a model quality job.
     * </p>
     * 
     * @param modelQualityBaselineConfig
     *        The baseline configuration for a model quality job.
     */

    public void setModelQualityBaselineConfig(ModelQualityBaselineConfig modelQualityBaselineConfig) {
        this.modelQualityBaselineConfig = modelQualityBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model quality job.
     * </p>
     * 
     * @return The baseline configuration for a model quality job.
     */

    public ModelQualityBaselineConfig getModelQualityBaselineConfig() {
        return this.modelQualityBaselineConfig;
    }

    /**
     * <p>
     * The baseline configuration for a model quality job.
     * </p>
     * 
     * @param modelQualityBaselineConfig
     *        The baseline configuration for a model quality job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withModelQualityBaselineConfig(ModelQualityBaselineConfig modelQualityBaselineConfig) {
        setModelQualityBaselineConfig(modelQualityBaselineConfig);
        return this;
    }

    /**
     * <p>
     * Configures the model quality job to run a specified Docker container image.
     * </p>
     * 
     * @param modelQualityAppSpecification
     *        Configures the model quality job to run a specified Docker container image.
     */

    public void setModelQualityAppSpecification(ModelQualityAppSpecification modelQualityAppSpecification) {
        this.modelQualityAppSpecification = modelQualityAppSpecification;
    }

    /**
     * <p>
     * Configures the model quality job to run a specified Docker container image.
     * </p>
     * 
     * @return Configures the model quality job to run a specified Docker container image.
     */

    public ModelQualityAppSpecification getModelQualityAppSpecification() {
        return this.modelQualityAppSpecification;
    }

    /**
     * <p>
     * Configures the model quality job to run a specified Docker container image.
     * </p>
     * 
     * @param modelQualityAppSpecification
     *        Configures the model quality job to run a specified Docker container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withModelQualityAppSpecification(ModelQualityAppSpecification modelQualityAppSpecification) {
        setModelQualityAppSpecification(modelQualityAppSpecification);
        return this;
    }

    /**
     * <p>
     * Inputs for the model quality job.
     * </p>
     * 
     * @param modelQualityJobInput
     *        Inputs for the model quality job.
     */

    public void setModelQualityJobInput(ModelQualityJobInput modelQualityJobInput) {
        this.modelQualityJobInput = modelQualityJobInput;
    }

    /**
     * <p>
     * Inputs for the model quality job.
     * </p>
     * 
     * @return Inputs for the model quality job.
     */

    public ModelQualityJobInput getModelQualityJobInput() {
        return this.modelQualityJobInput;
    }

    /**
     * <p>
     * Inputs for the model quality job.
     * </p>
     * 
     * @param modelQualityJobInput
     *        Inputs for the model quality job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withModelQualityJobInput(ModelQualityJobInput modelQualityJobInput) {
        setModelQualityJobInput(modelQualityJobInput);
        return this;
    }

    /**
     * @param modelQualityJobOutputConfig
     */

    public void setModelQualityJobOutputConfig(MonitoringOutputConfig modelQualityJobOutputConfig) {
        this.modelQualityJobOutputConfig = modelQualityJobOutputConfig;
    }

    /**
     * @return
     */

    public MonitoringOutputConfig getModelQualityJobOutputConfig() {
        return this.modelQualityJobOutputConfig;
    }

    /**
     * @param modelQualityJobOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withModelQualityJobOutputConfig(MonitoringOutputConfig modelQualityJobOutputConfig) {
        setModelQualityJobOutputConfig(modelQualityJobOutputConfig);
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

    public DescribeModelQualityJobDefinitionResult withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * Networking options for a model quality job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model quality job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a model quality job.
     * </p>
     * 
     * @return Networking options for a model quality job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Networking options for a model quality job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a model quality job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withNetworkConfig(MonitoringNetworkConfig networkConfig) {
        setNetworkConfig(networkConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelQualityJobDefinitionResult withRoleArn(String roleArn) {
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

    public DescribeModelQualityJobDefinitionResult withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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
        if (getModelQualityBaselineConfig() != null)
            sb.append("ModelQualityBaselineConfig: ").append(getModelQualityBaselineConfig()).append(",");
        if (getModelQualityAppSpecification() != null)
            sb.append("ModelQualityAppSpecification: ").append(getModelQualityAppSpecification()).append(",");
        if (getModelQualityJobInput() != null)
            sb.append("ModelQualityJobInput: ").append(getModelQualityJobInput()).append(",");
        if (getModelQualityJobOutputConfig() != null)
            sb.append("ModelQualityJobOutputConfig: ").append(getModelQualityJobOutputConfig()).append(",");
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

        if (obj instanceof DescribeModelQualityJobDefinitionResult == false)
            return false;
        DescribeModelQualityJobDefinitionResult other = (DescribeModelQualityJobDefinitionResult) obj;
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
        if (other.getModelQualityBaselineConfig() == null ^ this.getModelQualityBaselineConfig() == null)
            return false;
        if (other.getModelQualityBaselineConfig() != null && other.getModelQualityBaselineConfig().equals(this.getModelQualityBaselineConfig()) == false)
            return false;
        if (other.getModelQualityAppSpecification() == null ^ this.getModelQualityAppSpecification() == null)
            return false;
        if (other.getModelQualityAppSpecification() != null && other.getModelQualityAppSpecification().equals(this.getModelQualityAppSpecification()) == false)
            return false;
        if (other.getModelQualityJobInput() == null ^ this.getModelQualityJobInput() == null)
            return false;
        if (other.getModelQualityJobInput() != null && other.getModelQualityJobInput().equals(this.getModelQualityJobInput()) == false)
            return false;
        if (other.getModelQualityJobOutputConfig() == null ^ this.getModelQualityJobOutputConfig() == null)
            return false;
        if (other.getModelQualityJobOutputConfig() != null && other.getModelQualityJobOutputConfig().equals(this.getModelQualityJobOutputConfig()) == false)
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
        hashCode = prime * hashCode + ((getModelQualityBaselineConfig() == null) ? 0 : getModelQualityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelQualityAppSpecification() == null) ? 0 : getModelQualityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelQualityJobInput() == null) ? 0 : getModelQualityJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelQualityJobOutputConfig() == null) ? 0 : getModelQualityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelQualityJobDefinitionResult clone() {
        try {
            return (DescribeModelQualityJobDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
