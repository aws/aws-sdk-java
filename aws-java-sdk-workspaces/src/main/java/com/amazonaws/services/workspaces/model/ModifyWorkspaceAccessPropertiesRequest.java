/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModifyWorkspaceAccessProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyWorkspaceAccessPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The device types and operating systems to enable or disable for access.
     * </p>
     */
    private WorkspaceAccessProperties workspaceAccessProperties;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyWorkspaceAccessPropertiesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The device types and operating systems to enable or disable for access.
     * </p>
     * 
     * @param workspaceAccessProperties
     *        The device types and operating systems to enable or disable for access.
     */

    public void setWorkspaceAccessProperties(WorkspaceAccessProperties workspaceAccessProperties) {
        this.workspaceAccessProperties = workspaceAccessProperties;
    }

    /**
     * <p>
     * The device types and operating systems to enable or disable for access.
     * </p>
     * 
     * @return The device types and operating systems to enable or disable for access.
     */

    public WorkspaceAccessProperties getWorkspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }

    /**
     * <p>
     * The device types and operating systems to enable or disable for access.
     * </p>
     * 
     * @param workspaceAccessProperties
     *        The device types and operating systems to enable or disable for access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyWorkspaceAccessPropertiesRequest withWorkspaceAccessProperties(WorkspaceAccessProperties workspaceAccessProperties) {
        setWorkspaceAccessProperties(workspaceAccessProperties);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getWorkspaceAccessProperties() != null)
            sb.append("WorkspaceAccessProperties: ").append(getWorkspaceAccessProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyWorkspaceAccessPropertiesRequest == false)
            return false;
        ModifyWorkspaceAccessPropertiesRequest other = (ModifyWorkspaceAccessPropertiesRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getWorkspaceAccessProperties() == null ^ this.getWorkspaceAccessProperties() == null)
            return false;
        if (other.getWorkspaceAccessProperties() != null && other.getWorkspaceAccessProperties().equals(this.getWorkspaceAccessProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceAccessProperties() == null) ? 0 : getWorkspaceAccessProperties().hashCode());
        return hashCode;
    }

    @Override
    public ModifyWorkspaceAccessPropertiesRequest clone() {
        return (ModifyWorkspaceAccessPropertiesRequest) super.clone();
    }

}
