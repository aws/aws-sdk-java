/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListImpersonationRoles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImpersonationRolesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of impersonation roles under the given WorkMail organization.
     * </p>
     */
    private java.util.List<ImpersonationRole> roles;
    /**
     * <p>
     * The token to retrieve the next page of results. The value is <code>null</code> when there are no results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of impersonation roles under the given WorkMail organization.
     * </p>
     * 
     * @return The list of impersonation roles under the given WorkMail organization.
     */

    public java.util.List<ImpersonationRole> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The list of impersonation roles under the given WorkMail organization.
     * </p>
     * 
     * @param roles
     *        The list of impersonation roles under the given WorkMail organization.
     */

    public void setRoles(java.util.Collection<ImpersonationRole> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<ImpersonationRole>(roles);
    }

    /**
     * <p>
     * The list of impersonation roles under the given WorkMail organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The list of impersonation roles under the given WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImpersonationRolesResult withRoles(ImpersonationRole... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<ImpersonationRole>(roles.length));
        }
        for (ImpersonationRole ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of impersonation roles under the given WorkMail organization.
     * </p>
     * 
     * @param roles
     *        The list of impersonation roles under the given WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImpersonationRolesResult withRoles(java.util.Collection<ImpersonationRole> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results. The value is <code>null</code> when there are no results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results. The value is <code>null</code> when there are no results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results. The value is <code>null</code> when there are no results to
     * return.
     * </p>
     * 
     * @return The token to retrieve the next page of results. The value is <code>null</code> when there are no results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results. The value is <code>null</code> when there are no results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results. The value is <code>null</code> when there are no results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImpersonationRolesResult withNextToken(String nextToken) {
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
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
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

        if (obj instanceof ListImpersonationRolesResult == false)
            return false;
        ListImpersonationRolesResult other = (ListImpersonationRolesResult) obj;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
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

        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImpersonationRolesResult clone() {
        try {
            return (ListImpersonationRolesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
