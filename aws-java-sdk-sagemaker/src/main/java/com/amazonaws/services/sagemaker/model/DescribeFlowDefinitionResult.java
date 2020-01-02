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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFlowDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     */
    private String flowDefinitionName;
    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     */
    private String flowDefinitionStatus;
    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * An object containing information about what triggers a human review workflow.
     * </p>
     */
    private HumanLoopActivationConfig humanLoopActivationConfig;
    /**
     * <p>
     * An object containing information about who works on the task, the workforce task price, and other task details.
     * </p>
     */
    private HumanLoopConfig humanLoopConfig;
    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     */
    private FlowDefinitionOutputConfig outputConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     * definition.
     * </p>
     */
    private String roleArn;
    /** <p/> */
    private String failureReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow defintion.
     */

    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow defintion.
     */

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow defintion.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow defintion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The Amazon Resource Name (ARN) of the flow definition.
     */

    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow definition.
     */

    public String getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionName
     *        The Amazon Resource Name (ARN) of the flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withFlowDefinitionName(String flowDefinitionName) {
        setFlowDefinitionName(flowDefinitionName);
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values are listed below.
     * @see FlowDefinitionStatus
     */

    public void setFlowDefinitionStatus(String flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * 
     * @return The status of the flow definition. Valid values are listed below.
     * @see FlowDefinitionStatus
     */

    public String getFlowDefinitionStatus() {
        return this.flowDefinitionStatus;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowDefinitionStatus
     */

    public DescribeFlowDefinitionResult withFlowDefinitionStatus(String flowDefinitionStatus) {
        setFlowDefinitionStatus(flowDefinitionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the flow definition. Valid values are listed below.
     * </p>
     * 
     * @param flowDefinitionStatus
     *        The status of the flow definition. Valid values are listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowDefinitionStatus
     */

    public DescribeFlowDefinitionResult withFlowDefinitionStatus(FlowDefinitionStatus flowDefinitionStatus) {
        this.flowDefinitionStatus = flowDefinitionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the flow definition was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     * 
     * @return The timestamp when the flow definition was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the flow definition was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the flow definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review workflow.
     * </p>
     * 
     * @param humanLoopActivationConfig
     *        An object containing information about what triggers a human review workflow.
     */

    public void setHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        this.humanLoopActivationConfig = humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review workflow.
     * </p>
     * 
     * @return An object containing information about what triggers a human review workflow.
     */

    public HumanLoopActivationConfig getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig;
    }

    /**
     * <p>
     * An object containing information about what triggers a human review workflow.
     * </p>
     * 
     * @param humanLoopActivationConfig
     *        An object containing information about what triggers a human review workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withHumanLoopActivationConfig(HumanLoopActivationConfig humanLoopActivationConfig) {
        setHumanLoopActivationConfig(humanLoopActivationConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the workforce task price, and other task details.
     * </p>
     * 
     * @param humanLoopConfig
     *        An object containing information about who works on the task, the workforce task price, and other task
     *        details.
     */

    public void setHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        this.humanLoopConfig = humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the workforce task price, and other task details.
     * </p>
     * 
     * @return An object containing information about who works on the task, the workforce task price, and other task
     *         details.
     */

    public HumanLoopConfig getHumanLoopConfig() {
        return this.humanLoopConfig;
    }

    /**
     * <p>
     * An object containing information about who works on the task, the workforce task price, and other task details.
     * </p>
     * 
     * @param humanLoopConfig
     *        An object containing information about who works on the task, the workforce task price, and other task
     *        details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withHumanLoopConfig(HumanLoopConfig humanLoopConfig) {
        setHumanLoopConfig(humanLoopConfig);
        return this;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     * 
     * @param outputConfig
     *        An object containing information about the output file.
     */

    public void setOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     * 
     * @return An object containing information about the output file.
     */

    public FlowDefinitionOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * An object containing information about the output file.
     * </p>
     * 
     * @param outputConfig
     *        An object containing information about the output file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withOutputConfig(FlowDefinitionOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     * definition.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     *        definition.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     * definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the
     *         flow definition.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     * definition.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role for the flow
     *        definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param failureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p/>
     * 
     * @param failureReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowDefinitionResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: ").append(getFlowDefinitionName()).append(",");
        if (getFlowDefinitionStatus() != null)
            sb.append("FlowDefinitionStatus: ").append(getFlowDefinitionStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getHumanLoopActivationConfig() != null)
            sb.append("HumanLoopActivationConfig: ").append(getHumanLoopActivationConfig()).append(",");
        if (getHumanLoopConfig() != null)
            sb.append("HumanLoopConfig: ").append(getHumanLoopConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowDefinitionResult == false)
            return false;
        DescribeFlowDefinitionResult other = (DescribeFlowDefinitionResult) obj;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        if (other.getFlowDefinitionStatus() == null ^ this.getFlowDefinitionStatus() == null)
            return false;
        if (other.getFlowDefinitionStatus() != null && other.getFlowDefinitionStatus().equals(this.getFlowDefinitionStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionStatus() == null) ? 0 : getFlowDefinitionStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopActivationConfig() == null) ? 0 : getHumanLoopActivationConfig().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopConfig() == null) ? 0 : getHumanLoopConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowDefinitionResult clone() {
        try {
            return (DescribeFlowDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
