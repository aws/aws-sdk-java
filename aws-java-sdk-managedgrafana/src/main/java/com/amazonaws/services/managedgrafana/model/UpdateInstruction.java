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
 * Contains the instructions for one Grafana role permission update in a <a
 * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateInstruction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstruction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether this update is to add or revoke role permissions.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The role to add or revoke for the user or the group specified in <code>users</code>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A structure that specifies the user or group to add or revoke the role for.
     * </p>
     */
    private java.util.List<User> users;

    /**
     * <p>
     * Specifies whether this update is to add or revoke role permissions.
     * </p>
     * 
     * @param action
     *        Specifies whether this update is to add or revoke role permissions.
     * @see UpdateAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether this update is to add or revoke role permissions.
     * </p>
     * 
     * @return Specifies whether this update is to add or revoke role permissions.
     * @see UpdateAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether this update is to add or revoke role permissions.
     * </p>
     * 
     * @param action
     *        Specifies whether this update is to add or revoke role permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateAction
     */

    public UpdateInstruction withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether this update is to add or revoke role permissions.
     * </p>
     * 
     * @param action
     *        Specifies whether this update is to add or revoke role permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateAction
     */

    public UpdateInstruction withAction(UpdateAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The role to add or revoke for the user or the group specified in <code>users</code>.
     * </p>
     * 
     * @param role
     *        The role to add or revoke for the user or the group specified in <code>users</code>.
     * @see Role
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role to add or revoke for the user or the group specified in <code>users</code>.
     * </p>
     * 
     * @return The role to add or revoke for the user or the group specified in <code>users</code>.
     * @see Role
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role to add or revoke for the user or the group specified in <code>users</code>.
     * </p>
     * 
     * @param role
     *        The role to add or revoke for the user or the group specified in <code>users</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public UpdateInstruction withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role to add or revoke for the user or the group specified in <code>users</code>.
     * </p>
     * 
     * @param role
     *        The role to add or revoke for the user or the group specified in <code>users</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public UpdateInstruction withRole(Role role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * A structure that specifies the user or group to add or revoke the role for.
     * </p>
     * 
     * @return A structure that specifies the user or group to add or revoke the role for.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * A structure that specifies the user or group to add or revoke the role for.
     * </p>
     * 
     * @param users
     *        A structure that specifies the user or group to add or revoke the role for.
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * <p>
     * A structure that specifies the user or group to add or revoke the role for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        A structure that specifies the user or group to add or revoke the role for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstruction withUsers(User... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<User>(users.length));
        }
        for (User ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that specifies the user or group to add or revoke the role for.
     * </p>
     * 
     * @param users
     *        A structure that specifies the user or group to add or revoke the role for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstruction withUsers(java.util.Collection<User> users) {
        setUsers(users);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstruction == false)
            return false;
        UpdateInstruction other = (UpdateInstruction) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstruction clone() {
        try {
            return (UpdateInstruction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.UpdateInstructionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
