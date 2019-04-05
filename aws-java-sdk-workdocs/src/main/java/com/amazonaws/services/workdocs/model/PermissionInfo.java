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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the permissions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/PermissionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role of the user.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The type of permissions.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The role of the user.
     * </p>
     * 
     * @param role
     *        The role of the user.
     * @see RoleType
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the user.
     * </p>
     * 
     * @return The role of the user.
     * @see RoleType
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role of the user.
     * </p>
     * 
     * @param role
     *        The role of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public PermissionInfo withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role of the user.
     * </p>
     * 
     * @param role
     *        The role of the user.
     * @see RoleType
     */

    public void setRole(RoleType role) {
        withRole(role);
    }

    /**
     * <p>
     * The role of the user.
     * </p>
     * 
     * @param role
     *        The role of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoleType
     */

    public PermissionInfo withRole(RoleType role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The type of permissions.
     * </p>
     * 
     * @param type
     *        The type of permissions.
     * @see RolePermissionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of permissions.
     * </p>
     * 
     * @return The type of permissions.
     * @see RolePermissionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of permissions.
     * </p>
     * 
     * @param type
     *        The type of permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RolePermissionType
     */

    public PermissionInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of permissions.
     * </p>
     * 
     * @param type
     *        The type of permissions.
     * @see RolePermissionType
     */

    public void setType(RolePermissionType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of permissions.
     * </p>
     * 
     * @param type
     *        The type of permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RolePermissionType
     */

    public PermissionInfo withType(RolePermissionType type) {
        this.type = type.toString();
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
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionInfo == false)
            return false;
        PermissionInfo other = (PermissionInfo) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PermissionInfo clone() {
        try {
            return (PermissionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.PermissionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
