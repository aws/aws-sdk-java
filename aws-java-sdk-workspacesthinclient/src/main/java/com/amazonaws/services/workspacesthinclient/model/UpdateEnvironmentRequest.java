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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment to update.
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
     * The ID of the environment to update.
     * </p>
     * 
     * @param id
     *        The ID of the environment to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * 
     * @return The ID of the environment to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * 
     * @param id
     *        The ID of the environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @param name
     *        The name of the environment to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @return The name of the environment to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @param name
     *        The name of the environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
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

    public UpdateEnvironmentRequest withDesktopArn(String desktopArn) {
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

    public UpdateEnvironmentRequest withDesktopEndpoint(String desktopEndpoint) {
        setDesktopEndpoint(desktopEndpoint);
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

    public UpdateEnvironmentRequest withSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
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

    public UpdateEnvironmentRequest withSoftwareSetUpdateSchedule(SoftwareSetUpdateSchedule softwareSetUpdateSchedule) {
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

    public UpdateEnvironmentRequest withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
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

    public UpdateEnvironmentRequest withSoftwareSetUpdateMode(String softwareSetUpdateMode) {
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

    public UpdateEnvironmentRequest withSoftwareSetUpdateMode(SoftwareSetUpdateMode softwareSetUpdateMode) {
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

    public UpdateEnvironmentRequest withDesiredSoftwareSetId(String desiredSoftwareSetId) {
        setDesiredSoftwareSetId(desiredSoftwareSetId);
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
        if (getSoftwareSetUpdateSchedule() != null)
            sb.append("SoftwareSetUpdateSchedule: ").append(getSoftwareSetUpdateSchedule()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getSoftwareSetUpdateMode() != null)
            sb.append("SoftwareSetUpdateMode: ").append(getSoftwareSetUpdateMode()).append(",");
        if (getDesiredSoftwareSetId() != null)
            sb.append("DesiredSoftwareSetId: ").append(getDesiredSoftwareSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
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
        hashCode = prime * hashCode + ((getSoftwareSetUpdateSchedule() == null) ? 0 : getSoftwareSetUpdateSchedule().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateMode() == null) ? 0 : getSoftwareSetUpdateMode().hashCode());
        hashCode = prime * hashCode + ((getDesiredSoftwareSetId() == null) ? 0 : getDesiredSoftwareSetId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
