/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/SendWorkflowStepAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendWorkflowStepActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies the workflow step that sent the step action.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version to send action for.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits for an
     * asynchronous action to complete.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The reason why this action is sent.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Uniquely identifies the workflow step that sent the step action.
     * </p>
     * 
     * @param stepExecutionId
     *        Uniquely identifies the workflow step that sent the step action.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the workflow step that sent the step action.
     * </p>
     * 
     * @return Uniquely identifies the workflow step that sent the step action.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the workflow step that sent the step action.
     * </p>
     * 
     * @param stepExecutionId
     *        Uniquely identifies the workflow step that sent the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionRequest withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version to send action for.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version to send action for.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version to send action for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image build version to send action for.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version to send action for.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version to send action for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionRequest withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits for an
     * asynchronous action to complete.
     * </p>
     * 
     * @param action
     *        The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits
     *        for an asynchronous action to complete.
     * @see WorkflowStepActionType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits for an
     * asynchronous action to complete.
     * </p>
     * 
     * @return The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits
     *         for an asynchronous action to complete.
     * @see WorkflowStepActionType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits for an
     * asynchronous action to complete.
     * </p>
     * 
     * @param action
     *        The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits
     *        for an asynchronous action to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepActionType
     */

    public SendWorkflowStepActionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits for an
     * asynchronous action to complete.
     * </p>
     * 
     * @param action
     *        The action for the image creation process to take while a workflow <code>WaitForAction</code> step waits
     *        for an asynchronous action to complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepActionType
     */

    public SendWorkflowStepActionRequest withAction(WorkflowStepActionType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The reason why this action is sent.
     * </p>
     * 
     * @param reason
     *        The reason why this action is sent.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason why this action is sent.
     * </p>
     * 
     * @return The reason why this action is sent.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason why this action is sent.
     * </p>
     * 
     * @param reason
     *        The reason why this action is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the <i>Amazon EC2 API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId()).append(",");
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendWorkflowStepActionRequest == false)
            return false;
        SendWorkflowStepActionRequest other = (SendWorkflowStepActionRequest) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public SendWorkflowStepActionRequest clone() {
        return (SendWorkflowStepActionRequest) super.clone();
    }

}
