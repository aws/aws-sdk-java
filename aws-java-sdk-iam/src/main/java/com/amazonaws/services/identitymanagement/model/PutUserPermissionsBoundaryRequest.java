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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PutUserPermissionsBoundary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutUserPermissionsBoundaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * </p>
     */
    private String permissionsBoundary;

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     * </p>
     * 
     * @return The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUserPermissionsBoundaryRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the user.
     */

    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * </p>
     * 
     * @return The ARN of the policy that is used to set the permissions boundary for the user.
     */

    public String getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the user.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUserPermissionsBoundaryRequest withPermissionsBoundary(String permissionsBoundary) {
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
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

        if (obj instanceof PutUserPermissionsBoundaryRequest == false)
            return false;
        PutUserPermissionsBoundaryRequest other = (PutUserPermissionsBoundaryRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
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

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        return hashCode;
    }

    @Override
    public PutUserPermissionsBoundaryRequest clone() {
        return (PutUserPermissionsBoundaryRequest) super.clone();
    }

}
