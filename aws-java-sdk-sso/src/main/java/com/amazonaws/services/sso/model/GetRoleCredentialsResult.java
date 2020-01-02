/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/GetRoleCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRoleCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The credentials for the role that is assigned to the user.
     * </p>
     */
    private RoleCredentials roleCredentials;

    /**
     * <p>
     * The credentials for the role that is assigned to the user.
     * </p>
     * 
     * @param roleCredentials
     *        The credentials for the role that is assigned to the user.
     */

    public void setRoleCredentials(RoleCredentials roleCredentials) {
        this.roleCredentials = roleCredentials;
    }

    /**
     * <p>
     * The credentials for the role that is assigned to the user.
     * </p>
     * 
     * @return The credentials for the role that is assigned to the user.
     */

    public RoleCredentials getRoleCredentials() {
        return this.roleCredentials;
    }

    /**
     * <p>
     * The credentials for the role that is assigned to the user.
     * </p>
     * 
     * @param roleCredentials
     *        The credentials for the role that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRoleCredentialsResult withRoleCredentials(RoleCredentials roleCredentials) {
        setRoleCredentials(roleCredentials);
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
        if (getRoleCredentials() != null)
            sb.append("RoleCredentials: ").append(getRoleCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRoleCredentialsResult == false)
            return false;
        GetRoleCredentialsResult other = (GetRoleCredentialsResult) obj;
        if (other.getRoleCredentials() == null ^ this.getRoleCredentials() == null)
            return false;
        if (other.getRoleCredentials() != null && other.getRoleCredentials().equals(this.getRoleCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleCredentials() == null) ? 0 : getRoleCredentials().hashCode());
        return hashCode;
    }

    @Override
    public GetRoleCredentialsResult clone() {
        try {
            return (GetRoleCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
