/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum
     * length of 20.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name for the new user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The password for the new user.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The role of the new user.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not selected,
     * the default role of <i>USER</i> is selected.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The first name of the new user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the new user.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * If this parameter is enabled, the user will be hidden from the address book.
     * </p>
     */
    private Boolean hiddenFromGlobalAddressList;

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization for which the user is created.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @return The identifier of the organization for which the user is created.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization for which the user is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum
     * length of 20.
     * </p>
     * 
     * @param name
     *        The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a
     *        maximum length of 20.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum
     * length of 20.
     * </p>
     * 
     * @return The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a
     *         maximum length of 20.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum
     * length of 20.
     * </p>
     * 
     * @param name
     *        The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a
     *        maximum length of 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @param displayName
     *        The display name for the new user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @return The display name for the new user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @param displayName
     *        The display name for the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @param password
     *        The password for the new user.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @return The password for the new user.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @param password
     *        The password for the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The role of the new user.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not selected,
     * the default role of <i>USER</i> is selected.
     * </p>
     * 
     * @param role
     *        The role of the new user.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not
     *        selected, the default role of <i>USER</i> is selected.
     * @see UserRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role of the new user.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not selected,
     * the default role of <i>USER</i> is selected.
     * </p>
     * 
     * @return The role of the new user.</p>
     *         <p>
     *         You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not
     *         selected, the default role of <i>USER</i> is selected.
     * @see UserRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role of the new user.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not selected,
     * the default role of <i>USER</i> is selected.
     * </p>
     * 
     * @param role
     *        The role of the new user.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not
     *        selected, the default role of <i>USER</i> is selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public CreateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The role of the new user.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not selected,
     * the default role of <i>USER</i> is selected.
     * </p>
     * 
     * @param role
     *        The role of the new user.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i> role in a single request. When a user role is not
     *        selected, the default role of <i>USER</i> is selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public CreateUserRequest withRole(UserRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * The first name of the new user.
     * </p>
     * 
     * @param firstName
     *        The first name of the new user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the new user.
     * </p>
     * 
     * @return The first name of the new user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the new user.
     * </p>
     * 
     * @param firstName
     *        The first name of the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the new user.
     * </p>
     * 
     * @param lastName
     *        The last name of the new user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the new user.
     * </p>
     * 
     * @return The last name of the new user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the new user.
     * </p>
     * 
     * @param lastName
     *        The last name of the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * If this parameter is enabled, the user will be hidden from the address book.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If this parameter is enabled, the user will be hidden from the address book.
     */

    public void setHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        this.hiddenFromGlobalAddressList = hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If this parameter is enabled, the user will be hidden from the address book.
     * </p>
     * 
     * @return If this parameter is enabled, the user will be hidden from the address book.
     */

    public Boolean getHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If this parameter is enabled, the user will be hidden from the address book.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If this parameter is enabled, the user will be hidden from the address book.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        setHiddenFromGlobalAddressList(hiddenFromGlobalAddressList);
        return this;
    }

    /**
     * <p>
     * If this parameter is enabled, the user will be hidden from the address book.
     * </p>
     * 
     * @return If this parameter is enabled, the user will be hidden from the address book.
     */

    public Boolean isHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getHiddenFromGlobalAddressList() != null)
            sb.append("HiddenFromGlobalAddressList: ").append(getHiddenFromGlobalAddressList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getHiddenFromGlobalAddressList() == null ^ this.getHiddenFromGlobalAddressList() == null)
            return false;
        if (other.getHiddenFromGlobalAddressList() != null && other.getHiddenFromGlobalAddressList().equals(this.getHiddenFromGlobalAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getHiddenFromGlobalAddressList() == null) ? 0 : getHiddenFromGlobalAddressList().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
