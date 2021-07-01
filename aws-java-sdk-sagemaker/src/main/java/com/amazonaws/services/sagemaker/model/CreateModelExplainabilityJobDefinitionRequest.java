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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelExplainabilityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelExplainabilityJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model explainability job definition. The name must be unique within an Amazon Web Services Region
     * in the Amazon Web Services account.
     * </p>
     */
    private String jobDefinitionName;
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
     * The name of the model explainability job definition. The name must be unique within an Amazon Web Services Region
     * in the Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the model explainability job definition. The name must be unique within an Amazon Web Services
     *        Region in the Amazon Web Services account.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name of the model explainability job definition. The name must be unique within an Amazon Web Services Region
     * in the Amazon Web Services account.
     * </p>
     * 
     * @return The name of the model explainability job definition. The name must be unique within an Amazon Web
     *         Services Region in the Amazon Web Services account.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name of the model explainability job definition. The name must be unique within an Amazon Web Services Region
     * in the Amazon Web Services account.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name of the model explainability job definition. The name must be unique within an Amazon Web Services
     *        Region in the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelExplainabilityJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
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

    public CreateModelExplainabilityJobDefinitionRequest withModelExplainabilityBaselineConfig(
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

    public CreateModelExplainabilityJobDefinitionRequest withModelExplainabilityAppSpecification(
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

    public CreateModelExplainabilityJobDefinitionRequest withModelExplainabilityJobInput(ModelExplainabilityJobInput modelExplainabilityJobInput) {
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

    public CreateModelExplainabilityJobDefinitionRequest withModelExplainabilityJobOutputConfig(MonitoringOutputConfig modelExplainabilityJobOutputConfig) {
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

    public CreateModelExplainabilityJobDefinitionRequest withJobResources(MonitoringResources jobResources) {
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

    public CreateModelExplainabilityJobDefinitionRequest withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public CreateModelExplainabilityJobDefinitionRequest withRoleArn(String roleArn) {
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

    public CreateModelExplainabilityJobDefinitionRequest withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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

    public CreateModelExplainabilityJobDefinitionRequest withTags(Tag... tags) {
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

    public CreateModelExplainabilityJobDefinitionRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateModelExplainabilityJobDefinitionRequest == false)
            return false;
        CreateModelExplainabilityJobDefinitionRequest other = (CreateModelExplainabilityJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
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
        hashCode = prime * hashCode + ((getModelExplainabilityBaselineConfig() == null) ? 0 : getModelExplainabilityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityAppSpecification() == null) ? 0 : getModelExplainabilityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityJobInput() == null) ? 0 : getModelExplainabilityJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelExplainabilityJobOutputConfig() == null) ? 0 : getModelExplainabilityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelExplainabilityJobDefinitionRequest clone() {
        return (CreateModelExplainabilityJobDefinitionRequest) super.clone();
    }

}
