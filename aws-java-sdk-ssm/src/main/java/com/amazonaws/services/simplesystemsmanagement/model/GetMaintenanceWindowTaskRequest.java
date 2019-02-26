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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Maintenance Window ID that includes the task to retrieve.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The Maintenance Window task ID to retrieve.
     * </p>
     */
    private String windowTaskId;

    /**
     * <p>
     * The Maintenance Window ID that includes the task to retrieve.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID that includes the task to retrieve.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID that includes the task to retrieve.
     * </p>
     * 
     * @return The Maintenance Window ID that includes the task to retrieve.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The Maintenance Window ID that includes the task to retrieve.
     * </p>
     * 
     * @param windowId
     *        The Maintenance Window ID that includes the task to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskRequest withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The Maintenance Window task ID to retrieve.
     * </p>
     * 
     * @param windowTaskId
     *        The Maintenance Window task ID to retrieve.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The Maintenance Window task ID to retrieve.
     * </p>
     * 
     * @return The Maintenance Window task ID to retrieve.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The Maintenance Window task ID to retrieve.
     * </p>
     * 
     * @param windowTaskId
     *        The Maintenance Window task ID to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowTaskRequest withWindowTaskId(String windowTaskId) {
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

        if (obj instanceof GetMaintenanceWindowTaskRequest == false)
            return false;
        GetMaintenanceWindowTaskRequest other = (GetMaintenanceWindowTaskRequest) obj;
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
    public GetMaintenanceWindowTaskRequest clone() {
        return (GetMaintenanceWindowTaskRequest) super.clone();
    }

}
