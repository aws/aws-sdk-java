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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the result of a deployment on an edge device that is registered with SageMaker Edge Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/DeploymentResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     */
    private String deploymentName;
    /**
     * <p>
     * Returns the bucket error code.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * Returns the detailed error message.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * The timestamp of when the deployment was started on the agent.
     * </p>
     */
    private java.util.Date deploymentStartTime;
    /**
     * <p>
     * The timestamp of when the deployment was ended, and the agent got the deployment results.
     * </p>
     */
    private java.util.Date deploymentEndTime;
    /**
     * <p>
     * Returns a list of models deployed on the agent.
     * </p>
     */
    private java.util.List<DeploymentModel> deploymentModels;

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name and unique ID of the deployment.
     */

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @return The name and unique ID of the deployment.
     */

    public String getDeploymentName() {
        return this.deploymentName;
    }

    /**
     * <p>
     * The name and unique ID of the deployment.
     * </p>
     * 
     * @param deploymentName
     *        The name and unique ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentName(String deploymentName) {
        setDeploymentName(deploymentName);
        return this;
    }

    /**
     * <p>
     * Returns the bucket error code.
     * </p>
     * 
     * @param deploymentStatus
     *        Returns the bucket error code.
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * Returns the bucket error code.
     * </p>
     * 
     * @return Returns the bucket error code.
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * Returns the bucket error code.
     * </p>
     * 
     * @param deploymentStatus
     *        Returns the bucket error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * Returns the detailed error message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        Returns the detailed error message.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * Returns the detailed error message.
     * </p>
     * 
     * @return Returns the detailed error message.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * Returns the detailed error message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        Returns the detailed error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the deployment was started on the agent.
     * </p>
     * 
     * @param deploymentStartTime
     *        The timestamp of when the deployment was started on the agent.
     */

    public void setDeploymentStartTime(java.util.Date deploymentStartTime) {
        this.deploymentStartTime = deploymentStartTime;
    }

    /**
     * <p>
     * The timestamp of when the deployment was started on the agent.
     * </p>
     * 
     * @return The timestamp of when the deployment was started on the agent.
     */

    public java.util.Date getDeploymentStartTime() {
        return this.deploymentStartTime;
    }

    /**
     * <p>
     * The timestamp of when the deployment was started on the agent.
     * </p>
     * 
     * @param deploymentStartTime
     *        The timestamp of when the deployment was started on the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentStartTime(java.util.Date deploymentStartTime) {
        setDeploymentStartTime(deploymentStartTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the deployment was ended, and the agent got the deployment results.
     * </p>
     * 
     * @param deploymentEndTime
     *        The timestamp of when the deployment was ended, and the agent got the deployment results.
     */

    public void setDeploymentEndTime(java.util.Date deploymentEndTime) {
        this.deploymentEndTime = deploymentEndTime;
    }

    /**
     * <p>
     * The timestamp of when the deployment was ended, and the agent got the deployment results.
     * </p>
     * 
     * @return The timestamp of when the deployment was ended, and the agent got the deployment results.
     */

    public java.util.Date getDeploymentEndTime() {
        return this.deploymentEndTime;
    }

    /**
     * <p>
     * The timestamp of when the deployment was ended, and the agent got the deployment results.
     * </p>
     * 
     * @param deploymentEndTime
     *        The timestamp of when the deployment was ended, and the agent got the deployment results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentEndTime(java.util.Date deploymentEndTime) {
        setDeploymentEndTime(deploymentEndTime);
        return this;
    }

    /**
     * <p>
     * Returns a list of models deployed on the agent.
     * </p>
     * 
     * @return Returns a list of models deployed on the agent.
     */

    public java.util.List<DeploymentModel> getDeploymentModels() {
        return deploymentModels;
    }

    /**
     * <p>
     * Returns a list of models deployed on the agent.
     * </p>
     * 
     * @param deploymentModels
     *        Returns a list of models deployed on the agent.
     */

    public void setDeploymentModels(java.util.Collection<DeploymentModel> deploymentModels) {
        if (deploymentModels == null) {
            this.deploymentModels = null;
            return;
        }

        this.deploymentModels = new java.util.ArrayList<DeploymentModel>(deploymentModels);
    }

    /**
     * <p>
     * Returns a list of models deployed on the agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentModels(java.util.Collection)} or {@link #withDeploymentModels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deploymentModels
     *        Returns a list of models deployed on the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentModels(DeploymentModel... deploymentModels) {
        if (this.deploymentModels == null) {
            setDeploymentModels(new java.util.ArrayList<DeploymentModel>(deploymentModels.length));
        }
        for (DeploymentModel ele : deploymentModels) {
            this.deploymentModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of models deployed on the agent.
     * </p>
     * 
     * @param deploymentModels
     *        Returns a list of models deployed on the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentResult withDeploymentModels(java.util.Collection<DeploymentModel> deploymentModels) {
        setDeploymentModels(deploymentModels);
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
        if (getDeploymentName() != null)
            sb.append("DeploymentName: ").append(getDeploymentName()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentStatusMessage() != null)
            sb.append("DeploymentStatusMessage: ").append(getDeploymentStatusMessage()).append(",");
        if (getDeploymentStartTime() != null)
            sb.append("DeploymentStartTime: ").append(getDeploymentStartTime()).append(",");
        if (getDeploymentEndTime() != null)
            sb.append("DeploymentEndTime: ").append(getDeploymentEndTime()).append(",");
        if (getDeploymentModels() != null)
            sb.append("DeploymentModels: ").append(getDeploymentModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentResult == false)
            return false;
        DeploymentResult other = (DeploymentResult) obj;
        if (other.getDeploymentName() == null ^ this.getDeploymentName() == null)
            return false;
        if (other.getDeploymentName() != null && other.getDeploymentName().equals(this.getDeploymentName()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentStatusMessage() == null ^ this.getDeploymentStatusMessage() == null)
            return false;
        if (other.getDeploymentStatusMessage() != null && other.getDeploymentStatusMessage().equals(this.getDeploymentStatusMessage()) == false)
            return false;
        if (other.getDeploymentStartTime() == null ^ this.getDeploymentStartTime() == null)
            return false;
        if (other.getDeploymentStartTime() != null && other.getDeploymentStartTime().equals(this.getDeploymentStartTime()) == false)
            return false;
        if (other.getDeploymentEndTime() == null ^ this.getDeploymentEndTime() == null)
            return false;
        if (other.getDeploymentEndTime() != null && other.getDeploymentEndTime().equals(this.getDeploymentEndTime()) == false)
            return false;
        if (other.getDeploymentModels() == null ^ this.getDeploymentModels() == null)
            return false;
        if (other.getDeploymentModels() != null && other.getDeploymentModels().equals(this.getDeploymentModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentName() == null) ? 0 : getDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatusMessage() == null) ? 0 : getDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStartTime() == null) ? 0 : getDeploymentStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentEndTime() == null) ? 0 : getDeploymentEndTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentModels() == null) ? 0 : getDeploymentModels().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentResult clone() {
        try {
            return (DeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.DeploymentResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
