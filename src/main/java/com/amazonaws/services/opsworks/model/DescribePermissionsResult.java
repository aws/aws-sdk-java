/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribePermissions</code> request.
 * </p>
 */
public class DescribePermissionsResult implements Serializable {

    /**
     * An array of <code>Permission</code> objects that describe the stack
     * permissions. <ul> <li>If the request object contains only a stack ID,
     * the array contains a <code>Permission</code> object with permissions
     * for each of the stack IAM ARNs.</li> <li>If the request object
     * contains only an IAM ARN, the array contains a <code>Permission</code>
     * object with permissions for each of the user's stack IDs.</li> <li>If
     * the request contains a stack ID and an IAM ARN, the array contains a
     * single <code>Permission</code> object with permissions for the
     * specified stack and IAM ARN.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissions;

    /**
     * An array of <code>Permission</code> objects that describe the stack
     * permissions. <ul> <li>If the request object contains only a stack ID,
     * the array contains a <code>Permission</code> object with permissions
     * for each of the stack IAM ARNs.</li> <li>If the request object
     * contains only an IAM ARN, the array contains a <code>Permission</code>
     * object with permissions for each of the user's stack IDs.</li> <li>If
     * the request contains a stack ID and an IAM ARN, the array contains a
     * single <code>Permission</code> object with permissions for the
     * specified stack and IAM ARN.</li> </ul>
     *
     * @return An array of <code>Permission</code> objects that describe the stack
     *         permissions. <ul> <li>If the request object contains only a stack ID,
     *         the array contains a <code>Permission</code> object with permissions
     *         for each of the stack IAM ARNs.</li> <li>If the request object
     *         contains only an IAM ARN, the array contains a <code>Permission</code>
     *         object with permissions for each of the user's stack IDs.</li> <li>If
     *         the request contains a stack ID and an IAM ARN, the array contains a
     *         single <code>Permission</code> object with permissions for the
     *         specified stack and IAM ARN.</li> </ul>
     */
    public java.util.List<Permission> getPermissions() {
        if (permissions == null) {
              permissions = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>();
              permissions.setAutoConstruct(true);
        }
        return permissions;
    }
    
    /**
     * An array of <code>Permission</code> objects that describe the stack
     * permissions. <ul> <li>If the request object contains only a stack ID,
     * the array contains a <code>Permission</code> object with permissions
     * for each of the stack IAM ARNs.</li> <li>If the request object
     * contains only an IAM ARN, the array contains a <code>Permission</code>
     * object with permissions for each of the user's stack IDs.</li> <li>If
     * the request contains a stack ID and an IAM ARN, the array contains a
     * single <code>Permission</code> object with permissions for the
     * specified stack and IAM ARN.</li> </ul>
     *
     * @param permissions An array of <code>Permission</code> objects that describe the stack
     *         permissions. <ul> <li>If the request object contains only a stack ID,
     *         the array contains a <code>Permission</code> object with permissions
     *         for each of the stack IAM ARNs.</li> <li>If the request object
     *         contains only an IAM ARN, the array contains a <code>Permission</code>
     *         object with permissions for each of the user's stack IDs.</li> <li>If
     *         the request contains a stack ID and an IAM ARN, the array contains a
     *         single <code>Permission</code> object with permissions for the
     *         specified stack and IAM ARN.</li> </ul>
     */
    public void setPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
        permissionsCopy.addAll(permissions);
        this.permissions = permissionsCopy;
    }
    
    /**
     * An array of <code>Permission</code> objects that describe the stack
     * permissions. <ul> <li>If the request object contains only a stack ID,
     * the array contains a <code>Permission</code> object with permissions
     * for each of the stack IAM ARNs.</li> <li>If the request object
     * contains only an IAM ARN, the array contains a <code>Permission</code>
     * object with permissions for each of the user's stack IDs.</li> <li>If
     * the request contains a stack ID and an IAM ARN, the array contains a
     * single <code>Permission</code> object with permissions for the
     * specified stack and IAM ARN.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param permissions An array of <code>Permission</code> objects that describe the stack
     *         permissions. <ul> <li>If the request object contains only a stack ID,
     *         the array contains a <code>Permission</code> object with permissions
     *         for each of the stack IAM ARNs.</li> <li>If the request object
     *         contains only an IAM ARN, the array contains a <code>Permission</code>
     *         object with permissions for each of the user's stack IDs.</li> <li>If
     *         the request contains a stack ID and an IAM ARN, the array contains a
     *         single <code>Permission</code> object with permissions for the
     *         specified stack and IAM ARN.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePermissionsResult withPermissions(Permission... permissions) {
        if (getPermissions() == null) setPermissions(new java.util.ArrayList<Permission>(permissions.length));
        for (Permission value : permissions) {
            getPermissions().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Permission</code> objects that describe the stack
     * permissions. <ul> <li>If the request object contains only a stack ID,
     * the array contains a <code>Permission</code> object with permissions
     * for each of the stack IAM ARNs.</li> <li>If the request object
     * contains only an IAM ARN, the array contains a <code>Permission</code>
     * object with permissions for each of the user's stack IDs.</li> <li>If
     * the request contains a stack ID and an IAM ARN, the array contains a
     * single <code>Permission</code> object with permissions for the
     * specified stack and IAM ARN.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param permissions An array of <code>Permission</code> objects that describe the stack
     *         permissions. <ul> <li>If the request object contains only a stack ID,
     *         the array contains a <code>Permission</code> object with permissions
     *         for each of the stack IAM ARNs.</li> <li>If the request object
     *         contains only an IAM ARN, the array contains a <code>Permission</code>
     *         object with permissions for each of the user's stack IDs.</li> <li>If
     *         the request contains a stack ID and an IAM ARN, the array contains a
     *         single <code>Permission</code> object with permissions for the
     *         specified stack and IAM ARN.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribePermissionsResult withPermissions(java.util.Collection<Permission> permissions) {
        if (permissions == null) {
            this.permissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Permission> permissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Permission>(permissions.size());
            permissionsCopy.addAll(permissions);
            this.permissions = permissionsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPermissions() != null) sb.append("Permissions: " + getPermissions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePermissionsResult == false) return false;
        DescribePermissionsResult other = (DescribePermissionsResult)obj;
        
        if (other.getPermissions() == null ^ this.getPermissions() == null) return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false) return false; 
        return true;
    }
    
}
    