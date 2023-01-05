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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPermissionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private PermissionGroup permissionGroup;

    /**
     * @param permissionGroup
     */

    public void setPermissionGroup(PermissionGroup permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    /**
     * @return
     */

    public PermissionGroup getPermissionGroup() {
        return this.permissionGroup;
    }

    /**
     * @param permissionGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPermissionGroupResult withPermissionGroup(PermissionGroup permissionGroup) {
        setPermissionGroup(permissionGroup);
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
        if (getPermissionGroup() != null)
            sb.append("PermissionGroup: ").append(getPermissionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPermissionGroupResult == false)
            return false;
        GetPermissionGroupResult other = (GetPermissionGroupResult) obj;
        if (other.getPermissionGroup() == null ^ this.getPermissionGroup() == null)
            return false;
        if (other.getPermissionGroup() != null && other.getPermissionGroup().equals(this.getPermissionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionGroup() == null) ? 0 : getPermissionGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetPermissionGroupResult clone() {
        try {
            return (GetPermissionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
