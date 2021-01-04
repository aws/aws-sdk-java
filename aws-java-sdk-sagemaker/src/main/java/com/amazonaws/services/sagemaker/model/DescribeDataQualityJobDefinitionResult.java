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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDataQualityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataQualityJobDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     * </p>
     */
    private String jobDefinitionArn;
    /**
     * <p>
     * The name of the data quality monitoring job definition.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * The time that the data quality monitoring job definition was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The constraints and baselines for the data quality monitoring job definition.
     * </p>
     */
    private DataQualityBaselineConfig dataQualityBaselineConfig;
    /**
     * <p>
     * Information about the container that runs the data quality monitoring job.
     * </p>
     */
    private DataQualityAppSpecification dataQualityAppSpecification;
    /**
     * <p>
     * The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     * </p>
     */
    private DataQualityJobInput dataQualityJobInput;

    private MonitoringOutputConfig dataQualityJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * The networking configuration for the data quality monitoring job.
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
     * The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     */

    public void setJobDefinitionArn(String jobDefinitionArn) {
        this.jobDefinitionArn = jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     */

    public String getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionArn
     *        The Amazon Resource Name (ARN) of the data quality monitoring job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withJobDefinitionArn(String jobDefinitionArn) {
        setJobDefinitionArn(jobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The name of the data quality monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the data quality monitoring job definition.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the data quality monitoring job definition.
     * </p>
     * 
     * @return The name of the data quality monitoring job definition.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the data quality monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the data quality monitoring job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The time that the data quality monitoring job definition was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the data quality monitoring job definition was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the data quality monitoring job definition was created.
     * </p>
     * 
     * @return The time that the data quality monitoring job definition was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the data quality monitoring job definition was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the data quality monitoring job definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The constraints and baselines for the data quality monitoring job definition.
     * </p>
     * 
     * @param dataQualityBaselineConfig
     *        The constraints and baselines for the data quality monitoring job definition.
     */

    public void setDataQualityBaselineConfig(DataQualityBaselineConfig dataQualityBaselineConfig) {
        this.dataQualityBaselineConfig = dataQualityBaselineConfig;
    }

    /**
     * <p>
     * The constraints and baselines for the data quality monitoring job definition.
     * </p>
     * 
     * @return The constraints and baselines for the data quality monitoring job definition.
     */

    public DataQualityBaselineConfig getDataQualityBaselineConfig() {
        return this.dataQualityBaselineConfig;
    }

    /**
     * <p>
     * The constraints and baselines for the data quality monitoring job definition.
     * </p>
     * 
     * @param dataQualityBaselineConfig
     *        The constraints and baselines for the data quality monitoring job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withDataQualityBaselineConfig(DataQualityBaselineConfig dataQualityBaselineConfig) {
        setDataQualityBaselineConfig(dataQualityBaselineConfig);
        return this;
    }

    /**
     * <p>
     * Information about the container that runs the data quality monitoring job.
     * </p>
     * 
     * @param dataQualityAppSpecification
     *        Information about the container that runs the data quality monitoring job.
     */

    public void setDataQualityAppSpecification(DataQualityAppSpecification dataQualityAppSpecification) {
        this.dataQualityAppSpecification = dataQualityAppSpecification;
    }

    /**
     * <p>
     * Information about the container that runs the data quality monitoring job.
     * </p>
     * 
     * @return Information about the container that runs the data quality monitoring job.
     */

    public DataQualityAppSpecification getDataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }

    /**
     * <p>
     * Information about the container that runs the data quality monitoring job.
     * </p>
     * 
     * @param dataQualityAppSpecification
     *        Information about the container that runs the data quality monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withDataQualityAppSpecification(DataQualityAppSpecification dataQualityAppSpecification) {
        setDataQualityAppSpecification(dataQualityAppSpecification);
        return this;
    }

    /**
     * <p>
     * The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     * </p>
     * 
     * @param dataQualityJobInput
     *        The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     */

    public void setDataQualityJobInput(DataQualityJobInput dataQualityJobInput) {
        this.dataQualityJobInput = dataQualityJobInput;
    }

    /**
     * <p>
     * The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     * </p>
     * 
     * @return The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     */

    public DataQualityJobInput getDataQualityJobInput() {
        return this.dataQualityJobInput;
    }

    /**
     * <p>
     * The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     * </p>
     * 
     * @param dataQualityJobInput
     *        The list of inputs for the data quality monitoring job. Currently endpoints are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withDataQualityJobInput(DataQualityJobInput dataQualityJobInput) {
        setDataQualityJobInput(dataQualityJobInput);
        return this;
    }

    /**
     * @param dataQualityJobOutputConfig
     */

    public void setDataQualityJobOutputConfig(MonitoringOutputConfig dataQualityJobOutputConfig) {
        this.dataQualityJobOutputConfig = dataQualityJobOutputConfig;
    }

    /**
     * @return
     */

    public MonitoringOutputConfig getDataQualityJobOutputConfig() {
        return this.dataQualityJobOutputConfig;
    }

    /**
     * @param dataQualityJobOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withDataQualityJobOutputConfig(MonitoringOutputConfig dataQualityJobOutputConfig) {
        setDataQualityJobOutputConfig(dataQualityJobOutputConfig);
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

    public DescribeDataQualityJobDefinitionResult withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * The networking configuration for the data quality monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        The networking configuration for the data quality monitoring job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * The networking configuration for the data quality monitoring job.
     * </p>
     * 
     * @return The networking configuration for the data quality monitoring job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * The networking configuration for the data quality monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        The networking configuration for the data quality monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataQualityJobDefinitionResult withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public DescribeDataQualityJobDefinitionResult withRoleArn(String roleArn) {
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

    public DescribeDataQualityJobDefinitionResult withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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
        if (getDataQualityBaselineConfig() != null)
            sb.append("DataQualityBaselineConfig: ").append(getDataQualityBaselineConfig()).append(",");
        if (getDataQualityAppSpecification() != null)
            sb.append("DataQualityAppSpecification: ").append(getDataQualityAppSpecification()).append(",");
        if (getDataQualityJobInput() != null)
            sb.append("DataQualityJobInput: ").append(getDataQualityJobInput()).append(",");
        if (getDataQualityJobOutputConfig() != null)
            sb.append("DataQualityJobOutputConfig: ").append(getDataQualityJobOutputConfig()).append(",");
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

        if (obj instanceof DescribeDataQualityJobDefinitionResult == false)
            return false;
        DescribeDataQualityJobDefinitionResult other = (DescribeDataQualityJobDefinitionResult) obj;
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
        if (other.getDataQualityBaselineConfig() == null ^ this.getDataQualityBaselineConfig() == null)
            return false;
        if (other.getDataQualityBaselineConfig() != null && other.getDataQualityBaselineConfig().equals(this.getDataQualityBaselineConfig()) == false)
            return false;
        if (other.getDataQualityAppSpecification() == null ^ this.getDataQualityAppSpecification() == null)
            return false;
        if (other.getDataQualityAppSpecification() != null && other.getDataQualityAppSpecification().equals(this.getDataQualityAppSpecification()) == false)
            return false;
        if (other.getDataQualityJobInput() == null ^ this.getDataQualityJobInput() == null)
            return false;
        if (other.getDataQualityJobInput() != null && other.getDataQualityJobInput().equals(this.getDataQualityJobInput()) == false)
            return false;
        if (other.getDataQualityJobOutputConfig() == null ^ this.getDataQualityJobOutputConfig() == null)
            return false;
        if (other.getDataQualityJobOutputConfig() != null && other.getDataQualityJobOutputConfig().equals(this.getDataQualityJobOutputConfig()) == false)
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
        hashCode = prime * hashCode + ((getDataQualityBaselineConfig() == null) ? 0 : getDataQualityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getDataQualityAppSpecification() == null) ? 0 : getDataQualityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getDataQualityJobInput() == null) ? 0 : getDataQualityJobInput().hashCode());
        hashCode = prime * hashCode + ((getDataQualityJobOutputConfig() == null) ? 0 : getDataQualityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataQualityJobDefinitionResult clone() {
        try {
            return (DescribeDataQualityJobDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
