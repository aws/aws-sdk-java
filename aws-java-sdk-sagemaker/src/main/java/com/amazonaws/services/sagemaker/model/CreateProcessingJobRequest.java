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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProcessingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container before the processing job begins running
     * if "S3InputMode" is set to <code>File</code>.
     * </p>
     */
    private java.util.List<ProcessingInput> processingInputs;
    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     */
    private ProcessingOutputConfig processingOutputConfig;
    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     */
    private String processingJobName;
    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     */
    private ProcessingResources processingResources;
    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     */
    private ProcessingStoppingCondition stoppingCondition;
    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     */
    private AppSpecification appSpecification;
    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * Networking options for a processing job.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    private ExperimentConfig experimentConfig;

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container before the processing job begins running
     * if "S3InputMode" is set to <code>File</code>.
     * </p>
     * 
     * @return For each input, data is downloaded from S3 into the processing container before the processing job begins
     *         running if "S3InputMode" is set to <code>File</code>.
     */

    public java.util.List<ProcessingInput> getProcessingInputs() {
        return processingInputs;
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container before the processing job begins running
     * if "S3InputMode" is set to <code>File</code>.
     * </p>
     * 
     * @param processingInputs
     *        For each input, data is downloaded from S3 into the processing container before the processing job begins
     *        running if "S3InputMode" is set to <code>File</code>.
     */

    public void setProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        if (processingInputs == null) {
            this.processingInputs = null;
            return;
        }

        this.processingInputs = new java.util.ArrayList<ProcessingInput>(processingInputs);
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container before the processing job begins running
     * if "S3InputMode" is set to <code>File</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessingInputs(java.util.Collection)} or {@link #withProcessingInputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param processingInputs
     *        For each input, data is downloaded from S3 into the processing container before the processing job begins
     *        running if "S3InputMode" is set to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withProcessingInputs(ProcessingInput... processingInputs) {
        if (this.processingInputs == null) {
            setProcessingInputs(new java.util.ArrayList<ProcessingInput>(processingInputs.length));
        }
        for (ProcessingInput ele : processingInputs) {
            this.processingInputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For each input, data is downloaded from S3 into the processing container before the processing job begins running
     * if "S3InputMode" is set to <code>File</code>.
     * </p>
     * 
     * @param processingInputs
     *        For each input, data is downloaded from S3 into the processing container before the processing job begins
     *        running if "S3InputMode" is set to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        setProcessingInputs(processingInputs);
        return this;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @param processingOutputConfig
     *        Output configuration for the processing job.
     */

    public void setProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @return Output configuration for the processing job.
     */

    public ProcessingOutputConfig getProcessingOutputConfig() {
        return this.processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @param processingOutputConfig
     *        Output configuration for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        setProcessingOutputConfig(processingOutputConfig);
        return this;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     */

    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @return The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     */

    public String getProcessingJobName() {
        return this.processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withProcessingJobName(String processingJobName) {
        setProcessingJobName(processingJobName);
        return this;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @param processingResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *        distributed training, you specify more than one instance.
     */

    public void setProcessingResources(ProcessingResources processingResources) {
        this.processingResources = processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @return Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *         distributed training, you specify more than one instance.
     */

    public ProcessingResources getProcessingResources() {
        return this.processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @param processingResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *        distributed training, you specify more than one instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withProcessingResources(ProcessingResources processingResources) {
        setProcessingResources(processingResources);
        return this;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        The time limit for how long the processing job is allowed to run.
     */

    public void setStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @return The time limit for how long the processing job is allowed to run.
     */

    public ProcessingStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        The time limit for how long the processing job is allowed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     * 
     * @param appSpecification
     *        Configures the processing job to run a specified Docker container image.
     */

    public void setAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     * 
     * @return Configures the processing job to run a specified Docker container image.
     */

    public AppSpecification getAppSpecification() {
        return this.appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified Docker container image.
     * </p>
     * 
     * @param appSpecification
     *        Configures the processing job to run a specified Docker container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withAppSpecification(AppSpecification appSpecification) {
        setAppSpecification(appSpecification);
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

    public CreateProcessingJobRequest withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see CreateProcessingJobRequest#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest addEnvironmentEntry(String key, String value) {
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

    public CreateProcessingJobRequest clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a processing job.
     */

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @return Networking options for a processing job.
     */

    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withNetworkConfig(NetworkConfig networkConfig) {
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

    public CreateProcessingJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return (Optional) An array of key-value pairs. For more information, see <a
     *         href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
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
     * href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withTags(Tag... tags) {
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
     * href="https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        (Optional) An array of key-value pairs. For more information, see <a href=
     *        "https://docs-aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param experimentConfig
     */

    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * @return
     */

    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @param experimentConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobRequest withExperimentConfig(ExperimentConfig experimentConfig) {
        setExperimentConfig(experimentConfig);
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
        if (getProcessingInputs() != null)
            sb.append("ProcessingInputs: ").append(getProcessingInputs()).append(",");
        if (getProcessingOutputConfig() != null)
            sb.append("ProcessingOutputConfig: ").append(getProcessingOutputConfig()).append(",");
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: ").append(getProcessingJobName()).append(",");
        if (getProcessingResources() != null)
            sb.append("ProcessingResources: ").append(getProcessingResources()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getAppSpecification() != null)
            sb.append("AppSpecification: ").append(getAppSpecification()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: ").append(getNetworkConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: ").append(getExperimentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProcessingJobRequest == false)
            return false;
        CreateProcessingJobRequest other = (CreateProcessingJobRequest) obj;
        if (other.getProcessingInputs() == null ^ this.getProcessingInputs() == null)
            return false;
        if (other.getProcessingInputs() != null && other.getProcessingInputs().equals(this.getProcessingInputs()) == false)
            return false;
        if (other.getProcessingOutputConfig() == null ^ this.getProcessingOutputConfig() == null)
            return false;
        if (other.getProcessingOutputConfig() != null && other.getProcessingOutputConfig().equals(this.getProcessingOutputConfig()) == false)
            return false;
        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        if (other.getProcessingResources() == null ^ this.getProcessingResources() == null)
            return false;
        if (other.getProcessingResources() != null && other.getProcessingResources().equals(this.getProcessingResources()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getAppSpecification() == null ^ this.getAppSpecification() == null)
            return false;
        if (other.getAppSpecification() != null && other.getAppSpecification().equals(this.getAppSpecification()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingInputs() == null) ? 0 : getProcessingInputs().hashCode());
        hashCode = prime * hashCode + ((getProcessingOutputConfig() == null) ? 0 : getProcessingOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        hashCode = prime * hashCode + ((getProcessingResources() == null) ? 0 : getProcessingResources().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getAppSpecification() == null) ? 0 : getAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateProcessingJobRequest clone() {
        return (CreateProcessingJobRequest) super.clone();
    }

}
