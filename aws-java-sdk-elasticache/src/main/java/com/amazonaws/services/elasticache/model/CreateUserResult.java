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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The username of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     */
    private String accessString;
    /**
     * <p>
     * Returns a list of the user group IDs the user belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroupIds;
    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     */
    private Authentication authentication;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @return The ID of the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param userId
     *        The ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @param userName
     *        The username of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @return The username of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The username of the user.
     * </p>
     * 
     * @param userName
     *        The username of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @param status
     *        Indicates the user status. Can be "active", "modifying" or "deleting".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @return Indicates the user status. Can be "active", "modifying" or "deleting".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * </p>
     * 
     * @param status
     *        Indicates the user status. Can be "active", "modifying" or "deleting".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @param engine
     *        The current supported value is Redis.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @return The current supported value is Redis.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The current supported value is Redis.
     * </p>
     * 
     * @param engine
     *        The current supported value is Redis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     */

    public void setAccessString(String accessString) {
        this.accessString = accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @return Access permissions string used for this user.
     */

    public String getAccessString() {
        return this.accessString;
    }

    /**
     * <p>
     * Access permissions string used for this user.
     * </p>
     * 
     * @param accessString
     *        Access permissions string used for this user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withAccessString(String accessString) {
        setAccessString(accessString);
        return this;
    }

    /**
     * <p>
     * Returns a list of the user group IDs the user belongs to.
     * </p>
     * 
     * @return Returns a list of the user group IDs the user belongs to.
     */

    public java.util.List<String> getUserGroupIds() {
        if (userGroupIds == null) {
            userGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroupIds;
    }

    /**
     * <p>
     * Returns a list of the user group IDs the user belongs to.
     * </p>
     * 
     * @param userGroupIds
     *        Returns a list of the user group IDs the user belongs to.
     */

    public void setUserGroupIds(java.util.Collection<String> userGroupIds) {
        if (userGroupIds == null) {
            this.userGroupIds = null;
            return;
        }

        this.userGroupIds = new com.amazonaws.internal.SdkInternalList<String>(userGroupIds);
    }

    /**
     * <p>
     * Returns a list of the user group IDs the user belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroupIds(java.util.Collection)} or {@link #withUserGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroupIds
     *        Returns a list of the user group IDs the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withUserGroupIds(String... userGroupIds) {
        if (this.userGroupIds == null) {
            setUserGroupIds(new com.amazonaws.internal.SdkInternalList<String>(userGroupIds.length));
        }
        for (String ele : userGroupIds) {
            this.userGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of the user group IDs the user belongs to.
     * </p>
     * 
     * @param userGroupIds
     *        Returns a list of the user group IDs the user belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withUserGroupIds(java.util.Collection<String> userGroupIds) {
        setUserGroupIds(userGroupIds);
        return this;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @param authentication
     *        Denotes whether the user requires a password to authenticate.
     */

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @return Denotes whether the user requires a password to authenticate.
     */

    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * <p>
     * Denotes whether the user requires a password to authenticate.
     * </p>
     * 
     * @param authentication
     *        Denotes whether the user requires a password to authenticate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withAuthentication(Authentication authentication) {
        setAuthentication(authentication);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserResult withARN(String aRN) {
        setARN(aRN);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getAccessString() != null)
            sb.append("AccessString: ").append(getAccessString()).append(",");
        if (getUserGroupIds() != null)
            sb.append("UserGroupIds: ").append(getUserGroupIds()).append(",");
        if (getAuthentication() != null)
            sb.append("Authentication: ").append(getAuthentication()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserResult == false)
            return false;
        CreateUserResult other = (CreateUserResult) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getAccessString() == null ^ this.getAccessString() == null)
            return false;
        if (other.getAccessString() != null && other.getAccessString().equals(this.getAccessString()) == false)
            return false;
        if (other.getUserGroupIds() == null ^ this.getUserGroupIds() == null)
            return false;
        if (other.getUserGroupIds() != null && other.getUserGroupIds().equals(this.getUserGroupIds()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getAccessString() == null) ? 0 : getAccessString().hashCode());
        hashCode = prime * hashCode + ((getUserGroupIds() == null) ? 0 : getUserGroupIds().hashCode());
        hashCode = prime * hashCode + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserResult clone() {
        try {
            return (CreateUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
