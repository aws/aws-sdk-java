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
 * Contains information summarizing device details and deployment status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeviceDeploymentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceDeploymentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanArn;
    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * The name of the stage in the edge deployment plan.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The name of the deployed stage.
     * </p>
     */
    private String deployedStageName;
    /**
     * <p>
     * The name of the fleet to which the device belongs to.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The name of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The ARN of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The deployment status of the device.
     * </p>
     */
    private String deviceDeploymentStatus;
    /**
     * <p>
     * The detailed error message for the deployoment status result.
     * </p>
     */
    private String deviceDeploymentStatusMessage;
    /**
     * <p>
     * The description of the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time when the deployment on the device started.
     * </p>
     */
    private java.util.Date deploymentStartTime;

    /**
     * <p>
     * The ARN of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanArn
     *        The ARN of the edge deployment plan.
     */

    public void setEdgeDeploymentPlanArn(String edgeDeploymentPlanArn) {
        this.edgeDeploymentPlanArn = edgeDeploymentPlanArn;
    }

    /**
     * <p>
     * The ARN of the edge deployment plan.
     * </p>
     * 
     * @return The ARN of the edge deployment plan.
     */

    public String getEdgeDeploymentPlanArn() {
        return this.edgeDeploymentPlanArn;
    }

    /**
     * <p>
     * The ARN of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanArn
     *        The ARN of the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withEdgeDeploymentPlanArn(String edgeDeploymentPlanArn) {
        setEdgeDeploymentPlanArn(edgeDeploymentPlanArn);
        return this;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     */

    public void setEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        this.edgeDeploymentPlanName = edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @return The name of the edge deployment plan.
     */

    public String getEdgeDeploymentPlanName() {
        return this.edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * The name of the stage in the edge deployment plan.
     * </p>
     * 
     * @param stageName
     *        The name of the stage in the edge deployment plan.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage in the edge deployment plan.
     * </p>
     * 
     * @return The name of the stage in the edge deployment plan.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage in the edge deployment plan.
     * </p>
     * 
     * @param stageName
     *        The name of the stage in the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The name of the deployed stage.
     * </p>
     * 
     * @param deployedStageName
     *        The name of the deployed stage.
     */

    public void setDeployedStageName(String deployedStageName) {
        this.deployedStageName = deployedStageName;
    }

    /**
     * <p>
     * The name of the deployed stage.
     * </p>
     * 
     * @return The name of the deployed stage.
     */

    public String getDeployedStageName() {
        return this.deployedStageName;
    }

    /**
     * <p>
     * The name of the deployed stage.
     * </p>
     * 
     * @param deployedStageName
     *        The name of the deployed stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeployedStageName(String deployedStageName) {
        setDeployedStageName(deployedStageName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet to which the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet to which the device belongs to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet to which the device belongs to.
     * </p>
     * 
     * @return The name of the fleet to which the device belongs to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet to which the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet to which the device belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @return The name of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param deviceName
     *        The name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @return The ARN of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The deployment status of the device.
     * </p>
     * 
     * @param deviceDeploymentStatus
     *        The deployment status of the device.
     * @see DeviceDeploymentStatus
     */

    public void setDeviceDeploymentStatus(String deviceDeploymentStatus) {
        this.deviceDeploymentStatus = deviceDeploymentStatus;
    }

    /**
     * <p>
     * The deployment status of the device.
     * </p>
     * 
     * @return The deployment status of the device.
     * @see DeviceDeploymentStatus
     */

    public String getDeviceDeploymentStatus() {
        return this.deviceDeploymentStatus;
    }

    /**
     * <p>
     * The deployment status of the device.
     * </p>
     * 
     * @param deviceDeploymentStatus
     *        The deployment status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceDeploymentStatus
     */

    public DeviceDeploymentSummary withDeviceDeploymentStatus(String deviceDeploymentStatus) {
        setDeviceDeploymentStatus(deviceDeploymentStatus);
        return this;
    }

    /**
     * <p>
     * The deployment status of the device.
     * </p>
     * 
     * @param deviceDeploymentStatus
     *        The deployment status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceDeploymentStatus
     */

    public DeviceDeploymentSummary withDeviceDeploymentStatus(DeviceDeploymentStatus deviceDeploymentStatus) {
        this.deviceDeploymentStatus = deviceDeploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The detailed error message for the deployoment status result.
     * </p>
     * 
     * @param deviceDeploymentStatusMessage
     *        The detailed error message for the deployoment status result.
     */

    public void setDeviceDeploymentStatusMessage(String deviceDeploymentStatusMessage) {
        this.deviceDeploymentStatusMessage = deviceDeploymentStatusMessage;
    }

    /**
     * <p>
     * The detailed error message for the deployoment status result.
     * </p>
     * 
     * @return The detailed error message for the deployoment status result.
     */

    public String getDeviceDeploymentStatusMessage() {
        return this.deviceDeploymentStatusMessage;
    }

    /**
     * <p>
     * The detailed error message for the deployoment status result.
     * </p>
     * 
     * @param deviceDeploymentStatusMessage
     *        The detailed error message for the deployoment status result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeviceDeploymentStatusMessage(String deviceDeploymentStatusMessage) {
        setDeviceDeploymentStatusMessage(deviceDeploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @param description
     *        The description of the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @return The description of the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the device.
     * </p>
     * 
     * @param description
     *        The description of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time when the deployment on the device started.
     * </p>
     * 
     * @param deploymentStartTime
     *        The time when the deployment on the device started.
     */

    public void setDeploymentStartTime(java.util.Date deploymentStartTime) {
        this.deploymentStartTime = deploymentStartTime;
    }

    /**
     * <p>
     * The time when the deployment on the device started.
     * </p>
     * 
     * @return The time when the deployment on the device started.
     */

    public java.util.Date getDeploymentStartTime() {
        return this.deploymentStartTime;
    }

    /**
     * <p>
     * The time when the deployment on the device started.
     * </p>
     * 
     * @param deploymentStartTime
     *        The time when the deployment on the device started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceDeploymentSummary withDeploymentStartTime(java.util.Date deploymentStartTime) {
        setDeploymentStartTime(deploymentStartTime);
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
        if (getEdgeDeploymentPlanArn() != null)
            sb.append("EdgeDeploymentPlanArn: ").append(getEdgeDeploymentPlanArn()).append(",");
        if (getEdgeDeploymentPlanName() != null)
            sb.append("EdgeDeploymentPlanName: ").append(getEdgeDeploymentPlanName()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getDeployedStageName() != null)
            sb.append("DeployedStageName: ").append(getDeployedStageName()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceDeploymentStatus() != null)
            sb.append("DeviceDeploymentStatus: ").append(getDeviceDeploymentStatus()).append(",");
        if (getDeviceDeploymentStatusMessage() != null)
            sb.append("DeviceDeploymentStatusMessage: ").append(getDeviceDeploymentStatusMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeploymentStartTime() != null)
            sb.append("DeploymentStartTime: ").append(getDeploymentStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceDeploymentSummary == false)
            return false;
        DeviceDeploymentSummary other = (DeviceDeploymentSummary) obj;
        if (other.getEdgeDeploymentPlanArn() == null ^ this.getEdgeDeploymentPlanArn() == null)
            return false;
        if (other.getEdgeDeploymentPlanArn() != null && other.getEdgeDeploymentPlanArn().equals(this.getEdgeDeploymentPlanArn()) == false)
            return false;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getDeployedStageName() == null ^ this.getDeployedStageName() == null)
            return false;
        if (other.getDeployedStageName() != null && other.getDeployedStageName().equals(this.getDeployedStageName()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceDeploymentStatus() == null ^ this.getDeviceDeploymentStatus() == null)
            return false;
        if (other.getDeviceDeploymentStatus() != null && other.getDeviceDeploymentStatus().equals(this.getDeviceDeploymentStatus()) == false)
            return false;
        if (other.getDeviceDeploymentStatusMessage() == null ^ this.getDeviceDeploymentStatusMessage() == null)
            return false;
        if (other.getDeviceDeploymentStatusMessage() != null
                && other.getDeviceDeploymentStatusMessage().equals(this.getDeviceDeploymentStatusMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeploymentStartTime() == null ^ this.getDeploymentStartTime() == null)
            return false;
        if (other.getDeploymentStartTime() != null && other.getDeploymentStartTime().equals(this.getDeploymentStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgeDeploymentPlanArn() == null) ? 0 : getEdgeDeploymentPlanArn().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDeployedStageName() == null) ? 0 : getDeployedStageName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceDeploymentStatus() == null) ? 0 : getDeviceDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeviceDeploymentStatusMessage() == null) ? 0 : getDeviceDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStartTime() == null) ? 0 : getDeploymentStartTime().hashCode());
        return hashCode;
    }

    @Override
    public DeviceDeploymentSummary clone() {
        try {
            return (DeviceDeploymentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeviceDeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
