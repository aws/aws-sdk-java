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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A policy used by the function to access a resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ResourceAccessPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceAccessPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     * (read-only).
     */
    private String permission;
    /** The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.) */
    private String resourceId;

    /**
     * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param permission
     *        The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @see Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @return The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     *         (read-only).
     * @see Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param permission
     *        The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public ResourceAccessPolicy withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     * (read-only).
     * 
     * @param permission
     *        The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro''
     *        (read-only).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public ResourceAccessPolicy withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     * 
     * @param resourceId
     *        The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     * 
     * @return The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     * 
     * @param resourceId
     *        The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceAccessPolicy withResourceId(String resourceId) {
        setResourceId(resourceId);
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
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceAccessPolicy == false)
            return false;
        ResourceAccessPolicy other = (ResourceAccessPolicy) obj;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return hashCode;
    }

    @Override
    public ResourceAccessPolicy clone() {
        try {
            return (ResourceAccessPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ResourceAccessPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
