/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines which attributes in the IdP assertion are to be used to define information about the users
 * authenticated by the IdP to use the workspace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssertionAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssertionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the email names for SAML users.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for user groups.
     * </p>
     */
    private String groups;
    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the login names for SAML users.
     * </p>
     */
    private String login;
    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML users.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for the users'
     * organizations.
     * </p>
     */
    private String org;
    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user roles.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the email names for SAML users.
     * </p>
     * 
     * @param email
     *        The name of the attribute within the SAML assertion to use as the email names for SAML users.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the email names for SAML users.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the email names for SAML users.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the email names for SAML users.
     * </p>
     * 
     * @param email
     *        The name of the attribute within the SAML assertion to use as the email names for SAML users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for user groups.
     * </p>
     * 
     * @param groups
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for user
     *        groups.
     */

    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for user groups.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the user full "friendly" names for user
     *         groups.
     */

    public String getGroups() {
        return this.groups;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for user groups.
     * </p>
     * 
     * @param groups
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for user
     *        groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withGroups(String groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the login names for SAML users.
     * </p>
     * 
     * @param login
     *        The name of the attribute within the SAML assertion to use as the login names for SAML users.
     */

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the login names for SAML users.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the login names for SAML users.
     */

    public String getLogin() {
        return this.login;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the login names for SAML users.
     * </p>
     * 
     * @param login
     *        The name of the attribute within the SAML assertion to use as the login names for SAML users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withLogin(String login) {
        setLogin(login);
        return this;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML users.
     * </p>
     * 
     * @param name
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML
     *        users.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML users.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML
     *         users.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML users.
     * </p>
     * 
     * @param name
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML
     *        users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for the users'
     * organizations.
     * </p>
     * 
     * @param org
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for the
     *        users' organizations.
     */

    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for the users'
     * organizations.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the user full "friendly" names for the
     *         users' organizations.
     */

    public String getOrg() {
        return this.org;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user full "friendly" names for the users'
     * organizations.
     * </p>
     * 
     * @param org
     *        The name of the attribute within the SAML assertion to use as the user full "friendly" names for the
     *        users' organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withOrg(String org) {
        setOrg(org);
        return this;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user roles.
     * </p>
     * 
     * @param role
     *        The name of the attribute within the SAML assertion to use as the user roles.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user roles.
     * </p>
     * 
     * @return The name of the attribute within the SAML assertion to use as the user roles.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name of the attribute within the SAML assertion to use as the user roles.
     * </p>
     * 
     * @param role
     *        The name of the attribute within the SAML assertion to use as the user roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssertionAttributes withRole(String role) {
        setRole(role);
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
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getLogin() != null)
            sb.append("Login: ").append(getLogin()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOrg() != null)
            sb.append("Org: ").append(getOrg()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssertionAttributes == false)
            return false;
        AssertionAttributes other = (AssertionAttributes) obj;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getLogin() == null ^ this.getLogin() == null)
            return false;
        if (other.getLogin() != null && other.getLogin().equals(this.getLogin()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrg() == null ^ this.getOrg() == null)
            return false;
        if (other.getOrg() != null && other.getOrg().equals(this.getOrg()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getLogin() == null) ? 0 : getLogin().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrg() == null) ? 0 : getOrg().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public AssertionAttributes clone() {
        try {
            return (AssertionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.AssertionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
