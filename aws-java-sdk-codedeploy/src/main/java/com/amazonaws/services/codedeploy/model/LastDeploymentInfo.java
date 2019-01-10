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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the most recent attempted or successful deployment to a deployment group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/LastDeploymentInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastDeploymentInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group was complete.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group started.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastDeploymentInfo withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * 
     * @param status
     *        The status of the most recent deployment.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * 
     * @return The status of the most recent deployment.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * 
     * @param status
     *        The status of the most recent deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public LastDeploymentInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * 
     * @param status
     *        The status of the most recent deployment.
     * @see DeploymentStatus
     */

    public void setStatus(DeploymentStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * 
     * @param status
     *        The status of the most recent deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public LastDeploymentInfo withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group was complete.
     * </p>
     * 
     * @param endTime
     *        A timestamp that indicates when the most recent deployment to the deployment group was complete.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group was complete.
     * </p>
     * 
     * @return A timestamp that indicates when the most recent deployment to the deployment group was complete.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group was complete.
     * </p>
     * 
     * @param endTime
     *        A timestamp that indicates when the most recent deployment to the deployment group was complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastDeploymentInfo withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group started.
     * </p>
     * 
     * @param createTime
     *        A timestamp that indicates when the most recent deployment to the deployment group started.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group started.
     * </p>
     * 
     * @return A timestamp that indicates when the most recent deployment to the deployment group started.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the deployment group started.
     * </p>
     * 
     * @param createTime
     *        A timestamp that indicates when the most recent deployment to the deployment group started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastDeploymentInfo withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastDeploymentInfo == false)
            return false;
        LastDeploymentInfo other = (LastDeploymentInfo) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public LastDeploymentInfo clone() {
        try {
            return (LastDeploymentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.LastDeploymentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
