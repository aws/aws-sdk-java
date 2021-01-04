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
 * Returns the updates being applied to the user group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/UserGroupPendingChanges"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserGroupPendingChanges implements Serializable, Cloneable {

    /**
     * <p>
     * The list of user IDs to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIdsToRemove;
    /**
     * <p>
     * The list of user IDs to add.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIdsToAdd;

    /**
     * <p>
     * The list of user IDs to remove.
     * </p>
     * 
     * @return The list of user IDs to remove.
     */

    public java.util.List<String> getUserIdsToRemove() {
        if (userIdsToRemove == null) {
            userIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIdsToRemove;
    }

    /**
     * <p>
     * The list of user IDs to remove.
     * </p>
     * 
     * @param userIdsToRemove
     *        The list of user IDs to remove.
     */

    public void setUserIdsToRemove(java.util.Collection<String> userIdsToRemove) {
        if (userIdsToRemove == null) {
            this.userIdsToRemove = null;
            return;
        }

        this.userIdsToRemove = new com.amazonaws.internal.SdkInternalList<String>(userIdsToRemove);
    }

    /**
     * <p>
     * The list of user IDs to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIdsToRemove(java.util.Collection)} or {@link #withUserIdsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userIdsToRemove
     *        The list of user IDs to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupPendingChanges withUserIdsToRemove(String... userIdsToRemove) {
        if (this.userIdsToRemove == null) {
            setUserIdsToRemove(new com.amazonaws.internal.SdkInternalList<String>(userIdsToRemove.length));
        }
        for (String ele : userIdsToRemove) {
            this.userIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user IDs to remove.
     * </p>
     * 
     * @param userIdsToRemove
     *        The list of user IDs to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupPendingChanges withUserIdsToRemove(java.util.Collection<String> userIdsToRemove) {
        setUserIdsToRemove(userIdsToRemove);
        return this;
    }

    /**
     * <p>
     * The list of user IDs to add.
     * </p>
     * 
     * @return The list of user IDs to add.
     */

    public java.util.List<String> getUserIdsToAdd() {
        if (userIdsToAdd == null) {
            userIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIdsToAdd;
    }

    /**
     * <p>
     * The list of user IDs to add.
     * </p>
     * 
     * @param userIdsToAdd
     *        The list of user IDs to add.
     */

    public void setUserIdsToAdd(java.util.Collection<String> userIdsToAdd) {
        if (userIdsToAdd == null) {
            this.userIdsToAdd = null;
            return;
        }

        this.userIdsToAdd = new com.amazonaws.internal.SdkInternalList<String>(userIdsToAdd);
    }

    /**
     * <p>
     * The list of user IDs to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIdsToAdd(java.util.Collection)} or {@link #withUserIdsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userIdsToAdd
     *        The list of user IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupPendingChanges withUserIdsToAdd(String... userIdsToAdd) {
        if (this.userIdsToAdd == null) {
            setUserIdsToAdd(new com.amazonaws.internal.SdkInternalList<String>(userIdsToAdd.length));
        }
        for (String ele : userIdsToAdd) {
            this.userIdsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user IDs to add.
     * </p>
     * 
     * @param userIdsToAdd
     *        The list of user IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserGroupPendingChanges withUserIdsToAdd(java.util.Collection<String> userIdsToAdd) {
        setUserIdsToAdd(userIdsToAdd);
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
        if (getUserIdsToRemove() != null)
            sb.append("UserIdsToRemove: ").append(getUserIdsToRemove()).append(",");
        if (getUserIdsToAdd() != null)
            sb.append("UserIdsToAdd: ").append(getUserIdsToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserGroupPendingChanges == false)
            return false;
        UserGroupPendingChanges other = (UserGroupPendingChanges) obj;
        if (other.getUserIdsToRemove() == null ^ this.getUserIdsToRemove() == null)
            return false;
        if (other.getUserIdsToRemove() != null && other.getUserIdsToRemove().equals(this.getUserIdsToRemove()) == false)
            return false;
        if (other.getUserIdsToAdd() == null ^ this.getUserIdsToAdd() == null)
            return false;
        if (other.getUserIdsToAdd() != null && other.getUserIdsToAdd().equals(this.getUserIdsToAdd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserIdsToRemove() == null) ? 0 : getUserIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getUserIdsToAdd() == null) ? 0 : getUserIdsToAdd().hashCode());
        return hashCode;
    }

    @Override
    public UserGroupPendingChanges clone() {
        try {
            return (UserGroupPendingChanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
