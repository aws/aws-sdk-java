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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application the user is attached to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The email id attached to the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The user aliases attached to the user id that are to be updated.
     * </p>
     */
    private java.util.List<UserAlias> userAliasesToUpdate;
    /**
     * <p>
     * The user aliases attached to the user id that are to be deleted.
     * </p>
     */
    private java.util.List<UserAlias> userAliasesToDelete;

    /**
     * <p>
     * The identifier of the application the user is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application the user is attached to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application the user is attached to.
     * </p>
     * 
     * @return The identifier of the application the user is attached to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application the user is attached to.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application the user is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The email id attached to the user.
     * </p>
     * 
     * @param userId
     *        The email id attached to the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The email id attached to the user.
     * </p>
     * 
     * @return The email id attached to the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The email id attached to the user.
     * </p>
     * 
     * @param userId
     *        The email id attached to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be updated.
     * </p>
     * 
     * @return The user aliases attached to the user id that are to be updated.
     */

    public java.util.List<UserAlias> getUserAliasesToUpdate() {
        return userAliasesToUpdate;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be updated.
     * </p>
     * 
     * @param userAliasesToUpdate
     *        The user aliases attached to the user id that are to be updated.
     */

    public void setUserAliasesToUpdate(java.util.Collection<UserAlias> userAliasesToUpdate) {
        if (userAliasesToUpdate == null) {
            this.userAliasesToUpdate = null;
            return;
        }

        this.userAliasesToUpdate = new java.util.ArrayList<UserAlias>(userAliasesToUpdate);
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliasesToUpdate(java.util.Collection)} or {@link #withUserAliasesToUpdate(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userAliasesToUpdate
     *        The user aliases attached to the user id that are to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserAliasesToUpdate(UserAlias... userAliasesToUpdate) {
        if (this.userAliasesToUpdate == null) {
            setUserAliasesToUpdate(new java.util.ArrayList<UserAlias>(userAliasesToUpdate.length));
        }
        for (UserAlias ele : userAliasesToUpdate) {
            this.userAliasesToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be updated.
     * </p>
     * 
     * @param userAliasesToUpdate
     *        The user aliases attached to the user id that are to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserAliasesToUpdate(java.util.Collection<UserAlias> userAliasesToUpdate) {
        setUserAliasesToUpdate(userAliasesToUpdate);
        return this;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be deleted.
     * </p>
     * 
     * @return The user aliases attached to the user id that are to be deleted.
     */

    public java.util.List<UserAlias> getUserAliasesToDelete() {
        return userAliasesToDelete;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be deleted.
     * </p>
     * 
     * @param userAliasesToDelete
     *        The user aliases attached to the user id that are to be deleted.
     */

    public void setUserAliasesToDelete(java.util.Collection<UserAlias> userAliasesToDelete) {
        if (userAliasesToDelete == null) {
            this.userAliasesToDelete = null;
            return;
        }

        this.userAliasesToDelete = new java.util.ArrayList<UserAlias>(userAliasesToDelete);
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliasesToDelete(java.util.Collection)} or {@link #withUserAliasesToDelete(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userAliasesToDelete
     *        The user aliases attached to the user id that are to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserAliasesToDelete(UserAlias... userAliasesToDelete) {
        if (this.userAliasesToDelete == null) {
            setUserAliasesToDelete(new java.util.ArrayList<UserAlias>(userAliasesToDelete.length));
        }
        for (UserAlias ele : userAliasesToDelete) {
            this.userAliasesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user aliases attached to the user id that are to be deleted.
     * </p>
     * 
     * @param userAliasesToDelete
     *        The user aliases attached to the user id that are to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserAliasesToDelete(java.util.Collection<UserAlias> userAliasesToDelete) {
        setUserAliasesToDelete(userAliasesToDelete);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserAliasesToUpdate() != null)
            sb.append("UserAliasesToUpdate: ").append(getUserAliasesToUpdate()).append(",");
        if (getUserAliasesToDelete() != null)
            sb.append("UserAliasesToDelete: ").append(getUserAliasesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserAliasesToUpdate() == null ^ this.getUserAliasesToUpdate() == null)
            return false;
        if (other.getUserAliasesToUpdate() != null && other.getUserAliasesToUpdate().equals(this.getUserAliasesToUpdate()) == false)
            return false;
        if (other.getUserAliasesToDelete() == null ^ this.getUserAliasesToDelete() == null)
            return false;
        if (other.getUserAliasesToDelete() != null && other.getUserAliasesToDelete().equals(this.getUserAliasesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserAliasesToUpdate() == null) ? 0 : getUserAliasesToUpdate().hashCode());
        hashCode = prime * hashCode + ((getUserAliasesToDelete() == null) ? 0 : getUserAliasesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
