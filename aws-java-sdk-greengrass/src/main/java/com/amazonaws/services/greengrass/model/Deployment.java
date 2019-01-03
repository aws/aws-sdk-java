/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a deployment.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Deployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deployment implements Serializable, Cloneable, StructuredPojo {

    /** The time, in milliseconds since the epoch, when the deployment was created. */
    private String createdAt;
    /** The ARN of the deployment. */
    private String deploymentArn;
    /** The ID of the deployment. */
    private String deploymentId;
    /** The type of the deployment. */
    private String deploymentType;
    /** The ARN of the group for this deployment. */
    private String groupArn;

    /**
     * The time, in milliseconds since the epoch, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the deployment was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time, in milliseconds since the epoch, when the deployment was created.
     * 
     * @return The time, in milliseconds since the epoch, when the deployment was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time, in milliseconds since the epoch, when the deployment was created.
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The ARN of the deployment.
     * 
     * @param deploymentArn
     *        The ARN of the deployment.
     */

    public void setDeploymentArn(String deploymentArn) {
        this.deploymentArn = deploymentArn;
    }

    /**
     * The ARN of the deployment.
     * 
     * @return The ARN of the deployment.
     */

    public String getDeploymentArn() {
        return this.deploymentArn;
    }

    /**
     * The ARN of the deployment.
     * 
     * @param deploymentArn
     *        The ARN of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentArn(String deploymentArn) {
        setDeploymentArn(deploymentArn);
        return this;
    }

    /**
     * The ID of the deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * The ID of the deployment.
     * 
     * @return The ID of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The ID of the deployment.
     * 
     * @param deploymentId
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * The type of the deployment.
     * 
     * @return The type of the deployment.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public Deployment withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * The type of the deployment.
     * 
     * @param deploymentType
     *        The type of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public Deployment withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * The ARN of the group for this deployment.
     * 
     * @param groupArn
     *        The ARN of the group for this deployment.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * The ARN of the group for this deployment.
     * 
     * @return The ARN of the group for this deployment.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * The ARN of the group for this deployment.
     * 
     * @param groupArn
     *        The ARN of the group for this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Deployment withGroupArn(String groupArn) {
        setGroupArn(groupArn);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentArn() != null)
            sb.append("DeploymentArn: ").append(getDeploymentArn()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeploymentArn() == null ^ this.getDeploymentArn() == null)
            return false;
        if (other.getDeploymentArn() != null && other.getDeploymentArn().equals(this.getDeploymentArn()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentArn() == null) ? 0 : getDeploymentArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.DeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
