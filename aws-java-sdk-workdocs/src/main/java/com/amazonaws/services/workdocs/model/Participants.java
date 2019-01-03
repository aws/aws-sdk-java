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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the users or user groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Participants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Participants implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of users.
     * </p>
     */
    private java.util.List<UserMetadata> users;
    /**
     * <p>
     * The list of user groups.
     * </p>
     */
    private java.util.List<GroupMetadata> groups;

    /**
     * <p>
     * The list of users.
     * </p>
     * 
     * @return The list of users.
     */

    public java.util.List<UserMetadata> getUsers() {
        return users;
    }

    /**
     * <p>
     * The list of users.
     * </p>
     * 
     * @param users
     *        The list of users.
     */

    public void setUsers(java.util.Collection<UserMetadata> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<UserMetadata>(users);
    }

    /**
     * <p>
     * The list of users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        The list of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participants withUsers(UserMetadata... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<UserMetadata>(users.length));
        }
        for (UserMetadata ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of users.
     * </p>
     * 
     * @param users
     *        The list of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participants withUsers(java.util.Collection<UserMetadata> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * The list of user groups.
     * </p>
     * 
     * @return The list of user groups.
     */

    public java.util.List<GroupMetadata> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The list of user groups.
     * </p>
     * 
     * @param groups
     *        The list of user groups.
     */

    public void setGroups(java.util.Collection<GroupMetadata> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<GroupMetadata>(groups);
    }

    /**
     * <p>
     * The list of user groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participants withGroups(GroupMetadata... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<GroupMetadata>(groups.length));
        }
        for (GroupMetadata ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user groups.
     * </p>
     * 
     * @param groups
     *        The list of user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Participants withGroups(java.util.Collection<GroupMetadata> groups) {
        setGroups(groups);
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
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Participants == false)
            return false;
        Participants other = (Participants) obj;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public Participants clone() {
        try {
            return (Participants) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ParticipantsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
