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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/AssociateDeviceWithPlacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDeviceWithPlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project containing the placement in which to associate the device.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The name of the placement in which to associate the device.
     * </p>
     */
    private String placementName;
    /**
     * <p>
     * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4
     * character prefix is required for all <code>deviceId</code> values.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The device template name to associate with the device ID.
     * </p>
     */
    private String deviceTemplateName;

    /**
     * <p>
     * The name of the project containing the placement in which to associate the device.
     * </p>
     * 
     * @param projectName
     *        The name of the project containing the placement in which to associate the device.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project containing the placement in which to associate the device.
     * </p>
     * 
     * @return The name of the project containing the placement in which to associate the device.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project containing the placement in which to associate the device.
     * </p>
     * 
     * @param projectName
     *        The name of the project containing the placement in which to associate the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDeviceWithPlacementRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The name of the placement in which to associate the device.
     * </p>
     * 
     * @param placementName
     *        The name of the placement in which to associate the device.
     */

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    /**
     * <p>
     * The name of the placement in which to associate the device.
     * </p>
     * 
     * @return The name of the placement in which to associate the device.
     */

    public String getPlacementName() {
        return this.placementName;
    }

    /**
     * <p>
     * The name of the placement in which to associate the device.
     * </p>
     * 
     * @param placementName
     *        The name of the placement in which to associate the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDeviceWithPlacementRequest withPlacementName(String placementName) {
        setPlacementName(placementName);
        return this;
    }

    /**
     * <p>
     * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4
     * character prefix is required for all <code>deviceId</code> values.
     * </p>
     * 
     * @param deviceId
     *        The ID of the physical device to be associated with the given placement in the project. Note that a
     *        mandatory 4 character prefix is required for all <code>deviceId</code> values.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4
     * character prefix is required for all <code>deviceId</code> values.
     * </p>
     * 
     * @return The ID of the physical device to be associated with the given placement in the project. Note that a
     *         mandatory 4 character prefix is required for all <code>deviceId</code> values.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the physical device to be associated with the given placement in the project. Note that a mandatory 4
     * character prefix is required for all <code>deviceId</code> values.
     * </p>
     * 
     * @param deviceId
     *        The ID of the physical device to be associated with the given placement in the project. Note that a
     *        mandatory 4 character prefix is required for all <code>deviceId</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDeviceWithPlacementRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The device template name to associate with the device ID.
     * </p>
     * 
     * @param deviceTemplateName
     *        The device template name to associate with the device ID.
     */

    public void setDeviceTemplateName(String deviceTemplateName) {
        this.deviceTemplateName = deviceTemplateName;
    }

    /**
     * <p>
     * The device template name to associate with the device ID.
     * </p>
     * 
     * @return The device template name to associate with the device ID.
     */

    public String getDeviceTemplateName() {
        return this.deviceTemplateName;
    }

    /**
     * <p>
     * The device template name to associate with the device ID.
     * </p>
     * 
     * @param deviceTemplateName
     *        The device template name to associate with the device ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDeviceWithPlacementRequest withDeviceTemplateName(String deviceTemplateName) {
        setDeviceTemplateName(deviceTemplateName);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getPlacementName() != null)
            sb.append("PlacementName: ").append(getPlacementName()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDeviceTemplateName() != null)
            sb.append("DeviceTemplateName: ").append(getDeviceTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDeviceWithPlacementRequest == false)
            return false;
        AssociateDeviceWithPlacementRequest other = (AssociateDeviceWithPlacementRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPlacementName() == null ^ this.getPlacementName() == null)
            return false;
        if (other.getPlacementName() != null && other.getPlacementName().equals(this.getPlacementName()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDeviceTemplateName() == null ^ this.getDeviceTemplateName() == null)
            return false;
        if (other.getDeviceTemplateName() != null && other.getDeviceTemplateName().equals(this.getDeviceTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getPlacementName() == null) ? 0 : getPlacementName().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceTemplateName() == null) ? 0 : getDeviceTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDeviceWithPlacementRequest clone() {
        return (AssociateDeviceWithPlacementRequest) super.clone();
    }

}
