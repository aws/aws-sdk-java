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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the device to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the device to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the software set to apply.
     * </p>
     */
    private String desiredSoftwareSetId;
    /**
     * <p>
     * An option to define if software updates should be applied within a maintenance window.
     * </p>
     */
    private String softwareSetUpdateSchedule;

    /**
     * <p>
     * The ID of the device to update.
     * </p>
     * 
     * @param id
     *        The ID of the device to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the device to update.
     * </p>
     * 
     * @return The ID of the device to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the device to update.
     * </p>
     * 
     * @param id
     *        The ID of the device to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the device to update.
     * </p>
     * 
     * @param name
     *        The name of the device to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the device to update.
     * </p>
     * 
     * @return The name of the device to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the device to update.
     * </p>
     * 
     * @param name
     *        The name of the device to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withName(String name) {
        setName(name);
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

    public UpdateDeviceRequest withDesiredSoftwareSetId(String desiredSoftwareSetId) {
        setDesiredSoftwareSetId(desiredSoftwareSetId);
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

    public UpdateDeviceRequest withSoftwareSetUpdateSchedule(String softwareSetUpdateSchedule) {
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

    public UpdateDeviceRequest withSoftwareSetUpdateSchedule(SoftwareSetUpdateSchedule softwareSetUpdateSchedule) {
        this.softwareSetUpdateSchedule = softwareSetUpdateSchedule.toString();
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
        if (getDesiredSoftwareSetId() != null)
            sb.append("DesiredSoftwareSetId: ").append(getDesiredSoftwareSetId()).append(",");
        if (getSoftwareSetUpdateSchedule() != null)
            sb.append("SoftwareSetUpdateSchedule: ").append(getSoftwareSetUpdateSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceRequest == false)
            return false;
        UpdateDeviceRequest other = (UpdateDeviceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDesiredSoftwareSetId() == null ^ this.getDesiredSoftwareSetId() == null)
            return false;
        if (other.getDesiredSoftwareSetId() != null && other.getDesiredSoftwareSetId().equals(this.getDesiredSoftwareSetId()) == false)
            return false;
        if (other.getSoftwareSetUpdateSchedule() == null ^ this.getSoftwareSetUpdateSchedule() == null)
            return false;
        if (other.getSoftwareSetUpdateSchedule() != null && other.getSoftwareSetUpdateSchedule().equals(this.getSoftwareSetUpdateSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDesiredSoftwareSetId() == null) ? 0 : getDesiredSoftwareSetId().hashCode());
        hashCode = prime * hashCode + ((getSoftwareSetUpdateSchedule() == null) ? 0 : getSoftwareSetUpdateSchedule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceRequest clone() {
        return (UpdateDeviceRequest) super.clone();
    }

}
