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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a thin client device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeviceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The hardware serial number of the device.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The name of the device.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The model number of the device.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The ID of the environment the device is associated with.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The status of the device.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the software set currently installed on the device.
     * </p>
     */
    private String currentSoftwareSetId;
    /**
     * <p>
     * The ID of the software set which the device has been set to.
     * </p>
     */
    private String desiredSoftwareSetId;
    /**
     * <p>
     * The ID of the software set that is pending to be installed on the device.
     * </p>
     */
    private String pendingSoftwareSetId;
    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     */
    private String softwareSetUpdateSchedule;
    /**
     * <p>
     * The timestamp of the most recent session on the device.
     * </p>
     */
    private java.util.Date lastConnectedAt;
    /**
     * <p>
     * The timestamp of the most recent check-in of the device.
     * </p>
     */
    private java.util.Date lastPostureAt;
    /**
     * <p>
     * The timestamp of when the device was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the device was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param id
     *        The ID of the device.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @return The ID of the device.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param id
     *        The ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The hardware serial number of the device.
     * </p>
     * 
     * @param serialNumber
     *        The hardware serial number of the device.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The hardware serial number of the device.
     * </p>
     * 
     * @return The hardware serial number of the device.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The hardware serial number of the device.
     * </p>
     * 
     * @param serialNumber
     *        The hardware serial number of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param name
     *        The name of the device.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @return The name of the device.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the device.
     * </p>
     * 
     * @param name
     *        The name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The model number of the device.
     * </p>
     * 
     * @param model
     *        The model number of the device.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model number of the device.
     * </p>
     * 
     * @return The model number of the device.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model number of the device.
     * </p>
     * 
     * @param model
     *        The model number of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The ID of the environment the device is associated with.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment the device is associated with.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment the device is associated with.
     * </p>
     * 
     * @return The ID of the environment the device is associated with.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment the device is associated with.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment the device is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param status
     *        The status of the device.
     * @see DeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @return The status of the device.
     * @see DeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param status
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the device.
     * </p>
     * 
     * @param status
     *        The status of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DeviceSummary withStatus(DeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the software set currently installed on the device.
     * </p>
     * 
     * @param currentSoftwareSetId
     *        The ID of the software set currently installed on the device.
     */

    public void setCurrentSoftwareSetId(String currentSoftwareSetId) {
        this.currentSoftwareSetId = currentSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set currently installed on the device.
     * </p>
     * 
     * @return The ID of the software set currently installed on the device.
     */

    public String getCurrentSoftwareSetId() {
        return this.currentSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set currently installed on the device.
     * </p>
     * 
     * @param currentSoftwareSetId
     *        The ID of the software set currently installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withCurrentSoftwareSetId(String currentSoftwareSetId) {
        setCurrentSoftwareSetId(currentSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * The ID of the software set which the device has been set to.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set which the device has been set to.
     */

    public void setDesiredSoftwareSetId(String desiredSoftwareSetId) {
        this.desiredSoftwareSetId = desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set which the device has been set to.
     * </p>
     * 
     * @return The ID of the software set which the device has been set to.
     */

    public String getDesiredSoftwareSetId() {
        return this.desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set which the device has been set to.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set which the device has been set to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withDesiredSoftwareSetId(String desiredSoftwareSetId) {
        setDesiredSoftwareSetId(desiredSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed on the device.
     * </p>
     * 
     * @param pendingSoftwareSetId
     *        The ID of the software set that is pending to be installed on the device.
     */

    public void setPendingSoftwareSetId(String pendingSoftwareSetId) {
        this.pendingSoftwareSetId = pendingSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed on the device.
     * </p>
     * 
     * @return The ID of the software set that is pending to be installed on the device.
     */

    public String getPendingSoftwareSetId() {
        return this.pendingSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed on the device.
     * </p>
     * 
     * @param pendingSoftwareSetId
     *        The ID of the software set that is pending to be installed on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withPendingSoftwareSetId(String pendingSoftwareSetId) {
        setPendingSoftwareSetId(pendingSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @see SoftwareSetUpdateSchedule
     */

    public void setSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @return An option to define if software updates should be applied within a maintenance window.
     * @see SoftwareSetUpdateSchedule
     */

    public String getSoftwareSetUpdateSchedule() {
        return this.softwareSetUpdateSchedule;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateSchedule
     */

    public DeviceSummary withSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
        setSoftwareSetUpdateSchedule(softwareSetUpdateSchedule);
        return this;
    }

    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     * 
     * @param softwareSetUpdateSchedule
     *        An option to define if software updates should be applied within a maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateSchedule
     */

    public DeviceSummary withSoftwareSetUpdateSchedule(SoftwareSetUpdateSchedule softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the most recent session on the device.
     * </p>
     * 
     * @param lastConnectedAt
     *        The timestamp of the most recent session on the device.
     */

    public void setLastConnectedAt(java.util.Date lastConnectedAt) {
        this.lastConnectedAt = lastConnectedAt;
    }

    /**
     * <p>
     * The timestamp of the most recent session on the device.
     * </p>
     * 
     * @return The timestamp of the most recent session on the device.
     */

    public java.util.Date getLastConnectedAt() {
        return this.lastConnectedAt;
    }

    /**
     * <p>
     * The timestamp of the most recent session on the device.
     * </p>
     * 
     * @param lastConnectedAt
     *        The timestamp of the most recent session on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withLastConnectedAt(java.util.Date lastConnectedAt) {
        setLastConnectedAt(lastConnectedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of the most recent check-in of the device.
     * </p>
     * 
     * @param lastPostureAt
     *        The timestamp of the most recent check-in of the device.
     */

    public void setLastPostureAt(java.util.Date lastPostureAt) {
        this.lastPostureAt = lastPostureAt;
    }

    /**
     * <p>
     * The timestamp of the most recent check-in of the device.
     * </p>
     * 
     * @return The timestamp of the most recent check-in of the device.
     */

    public java.util.Date getLastPostureAt() {
        return this.lastPostureAt;
    }

    /**
     * <p>
     * The timestamp of the most recent check-in of the device.
     * </p>
     * 
     * @param lastPostureAt
     *        The timestamp of the most recent check-in of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withLastPostureAt(java.util.Date lastPostureAt) {
        setLastPostureAt(lastPostureAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the device was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the device was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the device was created.
     * </p>
     * 
     * @return The timestamp of when the device was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the device was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the device was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the device was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the device was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the device was updated.
     * </p>
     * 
     * @return The timestamp of when the device was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the device was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the device was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceSummary withArn(String arn) {
        setArn(arn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCurrentSoftwareSetId() != null)
            sb.append("CurrentSoftwareSetId: ").append(getCurrentSoftwareSetId()).append(",");
        if (getDesiredSoftwareSetId() != null)
            sb.append("DesiredSoftwareSetId: ").append(getDesiredSoftwareSetId()).append(",");
        if (getPendingSoftwareSetId() != null)
            sb.append("PendingSoftwareSetId: ").append(getPendingSoftwareSetId()).append(",");
        if (getSoftwareSetUpdateSchedule() != null)
            sb.append("SoftwareSetUpdateSchedule: ").append(getSoftwareSetUpdateSchedule()).append(",");
        if (getLastConnectedAt() != null)
            sb.append("LastConnectedAt: ").append(getLastConnectedAt()).append(",");
        if (getLastPostureAt() != null)
            sb.append("LastPostureAt: ").append(getLastPostureAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSummary == false)
            return false;
        DeviceSummary other = (DeviceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCurrentSoftwareSetId() == null ^ this.getCurrentSoftwareSetId() == null)
            return false;
        if (other.getCurrentSoftwareSetId() != null && other.getCurrentSoftwareSetId().equals(this.getCurrentSoftwareSetId()) == false)
            return false;
        if (other.getDesiredSoftwareSetId() == null ^ this.getDesiredSoftwareSetId() == null)
            return false;
        if (other.getDesiredSoftwareSetId() != null && other.getDesiredSoftwareSetId().equals(this.getDesiredSoftwareSetId()) == false)
            return false;
        if (other.getPendingSoftwareSetId() == null ^ this.getPendingSoftwareSetId() == null)
            return false;
        if (other.getPendingSoftwareSetId() != null && other.getPendingSoftwareSetId().equals(this.getPendingSoftwareSetId()) == false)
            return false;
        if (other.getSoftwareSetUpdateSchedule() == null ^ this.getSoftwareSetUpdateSchedule() == null)
            return false;
        if (other.getSoftwareSetUpdateSchedule() != null && other.getSoftwareSetUpdateSchedule().equals(this.getSoftwareSetUpdateSchedule()) == false)
            return false;
        if (other.getLastConnectedAt() == null ^ this.getLastConnectedAt() == null)
            return false;
        if (other.getLastConnectedAt() != null && other.getLastConnectedAt().equals(this.getLastConnectedAt()) == false)
            return false;
        if (other.getLastPostureAt() == null ^ this.getLastPostureAt() == null)
            return false;
        if (other.getLastPostureAt() != null && other.getLastPostureAt().equals(this.getLastPostureAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentSoftwareSetId() == null) ? 0 : getCurrentSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getDesiredSoftwareSetId() == null) ? 0 : getDesiredSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getPendingSoftwareSetId() == null) ? 0 : getPendingSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateSchedule() == null) ? 0 : getSoftwareSetUpdateSchedule().hashCode());
        hashCode = prime * hashCode + ((getLastConnectedAt() == null) ? 0 : getLastConnectedAt().hashCode());
        hashCode = prime * hashCode + ((getLastPostureAt() == null) ? 0 : getLastPostureAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public DeviceSummary clone() {
        try {
            return (DeviceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesthinclient.model.transform.DeviceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
