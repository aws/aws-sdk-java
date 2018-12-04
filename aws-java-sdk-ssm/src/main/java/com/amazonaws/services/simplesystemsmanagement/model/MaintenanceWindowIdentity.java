/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Maintenance Window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Maintenance Window.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the Maintenance Window.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the Maintenance Window is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     */
    private Integer cutoff;

    /**
     * <p>
     * The ID of the Maintenance Window.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window.
     * </p>
     * 
     * @return The ID of the Maintenance Window.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @return The name of the Maintenance Window.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Maintenance Window.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the Maintenance Window.
     * </p>
     * 
     * @param description
     *        A description of the Maintenance Window.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the Maintenance Window.
     * </p>
     * 
     * @return A description of the Maintenance Window.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the Maintenance Window.
     * </p>
     * 
     * @param description
     *        A description of the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the Maintenance Window is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the Maintenance Window is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the Maintenance Window is enabled.
     * </p>
     * 
     * @return Whether the Maintenance Window is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the Maintenance Window is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the Maintenance Window is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the Maintenance Window is enabled.
     * </p>
     * 
     * @return Whether the Maintenance Window is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the Maintenance Window in hours.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @return The duration of the Maintenance Window in hours.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the Maintenance Window in hours.
     * </p>
     * 
     * @param duration
     *        The duration of the Maintenance Window in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *        tasks for execution.
     */

    public void setCutoff(Integer cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @return The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *         tasks for execution.
     */

    public Integer getCutoff() {
        return this.cutoff;
    }

    /**
     * <p>
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for
     * execution.
     * </p>
     * 
     * @param cutoff
     *        The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new
     *        tasks for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowIdentity withCutoff(Integer cutoff) {
        setCutoff(cutoff);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getCutoff() != null)
            sb.append("Cutoff: ").append(getCutoff());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowIdentity == false)
            return false;
        MaintenanceWindowIdentity other = (MaintenanceWindowIdentity) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCutoff() == null ^ this.getCutoff() == null)
            return false;
        if (other.getCutoff() != null && other.getCutoff().equals(this.getCutoff()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCutoff() == null) ? 0 : getCutoff().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowIdentity clone() {
        try {
            return (MaintenanceWindowIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
