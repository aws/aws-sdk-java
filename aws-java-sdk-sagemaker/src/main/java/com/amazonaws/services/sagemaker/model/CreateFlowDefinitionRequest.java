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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFlowDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     */
    private String flowDefinitionName;
    /**
     * <p>
     * An object containing information about the events that trigger a human workflow.
     * </p>
     */
    private HumanLoopActivationConfig humanLoopActivationConfig;
    /**
     * <p>
     * An object containing information about the tasks the human reviewers will perform.
     * </p>
     */
    private HumanLoopConfig humanLoopConfig;
    /**
     * <p>
     * An object containing information about where the human review results will be uploaded.
     * </p>
     */
    private FlowDefinitionOutputConfig outputConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of your flow definition.
     */

    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * 
     * @return The name of your flow definition.
     */

    public String getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    /**
     * <p>
     * The name of your flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of your flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withFlowDefinitionName(String flowDefinitionName) {
        setFlowDefinitionName(flowDefinitionName);
        return this;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human workflow.
     * </p>
     * 
     * @param humanLoopActivationConfig
     *        An object containing information about the events that trigger a human workflow.
     */

    public void setHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human workflow.
     * </p>
     * 
     * @return An object containing information about the events that trigger a human workflow.
     */

    public HumanLoopActivationConfig getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about the events that trigger a human workflow.
     * </p>
     * 
     * @param humanLoopActivationConfig
     *        An object containing information about the events that trigger a human workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        setHumanLoopActivationConfig(humanLoopActivationConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will perform.
     * </p>
     * 
     * @param humanLoopConfig
     *        An object containing information about the tasks the human reviewers will perform.
     */

    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will perform.
     * </p>
     * 
     * @return An object containing information about the tasks the human reviewers will perform.
     */

    public HumanLoopConfig getHumanLoopConfig() {
        return this.humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about the tasks the human reviewers will perform.
     * </p>
     * 
     * @param humanLoopConfig
     *        An object containing information about the tasks the human reviewers will perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        setHumanLoopConfig(humanLoopConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about where the human review results will be uploaded.
     * </p>
     * 
     * @param outputConfig
     *        An object containing information about where the human review results will be uploaded.
     */

    public void setOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * An object containing information about where the human review results will be uploaded.
     * </p>
     * 
     * @return An object containing information about where the human review results will be uploaded.
     */

    public FlowDefinitionOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * An object containing information about where the human review results will be uploaded.
     * </p>
     * 
     * @param outputConfig
     *        An object containing information about where the human review results will be uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     *        <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     *         <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     * <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example,
     *        <code>arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @return An array of key-value pairs that contain metadata to help you categorize and organize a flow definition.
     *         Each tag consists of a key and a value, both of which you define.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a flow definition.
     *        Each tag consists of a key and a value, both of which you define.
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
     * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a flow definition.
     *        Each tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withTags(Tag... tags) {
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
     * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize a flow definition.
     *        Each tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowDefinitionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: ").append(getFlowDefinitionName()).append(",");
        if (getHumanLoopActivationConfig() != null)
            sb.append("HumanLoopActivationConfig: ").append(getHumanLoopActivationConfig()).append(",");
        if (getHumanLoopConfig() != null)
            sb.append("HumanLoopConfig: ").append(getHumanLoopConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof CreateFlowDefinitionRequest == false)
            return false;
        CreateFlowDefinitionRequest other = (CreateFlowDefinitionRequest) obj;
        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        if (other.getHumanLoopActivationConfig() == null ^ this.getHumanLoopActivationConfig() == null)
            return false;
        if (other.getHumanLoopActivationConfig() != null && other.getHumanLoopActivationConfig().equals(this.getHumanLoopActivationConfig()) == false)
            return false;
        if (other.getHumanLoopConfig() == null ^ this.getHumanLoopConfig() == null)
            return false;
        if (other.getHumanLoopConfig() != null && other.getHumanLoopConfig().equals(this.getHumanLoopConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopActivationConfig() == null) ? 0 : getHumanLoopActivationConfig().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopConfig() == null) ? 0 : getHumanLoopConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowDefinitionRequest clone() {
        return (CreateFlowDefinitionRequest) super.clone();
    }

}
