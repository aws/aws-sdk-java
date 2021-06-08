/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The AWS Identity and Access Management (IAM) action definition details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * A list of roles to be attached. There must be at least one role.
     * </p>
     */
    private java.util.List<String> roles;
    /**
     * <p>
     * A list of groups to be attached. There must be at least one group.
     * </p>
     */
    private java.util.List<String> groups;
    /**
     * <p>
     * A list of users to be attached. There must be at least one user.
     * </p>
     */
    private java.util.List<String> users;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the policy to be attached.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy to be attached.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the policy to be attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * A list of roles to be attached. There must be at least one role.
     * </p>
     * 
     * @return A list of roles to be attached. There must be at least one role.
     */

    public java.util.List<String> getRoles() {
        return roles;
    }

    /**
     * <p>
     * A list of roles to be attached. There must be at least one role.
     * </p>
     * 
     * @param roles
     *        A list of roles to be attached. There must be at least one role.
     */

    public void setRoles(java.util.Collection<String> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<String>(roles);
    }

    /**
     * <p>
     * A list of roles to be attached. There must be at least one role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        A list of roles to be attached. There must be at least one role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withRoles(String... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<String>(roles.length));
        }
        for (String ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of roles to be attached. There must be at least one role.
     * </p>
     * 
     * @param roles
     *        A list of roles to be attached. There must be at least one role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withRoles(java.util.Collection<String> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * A list of groups to be attached. There must be at least one group.
     * </p>
     * 
     * @return A list of groups to be attached. There must be at least one group.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * A list of groups to be attached. There must be at least one group.
     * </p>
     * 
     * @param groups
     *        A list of groups to be attached. There must be at least one group.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * A list of groups to be attached. There must be at least one group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        A list of groups to be attached. There must be at least one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of groups to be attached. There must be at least one group.
     * </p>
     * 
     * @param groups
     *        A list of groups to be attached. There must be at least one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * A list of users to be attached. There must be at least one user.
     * </p>
     * 
     * @return A list of users to be attached. There must be at least one user.
     */

    public java.util.List<String> getUsers() {
        return users;
    }

    /**
     * <p>
     * A list of users to be attached. There must be at least one user.
     * </p>
     * 
     * @param users
     *        A list of users to be attached. There must be at least one user.
     */

    public void setUsers(java.util.Collection<String> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<String>(users);
    }

    /**
     * <p>
     * A list of users to be attached. There must be at least one user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        A list of users to be attached. There must be at least one user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withUsers(String... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<String>(users.length));
        }
        for (String ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users to be attached. There must be at least one user.
     * </p>
     * 
     * @param users
     *        A list of users to be attached. There must be at least one user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamActionDefinition withUsers(java.util.Collection<String> users) {
        setUsers(users);
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IamActionDefinition == false)
            return false;
        IamActionDefinition other = (IamActionDefinition) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public IamActionDefinition clone() {
        try {
            return (IamActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.IamActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
