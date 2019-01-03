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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DisassociateDeviceFromPlacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDeviceFromPlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the placement.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The name of the placement that the device should be removed from.
     * </p>
     */
    private String placementName;
    /**
     * <p>
     * The device ID that should be removed from the placement.
     * </p>
     */
    private String deviceTemplateName;

    /**
     * <p>
     * The name of the project that contains the placement.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the placement.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the placement.
     * </p>
     * 
     * @return The name of the project that contains the placement.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the placement.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDeviceFromPlacementRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The name of the placement that the device should be removed from.
     * </p>
     * 
     * @param placementName
     *        The name of the placement that the device should be removed from.
     */

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    /**
     * <p>
     * The name of the placement that the device should be removed from.
     * </p>
     * 
     * @return The name of the placement that the device should be removed from.
     */

    public String getPlacementName() {
        return this.placementName;
    }

    /**
     * <p>
     * The name of the placement that the device should be removed from.
     * </p>
     * 
     * @param placementName
     *        The name of the placement that the device should be removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDeviceFromPlacementRequest withPlacementName(String placementName) {
        setPlacementName(placementName);
        return this;
    }

    /**
     * <p>
     * The device ID that should be removed from the placement.
     * </p>
     * 
     * @param deviceTemplateName
     *        The device ID that should be removed from the placement.
     */

    public void setDeviceTemplateName(String deviceTemplateName) {
        this.deviceTemplateName = deviceTemplateName;
    }

    /**
     * <p>
     * The device ID that should be removed from the placement.
     * </p>
     * 
     * @return The device ID that should be removed from the placement.
     */

    public String getDeviceTemplateName() {
        return this.deviceTemplateName;
    }

    /**
     * <p>
     * The device ID that should be removed from the placement.
     * </p>
     * 
     * @param deviceTemplateName
     *        The device ID that should be removed from the placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDeviceFromPlacementRequest withDeviceTemplateName(String deviceTemplateName) {
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

        if (obj instanceof DisassociateDeviceFromPlacementRequest == false)
            return false;
        DisassociateDeviceFromPlacementRequest other = (DisassociateDeviceFromPlacementRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPlacementName() == null ^ this.getPlacementName() == null)
            return false;
        if (other.getPlacementName() != null && other.getPlacementName().equals(this.getPlacementName()) == false)
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
        hashCode = prime * hashCode + ((getDeviceTemplateName() == null) ? 0 : getDeviceTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateDeviceFromPlacementRequest clone() {
        return (DisassociateDeviceFromPlacementRequest) super.clone();
    }

}
