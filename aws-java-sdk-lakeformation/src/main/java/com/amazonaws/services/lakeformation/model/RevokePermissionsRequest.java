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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The principal to be revoked permissions on the resource.
     * </p>
     */
    private DataLakePrincipal principal;
    /**
     * <p>
     * The resource to which permissions are to be revoked.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     */
    private java.util.List<String> permissionsWithGrantOption;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokePermissionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The principal to be revoked permissions on the resource.
     * </p>
     * 
     * @param principal
     *        The principal to be revoked permissions on the resource.
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal to be revoked permissions on the resource.
     * </p>
     * 
     * @return The principal to be revoked permissions on the resource.
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal to be revoked permissions on the resource.
     * </p>
     * 
     * @param principal
     *        The principal to be revoked permissions on the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokePermissionsRequest withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource to which permissions are to be revoked.
     * </p>
     * 
     * @param resource
     *        The resource to which permissions are to be revoked.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource to which permissions are to be revoked.
     * </p>
     * 
     * @return The resource to which permissions are to be revoked.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource to which permissions are to be revoked.
     * </p>
     * 
     * @param resource
     *        The resource to which permissions are to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokePermissionsRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     * 
     * @return The permissions revoked to the principal on the resource. For information about permissions, see <a
     *         href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access
     *         Control to Metadata and Data</a>.
     * @see Permission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions revoked to the principal on the resource. For information about permissions, see <a
     *        href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access
     *        Control to Metadata and Data</a>.
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
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions revoked to the principal on the resource. For information about permissions, see <a
     *        href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access
     *        Control to Metadata and Data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissions(String... permissions) {
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
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions revoked to the principal on the resource. For information about permissions, see <a
     *        href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access
     *        Control to Metadata and Data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The permissions revoked to the principal on the resource. For information about permissions, see <a
     * href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access Control to
     * Metadata and Data</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions revoked to the principal on the resource. For information about permissions, see <a
     *        href="https://docs-aws.amazon.com/michigan/latest/dg/security-data-access.html">Security and Access
     *        Control to Metadata and Data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissions(Permission... permissions) {
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
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     * 
     * @return Indicates a list of permissions for which to revoke the grant option allowing the principal to pass
     *         permissions to other principals.
     * @see Permission
     */

    public java.util.List<String> getPermissionsWithGrantOption() {
        return permissionsWithGrantOption;
    }

    /**
     * <p>
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of permissions for which to revoke the grant option allowing the principal to pass
     *        permissions to other principals.
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
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionsWithGrantOption(java.util.Collection)} or
     * {@link #withPermissionsWithGrantOption(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of permissions for which to revoke the grant option allowing the principal to pass
     *        permissions to other principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissionsWithGrantOption(String... permissionsWithGrantOption) {
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
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of permissions for which to revoke the grant option allowing the principal to pass
     *        permissions to other principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissionsWithGrantOption(java.util.Collection<String> permissionsWithGrantOption) {
        setPermissionsWithGrantOption(permissionsWithGrantOption);
        return this;
    }

    /**
     * <p>
     * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions
     * to other principals.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of permissions for which to revoke the grant option allowing the principal to pass
     *        permissions to other principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public RevokePermissionsRequest withPermissionsWithGrantOption(Permission... permissionsWithGrantOption) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
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

        if (obj instanceof RevokePermissionsRequest == false)
            return false;
        RevokePermissionsRequest other = (RevokePermissionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getPermissionsWithGrantOption() == null) ? 0 : getPermissionsWithGrantOption().hashCode());
        return hashCode;
    }

    @Override
    public RevokePermissionsRequest clone() {
        return (RevokePermissionsRequest) super.clone();
    }

}
