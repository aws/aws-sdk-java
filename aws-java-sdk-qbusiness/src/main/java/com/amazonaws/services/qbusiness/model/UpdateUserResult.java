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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user aliases that have been to be added to a user id.
     * </p>
     */
    private java.util.List<UserAlias> userAliasesAdded;
    /**
     * <p>
     * The user aliases attached to a user id that have been updated.
     * </p>
     */
    private java.util.List<UserAlias> userAliasesUpdated;
    /**
     * <p>
     * The user aliases that have been deleted from a user id.
     * </p>
     */
    private java.util.List<UserAlias> userAliasesDeleted;

    /**
     * <p>
     * The user aliases that have been to be added to a user id.
     * </p>
     * 
     * @return The user aliases that have been to be added to a user id.
     */

    public java.util.List<UserAlias> getUserAliasesAdded() {
        return userAliasesAdded;
    }

    /**
     * <p>
     * The user aliases that have been to be added to a user id.
     * </p>
     * 
     * @param userAliasesAdded
     *        The user aliases that have been to be added to a user id.
     */

    public void setUserAliasesAdded(java.util.Collection<UserAlias> userAliasesAdded) {
        if (userAliasesAdded == null) {
            this.userAliasesAdded = null;
            return;
        }

        this.userAliasesAdded = new java.util.ArrayList<UserAlias>(userAliasesAdded);
    }

    /**
     * <p>
     * The user aliases that have been to be added to a user id.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliasesAdded(java.util.Collection)} or {@link #withUserAliasesAdded(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userAliasesAdded
     *        The user aliases that have been to be added to a user id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesAdded(UserAlias... userAliasesAdded) {
        if (this.userAliasesAdded == null) {
            setUserAliasesAdded(new java.util.ArrayList<UserAlias>(userAliasesAdded.length));
        }
        for (UserAlias ele : userAliasesAdded) {
            this.userAliasesAdded.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user aliases that have been to be added to a user id.
     * </p>
     * 
     * @param userAliasesAdded
     *        The user aliases that have been to be added to a user id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesAdded(java.util.Collection<UserAlias> userAliasesAdded) {
        setUserAliasesAdded(userAliasesAdded);
        return this;
    }

    /**
     * <p>
     * The user aliases attached to a user id that have been updated.
     * </p>
     * 
     * @return The user aliases attached to a user id that have been updated.
     */

    public java.util.List<UserAlias> getUserAliasesUpdated() {
        return userAliasesUpdated;
    }

    /**
     * <p>
     * The user aliases attached to a user id that have been updated.
     * </p>
     * 
     * @param userAliasesUpdated
     *        The user aliases attached to a user id that have been updated.
     */

    public void setUserAliasesUpdated(java.util.Collection<UserAlias> userAliasesUpdated) {
        if (userAliasesUpdated == null) {
            this.userAliasesUpdated = null;
            return;
        }

        this.userAliasesUpdated = new java.util.ArrayList<UserAlias>(userAliasesUpdated);
    }

    /**
     * <p>
     * The user aliases attached to a user id that have been updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliasesUpdated(java.util.Collection)} or {@link #withUserAliasesUpdated(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userAliasesUpdated
     *        The user aliases attached to a user id that have been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesUpdated(UserAlias... userAliasesUpdated) {
        if (this.userAliasesUpdated == null) {
            setUserAliasesUpdated(new java.util.ArrayList<UserAlias>(userAliasesUpdated.length));
        }
        for (UserAlias ele : userAliasesUpdated) {
            this.userAliasesUpdated.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user aliases attached to a user id that have been updated.
     * </p>
     * 
     * @param userAliasesUpdated
     *        The user aliases attached to a user id that have been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesUpdated(java.util.Collection<UserAlias> userAliasesUpdated) {
        setUserAliasesUpdated(userAliasesUpdated);
        return this;
    }

    /**
     * <p>
     * The user aliases that have been deleted from a user id.
     * </p>
     * 
     * @return The user aliases that have been deleted from a user id.
     */

    public java.util.List<UserAlias> getUserAliasesDeleted() {
        return userAliasesDeleted;
    }

    /**
     * <p>
     * The user aliases that have been deleted from a user id.
     * </p>
     * 
     * @param userAliasesDeleted
     *        The user aliases that have been deleted from a user id.
     */

    public void setUserAliasesDeleted(java.util.Collection<UserAlias> userAliasesDeleted) {
        if (userAliasesDeleted == null) {
            this.userAliasesDeleted = null;
            return;
        }

        this.userAliasesDeleted = new java.util.ArrayList<UserAlias>(userAliasesDeleted);
    }

    /**
     * <p>
     * The user aliases that have been deleted from a user id.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliasesDeleted(java.util.Collection)} or {@link #withUserAliasesDeleted(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userAliasesDeleted
     *        The user aliases that have been deleted from a user id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesDeleted(UserAlias... userAliasesDeleted) {
        if (this.userAliasesDeleted == null) {
            setUserAliasesDeleted(new java.util.ArrayList<UserAlias>(userAliasesDeleted.length));
        }
        for (UserAlias ele : userAliasesDeleted) {
            this.userAliasesDeleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user aliases that have been deleted from a user id.
     * </p>
     * 
     * @param userAliasesDeleted
     *        The user aliases that have been deleted from a user id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserResult withUserAliasesDeleted(java.util.Collection<UserAlias> userAliasesDeleted) {
        setUserAliasesDeleted(userAliasesDeleted);
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
        if (getUserAliasesAdded() != null)
            sb.append("UserAliasesAdded: ").append(getUserAliasesAdded()).append(",");
        if (getUserAliasesUpdated() != null)
            sb.append("UserAliasesUpdated: ").append(getUserAliasesUpdated()).append(",");
        if (getUserAliasesDeleted() != null)
            sb.append("UserAliasesDeleted: ").append(getUserAliasesDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserResult == false)
            return false;
        UpdateUserResult other = (UpdateUserResult) obj;
        if (other.getUserAliasesAdded() == null ^ this.getUserAliasesAdded() == null)
            return false;
        if (other.getUserAliasesAdded() != null && other.getUserAliasesAdded().equals(this.getUserAliasesAdded()) == false)
            return false;
        if (other.getUserAliasesUpdated() == null ^ this.getUserAliasesUpdated() == null)
            return false;
        if (other.getUserAliasesUpdated() != null && other.getUserAliasesUpdated().equals(this.getUserAliasesUpdated()) == false)
            return false;
        if (other.getUserAliasesDeleted() == null ^ this.getUserAliasesDeleted() == null)
            return false;
        if (other.getUserAliasesDeleted() != null && other.getUserAliasesDeleted().equals(this.getUserAliasesDeleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAliasesAdded() == null) ? 0 : getUserAliasesAdded().hashCode());
        hashCode = prime * hashCode + ((getUserAliasesUpdated() == null) ? 0 : getUserAliasesUpdated().hashCode());
        hashCode = prime * hashCode + ((getUserAliasesDeleted() == null) ? 0 : getUserAliasesDeleted().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserResult clone() {
        try {
            return (UpdateUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
