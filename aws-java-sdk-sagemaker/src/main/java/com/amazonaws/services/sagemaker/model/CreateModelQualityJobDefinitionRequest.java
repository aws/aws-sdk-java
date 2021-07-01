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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelQualityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelQualityJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitoring job definition.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * Specifies the constraints and baselines for the monitoring job.
     * </p>
     */
    private ModelQualityBaselineConfig modelQualityBaselineConfig;
    /**
     * <p>
     * The container that runs the monitoring job.
     * </p>
     */
    private ModelQualityAppSpecification modelQualityAppSpecification;
    /**
     * <p>
     * A list of the inputs that are monitored. Currently endpoints are supported.
     * </p>
     */
    private ModelQualityJobInput modelQualityJobInput;

    private MonitoringOutputConfig modelQualityJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * Specifies the network configuration for the monitoring job.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the monitoring job definition.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job definition.
     * </p>
     * 
     * @return The name of the monitoring job definition.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the monitoring job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * Specifies the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @param modelQualityBaselineConfig
     *        Specifies the constraints and baselines for the monitoring job.
     */

    public void setModelQualityBaselineConfig(ModelQualityBaselineConfig modelQualityBaselineConfig) {
        this.modelQualityBaselineConfig = modelQualityBaselineConfig;
    }

    /**
     * <p>
     * Specifies the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @return Specifies the constraints and baselines for the monitoring job.
     */

    public ModelQualityBaselineConfig getModelQualityBaselineConfig() {
        return this.modelQualityBaselineConfig;
    }

    /**
     * <p>
     * Specifies the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @param modelQualityBaselineConfig
     *        Specifies the constraints and baselines for the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withModelQualityBaselineConfig(ModelQualityBaselineConfig modelQualityBaselineConfig) {
        setModelQualityBaselineConfig(modelQualityBaselineConfig);
        return this;
    }

    /**
     * <p>
     * The container that runs the monitoring job.
     * </p>
     * 
     * @param modelQualityAppSpecification
     *        The container that runs the monitoring job.
     */

    public void setModelQualityAppSpecification(ModelQualityAppSpecification modelQualityAppSpecification) {
        this.modelQualityAppSpecification = modelQualityAppSpecification;
    }

    /**
     * <p>
     * The container that runs the monitoring job.
     * </p>
     * 
     * @return The container that runs the monitoring job.
     */

    public ModelQualityAppSpecification getModelQualityAppSpecification() {
        return this.modelQualityAppSpecification;
    }

    /**
     * <p>
     * The container that runs the monitoring job.
     * </p>
     * 
     * @param modelQualityAppSpecification
     *        The container that runs the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withModelQualityAppSpecification(ModelQualityAppSpecification modelQualityAppSpecification) {
        setModelQualityAppSpecification(modelQualityAppSpecification);
        return this;
    }

    /**
     * <p>
     * A list of the inputs that are monitored. Currently endpoints are supported.
     * </p>
     * 
     * @param modelQualityJobInput
     *        A list of the inputs that are monitored. Currently endpoints are supported.
     */

    public void setModelQualityJobInput(ModelQualityJobInput modelQualityJobInput) {
        this.modelQualityJobInput = modelQualityJobInput;
    }

    /**
     * <p>
     * A list of the inputs that are monitored. Currently endpoints are supported.
     * </p>
     * 
     * @return A list of the inputs that are monitored. Currently endpoints are supported.
     */

    public ModelQualityJobInput getModelQualityJobInput() {
        return this.modelQualityJobInput;
    }

    /**
     * <p>
     * A list of the inputs that are monitored. Currently endpoints are supported.
     * </p>
     * 
     * @param modelQualityJobInput
     *        A list of the inputs that are monitored. Currently endpoints are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withModelQualityJobInput(ModelQualityJobInput modelQualityJobInput) {
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

    public CreateModelQualityJobDefinitionRequest withModelQualityJobOutputConfig(MonitoringOutputConfig modelQualityJobOutputConfig) {
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

    public CreateModelQualityJobDefinitionRequest withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * Specifies the network configuration for the monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies the network configuration for the monitoring job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Specifies the network configuration for the monitoring job.
     * </p>
     * 
     * @return Specifies the network configuration for the monitoring job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Specifies the network configuration for the monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies the network configuration for the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public CreateModelQualityJobDefinitionRequest withRoleArn(String roleArn) {
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

    public CreateModelQualityJobDefinitionRequest withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return (Optional) An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *         >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withTags(Tag... tags) {
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelQualityJobDefinitionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getJobDefinitionName() != null)
            sb.append("JobDefinitionName: ").append(getJobDefinitionName()).append(",");
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
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
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

        if (obj instanceof CreateModelQualityJobDefinitionRequest == false)
            return false;
        CreateModelQualityJobDefinitionRequest other = (CreateModelQualityJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
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

        hashCode = prime * hashCode + ((getJobDefinitionName() == null) ? 0 : getJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getModelQualityBaselineConfig() == null) ? 0 : getModelQualityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelQualityAppSpecification() == null) ? 0 : getModelQualityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelQualityJobInput() == null) ? 0 : getModelQualityJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelQualityJobOutputConfig() == null) ? 0 : getModelQualityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelQualityJobDefinitionRequest clone() {
        return (CreateModelQualityJobDefinitionRequest) super.clone();
    }

}
