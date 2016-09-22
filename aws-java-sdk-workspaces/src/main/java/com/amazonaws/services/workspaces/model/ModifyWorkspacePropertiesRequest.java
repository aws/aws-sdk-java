/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ModifyWorkspacePropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The WorkSpace properties of the request.
     * </p>
     */
    private WorkspaceProperties workspaceProperties;

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @return The ID of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyWorkspacePropertiesRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The WorkSpace properties of the request.
     * </p>
     * 
     * @param workspaceProperties
     *        The WorkSpace properties of the request.
     */

    public void setWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        this.workspaceProperties = workspaceProperties;
    }

    /**
     * <p>
     * The WorkSpace properties of the request.
     * </p>
     * 
     * @return The WorkSpace properties of the request.
     */

    public WorkspaceProperties getWorkspaceProperties() {
        return this.workspaceProperties;
    }

    /**
     * <p>
     * The WorkSpace properties of the request.
     * </p>
     * 
     * @param workspaceProperties
     *        The WorkSpace properties of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyWorkspacePropertiesRequest withWorkspaceProperties(WorkspaceProperties workspaceProperties) {
        setWorkspaceProperties(workspaceProperties);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: " + getWorkspaceId() + ",");
        if (getWorkspaceProperties() != null)
            sb.append("WorkspaceProperties: " + getWorkspaceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyWorkspacePropertiesRequest == false)
            return false;
        ModifyWorkspacePropertiesRequest other = (ModifyWorkspacePropertiesRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getWorkspaceProperties() == null ^ this.getWorkspaceProperties() == null)
            return false;
        if (other.getWorkspaceProperties() != null && other.getWorkspaceProperties().equals(this.getWorkspaceProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceProperties() == null) ? 0 : getWorkspaceProperties().hashCode());
        return hashCode;
    }

    @Override
    public ModifyWorkspacePropertiesRequest clone() {
        return (ModifyWorkspacePropertiesRequest) super.clone();
    }
}
