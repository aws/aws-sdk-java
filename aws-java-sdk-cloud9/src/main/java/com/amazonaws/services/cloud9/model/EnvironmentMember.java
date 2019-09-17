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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an environment member for an AWS Cloud9 development environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/EnvironmentMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of environment member permissions associated with this environment member. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
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
     * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The ID of the environment for the environment member.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The time, expressed in epoch time format, when the environment member last opened the environment.
     * </p>
     */
    private java.util.Date lastAccess;

    /**
     * <p>
     * The type of environment member permissions associated with this environment member. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
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
     *        The type of environment member permissions associated with this environment member. Available values
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
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
     * @see Permissions
     */

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * <p>
     * The type of environment member permissions associated with this environment member. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
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
     * @return The type of environment member permissions associated with this environment member. Available values
     *         include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>owner</code>: Owns the environment.
     *         </p>
     *         </li>
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
     * @see Permissions
     */

    public String getPermissions() {
        return this.permissions;
    }

    /**
     * <p>
     * The type of environment member permissions associated with this environment member. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
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
     *        The type of environment member permissions associated with this environment member. Available values
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
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
     * @see Permissions
     */

    public EnvironmentMember withPermissions(String permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The type of environment member permissions associated with this environment member. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>owner</code>: Owns the environment.
     * </p>
     * </li>
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
     *        The type of environment member permissions associated with this environment member. Available values
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>owner</code>: Owns the environment.
     *        </p>
     *        </li>
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
     * @see Permissions
     */

    public EnvironmentMember withPermissions(Permissions permissions) {
        this.permissions = permissions.toString();
        return this;
    }

    /**
     * <p>
     * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * </p>
     * 
     * @param userId
     *        The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * </p>
     * 
     * @return The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * </p>
     * 
     * @param userId
     *        The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentMember withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment member.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment member.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the environment member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentMember withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The ID of the environment for the environment member.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment for the environment member.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment for the environment member.
     * </p>
     * 
     * @return The ID of the environment for the environment member.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment for the environment member.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment for the environment member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentMember withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The time, expressed in epoch time format, when the environment member last opened the environment.
     * </p>
     * 
     * @param lastAccess
     *        The time, expressed in epoch time format, when the environment member last opened the environment.
     */

    public void setLastAccess(java.util.Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * <p>
     * The time, expressed in epoch time format, when the environment member last opened the environment.
     * </p>
     * 
     * @return The time, expressed in epoch time format, when the environment member last opened the environment.
     */

    public java.util.Date getLastAccess() {
        return this.lastAccess;
    }

    /**
     * <p>
     * The time, expressed in epoch time format, when the environment member last opened the environment.
     * </p>
     * 
     * @param lastAccess
     *        The time, expressed in epoch time format, when the environment member last opened the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentMember withLastAccess(java.util.Date lastAccess) {
        setLastAccess(lastAccess);
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
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastAccess() != null)
            sb.append("LastAccess: ").append(getLastAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentMember == false)
            return false;
        EnvironmentMember other = (EnvironmentMember) obj;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastAccess() == null ^ this.getLastAccess() == null)
            return false;
        if (other.getLastAccess() != null && other.getLastAccess().equals(this.getLastAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastAccess() == null) ? 0 : getLastAccess().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentMember clone() {
        try {
            return (EnvironmentMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloud9.model.transform.EnvironmentMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
