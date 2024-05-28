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
 * Describes an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/EnvironmentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the environment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     */
    private String desktopArn;
    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     */
    private String desktopEndpoint;
    /**
     * <p>
     * The type of streaming desktop for the environment.
     * </p>
     */
    private String desktopType;
    /**
     * <p>
     * The activation code to register a device to the environment.
     * </p>
     */
    private String activationCode;
    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     */
    private String softwareSetUpdateSchedule;
    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     */
    private MaintenanceWindow maintenanceWindow;
    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     */
    private String softwareSetUpdateMode;
    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     */
    private String desiredSoftwareSetId;
    /**
     * <p>
     * The ID of the software set that is pending to be installed.
     * </p>
     */
    private String pendingSoftwareSetId;
    /**
     * <p>
     * The timestamp of when the environment was created.
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
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @return The ID of the environment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @param desktopArn
     *        The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *        AppStream 2.0.
     */

    public void setDesktopArn(String desktopArn) {
        this.desktopArn = desktopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *         AppStream 2.0.
     */

    public String getDesktopArn() {
        return this.desktopArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or AppStream 2.0.
     * </p>
     * 
     * @param desktopArn
     *        The Amazon Resource Name (ARN) of the desktop to stream from Amazon WorkSpaces, WorkSpaces Web, or
     *        AppStream 2.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withDesktopArn(String desktopArn) {
        setDesktopArn(desktopArn);
        return this;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @param desktopEndpoint
     *        The URL for the identity provider login (only for environments that use AppStream 2.0).
     */

    public void setDesktopEndpoint(String desktopEndpoint) {
        this.desktopEndpoint = desktopEndpoint;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @return The URL for the identity provider login (only for environments that use AppStream 2.0).
     */

    public String getDesktopEndpoint() {
        return this.desktopEndpoint;
    }

    /**
     * <p>
     * The URL for the identity provider login (only for environments that use AppStream 2.0).
     * </p>
     * 
     * @param desktopEndpoint
     *        The URL for the identity provider login (only for environments that use AppStream 2.0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withDesktopEndpoint(String desktopEndpoint) {
        setDesktopEndpoint(desktopEndpoint);
        return this;
    }

    /**
     * <p>
     * The type of streaming desktop for the environment.
     * </p>
     * 
     * @param desktopType
     *        The type of streaming desktop for the environment.
     * @see DesktopType
     */

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    /**
     * <p>
     * The type of streaming desktop for the environment.
     * </p>
     * 
     * @return The type of streaming desktop for the environment.
     * @see DesktopType
     */

    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * <p>
     * The type of streaming desktop for the environment.
     * </p>
     * 
     * @param desktopType
     *        The type of streaming desktop for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesktopType
     */

    public EnvironmentSummary withDesktopType(String desktopType) {
        setDesktopType(desktopType);
        return this;
    }

    /**
     * <p>
     * The type of streaming desktop for the environment.
     * </p>
     * 
     * @param desktopType
     *        The type of streaming desktop for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DesktopType
     */

    public EnvironmentSummary withDesktopType(DesktopType desktopType) {
        this.desktopType = desktopType.toString();
        return this;
    }

    /**
     * <p>
     * The activation code to register a device to the environment.
     * </p>
     * 
     * @param activationCode
     *        The activation code to register a device to the environment.
     */

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * <p>
     * The activation code to register a device to the environment.
     * </p>
     * 
     * @return The activation code to register a device to the environment.
     */

    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * <p>
     * The activation code to register a device to the environment.
     * </p>
     * 
     * @param activationCode
     *        The activation code to register a device to the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withActivationCode(String activationCode) {
        setActivationCode(activationCode);
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

    public EnvironmentSummary withSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
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

    public EnvironmentSummary withSoftwareSetUpdateSchedule(SoftwareSetUpdateSchedule softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule.toString();
        return this;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @param maintenanceWindow
     *        A specification for a time window to apply software updates.
     */

    public void setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @return A specification for a time window to apply software updates.
     */

    public MaintenanceWindow getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * A specification for a time window to apply software updates.
     * </p>
     * 
     * @param maintenanceWindow
     *        A specification for a time window to apply software updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @see SoftwareSetUpdateMode
     */

    public void setSoftwareSetUpdateMode(String softwareSetUpdateMode) {
        this.softwareSetUpdateMode = softwareSetUpdateMode;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @return An option to define which software updates to apply.
     * @see SoftwareSetUpdateMode
     */

    public String getSoftwareSetUpdateMode() {
        return this.softwareSetUpdateMode;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateMode
     */

    public EnvironmentSummary withSoftwareSetUpdateMode(String softwareSetUpdateMode) {
        setSoftwareSetUpdateMode(softwareSetUpdateMode);
        return this;
    }

    /**
     * <p>
     * An option to define which software updates to apply.
     * </p>
     * 
     * @param softwareSetUpdateMode
     *        An option to define which software updates to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SoftwareSetUpdateMode
     */

    public EnvironmentSummary withSoftwareSetUpdateMode(SoftwareSetUpdateMode softwareSetUpdateMode) {
        this.softwareSetUpdateMode = softwareSetUpdateMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set to apply.
     */

    public void setDesiredSoftwareSetId(String desiredSoftwareSetId) {
        this.desiredSoftwareSetId = desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @return The ID of the software set to apply.
     */

    public String getDesiredSoftwareSetId() {
        return this.desiredSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     * 
     * @param desiredSoftwareSetId
     *        The ID of the software set to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withDesiredSoftwareSetId(String desiredSoftwareSetId) {
        setDesiredSoftwareSetId(desiredSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed.
     * </p>
     * 
     * @param pendingSoftwareSetId
     *        The ID of the software set that is pending to be installed.
     */

    public void setPendingSoftwareSetId(String pendingSoftwareSetId) {
        this.pendingSoftwareSetId = pendingSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed.
     * </p>
     * 
     * @return The ID of the software set that is pending to be installed.
     */

    public String getPendingSoftwareSetId() {
        return this.pendingSoftwareSetId;
    }

    /**
     * <p>
     * The ID of the software set that is pending to be installed.
     * </p>
     * 
     * @param pendingSoftwareSetId
     *        The ID of the software set that is pending to be installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withPendingSoftwareSetId(String pendingSoftwareSetId) {
        setPendingSoftwareSetId(pendingSoftwareSetId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @return The timestamp of when the environment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withCreatedAt(java.util.Date createdAt) {
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

    public EnvironmentSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withArn(String arn) {
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDesktopArn() != null)
            sb.append("DesktopArn: ").append(getDesktopArn()).append(",");
        if (getDesktopEndpoint() != null)
            sb.append("DesktopEndpoint: ").append("***Sensitive Data Redacted***").append(",");
        if (getDesktopType() != null)
            sb.append("DesktopType: ").append(getDesktopType()).append(",");
        if (getActivationCode() != null)
            sb.append("ActivationCode: ").append(getActivationCode()).append(",");
        if (getSoftwareSetUpdateSchedule() != null)
            sb.append("SoftwareSetUpdateSchedule: ").append(getSoftwareSetUpdateSchedule()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getSoftwareSetUpdateMode() != null)
            sb.append("SoftwareSetUpdateMode: ").append(getSoftwareSetUpdateMode()).append(",");
        if (getDesiredSoftwareSetId() != null)
            sb.append("DesiredSoftwareSetId: ").append(getDesiredSoftwareSetId()).append(",");
        if (getPendingSoftwareSetId() != null)
            sb.append("PendingSoftwareSetId: ").append(getPendingSoftwareSetId()).append(",");
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

        if (obj instanceof EnvironmentSummary == false)
            return false;
        EnvironmentSummary other = (EnvironmentSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDesktopArn() == null ^ this.getDesktopArn() == null)
            return false;
        if (other.getDesktopArn() != null && other.getDesktopArn().equals(this.getDesktopArn()) == false)
            return false;
        if (other.getDesktopEndpoint() == null ^ this.getDesktopEndpoint() == null)
            return false;
        if (other.getDesktopEndpoint() != null && other.getDesktopEndpoint().equals(this.getDesktopEndpoint()) == false)
            return false;
        if (other.getDesktopType() == null ^ this.getDesktopType() == null)
            return false;
        if (other.getDesktopType() != null && other.getDesktopType().equals(this.getDesktopType()) == false)
            return false;
        if (other.getActivationCode() == null ^ this.getActivationCode() == null)
            return false;
        if (other.getActivationCode() != null && other.getActivationCode().equals(this.getActivationCode()) == false)
            return false;
        if (other.getSoftwareSetUpdateSchedule() == null ^ this.getSoftwareSetUpdateSchedule() == null)
            return false;
        if (other.getSoftwareSetUpdateSchedule() != null && other.getSoftwareSetUpdateSchedule().equals(this.getSoftwareSetUpdateSchedule()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getSoftwareSetUpdateMode() == null ^ this.getSoftwareSetUpdateMode() == null)
            return false;
        if (other.getSoftwareSetUpdateMode() != null && other.getSoftwareSetUpdateMode().equals(this.getSoftwareSetUpdateMode()) == false)
            return false;
        if (other.getDesiredSoftwareSetId() == null ^ this.getDesiredSoftwareSetId() == null)
            return false;
        if (other.getDesiredSoftwareSetId() != null && other.getDesiredSoftwareSetId().equals(this.getDesiredSoftwareSetId()) == false)
            return false;
        if (other.getPendingSoftwareSetId() == null ^ this.getPendingSoftwareSetId() == null)
            return false;
        if (other.getPendingSoftwareSetId() != null && other.getPendingSoftwareSetId().equals(this.getPendingSoftwareSetId()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDesktopArn() == null) ? 0 : getDesktopArn().hashCode());
        hashCode = prime * hashCode + ((getDesktopEndpoint() == null) ? 0 : getDesktopEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDesktopType() == null) ? 0 : getDesktopType().hashCode());
        hashCode = prime * hashCode + ((getActivationCode() == null) ? 0 : getActivationCode().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateSchedule() == null) ? 0 : getSoftwareSetUpdateSchedule().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateMode() == null) ? 0 : getSoftwareSetUpdateMode().hashCode());
        hashCode = prime * hashCode + ((getDesiredSoftwareSetId() == null) ? 0 : getDesiredSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getPendingSoftwareSetId() == null) ? 0 : getPendingSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentSummary clone() {
        try {
            return (EnvironmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesthinclient.model.transform.EnvironmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
