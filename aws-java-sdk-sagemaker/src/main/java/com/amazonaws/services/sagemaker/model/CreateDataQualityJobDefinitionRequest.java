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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDataQualityJobDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataQualityJobDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the monitoring job definition.
     * </p>
     */
    private String jobDefinitionName;
    /**
     * <p>
     * Configures the constraints and baselines for the monitoring job.
     * </p>
     */
    private DataQualityBaselineConfig dataQualityBaselineConfig;
    /**
     * <p>
     * Specifies the container that runs the monitoring job.
     * </p>
     */
    private DataQualityAppSpecification dataQualityAppSpecification;
    /**
     * <p>
     * A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     * </p>
     */
    private DataQualityJobInput dataQualityJobInput;

    private MonitoringOutputConfig dataQualityJobOutputConfig;

    private MonitoringResources jobResources;
    /**
     * <p>
     * Specifies networking configuration for the monitoring job.
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
     * The name for the monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name for the monitoring job definition.
     */

    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    /**
     * <p>
     * The name for the monitoring job definition.
     * </p>
     * 
     * @return The name for the monitoring job definition.
     */

    public String getJobDefinitionName() {
        return this.jobDefinitionName;
    }

    /**
     * <p>
     * The name for the monitoring job definition.
     * </p>
     * 
     * @param jobDefinitionName
     *        The name for the monitoring job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityJobDefinitionRequest withJobDefinitionName(String jobDefinitionName) {
        setJobDefinitionName(jobDefinitionName);
        return this;
    }

    /**
     * <p>
     * Configures the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @param dataQualityBaselineConfig
     *        Configures the constraints and baselines for the monitoring job.
     */

    public void setDataQualityBaselineConfig(DataQualityBaselineConfig dataQualityBaselineConfig) {
        this.dataQualityBaselineConfig = dataQualityBaselineConfig;
    }

    /**
     * <p>
     * Configures the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @return Configures the constraints and baselines for the monitoring job.
     */

    public DataQualityBaselineConfig getDataQualityBaselineConfig() {
        return this.dataQualityBaselineConfig;
    }

    /**
     * <p>
     * Configures the constraints and baselines for the monitoring job.
     * </p>
     * 
     * @param dataQualityBaselineConfig
     *        Configures the constraints and baselines for the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityJobDefinitionRequest withDataQualityBaselineConfig(DataQualityBaselineConfig dataQualityBaselineConfig) {
        setDataQualityBaselineConfig(dataQualityBaselineConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the container that runs the monitoring job.
     * </p>
     * 
     * @param dataQualityAppSpecification
     *        Specifies the container that runs the monitoring job.
     */

    public void setDataQualityAppSpecification(DataQualityAppSpecification dataQualityAppSpecification) {
        this.dataQualityAppSpecification = dataQualityAppSpecification;
    }

    /**
     * <p>
     * Specifies the container that runs the monitoring job.
     * </p>
     * 
     * @return Specifies the container that runs the monitoring job.
     */

    public DataQualityAppSpecification getDataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }

    /**
     * <p>
     * Specifies the container that runs the monitoring job.
     * </p>
     * 
     * @param dataQualityAppSpecification
     *        Specifies the container that runs the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityJobDefinitionRequest withDataQualityAppSpecification(DataQualityAppSpecification dataQualityAppSpecification) {
        setDataQualityAppSpecification(dataQualityAppSpecification);
        return this;
    }

    /**
     * <p>
     * A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     * </p>
     * 
     * @param dataQualityJobInput
     *        A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     */

    public void setDataQualityJobInput(DataQualityJobInput dataQualityJobInput) {
        this.dataQualityJobInput = dataQualityJobInput;
    }

    /**
     * <p>
     * A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     * </p>
     * 
     * @return A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     */

    public DataQualityJobInput getDataQualityJobInput() {
        return this.dataQualityJobInput;
    }

    /**
     * <p>
     * A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     * </p>
     * 
     * @param dataQualityJobInput
     *        A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityJobDefinitionRequest withDataQualityJobInput(DataQualityJobInput dataQualityJobInput) {
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

    public CreateDataQualityJobDefinitionRequest withDataQualityJobOutputConfig(MonitoringOutputConfig dataQualityJobOutputConfig) {
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

    public CreateDataQualityJobDefinitionRequest withJobResources(MonitoringResources jobResources) {
        setJobResources(jobResources);
        return this;
    }

    /**
     * <p>
     * Specifies networking configuration for the monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies networking configuration for the monitoring job.
     */

    public void setNetworkConfig(MonitoringNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Specifies networking configuration for the monitoring job.
     * </p>
     * 
     * @return Specifies networking configuration for the monitoring job.
     */

    public MonitoringNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Specifies networking configuration for the monitoring job.
     * </p>
     * 
     * @param networkConfig
     *        Specifies networking configuration for the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityJobDefinitionRequest withNetworkConfig(MonitoringNetworkConfig networkConfig) {
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

    public CreateDataQualityJobDefinitionRequest withRoleArn(String roleArn) {
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

    public CreateDataQualityJobDefinitionRequest withStoppingCondition(MonitoringStoppingCondition stoppingCondition) {
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

    public CreateDataQualityJobDefinitionRequest withTags(Tag... tags) {
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

    public CreateDataQualityJobDefinitionRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateDataQualityJobDefinitionRequest == false)
            return false;
        CreateDataQualityJobDefinitionRequest other = (CreateDataQualityJobDefinitionRequest) obj;
        if (other.getJobDefinitionName() == null ^ this.getJobDefinitionName() == null)
            return false;
        if (other.getJobDefinitionName() != null && other.getJobDefinitionName().equals(this.getJobDefinitionName()) == false)
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
        hashCode = prime * hashCode + ((getDataQualityBaselineConfig() == null) ? 0 : getDataQualityBaselineConfig().hashCode());
        hashCode = prime * hashCode + ((getDataQualityAppSpecification() == null) ? 0 : getDataQualityAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getDataQualityJobInput() == null) ? 0 : getDataQualityJobInput().hashCode());
        hashCode = prime * hashCode + ((getDataQualityJobOutputConfig() == null) ? 0 : getDataQualityJobOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobResources() == null) ? 0 : getJobResources().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataQualityJobDefinitionRequest clone() {
        return (CreateDataQualityJobDefinitionRequest) super.clone();
    }

}
