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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringJobDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringJobDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     * </p>
     */
    private MonitoringBaselineConfig baselineConfig;
    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * </p>
     */
    private java.util.List<MonitoringInput> monitoringInputs;
    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     * </p>
     */
    private MonitoringOutputConfig monitoringOutputConfig;
    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     * distributed processing, you specify more than one instance.
     * </p>
     */
    private MonitoringResources monitoringResources;
    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     */
    private MonitoringAppSpecification monitoringAppSpecification;
    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     */
    private MonitoringStoppingCondition stoppingCondition;
    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     */
    private NetworkConfig networkConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     * </p>
     * 
     * @param baselineConfig
     *        Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     */

    public void setBaselineConfig(MonitoringBaselineConfig baselineConfig) {
        this.baselineConfig = baselineConfig;
    }

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     * </p>
     * 
     * @return Baseline configuration used to validate that the data conforms to the specified constraints and
     *         statistics
     */

    public MonitoringBaselineConfig getBaselineConfig() {
        return this.baselineConfig;
    }

    /**
     * <p>
     * Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     * </p>
     * 
     * @param baselineConfig
     *        Baseline configuration used to validate that the data conforms to the specified constraints and statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withBaselineConfig(MonitoringBaselineConfig baselineConfig) {
        setBaselineConfig(baselineConfig);
        return this;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * </p>
     * 
     * @return The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     */

    public java.util.List<MonitoringInput> getMonitoringInputs() {
        return monitoringInputs;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * </p>
     * 
     * @param monitoringInputs
     *        The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     */

    public void setMonitoringInputs(java.util.Collection<MonitoringInput> monitoringInputs) {
        if (monitoringInputs == null) {
            this.monitoringInputs = null;
            return;
        }

        this.monitoringInputs = new java.util.ArrayList<MonitoringInput>(monitoringInputs);
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringInputs(java.util.Collection)} or {@link #withMonitoringInputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param monitoringInputs
     *        The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withMonitoringInputs(MonitoringInput... monitoringInputs) {
        if (this.monitoringInputs == null) {
            setMonitoringInputs(new java.util.ArrayList<MonitoringInput>(monitoringInputs.length));
        }
        for (MonitoringInput ele : monitoringInputs) {
            this.monitoringInputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * </p>
     * 
     * @param monitoringInputs
     *        The array of inputs for the monitoring job. Currently we support monitoring an Amazon SageMaker Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withMonitoringInputs(java.util.Collection<MonitoringInput> monitoringInputs) {
        setMonitoringInputs(monitoringInputs);
        return this;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param monitoringOutputConfig
     *        The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     */

    public void setMonitoringOutputConfig(MonitoringOutputConfig monitoringOutputConfig) {
        this.monitoringOutputConfig = monitoringOutputConfig;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @return The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     */

    public MonitoringOutputConfig getMonitoringOutputConfig() {
        return this.monitoringOutputConfig;
    }

    /**
     * <p>
     * The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     * </p>
     * 
     * @param monitoringOutputConfig
     *        The array of outputs from the monitoring job to be uploaded to Amazon Simple Storage Service (Amazon S3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withMonitoringOutputConfig(MonitoringOutputConfig monitoringOutputConfig) {
        setMonitoringOutputConfig(monitoringOutputConfig);
        return this;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     * distributed processing, you specify more than one instance.
     * </p>
     * 
     * @param monitoringResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     *        distributed processing, you specify more than one instance.
     */

    public void setMonitoringResources(MonitoringResources monitoringResources) {
        this.monitoringResources = monitoringResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     * distributed processing, you specify more than one instance.
     * </p>
     * 
     * @return Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     *         distributed processing, you specify more than one instance.
     */

    public MonitoringResources getMonitoringResources() {
        return this.monitoringResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     * distributed processing, you specify more than one instance.
     * </p>
     * 
     * @param monitoringResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a monitoring job. In
     *        distributed processing, you specify more than one instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withMonitoringResources(MonitoringResources monitoringResources) {
        setMonitoringResources(monitoringResources);
        return this;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     * 
     * @param monitoringAppSpecification
     *        Configures the monitoring job to run a specified Docker container image.
     */

    public void setMonitoringAppSpecification(MonitoringAppSpecification monitoringAppSpecification) {
        this.monitoringAppSpecification = monitoringAppSpecification;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     * 
     * @return Configures the monitoring job to run a specified Docker container image.
     */

    public MonitoringAppSpecification getMonitoringAppSpecification() {
        return this.monitoringAppSpecification;
    }

    /**
     * <p>
     * Configures the monitoring job to run a specified Docker container image.
     * </p>
     * 
     * @param monitoringAppSpecification
     *        Configures the monitoring job to run a specified Docker container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withMonitoringAppSpecification(MonitoringAppSpecification monitoringAppSpecification) {
        setMonitoringAppSpecification(monitoringAppSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a time limit for how long the monitoring job is allowed to run.
     */

    public void setStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     * 
     * @return Specifies a time limit for how long the monitoring job is allowed to run.
     */

    public MonitoringStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * Specifies a time limit for how long the monitoring job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        Specifies a time limit for how long the monitoring job is allowed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @return Sets the environment variables in the Docker container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see MonitoringJobDefinition#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies networking options for an monitoring job.
     */

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     * 
     * @return Specifies networking options for an monitoring job.
     */

    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Specifies networking options for an monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies networking options for an monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinition withNetworkConfig(NetworkConfig networkConfig) {
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

    public MonitoringJobDefinition withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getBaselineConfig() != null)
            sb.append("BaselineConfig: ").append(getBaselineConfig()).append(",");
        if (getMonitoringInputs() != null)
            sb.append("MonitoringInputs: ").append(getMonitoringInputs()).append(",");
        if (getMonitoringOutputConfig() != null)
            sb.append("MonitoringOutputConfig: ").append(getMonitoringOutputConfig()).append(",");
        if (getMonitoringResources() != null)
            sb.append("MonitoringResources: ").append(getMonitoringResources()).append(",");
        if (getMonitoringAppSpecification() != null)
            sb.append("MonitoringAppSpecification: ").append(getMonitoringAppSpecification()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: ").append(getNetworkConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringJobDefinition == false)
            return false;
        MonitoringJobDefinition other = (MonitoringJobDefinition) obj;
        if (other.getBaselineConfig() == null ^ this.getBaselineConfig() == null)
            return false;
        if (other.getBaselineConfig() != null && other.getBaselineConfig().equals(this.getBaselineConfig()) == false)
            return false;
        if (other.getMonitoringInputs() == null ^ this.getMonitoringInputs() == null)
            return false;
        if (other.getMonitoringInputs() != null && other.getMonitoringInputs().equals(this.getMonitoringInputs()) == false)
            return false;
        if (other.getMonitoringOutputConfig() == null ^ this.getMonitoringOutputConfig() == null)
            return false;
        if (other.getMonitoringOutputConfig() != null && other.getMonitoringOutputConfig().equals(this.getMonitoringOutputConfig()) == false)
            return false;
        if (other.getMonitoringResources() == null ^ this.getMonitoringResources() == null)
            return false;
        if (other.getMonitoringResources() != null && other.getMonitoringResources().equals(this.getMonitoringResources()) == false)
            return false;
        if (other.getMonitoringAppSpecification() == null ^ this.getMonitoringAppSpecification() == null)
            return false;
        if (other.getMonitoringAppSpecification() != null && other.getMonitoringAppSpecification().equals(this.getMonitoringAppSpecification()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getNetworkConfig() == null ^ this.getNetworkConfig() == null)
            return false;
        if (other.getNetworkConfig() != null && other.getNetworkConfig().equals(this.getNetworkConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineConfig() == null) ? 0 : getBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInputs() == null) ? 0 : getMonitoringInputs().hashCode());
        hashCode = prime * hashCode + ((getMonitoringOutputConfig() == null) ? 0 : getMonitoringOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getMonitoringResources() == null) ? 0 : getMonitoringResources().hashCode());
        hashCode = prime * hashCode + ((getMonitoringAppSpecification() == null) ? 0 : getMonitoringAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringJobDefinition clone() {
        try {
            return (MonitoringJobDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringJobDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
