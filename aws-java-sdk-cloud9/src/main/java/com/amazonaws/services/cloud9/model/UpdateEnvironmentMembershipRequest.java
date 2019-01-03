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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the environment for the environment member whose settings you want to change.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The replacement type of environment member permissions you want to associate with this environment member.
     * Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     */
    private String permissions;

    /**
     * <p>
     * The ID of the environment for the environment member whose settings you want to change.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment for the environment member whose settings you want to change.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment for the environment member whose settings you want to change.
     * </p>
     * 
     * @return The ID of the environment for the environment member whose settings you want to change.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment for the environment member whose settings you want to change.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment for the environment member whose settings you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentMembershipRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member whose settings you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentMembershipRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The replacement type of environment member permissions you want to associate with this environment member.
     * Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissions
     *        The replacement type of environment member permissions you want to associate with this environment member.
     *        Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     * @see MemberPermissions
     */

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * The replacement type of environment member permissions you want to associate with this environment member.
     * Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The replacement type of environment member permissions you want to associate with this environment
     *         member. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>read-only</code>: Has read-only access to the environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>read-write</code>: Has read-write access to the environment.
     *         </p>
     *         </li>
     * @see MemberPermissions
     */

    public String getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * The replacement type of environment member permissions you want to associate with this environment member.
     * Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissions
     *        The replacement type of environment member permissions you want to associate with this environment member.
     *        Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberPermissions
     */

    public UpdateEnvironmentMembershipRequest withPermissions(String permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The replacement type of environment member permissions you want to associate with this environment member.
     * Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>read-only</code>: Has read-only access to the environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>read-write</code>: Has read-write access to the environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissions
     *        The replacement type of environment member permissions you want to associate with this environment member.
     *        Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>read-only</code>: Has read-only access to the environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>read-write</code>: Has read-write access to the environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberPermissions
     */

    public UpdateEnvironmentMembershipRequest withPermissions(MemberPermissions permissions) {
        this.permissions = permissions.toString();
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentMembershipRequest == false)
            return false;
        UpdateEnvironmentMembershipRequest other = (UpdateEnvironmentMembershipRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentMembershipRequest clone() {
        return (UpdateEnvironmentMembershipRequest) super.clone();
    }

}
