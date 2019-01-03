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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTaskFromMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterTaskFromMaintenanceWindowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window the task was removed from.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The ID of the task removed from the Maintenance Window.
     * </p>
     */
    private String windowTaskId;

    /**
     * <p>
     * The ID of the Maintenance Window the task was removed from.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the task was removed from.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the task was removed from.
     * </p>
     * 
     * @return The ID of the Maintenance Window the task was removed from.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window the task was removed from.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window the task was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTaskFromMaintenanceWindowResult withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The ID of the task removed from the Maintenance Window.
     * </p>
     * 
     * @param windowTaskId
     *        The ID of the task removed from the Maintenance Window.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The ID of the task removed from the Maintenance Window.
     * </p>
     * 
     * @return The ID of the task removed from the Maintenance Window.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The ID of the task removed from the Maintenance Window.
     * </p>
     * 
     * @param windowTaskId
     *        The ID of the task removed from the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterTaskFromMaintenanceWindowResult withWindowTaskId(String windowTaskId) {
        setWindowTaskId(windowTaskId);
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getWindowTaskId() != null)
            sb.append("WindowTaskId: ").append(getWindowTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTaskFromMaintenanceWindowResult == false)
            return false;
        DeregisterTaskFromMaintenanceWindowResult other = (DeregisterTaskFromMaintenanceWindowResult) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getWindowTaskId() == null ^ this.getWindowTaskId() == null)
            return false;
        if (other.getWindowTaskId() != null && other.getWindowTaskId().equals(this.getWindowTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterTaskFromMaintenanceWindowResult clone() {
        try {
            return (DeregisterTaskFromMaintenanceWindowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
