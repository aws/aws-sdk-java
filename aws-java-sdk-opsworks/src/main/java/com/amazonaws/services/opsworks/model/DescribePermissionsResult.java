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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribePermissions</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>Permission</code> objects that describe the stack permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     * permissions for each of the stack IAM ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     * permissions for each of the user's stack IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code> object
     * with permissions for the specified stack and IAM ARN.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Permission> permissions;

    /**
     * <p>
     * An array of <code>Permission</code> objects that describe the stack permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     * permissions for each of the stack IAM ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     * permissions for each of the user's stack IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code> object
     * with permissions for the specified stack and IAM ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>Permission</code> objects that describe the stack permissions.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     *         permissions for each of the stack IAM ARNs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     *         permissions for each of the user's stack IDs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code>
     *         object with permissions for the specified stack and IAM ARN.
     *         </p>
     *         </li>
     */

    public java.util.List<Permission> getPermissions() {
        if (permissions == null) {
            permissions = new com.amazonaws.internal.SdkInternalList<Permission>();
        }
        return permissions;
    }

    /**
     * <p>
     * An array of <code>Permission</code> objects that describe the stack permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     * permissions for each of the stack IAM ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     * permissions for each of the user's stack IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code> object
     * with permissions for the specified stack and IAM ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissions
     *        An array of <code>Permission</code> objects that describe the stack permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     *        permissions for each of the stack IAM ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     *        permissions for each of the user's stack IDs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code>
     *        object with permissions for the specified stack and IAM ARN.
     *        </p>
     *        </li>
     */

    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new com.amazonaws.internal.SdkInternalList<Permission>(permissions);
    }

    /**
     * <p>
     * An array of <code>Permission</code> objects that describe the stack permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     * permissions for each of the stack IAM ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     * permissions for each of the user's stack IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code> object
     * with permissions for the specified stack and IAM ARN.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        An array of <code>Permission</code> objects that describe the stack permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     *        permissions for each of the stack IAM ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     *        permissions for each of the user's stack IDs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code>
     *        object with permissions for the specified stack and IAM ARN.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePermissionsResult withPermissions(Permission... permissions) {
        if (this.permissions == null) {
            setPermissions(new com.amazonaws.internal.SdkInternalList<Permission>(permissions.length));
        }
        for (Permission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Permission</code> objects that describe the stack permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     * permissions for each of the stack IAM ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     * permissions for each of the user's stack IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code> object
     * with permissions for the specified stack and IAM ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissions
     *        An array of <code>Permission</code> objects that describe the stack permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the request object contains only a stack ID, the array contains a <code>Permission</code> object with
     *        permissions for each of the stack IAM ARNs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request object contains only an IAM ARN, the array contains a <code>Permission</code> object with
     *        permissions for each of the user's stack IDs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the request contains a stack ID and an IAM ARN, the array contains a single <code>Permission</code>
     *        object with permissions for the specified stack and IAM ARN.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
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

        if (obj instanceof DescribePermissionsResult == false)
            return false;
        DescribePermissionsResult other = (DescribePermissionsResult) obj;
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

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public DescribePermissionsResult clone() {
        try {
            return (DescribePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
