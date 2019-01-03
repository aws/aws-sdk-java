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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutRolePermissionsBoundary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRolePermissionsBoundaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     */
    private String permissionsBoundary;

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     * </p>
     * 
     * @return The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRolePermissionsBoundaryRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the role.
     */

    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @return The ARN of the policy that is used to set the permissions boundary for the role.
     */

    public String getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRolePermissionsBoundaryRequest withPermissionsBoundary(String permissionsBoundary) {
        setPermissionsBoundary(permissionsBoundary);
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
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: ").append(getPermissionsBoundary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRolePermissionsBoundaryRequest == false)
            return false;
        PutRolePermissionsBoundaryRequest other = (PutRolePermissionsBoundaryRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        return hashCode;
    }

    @Override
    public PutRolePermissionsBoundaryRequest clone() {
        return (PutRolePermissionsBoundaryRequest) super.clone();
    }

}
