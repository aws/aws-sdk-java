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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information summarizing the deployment stage results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeDeploymentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeDeploymentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The general status of the current stage.
     * </p>
     */
    private String stageStatus;
    /**
     * <p>
     * The number of edge devices with the successful deployment in the current stage.
     * </p>
     */
    private Integer edgeDeploymentSuccessInStage;
    /**
     * <p>
     * The number of edge devices yet to pick up the deployment in current stage, or in progress.
     * </p>
     */
    private Integer edgeDeploymentPendingInStage;
    /**
     * <p>
     * The number of edge devices that failed the deployment in current stage.
     * </p>
     */
    private Integer edgeDeploymentFailedInStage;
    /**
     * <p>
     * A detailed message about deployment status in current stage.
     * </p>
     */
    private String edgeDeploymentStatusMessage;
    /**
     * <p>
     * The time when the deployment API started.
     * </p>
     */
    private java.util.Date edgeDeploymentStageStartTime;

    /**
     * <p>
     * The general status of the current stage.
     * </p>
     * 
     * @param stageStatus
     *        The general status of the current stage.
     * @see StageStatus
     */

    public void setStageStatus(String stageStatus) {
        this.stageStatus = stageStatus;
    }

    /**
     * <p>
     * The general status of the current stage.
     * </p>
     * 
     * @return The general status of the current stage.
     * @see StageStatus
     */

    public String getStageStatus() {
        return this.stageStatus;
    }

    /**
     * <p>
     * The general status of the current stage.
     * </p>
     * 
     * @param stageStatus
     *        The general status of the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageStatus
     */

    public EdgeDeploymentStatus withStageStatus(String stageStatus) {
        setStageStatus(stageStatus);
        return this;
    }

    /**
     * <p>
     * The general status of the current stage.
     * </p>
     * 
     * @param stageStatus
     *        The general status of the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageStatus
     */

    public EdgeDeploymentStatus withStageStatus(StageStatus stageStatus) {
        this.stageStatus = stageStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment in the current stage.
     * </p>
     * 
     * @param edgeDeploymentSuccessInStage
     *        The number of edge devices with the successful deployment in the current stage.
     */

    public void setEdgeDeploymentSuccessInStage(Integer edgeDeploymentSuccessInStage) {
        this.edgeDeploymentSuccessInStage = edgeDeploymentSuccessInStage;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment in the current stage.
     * </p>
     * 
     * @return The number of edge devices with the successful deployment in the current stage.
     */

    public Integer getEdgeDeploymentSuccessInStage() {
        return this.edgeDeploymentSuccessInStage;
    }

    /**
     * <p>
     * The number of edge devices with the successful deployment in the current stage.
     * </p>
     * 
     * @param edgeDeploymentSuccessInStage
     *        The number of edge devices with the successful deployment in the current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentStatus withEdgeDeploymentSuccessInStage(Integer edgeDeploymentSuccessInStage) {
        setEdgeDeploymentSuccessInStage(edgeDeploymentSuccessInStage);
        return this;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up the deployment in current stage, or in progress.
     * </p>
     * 
     * @param edgeDeploymentPendingInStage
     *        The number of edge devices yet to pick up the deployment in current stage, or in progress.
     */

    public void setEdgeDeploymentPendingInStage(Integer edgeDeploymentPendingInStage) {
        this.edgeDeploymentPendingInStage = edgeDeploymentPendingInStage;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up the deployment in current stage, or in progress.
     * </p>
     * 
     * @return The number of edge devices yet to pick up the deployment in current stage, or in progress.
     */

    public Integer getEdgeDeploymentPendingInStage() {
        return this.edgeDeploymentPendingInStage;
    }

    /**
     * <p>
     * The number of edge devices yet to pick up the deployment in current stage, or in progress.
     * </p>
     * 
     * @param edgeDeploymentPendingInStage
     *        The number of edge devices yet to pick up the deployment in current stage, or in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentStatus withEdgeDeploymentPendingInStage(Integer edgeDeploymentPendingInStage) {
        setEdgeDeploymentPendingInStage(edgeDeploymentPendingInStage);
        return this;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment in current stage.
     * </p>
     * 
     * @param edgeDeploymentFailedInStage
     *        The number of edge devices that failed the deployment in current stage.
     */

    public void setEdgeDeploymentFailedInStage(Integer edgeDeploymentFailedInStage) {
        this.edgeDeploymentFailedInStage = edgeDeploymentFailedInStage;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment in current stage.
     * </p>
     * 
     * @return The number of edge devices that failed the deployment in current stage.
     */

    public Integer getEdgeDeploymentFailedInStage() {
        return this.edgeDeploymentFailedInStage;
    }

    /**
     * <p>
     * The number of edge devices that failed the deployment in current stage.
     * </p>
     * 
     * @param edgeDeploymentFailedInStage
     *        The number of edge devices that failed the deployment in current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentStatus withEdgeDeploymentFailedInStage(Integer edgeDeploymentFailedInStage) {
        setEdgeDeploymentFailedInStage(edgeDeploymentFailedInStage);
        return this;
    }

    /**
     * <p>
     * A detailed message about deployment status in current stage.
     * </p>
     * 
     * @param edgeDeploymentStatusMessage
     *        A detailed message about deployment status in current stage.
     */

    public void setEdgeDeploymentStatusMessage(String edgeDeploymentStatusMessage) {
        this.edgeDeploymentStatusMessage = edgeDeploymentStatusMessage;
    }

    /**
     * <p>
     * A detailed message about deployment status in current stage.
     * </p>
     * 
     * @return A detailed message about deployment status in current stage.
     */

    public String getEdgeDeploymentStatusMessage() {
        return this.edgeDeploymentStatusMessage;
    }

    /**
     * <p>
     * A detailed message about deployment status in current stage.
     * </p>
     * 
     * @param edgeDeploymentStatusMessage
     *        A detailed message about deployment status in current stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentStatus withEdgeDeploymentStatusMessage(String edgeDeploymentStatusMessage) {
        setEdgeDeploymentStatusMessage(edgeDeploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The time when the deployment API started.
     * </p>
     * 
     * @param edgeDeploymentStageStartTime
     *        The time when the deployment API started.
     */

    public void setEdgeDeploymentStageStartTime(java.util.Date edgeDeploymentStageStartTime) {
        this.edgeDeploymentStageStartTime = edgeDeploymentStageStartTime;
    }

    /**
     * <p>
     * The time when the deployment API started.
     * </p>
     * 
     * @return The time when the deployment API started.
     */

    public java.util.Date getEdgeDeploymentStageStartTime() {
        return this.edgeDeploymentStageStartTime;
    }

    /**
     * <p>
     * The time when the deployment API started.
     * </p>
     * 
     * @param edgeDeploymentStageStartTime
     *        The time when the deployment API started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeDeploymentStatus withEdgeDeploymentStageStartTime(java.util.Date edgeDeploymentStageStartTime) {
        setEdgeDeploymentStageStartTime(edgeDeploymentStageStartTime);
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
        if (getStageStatus() != null)
            sb.append("StageStatus: ").append(getStageStatus()).append(",");
        if (getEdgeDeploymentSuccessInStage() != null)
            sb.append("EdgeDeploymentSuccessInStage: ").append(getEdgeDeploymentSuccessInStage()).append(",");
        if (getEdgeDeploymentPendingInStage() != null)
            sb.append("EdgeDeploymentPendingInStage: ").append(getEdgeDeploymentPendingInStage()).append(",");
        if (getEdgeDeploymentFailedInStage() != null)
            sb.append("EdgeDeploymentFailedInStage: ").append(getEdgeDeploymentFailedInStage()).append(",");
        if (getEdgeDeploymentStatusMessage() != null)
            sb.append("EdgeDeploymentStatusMessage: ").append(getEdgeDeploymentStatusMessage()).append(",");
        if (getEdgeDeploymentStageStartTime() != null)
            sb.append("EdgeDeploymentStageStartTime: ").append(getEdgeDeploymentStageStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeDeploymentStatus == false)
            return false;
        EdgeDeploymentStatus other = (EdgeDeploymentStatus) obj;
        if (other.getStageStatus() == null ^ this.getStageStatus() == null)
            return false;
        if (other.getStageStatus() != null && other.getStageStatus().equals(this.getStageStatus()) == false)
            return false;
        if (other.getEdgeDeploymentSuccessInStage() == null ^ this.getEdgeDeploymentSuccessInStage() == null)
            return false;
        if (other.getEdgeDeploymentSuccessInStage() != null && other.getEdgeDeploymentSuccessInStage().equals(this.getEdgeDeploymentSuccessInStage()) == false)
            return false;
        if (other.getEdgeDeploymentPendingInStage() == null ^ this.getEdgeDeploymentPendingInStage() == null)
            return false;
        if (other.getEdgeDeploymentPendingInStage() != null && other.getEdgeDeploymentPendingInStage().equals(this.getEdgeDeploymentPendingInStage()) == false)
            return false;
        if (other.getEdgeDeploymentFailedInStage() == null ^ this.getEdgeDeploymentFailedInStage() == null)
            return false;
        if (other.getEdgeDeploymentFailedInStage() != null && other.getEdgeDeploymentFailedInStage().equals(this.getEdgeDeploymentFailedInStage()) == false)
            return false;
        if (other.getEdgeDeploymentStatusMessage() == null ^ this.getEdgeDeploymentStatusMessage() == null)
            return false;
        if (other.getEdgeDeploymentStatusMessage() != null && other.getEdgeDeploymentStatusMessage().equals(this.getEdgeDeploymentStatusMessage()) == false)
            return false;
        if (other.getEdgeDeploymentStageStartTime() == null ^ this.getEdgeDeploymentStageStartTime() == null)
            return false;
        if (other.getEdgeDeploymentStageStartTime() != null && other.getEdgeDeploymentStageStartTime().equals(this.getEdgeDeploymentStageStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageStatus() == null) ? 0 : getStageStatus().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentSuccessInStage() == null) ? 0 : getEdgeDeploymentSuccessInStage().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentPendingInStage() == null) ? 0 : getEdgeDeploymentPendingInStage().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentFailedInStage() == null) ? 0 : getEdgeDeploymentFailedInStage().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentStatusMessage() == null) ? 0 : getEdgeDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentStageStartTime() == null) ? 0 : getEdgeDeploymentStageStartTime().hashCode());
        return hashCode;
    }

    @Override
    public EdgeDeploymentStatus clone() {
        try {
            return (EdgeDeploymentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeDeploymentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
