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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/SendWorkflowStepAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendWorkflowStepActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The workflow step that sent the step action.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that received the action request.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The workflow step that sent the step action.
     * </p>
     * 
     * @param stepExecutionId
     *        The workflow step that sent the step action.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * The workflow step that sent the step action.
     * </p>
     * 
     * @return The workflow step that sent the step action.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * The workflow step that sent the step action.
     * </p>
     * 
     * @param stepExecutionId
     *        The workflow step that sent the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionResult withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that received the action request.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that received the action request.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that received the action request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image build version that received the action request.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that received the action request.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that received the action request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionResult withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @param clientToken
     *        The client token that uniquely identifies the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @return The client token that uniquely identifies the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @param clientToken
     *        The client token that uniquely identifies the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendWorkflowStepActionResult withClientToken(String clientToken) {
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

        if (obj instanceof SendWorkflowStepActionResult == false)
            return false;
        SendWorkflowStepActionResult other = (SendWorkflowStepActionResult) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
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
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public SendWorkflowStepActionResult clone() {
        try {
            return (SendWorkflowStepActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
