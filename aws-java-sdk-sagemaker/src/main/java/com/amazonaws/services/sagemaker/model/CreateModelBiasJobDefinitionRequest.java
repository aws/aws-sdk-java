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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelBiasJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelBiasJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon
     * Web Services account.
     * </p>
     */
    private String jobDefinitionName;
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

    public CreateModelBiasJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
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

    public CreateModelBiasJobDefinitionRequest withModelBiasBaselineConfig(ModelBiasBaselineConfig modelBiasBaselineConfig) {
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

    public CreateModelBiasJobDefinitionRequest withModelBiasAppSpecification(ModelBiasAppSpecification modelBiasAppSpecification) {
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

    public CreateModelBiasJobDefinitionRequest withModelBiasJobInput(ModelBiasJobInput modelBiasJobInput) {
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

    public CreateModelBiasJobDefinitionRequest withModelBiasJobOutputConfig(MonitoringOutputConfig modelBiasJobOutputConfig) {
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

    public CreateModelBiasJobDefinitionRequest withJobResources(MonitoringResources jobResources) {
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

    public CreateModelBiasJobDefinitionRequest withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public CreateModelBiasJobDefinitionRequest withRoleArn(String roleArn) {
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

    public CreateModelBiasJobDefinitionRequest withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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

    public CreateModelBiasJobDefinitionRequest withTags(Tag... tags) {
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

    public CreateModelBiasJobDefinitionRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateModelBiasJobDefinitionRequest == false)
            return false;
        CreateModelBiasJobDefinitionRequest other = (CreateModelBiasJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
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
        hashCode = prime * hashCode + ((getModelBiasBaselineConfig() == null) ? 0 : getModelBiasBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getModelBiasAppSpecification() == null) ? 0 : getModelBiasAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelBiasJobInput() == null) ? 0 : getModelBiasJobInput().hashCode());
        hashCode = prime * hashCode + ((getModelBiasJobOutputConfig() == null) ? 0 : getModelBiasJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelBiasJobDefinitionRequest clone() {
        return (CreateModelBiasJobDefinitionRequest) super.clone();
    }

}
