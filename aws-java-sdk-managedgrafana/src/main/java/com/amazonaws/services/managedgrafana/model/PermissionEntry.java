/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the identity of one user or group and the <code>Admin</code>, <code>Editor</code>, or
 * <code>Viewer</code> role that they have.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/PermissionEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A structure with the ID of the user or group with this role.
     * </p>
     */
    private User user;

    /**
     * <p>
     * Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role.
     * </p>
     * 
     * @param role
     *        Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or
     *        <code>Viewer</code> role.
     * @see Role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role.
     * </p>
     * 
     * @return Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or
     *         <code>Viewer</code> role.
     * @see Role
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role.
     * </p>
     * 
     * @param role
     *        Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or
     *        <code>Viewer</code> role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public PermissionEntry withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role.
     * </p>
     * 
     * @param role
     *        Specifies whether the user or group has the <code>Admin</code>, <code>Editor</code>, or
     *        <code>Viewer</code> role.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public PermissionEntry withRole(Role role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * A structure with the ID of the user or group with this role.
     * </p>
     * 
     * @param user
     *        A structure with the ID of the user or group with this role.
     */

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * <p>
     * A structure with the ID of the user or group with this role.
     * </p>
     * 
     * @return A structure with the ID of the user or group with this role.
     */

    public User getUser() {
        return this.user;
    }

    /**
     * <p>
     * A structure with the ID of the user or group with this role.
     * </p>
     * 
     * @param user
     *        A structure with the ID of the user or group with this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionEntry withUser(User user) {
        setUser(user);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionEntry == false)
            return false;
        PermissionEntry other = (PermissionEntry) obj;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public PermissionEntry clone() {
        try {
            return (PermissionEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.PermissionEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
