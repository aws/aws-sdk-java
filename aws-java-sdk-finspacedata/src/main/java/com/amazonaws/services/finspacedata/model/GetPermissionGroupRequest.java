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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPermissionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     */
    private String permissionGroupId;

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     */

    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @return The unique identifier for the permission group.
     */

    public String getPermissionGroupId() {
        return this.permissionGroupId;
    }

    /**
     * <p>
     * The unique identifier for the permission group.
     * </p>
     * 
     * @param permissionGroupId
     *        The unique identifier for the permission group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionGroupRequest withPermissionGroupId(String permissionGroupId) {
        setPermissionGroupId(permissionGroupId);
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
        if (getPermissionGroupId() != null)
            sb.append("PermissionGroupId: ").append(getPermissionGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPermissionGroupRequest == false)
            return false;
        GetPermissionGroupRequest other = (GetPermissionGroupRequest) obj;
        if (other.getPermissionGroupId() == null ^ this.getPermissionGroupId() == null)
            return false;
        if (other.getPermissionGroupId() != null && other.getPermissionGroupId().equals(this.getPermissionGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        return hashCode;
    }

    @Override
    public GetPermissionGroupRequest clone() {
        return (GetPermissionGroupRequest) super.clone();
    }

}
