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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about each permission assigned by the specified private CA, including the action enabled, the
     * policy provided, and the time of creation.
     * </p>
     */
    private java.util.List<Permission> permissions;
    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in a
     * subsequent pagination request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about each permission assigned by the specified private CA, including the action enabled, the
     * policy provided, and the time of creation.
     * </p>
     * 
     * @return Summary information about each permission assigned by the specified private CA, including the action
     *         enabled, the policy provided, and the time of creation.
     */

    public java.util.List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Summary information about each permission assigned by the specified private CA, including the action enabled, the
     * policy provided, and the time of creation.
     * </p>
     * 
     * @param permissions
     *        Summary information about each permission assigned by the specified private CA, including the action
     *        enabled, the policy provided, and the time of creation.
     */

    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<Permission>(permissions);
    }

    /**
     * <p>
     * Summary information about each permission assigned by the specified private CA, including the action enabled, the
     * policy provided, and the time of creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Summary information about each permission assigned by the specified private CA, including the action
     *        enabled, the policy provided, and the time of creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPermissions(Permission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        }
        for (Permission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about each permission assigned by the specified private CA, including the action enabled, the
     * policy provided, and the time of creation.
     * </p>
     * 
     * @param permissions
     *        Summary information about each permission assigned by the specified private CA, including the action
     *        enabled, the policy provided, and the time of creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in a
     * subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in
     *        a subsequent pagination request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in a
     * subsequent pagination request.
     * </p>
     * 
     * @return When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter
     *         in a subsequent pagination request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in a
     * subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and should be used for the <b>NextToken</b> parameter in
     *        a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
