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
 * Describes a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The permission information for the resource.
     * </p>
     */
    private java.util.List<PermissionInfo> roles;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param id
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @see PrincipalType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     * @see PrincipalType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @see PrincipalType
     */

    public void setType(PrincipalType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param type
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withType(PrincipalType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The permission information for the resource.
     * </p>
     * 
     * @return The permission information for the resource.
     */

    public java.util.List<PermissionInfo> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The permission information for the resource.
     * </p>
     * 
     * @param roles
     *        The permission information for the resource.
     */

    public void setRoles(java.util.Collection<PermissionInfo> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<PermissionInfo>(roles);
    }

    /**
     * <p>
     * The permission information for the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The permission information for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withRoles(PermissionInfo... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<PermissionInfo>(roles.length));
        }
        for (PermissionInfo ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permission information for the resource.
     * </p>
     * 
     * @param roles
     *        The permission information for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withRoles(java.util.Collection<PermissionInfo> roles) {
        setRoles(roles);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
