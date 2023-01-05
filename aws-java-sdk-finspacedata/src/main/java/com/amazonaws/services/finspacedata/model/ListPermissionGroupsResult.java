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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all the permission groups.
     * </p>
     */
    private java.util.List<PermissionGroup> permissionGroups;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all the permission groups.
     * </p>
     * 
     * @return A list of all the permission groups.
     */

    public java.util.List<PermissionGroup> getPermissionGroups() {
        return permissionGroups;
    }

    /**
     * <p>
     * A list of all the permission groups.
     * </p>
     * 
     * @param permissionGroups
     *        A list of all the permission groups.
     */

    public void setPermissionGroups(java.util.Collection<PermissionGroup> permissionGroups) {
        if (permissionGroups == null) {
            this.permissionGroups = null;
            return;
        }

        this.permissionGroups = new java.util.ArrayList<PermissionGroup>(permissionGroups);
    }

    /**
     * <p>
     * A list of all the permission groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionGroups(java.util.Collection)} or {@link #withPermissionGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param permissionGroups
     *        A list of all the permission groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionGroupsResult withPermissionGroups(PermissionGroup... permissionGroups) {
        if (this.permissionGroups == null) {
            setPermissionGroups(new java.util.ArrayList<PermissionGroup>(permissionGroups.length));
        }
        for (PermissionGroup ele : permissionGroups) {
            this.permissionGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the permission groups.
     * </p>
     * 
     * @param permissionGroups
     *        A list of all the permission groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionGroupsResult withPermissionGroups(java.util.Collection<PermissionGroup> permissionGroups) {
        setPermissionGroups(permissionGroups);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionGroupsResult withNextToken(String nextToken) {
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
        if (getPermissionGroups() != null)
            sb.append("PermissionGroups: ").append(getPermissionGroups()).append(",");
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

        if (obj instanceof ListPermissionGroupsResult == false)
            return false;
        ListPermissionGroupsResult other = (ListPermissionGroupsResult) obj;
        if (other.getPermissionGroups() == null ^ this.getPermissionGroups() == null)
            return false;
        if (other.getPermissionGroups() != null && other.getPermissionGroups().equals(this.getPermissionGroups()) == false)
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

        hashCode = prime * hashCode + ((getPermissionGroups() == null) ? 0 : getPermissionGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionGroupsResult clone() {
        try {
            return (ListPermissionGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
