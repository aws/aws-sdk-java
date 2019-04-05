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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name for the user.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The email of the user.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The display name of the user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     */
    private String state;
    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     */
    private String userRole;
    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date enabledDate;
    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @param userId
     *        The identifier for the described user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @return The identifier for the described user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @param userId
     *        The identifier for the described user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @param name
     *        The name for the user.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @return The name for the user.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @param name
     *        The name for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @param email
     *        The email of the user.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @return The email of the user.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @param email
     *        The email of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @return The display name of the user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     *        to WorkMail).
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @return The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never
     *         registered to WorkMail).
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     *        to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeUserResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to
     * WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered
     *        to WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeUserResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different
     *        directory types, administrators can distinguish between an unregistered user (account is disabled and has
     *        a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * @see UserRole
     */

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * 
     * @return In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *         imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different
     *         directory types, administrators can distinguish between an unregistered user (account is disabled and has
     *         a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * @see UserRole
     */

    public String getUserRole() {
        return this.userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different
     *        directory types, administrators can distinguish between an unregistered user (account is disabled and has
     *        a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public DescribeUserResult withUserRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into Amazon WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into Amazon WorkMail as users. Because different WorkMail organizations rely on different
     *        directory types, administrators can distinguish between an unregistered user (account is disabled and has
     *        a user role) and the directory administrators. The values are USER, RESOURCE, and SYSTEM_USER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public DescribeUserResult withUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     */

    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     */

    public java.util.Date getEnabledDate() {
        return this.enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time at which the user was enabled for Amazon WorkMail usage, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEnabledDate(java.util.Date enabledDate) {
        setEnabledDate(enabledDate);
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     */

    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     */

    public java.util.Date getDisabledDate() {
        return this.disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time at which the user was disabled for Amazon WorkMail usage, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDisabledDate(java.util.Date disabledDate) {
        setDisabledDate(disabledDate);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUserRole() != null)
            sb.append("UserRole: ").append(getUserRole()).append(",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: ").append(getEnabledDate()).append(",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: ").append(getDisabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserResult clone() {
        try {
            return (DescribeUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
