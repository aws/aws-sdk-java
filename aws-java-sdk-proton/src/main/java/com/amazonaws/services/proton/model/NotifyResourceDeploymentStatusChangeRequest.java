/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/NotifyResourceDeploymentStatusChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyResourceDeploymentStatusChangeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment ID for your provisioned resource.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The provisioned resource state change detail data that's returned by Proton.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * The provisioned resource Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The status of your provisioned resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The deployment status message for your provisioned resource.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The deployment ID for your provisioned resource.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID for your provisioned resource.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment ID for your provisioned resource.
     * </p>
     * 
     * @return The deployment ID for your provisioned resource.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment ID for your provisioned resource.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID for your provisioned resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyResourceDeploymentStatusChangeRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The provisioned resource state change detail data that's returned by Proton.
     * </p>
     * 
     * @return The provisioned resource state change detail data that's returned by Proton.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The provisioned resource state change detail data that's returned by Proton.
     * </p>
     * 
     * @param outputs
     *        The provisioned resource state change detail data that's returned by Proton.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * The provisioned resource state change detail data that's returned by Proton.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The provisioned resource state change detail data that's returned by Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyResourceDeploymentStatusChangeRequest withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The provisioned resource state change detail data that's returned by Proton.
     * </p>
     * 
     * @param outputs
     *        The provisioned resource state change detail data that's returned by Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyResourceDeploymentStatusChangeRequest withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The provisioned resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The provisioned resource Amazon Resource Name (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The provisioned resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The provisioned resource Amazon Resource Name (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The provisioned resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        The provisioned resource Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyResourceDeploymentStatusChangeRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The status of your provisioned resource.
     * </p>
     * 
     * @param status
     *        The status of your provisioned resource.
     * @see ResourceDeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of your provisioned resource.
     * </p>
     * 
     * @return The status of your provisioned resource.
     * @see ResourceDeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of your provisioned resource.
     * </p>
     * 
     * @param status
     *        The status of your provisioned resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceDeploymentStatus
     */

    public NotifyResourceDeploymentStatusChangeRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of your provisioned resource.
     * </p>
     * 
     * @param status
     *        The status of your provisioned resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceDeploymentStatus
     */

    public NotifyResourceDeploymentStatusChangeRequest withStatus(ResourceDeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The deployment status message for your provisioned resource.
     * </p>
     * 
     * @param statusMessage
     *        The deployment status message for your provisioned resource.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The deployment status message for your provisioned resource.
     * </p>
     * 
     * @return The deployment status message for your provisioned resource.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The deployment status message for your provisioned resource.
     * </p>
     * 
     * @param statusMessage
     *        The deployment status message for your provisioned resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyResourceDeploymentStatusChangeRequest withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyResourceDeploymentStatusChangeRequest == false)
            return false;
        NotifyResourceDeploymentStatusChangeRequest other = (NotifyResourceDeploymentStatusChangeRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public NotifyResourceDeploymentStatusChangeRequest clone() {
        return (NotifyResourceDeploymentStatusChangeRequest) super.clone();
    }

}
