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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about users and groups associated with a topic control rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UsersAndGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsersAndGroups implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user ids associated with a topic control rule.
     * </p>
     */
    private java.util.List<String> userIds;
    /**
     * <p>
     * The user groups associated with a topic control rule.
     * </p>
     */
    private java.util.List<String> userGroups;

    /**
     * <p>
     * The user ids associated with a topic control rule.
     * </p>
     * 
     * @return The user ids associated with a topic control rule.
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * The user ids associated with a topic control rule.
     * </p>
     * 
     * @param userIds
     *        The user ids associated with a topic control rule.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * The user ids associated with a topic control rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        The user ids associated with a topic control rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsersAndGroups withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user ids associated with a topic control rule.
     * </p>
     * 
     * @param userIds
     *        The user ids associated with a topic control rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsersAndGroups withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * The user groups associated with a topic control rule.
     * </p>
     * 
     * @return The user groups associated with a topic control rule.
     */

    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The user groups associated with a topic control rule.
     * </p>
     * 
     * @param userGroups
     *        The user groups associated with a topic control rule.
     */

    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new java.util.ArrayList<String>(userGroups);
    }

    /**
     * <p>
     * The user groups associated with a topic control rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        The user groups associated with a topic control rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsersAndGroups withUserGroups(String... userGroups) {
        if (this.userGroups == null) {
            setUserGroups(new java.util.ArrayList<String>(userGroups.length));
        }
        for (String ele : userGroups) {
            this.userGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user groups associated with a topic control rule.
     * </p>
     * 
     * @param userGroups
     *        The user groups associated with a topic control rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsersAndGroups withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
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
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsersAndGroups == false)
            return false;
        UsersAndGroups other = (UsersAndGroups) obj;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        return hashCode;
    }

    @Override
    public UsersAndGroups clone() {
        try {
            return (UsersAndGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.UsersAndGroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
