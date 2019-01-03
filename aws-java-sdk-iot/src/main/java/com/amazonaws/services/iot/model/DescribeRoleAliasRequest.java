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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRoleAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The role alias to describe.
     * </p>
     */
    private String roleAlias;

    /**
     * <p>
     * The role alias to describe.
     * </p>
     * 
     * @param roleAlias
     *        The role alias to describe.
     */

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    /**
     * <p>
     * The role alias to describe.
     * </p>
     * 
     * @return The role alias to describe.
     */

    public String getRoleAlias() {
        return this.roleAlias;
    }

    /**
     * <p>
     * The role alias to describe.
     * </p>
     * 
     * @param roleAlias
     *        The role alias to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRoleAliasRequest withRoleAlias(String roleAlias) {
        setRoleAlias(roleAlias);
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
            sb.append("RoleAlias: ").append(getRoleAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRoleAliasRequest == false)
            return false;
        DescribeRoleAliasRequest other = (DescribeRoleAliasRequest) obj;
        if (other.getRoleAlias() == null ^ this.getRoleAlias() == null)
            return false;
        if (other.getRoleAlias() != null && other.getRoleAlias().equals(this.getRoleAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleAlias() == null) ? 0 : getRoleAlias().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRoleAliasRequest clone() {
        return (DescribeRoleAliasRequest) super.clone();
    }

}
