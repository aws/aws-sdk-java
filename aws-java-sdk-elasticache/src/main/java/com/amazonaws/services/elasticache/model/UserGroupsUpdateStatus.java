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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of the user group update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/UserGroupsUpdateStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserGroupsUpdateStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The list of user group IDs to add.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroupIdsToAdd;
    /**
     * <p>
     * The list of user group IDs to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroupIdsToRemove;

    /**
     * <p>
     * The list of user group IDs to add.
     * </p>
     * 
     * @return The list of user group IDs to add.
     */

    public java.util.List<String> getUserGroupIdsToAdd() {
        if (userGroupIdsToAdd == null) {
            userGroupIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroupIdsToAdd;
    }

    /**
     * <p>
     * The list of user group IDs to add.
     * </p>
     * 
     * @param userGroupIdsToAdd
     *        The list of user group IDs to add.
     */

    public void setUserGroupIdsToAdd(java.util.Collection<String> userGroupIdsToAdd) {
        if (userGroupIdsToAdd == null) {
            this.userGroupIdsToAdd = null;
            return;
        }

        this.userGroupIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>(userGroupIdsToAdd);
    }

    /**
     * <p>
     * The list of user group IDs to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroupIdsToAdd(java.util.Collection)} or {@link #withUserGroupIdsToAdd(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userGroupIdsToAdd
     *        The list of user group IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupsUpdateStatus withUserGroupIdsToAdd(String... userGroupIdsToAdd) {
        if (this.userGroupIdsToAdd == null) {
            setUserGroupIdsToAdd(new com.amazonaws.internal.SdkInternalList<String>(userGroupIdsToAdd.length));
        }
        for (String ele : userGroupIdsToAdd) {
            this.userGroupIdsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user group IDs to add.
     * </p>
     * 
     * @param userGroupIdsToAdd
     *        The list of user group IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupsUpdateStatus withUserGroupIdsToAdd(java.util.Collection<String> userGroupIdsToAdd) {
        setUserGroupIdsToAdd(userGroupIdsToAdd);
        return this;
    }

    /**
     * <p>
     * The list of user group IDs to remove.
     * </p>
     * 
     * @return The list of user group IDs to remove.
     */

    public java.util.List<String> getUserGroupIdsToRemove() {
        if (userGroupIdsToRemove == null) {
            userGroupIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroupIdsToRemove;
    }

    /**
     * <p>
     * The list of user group IDs to remove.
     * </p>
     * 
     * @param userGroupIdsToRemove
     *        The list of user group IDs to remove.
     */

    public void setUserGroupIdsToRemove(java.util.Collection<String> userGroupIdsToRemove) {
        if (userGroupIdsToRemove == null) {
            this.userGroupIdsToRemove = null;
            return;
        }

        this.userGroupIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>(userGroupIdsToRemove);
    }

    /**
     * <p>
     * The list of user group IDs to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroupIdsToRemove(java.util.Collection)} or {@link #withUserGroupIdsToRemove(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userGroupIdsToRemove
     *        The list of user group IDs to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupsUpdateStatus withUserGroupIdsToRemove(String... userGroupIdsToRemove) {
        if (this.userGroupIdsToRemove == null) {
            setUserGroupIdsToRemove(new com.amazonaws.internal.SdkInternalList<String>(userGroupIdsToRemove.length));
        }
        for (String ele : userGroupIdsToRemove) {
            this.userGroupIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user group IDs to remove.
     * </p>
     * 
     * @param userGroupIdsToRemove
     *        The list of user group IDs to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupsUpdateStatus withUserGroupIdsToRemove(java.util.Collection<String> userGroupIdsToRemove) {
        setUserGroupIdsToRemove(userGroupIdsToRemove);
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
        if (getUserGroupIdsToAdd() != null)
            sb.append("UserGroupIdsToAdd: ").append(getUserGroupIdsToAdd()).append(",");
        if (getUserGroupIdsToRemove() != null)
            sb.append("UserGroupIdsToRemove: ").append(getUserGroupIdsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserGroupsUpdateStatus == false)
            return false;
        UserGroupsUpdateStatus other = (UserGroupsUpdateStatus) obj;
        if (other.getUserGroupIdsToAdd() == null ^ this.getUserGroupIdsToAdd() == null)
            return false;
        if (other.getUserGroupIdsToAdd() != null && other.getUserGroupIdsToAdd().equals(this.getUserGroupIdsToAdd()) == false)
            return false;
        if (other.getUserGroupIdsToRemove() == null ^ this.getUserGroupIdsToRemove() == null)
            return false;
        if (other.getUserGroupIdsToRemove() != null && other.getUserGroupIdsToRemove().equals(this.getUserGroupIdsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserGroupIdsToAdd() == null) ? 0 : getUserGroupIdsToAdd().hashCode());
        hashCode = prime * hashCode + ((getUserGroupIdsToRemove() == null) ? 0 : getUserGroupIdsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UserGroupsUpdateStatus clone() {
        try {
            return (UserGroupsUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
