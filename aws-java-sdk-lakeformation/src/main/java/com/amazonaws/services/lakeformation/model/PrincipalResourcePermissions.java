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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The permissions granted or revoked on a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PrincipalResourcePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrincipalResourcePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Data Lake principal to be granted or revoked permissions.
     * </p>
     */
    private DataLakePrincipal principal;
    /**
     * <p>
     * The resource where permissions are to be granted or revoked.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     */
    private java.util.List<String> permissionsWithGrantOption;

    /**
     * <p>
     * The Data Lake principal to be granted or revoked permissions.
     * </p>
     * 
     * @param principal
     *        The Data Lake principal to be granted or revoked permissions.
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The Data Lake principal to be granted or revoked permissions.
     * </p>
     * 
     * @return The Data Lake principal to be granted or revoked permissions.
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The Data Lake principal to be granted or revoked permissions.
     * </p>
     * 
     * @param principal
     *        The Data Lake principal to be granted or revoked permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalResourcePermissions withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource where permissions are to be granted or revoked.
     * </p>
     * 
     * @param resource
     *        The resource where permissions are to be granted or revoked.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource where permissions are to be granted or revoked.
     * </p>
     * 
     * @return The resource where permissions are to be granted or revoked.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource where permissions are to be granted or revoked.
     * </p>
     * 
     * @param resource
     *        The resource where permissions are to be granted or revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalResourcePermissions withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     * 
     * @return The permissions to be granted or revoked on the resource.
     * @see Permission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions to be granted or revoked on the resource.
     * @see Permission
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions to be granted or revoked on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions to be granted or revoked on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The permissions to be granted or revoked on the resource.
     * </p>
     * 
     * @param permissions
     *        The permissions to be granted or revoked on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissions(Permission... permissions) {
        java.util.ArrayList<String> permissionsCopy = new java.util.ArrayList<String>(permissions.length);
        for (Permission value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     * 
     * @return Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * @see Permission
     */

    public java.util.List<String> getPermissionsWithGrantOption() {
        return permissionsWithGrantOption;
    }

    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * @see Permission
     */

    public void setPermissionsWithGrantOption(java.util.Collection<String> permissionsWithGrantOption) {
        if (permissionsWithGrantOption == null) {
            this.permissionsWithGrantOption = null;
            return;
        }

        this.permissionsWithGrantOption = new java.util.ArrayList<String>(permissionsWithGrantOption);
    }

    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionsWithGrantOption(java.util.Collection)} or
     * {@link #withPermissionsWithGrantOption(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissionsWithGrantOption(String... permissionsWithGrantOption) {
        if (this.permissionsWithGrantOption == null) {
            setPermissionsWithGrantOption(new java.util.ArrayList<String>(permissionsWithGrantOption.length));
        }
        for (String ele : permissionsWithGrantOption) {
            this.permissionsWithGrantOption.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissionsWithGrantOption(java.util.Collection<String> permissionsWithGrantOption) {
        setPermissionsWithGrantOption(permissionsWithGrantOption);
        return this;
    }

    /**
     * <p>
     * Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates whether to grant the ability to grant permissions (as a subset of permissions granted).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public PrincipalResourcePermissions withPermissionsWithGrantOption(Permission... permissionsWithGrantOption) {
        java.util.ArrayList<String> permissionsWithGrantOptionCopy = new java.util.ArrayList<String>(permissionsWithGrantOption.length);
        for (Permission value : permissionsWithGrantOption) {
            permissionsWithGrantOptionCopy.add(value.toString());
        }
        if (getPermissionsWithGrantOption() == null) {
            setPermissionsWithGrantOption(permissionsWithGrantOptionCopy);
        } else {
            getPermissionsWithGrantOption().addAll(permissionsWithGrantOptionCopy);
        }
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getPermissionsWithGrantOption() != null)
            sb.append("PermissionsWithGrantOption: ").append(getPermissionsWithGrantOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrincipalResourcePermissions == false)
            return false;
        PrincipalResourcePermissions other = (PrincipalResourcePermissions) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getPermissionsWithGrantOption() == null ^ this.getPermissionsWithGrantOption() == null)
            return false;
        if (other.getPermissionsWithGrantOption() != null && other.getPermissionsWithGrantOption().equals(this.getPermissionsWithGrantOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getPermissionsWithGrantOption() == null) ? 0 : getPermissionsWithGrantOption().hashCode());
        return hashCode;
    }

    @Override
    public PrincipalResourcePermissions clone() {
        try {
            return (PrincipalResourcePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.PrincipalResourcePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
