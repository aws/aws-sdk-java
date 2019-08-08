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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and
     * they are defined by their principal type and their ARN.
     * </p>
     * <p>
     * Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that
     * same ARN, the resource maintains the permissions already granted.
     * </p>
     */
    private DataLakePrincipal principal;
    /**
     * <p>
     * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     * databases, and tables.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
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

    public GrantPermissionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and
     * they are defined by their principal type and their ARN.
     * </p>
     * <p>
     * Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that
     * same ARN, the resource maintains the permissions already granted.
     * </p>
     * 
     * @param principal
     *        The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM
     *        roles, and they are defined by their principal type and their ARN.</p>
     *        <p>
     *        Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with
     *        that same ARN, the resource maintains the permissions already granted.
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and
     * they are defined by their principal type and their ARN.
     * </p>
     * <p>
     * Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that
     * same ARN, the resource maintains the permissions already granted.
     * </p>
     * 
     * @return The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM
     *         roles, and they are defined by their principal type and their ARN.</p>
     *         <p>
     *         Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with
     *         that same ARN, the resource maintains the permissions already granted.
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and
     * they are defined by their principal type and their ARN.
     * </p>
     * <p>
     * Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that
     * same ARN, the resource maintains the permissions already granted.
     * </p>
     * 
     * @param principal
     *        The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM
     *        roles, and they are defined by their principal type and their ARN.</p>
     *        <p>
     *        Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with
     *        that same ARN, the resource maintains the permissions already granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantPermissionsRequest withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     * databases, and tables.
     * </p>
     * 
     * @param resource
     *        The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     *        databases, and tables.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     * databases, and tables.
     * </p>
     * 
     * @return The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data
     *         Catalog, databases, and tables.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     * databases, and tables.
     * </p>
     * 
     * @param resource
     *        The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog,
     *        databases, and tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantPermissionsRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     * 
     * @return The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant
     *         and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as
     *         Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on
     *         AWS Lake Formation resources.
     * @see Permission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant
     *        and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as
     *        Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS
     *        Lake Formation resources.
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
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant
     *        and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as
     *        Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS
     *        Lake Formation resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissions(String... permissions) {
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
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant
     *        and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as
     *        Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS
     *        Lake Formation resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and
     * revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
     * AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation
     * resources.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant
     *        and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as
     *        Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS
     *        Lake Formation resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissions(Permission... permissions) {
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
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
     * </p>
     * 
     * @return Indicates a list of the granted permissions that the principal may pass to other users. These permissions
     *         may only be a subset of the permissions granted in the <code>Privileges</code>.
     * @see Permission
     */

    public java.util.List<String> getPermissionsWithGrantOption() {
        return permissionsWithGrantOption;
    }

    /**
     * <p>
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of the granted permissions that the principal may pass to other users. These permissions
     *        may only be a subset of the permissions granted in the <code>Privileges</code>.
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
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionsWithGrantOption(java.util.Collection)} or
     * {@link #withPermissionsWithGrantOption(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of the granted permissions that the principal may pass to other users. These permissions
     *        may only be a subset of the permissions granted in the <code>Privileges</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissionsWithGrantOption(String... permissionsWithGrantOption) {
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
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of the granted permissions that the principal may pass to other users. These permissions
     *        may only be a subset of the permissions granted in the <code>Privileges</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissionsWithGrantOption(java.util.Collection<String> permissionsWithGrantOption) {
        setPermissionsWithGrantOption(permissionsWithGrantOption);
        return this;
    }

    /**
     * <p>
     * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may
     * only be a subset of the permissions granted in the <code>Privileges</code>.
     * </p>
     * 
     * @param permissionsWithGrantOption
     *        Indicates a list of the granted permissions that the principal may pass to other users. These permissions
     *        may only be a subset of the permissions granted in the <code>Privileges</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GrantPermissionsRequest withPermissionsWithGrantOption(Permission... permissionsWithGrantOption) {
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

        if (obj instanceof GrantPermissionsRequest == false)
            return false;
        GrantPermissionsRequest other = (GrantPermissionsRequest) obj;
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
    public GrantPermissionsRequest clone() {
        return (GrantPermissionsRequest) super.clone();
    }

}
