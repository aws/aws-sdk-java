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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The permissions returned by the operation.
     * </p>
     */
    private java.util.List<PermissionEntry> permissions;

    /**
     * <p>
     * The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListPermissions</code> operation to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The permissions returned by the operation.
     * </p>
     * 
     * @return The permissions returned by the operation.
     */

    public java.util.List<PermissionEntry> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions returned by the operation.
     * </p>
     * 
     * @param permissions
     *        The permissions returned by the operation.
     */

    public void setPermissions(java.util.Collection<PermissionEntry> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<PermissionEntry>(permissions);
    }

    /**
     * <p>
     * The permissions returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The permissions returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPermissions(PermissionEntry... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<PermissionEntry>(permissions.length));
        }
        for (PermissionEntry ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions returned by the operation.
     * </p>
     * 
     * @param permissions
     *        The permissions returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPermissions(java.util.Collection<PermissionEntry> permissions) {
        setPermissions(permissions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPermissionsResult == false)
            return false;
        ListPermissionsResult other = (ListPermissionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionsResult clone() {
        try {
            return (ListPermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
