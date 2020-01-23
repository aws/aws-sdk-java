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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the effect that a permissions boundary has on a policy simulation when the boundary is
 * applied to an IAM entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PermissionsBoundaryDecisionDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PermissionsBoundaryDecisionDetail implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role).
     * A value of <code>true</code> means that the permissions boundary does not deny the action. This means that the
     * policy includes an <code>Allow</code> statement that matches the request. In this case, if an identity-based
     * policy also allows the action, the request is allowed. A value of <code>false</code> means that either the
     * requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions
     * boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
     * </p>
     */
    private Boolean allowedByPermissionsBoundary;

    /**
     * <p>
     * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role).
     * A value of <code>true</code> means that the permissions boundary does not deny the action. This means that the
     * policy includes an <code>Allow</code> statement that matches the request. In this case, if an identity-based
     * policy also allows the action, the request is allowed. A value of <code>false</code> means that either the
     * requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions
     * boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
     * </p>
     * 
     * @param allowedByPermissionsBoundary
     *        Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or
     *        role). A value of <code>true</code> means that the permissions boundary does not deny the action. This
     *        means that the policy includes an <code>Allow</code> statement that matches the request. In this case, if
     *        an identity-based policy also allows the action, the request is allowed. A value of <code>false</code>
     *        means that either the requested action is not allowed (implicitly denied) or that the action is explicitly
     *        denied by the permissions boundary. In both of these cases, the action is not allowed, regardless of the
     *        identity-based policy.
     */

    public void setAllowedByPermissionsBoundary(Boolean allowedByPermissionsBoundary) {
        this.allowedByPermissionsBoundary = allowedByPermissionsBoundary;
    }

    /**
     * <p>
     * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role).
     * A value of <code>true</code> means that the permissions boundary does not deny the action. This means that the
     * policy includes an <code>Allow</code> statement that matches the request. In this case, if an identity-based
     * policy also allows the action, the request is allowed. A value of <code>false</code> means that either the
     * requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions
     * boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
     * </p>
     * 
     * @return Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user
     *         or role). A value of <code>true</code> means that the permissions boundary does not deny the action. This
     *         means that the policy includes an <code>Allow</code> statement that matches the request. In this case, if
     *         an identity-based policy also allows the action, the request is allowed. A value of <code>false</code>
     *         means that either the requested action is not allowed (implicitly denied) or that the action is
     *         explicitly denied by the permissions boundary. In both of these cases, the action is not allowed,
     *         regardless of the identity-based policy.
     */

    public Boolean getAllowedByPermissionsBoundary() {
        return this.allowedByPermissionsBoundary;
    }

    /**
     * <p>
     * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role).
     * A value of <code>true</code> means that the permissions boundary does not deny the action. This means that the
     * policy includes an <code>Allow</code> statement that matches the request. In this case, if an identity-based
     * policy also allows the action, the request is allowed. A value of <code>false</code> means that either the
     * requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions
     * boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
     * </p>
     * 
     * @param allowedByPermissionsBoundary
     *        Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or
     *        role). A value of <code>true</code> means that the permissions boundary does not deny the action. This
     *        means that the policy includes an <code>Allow</code> statement that matches the request. In this case, if
     *        an identity-based policy also allows the action, the request is allowed. A value of <code>false</code>
     *        means that either the requested action is not allowed (implicitly denied) or that the action is explicitly
     *        denied by the permissions boundary. In both of these cases, the action is not allowed, regardless of the
     *        identity-based policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PermissionsBoundaryDecisionDetail withAllowedByPermissionsBoundary(Boolean allowedByPermissionsBoundary) {
        setAllowedByPermissionsBoundary(allowedByPermissionsBoundary);
        return this;
    }

    /**
     * <p>
     * Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user or role).
     * A value of <code>true</code> means that the permissions boundary does not deny the action. This means that the
     * policy includes an <code>Allow</code> statement that matches the request. In this case, if an identity-based
     * policy also allows the action, the request is allowed. A value of <code>false</code> means that either the
     * requested action is not allowed (implicitly denied) or that the action is explicitly denied by the permissions
     * boundary. In both of these cases, the action is not allowed, regardless of the identity-based policy.
     * </p>
     * 
     * @return Specifies whether an action is allowed by a permissions boundary that is applied to an IAM entity (user
     *         or role). A value of <code>true</code> means that the permissions boundary does not deny the action. This
     *         means that the policy includes an <code>Allow</code> statement that matches the request. In this case, if
     *         an identity-based policy also allows the action, the request is allowed. A value of <code>false</code>
     *         means that either the requested action is not allowed (implicitly denied) or that the action is
     *         explicitly denied by the permissions boundary. In both of these cases, the action is not allowed,
     *         regardless of the identity-based policy.
     */

    public Boolean isAllowedByPermissionsBoundary() {
        return this.allowedByPermissionsBoundary;
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
        if (getAllowedByPermissionsBoundary() != null)
            sb.append("AllowedByPermissionsBoundary: ").append(getAllowedByPermissionsBoundary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PermissionsBoundaryDecisionDetail == false)
            return false;
        PermissionsBoundaryDecisionDetail other = (PermissionsBoundaryDecisionDetail) obj;
        if (other.getAllowedByPermissionsBoundary() == null ^ this.getAllowedByPermissionsBoundary() == null)
            return false;
        if (other.getAllowedByPermissionsBoundary() != null && other.getAllowedByPermissionsBoundary().equals(this.getAllowedByPermissionsBoundary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedByPermissionsBoundary() == null) ? 0 : getAllowedByPermissionsBoundary().hashCode());
        return hashCode;
    }

    @Override
    public PermissionsBoundaryDecisionDetail clone() {
        try {
            return (PermissionsBoundaryDecisionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
