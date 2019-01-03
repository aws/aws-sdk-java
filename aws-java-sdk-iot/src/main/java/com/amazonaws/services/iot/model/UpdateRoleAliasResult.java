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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoleAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The role alias.
     * </p>
     */
    private String roleAlias;
    /**
     * <p>
     * The role alias ARN.
     * </p>
     */
    private String roleAliasArn;

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @param roleAlias
     *        The role alias.
     */

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @return The role alias.
     */

    public String getRoleAlias() {
        return this.roleAlias;
    }

    /**
     * <p>
     * The role alias.
     * </p>
     * 
     * @param roleAlias
     *        The role alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleAliasResult withRoleAlias(String roleAlias) {
        setRoleAlias(roleAlias);
        return this;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     * 
     * @param roleAliasArn
     *        The role alias ARN.
     */

    public void setRoleAliasArn(String roleAliasArn) {
        this.roleAliasArn = roleAliasArn;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     * 
     * @return The role alias ARN.
     */

    public String getRoleAliasArn() {
        return this.roleAliasArn;
    }

    /**
     * <p>
     * The role alias ARN.
     * </p>
     * 
     * @param roleAliasArn
     *        The role alias ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoleAliasResult withRoleAliasArn(String roleAliasArn) {
        setRoleAliasArn(roleAliasArn);
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
        if (getRoleAlias() != null)
            sb.append("RoleAlias: ").append(getRoleAlias()).append(",");
        if (getRoleAliasArn() != null)
            sb.append("RoleAliasArn: ").append(getRoleAliasArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoleAliasResult == false)
            return false;
        UpdateRoleAliasResult other = (UpdateRoleAliasResult) obj;
        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        if (other.getRoleAliasArn() == null ^ this.getRoleAliasArn() == null)
            return false;
        if (other.getRoleAliasArn() != null && other.getRoleAliasArn().equals(this.getRoleAliasArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        hashCode = prime * hashCode + ((getRoleAliasArn() == null) ? 0 : getRoleAliasArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoleAliasResult clone() {
        try {
            return (UpdateRoleAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
