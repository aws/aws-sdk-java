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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application for which the user mapping will be created.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The user emails attached to a user mapping.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The list of user aliases in the mapping.
     * </p>
     */
    private java.util.List<UserAlias> userAliases;
    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business user mapping.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the application for which the user mapping will be created.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for which the user mapping will be created.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application for which the user mapping will be created.
     * </p>
     * 
     * @return The identifier of the application for which the user mapping will be created.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application for which the user mapping will be created.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application for which the user mapping will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The user emails attached to a user mapping.
     * </p>
     * 
     * @param userId
     *        The user emails attached to a user mapping.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user emails attached to a user mapping.
     * </p>
     * 
     * @return The user emails attached to a user mapping.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user emails attached to a user mapping.
     * </p>
     * 
     * @param userId
     *        The user emails attached to a user mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The list of user aliases in the mapping.
     * </p>
     * 
     * @return The list of user aliases in the mapping.
     */

    public java.util.List<UserAlias> getUserAliases() {
        return userAliases;
    }

    /**
     * <p>
     * The list of user aliases in the mapping.
     * </p>
     * 
     * @param userAliases
     *        The list of user aliases in the mapping.
     */

    public void setUserAliases(java.util.Collection<UserAlias> userAliases) {
        if (userAliases == null) {
            this.userAliases = null;
            return;
        }

        this.userAliases = new java.util.ArrayList<UserAlias>(userAliases);
    }

    /**
     * <p>
     * The list of user aliases in the mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliases(java.util.Collection)} or {@link #withUserAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userAliases
     *        The list of user aliases in the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserAliases(UserAlias... userAliases) {
        if (this.userAliases == null) {
            setUserAliases(new java.util.ArrayList<UserAlias>(userAliases.length));
        }
        for (UserAlias ele : userAliases) {
            this.userAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of user aliases in the mapping.
     * </p>
     * 
     * @param userAliases
     *        The list of user aliases in the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUserAliases(java.util.Collection<UserAlias> userAliases) {
        setUserAliases(userAliases);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business user mapping.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business user mapping.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business user mapping.
     * </p>
     * 
     * @return A token that you provide to identify the request to create your Amazon Q Business user mapping.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create your Amazon Q Business user mapping.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create your Amazon Q Business user mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getUserAliases() != null)
            sb.append("UserAliases: ").append(getUserAliases()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserAliases() == null ^ this.getUserAliases() == null)
            return false;
        if (other.getUserAliases() != null && other.getUserAliases().equals(this.getUserAliases()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserAliases() == null) ? 0 : getUserAliases().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
