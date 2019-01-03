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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTaskWithMaintenanceWindowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the task in the Maintenance Window.
     * </p>
     */
    private String windowTaskId;

    /**
     * <p>
     * The ID of the task in the Maintenance Window.
     * </p>
     * 
     * @param windowTaskId
     *        The ID of the task in the Maintenance Window.
     */

    public void setWindowTaskId(String windowTaskId) {
        this.windowTaskId = windowTaskId;
    }

    /**
     * <p>
     * The ID of the task in the Maintenance Window.
     * </p>
     * 
     * @return The ID of the task in the Maintenance Window.
     */

    public String getWindowTaskId() {
        return this.windowTaskId;
    }

    /**
     * <p>
     * The ID of the task in the Maintenance Window.
     * </p>
     * 
     * @param windowTaskId
     *        The ID of the task in the Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTaskWithMaintenanceWindowResult withWindowTaskId(String windowTaskId) {
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

        if (obj instanceof RegisterTaskWithMaintenanceWindowResult == false)
            return false;
        RegisterTaskWithMaintenanceWindowResult other = (RegisterTaskWithMaintenanceWindowResult) obj;
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

        hashCode = prime * hashCode + ((getWindowTaskId() == null) ? 0 : getWindowTaskId().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTaskWithMaintenanceWindowResult clone() {
        try {
            return (RegisterTaskWithMaintenanceWindowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
