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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTargetFromMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTargetFromMaintenanceWindowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window the target should be removed from.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The ID of the target definition to remove.
     * </p>
     */
    private String windowTargetId;
    /**
     * <p>
     * The system checks if the target is being referenced by a task. If the target is being referenced, the system
     * returns an error and does not deregister the target from the Maintenance Window.
     * </p>
     */
    private Boolean safe;

    /**
     * <p>
     * The ID of the Maintenance Window the target should be removed from.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the target should be removed from.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the target should be removed from.
     * </p>
     * 
     * @return The ID of the Maintenance Window the target should be removed from.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the target should be removed from.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the target should be removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetFromMaintenanceWindowRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The ID of the target definition to remove.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition to remove.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition to remove.
     * </p>
     * 
     * @return The ID of the target definition to remove.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition to remove.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetFromMaintenanceWindowRequest withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
        return this;
    }

    /**
     * <p>
     * The system checks if the target is being referenced by a task. If the target is being referenced, the system
     * returns an error and does not deregister the target from the Maintenance Window.
     * </p>
     * 
     * @param safe
     *        The system checks if the target is being referenced by a task. If the target is being referenced, the
     *        system returns an error and does not deregister the target from the Maintenance Window.
     */

    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    /**
     * <p>
     * The system checks if the target is being referenced by a task. If the target is being referenced, the system
     * returns an error and does not deregister the target from the Maintenance Window.
     * </p>
     * 
     * @return The system checks if the target is being referenced by a task. If the target is being referenced, the
     *         system returns an error and does not deregister the target from the Maintenance Window.
     */

    public Boolean getSafe() {
        return this.safe;
    }

    /**
     * <p>
     * The system checks if the target is being referenced by a task. If the target is being referenced, the system
     * returns an error and does not deregister the target from the Maintenance Window.
     * </p>
     * 
     * @param safe
     *        The system checks if the target is being referenced by a task. If the target is being referenced, the
     *        system returns an error and does not deregister the target from the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTargetFromMaintenanceWindowRequest withSafe(Boolean safe) {
        setSafe(safe);
        return this;
    }

    /**
     * <p>
     * The system checks if the target is being referenced by a task. If the target is being referenced, the system
     * returns an error and does not deregister the target from the Maintenance Window.
     * </p>
     * 
     * @return The system checks if the target is being referenced by a task. If the target is being referenced, the
     *         system returns an error and does not deregister the target from the Maintenance Window.
     */

    public Boolean isSafe() {
        return this.safe;
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: ").append(getWindowTargetId()).append(",");
        if (getSafe() != null)
            sb.append("Safe: ").append(getSafe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTargetFromMaintenanceWindowRequest == false)
            return false;
        DeregisterTargetFromMaintenanceWindowRequest other = (DeregisterTargetFromMaintenanceWindowRequest) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
            return false;
        if (other.getSafe() == null ^ this.getSafe() == null)
            return false;
        if (other.getSafe() != null && other.getSafe().equals(this.getSafe()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        hashCode = prime * hashCode + ((getSafe() == null) ? 0 : getSafe().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterTargetFromMaintenanceWindowRequest clone() {
        return (DeregisterTargetFromMaintenanceWindowRequest) super.clone();
    }

}
